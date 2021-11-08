package com.skillstorm.telecom.beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customer Entity
 * @author Matthew, Edrick, Hieu
 *
 */
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
	
	//Primary Key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	//Customer Name
	@Column(name = "customer_name")
	private String customerName;

	/**
	 * Constructor
	 * @param customerId
	 * @param customerName
	 */
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	/**
	 * Constructor
	 * @param customerName
	 */
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}

	/**
	 * Constructor
	 */
	public Customer() {
		super();
	}

	/**
	 * Get customer id
	 * @return
	 */
	public int getId() {
		return customerId;
	}
	
	/**
	 * Set customer id
	 * @param customerId
	 */
	public void setId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * Get customer name
	 * @return
	 */
	public String getCustomerName() {
		return customerName;
	}
	
	/**
	 * Set customer name
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * Hash code function
	 */
	@Override
	public int hashCode() {
		return Objects.hash(customerName, customerId);
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
		Customer other = (Customer) obj;
		return customerName == other.customerName && customerId == other.customerId;
	}

	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
}
