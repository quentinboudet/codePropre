package ex2;

public class CompteCourant extends CompteBancaire {

	/**
	 * decouvert : somme du decouvert autorise (un decouvert est autorise seulement
	 * pour les comptes courants)
	 */
	private double decouvert;

	public CompteCourant(TypeCompte type, double solde, double decouvert) {
		super(type, solde);
		this.decouvert = decouvert;
	}

	/* (non-Javadoc)
	 * @see ex2.CompteBancaire#debiterMontant(double)
	 * empeche de debiter une somme qui depasserait du decouvert autorisé
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > decouvert) {
			super.debiterMontant(montant);
		}
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert
	 *            the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
