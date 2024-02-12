package com.agn.ilkproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.agn.ilkproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    public lateinit var binding :ActivityMainBinding
    //alınacak sayları global olarak yer tutmasını sağlama
    var sayı1:Int?=null
    var sayı2:Int?=null
    var sonuc:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }



    fun topla(view : View){
         sayı1=binding.numbertext1.text.toString().toIntOrNull()
         sayı2=binding.numbertext2.text.toString().toIntOrNull()
        if(sayı1 == null || sayı2 == null){
            binding.textView.text="sayı girişi yap aq"


        }else{
             sonuc=sayı1!!+sayı2!!
            binding.textView.text="Sonuc:${sonuc}"

        }

    }
    fun cikar(view:View){
         sayı1=binding.numbertext1.text.toString().toIntOrNull()
         sayı2=binding.numbertext2.text.toString().toIntOrNull()
        if(sayı1 == null || sayı2 == null){
            binding.textView.text="sayı girişi yap aq"


        }else{
             sonuc=sayı1!!-sayı2!!
            binding.textView.text="Sonuc:${sonuc}"

        }

    }
    fun bol(view:View){
        sayı1=binding.numbertext1.text.toString().toIntOrNull()
        sayı2=binding.numbertext2.text.toString().toIntOrNull()
        if(sayı1 == null || sayı2 == null){
            binding.textView.text="sayı girişi yap aq"


        }else{
            if(sayı1!! >= sayı2!!){
                 sonuc= sayı1!!/sayı2!!
                binding.textView.text="Sonuc= ${sonuc}"
            }
            else{
                 sonuc= sayı2!!/sayı1!!
                binding.textView.text="Sonuc=${sonuc}"
            }

        }
    }
    fun carp(view:View){
         sayı1=binding.numbertext1.text.toString().toIntOrNull()
         sayı2=binding.numbertext2.text.toString().toIntOrNull()
        if(sayı1 == null || sayı2 == null){
            binding.textView.text="sayı girişi yap aq"


        }else{
             sonuc=sayı1!!*sayı2!!
            binding.textView.text="Sonuc:${sonuc}"

        }
    }
}