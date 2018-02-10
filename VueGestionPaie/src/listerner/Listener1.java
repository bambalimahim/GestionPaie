package listerner;


import javax.ejb.EJB;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

import loger.LogerBeanLocal;
import model.Loger;
import employe.IEmploye;

/**
 * Application Lifecycle Listener implementation class Listener1
 *
 */
@WebListener
public class Listener1 implements ServletRequestListener {

	
	@EJB
	private LogerBeanLocal datasource;
	
    /**
     * Default constructor. 
     */
    public Listener1() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	try {
			HttpServletRequest request = (HttpServletRequest) arg0.getServletRequest();
			String requette = request.getScheme();
			String adresse = arg0.getServletRequest().getLocalAddr();
			Loger loger = new Loger();
			loger.setIp(adresse);
			loger.setRequette(requette);
			this.datasource.addLoger(loger);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}
