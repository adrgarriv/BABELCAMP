export class Jugador {
    constructor(_id, _nombre, _edad, _pais, _historial) {
        this._id = _id;
        this._nombre = _nombre;
        this._edad = _edad;
        this._pais = _pais;
        this._historial = _historial;
        this._id = _id;
        this._nombre = _nombre;
        this._edad = _edad;
        this._pais = _pais;
        this._historial = _historial;
    }
    get historial() {
        return this._historial;
    }
    set historial(value) {
        this._historial = value;
    }
    get edad() {
        return this._edad;
    }
    set edad(value) {
        this._edad = value;
    }
    get pais() {
        return this._pais;
    }
    set pais(value) {
        this._pais = value;
    }
    get nombre() {
        return this._nombre;
    }
    set nombre(value) {
        this._nombre = value;
    }
    get id() {
        return this._id;
    }
    set id(value) {
        this._id = value;
    }
}
