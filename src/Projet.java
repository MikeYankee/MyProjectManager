import java.util.ArrayList;
import java.util.TreeSet;
/**
 * @author Yann Bourguès

 * @version 1.0

 */
public class Projet {

	private int id;
	private String titre, description;
	private float noteFinale;
	private Langage langage;
	private TreeSet<Etudiant> lesEtudiants;
	
	//Constructeur de Projet
	public Projet(int unId, String unTitre, String uneDescription, Langage langage) {
		this.id = unId;
		this.titre = unTitre;
		this.description = uneDescription;
		this.langage = langage;
		this.lesEtudiants = new TreeSet<Etudiant>();
	}

	public int getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getNoteFinale() {
		return noteFinale;
	}

	public void setNoteFinale(float noteFinale) {
		this.noteFinale = noteFinale;
	}

	public TreeSet getLesEtudiants() {
		return lesEtudiants;
	}

	public Langage getLangage() {
		return langage;
	}

	public void setLangage(Langage langage) {
		this.langage = langage;
	}
	
	@Override
	public String toString() {
		return "\nProjet " + titre + " | Description : " + description + "\nLangage développement : "
				+ langage + "\n Groupe : " + lesEtudiants.toString();
	}
	
	

	
}
