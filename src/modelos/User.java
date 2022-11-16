package modelos;
/**
 * @author hebod
 * @version 1.0
 * @created 14-nov-2022 9:08:52 PM
 */
public class User {

	private String userName;
	private String userEmail;
	private String userPassword;

	public User(){

	}

    public User(String userName, String userEmail, String userPassword) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

	
	/**
	 * 
	 * @param user
	 */
	public boolean addUser(User user){
		return false;
	}

	/**
	 * 
	 * @param userName
	 */
	public boolean editUser(String userName){
		return false;
	}

	/**
	 * 
	 * @param userName
	 */
	public void removeUser(String userName){

	}

	/**
	 * 
	 * @param userName
	 */
	public User searchUser(String userName){
		return null;
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
}//end User