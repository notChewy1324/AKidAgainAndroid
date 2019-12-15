package com.notchewy1324.akidagainandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.LoginEmail
import kotlinx.android.synthetic.main.activity_login.LoginPassword

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Firebase Vars
        val auth: FirebaseAuth = FirebaseAuth.getInstance()

        Button.setOnClickListener {
            FirebaseAuth.AuthStateListener {
                auth.signInWithEmailAndPassword(LoginEmail.text.toString(), LoginPassword.text.toString())
                    .addOnCompleteListener(this) {
                        when {
                            it.isSuccessful -> {
                                // Sign in success, update UI with the signed-in user's information
                            }
                            else -> {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(baseContext, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
            }
        }
    }
}
