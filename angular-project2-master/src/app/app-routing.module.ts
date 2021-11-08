import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponent } from './cart/cart.component';
import { HomeComponent } from './home/home.component';
import { PlansComponent } from './plans/plans.component';
import { DevicesComponent } from './devices/devices.component';
import { AccountComponent } from './account/account.component';
import { AddComponent } from './add/add.component';

const routes: Routes = [
  { path: 'plans', component: PlansComponent },
  { path: 'home', component: HomeComponent },
  { path: 'devices', component: DevicesComponent },
  { path: 'account', component: AccountComponent },
  { path: 'plans/cart', component: CartComponent },
  { path: 'devices/add', component: AddComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
