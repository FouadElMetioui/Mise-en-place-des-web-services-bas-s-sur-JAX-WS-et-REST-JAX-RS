package jaxWs.persistance;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "station")
public class Station {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codeSta;
	private String nom;
	private String adress;
	
	
	@OneToMany(mappedBy ="station", fetch = FetchType.LAZY)
	private Collection<HistoCarb> histoCarb;


	public int getCodeSta() {
		return codeSta;
	}


	public void setCodeSta(int codeSta) {
		this.codeSta = codeSta;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Station(int codeSta, String nom, String adress) {
		super();
		this.codeSta = codeSta;
		this.nom = nom;
		this.adress = adress;
	}
	
	public Station(String nom, String adress) {
		super();
		this.nom = nom;
		this.adress = adress;
	}
	
	
}
