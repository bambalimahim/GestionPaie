package employe;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Local;

import model.Employe;

@Local
public interface IEmployeLocal {

	public void addEmploye(Employe employe) throws SQLException;
	public void deleteEmploye(Employe employe);
	public void updateEmploye(Employe employe);
	public Employe EmployeByID(Employe employe);
	public List<Employe> listeEmploye();
}
