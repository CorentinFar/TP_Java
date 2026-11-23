package mission;
import personne.*;
import engins.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import engins.*;

public class Mission {

	private String nom;
	private String planete;
	private long budget;
	private LocalDate lancement;
	private Statut statut;
	private Directeur Dirlo;
	private Set<Operateur> op ; 
	private Set<Engin> machine;
	private Set<Zone> goal;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPlanete() {
		return planete;
	}
	public void setPlanete(String planete) {
		this.planete = planete;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	public LocalDate getLancement() {
		return lancement;
	}
	public void setLancement(LocalDate lancement) {
		this.lancement = lancement;
	}
	public Statut getStatut() {
		return statut;
	}
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	public Directeur getDirlo() {
		return Dirlo;
	}
	public void setDirlo(Directeur dirlo) {
		Dirlo = dirlo;
	}
	public Set<Operateur> getOp() {
		return op;
	}
	public void setOp(Set<Operateur> op) {
		this.op = op;
	}
	public Set<Engin> getMachine() {
		return machine;
	}
	public void setMachine(Set<Engin> machine) {
		this.machine = machine;
	}
	public Set<Zone> getGoal() {
		return goal;
	}
	public void setGoal(Set<Zone> goal) {
		this.goal = goal;
	}
	
	//A faire
	public void ajouterOperateur(Operateur operator) {
		if(op.contains(operator){
			return;
		}
		else { op.add(operator);}
	}
	public void ajouterEngin(Engin engine) {
		if(!this.machine.contains(engine)) {
			this.machine.add(engine);
		}
	}
	public void ajouterZoneObjectif(Zone objectif) {
		if(!this.goal.contains(objectif)) {
			goal.add(objectif);
		}
	
}
	public void verifierDemarrage() {
		
	}
	public void demarrer() {
		
	}
	public Set<Personne> getParticipants(){
		HashSet<Personne> participants = new HashSet<Personne>();
		participants.add(Dirlo);
		participants.addAll(op);
		for(Operateur ope : op) {
			participants.addAll(ope.getCadets());
		}
		return participants;
	}
	
	
	
	public RapportMission Terminer() {
		
	}
	public boolean estReussie() {
		return true;
	}
	public double tauxExploration() {
		return 0.0;
	}
	public int Compareto(Mission m){
		return 1;
	}
	//comparator par budgetDecroissant
	
	
	
}
