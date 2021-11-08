import { Component, OnInit } from '@angular/core';
import { AddService } from '../add.service';
import { DeviceService } from '../device.service';
import { Device } from '../models/device';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  name: any
  type: any
  number: any
  temp: any
  planId: any
  newDevice: Device
  city: any
  tempNum: any


  constructor(private addService: AddService, private deviceService: DeviceService) {
    this.newDevice = new Device();
  }

  ngOnInit(): void {
  }


  add() {
    this.name = (<HTMLInputElement>document.getElementById("inputName")).value;
    this.type = (<HTMLInputElement>document.getElementById("inputType")).value;
    this.number = (<HTMLInputElement>document.getElementById("inputNumber")).value;


    switch (this.number.length) {
      case 10:
        this.city = this.number.slice(0, 3);
        this.tempNum = this.number.slice(3);
        break;
    }

    this.tempNum = this.tempNum.slice(0, 3) + '-' + this.tempNum.slice(3);
    this.number = (this.city + "-" + this.tempNum).trim()


    this.temp = {
      "deviceName": this.name,
      "deviceType": this.type,
      "deviceNumber": this.number,
      "planId": this.deviceService.planId
    }

    this.newDevice = this.temp

    this.addService.saveDevice(this.newDevice).subscribe(result => {
      console.log(result);
    })

  }





}
