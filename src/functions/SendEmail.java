/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

import formularies.FrmConfirmSendEmail;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author hebod
 */
public class SendEmail {
   private static String emailFrom = "hamacasNica4@gmail.com" ;
   private static String passwordFrom = "szpftslbvoqbjmaq";
   private String emailTo;
   private String subject;
   private String content;
   private String temporaryPassword;
   private Properties properties = new Properties();
   
   private Session session;
   
   private MimeMessage mail;
   
   private String createTemporaryPassword(){
        Random random = new Random();
        
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String upperAlphabet = lowerAlphabet.toUpperCase();
        String symbols = "!@#$%^&*()_+=[]{}";
        String numbers = "0123456789";
        
        String characters = lowerAlphabet + upperAlphabet + symbols + numbers;
        String temporary = "";
        
        for(int i = 0; i < 10; i++){
            int position = random.nextInt(characters.length());
            char character = characters.charAt(position);
            temporary+=character;
        }
        
        return temporary;
    }
   
   public String createEmail(String email){
       
       emailTo = email;
       subject = "Verificación de Hamacas Nica";
       temporaryPassword = this.createTemporaryPassword();
       content = "Su código de autenticación es: " + temporaryPassword;
       
       properties.put("mail.smtp.host", "smtp.gmail.com");
       properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
       properties.setProperty("mail.smtp.starttls.enable", "true");
       properties.setProperty("mail.smtp.port", "587");
       properties.setProperty("mail.smtp.user", emailFrom);
       properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
       properties.setProperty("mail.smtp.auth", "true");
       
       session = Session.getDefaultInstance(properties);
       
       try {
           mail = new MimeMessage(session);
           mail.setFrom(new InternetAddress(emailFrom));
           mail.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
           mail.setSubject(subject);
           mail.setText(content, "ISO-8859-1", "html");

       } catch (AddressException ex) {
           Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, null, ex);
       } catch (MessagingException ex) {
           Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return temporaryPassword;
   }
   
   public void SendEmail(){
       try {
           Transport transport = session.getTransport("smtp");
           transport.connect(emailFrom, passwordFrom);
           transport.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
           transport.close();
           
           FrmConfirmSendEmail newWindows =  new FrmConfirmSendEmail();
           newWindows.setVisible(true);
           newWindows.setLocationRelativeTo(null);
           
       } catch (NoSuchProviderException ex) {
           Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, null, ex);
       } catch (MessagingException ex) {
           Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}