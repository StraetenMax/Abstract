package travail;

abstract class Vehicule {
	//propriétés
	protected String couleur;
	protected int nbOccupants;
	
	//constructeurs vide et initialisé
	public Vehicule(){
		couleur ="";
		nbOccupants = 0;
	}
	public Vehicule(String couleur, int nbOccupants){
		this.couleur= couleur;
		this.nbOccupants= nbOccupants;
	}
	
	//accesseurs et mutateurs
	public String getCouleur(){
		return couleur;
	}
	public int getNbOccupants(){
		return nbOccupants;
	}
	public void setCouleur(String couleur){
		this.couleur = couleur;
	}
	public void setNbOccupants(int nbOccupants){
		this.nbOccupants = nbOccupants;
	}
	
	
	//methodes
	protected void demarrer(){
		System.out.println("Je demarre");
	}
	
	protected void arreter(){
		System.out.println("Je m'arrete");
	}
	abstract void avancer();
	abstract void seGarer();
	
	public String description(){
		String str = "Je suis un objet de la " + this.getClass() +
				", je suis " + this.couleur + ", je contient " + this.nbOccupants + " occupants ";
				return str;
	}
	
}
