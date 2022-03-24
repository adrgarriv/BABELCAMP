export class Historial{

    constructor(private _id : string, private _goles : number,private _t_Amarillas : number,private _t_Rojas : number,){
        this._id = _id;
        this._goles = _goles;
        this._t_Amarillas= _t_Amarillas;
        this._t_Rojas=_t_Rojas;
    }

    public get id(): string {
        return this._id
    }
    public set id(value: string) {
        this._id = value
    }
    public get goles(): number {
        return this._goles
    }
    public set goles(value: number) {
        this._goles = value
    }
    public get t_Amarillas(): number {
        return this._t_Amarillas
    }
    public set t_Amarillas(value: number) {
        this._t_Amarillas = value
    }
    public get t_Rojas(): number {
        return this._t_Rojas
    }
    public set t_Rojas(value: number) {
        this._t_Rojas = value
    }
}