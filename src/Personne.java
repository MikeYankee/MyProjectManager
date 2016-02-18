
public abstract class Personne {

	private String nom, prenom, login, password;

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
		return "\nPersonne : " + nom + " " + prenom + "\nlogin : " + login + "\npassword : " + password;
	}
	
	
	
	
	
	

}
