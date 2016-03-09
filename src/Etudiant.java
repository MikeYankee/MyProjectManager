import java.util.ArrayList;
/**
 * Class Etudiant, 
 * 
 * @author Yann Bourguès
 * @version 1.0
 */

public class Etudiant extends Personne implements Comparable<Etudiant> {
	 
	/**
     * La liste des taches attaché à un étudiant
     * 
     * @see Tache
     */
	private ArrayList<Tache>lesTaches;
	private int countNum = 0;
	
	public Etudiant(String unNom, String unPrenom, String unLogin, String unPassword) {
		super(unNom, unPrenom, unLogin, unPassword);
		this.lesTaches = new ArrayList<Tache>();
	}
	
	public ArrayList<Tache> getLesTaches() {
		return lesTaches;
	}

	public void setLesTaches(ArrayList<Tache> lesTaches) {
		this.lesTaches = lesTaches;
	}
	
	@Override
	public int compareTo(Etudiant e1) {
		// TODO Auto-generated method stub
		return this.getNom().compareTo(e1.getNom());
	}
	
	public void ajouterTache(String nom, String dateDebut, String dateFin){
		
		this.lesTaches.add(new Tache(countNum, nom, dateDebut, dateFin));
		countNum++;
		
	}
	
	public void ajouterTache(Tache t, Projet p){
		
		this.lesTaches.add(t);
		p.ajouterTache(t);
		
	}

	@Override
	public String toString() {
		return "\nEtudiant : " + super.toString() + "\nles Taches : " + lesTaches;
	}

	
	
	
	

	

}
