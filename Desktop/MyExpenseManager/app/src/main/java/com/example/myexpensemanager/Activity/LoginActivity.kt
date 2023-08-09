package com.example.myexpensemanager.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myexpensemanager.R
import com.example.myexpensemanager.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initview()
    }

    private fun initview() {


        binding.btnLogin.setOnClickListener {

            var email=binding.edtEmail.text.toString()
            var password=binding.edtPassword.text.toString()


        }

    }
}