package magacin;

import java.util.GregorianCalendar;

public class KucnaHemija extends Artikal{
	
	private GregorianCalendar rokTrajanja;

	public GregorianCalendar getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(GregorianCalendar rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return super.toString()+" KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}
	
	
}
