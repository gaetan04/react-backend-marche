package tg.univ.kara.lpmmi.marches.service;
import java.util.List;

import tg.univ.kara.lpmmi.marches.modele.Marche;
public interface MarcheService {
	
	List<Marche> getMarches();
	Marche getMarcheById(Long id);
	Marche saveMarche(Marche marche);
    void deleteMarcheById(Long id);
	Marche updateMarche(Marche marche , Long id);

}
