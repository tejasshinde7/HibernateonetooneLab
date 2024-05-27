package com.example.Hibernateonetoone2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
private String pname;
private String cont;
private String email;
@OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
private Adhaar adhaar;
public int getPid() {
	return pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getCont() {
	return cont;
}

public void setCont(String cont) {
	this.cont = cont;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Adhaar getAdhaar() {
	return adhaar;
}

public void setAdhaar(Adhaar adhaar) {
	this.adhaar = adhaar;
}

public void setPid(int pid) {
	this.pid = pid;
}

public Person(int pid, String pname, String cont, String email) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.cont = cont;
	this.email = email;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", pname=" + pname + ", cont=" + cont + ", email=" + email + "]";
}

}
