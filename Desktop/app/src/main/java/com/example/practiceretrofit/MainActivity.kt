package com.example.practiceretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practiceretrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var apiINterface: ApiINterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initview()
    }

    private fun initview() {
        apiINterface=ApiClient.getClient().create(ApiINterface::class.java)


//    apiINterface.getAllProducts().enqueue(object : Callback<com.example.practiceretrofit.ResponseItem>{
//        override fun onResponse(
//            call: Call<com.example.practiceretrofit.ResponseItem>,
//            response: Response<com.example.practiceretrofit.ResponseItem>
//        ) {
//            Log.e("dfg", "onResponse: "+response.body().toString())
//        }
//
//        override fun onFailure(call: Call<com.example.practiceretrofit.ResponseItem>, t: Throwable) {
//            Log.e("TAG", "onFailure: "+t.message )
//        }
//
//    })

        apiINterface.getAllProducts().enqueue(object : Callback<List<ResponseItem>>{
            override fun onResponse(
                call: Call<List<ResponseItem>>,
                response: Response<List<ResponseItem>>
            ) {

//                Log.e("dfg", "onResponse: "+response.body().toString())
                var list= response.body()

                var adapter=Adapter(list)

                var Manager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
                binding.rcvDisplay.layoutManager = Manager
                binding.rcvDisplay.adapter = adapter

            }

            override fun onFailure(call: Call<List<ResponseItem>>, t: Throwable) {
                Log.e("TAG", "onFailure: "+t.message )
            }

        })

    }
}