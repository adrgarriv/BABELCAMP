import { Component, OnInit, Input } from '@angular/core';
import { Videojuego } from 'src/app/entidades/vj';

@Component({
  selector: 'app-detalle-vj',
  templateUrl: './detalle-vj.component.html',
  styleUrls: ['./detalle-vj.component.css']
})
export class DetalleVjComponent implements OnInit {

  @Input() v : Videojuego;
  constructor() { }
  
  ngOnInit() {
  }

}
