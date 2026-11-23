package mission;
import java.time.LocalDate;

import engins.*;
import personne.*;

public class RapportMission {

	private long ID ; 
	private String nomMission ; 
	private LocalDate date ; 
	private String CorpsCeleste;
	private int nbZonesExplorees ; 
	private int nbEchantillons ; 
	private int interetTotal;
	private boolean reussie; 
	private long budget;
	
	public RapportMission() {
		
	}
	
	public RapportMission(long ID, String nomMission, LocalDate date, String CorpsCeleste, int nbZonesExplorees, int nbEchantillons, int interetTotal, boolean reussie, long budget) {
		this.ID = ID ;
		this.nomMission= nomMission;
		this.date= date;
		this.CorpsCeleste = CorpsCeleste;
		this.nbEchantillons = nbEchantillons;
		this.nbZonesExplorees = nbZonesExplorees ; 
		this.interetTotal = interetTotal ; 
		this.reussie = reussie ; 
		this.budget = budget ;
		
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNomMission() {
		return nomMission;
	}

	public void setNomMission(String nomMission) {
		this.nomMission = nomMission;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCorpsCeleste() {
		return CorpsCeleste;
	}

	public void setCorpsCeleste(String corpsCeleste) {
		CorpsCeleste = corpsCeleste;
	}

	public int getNbZonesExplorees() {
		return nbZonesExplorees;
	}

	public void setNbZonesExplorees(int nbZonesExplorees) {
		this.nbZonesExplorees = nbZonesExplorees;
	}

	public int getNbEchantillons() {
		return nbEchantillons;
	}

	public void setNbEchantillons(int nbEchantillons) {
		this.nbEchantillons = nbEchantillons;
	}

	public int getInteretTotal() {
		return interetTotal;
	}

	public void setInteretTotal(int interetTotal) {
		this.interetTotal = interetTotal;
	}

	public boolean isReussie() {
		return reussie;
	}

	public void setReussie(boolean reussie) {
		this.reussie = reussie;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}
	
	public void afficheRapport() {
		System.out.println(
				"\t\t === Affichage de la Mission n°" + this.ID + " nom de code : "+this.nomMission +"\n"+
				"Date de début : " + this.date + "............\nPlanète : "+ this.CorpsCeleste + "............\nNombre de Zones explorées : "+ this.nbZonesExplorees+
				"............\nNombre d'échantillons rapportés : "+ this.nbEchantillons +"............\nInterêt de la mission : "+ this.interetTotal+
				"............"
				);
		if (this.reussie) {
			System.out.println("Résultat : Réussite............");
		}
		else {System.out.println("Résultat : ECHEC...........");}
		
		System.out.println("Coût de la mission : " + this.budget+"...........");
	
	}
}
