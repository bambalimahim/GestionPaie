package employe;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import model.Employe;


@ManagedBean
@SessionScoped
public class EmployeBean {
	
	List<Employe> employes ;
	Employe employe = new Employe();
	
	@EJB
	private IEmployeLocal employeBean;
	
	public EmployeBean(){}
	
	public String listeEmploye(){
		this.employes = employeBean.listeEmploye();
		return "/employe/index1";
	}
	
	public String saveEmploye(){
		String retour = "/employe/index";
		try {
			this.employeBean.addEmploye(employe);
			this.employe = new Employe();
			retour = "/employe/index1";
		} catch (SQLException e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Erreur", "Numero est unique");
	        FacesContext.getCurrentInstance().addMessage(null, message);;
		}
		return retour;
	}
	
	public String deleteEmploye(){
		this.employeBean.deleteEmploye(employe);
		this.employe = new Employe();
		return this.listeEmploye();
	}
	
	public String updateEmploye(){
		this.employeBean.updateEmploye(employe);
		this.employe = new Employe();
		return this.listeEmploye();
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public IEmployeLocal getEmployeBean() {
		return employeBean;
	}

	public void setEmployeBean(IEmployeLocal employeBean) {
		this.employeBean = employeBean;
	}
	
	
}
