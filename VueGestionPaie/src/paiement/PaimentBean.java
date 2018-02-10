package paiement;

import java.math.BigInteger;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import model.Employe;
import model.Paiement;

@ManagedBean
@SessionScoped
public class PaimentBean {

	List<Paiement> paiements;
	Paiement paiement = new Paiement();
	@EJB
	private IPaiementLocal paiementBean;
	
	public PaimentBean(){}
	
	public String listePaiement(){
		this.paiements = paiementBean.listePaiement();
		return "/paiement/index1";
	}
	
	public String savePaiement(){
		this.paiementBean.addPaiement(paiement);
		this.paiement = new Paiement();
		return this.listePaiement();
	}
	
	public String deletePaiement(){
		this.paiementBean.deletePaiement(paiement);
		this.paiement = new Paiement();
		return this.listePaiement();
	}
	
	public String updatePaiement(){
		this.paiementBean.updatePaiement(paiement);
		this.paiement = new Paiement();
		return this.listePaiement();
	}

	public List<Paiement> getPaiements() {
		return paiements;
	}

	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
	}

	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	public IPaiementLocal getPaiementBean() {
		return paiementBean;
	}

	public void setPaiementBean(IPaiementLocal paiementBean) {
		this.paiementBean = paiementBean;
	}	
	
	
}
