package de.as79dev.babyappaws.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Baby {

	 @Id 
	 @GeneratedValue(strategy=GenerationType.AUTO) 
	 private Long babyid; 
	 private String vorname; 
	 private String nachname; 
	 private Date birthdate;
	 
	public Long getBabyid() {
		return babyid;
	}
	public void setBabyid(Long babyid) {
		this.babyid = babyid;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	} 
	 
	 
}
