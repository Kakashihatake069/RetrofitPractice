package com.example.myregistrationfrom.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myregistrationfrom.DataBase
import com.example.myregistrationfrom.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var db : DataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        db= DataBase(this)
        initview()
    }

    private fun initview() {

//SQLITE LOGIN CHECK
        binding.btnLogin.setOnClickListener {

            var name=binding.edtName.text.toString()
            var age=binding.edtAge.text.toString()


            var check= db.login(name,age)


            if (check)
            {
                Toast.makeText(this, "login succes", Toast.LENGTH_SHORT).show()
                var intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }

            else{
                Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show()
            }

        }



        binding.btnCreate.setOnClickListener {

            var intent=Intent(this,AddFormActivity::class.java)
            startActivity(intent)
        }

    }
}