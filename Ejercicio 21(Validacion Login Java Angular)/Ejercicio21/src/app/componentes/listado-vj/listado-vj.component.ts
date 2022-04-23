import { Component, OnInit } from '@angular/core';
import { Videojuego } from 'src/app/entidades/vj';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-listado-vj',
  templateUrl: './listado-vj.component.html',
  styleUrls: ['./listado-vj.component.css']
})
export class ListadoVjComponent implements OnInit {

  constructor(route:ActivatedRoute) { 
    this.nombre=route.snapshot.params["nombre"]
  }
  v : Videojuego 
  id:number=0
  titulo:string =""
  company:string=""
  score:number=0
  img:string=""
  mostrarDetalle:boolean=false
  nombre:string=""
  listaVjs : Videojuego[] = [new Videojuego("League of Legends","Riot Games",7,"../../../assets/lol-icon.jpg"),new Videojuego("Uncharted","NaughyDog",10,"../../../assets/icon.png")]
  public seleccionar(vj:Videojuego)
  {
    
    this.mostrarDetalle=true
    this.id=vj.id
    this.titulo=vj.titulo
    this.company=vj.company
    this.score=vj.score
    this.img=vj.img
    this.v=vj
  }

  public ocultarDetalle()
  {
    this.mostrarDetalle=!this.mostrarDetalle
  }

  ngOnInit() {
  }

}
