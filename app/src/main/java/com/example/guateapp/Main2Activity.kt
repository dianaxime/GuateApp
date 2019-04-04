package com.example.guateapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        coment.setOnClickListener{
            if (!comentario.text.toString().isEmpty()) {
                Toast.makeText(this,comentario.text.toString() , Toast.LENGTH_SHORT).show()
            }
            this.finish()}
        var intent= intent
        val valor=intent.extras
        if (valor!=null){
            val tit=valor.get("title") as String
            eltitulo.text=tit
            val fr=valor.get("frase") as String
            subtitle.text=fr
            val txt=valor.get("texto") as String
            texto.text=txt
        }
    }
}
