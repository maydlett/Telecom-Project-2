import { Component, OnInit, Input  } from '@angular/core';
import { PlanService } from '../plan.service';
import { CartService } from '../cart.service';
import { Plan } from '../models/plan';


@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  planList = {};
  cart: Plan
  

  constructor(private planService: PlanService, private cartService : CartService){
    this.cart = new Plan();

  
  if(cartService.a === "true"){
    this.planList = planService.savePlanA
    this.cart = cartService.cartA
  }
   if (cartService.b ==="true"){
    this.planList = planService.savePlanB
    this.cart = cartService.cartB

  }
  if (cartService.c === "true"){
    this.planList = planService.savePlanC
    this.cart = cartService.cartC

  }

  

  }

  ngOnInit(): void {


	}


     done(){
         this.cartService.savePlan(this.cart).subscribe(result => {
            console.log(result);
          })
  }

      

    

  
  

}
