package dev.marceloranngel.maxapp.ui

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dev.marceloranngel.maxapp.BuildConfig
import dev.marceloranngel.maxapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var textViewVersion : TextView
    private lateinit var imageViewStatus : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Settar versão
        textViewVersion = findViewById(R.id.appVersionTv)
        textViewVersion.text = BuildConfig.VERSION_NAME


        //Verificar conexão && Settar imageView
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo

        imageViewStatus = findViewById(R.id.statusCtnIv)

        if(activeNetwork != null && activeNetwork.isConnectedOrConnecting){
            imageViewStatus.setImageResource(R.drawable.ic_maxima_nuvem_conectado)
        }

    }



}