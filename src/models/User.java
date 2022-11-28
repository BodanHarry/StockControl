package models;
/**
 * @author hebod
 * @version 1.0
 * @created 14-nov-2022 9:08:52 PM
 */
public class User {
        
        private int idUser;
	private String userName;
	private String userEmail;
	private String userPassword;

	public User(){

	}

    public User(int idUser, String userName, String userEmail, String userPassword) {
        this.idUser = idUser;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }
    
    public int getIdUser(){
        return idUser;
    }
    
    public void serIdUser(int idUser){
        this.idUser = idUser;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", idUser=" + idUser + '}';
    }
    
}//end User