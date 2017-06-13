package api.dto;

import java.io.Serializable;

import java.util.List;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
@XmlRootElement
@XmlType
public class Store implements Serializable {
	private static final long serialVersionUID = 1L;


	private int ID;
	private String Name;
	private String ParentID;
	
	public List<Stock>Stock;
	
	public List<Stock> getStock() {
		if(Stock==null){
			Stock = new ArrayList<Stock>();
		}
		return Stock;
	}


	public void setStock(List<Stock> stock) {
		Stock = stock;
	}


	public void Store() {

	}
	
	
	public int getID() {
	return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getParentID() {
		return ParentID;
	}
	public void setParentID(String parentID) {
		ParentID = parentID;
	}
	
	
	
	
}
