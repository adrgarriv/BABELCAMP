import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contacto',
  templateUrl: './contacto.component.html',
  styleUrls: ['./contacto.component.css']
})
export class ContactoComponent implements OnInit {
  private _contacto: Array<string> = [];
  public get contacto(): Array<string> {
    return this._contacto;
  }
  public set contacto(value: Array<string>) {
    this._contacto = value;
  }

  constructor() { 
    this._contacto[0]="+34 669647186"
    this._contacto[1]="adrigarciariv@gmail.com"
  }

  ngOnInit() {
  }

}
