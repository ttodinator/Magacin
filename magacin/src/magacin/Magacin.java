package magacin;

import java.util.LinkedList;
import java.util.List;

import magacin.interfejs.MagacinInterface;

public class Magacin implements MagacinInterface{

	List<Artikal> listaArtikala=new LinkedList<Artikal>();
	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikal==null) {
			throw new RuntimeException("Artikal ne sme da bude null");
		}
		listaArtikala.add(artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if(artikal==null) {
			throw new RuntimeException("Artikal ne sme da bude null");
		}
		listaArtikala.remove(artikal);
	}

	@Override
	public void vratiInformacije(int sifraArtikla) {
		for (int i = 0; i < listaArtikala.size(); i++) {
			if(listaArtikala.get(i).getSifra() ==sifraArtikla) {
				listaArtikala.get(i).toString();
			}
		}
	}

}
