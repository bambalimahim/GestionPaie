package loger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Loger;

/**
 * Session Bean implementation class LogerBean
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class LogerBean implements LogerBeanLocal {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public void addLoger(Loger loger) {
		// TODO Auto-generated method stub
		manager.merge(loger);
	}

}
