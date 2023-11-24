package com.example.simplear

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.openAR)
        button.setOnClickListener(View.OnClickListener {
            val sceneViewerIntent = Intent(Intent.ACTION_VIEW)
            val intentUri =
                Uri.parse("https://arvr.google.com/scene-viewer/1.0").buildUpon()
                    .appendQueryParameter("file", "https://storage.googleapis.com/ar-answers-in-search-models/static/Tiger/model.glb")    //Working
                    .appendQueryParameter("mode", "ar_only")
                    .appendQueryParameter("title", "Tiger")
                    .build()
            sceneViewerIntent.data = intentUri
            sceneViewerIntent.setPackage("com.google.ar.core")
            sceneViewerIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(sceneViewerIntent)
        })

    }
}