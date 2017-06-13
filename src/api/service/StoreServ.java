package api.service;
 
import api.dto.Store;
import Exceptions.AlreadyExistException;
import Exceptions.InvalidParrameters;
import Exceptions.MIssingParrametersException;
import Exceptions.NotFoundException;

public abstract interface StoreServ {
	

	public abstract void accept(int id,String name,String ParentID) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	public abstract void Delivery(int id,String name,String ParentID) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	public abstract void Transfer(int id,String name,String ParentID) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	public abstract void Adjust(int id,String name,String ParentID) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	
}
