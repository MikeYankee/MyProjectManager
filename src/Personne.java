/**
 * Class Personne, 
 * Cette classe permet de g�n�raliser les informations primaires (nom, pr�nom, login) d'un �tudiant et d'un enseignant
 * @author Yann Bourgu�s
 * @version 1.0
 */

public abstract class Personne {

	private String nom, prenom, mail;

	 /**
     * Constructeur Personne.
     * @param unNom
     *            Le nom de la personne.
     * @param unPrenom
     *            Le pr�nom de la personne.
     *  @param unMail
     *            Le Mail de la personne.
     * @see Etudiant
     * @see Enseignant
     */
	public Personne(String unNom, String unPrenom, String unMail) {
		this.nom = unNom;
		this.prenom = unPrenom;
		this.mail = unMail;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getMail() {
		return mail;
	}

	@Override
	public String toString() {
		return nom + " " + prenom + " | mail : " + mail;
	}
}
