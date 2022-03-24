import { Jugador } from "./jugador.js";
export class Equipo{
    constructor(private _id : string, private _nombre : string, private _fundacion: Date, private _jugadores:Array<Jugador>){
        this._id = _id;
        this._nombre = _nombre;
        this._fundacion = _fundacion;
        this._jugadores = _jugadores
    }

    public get jugadores(): Array<Jugador> {
        return this._jugadores;
    }
    public set jugadores(value: Array<Jugador>) {
        this._jugadores = value;
    }
    public get fundacion(): Date {
        return this._fundacion;
    }
    public set fundacion(value: Date) {
        this._fundacion = value;
    }
    public get nombre(): string {
        return this._nombre;
    }
    public set nombre(value: string) {
        this._nombre = value;
    }
    public get id(): string {
        return this._id;
    }
    public set id(value: string) {
        this._id = value;
    }
    public addJugador(jugador : Jugador)
    {
        this._jugadores.push(jugador)
    }
}