package com.agn.ilkproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.agn.ilkproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    public lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }



    fun topla(view : View){
        var sayı1=binding.numbertext1.text.toString().toIntOrNull()
        var sayı2=binding.numbertext2.text.toString().toIntOrNull()
        if(sayı1 == null || sayı2 == null){
            binding.textView.text="sayı girişi yap aq"


        }else{
            var sonuc=sayı1+sayı2
            binding.textView.text="Sonuc:${sonuc}"

        }

    }
    fun cikar(){
        var sayı1=binding.numbertext1.text.toString().toIntOrNull()
        var sayı2=binding.numbertext2.text.toString().toIntOrNull()
        if(sayı1 == null || sayı2 == null){
            binding.textView.text="sayı girişi yap aq"


        }else{
            var sonuc=sayı1-sayı2
            binding.textView.text="Sonuc:${sonuc}"

        }

    }
    fun bol(){
        var sayı1=binding.numbertext1.text.toString().toIntOrNull()
        var sayı2=binding.numbertext2.text.toString().toIntOrNull()
        if(sayı1 == null || sayı2 == null){
            binding.textView.text="sayı girişi yap aq"


        }else{
            if(sayı1 >= sayı2){
                var sonuc= sayı1/sayı2
                binding.textView.text="Sonuc= ${sonuc}"
            }
            else{
                var sonuc= sayı2/sayı1
                binding.textView.text="Sonuc=${sonuc}"
            }

        }
    }
    fun carp(){
        var sayı1=binding.numbertext1.text.toString().toIntOrNull()
        var sayı2=binding.numbertext2.text.toString().toIntOrNull()
        if(sayı1 == null || sayı2 == null){
            binding.textView.text="sayı girişi yap aq"


        }else{
            var sonuc=sayı1*sayı2
            binding.textView.text="Sonuc:${sonuc}"

        }
    }
}