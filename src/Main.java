/**
 * Main
 * 
 * @author Yann Bourguès
 * @version 1.0
 */

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enseignant Benzacki = new Enseignant("Madame","Benzacki", "MbEN", "123");
		
		Etudiant yann = new Etudiant("Bourgues", "Yann", "yan", "jk");
		Etudiant Melanie = new Etudiant("Galvante", "Melanie", "twybow", "rinkhockeythebest");
		
		Projet map = new Projet("01","Site web", "Faire un site web en Java (JavaIE)", "10/02/2016", "10/03/2016", Langage.JavaIE);
		
		Tache uml = new Tache(01, "Faire uml","10/02/2016","11/02/2016");
		Tache test = new Tache(01, "Faire test","10/05/2016","11/06/2016");
		
		Benzacki.ajouterProjet(map);
		Benzacki.ajouterEtudiantProjet(yann, map);
		yann.ajouterTache(uml, map);
		Benzacki.ajouterEtudiantProjet(Melanie, map);
		Melanie.ajouterTache(test, map);
		
		Benzacki.toString();

	}

}
