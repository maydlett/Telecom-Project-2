import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PlanService {

  url='http://localhost:4200/plans/'

  constructor(private httpClient : HttpClient) { }

  getAllPlans(): Observable<any>{
    return this.httpClient.get(this.url);
  }



}
