import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-aptitudes',
  templateUrl: './aptitudes.component.html',
  styleUrls: ['./aptitudes.component.css']
})
export class AptitudesComponent implements OnInit {
  
  private _aptitudes: Array<string> = [];
  public get aptitudes(): Array<string> {
    return this._aptitudes;
  }
  public set aptitudes(value: Array<string>) {
    this._aptitudes = value;
  }
  constructor() { 
    this._aptitudes[0]="Trabajo en equipo"
    this._aptitudes[1]="Autoaprendizaje"
    this._aptitudes[2]="Diseño y programación Web(CSS, HTML, JavaScript, XML)"
    this._aptitudes[3]="Lenguajes de programación: C, C++, Java, Python"
    this._aptitudes[4]="Programación para dispositivos móviles(Android)"
    this._aptitudes[5]="Paquete Office"
    this._aptitudes[6]="Bases de datos: SQL y NoSQL"
  }

  ngOnInit() {
  }

}
