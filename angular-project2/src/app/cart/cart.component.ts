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
  price = 0
  name = ""
  numLines = 0

  constructor(private planService: PlanService, private cartService : CartService){
    this.cart = new Plan();

  
  if(cartService.a === "true"){
    this.cart = cartService.cartA
    this.price = cartService.cartA.planPrice
    this.name = cartService.cartA.planName
    this.numLines = cartService.cartA.planNumLines
  }
   if (cartService.b ==="true"){
    this.cart = cartService.cartB
    this.price = cartService.cartB.planPrice
    this.name = cartService.cartB.planName
    this.numLines = cartService.cartB.planNumLines
  }
  if (cartService.c === "true"){
    this.cart = cartService.cartC
    this.price = cartService.cartC.planPrice
    this.name = cartService.cartC.planName
    this.numLines = cartService.cartC.planNumLines
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
