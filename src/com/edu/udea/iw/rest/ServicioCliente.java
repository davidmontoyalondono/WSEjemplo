package com.edu.udea.iw.rest;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edu.udea.iw.dto.CiudadWS;

import dao.imp.CiudadDAOImp;
import dto.Ciudad;


@Path("Ciudad")
@Component
public class ServicioCliente {
	
	@Autowired
	private CiudadDAOImp ciudadesDaoImp;

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<CiudadWS> obtener() throws RemoteException
	{ 	
		List<CiudadWS> ciudades = new ArrayList<CiudadWS>();
		List<Ciudad> listaCiudades = null;
		
		try
		{
			listaCiudades = ciudadesDaoImp.obtener();
			
			for(Ciudad ciudad : listaCiudades)
			{
				CiudadWS ciudadWS = new CiudadWS();
				
				ciudadWS.setCodigo(ciudad.getCodigo());
				ciudadWS.setNombre(ciudad.getNombre());
				ciudadWS.setCodigoArea(ciudad.getCodigoArea());
				
		        ciudades.add(ciudadWS);
				
			}
			
		}
		catch(Exception e)
		{
			throw new RemoteException(e.getMessage());
		}
		
		
		return ciudades;
	}

}
