package ex2;

public enum TypeCompte {
	CC("Compte courant"), LA("Livret A");
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String libelle;
	
	private TypeCompte(String libelle) {
		this.libelle = libelle;	
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
