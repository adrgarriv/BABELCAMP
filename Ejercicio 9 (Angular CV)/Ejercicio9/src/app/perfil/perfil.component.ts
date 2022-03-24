import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})
export class PerfilComponent implements OnInit {

  private _perfil: Array<string> = [];
  public get perfil(): Array<string> {
    return this._perfil;
  }
  public set perfil(value: Array<string>) {
    this._perfil = value;
  }

  constructor() { 
    this._perfil[0]="Estudiante de Grado en Ingeniería de las Tecnologías de Telecomunicación."
    this._perfil[1]="Software Engineer - Back - Novice(Babel)"
  }

  ngOnInit() {
  }

}
