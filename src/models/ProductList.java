package models;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
        private List<Product> productList = new ArrayList<>();
        private Product productSelected;

	public ProductList(){

	}
        
        
	public void addProduct(Product product){
		productList.add(product);
	}

	
	public int checkStock(int idProduct){
            int stock = 0;
		for(Product product : productList){
                    if(product.getIdProduct() == idProduct){
                        stock = product.getStock();
                    }
                }
            return stock;
	}

	public void editProduct(int idProduct, Product newProduct){
		for(Product product : productList){
                    if(product.getIdProduct() == idProduct){
                        product.setColor(newProduct.getColor());
                        product.setPrice((float) newProduct.getPrice());
                        product.setSize(newProduct.getSize());
                        product.setStatus(2);
                        product.setStock(newProduct.getStock());
                        product.setType(newProduct.getType());
                    }
                }
	}

	public void removeProduct(int idProduct){
            for(Product product : productList){
                if(product.getIdProduct() == idProduct){
                    product.setStatus(3);
                }
            }
	}

        /*
            Search a product using his id
        */
	public Product searchProduct(int idProduct){
            for(Product product : productList){
                if(product.getIdProduct() == idProduct){
                    productSelected = product;
                }
            }
            return productSelected; 
	}

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProductSelected() {
        return productSelected;
    }

    public void setProductSelected(Product productSelected) {
        this.productSelected = productSelected;
    }
}