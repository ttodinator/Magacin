package magacin;

import java.util.GregorianCalendar;

public class KucnaHemija extends Artikal{
	
	private GregorianCalendar rokTrajanja;

	public GregorianCalendar getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(GregorianCalendar rokTrajanja) {
		if(rokTrajanja==null) {
			throw new RuntimeException("Datum ne sme da bude null");
		}
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return super.toString()+" KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}
	
	
}
