package entity;

import java.util.Date;


/**
 * @author hebod
 * @version 1.0
 * @created 14-nov-2022 7:47:02 PM
 */
public class Input {

	private int idInput;
	private Date inputDate;
	private double inputPrice;
	private int inputQuantity;
	public Product m_Product;
	public User m_User;

	public Input(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param input
	 */
	public boolean addInput(Input input){
		return false;
	}

	/**
	 * 
	 * @param idInput
	 */
	public boolean editInput(int idInput){
		return false;
	}

	/**
	 * 
	 * @param idInput
	 */
	public Input searchInput(int idInput){
		return null;
	}
}//end Input