package api.service;

import api.dto.Sales;
import Exceptions.AlreadyExistException;
import Exceptions.InvalidParrameters;
import Exceptions.MIssingParrametersException;
import Exceptions.NotFoundException;

public abstract interface SaleServ {

	public abstract void getallSales(int ID,
	int TotalPrice) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	public abstract void voidSales(int ID,
	int TotalPrice) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	public abstract void ReturnSales(int ID,
	int TotalPrice) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	public abstract void recordSales(int ID,
	int TotalPrice) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;

	
}
