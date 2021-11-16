package com.example.v04
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
private lateinit var textViewResult: TextView
private const val TAG = "MyApp"
class MainActivity : AppCompatActivity() {
    var textViewResult: TextView? = null
    var button: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewResult=findViewById(R.id.textViewResult)
        button=findViewById(R.id.button)

    }
    fun task (view: View) {
        view as Button

        with(textViewResult) {
            this?.setText(myString())
            this?.setGravity(Gravity.CENTER);
        }
    }
    fun myString(): String{
        val chars = "abcdefghijklmnopqrstuvwxyz".toCharArray()
        var stroka:String=""
        var n:Int=chars.size
        for (i in 0..n-1){
            if (i % 2 >0) {
                stroka=stroka+chars.get(i)+' '
            }
        }
        println(stroka)
        return stroka


    }

}
