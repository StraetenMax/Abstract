package travail;

public class Helicoptere extends VehiculeAerien {
	//propriétés
	private String compagnie;
	private boolean militaire;
	
	//constructeur vide et initialisé
	public Helicoptere(){
		super();
		compagnie ="";
		militaire = true;
	}
	public Helicoptere(String couleur,int nbOccupants,int rayonAction, String compagnie,boolean militaire){
		super(couleur, nbOccupants, rayonAction);
		this.compagnie=compagnie;
		this.militaire= militaire;
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
	public void setMilitaire(boolean militaire){
		this.militaire =militaire;
	}
}
