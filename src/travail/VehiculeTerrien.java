package travail;

public class VehiculeTerrien extends Vehicule {
	//propriétés
	
	//constructeurs vide et initialisé
	public VehiculeTerrien(){
		super();
	}
	public VehiculeTerrien(String couleur, int nbOccupants){
		super(couleur, nbOccupants);
	}
	
	//methodes
	public void avancer(){
		System.out.println("J’avance terrien");
	}
	public void seGarer(){
		System.out.println("Je me gare terrien");
	}
	
}
