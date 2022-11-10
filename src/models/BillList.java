package models;

import java.util.ArrayList;
import java.util.List;


public class BillList {

	List<Bill> billList = new ArrayList<>();
        private Bill billSelected;
        
	public BillList(){

	}
        
        public void addBill(Bill bill){
		billList.add(bill);
	}
        
        public Bill searchBill(int id){
		for(Bill recipe : billList){
                if(recipe.getIdBill() == id){
                    billSelected = recipe;
                }
            }
            return billSelected;
	}
	
}