package personne;

public abstract class Personne {

	private int id;
	private String nom ; 
	private String prenom;
	private String tel;
	private Genre genre;
	
	
	public Personne(int id, String nom, String prenom, String tel, Genre g) {
	
	this.id = id ;
	this.nom = nom ;
	this.prenom = prenom;
	this.tel = tel ;
	this.genre = g ;
	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", genre=" + genre
				+ ", toString()=" + super.toString() + "]";
	}

	
	public abstract String getRole();
	
}
