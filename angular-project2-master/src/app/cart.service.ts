import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Plan } from './models/plan';

@Injectable({
  providedIn: 'root'
})

export class CartService {

  url = 'https://telecom-application-ma.azurewebsites.net/plans/cart'

  a = "false";
  b = "false";
  c = "false";

  cartA = {
    "planId": 0,
    "planName": "Basic Plan",
    "planPrice": 50.00,
    "planNumLines": 1,
    "customerId": 1
  }

  cartB = {
    "planId": 0,
    "planName": "Standard Plan",
    "planPrice": 100.00,
    "planNumLines": 2,
    "customerId": 1,
  }

  cartC = {
    "planId": 0,
    "planName": "Family Plan",
    "planPrice": 150.00,
    "planNumLines": 4,
    "customerId": 1
  }

  constructor(private httpClient: HttpClient) { }

  savePlan(plan: Plan): Observable<any> {
    return this.httpClient.post(this.url, plan)
  }

}
