package models;


/**
 * Almacena las listas de productos, usuarios y facturas  en una base de datos de
 * SQL Server. Contiene los siguientes metodos para el guardado de estos datos:
 * 
 * <ul>
 * 	<li><b>verifyUser: </b>verifica que el usuario existe en la base de datos y si
 * es verdadero da acceso al programa.</li>
 * 	<li><b>getBill: </b>carga el arreglo de lista de facturas al programa.</li>
 * 	<li><b>getProduct: </b>carga el arreglo de lista de productos al programa.
 * </li>
 * 	<li><b>saveBill: </b>guarda los cambios del arreglo de lista de facturas en la
 * base de datos.</li>
 * 	<li><b>saveProduct: </b>guarda los cambios del arreglo de la lista de
 * productos en la base de datos.</li>
 * 	<li><b>saveUser: </b>guarda los cambios del arreglo de la lista de usuarios en
 * la base de datos.</li>
 * </ul>
 * @author Lenovo
 * @version 1.0
 * @created 09-nov-2022 4:45:36 PM
 */
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