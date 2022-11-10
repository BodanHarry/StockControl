package models;

import java.util.Date;

public class Bill {

	private String clientName;
	private Date date;
	private int idBill;
	private Product product;
	private int quantity;
	private int status = 1;

	public Bill(){

	}

    public Bill(String clientName, Date date, int idBill, Product product, int quantity) {
        this.clientName = clientName;
        this.date = date;
        this.idBill = idBill;
        this.product = product;
        this.quantity = quantity;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bill{" + "clientName=" + clientName + ", date=" + date + ", idBill=" + idBill + ", product=" + product + ", quantity=" + quantity + ", status=" + status + '}';
    }

}//end Bill