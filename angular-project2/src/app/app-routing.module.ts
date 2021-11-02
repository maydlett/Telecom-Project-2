import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CartComponent } from './cart/cart.component';
import { HomeComponent } from './home/home.component';
import { PlansComponent } from './plans/plans.component';
import { DevicesComponent } from './devices/devices.component';

const routes: Routes = [
  {path : 'plans', component: PlansComponent },
  {path: 'home', component: HomeComponent},
  {path: 'devices', component: DevicesComponent},
  {path: 'plans/cart', component: CartComponent},
  { path: '', redirectTo: '/home', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
