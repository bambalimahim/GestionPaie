package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import model.Employe;

/**
 * Entity implementation class for Entity: Paiement
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Paiement.findAll", query="SELECT p FROM Paiement p"),
})
public class Paiement implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPaiement;
	private int montant;
	private Date datePaiement;
	@ManyToOne
	@JoinColumn(name="idEmploye")
	private Employe employe;
	private static final long serialVersionUID = 1L;

	public Paiement() {
		super();
	}   
	public int getIdPaiement() {
		return this.idPaiement;
	}

	public void setIdPaiement(int idPaiement) {
		this.idPaiement = idPaiement;
	}   
	public int getMontant() {
		return this.montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}   
	public Date getDatePaiement() {
		return this.datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}   
	public Employe getEmploye() {
		return this.employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
   
}
