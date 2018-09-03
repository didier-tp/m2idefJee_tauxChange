package tp.ws.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import tp.model.TauxChange;

@Path("rest/change")
@Produces("application/json")
public class ChangeRest {

	private List<TauxChange> listeTauxChange = new ArrayList<TauxChange>();

	public ChangeRest() {
		listeTauxChange.add(new TauxChange("EUR", 1.0));
		listeTauxChange.add(new TauxChange("USD", 1.1));
		listeTauxChange.add(new TauxChange("JPY", 102.3));
		listeTauxChange.add(new TauxChange("GBP", 1.2));
	}
	
	// URL complete : http://localhost:8080/tauxChange/ws/rest/change/?base=EUR
	@GET
	@Path("/") //ou bien @Path("/all")
	public List<TauxChange> allChanges(@QueryParam("base") String base) {
		System.out.println("base=" + base);
		// code améliorable avec resultat selon valeur de base
	   return this.listeTauxChange;	//sera converti en JSON via paramétrage
	                                //@Produces("application/json")

		
	}

}
