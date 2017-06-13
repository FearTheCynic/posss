package api.dto;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


import java.util.ArrayList;
@XmlRootElement
public class CurrentStock  implements Serializable {

	private static final long serialVersionUID = 1L;
private int id;
private int Quantity;
private int Refill;

public List<Sales>Sales;
public void currentStock(){
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getQuantity() {
	return Quantity;
}

public void setQuantity(int quantity) {
	Quantity = quantity;
}

public int getRefill() {
	return Refill;
}

public void setRefill(int refill) {
	Refill = refill;
}

public List<Sales> getSales() {
	if(Sales==null){
		Sales = new ArrayList<Sales>();
	}
	return Sales;
}

public void setSales(List<Sales> sales) {
	Sales = sales;
}
	


}
