package com.notchewy1324.akidagainandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.LoginEmail
import kotlinx.android.synthetic.main.activity_login.LoginPassword

private val Any.isSuccessful: Boolean
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Firebase Vars
        lateinit var auth: FirebaseAuth
        auth = FirebaseAuth.getInstance()

        Button.setOnClickListener {
            auth.signInWithEmailAndPassword(LoginEmail, LoginPassword)
                .addOnCompleteListener(this) {
                    if (it.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(baseContext, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}

private fun Any.addOnCompleteListener(login: Any, any: Any) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun Any.signInWithEmailAndPassword(loginEmail: Any, loginPassword: Any) {

}

