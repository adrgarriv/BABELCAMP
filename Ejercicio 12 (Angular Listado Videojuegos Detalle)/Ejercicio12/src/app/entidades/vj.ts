export class Videojuego{

    private _id: number = 0;
  
   
    
   
    
    public static _contadorId : number = 1;

    
    constructor( private _titulo : string, private _company : string, private _score : number, private _img:string){
        this._id = Videojuego._contadorId++;
        this._titulo = _titulo
        this._company = _company
        this._score=_score
        this._img=_img
    }

    public get id() : number{
        return this._id;
    }

    public get company() : string{
        return this._company;
    }
    public get titulo() : string{
        return this._titulo;
    }
    public get score() : number{
        return this._score;
    }
    
    public set company(value: string) {
        this._company = value;
    }
    public set titulo(value: string) {
        this._titulo = value;
    }
    public set score(value: number) {
        this._score= value;
    }
    public get img(): string {
        return this._img;
    }
    public set img(value: string) {
        this._img = value;
    }


    public toString() : string {
        return `ID: ${this._id}, Titulo: ${this._titulo}, Compañia: ${this._company}, Valoracion: ${this._score}`
    }

}