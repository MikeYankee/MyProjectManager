/**
 * Class Personne, 
 * Cette classe permet de généraliser les informations primaires (nom, prénom, login, password) d'un étudiant et d'un enseignant
 * @author Yann Bourguès
 * @version 1.0
 */

public abstract class Personne {

	private String nom, prenom, login, password;

	 /**
     * Constructeur Personne.
     * @param unNom
     *            Le nom de la personne.
     * @param unPrenom
     *            Le prénom de la personne.
     *  @param unLogin
     *            Le login de la personne.
     * @param unPassword
     *            Le mot de passe de la personne.
     * @see Etudiant
     * @see Enseignant
     */
	public Personne(String unNom, String unPrenom, String unLogin, String unPassword) {
		this.nom = unNom;
		this.prenom = unPrenom;
		this.login = unLogin;
		this.password = unPassword;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return nom + " " + prenom + " | login : " + login + " | password : " + password;
	}
	
	
	
	
	
	

}
