import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vj',
  templateUrl: './vj.component.html',
  styleUrls: ['./vj.component.css']
})
export class VjComponent implements OnInit {

  private _id: number;
  private _titulo: string;
  private _company: string;
  private _score: number;
 

  public get id(): number {
    return this._id;
  }
  public set id(value: number) {
    this._id = value;
  }
  
  public get titulo(): string {
    return this._titulo;
  }
  public set titulo(value: string) {
    this._titulo = value;
  }

  public get company(): string {
    return this._company;
  }
  public set company(value: string) {
    this._company = value;
  }

  public get score(): number {
    return this._score;
  }
  public set score(value: number) {
    this._score = value;
  }

  constructor() { }

  ngOnInit() {
  }

}
