package com.skillstorm.telecom.beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Devices Entity
 * @author Matthew, Edrick, Hieu
 *
 */
@Entity
@Table(name = "DEVICES")
public class Device {

	//Primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deviceId;
	
	//Device name
	@Column(name = "device_name")
	private String deviceName;
	
	//Device Type
	@Column(name = "device_type")
	private String deviceType;
	
	//Plan id that the device belongs to
	@Column(name = "plan_id")
	private int planId;
	
	//Device phone number
	@Column(name = "device_number")
	private String deviceNumber;

	/**
	 * Constructor
	 * @param deviceId
	 * @param deviceName
	 * @param deviceType
	 * @param planId
	 * @param deviceNumber
	 */
	public Device(int deviceId, String deviceName, String deviceType, int planId, String deviceNumber ) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.planId = planId;
		this.deviceNumber = deviceNumber;
	}

	/**
	 * Constructor
	 * @param deviceName
	 * @param deviceType
	 * @param planId
	 * @param deviceNumber
	 */
	public Device(String deviceName, String deviceType, int planId, String deviceNumber) {
		super();
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.planId = planId;
		this.deviceNumber = deviceNumber;
	}

	/**
	 * Constructor
	 */
	public Device() {
		super();
	}

	/**
	 * Get device id
	 * @return
	 */
	public int getDeviceId() {
		return deviceId;
	}

	/**
	 * Set device id
	 * @param deviceId
	 */
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	
	/**
	 * Get device number
	 * @return
	 */
	public String getDeviceNumber() {
		return deviceNumber;
	}

	/**
	 * Set device number
	 * @param deviceNumber
	 */
	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	/**
	 * Get device name
	 * @return
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * Set device name
	 * @param deviceName
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * Get device type
	 * @return
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * Set device type
	 * @param deviceType
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
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
	 * Hashcode function
	 */
	@Override
	public int hashCode() {
		return Objects.hash(deviceId, deviceName, deviceType, planId);
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
		Device other = (Device) obj;
		return deviceId == other.deviceId && Objects.equals(deviceName, other.deviceName)
				&& Objects.equals(deviceType, other.deviceType) && planId == other.planId;
	}

	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Devices [deviceId=" + deviceId + ", deviceName=" + deviceName + ", deviceType=" + deviceType
				+ ", planId=" + planId + "]";
	}
	
}
