package aatithya;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VehicleInformation")
public class VehicleInformation {

	 @Column(name="oem", nullable=false) 
		private String oem;
	 
		 @Id
		 @Column(name="vehicleModel") 
		private int vehicleModel;
		 
		 @Column(name="engineCapacity", nullable=false) 
		private String engineCapacity;
		 
		 @Column(name="vehicleColor", nullable=false) 
		private String vehicleColor;
		 
		 @Column(name="rating", nullable=false)  
		private String rating;

		public String getOem() {
			return oem;
		}

		public void setOem(String oem) {
			this.oem = oem;
		}

		public int getVehicleModel() {
			return vehicleModel;
		}

		public void setVehicleModel(int vehicleModel) {
			this.vehicleModel = vehicleModel;
		}

		public String getEngineCapacity() {
			return engineCapacity;
		}

		public void setEngineCapacity(String engineCapacity) {
			this.engineCapacity = engineCapacity;
		}

		public String getVehicleColor() {
			return vehicleColor;
		}

		public void setVehicleColor(String vehicleColor) {
			this.vehicleColor = vehicleColor;
		}

		public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}
		 
		 
		
		 
		 
}

