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
	private Category m_Category;

	public Product(){

	}

    public Product(String productName, String productColor, int idProduct, double productPrice, Category m_Category) {
        this.productName = productName;
        this.productColor = productColor;
        this.idProduct = idProduct;
        this.productPrice = productPrice;
        this.m_Category = m_Category;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Category getM_Category() {
        return m_Category;
    }

    public void setM_Category(Category m_Category) {
        this.m_Category = m_Category;
    }
}//end Product