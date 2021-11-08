import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class PlanService {

  url = 'https://telecom-application-ma.azurewebsites.net'

  planName: any

  constructor(private httpClient: HttpClient) { }

  getAllPlans(): Observable<any> {
    return this.httpClient.get(this.url + '/plans');
  }

  deletePlan(value: number): Observable<any> {
    console.log(value + "---deviceservice")
    return this.httpClient.delete(this.url + '/plans/' + value)
  }

}
