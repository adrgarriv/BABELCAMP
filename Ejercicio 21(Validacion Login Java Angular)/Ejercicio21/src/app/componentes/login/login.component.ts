import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/entidades/usuario';
import { Router } from '@angular/router';
import { UsuarioService } from 'src/app/servicios/UsuarioService.service';
import { Observable } from 'rxjs';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit 
{

  constructor(private router:Router,private _usuarioService:UsuarioService) {
    this._usuarioService = _usuarioService;
   }
  nombre : string =""
  pass : string =""
  listaUsuarios : Array<Usuario> = [new Usuario("a","a"),new Usuario("b","b"),new Usuario("c","c")]
  mostrarTextoRellenar : boolean = false
  mostrarTextoErrorUsuario : boolean = false
  mostrarTextoErrorPass : boolean = false
  verificado : boolean = false
  nombreEncontrado : boolean = false
  passCorrecta : boolean = false
  contador : number=0;

  public validar()
  {
    let obs : Observable<any> = this._usuarioService.validar(this.nombre,this.pass)
    obs.subscribe({
      next:  respuesta => {
        do
        {
          if(JSON.stringify(respuesta).includes("true"))
          {
            alert("Usuario autenticado")
            this.contador=3
            this.router.navigate(['home/listado/'+this.nombre])
          }
          else
          {
            alert("Error al acceder. Te quedan "+(2-this.contador)+" intentos.");
            this.contador++;
          }
        }
        while(this.contador<=2)
        
      },
      error: e => {
        console.log(`No se ha podido acceder a la app, ${e}`)
        alert(e)
      }
    });
  }
  
 
  
  ngOnInit() {
  }

}
