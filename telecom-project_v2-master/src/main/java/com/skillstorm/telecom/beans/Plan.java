package com.skillstorm.telecom.beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Plans entity
 * @author Matthew, Edrick, Hieu
 *
 */
@Entity
@Table(name = "PLANS")
public class Plan {

	//Primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planId;
	
	//Plan name
	@Column(name = "plan_name")
	private String planName;
	
	//Plan price
	@Column(name = "plan_price")
	private double planPrice;
	
	//Plan number of lines
	@Column(name = "plan_numlines")
	private int planNumLines;
	
	//Customer id 
	@Column(name = "customer_id")
	private int customerId;

	/**
	 * Constructor
	 * @param planId
	 * @param planName
	 * @param planPrice
	 * @param planNumLines
	 * @param customerId
	 */
	public Plan(int planId, String planName, double planPrice, int planNumLines, int customerId) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planPrice = planPrice;
		this.planNumLines = planNumLines;
		this.customerId = customerId;
	}

	/**
	 * Constructor
	 * @param planName
	 * @param planPrice
	 * @param planNumLines
	 * @param customerId
	 */
	public Plan(String planName, double planPrice, int planNumLines, int customerId) {
		super();
		this.planName = planName;
		this.planPrice = planPrice;
		this.planNumLines = planNumLines;
		this.customerId = customerId;
	}
	
	/**
	 * Constructor
	 */
	public Plan() {
		super();
	}

	/**
	 * Get plan id
	 * @return
	 */
	public int getPlanId() {
		return planId;
	}

	/**
	 * Set plan id
	 * @param planId
	 */
	public void setPlanId(int planId) {
		this.planId = planId;
	}

	/**
	 * Get plan name
	 * @return
	 */
	public String getPlanName() {
		return planName;
	}

	/**
	 * Set plan name
	 * @param planName
	 */
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	/**
	 * Get plan price
	 * @return
	 */
	public double getPlanPrice() {
		return planPrice;
	}

	/**
	 * Set plan price
	 * @param planPrice
	 */
	public void setPlanPrice(double planPrice) {
		this.planPrice = planPrice;
	}

	/**
	 * Get plan number of lines
	 * @return
	 */
	public int getPlanNumLines() {
		return planNumLines;
	}

	/**
	 * Set plan number of lines
	 * @param planNumLines
	 */
	public void setPlanNumLines(int planNumLines) {
		this.planNumLines = planNumLines;
	}
	
	/**
	 * Get customer id
	 * @return
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * Set customer id
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * Hashcode function
	 */
	@Override
	public int hashCode() {
		return Objects.hash(customerId, planId, planName, planNumLines, planPrice);
	}

	/**
	 * Equals function
	 */
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

	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", planPrice=" + planPrice + ", planNumLines="
				+ planNumLines + ", customerId=" + customerId + "]";
	}
	
}
