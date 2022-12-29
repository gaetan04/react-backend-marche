package tg.univ.kara.lpmmi.marches.modele;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Marche {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String emplacement;
	private String heure_ouverture;
	private String heure_fermeture;
	private String nbre_hangars;
	
	public Marche() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	public String getHeure_ouverture() {
		return heure_ouverture;
	}
	public void setHeure_ouverture(String heure_ouverture) {
		this.heure_ouverture = heure_ouverture;
	}
	public String getHeure_fermeture() {
		return heure_fermeture;
	}
	public void setHeure_fermeture(String heure_fermeture) {
		this.heure_fermeture = heure_fermeture;
	}
	public String getNbre_hangars() {
		return nbre_hangars;
	}
	public void setNbre_hangars(String nbre_hangars) {
		this.nbre_hangars = nbre_hangars;
	}
}
