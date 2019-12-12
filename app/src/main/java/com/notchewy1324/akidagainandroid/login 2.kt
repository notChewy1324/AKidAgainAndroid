package com.notchewy1324.akidagainandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.LoginEmail
import kotlinx.android.synthetic.main.activity_login.LoginPassword

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        lateinit var auth: FirebaseAuth
        auth = FirebaseAuth.getInstance()
        auth.signInWithEmailAndPassword(LoginEmail.text.toString(), LoginPassword.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, display a message to the user.
                } else {
                    // If sign in fails, display a message to the user.
                }
            }
    }
}

