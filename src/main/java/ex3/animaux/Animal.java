package ex3.animaux;

public class Animal {

	public String nom;
	public AnimalCategorie categorie;
	public AnimalTypeRegime typeRegime;
	public double kiloNourritureJour;
	public int nombre;

	/**
	 * @param nom :	nom de l'espece
	 * @param categorie : categorie d'animal a laquelle l'espece appartient
	 * @param typeRegime : type de regime de l'espece
	 * @param nombre : le nombre d'animaux de cette espece que l'on possede
	 */
	public Animal(String nom, AnimalCategorie categorie, AnimalTypeRegime typeRegime, double kiloNourritureJour, int nombre) {
		super();
		this.nom = nom;
		this.categorie = categorie;
		this.typeRegime = typeRegime;
		this.kiloNourritureJour = kiloNourritureJour;
		this.nombre = nombre;
	}
}
