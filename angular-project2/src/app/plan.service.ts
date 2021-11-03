    import { Injectable } from '@angular/core';
    import { Observable } from 'rxjs';
    import { HttpClient } from '@angular/common/http';
    import { Plan } from './models/plan';

    @Injectable({
      providedIn: 'root'
    })


    export class PlanService {

      url='http://localhost:8080/plans/'


 

      constructor(private httpClient : HttpClient) { }



      getAllPlans(): Observable<any> {
        return this.httpClient.get(this.url);
      }





    }
