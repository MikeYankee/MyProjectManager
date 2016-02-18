import java.util.ArrayList;

public class Etudiant extends Personne implements Comparable<Etudiant> {

	private ArrayList<Tache>lesTaches;
	
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
		
		this.lesTaches.add(new Tache(this.getNom()+nom, nom, dateDebut, dateFin));
		
	}

	@Override
	public String toString() {
		return "Etudiant lesTaches : " + lesTaches;
	}

	
	
	
	

	

}
