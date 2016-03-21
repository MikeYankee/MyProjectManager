import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
/**
 * Class Enseignant, 
 * 
 * @author Yann Bourguès
 * @version 1.0
 */
public class Enseignant extends Personne {
	
	public Enseignant(String unNom, String unPrenom, String unMail) {
		super(unNom, unPrenom, unMail);
	}

	@Override
	public String toString() {
		System.out.println("Enseignant : " + super.toString());
		return "Enseignant : " + super.toString();
	}
	
	
	
	
}
