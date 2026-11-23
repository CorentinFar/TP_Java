package mission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import personne.*;

public class GestionnaireMission {
	
		TreeSet<Mission> planifiees = new TreeSet<>();
		HashSet<Mission> Terminees = new HashSet<>();
		List <Personne> personnes = new ArrayList<>(); 
		Map<Mission,Future> enCours = new HashMap<>(); 
		ExecutorService executor;
		
		
}
