import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
/**
 * @author Yann Bourguès

 * @version 1.0

 */
public class Promotion {
	
	private Etude etude;
	private String nom, annee;
	private TreeMap<String, Etudiant> lesEtudiants;
	
	public Promotion(String nom, Etude uneEtude, String uneAnnee) {
		this.nom = nom;
		this.etude = uneEtude;
		this.annee = uneAnnee;
		this.lesEtudiants = new TreeMap<String, Etudiant>();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Etude getEtude() {
		return getEtude();
	}

	public void setEtude(Etude etude) {
		this.etude = etude;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public TreeMap<String, Etudiant> getLesEtudiants() {
		return lesEtudiants;
	}
	
	public void ajouterEtudiant(Etudiant unEtudiant) {
		
			lesEtudiants.put(" ",unEtudiant);
	}

	/**
	 * Savoir si l'étudiant fait partie de la promotion.
	 * @param pEtudiant L'étudiant.
	 * @return 'true' s'il appartient à la promotion.
	 */
	public boolean isExist(Etudiant pEtudiant) {
		boolean retour = false;
		
		Etudiant etudiant;
		// Parcourir les étudiants
		for (int i = 0 ; ( (i < lesEtudiants.size()) && (!retour) ) ; i++) {
			// Obtenir l'étudiant courant de la promotion
			etudiant = lesEtudiants.get(i);
			if (etudiant.equals(pEtudiant)) {
				retour = true;
			}
		}
		
		return retour;
	}
	
	public Etudiant findEtudiant(Etudiant pEtudiant) {
		Etudiant retour = null;
		
		Etudiant etudiantCour;
		// Parcourir les étudiants
		for (int i = 0 ; ( (i < lesEtudiants.size()) && (retour == null) ) ; i++) {
			// Obtenir l'étudiant courant de la promotion
			etudiantCour = lesEtudiants.get(i);
			if (etudiantCour.equals(pEtudiant)) {
				retour = etudiantCour;
			}
		}
		
		return retour;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Promotion other = (Promotion) obj;
		if (annee == null) {
			if (other.annee != null)
				return false;
		} else if (!annee.equals(other.annee))
			return false;
		if (lesEtudiants == null) {
			if (other.lesEtudiants != null)
				return false;
		} else if (!lesEtudiants.equals(other.lesEtudiants))
			return false;
		if (etude != other.etude)
			return false;
		return true;
	}

	

}
