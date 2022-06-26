package com.viktadzy.intellectitecapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.viktadzy.intellectitecapp.ui.home.HomeFragment

class LogIn_Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

    }//instance required to make a call to the member function(firebase)
}






// instead of using seton clicklistener u can go to the xml file n look for an attribute called onclick and give it a name then
//come to the kt file and create a function with that name i.e fun go toregister(view:view){
// val Intent = Intent(this, SignUpActivity::class.java)
// startActivity(intent)
// } AND THIS FUNCTION IS CREATED OUTSIDE THE OVERIDE FUNCTION