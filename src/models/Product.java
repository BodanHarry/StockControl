package models;

public class Product {

	private String color;
	private int idProduct;
	private double price;
	private double size;
	private int status = 4;
	private int stock;
	private String type;

	public Product(){

	}

    public Product(String color, int idProduct, double price, double size, int stock, String type) {
        this.color = color;
        this.idProduct = idProduct;
        this.price = price;
        this.size = size;
        this.stock = stock;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" + "color=" + color + ", idProduct=" + idProduct + ", price=" + price + ", size=" + size + ", status=" + status + ", stock=" + stock + ", type=" + type + '}';
    }

    
}//end Product