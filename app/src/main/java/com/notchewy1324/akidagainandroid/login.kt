package com.notchewy1324.akidagainandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.Button
import android.widget.EditText


private val FirebaseAuth.isSuccessful: Any
    get() {
        return Any()
    }

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Firebase Vars
        var auth = FirebaseAuth.getInstance()

        Button.setOnClickListener {
            FirebaseAuth.AuthStateListener {
                auth.signInWithEmailAndPassword(LoginEmail, LoginPassword)
                    .addOnCompleteListener(this) {
                        when {
                            it.isSuccessful as Boolean -> {
                                // Sign in success, update UI with the signed-in user's information
                                Toast.makeText(baseContext, "Authentication Successful.",
                                    Toast.LENGTH_SHORT).show()
                            }
                            else -> {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(baseContext, "Authentication Failed.",
                                    Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
            }
        }
    }
}

private fun Unit.addOnCompleteListener(login: login, function: () -> Unit) {

}

private fun FirebaseAuth.signInWithEmailAndPassword(LoginEmail: EditText?, LoginPassword: EditText?) {

}
