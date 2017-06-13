package api.service;

import api.dto.Stock;
import Exceptions.AlreadyExistException;
import Exceptions.InvalidParrameters;
import Exceptions.MIssingParrametersException;
import Exceptions.NotFoundException;

public abstract interface StockServ {

	public abstract void accept(int id,String name) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	public abstract void Delivery(int id,String name) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	public abstract void Transfer(int id,String name) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
	public abstract void Adjust(int id,String name) throws AlreadyExistException,InvalidParrameters,MIssingParrametersException,NotFoundException;
}
