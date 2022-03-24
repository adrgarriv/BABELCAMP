import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{
  title = 'Ejercicio10 - Calculadora';
  private _operando1: number = 0;
  public get operando1(): number {
    return this._operando1;
  }
  public set operando1(value: number) {
    this._operando1 = value;
  }
  private _operando2: number = 0;
  public get operando2(): number {
    return this._operando2;
  }
  public set operando2(value: number) {
    this._operando2 = value;
  }
  
  private _resultado: number = 0;
  public get resultado(): number {
    return this._resultado;
  }
  public set resultado(value: number) {
    this._resultado = value;
  }
 

  suma():void
  {  
    this._resultado = this._operando1+this._operando2
  }
  resta():void
  {
    this._resultado= this._operando1-this._operando2
    
  }
  producto():void
  {
    this._resultado = this._operando1*this._operando2
   
  }
  division():void
  {
    this._resultado = this._operando1/this._operando2
   
  }
}

