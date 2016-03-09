import java.util.ArrayList;
/**
 * @author Yann Bourgu�s

 * @version 1.0

 */
public class Projet {

	private String code, nom, enonce, dateDebut, dateFin;
	private ArrayList<Tache>lesTaches;
	private ArrayList<Etudiant>lesEtudiants;
	private Langage langage;

	public Projet(String code, String nom, String enonce, String dateDebut, String dateFin, Langage langage) {
		this.code = code;
		this.nom = nom;
		this.enonce = enonce;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.langage = langage;
		this.lesTaches = new ArrayList <Tache>();
		this.lesEtudiants = new ArrayList <Etudiant>();
	}
	
	public String getCode() {
		return code;
	}

	public String getNom() {
		return nom;
	}

	public String getEnonce() {
		return enonce;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public ArrayList<Tache> getLesTaches() {
		return lesTaches;
	}

	public ArrayList<Etudiant> getLesEtudiants() {
		return lesEtudiants;
	}

	public Langage getLangage() {
		return langage;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public void setLesTaches(ArrayList<Tache> lesTaches) {
		this.lesTaches = lesTaches;
	}

	public void setLesEtudiants(ArrayList<Etudiant> lesEtudiants) {
		this.lesEtudiants = lesEtudiants;
	}

	public void setLangage(Langage langage) {
		this.langage = langage;
	}
	
	public void ajouterEtudiant(Etudiant e){
		lesEtudiants.add(e);
	}

	public void ajouterTache(Tache t){
		lesTaches.add(t);
	}
	
	@Override
	public String toString() {
		return "\nProjet " + code + " | Nom : " + nom + " | Enonce : " + enonce + " | dateDebut --> " + dateDebut
				+ " | DateFin --> " + dateFin + "\nLes etudiants de ce projet : " + lesEtudiants + "\nLangage d�veloppement : "
				+ langage;
	}
	
	

	
}
