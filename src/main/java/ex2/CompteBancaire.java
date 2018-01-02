package ex2;

/**
 * Represente un compte bancaire de type compte courant (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected TypeCompte type;

	/** solde : solde du compte */
	private double solde;

	/**
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(TypeCompte type, double solde) {
		this.type = type;
		this.solde = solde;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * debite un montant au solde
	 * 
	 * @param montant
	 */
	protected void debiterMontant(double montant) {
		this.solde -= montant;
	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde
	 *            the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public TypeCompte getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(TypeCompte type) {
		this.type = type;
	}
}
