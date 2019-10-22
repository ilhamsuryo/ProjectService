package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnFacebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
            Uri.parse("https://www.facebook.com/login/"))
            startActivity(i)
        })

        btnInstagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.instagram.com/ilhamgzn/"))
            startActivity(i)
        })

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.dangdut)

        btnPlay.setOnClickListener {
            MediaPlayer?.start()
        }
        btnPause.setOnClickListener {
            MediaPlayer?.pause()
        }
        btnStop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
