package travail;

abstract class Vehicule {
	//propriétés
	protected String couleur;
	protected int nbOccupants;
	
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
