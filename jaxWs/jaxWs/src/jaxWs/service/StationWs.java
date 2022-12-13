package jaxWs.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import jaxWs.persistance.Station;
import jaxWs.persistance.Carburant;
import jaxWs.persistance.HistoCarb;

@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface StationWs {
	
	
	@WebMethod
	public Station findStation(int id);
	
	@WebMethod
	public Station creerStation(String nom , String adress);
	
	@WebMethod
	public  List getAllStations();
	
	@WebMethod
	public  void deleteStation(Station station);
	
	@WebMethod
	public  String updateStation(Station station);
	
	
	
	
	@WebMethod
	public Carburant findCarburant(int id);
	
	@WebMethod
	public Carburant creerCarburant(String nom , String description);
	
	@WebMethod
	public  List getAllCarburants();
	
	@WebMethod
	public  void deleteCarburant(Carburant carburant);
	
	@WebMethod
	public  String updateCarburant(Carburant carburant);
	
	
	

	
	@WebMethod
	public HistoCarb findHistoCarb(int id);
	
	@WebMethod
	public HistoCarb creerHistoCarb(Date date , float prix ,Station station, Carburant carburant);
	
	@WebMethod
	public  List getAllHistoCarbs();
	
	@WebMethod
	public  void deleteHistoCarb(HistoCarb histoCarb);
	
	@WebMethod
	public  String updateHistoCarb(HistoCarb histoCarb);

}
