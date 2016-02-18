import java.util.Comparator;

public class ComparablePromotion implements Comparator<Promotion>{

	public int compare(Promotion p1, Promotion  p2) {
		return p1.getEtude().compareTo(p2.getEtude());
	}
}
