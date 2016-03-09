import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
/**
 * Class Enseignant, 
 * 
 * @author Yann Bourguès
 * @version 1.0
 */

public class Enseignant extends Personne {

	private ArrayList<Projet>lesProjets;
	private ArrayList<Etudiant>lesEtudiants;
	private ArrayList<Promotion>lesPromotions;
	
	public Enseignant(String unNom, String unPrenom, String unLogin, String unPassword) {
		super(unNom, unPrenom, unLogin, unPassword);
		this.lesProjets = new ArrayList<Projet>();
		this.lesEtudiants = new ArrayList<Etudiant>();
	}
	
	public void creerProjet(String nom, String enonce, String dateDebut, String dateFin, Langage langage){
		
		this.lesProjets.add(new Projet(nom.substring(5)+langage, nom, enonce, dateDebut, dateFin, langage));
		
	}

	   /**

     * Ajoute un projet créée par l'enseignant.
     * 
     * @param p
     *            Un objet Projet créée par l'enseignant
     * 
     * @see Yann Bourguès
     */
	public void ajouterProjet(Projet p){
		
		this.lesProjets.add(p);
		
	}
	
	public void ajouterEtudiantProjet(Etudiant e, Projet p){
		
		p.ajouterEtudiant(e);
		
	}
	
	//Fonction qui trie la liste lesEtudiants par promotion
	public void trierEtudiantParPromotion(){	
		Collections.sort(lesPromotions, new ComparablePromotion());
	}

	public ArrayList<Projet> getLesProjets() {
		return lesProjets;
	}

	public ArrayList<Etudiant> getLesEtudiants() {
		return lesEtudiants;
	}

	public ArrayList<Promotion> getLesPromotions() {
		return lesPromotions;
	}

	@Override
	public String toString() {
		System.out.println("Enseignant : " + super.toString() + "\nSes projets : " + lesProjets);
		return "Enseignant : " + super.toString() + "\nSes projets : " + lesProjets;
	}
	
	
}
