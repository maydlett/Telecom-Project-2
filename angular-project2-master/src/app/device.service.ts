import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class DeviceService {

  url = 'https://telecom-application-ma.azurewebsites.net'

  planId: any
  numbLines: any

  constructor(private httpClient: HttpClient) { }

  getById(value: any): Observable<any> {
    return this.httpClient.get(this.url + '/devices/' + value);
  }

  deleteDevice(value: String): Observable<any> {
    console.log(value + "---deviceservice")
    return this.httpClient.delete(this.url + '/devices/' + value)
  }

}