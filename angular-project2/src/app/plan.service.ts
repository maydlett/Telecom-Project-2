    import { Injectable } from '@angular/core';
    import { Observable } from 'rxjs';
    import { HttpClient } from '@angular/common/http';
    import { Plan } from './models/plan';

    @Injectable({
      providedIn: 'root'
    })


    export class PlanService {

      url='http://localhost:8080/plans/'

      savePlanA = {   
        "planName" : "Ultimate Plan",
        "planPrice" : 455.00,
        "planNumLines" : 1,
    }

    savePlanB = {   
      "planName" : "aaaa",
      "planPrice" : 455.00,
      "planNumLines" : 1,
  }

  savePlanC = {   
    "planName" : "bbbb",
    "planPrice" : 455.00,
    "planNumLines" : 1,
}

 
      

      constructor(private httpClient : HttpClient) { }



      getAllPlans(): Observable<any> {
        return this.httpClient.get(this.url);
      }





    }
