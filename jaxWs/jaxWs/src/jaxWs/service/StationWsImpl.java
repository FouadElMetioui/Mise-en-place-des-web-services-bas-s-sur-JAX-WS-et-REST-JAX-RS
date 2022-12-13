package jaxWs.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import jaxWs.persistance.Station;
import jaxWs.persistance.Carburant;
import jaxWs.persistance.HistoCarb;
import jaxWs.dao.DatabaseOperations;

@WebService(endpointInterface = "jaxWs.service.StationWs")  
public class StationWsImpl  implements StationWs{

	@Override
	public Station findStation(int id) {
		
		return  DatabaseOperations.findStation(id);
	}

	@Override
	public Station creerStation(String nom, String adress) {
		return DatabaseOperations.creerStation(nom, adress);
	}

	@Override
	public List getAllStations() {
		return DatabaseOperations.getAllStations();
	}

	@Override
	public void deleteStation(Station station) {
		DatabaseOperations.deleteStation(station);
		
	}

	@Override
	public String updateStation(Station station) {
		
		return DatabaseOperations.updateStation(station);
	}

	@Override
	public Carburant findCarburant(int id) {
		return DatabaseOperations.findCarburant(id);
	}

	@Override
	public Carburant creerCarburant(String nom, String description) {
		return DatabaseOperations.creerCarburant(nom, description);
	}

	@Override
	public List getAllCarburants() {
		return DatabaseOperations.getAllCarburants();
	}

	@Override
	public void deleteCarburant(Carburant carburant) {
		DatabaseOperations.deleteCarburant(carburant);
		
	}

	@Override
	public String updateCarburant(Carburant carburant) {
		return DatabaseOperations.updateCarburant(carburant);
	}

	@Override
	public HistoCarb findHistoCarb(int id) {
		
		return DatabaseOperations.findHistoCarb(id);
	}

	@Override
	public HistoCarb creerHistoCarb(Date date, float prix, Station station, Carburant carburant) {
		return DatabaseOperations.creerHistoCarb(date, prix, station, carburant);
	}

	@Override
	public List getAllHistoCarbs() {
		return DatabaseOperations.getAllHistoCarbs();
	}

	@Override
	public void deleteHistoCarb(HistoCarb histoCarb) {
		DatabaseOperations.deleteHistoCarb(histoCarb);
		
	}

	@Override
	public String updateHistoCarb(HistoCarb histoCarb) {
		return DatabaseOperations.updateHistoCarb(histoCarb);
	}

	
	
}
