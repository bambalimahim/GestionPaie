package loger;

import javax.ejb.Local;

import model.Loger;

@Local
public interface LogerBeanLocal {

	public void addLoger(Loger loger);
	
}
