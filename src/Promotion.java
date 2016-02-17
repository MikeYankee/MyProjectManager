import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Promotion {
	
	private Etude etude;
	private String annee;
	public static int nbEtudiantMax = 24;
	private TreeMap<String, Etudiant> lesEtudiants;
	
	public Promotion(Etude uneEtude, String uneAnnee) {
		this.etude = uneEtude;
		this.annee = uneAnnee;
		this.lesEtudiants = new TreeMap<String, Etudiant>();
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

	public int getNbEtudiant() {
		return nbEtudiantMax;
	}

	public void setNbEtudiant(int nbEtudiant) {
		this.nbEtudiantMax = nbEtudiant;
	}

	public TreeMap<String, Etudiant> getLesEtudiants() {
		return lesEtudiants;
	}
	
	public void ajouterEtudiant(Etudiant unEtudiant) {
		
			lesEtudiants.put(" ",unEtudiant);

	}

	/**
	 * Savoir si l'�tudiant fait partie de la promotion.
	 * @param pEtudiant L'�tudiant.
	 * @return 'true' s'il appartient � la promotion.
	 */
	public boolean isExist(Etudiant pEtudiant) {
		boolean retour = false;
		
		Etudiant etudiant;
		// Parcourir les �tudiants
		for (int i = 0 ; ( (i < lesEtudiants.size()) && (!retour) ) ; i++) {
			// Obtenir l'�tudiant courant de la promotion
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
		// Parcourir les �tudiants
		for (int i = 0 ; ( (i < lesEtudiants.size()) && (retour == null) ) ; i++) {
			// Obtenir l'�tudiant courant de la promotion
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