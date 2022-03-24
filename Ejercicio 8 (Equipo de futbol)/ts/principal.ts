import { Jugador } from "./jugador.js";
import { Historial } from "./historial.js";
import { Equipo } from "./equipo.js";

let h1 : Historial = new Historial("1", 10, 5, 0)
let j1 : Jugador = new Jugador("7","Joao Felix",22,"Portugal",h1)
let h2 : Historial = new Historial("2",4,12,1)
let j2 : Jugador = new Jugador("14","Marcos LLorente",27,"España",h2)
let h3 : Historial = new Historial("3",14,8,0)
let j3 : Jugador = new Jugador("10","Angel Correa",27,"Argentina",h3)
let f : Date = new Date("04-26-1903")
let t : Array<Jugador> = [j1,j2,j3]
let e : Equipo = new Equipo("1","Club Atletico de Madrid",f,t)
console.log("Estos son los jugadores del "+e.nombre)
for(let i in e.jugadores)
{
    console.log(e.jugadores[i].nombre)
    console.log("Este es el historial del jugador")
    console.log("Dorsal:"+e.jugadores[i].id)
    console.log("Goles:"+e.jugadores[i].historial.goles)
    console.log("Tarjetas amarillas:"+e.jugadores[i].historial.t_Amarillas)
    console.log("Tarjetas rojas:"+e.jugadores[i].historial.t_Rojas)
}
console.log("Vamos a añadir un nuevo jugador al equipo")
let h4 : Historial = new Historial("1",7, 3, 0)
let j4 : Jugador = new Jugador("11","Thomas Lemar",26,"Francia",h4)
e.addJugador(j4)
console.log("Nuevo numero de jugadores del equipo:"+e.jugadores.length)
