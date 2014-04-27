import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("dbmanager")
public class DBManager 
{
	@GET
	@Path("test")
	public String test()
	{
		return "IT WORKS";
	}
}
