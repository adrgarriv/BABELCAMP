import { Historial } from "./historial.js";
export class Jugador{
    constructor(private _id : string, private _nombre : string, private _edad: number, private _pais: string, private _historial: Historial){
        this._id = _id;
        this._nombre = _nombre;
        this._edad = _edad;
        this._pais = _pais;
        this._historial=_historial;
    }

    
    public get historial(): Historial {
        return this._historial;
    }
    public set historial(value: Historial) {
        this._historial = value;
    }
    public get edad(): number {
        return this._edad;
    }
    public set edad(value: number) {
        this._edad = value;
    }
    public get pais(): string {
        return this._pais;
    }
    public set pais(value: string) {
        this._pais = value;
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
}