package aatithya;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EnquiryDetails")
public class EnquiryDetails {

	     @Column(name="particulars", nullable=false) 
		private String particulars;
	     
		 @Id
		 @Column(name="bikeNo") 
		private int bikeNo;
		 
		 @Column(name="amount", nullable=false) 
		private double amount;
		 
		 @Column(name="gst", nullable=false) 
		private double gst;
		 
		 @Column(name="gstAmount", nullable=false)  
		private double gstAmount;
		 
		 @Column(name="totalAmount", nullable=false) 
		private double totalAmount	;

		public String getParticulars() {
			return particulars;
		}

		public void setParticulars(String particulars) {
			this.particulars = particulars;
		}

		public int getBikeNo() {
			return bikeNo;
		}

		public void setBikeNo(int bikeNo) {
			this.bikeNo = bikeNo;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public double getGst() {
			return gst;
		}

		public void setGst(double gst) {
			this.gst = gst;
		}

		public double getGstAmount() {
			return gstAmount;
		}

		public void setGstAmount(double gstAmount) {
			this.gstAmount = gstAmount;
		}

		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		 
		
		
		
		 
}

