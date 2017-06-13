package api.dto;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
@XmlRootElement
public class StoreStock implements Serializable {
	private static final long serialVersionUID = 1L;

	private int Id;
	private int Quantity;
	private int BarCode;
	private int SerialNo;
	private String Description;
	public List<CurrentStock>CurrentStock;
	
	public void storeStock(){
		
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}



	public int getQuantity() {
		return Quantity;
	}



	public void setQuantity(int quantity) {
		Quantity = quantity;
	}



	public int getBarCode() {
		return BarCode;
	}



	public void setBarCode(int barCode) {
		BarCode = barCode;
	}



	public int getSerialNo() {
		return SerialNo;
	}



	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}

	public List<CurrentStock> getCurrentStock() {
		if(CurrentStock==null){
			CurrentStock = new ArrayList<CurrentStock>();
		}
		return CurrentStock;
	}

	public void setCurrentStock(List<CurrentStock> currentStock) {
		CurrentStock = currentStock;
	}




}
