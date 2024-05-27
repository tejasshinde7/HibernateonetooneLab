package com.example.Hibernateonetoone2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Adhaar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
private int srNo;
public Adhaar() {
	super();
	// TODO Auto-generated constructor stub
}

private int aid;
private String name;
@Override
public String toString() {
	return "Adhaar [srNo=" + srNo + ", aid=" + aid + ", name=" + name + ", person=" + person + "]";
}
public Adhaar(int srNo, int aid, String name, Person person) {
	super();
	this.srNo = srNo;
	this.aid = aid;
	this.name = name;
	this.person = person;
}
@OneToOne
@JoinColumn(name="person_id")
private Person person;
public int getSrNo() {
	return srNo;
}
public void setSrNo(int srNo) {
	this.srNo = srNo;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}

}
