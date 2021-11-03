import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Plan } from './models/plan';
import { PlanService } from './plan.service';
import { PlansComponent } from './plans/plans.component';

@Injectable({
  providedIn: 'root'
})


export class CartService {

    url='http://localhost:8080/plans/cart'

  a = "false";
  b = "false";
  c = "false";

  
cartA = {   
  "planName" : "Ultimate Plan",
  "planPrice" : 455.00,
  "planNumLines" : 1,
    "customerId" : 1
}


cartB = {   
  "planName" : "Normal Plan",
      "planPrice" : 300.00,
      "planNumLines" : 1,
  "customerId" : 1,
}

cartC = {   
  "planName" : "Cheap Plan",
    "planPrice" : 100.00,
    "planNumLines" : 1,
"customerId" : 1
}

  constructor(private httpClient : HttpClient) { }
   
  savePlan(plan: Plan): Observable<any> {
    return this.httpClient.post(this.url, plan)
  }




}
