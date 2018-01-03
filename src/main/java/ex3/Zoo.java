package ex3;

import ex3.animaux.Animal;
import ex3.animaux.AnimalCategorie;
import ex3.animaux.AnimalTypeRegime;
import ex3.zone.Zone;

public class Zoo {
	
	private String nom;
	private Zone savaneAfricaine;
	private Zone zoneCarnivore;
	private Zone fermeReptile;
	private Zone aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/**
	 * @param nomAnimal	: nom de la nouvelle espece
	 * @param categorie : categorie de l'espece
	 * @param typeRegime : le regime alimentaire de l'animal
	 * @param kgsNourritureJour : la quantitité de nourriture par jour de l'animal
	 * @param nombre : le nombre d'animaux de cette espece dans le zoo
	 */
	public void addAnimal(String nomAnimal, AnimalCategorie categorie, AnimalTypeRegime typeRegime, double kgsNourritureJour, int nombre){
		if (categorie.equals(AnimalCategorie.MAMMIFERE) && typeRegime.equals(AnimalTypeRegime.CARNIVORE)){
			zoneCarnivore.addAnimal(new Animal(nomAnimal, categorie, typeRegime, kgsNourritureJour, nombre));
		}
		else if (categorie.equals(AnimalCategorie.MAMMIFERE) && typeRegime.equals(AnimalTypeRegime.HERBIVORE)){
			savaneAfricaine.addAnimal(new Animal(nomAnimal, categorie, typeRegime, kgsNourritureJour, nombre));
		}
		else if (categorie.equals(AnimalCategorie.REPTILE)){
			fermeReptile.addAnimal(new Animal(nomAnimal, categorie, typeRegime, kgsNourritureJour, nombre));
		}
		else if (categorie.equals(AnimalCategorie.POISSON)){
			aquarium.addAnimal(new Animal(nomAnimal, categorie, typeRegime, kgsNourritureJour, nombre));
		}
	}
	
	/** affiche toutes les especes presente dans le zoo */
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** 
	 * @return nom du zoo
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom : nouveau nom du zoo
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
