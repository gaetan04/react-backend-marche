package tg.univ.kara.lpmmi.marches.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tg.univ.kara.lpmmi.marches.modele.Marche;
import tg.univ.kara.lpmmi.marches.repository.MarcheRepository;
@Component
public class MarcheServiceImpl implements MarcheService{

	@Autowired
	MarcheRepository marcheRepository;
	
	public List<Marche> getMarches() {
		return marcheRepository.findAll();
		
	}

	@Override
	public Marche getMarcheById(Long id) {
		return marcheRepository.findById(id).get();
	}

	@Override
	public Marche saveMarche(Marche marche) {
		return marcheRepository.save(marche);
	}

	@Override
	public void deleteMarcheById(Long id) {
		marcheRepository.deleteById(id);
		
	}

	@Override
	public Marche updateMarche(Marche marche, Long id){
        Marche march = marcheRepository.findById(id).get();
        if (Objects.nonNull(marche.getNom())
                && !"".equalsIgnoreCase(
                    marche.getNom())) {
                march.setNom(
                    marche.getNom());
            }
     
            if (Objects.nonNull(
                    marche.getEmplacement())
                && !"".equalsIgnoreCase(
                    marche.getEmplacement())) {
                march.setEmplacement(
                    marche.getEmplacement());
            }
     
            if (Objects.nonNull(marche.getHeure_ouverture())
                && !"".equalsIgnoreCase(
                    marche.getHeure_ouverture())) {
                march.setHeure_ouverture(
                    marche.getHeure_ouverture());
            }
            
            if (Objects.nonNull(marche.getHeure_fermeture())
                    && !"".equalsIgnoreCase(
                        marche.getHeure_fermeture())) {
                    march.setHeure_fermeture(
                        marche.getHeure_fermeture());
                }
            
            if (Objects.nonNull(marche.getNbre_hangars())
                    && !"".equalsIgnoreCase(
                        marche.getNbre_hangars())) {
                    march.setNbre_hangars(
                        marche.getNbre_hangars());
                }
            
        return marcheRepository.save(march);
	}
	 
}
