function suma()
{
    let operando1=document.getElementById("operando1").value
    let operando2=document.getElementById("operando2").value    
    if(operando1===""||operando2===""||isNaN(operando1) || isNaN(operando2))
    {
        alert("Alguno de los operandos introducidos no es un número")
    }
    else
    {
        let resultado=parseFloat(operando1)+parseFloat(operando2)
        document.getElementById("resultado").value=resultado
        document.getElementById("operando1").value=""
        document.getElementById("operando2").value="" 
    }
}
function resta()
{
    let operando1=document.getElementById("operando1").value
    let operando2=document.getElementById("operando2").value    
    if(operando1===""||operando2===""||isNaN(operando1) || isNaN(operando2))
    {
        alert("Alguno de los operandos introducidos no es un número")
    }
    else
    {
        let resultado=parseFloat(operando1)-parseFloat(operando2)
        document.getElementById("resultado").value=resultado
        document.getElementById("operando1").value=""
        document.getElementById("operando2").value="" 
    }
}
function producto()
{
    let operando1=document.getElementById("operando1").value
    let operando2=document.getElementById("operando2").value    
    if(operando1===""||operando2===""||isNaN(operando1) || isNaN(operando2))
    {
        alert("Alguno de los operandos introducidos no es un número")
    }
    else
    {
        let resultado=parseFloat(operando1)*parseFloat(operando2)
        document.getElementById("resultado").value=resultado
        document.getElementById("operando1").value=""
        document.getElementById("operando2").value="" 
    }
}
function division()
{
    let operando1=document.getElementById("operando1").value
    let operando2=document.getElementById("operando2").value    
    if(operando1===""||operando2===""||isNaN(operando1) || isNaN(operando2))
    {
        alert("Alguno de los operandos introducidos no es un número")
    }
    else
    {
        let resultado=parseFloat(operando1)/parseFloat(operando2)
        document.getElementById("resultado").value=resultado
        document.getElementById("operando1").value=""
        document.getElementById("operando2").value="" 
    }
}