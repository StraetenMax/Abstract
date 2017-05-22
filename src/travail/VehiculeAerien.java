package travail;

public class VehiculeAerien extends Vehicule {
	//propriétés
	protected int rayonAction;
	protected boolean longCourrier;
	
	//constructeur vide et initialisé
	public VehiculeAerien(){
		rayonAction = 0;
		this.setLongCourrier();
	}
	public VehiculeAerien(int rayonAction){
		this.rayonAction= rayonAction;
		this.setLongCourrier();
	}

	//accesseurs et mutateurs
	public int getRayonAction(){
		return rayonAction;
	}
	public boolean getLongCourrier(){
		return longCourrier;	
	}
	public void setRayonAction(int rayonAction){
		this.rayonAction= rayonAction;
	}
	public void setLongCourrier(){
		if(this.getRayonAction()>5){
			this.longCourrier= true;
		}else{
			this.longCourrier= false;
		}
	}
}
