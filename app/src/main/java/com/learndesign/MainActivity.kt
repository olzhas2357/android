package com.learndesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var ed1 : EditText
    lateinit var ed2 : EditText
    lateinit var txv2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)

        ed1 = findViewById(R.id.ed_1)
        ed2 = findViewById(R.id.ed_2)

        txv2 = findViewById(R.id.result)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = ed1.text.toString()
        var b = ed2.text.toString()
        var result1 = " "
        var result2 = a + " " + b
        when(v?.id){
            R.id.btn1 -> {
                result1 =" Astana IT University is the leader of innovative continuous IT education and science with stable academic traditions and high social responsibility                     "
            }
            R.id.btn2 -> {
                result1 = " International IT University or International university of information technologies - established in close collaboration with educational organization iCarnegie which represents American IT university Carnegie Mellon in 2009 by order of President of Kazakhstan.                   "
            }
            R.id.btn3 -> {
                result1 =  " Kazakh-British Technical University, or KBTU is a research and educational institution located in Almaty, Kazakhstan. It was founded in 2001.                            "

            }
        }
        txv2.text = "Student $result2 about $result1"
    }
}