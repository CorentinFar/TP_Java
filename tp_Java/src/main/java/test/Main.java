package test;
import mission.*;
import personne.*;

public class Main {

	public static void main(String[] args) {
		
		Directeur DM = new Directeur(1,"Desertot","Mikael","+33684759841",Genre.HOMME);
		Operateur FC = new Operateur(39,"Fareneau","Corentin","+33622513692",Genre.HOMME, null);
		Cadet LC = new Cadet(90,"Croft","Lara","+33759847512",Genre.FEMME, FC);
		
		System.out.println(DM);
		System.out.println(FC);
		System.out.println(LC);
	
	}

}
