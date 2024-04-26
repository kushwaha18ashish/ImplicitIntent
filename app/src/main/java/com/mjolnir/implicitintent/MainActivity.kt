package com.mjolnir.implicitintent

import android.content.Intent
import android.media.browse.MediaBrowser
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var youtube=findViewById<CardView>(R.id.cvYoutube)
        var camera=findViewById<CardView>(R.id.cvCamera)

        youtube.setOnClickListener {
           val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.youtube.com/")
            startActivity(intent)
        }

        camera.setOnClickListener {
           val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}