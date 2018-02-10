package model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Loger
 *
 */
@Entity

public class Loger implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idLoger;
	private String ip;
	private String requette;
	private static final long serialVersionUID = 1L;

	public Loger() {
		super();
	}   
	public int getIdLoger() {
		return this.idLoger;
	}

	public void setIdLoger(int idLoger) {
		this.idLoger = idLoger;
	}   
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}   
	public String getRequette() {
		return this.requette;
	}

	public void setRequette(String requette) {
		this.requette = requette;
	}
   
}
