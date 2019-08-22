package singh.madhur.jersy.RestAPIJersy;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import singh.madhur.jersy.RestAPIJersy.DIO.Aliens;
import singh.madhur.jersy.RestAPIJersy.DIO.AlliensRepository;

@Path("/aliens")
public class AliensResource 
{
		static AlliensRepository alr=new AlliensRepository();

	
	@GET 
	@Produces(MediaType.APPLICATION_XML)
	public List<Aliens> getAliens()
	{
		
		return alr.getAliens();
	}
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Aliens getAliens(@PathParam(value = "id") int id)
	{
		return alr.getAliens(id);
	}
	@POST
	//@Path("aliens")
	public Aliens addAliens(Aliens al)
	{
		//alr.addAlien(al);
		return alr.addAlien(al);
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Aliens removeAliens(@PathParam("id") int id)
	{
		System.out.println("Inside delte id");
		return alr.deleteAlien(id);
	}
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Aliens removeAliens(Aliens al)
	{
		System.out.println("Inside delte Alien");
		return alr.deleteAlien(al.getId());
	}

}
