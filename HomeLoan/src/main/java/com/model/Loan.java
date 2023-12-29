package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User_Document")
public class Loan {

	@Id
	@Column(name = "lid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String lname, lemail, laddress, lcontact;
	private String poidentity, poresidence, poincome, emp_proof, property_documents, bank_statment, dp_proof,
			guarantor_document, property_valuation_proof, property_insurance;

	/*
	 * @OneToMany private List<User> user;
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLemail() {
		return lemail;
	}

	public void setLemail(String lemail) {
		this.lemail = lemail;
	}

	public String getLaddress() {
		return laddress;
	}

	public void setLaddress(String laddress) {
		this.laddress = laddress;
	}

	public String getLcontact() {
		return lcontact;
	}

	public void setLcontact(String lcontact) {
		this.lcontact = lcontact;
	}

	public String getPoidentity() {
		return poidentity;
	}

	public void setPoidentity(String poidentity) {
		this.poidentity = poidentity;
	}

	public String getPoresidence() {
		return poresidence;
	}

	public void setPoresidence(String poresidence) {
		this.poresidence = poresidence;
	}

	public String getPoincome() {
		return poincome;
	}

	public void setPoincome(String poincome) {
		this.poincome = poincome;
	}

	public String getEmp_proof() {
		return emp_proof;
	}

	public void setEmp_proof(String emp_proof) {
		this.emp_proof = emp_proof;
	}

	public String getProperty_documents() {
		return property_documents;
	}

	public void setProperty_documents(String property_documents) {
		this.property_documents = property_documents;
	}

	public String getBank_statment() {
		return bank_statment;
	}

	public void setBank_statment(String bank_statment) {
		this.bank_statment = bank_statment;
	}

	public String getDp_proof() {
		return dp_proof;
	}

	public void setDp_proof(String dp_proof) {
		this.dp_proof = dp_proof;
	}

	public String getGuarantor_document() {
		return guarantor_document;
	}

	public void setGuarantor_document(String guarantor_document) {
		this.guarantor_document = guarantor_document;
	}

	public String getProperty_valuation_proof() {
		return property_valuation_proof;
	}

	public void setProperty_valuation_proof(String property_valuation_proof) {
		this.property_valuation_proof = property_valuation_proof;
	}

	public String getProperty_insurance() {
		return property_insurance;
	}

	public void setProperty_insurance(String property_insurance) {
		this.property_insurance = property_insurance;
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", lname=" + lname + ", lemail=" + lemail + ", laddress=" + laddress + ", lcontact="
				+ lcontact + ", poidentity=" + poidentity + ", poresidence=" + poresidence + ", poincome=" + poincome
				+ ", emp_proof=" + emp_proof + ", property_documents=" + property_documents + ", bank_statment="
				+ bank_statment + ", dp_proof=" + dp_proof + ", guarantor_document=" + guarantor_document
				+ ", property_valuation_proof=" + property_valuation_proof + ", property_insurance="
				+ property_insurance + "]";
	}

}
