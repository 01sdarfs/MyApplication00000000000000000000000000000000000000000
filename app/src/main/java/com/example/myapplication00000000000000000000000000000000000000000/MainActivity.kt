 package com.example.myapplication00000000000000000000000000000000000000000

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.lang.Double.sum
import java.util.jar.Attributes

 class MainActivity : AppCompatActivity() {
     var trueLogin : String = "Sonne";
     var truePassword: String = "Sun";
     override fun onCreate(savedInstanceState: Bundle?){
         super.onCreate(savedInstanceState)
         setContentView((R.layout.activity_main))
     }
     fun onClick( v : View)
     {
         var userLogin: EditText = findViewById(R.id.login)
         var userPassword: EditText = findViewById(R.id.password)
         var res: TextView = findViewById(R.id.result)

         if (trueLogin == userLogin.text.toString() && truePassword == userPassword.text.toString())
         { output(text"Верно")
         //    var next : Intent = Intent (this,Main2Activity::class.java)
        //startActivity(next);
         }
         else
         {
             output(sum(s1 : "Пароль или "))
         }
fun output(text:String){
    var res : TextView = findViewById(R.id.result)
    res.setText(text)

}
         fun sum(s1: String) String{
             var s3:String = s1 + "Логин неверный"
         }
     }


     }
 }

