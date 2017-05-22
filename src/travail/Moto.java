package travail;

public class Moto extends VehiculeTerrien {
//		propriétés
	private String marque;
	
//		constructeurs vide et initialisé
	public Moto(){
		super();
		marque ="";
	}
	public Moto(String couleur, int nbOccupants,String marque){
		super(couleur, nbOccupants);
		this.marque=marque;
	}
	
//	accesseur et mutateur
	public String getMarque(){
		return marque;
	}
	public void setMarque(String marque){
		this.marque = marque;
	}
//	méthodes
	public void avancer(){
		System.out.println("J'avance en Moto");
	}
	public void seGarer(){
		System.out.println("Je me gare en Moto");
	}
}
