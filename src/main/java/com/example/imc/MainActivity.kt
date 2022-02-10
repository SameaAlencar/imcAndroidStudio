package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        calcular.setOnClickListener {
            val altura = findViewById<EditText>(R.id.altura).text.toString().toDouble()
            val peso = findViewById<EditText>(R.id.peso).text.toString().toInt()
            val resultado = findViewById<TextView>(R.id.resultado)

            val imc = peso / (altura * altura)

            if (imc < 18.5)
            {
                resultado.text = "você está abaixo do peso"
            }else if (imc < 25)
            {
                resultado.text = "você está com peso ideal. Parabéns!"
            }else if (imc < 30)
            {
                resultado.text = "você está levemente acima do peso"
            }else if(imc < 35)
            {
                resultado.text = "você está com obesidade grau I"
            }else if(imc < 40)
            {
                resultado.text = "você está com obesidade grau II"
            }else
            {
                resultado.text = "você está próximo da morte"
            }


        }
    }
}