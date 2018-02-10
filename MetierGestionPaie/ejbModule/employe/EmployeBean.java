package employe;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Employe;

/**
 * Session Bean implementation class EmployeBean
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EmployeBean implements IEmployeLocal{

	@PersistenceContext
	private EntityManager manager;

	public EntityManager getManager() {
		return manager;
		}
	
	@Override
	public void addEmploye(Employe employe) throws SQLException{
		// TODO Auto-generated method stub
		manager.merge(employe);
	}

	@Override
	public void deleteEmploye(Employe employe) {
		// TODO Auto-generated method stub
		manager.remove(manager.contains(employe) ? employe : manager.merge(employe));
	}

	@Override
	public void updateEmploye(Employe employe) {
		// TODO Auto-generated method stub
		manager.merge(employe);
	}

	@Override
	public Employe EmployeByID(Employe employe) {
		Employe em = (Employe) manager.createNamedQuery("Employe.findByID")
				.setParameter("idEmploye", employe.getIdEmploye()).getSingleResult();	
		return em;
	}

	@Override
	public List<Employe> listeEmploye() {
		List<Employe> employes =  manager.createNamedQuery("Employe.findAll").getResultList();
		return employes;
	}

}
