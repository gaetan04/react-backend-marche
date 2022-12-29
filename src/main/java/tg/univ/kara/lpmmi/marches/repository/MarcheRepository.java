package tg.univ.kara.lpmmi.marches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tg.univ.kara.lpmmi.marches.modele.Marche;


@Repository
public interface MarcheRepository extends JpaRepository<Marche, Long>{
	
}
