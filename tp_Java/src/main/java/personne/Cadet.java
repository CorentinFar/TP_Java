package personne;
import mission.*;

public class Cadet extends Personne{

	private Operateur tuteur ;
	private int nb_reussi;
	
	public Cadet(int id, String nom, String prenom, String tel, Genre g, Operateur t) {
		super(id, nom, prenom, tel, g);
		this.nb_reussi = 0 ;
		if (t!=null) {
			this.tuteur=t;
		}
		else {
			throw new NullPointerException("Le cadet a besoin d'un operateur pour le guider");
		}
	}
	public Operateur getTuteur() {
		return tuteur;
	}

	public void setTuteur(Operateur tuteur) {
		this.tuteur = tuteur;
	}

	public int getNb_reussi() {
		return nb_reussi;
	}

	public void setNb_reussi(int nb_reussi) {
		this.nb_reussi = nb_reussi;
	}

	@Override
	public String toString() {
		return "Cadet [tuteur=" + tuteur + ", nb_reussi=" + nb_reussi + ", toString()=" + super.toString() + "]";
	}
	
	
	@Override
	public String getRole() {
		return "Cadet";
	}
	

	void changerTuteur(Operateur nouveau) {
		this.tuteur.getCadets().remove(this);
		this.tuteur=nouveau;
		this.tuteur.ajoutCadet(this);
	}
	
	public Mission getMissionCourante() {
		return this.tuteur.getMissionCourante();	
		}
	
	
	public boolean estDisponible() {
		if(this.tuteur.getMissionCourante()==null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void enregistrerMission(boolean reussie) {
		if(reussie) {
			System.out.println("Bravo");
			this.nb_reussi+=1;
		}
		else {
			System.out.println("Dommage, la prochaine fois sera la bonne");
		}
	}

	public boolean estPromouvable() {
		if(this.nb_reussi>=3) {
			return true;
		}
		return false;
	}



}
