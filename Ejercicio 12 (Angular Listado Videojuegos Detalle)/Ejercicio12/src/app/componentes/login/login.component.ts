import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/entidades/usuario';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router) { }
  nombre : string =""
  pass : string =""
  listaUsuarios : Array<Usuario> = [new Usuario("a","a"),new Usuario("b","b"),new Usuario("c","c")]
  mostrarTextoRellenar : boolean = false
  mostrarTextoErrorUsuario : boolean = false
  mostrarTextoErrorPass : boolean = false
  verificado : boolean = false
  nombreEncontrado : boolean = false
  passCorrecta : boolean = false

  public validar()
  {
    this.mostrarTextoErrorPass=false
    this.mostrarTextoErrorUsuario=false
    this.mostrarTextoRellenar=false
    this.nombreEncontrado=false
    this.passCorrecta=false
    if(this.nombre.trim().length!=0 && this.pass.trim().length!=0)
    {
      for(let i in this.listaUsuarios)
      {
        if(this.nombre==this.listaUsuarios[i].nombre)
        {
          this.nombreEncontrado=true
          if(this.pass==this.listaUsuarios[i].pass)
          {
            this.passCorrecta=true
            this.router.navigate(['home/listado/'+this.nombre])
          }
        }
      }
      
      if(!this.nombreEncontrado || !this.passCorrecta)
      {
        if(!this.nombreEncontrado)
        {
          this.mostrarTextoErrorUsuario=true
        }
        if(!this.passCorrecta && !this.mostrarTextoErrorUsuario)
        {
          this.mostrarTextoErrorPass=true
        }
        
      }
      
    }
    else
    {
      this.mostrarTextoRellenar=true
    }
  }
  
 
  
  ngOnInit() {
  }

}
