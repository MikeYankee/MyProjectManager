import java.util.ArrayList;
/**
 * Class Etudiant, 
 * 
 * @author Yann Bourguès
 * @version 1.0
 */

public class Etudiant extends Personne implements Comparable<Etudiant>{
	 
	private Promotion promotion;
	private int id;
	
	public Etudiant(int unId, String unNom, String unPrenom, String unMail, Promotion laPromotion) {
		super(unNom, unPrenom, unMail);
		this.id = unId;
		this.promotion = laPromotion;
	}
	
	public Promotion getPromotion() {
		return promotion;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "\nEtudiant : " + super.toString() + "| Promotion : " + promotion;
	}

	@Override
	public int compareTo(Etudiant e) {

		return ((this.getNom() + " " + this.getPrenom()).compareTo(e.getNom()+ " "+e.getPrenom()) );
	}
}
