import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './componentes/login/login.component';
import { HomeComponent } from './componentes/home/home.component';
import { MenuComponent } from './componentes/menu/menu.component';
import { ListadoVjComponent } from './componentes/listado-vj/listado-vj.component';
import { DetalleVjComponent } from './componentes/detalle-vj/detalle-vj.component';
import { ContactoComponent } from './componentes/contacto/contacto.component';
import { SobreMiComponent } from './componentes/sobre-mi/sobre-mi.component';

const routes: Routes = [
  {
    path : '', 
    component : LoginComponent
  },
  {
    path : 'home/:nombre', 
    component : HomeComponent
  },
  {
    path: 'home/listado/:nombre',
    component: ListadoVjComponent
  },
  {
    path: 'home/contacto/:nombre',
    component: ContactoComponent
  },
  {
    path:'home/sobremi/:nombre',
    component: SobreMiComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
