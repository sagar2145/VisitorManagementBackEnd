package aatithya;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EnquiryInformation")
public class EnquiryInformation {

	 @Column(name="customerName",nullable=false) 
	private String customerName;
	 
	 @Id
	 @Column(name="phoneNo") 
	private String phoneNo;
	 
	 @Column(name="salesman",nullable=false) 
	private String salesman;
	 
	 @Column(name="branch", nullable=false) 
	private String branch;
	 
	 @Column(name="sourceEnquiry", nullable=false)  
	private String sourceEnquiry;
	 
	 @Column(name="enquiryType", nullable=false) 
	private String enquiryType;
	 
	 @Column(name="aadharCard", nullable=false) 
	private String aadharCard;
	 
	 @Column(name="panCard", nullable=false) 
	private String panCard;
	 
	 @Column(name="address", nullable=false) 
	private String address;
	 
	 @Column(name="email", nullable=false) 
	private String email;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSalesman() {
		return salesman;
	}

	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSourceEnquiry() {
		return sourceEnquiry;
	}

	public void setSourceEnquiry(String sourceEnquiry) {
		this.sourceEnquiry = sourceEnquiry;
	}

	public String getEnquiryType() {
		return enquiryType;
	}

	public void setEnquiryType(String enquiryType) {
		this.enquiryType = enquiryType;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
	
	 
}

