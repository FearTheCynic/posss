package api.dto;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
@XmlRootElement
public class Sales implements Serializable{
	private static final long serialVersionUID = 1L;
private int ID;
private int TotalPrice;
public List<SalesDetails>SalesDetails;
public void sales(){
	
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public int getTotalPrice() {
	return TotalPrice;
}

public void setTotalPrice(int totalPrice) {
	TotalPrice = totalPrice;
}

public List<SalesDetails> getSalesDetails() {
	if(SalesDetails==null){
		SalesDetails = new ArrayList<SalesDetails>();
	}
	return SalesDetails;
}

public void setSalesDetails(List<SalesDetails> salesDetails) {
	SalesDetails = salesDetails;
}



}
