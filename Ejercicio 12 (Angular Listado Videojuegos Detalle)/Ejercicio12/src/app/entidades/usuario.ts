export class Usuario{

   
    public get nombre(): string {
        return this._nombre;
    }
    public set nombre(value: string) {
        this._nombre = value;
    }
    
    public get pass(): string {
        return this._pass;
    }
    public set pass(value: string) {
        this._pass = value;
    }
    
    constructor( private _nombre : string, private _pass : string){
        
        this._nombre = _nombre
        this._pass = _pass
       
    }

}