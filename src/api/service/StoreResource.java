package api.service;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.dto.Stock;
import api.dto.Store;
import Exceptions.AlreadyExistException;
import Exceptions.InvalidParrameters;
import Exceptions.MIssingParrametersException;
import Exceptions.NotFoundException;
public interface StoreResource {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Stock createComment(Stock comment)throws NotFoundException, AlreadyExistException, MIssingParrametersException,
	InvalidParrameters;
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Store updateComment(Store comment) throws NotFoundException,
	AlreadyExistException, MIssingParrametersException, InvalidParrameters;
	
		
}
