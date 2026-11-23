package engins;

import java.util.Objects;

public abstract class Engin {
    private final long id;
    private final String nom;
    private Position position;
    private EtatEngin etat;

    protected Engin(long id, String nom, Position position) {
        if (id < 0) {
            throw new IllegalArgumentException("L'identifiant doit être positif et supérieur a 0.");
        }

        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom de l'engin est obligatoire.");
        }

        this.id = id;
        this.nom = nom;
        this.position = Objects.requireNonNull(position, "La position est obligatoire.");
        this.etat = EtatEngin.DISPONIBLE;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Position getPosition() {
        return position;
    }

    public EtatEngin getEtat() {
        return etat;
    }

    
    public void affecter() { // Methode pour Mission 
        if (etat != EtatEngin.DISPONIBLE) {
            throw new IllegalStateException(
                "Seul un engin disponible peut être affecté à une mission."
            );
        }

        etat = EtatEngin.EN_MISSION; // l'état change aprés etre affecté a une mission
    }

 
    public void terminerMission(boolean estEnPanne) {
        if (etat != EtatEngin.EN_MISSION) {
            throw new IllegalStateException(
                "L'engin n'est pas en mission."
            );
        }

        if (estEnPanne) {
            etat = EtatEngin.EN_PANNE;
        } else {
            etat = EtatEngin.DISPONIBLE;
        }
    }

  // Répare un engin en panne
    public void RemettreEnService() {
        if (etat != EtatEngin.EN_PANNE) {
            throw new IllegalStateException(
                "Seul un engin en panne peut être réparé."
            );
        }

        etat = EtatEngin.DISPONIBLE;
    }
    protected void mettreAJourPosition(Position nouvellePosition) {
        if (etat != EtatEngin.EN_MISSION) {
            throw new IllegalStateException(
                "L'engin doit être en mission pour se déplacer."
            );
        }

        this.position = Objects.requireNonNull(
            nouvellePosition,
            "La position ne peut pas être nulle."
        );
    }
 
    
}

