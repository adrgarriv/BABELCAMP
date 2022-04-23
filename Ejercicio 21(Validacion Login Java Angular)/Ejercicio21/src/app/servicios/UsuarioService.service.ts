import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Usuario } from '../entidades/usuario';


//Los servicios en Angular se inyectan, jamás los crearemos con 'new'.
//Para ello usaremos el decorador @Inyectable sobre la clase.

//Aqúi estamos diciendo a Angular que cree un objeto de tipo HeroeService
//por nosotros (Inversión de Control) y que podrá ser inyectado en otros objetos 
//(Inyección de Dependencias)

//Con "providedIn: 'root'" hacemos que el servicio tenga un comportamiento de
//'Singleton", es decir, el objeto será único para toda la aplicación.
@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  //Hacemos que el atributo sea solo de lectura con 'readonly'
  url:string="http://localhost:8080/Ejercicio_21/usuarios/login"

  /**
   * Este constructor recibirá inyectado un objeto de tipo _HttpClient, que será
   * en encargado de hacer las peticiones HTTP a nuestro servicio REST
   * @param _httpClient 
   */
  constructor(private _httpClient : HttpClient) 
  { 
    
  }
  public validar(nombre:string, password:string) : Observable<any>{   
    return this._httpClient.get(this.url,{params:{nombre:nombre,password:password}})
  }


  


  


 

  /**
   * Método que maneja los posibles errores de las llamadas al servicio rest
   * @param error 
   * @returns un objeto de tipo Observable que contendrá el error que ha ocurrido
   */
  private manejarError(e: HttpErrorResponse){
    let mensajeError = ''
    //Diferenciamos si el error es del servidor o más genérico
    if (e.error instanceof ErrorEvent) {
      mensajeError = 'A ocurrido un error:' + e.error
    } else {
      mensajeError = `El servicio Rest retorno: Status: ${e.status}, ` +
            `Body: ${e.error}`
    }
    //Imprimimos el mensaje de error y lo arrojamos médiante una función lambda
    //Esta manerá tenemos que hacerla así cuando trabajamos con Observables.
    console.error(mensajeError)
    return throwError(() => new Error(mensajeError));
  }

  ngOnInit() {

  }
}
