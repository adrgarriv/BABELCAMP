import { Component, OnInit } from '@angular/core';
import { Videojuego } from '../entidades/vj';

@Component({
  selector: 'app-formulario-vj',
  templateUrl: './formulario-vj.component.html',
  styleUrls: ['./formulario-vj.component.css']
})
export class FormularioVjComponent implements OnInit {

  id : number = 0
  titulo : string =""
  company : string =""
  score : number = 0
  listaVjs : Videojuego[] = []
  vj : Videojuego | null = null
  tituloObligatorioOculto = true
  companyObligatorioOculto = true
  scoreObligatorioOculto = true
 

  public hayErroresEnFormulario():boolean{
    let error : boolean = false
    if(this.titulo.trim().length==0){
      this.tituloObligatorioOculto = false
      error = true
      alert("El titulo es obligatorio")
    }
    if(this.company.trim().length==0 ){
      this.companyObligatorioOculto = false
      error = true
      alert("La compañia es obligatoria")
    }
    if(this.score<0 || this.score > 10 || this.score.toString().trim().length==0 || isNaN(this.score)){
      this.scoreObligatorioOculto = false
      error = true
      alert("La valoracion tiene que estar entre 0 y 10")
    }
    for(let i in this.listaVjs)
    {
      if(this.titulo == this.listaVjs[i].titulo)
      {
        error=true
        alert("El videojuego que estas intentando introducir ya existe.")
      }
    }
    return error
  }
  public alta()
  {
    if(!this.hayErroresEnFormulario())
    {
      this.vj = new Videojuego(this.titulo,this.company,this.score)
      this.listaVjs.push(this.vj)
    }
  }
  public baja()
  {
    let existe = false
    if(this.id <= Videojuego._contadorId && this.id>0)
    {
      for(let i in this.listaVjs)
      {
        if(this.id == this.listaVjs[i].id)
        {
          this.listaVjs.splice(parseInt(i),1)
          existe = true
        }
      }
      if(!existe)
      {
        alert("El videojuego que esta intentando dar de baja no esta en la lista")
      }
    }
    else
    {
      alert("Para dar de baja un videojuego de la lista se necesita el id")
    }
  }

  public modificar()
  {
    let existe = false
    let t = false
    if(this.id <= Videojuego._contadorId && this.id>0)
    {
      for(let i in this.listaVjs)
      {
        if(this.id == this.listaVjs[i].id)
        {
          for(let i in this.listaVjs)
          {
            if(this.titulo == this.listaVjs[i].titulo)
            {
              t=true
              alert("El titulo de videojuego que estas intentando introducir ya existe")
            }
          }
          if(this.titulo.trim().length!=0 && !t)
          {
            this.listaVjs[i].titulo=this.titulo
          }
          if(this.company.trim().length!=0)
          {
            this.listaVjs[i].company=this.company
          }
          alert(isNaN(this.score))
          if(this.score>0 || this.score < 10 || this.score.toString().trim().length!=0 || !isNaN(this.score))
          {
            this.listaVjs[i].score=this.score
          }
          existe = true
        }
      }
      if(!existe)
      {
        alert("El videojuego que esta intentando modificar no esta en la lista")
      }
    }
    else
    {
      alert("Para modificar un videojuego de la lista se necesita un id valido")
    }
  }

 

  constructor() { }

  ngOnInit() {
  }

}
