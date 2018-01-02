package ex3.zone;

import java.util.List;

import ex3.animaux.Animal;

abstract public class Zone {

	/** Liste des especes dans une zone */
	protected List<Animal> animaux;
	
	/**
	 * @param animal : nouvelle espece introduite dans la zone
	 */
	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: this.animaux){
			System.out.println(animal.nom);
		}
	}

	public int compterAnimaux(){
		return noms.size();
	}
	
	abstract public double calculerKgsNourritureParJour();
}
