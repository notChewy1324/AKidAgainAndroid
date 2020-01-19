package com.notchewy1324.akidagainandroid

import android.R.attr.password
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
//import jdk.nashorn.internal.runtime.ECMAException.getException
import kotlinx.android.synthetic.main.activity_login.*
//import org.junit.experimental.results.ResultMatchers.isSuccessful
//import sun.jvm.hotspot.utilities.IntArray
import kotlinx.android.synthetic.main.activity_login.Button


class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Firebase Vars
        var auth = FirebaseAuth.getInstance()

        Button.setOnClickListener {
            FirebaseAuth.AuthStateListener {
                auth.signInWithEmailAndPassword(LoginEmail.toString(), LoginPassword.toString())
                    .addOnCompleteListener(this) {
                        when {
                            it.isSuccessful -> {
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
