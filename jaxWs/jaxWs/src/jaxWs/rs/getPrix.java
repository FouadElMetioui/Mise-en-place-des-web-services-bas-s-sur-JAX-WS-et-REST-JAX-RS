package jaxWs.rs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jaxWs.dao.DatabaseOperations;
import jaxWs.persistance.HistoCarb;
import jaxWs.persistance.Station;

@Path("/getPrix")
public class getPrix {

	@GET
	@Path("/{(nom_station}/{date}")
	@Produces(MediaType.TEXT_PLAIN)
	public float getprix(@QueryParam(value="(nom_station") String nom_station ,@QueryParam(value="date") Date date) {
		
		
		List<Station> allS = new ArrayList();
		allS = DatabaseOperations.getAllStations();
		
		List<HistoCarb> allH = new ArrayList();
		allH = DatabaseOperations.getAllHistoCarbs();
		
		for (Station s : allS ) {
			if (s.getNom().equals(nom_station)) {
				for (HistoCarb h : allH ) {
					if(h.getDate() == date) {
						return h.getPrix();
					}
				}
			}
		}
		return 0;
		
	}

}
