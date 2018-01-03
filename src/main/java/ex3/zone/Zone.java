package ex3.zone;

import java.util.List;

import ex3.animaux.Animal;

public class Zone {

	/** Liste des especes dans une zone */
	protected List<Animal> animaux;
	
	/** @param animal : nouvelle espece introduite dans la zone */
	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}
	
	/** donne la liste des especes presente dans la zone */
	public void afficherListeAnimaux(){
		for (Animal animal: this.animaux){
			System.out.println(animal.getNom());
		}
	}

	/** @return	 le nombre d'animaux present dans la zone*/
	public int compterAnimaux(){
		int nombre = 0;
		for (Animal animal : animaux) {
			nombre += animal.getNombre();
		}
		return nombre;
	}
	
	/** @return la quantite de nourriture, necessaire par jour, pour tous les animaux de la zone */
	public double calculerKgsNourritureParJour() {
		int kgs = 0;
		for (Animal animal : animaux) {
			kgs += animal.getNombre() * animal.getkgsNourritureJour();
		}
		return kgs;
	}
}
