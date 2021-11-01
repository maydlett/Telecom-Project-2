package com.skillstorm.telecom.beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLANS")
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planId;
	
	@Column(name = "plan_name")
	private String planName;
	
	@Column(name = "plan_price")
	private double planPrice;
	
	@Column(name = "plan_numlines")
	private int planNumLines;
	
	@Column(name = "customer_id")
	private int customerId;

	public Plan(int planId, String planName, double planPrice, int planNumLines, int customerId) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planPrice = planPrice;
		this.planNumLines = planNumLines;
		this.customerId = customerId;
	}

	public Plan(String planName, double planPrice, int planNumLines, int customerId) {
		super();
		this.planName = planName;
		this.planPrice = planPrice;
		this.planNumLines = planNumLines;
		this.customerId = customerId;
	}
	

	public Plan() {
		super();
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(double planPrice) {
		this.planPrice = planPrice;
	}

	public int getPlanNumLines() {
		return planNumLines;
	}

	public void setPlanNumLines(int planNumLines) {
		this.planNumLines = planNumLines;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, planId, planName, planNumLines, planPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plan other = (Plan) obj;
		return customerId == other.customerId && planId == other.planId && Objects.equals(planName, other.planName)
				&& planNumLines == other.planNumLines
				&& Double.doubleToLongBits(planPrice) == Double.doubleToLongBits(other.planPrice);
	}

	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", planPrice=" + planPrice + ", planNumLines="
				+ planNumLines + ", customerId=" + customerId + "]";
	}
	
}
