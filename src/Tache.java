public class Tache {

	private String nom, dateDebut, dateFin;
	private int num;

	public Tache(int num, String nom, String dateDebut, String dateFin) {
		this.num = num;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin  =dateFin;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "\nTache " + num + " | Nom : " + nom + " | Date début -->" + dateDebut + " | Date fin -->" + dateFin;
	}
	
	
	
	

}
