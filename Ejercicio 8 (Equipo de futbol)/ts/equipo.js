export class Equipo {
    constructor(_id, _nombre, _fundacion, _jugadores) {
        this._id = _id;
        this._nombre = _nombre;
        this._fundacion = _fundacion;
        this._jugadores = _jugadores;
        this._id = _id;
        this._nombre = _nombre;
        this._fundacion = _fundacion;
        this._jugadores = _jugadores;
    }
    get jugadores() {
        return this._jugadores;
    }
    set jugadores(value) {
        this._jugadores = value;
    }
    get fundacion() {
        return this._fundacion;
    }
    set fundacion(value) {
        this._fundacion = value;
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
    addJugador(jugador) {
        this._jugadores.push(jugador);
    }
}
