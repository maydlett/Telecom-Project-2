import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Device } from './models/device';

@Injectable({
  providedIn: 'root'
})


export class AddService {

    url='http://localhost:8080/devices/add'

  

  constructor(private httpClient : HttpClient) { }
   
  saveDevice(device: Device): Observable<any> {
    return this.httpClient.post(this.url, device)
  }




}
