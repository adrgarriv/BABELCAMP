export class Historial {
    constructor(_id, _goles, _t_Amarillas, _t_Rojas) {
        this._id = _id;
        this._goles = _goles;
        this._t_Amarillas = _t_Amarillas;
        this._t_Rojas = _t_Rojas;
        this._id = _id;
        this._goles = _goles;
        this._t_Amarillas = _t_Amarillas;
        this._t_Rojas = _t_Rojas;
    }
    get id() {
        return this._id;
    }
    set id(value) {
        this._id = value;
    }
    get goles() {
        return this._goles;
    }
    set goles(value) {
        this._goles = value;
    }
    get t_Amarillas() {
        return this._t_Amarillas;
    }
    set t_Amarillas(value) {
        this._t_Amarillas = value;
    }
    get t_Rojas() {
        return this._t_Rojas;
    }
    set t_Rojas(value) {
        this._t_Rojas = value;
    }
}
