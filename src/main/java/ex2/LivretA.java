package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de remuneration dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(TypeCompte type, double solde, double tauxRemuneration) {
		super(type, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/* (non-Javadoc)
	 * @see ex2.CompteBancaire#debiterMontant(double)
	 * empeche de debiter une somme plus importante que le solde
	 */
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > 0) {
			super.debiterMontant(montant);
		}
	}

	/** Ajoute au compte sa rémunération annuelle */
	public void appliquerRemuAnnuelle() {
		this.ajouterMontant(getSolde() * tauxRemuneration / 100);
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
