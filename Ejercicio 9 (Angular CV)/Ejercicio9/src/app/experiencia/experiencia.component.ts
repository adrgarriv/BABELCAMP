import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {

  private _experiencia: Array<string> = [];
  public get experiencia(): Array<string> {
    return this._experiencia;
  }
  public set experiencia(value: Array<string>) {
    this._experiencia = value;
  }

  constructor() { 
    this.experiencia[0]="Camarero Bar Pecata Mundi 2021-Actualidad"
  }

  ngOnInit() {
  }

}
