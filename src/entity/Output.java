package entity;

import java.util.Date;


/**
 * @author hebod
 * @version 1.0
 * @created 14-nov-2022 7:47:02 PM
 */
public class Output {

	private int idOutput;
	private Date outputDate;
	private double outputPrice;
	private int outputQuantity;
	public Product m_Product;
	public User m_User;

	public Output(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param output
	 */
	public boolean addOutput(Output output){
		return false;
	}

	/**
	 * 
	 * @param idOutput
	 */
	public boolean editOutput(int idOutput){
		return false;
	}

	/**
	 * 
	 * @param idOutput
	 */
	public Output searchOutput(int idOutput){
		return null;
	}
}//end Output