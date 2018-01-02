package ex1;

import java.util.Date;

/**
 * Classe pour les informations sur une entreprise
 * @author ETY1
 *	
 */
public class Entreprise {

	/**
	 * 
	 */
	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	/**
	 * Valeur maximum de capital possible que l'on peut renseigner
	 */
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * 
	 */
	public void afficherStatut(){
		
	}
	
}
