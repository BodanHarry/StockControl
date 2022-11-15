package modelos;


/**
 * @author hebod
 * @version 1.0
 * @created 14-nov-2022 9:08:51 PM
 */
public class Product {

	private String productName;
	private String productColor;
	private int idProduct;
	private double productPrice;
	public Category m_Category;

	public Product(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param product
	 */
	public boolean addProduct(Product product){
		return false;
	}

	/**
	 * 
	 * @param userName
	 */
	public Product searchProduct(String userName){
		return null;
	}

	/**
	 * 
	 * @param idProduct
	 */
	public boolean editProduct(int idProduct){
		return false;
	}

	/**
	 * 
	 * @param idProduct
	 */
	public boolean removeProduct(int idProduct){
		return false;
	}
}//end Product