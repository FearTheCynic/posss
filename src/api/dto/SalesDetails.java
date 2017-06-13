package api.dto;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
@XmlRootElement
public class SalesDetails implements Serializable{
	private static final long serialVersionUID = 1L;
private int UnitPrice;
private int SalesID;
private int UnitQuantity;
 
public void salesDetails(){
	
}

public int getUnitPrice() {
	return UnitPrice;
}

public void setUnitPrice(int unitPrice) {
	UnitPrice = unitPrice;
}

public int getSalesID() {
	return SalesID;
}

public void setSalesID(int salesID) {
	SalesID = salesID;
}

public int getUnitQuantity() {
	return UnitQuantity;
}

public void setUnitQuantity(int unitQuantity) {
	UnitQuantity = unitQuantity;
}
	

}
