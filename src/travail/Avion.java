package travail;

public class Avion {
	//propriétés
	private String compagnie;
	private boolean militaire;
	
	//constructeurs vide et initialisé
	public Avion(){
		super();
		compagnie = "";
		militaire = true;
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
