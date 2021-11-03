import { Component, OnInit } from '@angular/core';
import { AddService } from '../add.service';
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
  newDevice: Device

  constructor(private addService: AddService){
    this.newDevice = new Device();
  }

  ngOnInit(): void {
  }
  

  add(){
    this.name = (<HTMLInputElement>document.getElementById("inputName")).value;
    this.type = (<HTMLInputElement>document.getElementById("inputType")).value;
    this.number = (<HTMLInputElement>document.getElementById("inputNumber")).value;

  this.temp = {
    "deviceName" : this.name ,
    "deviceType": this.type,
    "deviceNumber": this.number,
    "planId" : 1
  }

  this.newDevice = this.temp

    this.addService.saveDevice(this.newDevice).subscribe(result => {
      console.log(result);
    })
    
  }





}
