package application;

import travail.Auto;
import travail.Avion;
import travail.Helicoptere;
import travail.Moto;
import travail.VehiculeAerien;
import travail.VehiculeTerrien;

public class Test {

	public static void main(String[] args) {
		//instanciers les classes
		VehiculeAerien Va1 = new VehiculeAerien("Rouge",200,10);
		VehiculeTerrien Vt2 = new VehiculeTerrien("Bleu",4);
		Auto A1 = new Auto("Verte",2,2);
		Moto M1 = new Moto("Noire",1,"Norton");
		Helicoptere H1 = new Helicoptere("Orange",6,250,"Sécurité Maritime",false);
		Avion Av1 = new Avion("Bleu",2,500,"Spitfire",true);
	
		//appeler les méthodes
		Va1.avancer();
		Va1.seGarer();
		Vt2.avancer();
		Vt2.seGarer();
		A1.avancer();
		A1.seGarer();
		M1.avancer();
		M1.seGarer();
		H1.avancer();
		H1.seGarer();
		Av1.avancer();
		Av1.seGarer();
		
		
	}



}
