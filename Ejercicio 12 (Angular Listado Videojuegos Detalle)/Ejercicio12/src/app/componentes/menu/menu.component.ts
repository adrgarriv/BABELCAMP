import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  nombre:string=""
  constructor(route:ActivatedRoute) {
    this.nombre=route.snapshot.params["nombre"]
   }

  ngOnInit() {
  }

}
