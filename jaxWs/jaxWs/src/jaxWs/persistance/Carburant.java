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
@Table(name = "carburant")
public class Carburant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codeCar ;
	private String nom;
	private String description;
	
	@OneToMany(mappedBy ="carburant", fetch = FetchType.LAZY)
	private Collection<HistoCarb> histoCarb;

	public int getCodeCar() {
		return codeCar;
	}

	public void setCodeCar(int codeCar) {
		this.codeCar = codeCar;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Carburant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carburant(int codeCar, String nom, String description, Collection<HistoCarb> histoCarb) {
		super();
		this.codeCar = codeCar;
		this.nom = nom;
		this.description = description;
		this.histoCarb = histoCarb;
	}

	public Carburant(int codeCar, String nom, String description) {
		super();
		this.codeCar = codeCar;
		this.nom = nom;
		this.description = description;
	}
	
	public Carburant(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}
	
	
}
