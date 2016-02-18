import java.util.ArrayList;
import java.util.Collections;

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
	
	//Fonction qui trie la liste lesEtudiants par promotion
	public void trierEtudiantParPromotion(){	
		Collections.sort(lesPromotions, new ComparablePromotion());
	}

	

	

}
