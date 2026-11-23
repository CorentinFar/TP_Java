package personne;
import mission.*;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Directeur extends Personne {

	
	private long budget_tot;
	private Set<Mission> MissionEnCours;
	
	public Directeur(int id, String nom, String prenom, String tel, Genre g) {
		super(id,  nom,  prenom,  tel,  g);
		budget_tot = 0;
		this.MissionEnCours = new LinkedHashSet<Mission>();
	}

	public long getBudget_tot() {
		return budget_tot;
	}
	public void setBudget_tot(long l) {
		this.budget_tot = l;
	}
	@Override
	public String toString() {
		return "Directeur [budget_tot=" + budget_tot + ", toString()=" + super.toString() + "]";
	}
	@Override
	public String getRole() {
		return "Directeur";
	}
	
	
	public void ajoute_mission(Mission m) {
		MissionEnCours.add(m);
	}
	
	public boolean dirige(Mission m) {
		if(MissionEnCours.contains(m)) {
			return true;
		}
		return false;
	}
	
	public void terminerMission(Mission m, boolean reussie) {
		if(MissionEnCours.contains(m)) {
			if(reussie) {
				this.setBudget_tot(this.getBudget_tot()+m.getBudget());
			}
			this.MissionEnCours.remove(m);
		}
	}
	
	public Set<Mission> getMissionEnCours(){
		return Collections.unmodifiableSet(this.MissionEnCours);
	}
	
}
