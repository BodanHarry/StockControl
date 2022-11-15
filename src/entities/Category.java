package modelos;


/**
 * @author hebod
 * @version 1.0
 * @created 14-nov-2022 9:08:51 PM
 */
public class Category {

	private int idCategory;
	private String productDescription;
	private String productType;
	private String productSize;

	public Category(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param category
	 */
	public boolean addCategory(Category category){
		return false;
	}

	/**
	 * 
	 * @param idCategory
	 */
	public Category searchCategory(int idCategory){
		return null;
	}

	/**
	 * 
	 * @param idCategory
	 */
	public boolean editCategory(int idCategory){
		return false;
	}
}//end Category