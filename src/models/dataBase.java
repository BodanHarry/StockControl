package models;

public class dataBase {

	public UserList m_UserList;
	public ProductList m_ProductList;
	public BillList m_BillList;

	public dataBase(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param bill
	 */
	public BillList getBill(Bill bill){
		return null;
	}

	/**
	 * 
	 * @param product
	 */
	public ProductList getProduct(Product product){
		return null;
	}

	/**
	 * 
	 * @param bill
	 */
	public int saveBill(Bill bill){
		return 0;
	}

	/**
	 * 
	 * @param product
	 */
	public int saveProduct(Product product){
		return 0;
	}

	/**
	 * 
	 * @param user
	 */
	public int saveUser(User user){
		return 0;
	}

	/**
	 * 
	 * @param user
	 */
	public boolean verifyUser(User user){
		return false;
	}
}//end dataBase