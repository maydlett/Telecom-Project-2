import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Device } from './models/device';

@Injectable({
  providedIn: 'root'
})

export class AddService {

  url = 'https://telecom-application-ma.azurewebsites.net/devices/add'

  constructor(private httpClient: HttpClient) { }

  saveDevice(device: Device): Observable<any> {
    return this.httpClient.post(this.url, device)
  }

}
