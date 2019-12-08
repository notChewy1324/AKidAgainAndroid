package com.notchewy1324.akidagainandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        lateinit var auth: FirebaseAuth

        //LoginAuth
        //Takes us to login page
        button3.setOnClickListener {
            auth.createUserWithEmailAndPassword(editText2.toString(), editText.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        textView2.text = "Logged In"
                    } else {
                        // If sign in fails, display a message to the user.
                        textView2.text = "Login Failed. Please cheack your email or password."
                    }
                }
        }
    }
}
