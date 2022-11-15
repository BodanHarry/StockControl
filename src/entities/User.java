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

	public void finalize() throws Throwable {

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
}//end User