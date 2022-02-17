package com.example.imc


 fun calcularImc(altura:Double, peso:Int):String {

     val imc = peso / (altura * altura)

    if (imc < 18.5)
    {
        return "você está abaixo do peso"
    }else if (imc < 25)
    {
        return "você está com peso ideal. Parabéns!"
    }else if (imc < 30)
    {
        return "você está levemente acima do peso"
    }else if(imc < 35)
    {
        return "você está com obesidade grau I"
    }else if(imc < 40)
    {
        return  "você está com obesidade grau II"
    }else
    {
        return  "você está próximo da morte"
    }

}

