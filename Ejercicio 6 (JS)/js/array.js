var array = []
function añadir()
{
    let numero = document.getElementById("numero").value
    if(numero==="" || isNaN(numero))
    {
        alert("Debes introducir un numero valido")
    }
    else
    {
        array.push(numero)
        document.getElementById("numero").value=""
        document.getElementById("array").innerHTML+=array[array.length-1]+","
    }
    
}
function aleatorio()
{
    if(array.length!=0)
    {
        let indice=Math.round(Math.random()*(array.length-1)) 
        document.getElementById("random").value=array[indice]
    }
    else
    {
        alert("El array esta vacío :(")
    }
    
}