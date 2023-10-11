package com.example.acercademim

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // equivalente a função Main de outra linguagem de programaçao
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ponteiro para o nosso botão
        //e responder ao evento de 'click'
        findViewById<Button>(R.id.button).setOnClickListener{

            escreveDiminutivo(it)
        }

    }

    /**
     * transfere o diminutivo do utilizador da textBox para a Label e
     * esconde os objectos não necessários
     */
    private fun escreveDiminutivo(view: View) {
        //criar ponteiros para os objectos da View (interface grafica)
        val txtLabel=findViewById<TextView>(R.id.diminutivo_utilizadorTextView)
        val txtCaixaTextView=findViewById<EditText>(R.id.diminutivo_utilizadorEditText)

        //atribuir o texto do diminutivo que o utilizador escreveu á label
        //que o vai mostrar no ecrã

        txtLabel.text=txtCaixaTextView.text

        //esconder os recursos não necessários
        txtCaixaTextView.visibility= View.GONE
        bt.visibility=View.GONE

        //apresentar a Label no ecra

        txtLabel.visibility=View.VISIBLE

        // hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(bt.windowToken, 0)

    }
}