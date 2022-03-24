import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IzquierdaComponent } from './izquierda/izquierda.component';
import { NombreComponent } from './nombre/nombre.component';
import { PerfilComponent } from './perfil/perfil.component';
import { AptitudesComponent } from './aptitudes/aptitudes.component';
import { ContactoComponent } from './contacto/contacto.component';
import { DerechaComponent } from './derecha/derecha.component';
import { FormacionComponent } from './formacion/formacion.component';
import { ExperienciaComponent } from './experiencia/experiencia.component';
import { IdiomasComponent } from './idiomas/idiomas.component';


@NgModule({
  declarations: [											
    AppComponent,
      IzquierdaComponent,
      NombreComponent,
      PerfilComponent,
      AptitudesComponent,
      ContactoComponent,
      DerechaComponent,
      FormacionComponent,
      ExperienciaComponent,
      IdiomasComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
