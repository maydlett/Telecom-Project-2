import { Component, OnInit, ViewChild, ViewContainerRef } from '@angular/core';
import { DeviceService } from '../device.service';
import { Device } from '../models/device'; 
import { Plan } from '../models/plan';
import { PlanService } from '../plan.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-devices',
  templateUrl: './devices.component.html',
  styleUrls: ['./devices.component.css'],
  template: ''
})
export class DevicesComponent implements OnInit {

  deviceList!: Device[];
  planList!: Plan[];

  
  closeResult = '';



  constructor(private deviceService: DeviceService, private planService : PlanService   ){}



  






  ngOnInit(): void {

		this.deviceService.getAllDevices().subscribe(result => {
			this.deviceList = result;	
      console.log(	this.deviceList);
		})

    this.planService.getAllPlans().subscribe(result => {
			this.planList = result;	
      console.log(result);
		})

	}





  addDevice(){
console.log("add clicked")
}
  remove(){
    console.log("remove clicked")

  }



}
