import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-formacion',
  templateUrl: './formacion.component.html',
  styleUrls: ['./formacion.component.css']
})
export class FormacionComponent implements OnInit {

  private _formacion: Array<string> = [];
  public get formacion(): Array<string> {
    return this._formacion;
  }
  public set formacion(value: Array<string>) {
    this._formacion = value;
  }

  constructor() { 
    this._formacion[0]="Escuela Técnica Superior de Ingeniería (Sevilla) Grado en Ingeniería de las Tecnologías de Telecomunicación con mención en Telemática 2016-Actualidad"
    this._formacion[1]="Babelcamp 7ª edición 2022-Actualidad"
  }

  ngOnInit() {
  }

}
