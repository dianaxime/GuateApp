package com.example.guateapp

import Modelos.Nombre
import Modelos.Places

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE



import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val editarnombre: Nombre =Nombre("")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onlyname.visibility= INVISIBLE
        val valores =Places()
        place1.setOnClickListener{val intent = Intent(this,Main2Activity::class.java)
            valores.Places("Antigua")
            intent.putExtra("title",valores.gettitle())
            intent.putExtra("frase",valores.getfrase())
            intent.putExtra("texto",valores.gettext())
            startActivity(intent)
        }
        place2.setOnClickListener{val intent = Intent(this,Main2Activity::class.java)
            valores.Places("Tikal")
            intent.putExtra("title",valores.gettitle())
            intent.putExtra("frase",valores.getfrase())
            intent.putExtra("texto",valores.gettext())
            startActivity(intent)
        }
        place3.setOnClickListener{val intent = Intent(this,Main2Activity::class.java)
            valores.Places("Atitlan")
            intent.putExtra("title",valores.gettitle())
            intent.putExtra("frase",valores.getfrase())
            intent.putExtra("texto",valores.gettext())
            startActivity(intent)
        }
        mostrarocultar.setOnClickListener{
            if (namelabel.visibility== View.VISIBLE){
                namelabel.visibility= INVISIBLE
                nameedit.visibility= INVISIBLE
                editarnombre.setelnombre(nameedit.text.toString())
            }
            else{
                namelabel.visibility=View.VISIBLE
                nameedit.visibility=View.VISIBLE
            }
            if (onlyname.visibility== View.VISIBLE){
                onlyname.visibility= INVISIBLE
            }
            else{
                onlyname.visibility=View.VISIBLE
                onlyname.text=editarnombre.getelnombre()
            }
        }
    }
}
