package com.notchewy1324.akidagainandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //LoginAuth
        lateinit var auth: FirebaseAuth
        button3.setOnClickListener {
            textView2.setText("Login Successful")
            auth.signInWithEmailAndPassword(LoginEmail.toString(), LoginPassword.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success
                        textView2.setText("Login Successful")
                    } else {
                        // If sign in fails, display a message to the user.
                        textView2.setText("Login Failed. Please check your email or password.")
                    }
                }
        }
    }
}

