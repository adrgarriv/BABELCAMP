import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-idiomas',
  templateUrl: './idiomas.component.html',
  styleUrls: ['./idiomas.component.css']
})
export class IdiomasComponent implements OnInit {

  private _idiomas: Array<string> = [];
  public get idiomas(): Array<string> {
    return this._idiomas;
  }
  public set idiomas(value: Array<string>) {
    this._idiomas = value;
  }
  
  constructor() { 
    this.idiomas[0]="Español: Nativo"
    this.idiomas[1]="Inglés: B2(CEFR level: C1) por la Universidad de Cambridge"
  }

  ngOnInit() {
  }

}
