package ex3;

import ex3.animaux.AnimalCategorie;
import ex3.animaux.AnimalTypeRegime;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", AnimalCategorie.MAMMIFERE, AnimalTypeRegime.HERBIVORE, 8, 10);
		zoo.addAnimal("Zebre", AnimalCategorie.MAMMIFERE, AnimalTypeRegime.HERBIVORE, 12, 10);
		zoo.addAnimal("Lion", AnimalCategorie.MAMMIFERE, AnimalTypeRegime.CARNIVORE, 20, 10);
		zoo.addAnimal("Panthere", AnimalCategorie.MAMMIFERE, AnimalTypeRegime.CARNIVORE, 18, 10);
		zoo.addAnimal("Requin blanc", AnimalCategorie.POISSON, AnimalTypeRegime.CARNIVORE, 8, 10);
		zoo.addAnimal("Truite doree", AnimalCategorie.POISSON, AnimalTypeRegime.HERBIVORE, 8, 10);
		zoo.addAnimal("Boa constrictor", AnimalCategorie.REPTILE, AnimalTypeRegime.CARNIVORE, 8, 10);
		zoo.addAnimal("Python", AnimalCategorie.REPTILE, AnimalTypeRegime.CARNIVORE, 8, 10);
	}

}
