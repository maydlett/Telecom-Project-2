import { Component, OnInit } from '@angular/core';
import { PlanService } from '../plan.service';
import { Plan } from '../models/plan';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-plans',
  templateUrl: './plans.component.html',
  styleUrls: ['./plans.component.css']
})

export class PlansComponent implements OnInit {

  planList!: Plan[];

  constructor(private planService: PlanService, private cartService: CartService) { }

  ngOnInit(): void {

    this.planService.getAllPlans().subscribe(result => {
      this.planList = result;
    })

  }

  basicPlan = {
    "planName": "Basic Plan",
    "planPrice": 50,
    "planNumLines": 1,
  };

  planA() {
    this.cartService.a = "true";
    this.cartService.b = "false";
    this.cartService.c = "false";
  }

  standardPlan = {
    "planName": "Standard Plan",
    "planPrice": 100,
    "planNumLines": 2,

  };
  planB() {
    this.cartService.a = "false";
    this.cartService.b = "true";
    this.cartService.c = "false";
  }

  familyPlan = {
    "planName": "Family Plan",
    "planPrice": 150,
    "planNumLines": 4,
  };

  planC() {
    this.cartService.a = "false";
    this.cartService.b = "false";
    this.cartService.c = "true";

  }

}
