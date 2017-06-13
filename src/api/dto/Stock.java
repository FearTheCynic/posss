package api.dto;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
@XmlRootElement
public class Stock implements Serializable  {

	private static final long serialVersionUID = 1L;
	private int Id;
private	String Name;
private	int StockCode;
	private int MeasurementType;
	public List<StoreStock>StoreStock;
	
	public int getId() {
		return Id;
	}
	
	public void stock(){
		
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStockCode() {
		return StockCode;
	}
	public void setStockCode(int stockCode) {
		StockCode = stockCode;
	}
	public int getMeasurementType() {
		return MeasurementType;
	}
	public void setMeasurementType(int measurementType) {
		MeasurementType = measurementType;
	}

	public List<StoreStock> getStoreStock() {
		if(StoreStock==null){
			StoreStock = new ArrayList<StoreStock>();
		}
		return StoreStock;
	}

	public void setStoreStock(List<StoreStock> storeStock) {
		StoreStock = storeStock;
	}
	
	
	
}
