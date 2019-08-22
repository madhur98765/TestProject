package singh.madhur.jersy.RestAPIJersy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.process.internal.RequestScoped;

@Path("test")
public class TestClass
{
	@GET
	//@Path("test")
	public String classTest()
	{
		return "this is class to test2";
	}

}
