package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var nomeEditText: EditText
lateinit var alturaEditText: EditText
lateinit var pesoEditText: EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)

        calcular.setOnClickListener {
            nomeEditText = findViewById(R.id.nome)
            alturaEditText = findViewById(R.id.altura)
            pesoEditText = findViewById(R.id.peso)

            val resultado = findViewById<TextView>(R.id.resultado)


            if (validarCampo()){
                val altura = alturaEditText.text.toString().toDouble()
                val peso = pesoEditText.text.toString().toInt()


                val imc = calcularImc(altura,peso)

                resultado.text = (imc)
            }



        }
        sair.setOnClickListener {
            finish()
        }
    }



    private fun validarCampo(): Boolean {
        var noError = true

        if (nomeEditText.text.isBlank()){
            nomeEditText.setError("Digite o seu nome")
            noError = false
        }
        if (alturaEditText.text.isBlank()){
            alturaEditText.setError("Digite a sua altura")
            noError = false
        }
        if (pesoEditText.text.isBlank()){
            pesoEditText.setError("Digite o seu peso")
            noError = false
        }
        return noError

    }


}