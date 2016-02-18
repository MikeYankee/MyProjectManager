public class Tache {

	private String num, nom, dateDebut, dateFin;

	public Tache(String num, String nom, String dateDebut, String dateFin) {
		this.num = num;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin  =dateFin;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
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
		return "\nTache : " + num + "\nNom : " + nom + "\nDate début -->" + dateDebut + "|Date fin -->" + dateFin;
	}
	
	
	
	

}
