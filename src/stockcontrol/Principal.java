/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stockcontrol;

import formularies.FrmMain;
import java.time.LocalDate;

/**
 *
 * @author hebod
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        FrmMain main = new FrmMain();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
    }
    
}
