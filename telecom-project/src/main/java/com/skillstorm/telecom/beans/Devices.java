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
public class Devices {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deviceId;
	
	@Column(name = "DeviceName")
	private String deviceName;
	
	@Column(name = "DeviceType")
	private String deviceType;
	
	@Column(name = "PlanID")
	private int planId;

	public Devices(int deviceId, String deviceName, String deviceType, int planId) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.planId = planId;
	}

	public Devices(String deviceName, String deviceType, int planId) {
		super();
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.planId = planId;
	}

	public Devices() {
		super();
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
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
		Devices other = (Devices) obj;
		return deviceId == other.deviceId && Objects.equals(deviceName, other.deviceName)
				&& Objects.equals(deviceType, other.deviceType) && planId == other.planId;
	}

	@Override
	public String toString() {
		return "Devices [deviceId=" + deviceId + ", deviceName=" + deviceName + ", deviceType=" + deviceType
				+ ", planId=" + planId + "]";
	}
	
}
