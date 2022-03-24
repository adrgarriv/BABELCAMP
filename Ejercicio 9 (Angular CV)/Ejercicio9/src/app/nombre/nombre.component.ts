import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nombre',
  templateUrl: './nombre.component.html',
  styleUrls: ['./nombre.component.css']
})
export class NombreComponent implements OnInit {
  private _nombre: string;
  public get nombre(): string {
    return this._nombre;
  }
  public set nombre(value: string) {
    this._nombre = value;
  }
  private _ap1: string;
  public get ap1(): string {
    return this._ap1;
  }
  public set ap1(value: string) {
    this._ap1 = value;
  }
  private _ap2: string;
  public get ap2(): string {
    return this._ap2;
  }
  public set ap2(value: string) {
    this._ap2 = value;
  }

  constructor() { 
    this._nombre="Adrián"
    this._ap1="García"
    this._ap2="Rivera"
  }

  ngOnInit() {
  }

}
