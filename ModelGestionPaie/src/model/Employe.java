package model;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employe
 *
 */

@Entity
@NamedQueries({
	@NamedQuery(name="Employe.findAll", query="SELECT e FROM Employe e"),
	@NamedQuery(name="Employe.findByID", query="SELECT e FROM Employe e where e.idEmploye = :idEmploye")
})
public class Employe implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEmploye;
	private String nom;
	private String prenom;
	private String genre;
	@Column(unique=true)
	private String telephone;
	private String adresse;
	private int salaire;
	private String poste;
	private Date dateEmbauche;
	private static final long serialVersionUID = 1L;

	public Employe() {
		super();
	}   
	public int getIdEmploye() {
		return this.idEmploye;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public int getSalaire() {
		return this.salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}   
	public String getPoste() {
		return this.poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}   
	public Date getDateEmbauche() {
		return this.dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.idEmploye);
	}
}
