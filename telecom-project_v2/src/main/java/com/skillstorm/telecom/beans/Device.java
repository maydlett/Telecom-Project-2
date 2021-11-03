package com.skillstorm.telecom.beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEVICES")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deviceId;
	
	@Column(name = "device_name")
	private String deviceName;
	
	@Column(name = "device_type")
	private String deviceType;
	
	@Column(name = "plan_id")
	private int planId;
	
	@Column(name = "device_number")
	private String deviceNumber;

	public Device(int deviceId, String deviceName, String deviceType, int planId, String deviceNumber ) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.planId = planId;
		this.deviceNumber = deviceNumber;
	}

	public Device(String deviceName, String deviceType, int planId, String deviceNumber) {
		super();
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.planId = planId;
		this.deviceNumber = deviceNumber;
	}

	public Device() {
		super();
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getDeviceNumber() {
		return deviceNumber;
	}

	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deviceId, deviceName, deviceType, planId);
	}

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

	@Override
	public String toString() {
		return "Devices [deviceId=" + deviceId + ", deviceName=" + deviceName + ", deviceType=" + deviceType
				+ ", planId=" + planId + "]";
	}
	
}
