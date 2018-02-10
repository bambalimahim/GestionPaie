package paiement;

import java.util.List;

import model.Paiement;

public interface IPaiement {
	
	public void addPaiement(Paiement paiement);
	public void deletePaiement(Paiement paiement);
	public void updatePaiement(Paiement paiement);
	public Paiement PaiementByID(Paiement paiement);
	public List<Paiement> listePaiement();

}
