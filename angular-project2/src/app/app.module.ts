import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PlansComponent } from './plans/plans.component';
import { HomeComponent } from './home/home.component';
import { CartComponent } from './cart/cart.component';
import { DevicesComponent } from './devices/devices.component';
import { AddComponent } from './add/add.component';


@NgModule({
  declarations: [
    AppComponent,
    PlansComponent,
    HomeComponent,
    CartComponent,
    DevicesComponent,
    AddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
