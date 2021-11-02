import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DeviceService {
  
   url='http://localhost:8080'

  constructor(private httpClient : HttpClient) { }

  getAllDevices(): Observable<any>{
    return this.httpClient.get(this.url + '/devices');
  }

  
}


