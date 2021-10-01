import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './components/app.component';
import { MissionCardComponent } from './components/content/mission/mission-card/mission-card.component';
import { MissionFormComponent } from './components/content/mission/mission-form/mission-form.component';
import { MissionsComponent } from './components/content/mission/missions/missions.component';
import { OrderCardComponent } from './components/content/order/order-card/order-card.component';
import { OrderFormComponent } from './components/content/order/order-form/order-form.component';
import { OrdersComponent } from './components/content/order/orders/orders.component';
import { StockComponent } from './components/content/stock/stock.component';
import { WelcomeComponent } from './components/content/welcome/welcome.component';
import { NavigationComponent } from './components/navigation/navigation.component';


@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    WelcomeComponent,
    MissionsComponent,
    MissionCardComponent,
    MissionFormComponent,
    OrdersComponent,
    OrderCardComponent,
    OrderFormComponent,
    StockComponent
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
