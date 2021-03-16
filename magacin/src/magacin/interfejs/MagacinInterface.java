package magacin.interfejs;

import magacin.Artikal;

public interface MagacinInterface {
	
	public void dodajArtikal(Artikal artikal);
	
	public void izbaciArtikal(Artikal artikal);
	
	public String vratiInformacije(int sifraArtikla);

}
