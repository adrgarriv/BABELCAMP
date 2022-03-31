import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './componentes/login/login.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './componentes/home/home.component';
import { MenuComponent } from './componentes/menu/menu.component';
import { ListadoVjComponent } from './componentes/listado-vj/listado-vj.component';
import { DetalleVjComponent } from './componentes/detalle-vj/detalle-vj.component';
import { ContactoComponent } from './componentes/contacto/contacto.component';
import { SobreMiComponent } from './componentes/sobre-mi/sobre-mi.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    MenuComponent,
    ListadoVjComponent,
    DetalleVjComponent,
    ContactoComponent,
    SobreMiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
