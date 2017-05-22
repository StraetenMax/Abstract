package travail;

public class Avion extends VehiculeAerien {
	//propriétés
	private String compagnie;
	private boolean militaire;
	
	//constructeurs vide et initialisé
	public Avion(){
		super();
		compagnie = "";
		militaire = true;
	}
	
	public Avion(String couleur,int nbOccupants,int rayonAction,String compagnie, boolean militaire){	
		super(couleur, nbOccupants,rayonAction);
		this.compagnie =compagnie;
		this.militaire =militaire;
	}
	
	//accesseurs et mutateurs
	public String getCompagnie(){
		return compagnie;
	}
	public boolean getMilitaire(){
		return militaire;
	}
	public void setCompagnie(String compagnie){
		this.compagnie=compagnie;
	}
	public void setMilitaire(boolean compagnie){
		this.militaire = militaire;
	}
	
	//méthodes
	public void avancer(){
		System.out.println("J'avance avion");
	}
	public void seGarer(){
		System.out.println("Je me gare avion");
	}

}
