function media(parciales: number, final: number, trabajo:number)
{
    let m= 0.55*parciales + 0.3*final + 0.15*trabajo
    console.log("La media del alumno es:"+m)
}

function isNotMario(vj: Array<string>)
{
    let vjFiltrado: Array<string> = []
    for(let i in vj)
    {
        let str = "Mario"
        if(vj[i].search(str) == -1)
        {
            console.log(vj[i]+" no contiene Mario")
            vjFiltrado.push(vj[i])
        }
        else
        {
            console.log(vj[i]+" contiene Mario")
        } 
    }
    console.log("Estos son los videojuegos que no contienen Mario")
    for (let i in vjFiltrado)
    {
     console.log(vjFiltrado[i])
    }
}
function factorial(n : number)
{
    let f : number = n
    if(n==0)
    {
        f=1
    }
    else
    {
        for(let i = n-1; i>0;i--)
        {
            f = f * (i)
        }
    }
    console.log("El factorial de "+n+" es "+f)
}

media(7.6, 5, 5)
let vjs : Array<string> = ["Mario Oddisey", "Pokemon Diamante Brillante", "Super Mario 64", "League of Legends", "Dark Souls"]
isNotMario(vjs)
factorial(3)

