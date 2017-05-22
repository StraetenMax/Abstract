package travail;

public class Auto extends VehiculeTerrien {
	//propriétés
	private int nbPorte;
	
	//constructeurs vide et initialisé
	public Auto(){
		super();
		nbPorte = 0;
	}
	public Auto(String couleur, int nbOccupants, int nbPorte){
		super(couleur, nbOccupants);
		this.nbPorte = nbPorte;
	}
	
	//accesseur et mutateur
	public int getNbPorte(){
		return nbPorte;
	}
	public void setNbPorte(int nbPorte){
		this.nbPorte= nbPorte;
	}
	
	//méthodes
	public void avancer(){
		System.out.println("J'avance en Auto");
	}
	public void seGarer(){
		System.out.println("Je me gare en Auto");
	}

}
