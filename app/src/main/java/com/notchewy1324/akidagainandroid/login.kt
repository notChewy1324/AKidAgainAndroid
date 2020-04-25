package com.notchewy1324.akidagainandroid

import android.R.attr.password
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*


class login : AppCompatActivity() {

    private val mAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            mAuth!!.createUserWithEmailAndPassword(LoginEmail.toString(), LoginPassword.toString())
                .addOnCompleteListener(
                    this
                ) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        LoginDisplayText.text = "Sign up was successful"
                        setContentView(R.layout.activity_home)
                    } else {
                        // If sign in fails, display a message to the user.
                        LoginDisplayText.text = "Sign up has failed"
                    }

                    // ...
                }
        }
    }
}
