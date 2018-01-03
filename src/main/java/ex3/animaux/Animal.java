package ex3.animaux;

public class Animal {

	private String nom;
	private AnimalCategorie categorie;
	private AnimalTypeRegime typeRegime;
	private double kgsNourritureJour;
	private int nombre;

	/**
	 * @param nom :	nom de l'espece
	 * @param categorie : categorie d'animal a laquelle l'espece appartient
	 * @param typeRegime : type de regime de l'espece
	 * @param kgsNourritureJour : quantité de nourriture necessaire pour un animal par jour
	 * @param nombre : le nombre d'animaux de cette espece que l'on possede
	 */
	public Animal(String nom, AnimalCategorie categorie, AnimalTypeRegime typeRegime, double kgsNourritureJour, int nombre) {
		super();
		this.nom = nom;
		this.categorie = categorie;
		this.typeRegime = typeRegime;
		this.kgsNourritureJour = kgsNourritureJour;
		this.nombre = nombre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public AnimalCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(AnimalCategorie categorie) {
		this.categorie = categorie;
	}

	public AnimalTypeRegime getTypeRegime() {
		return typeRegime;
	}

	public void setTypeRegime(AnimalTypeRegime typeRegime) {
		this.typeRegime = typeRegime;
	}

	public double getkgsNourritureJour() {
		return kgsNourritureJour;
	}

	public void setkgsNourritureJour(double kgsNourritureJour) {
		this.kgsNourritureJour = kgsNourritureJour;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
}
