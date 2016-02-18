import java.util.ArrayList;

public class Projet {

	private String code, nom, enonce, dateDebut, dateFin;
	private ArrayList<Tache>lesTaches;

	public Projet(String code, String nom, String enonce, String dateDebut, String dateFin) {
		this.code = code;
		this.nom = nom;
		this.enonce = enonce;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.lesTaches = new ArrayList <Tache>();
	}

	
}
