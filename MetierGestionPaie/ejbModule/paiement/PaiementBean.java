package paiement;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Paiement;

/**
 * Session Bean implementation class Paiementean
 */
@Stateless
public class PaiementBean implements IPaiementLocal, IPaiementRemote{

	@PersistenceContext
	EntityManager manager;

	@Override
	public void addPaiement(Paiement paiement) {
		// TODO Auto-generated method stub
		manager.merge(paiement);
	}

	@Override
	public void deletePaiement(Paiement paiement) {
		// TODO Auto-generated method stub
		manager.remove(manager.contains(paiement) ? paiement : manager.merge(paiement));
	}

	@Override
	public void updatePaiement(Paiement paiement) {
		// TODO Auto-generated method stub
		manager.merge(paiement);
	}

	@Override
	public Paiement PaiementByID(Paiement paiement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paiement> listePaiement() {
		// TODO Auto-generated method stub
		List<Paiement> paiements = manager.createNamedQuery("Paiement.findAll").getResultList();
		return paiements;
	}

}
