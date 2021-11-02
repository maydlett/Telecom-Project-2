import { Component, OnInit } from '@angular/core';
import { DeviceService } from '../device.service';
import { Device } from '../models/device'; 

@Component({
  selector: 'app-devices',
  templateUrl: './devices.component.html',
  styleUrls: ['./devices.component.css']
})
export class DevicesComponent implements OnInit {

  deviceList!: Device[];

  constructor(private deviceService: DeviceService){}

  ngOnInit(): void {

		this.deviceService.getAllDevices().subscribe(result => {
			this.deviceList = result;	
      console.log(result);
		})
	}

}
