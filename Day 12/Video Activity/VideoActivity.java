package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
VideoView videoV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoV = findViewById(R.id.videoV);

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoV);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.lion);
        
        videoV.setMediaController(mediaController);
        
        videoV.setVideoURI(uri);
        
        videoV.requestFocus();
        videoV.start();
        
        videoV.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(VideoActivity.this, "Thank you...", Toast.LENGTH_SHORT).show();
            }
        });

        videoV.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(VideoActivity.this, "Error", Toast.LENGTH_SHORT).show();

                return false;
            }
        });
    }
}