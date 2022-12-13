package jaxWs.persistance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "histoCarb")
public class HistoCarb {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codeH;
	private Date date;
	private float prix;
	
	@ManyToOne
	@JoinColumn(name = "codeSta")
	private Station station;
	
	@ManyToOne
	@JoinColumn(name = "codeCar")
	private Carburant carburant;

	public int getCodeH() {
		return codeH;
	}

	public void setCodeH(int codeH) {
		this.codeH = codeH;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Station getStation() {
		return station;
	}

	public HistoCarb(Date date, float prix, Station station, Carburant carburant) {
		super();
		this.date = date;
		this.prix = prix;
		this.station = station;
		this.carburant = carburant;
	}

	public HistoCarb() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Carburant getCarburant() {
		return carburant;
	}

	public void setCarburant(Carburant carburant) {
		this.carburant = carburant;
	}
	
	

}
