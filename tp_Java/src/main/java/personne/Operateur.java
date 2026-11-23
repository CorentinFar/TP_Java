package personne;
import mission.*;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;


public class Operateur extends Personne{

	private static final int MIN_COMPETENCES = 1;
    private static final int MAX_COMPETENCES = 3;
	
	private EnumSet<Competence> competences ; 
	private Set<Cadet> cadets = new HashSet<Cadet>();
	private Mission missionCourante;
	
	public Operateur(int id, String nom, String prenom, String tel, Genre g,Set<Competence> c) {
		super(id, nom, prenom, tel, g);
		this.missionCourante=null;
		if(c == null) {
			throw new IllegalArgumentException("Il faut au minimum 1 competence");
		}
		EnumSet<Competence> copie = EnumSet.noneOf(Competence.class);
		copie.addAll(c);
		if (copie.size() < MIN_COMPETENCES || copie.size() > MAX_COMPETENCES) {
            throw new IllegalArgumentException("Un opérateur a entre " + MIN_COMPETENCES + " et " + MAX_COMPETENCES +
            		" compétences (reçu : " + copie.size() + ")");
        }
        this.competences = copie;
	}

	public Set<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(EnumSet<Competence> c) {
		EnumSet<Competence> copie = EnumSet.noneOf(Competence.class);
		copie.addAll(c);
		if (copie.size() < MIN_COMPETENCES || copie.size() > MAX_COMPETENCES) {
            throw new IllegalArgumentException("Un opérateur a entre " + MIN_COMPETENCES + " et " + MAX_COMPETENCES +
            		" compétences (reçu : " + copie.size() + ")");
        }
        this.competences = copie;		
	}

	public Set<Cadet> getCadets() {
		return cadets;
	}

	public void setCadets(Set<Cadet> cadets) {
		this.cadets = cadets;
	}

	public Mission getMissionCourante() {
		return this.missionCourante;
	}

	public void setmissionCourante(Mission m) {
		this.missionCourante = m;
	}

	@Override
	public String toString() {
		return "Operateur [competences=" + competences + ", cadets=" + cadets + ", MissionCourante=" + this.missionCourante
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	@Override
	public String getRole() {
		return "Operateur";
	}
	
	public void ajoutCadet(Cadet c) {
		cadets.add(c);
	}
	
	public void ajoutCadet(Set<Cadet> c) {
		cadets.addAll(c);
	}
	
	public boolean aCompetences(Competence c) {
		if(this.competences.contains(c)) {
			return true;
		}
		return false;
	}
	
	public void AffecterA(Mission m) {
		if(this.missionCourante==null) {
			this.missionCourante=m;
		}
		else {
			throw new IllegalStateException("L'opérateur est déjà affecté à la mission : " + this.missionCourante);
		}
	}
	
	public void liberer() {
		this.missionCourante=null;
		//envoyer à chaque cadet incrementation du nb reussi si reussi
	}
	
	
	public void retirerCadet(Cadet c) {
		if(this.cadets.contains(c)) {
			this.cadets.remove(c);
		}
	}
	
	Operateur getPromotion(Cadet c) {
		if(cadets.contains(c)) {
			if(c.estPromouvable()) {
				Operateur nouveau = new Operateur(c.getId(),c.getNom(),c.getPrenom(),c.getTel(),c.getGenre(),this.competences);
				cadets.remove(c);
				return nouveau ;
			}
			else {
				throw new IllegalStateException("Le Cadet n'a pas validé 3 missions réussies");
			}
		}
		else {
			throw new IllegalStateException("L'opérateur n'est pas le tuteur de ce Cadet");
		}
		
	}
}
