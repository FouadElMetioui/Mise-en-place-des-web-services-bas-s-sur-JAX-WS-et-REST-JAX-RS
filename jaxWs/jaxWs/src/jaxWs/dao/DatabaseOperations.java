package jaxWs.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jaxWs.persistance.Carburant;
import jaxWs.persistance.HistoCarb;
import jaxWs.persistance.Station;

public class DatabaseOperations {
	

	private static final String PERSISTENCE_UNIT_NAME = "jaxWs";
	 private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
			.createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();

	public DatabaseOperations() {
		super();
	}
	
	
	public static Station findStation(int id) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		Station station = entityMgrObj.find(Station.class, id);
		transactionObj.commit();
		if (station != null) {
			return station;
		} else {
			return null;
		}
	}
	
	public static Station creerStation(String nom , String adress) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}

		Station station = new Station(nom,adress);
		System.out.println("ajouter Station : nomArt "+nom+", adresse : " +adress);
		entityMgrObj.persist(station);
	
		System.out.println("pers");

		transactionObj.commit();
		return station;
	}
	
	@SuppressWarnings("unchecked")
	public static List getAllStations() {
		Query queryObj = entityMgrObj.createQuery("SELECT s from Station s");
		List<Station> lList = queryObj.getResultList();

		if (lList != null && lList.size() > 0) {
			return lList;
		} else {
			return null;
		}
	}
	
	
	public static void deleteStation(Station station) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		if (!entityMgrObj.contains(station)) {
			station = entityMgrObj.merge(station);
		}
		entityMgrObj.remove(station);
		transactionObj.commit();
	}
	
	public static String updateStation(Station station){
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		Station newStation = entityMgrObj.find(Station.class, station.getCodeSta());
		newStation.setAdress(station.getAdress());
		newStation.setNom(station.getNom());
		transactionObj.commit();
		return "true";
	}
	
//	Carburant 
	
	public static Carburant findCarburant(int id){
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		Carburant carburant = entityMgrObj.find(Carburant.class, id);
		transactionObj.commit();
		if (carburant != null) {
			return carburant;
		} else {
			return null;
		}
	}
	
	public static Carburant creerCarburant(String nom , String description) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}

		Carburant carburant = new Carburant(nom,description);
		System.out.println("ajouter carburant : nom"+nom+", description : " +description);

		entityMgrObj.persist(carburant);
		transactionObj.commit();
		return carburant;
	}
	
	@SuppressWarnings("unchecked")
	public static List getAllCarburants() {
		Query queryObj = entityMgrObj.createQuery("SELECT c from Carburant c");
		List<Carburant> lList = queryObj.getResultList();

		if (lList != null && lList.size() > 0) {
			return lList;
		} else {
			return null;
		}
	}
	
	public static void deleteCarburant(Carburant carburant) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		if (!entityMgrObj.contains(carburant)) {
			carburant = entityMgrObj.merge(carburant);
		}
		entityMgrObj.remove(carburant);
		transactionObj.commit();
	}
	
	public static String updateCarburant(Carburant carburant){
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		Carburant newCarburant = entityMgrObj.find(Carburant.class, carburant.getCodeCar());
		newCarburant.setDescription(carburant.getDescription());
		newCarburant.setNom(newCarburant.getNom());
		transactionObj.commit();
		return "true";
	}
	
//	HistoCarb
	
	public static HistoCarb findHistoCarb(int id){
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		HistoCarb histoCarb = entityMgrObj.find(HistoCarb.class, id);
		transactionObj.commit();
		if (histoCarb != null) {
			return histoCarb;
		} else {
			return null;
		}
	}
	
	public static HistoCarb creerHistoCarb(Date date , float prix ,Station station, Carburant carburant) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}

		HistoCarb histoCarb = new HistoCarb(date,prix ,station ,carburant);
		System.out.println("ajouter histoCarb : date"+date+", prix : " +prix);

		entityMgrObj.persist(histoCarb);
		transactionObj.commit();
		return histoCarb;
	}
	
	
	@SuppressWarnings("unchecked")
	public static List getAllHistoCarbs() {
		Query queryObj = entityMgrObj.createQuery("SELECT h from histoCarb h");
		List<HistoCarb> lList = queryObj.getResultList();

		if (lList != null && lList.size() > 0) {
			return lList;
		} else {
			return null;
		}
	}
	
	public static void deleteHistoCarb(HistoCarb histoCarb) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		if (!entityMgrObj.contains(histoCarb)) {
			histoCarb = entityMgrObj.merge(histoCarb);
		}
		entityMgrObj.remove(histoCarb);
		transactionObj.commit();
	}
	
	public static String updateHistoCarb(HistoCarb histoCarb){
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}
		HistoCarb newHistoCarb = entityMgrObj.find(HistoCarb.class, histoCarb.getCodeH());
		newHistoCarb.setCarburant(histoCarb.getCarburant());
		newHistoCarb.setStation(histoCarb.getStation());
		newHistoCarb.setDate(histoCarb.getDate());
		newHistoCarb.setPrix(histoCarb.getPrix());
		
		transactionObj.commit();
		return "true";
	}
	
	
}
