export class Device {
	deviceId : number;
	deviceName : string;
	deviceType : string;
	deviceNumber : string;
	planId : number;

	
    constructor( deviceId = 0,  deviceName ="",  deviceType = "" , planId = 0, deviceNumber = "") {
		this.planId = planId;
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.deviceNumber = deviceNumber;
	}



}