package models;

import java.util.ArrayList;
import java.util.List;

public class UserList {

	List<User> userList = new ArrayList<>();
        private User userSelected;
        
	public UserList(){

	}

	public void addUser(User user){
		userList.add(user);
	}

	
	public void editUser(User user, String userName, String password){
                user.setUserName(userName);
		user.setPassword(password);
                user.setStatus(2);
	}

	
	public void removeUser(User user){
		user.setStatus(3);
	}

	public User searchUser(String name){
		for(User userName : userList){
                if(userName.getUserName() == name){
                    userSelected = userName;
                }
            }
            return userSelected;
	}
        
        
}//end UserList