package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView1;
    VideoView videoView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declaration
        videoView1=findViewById(R.id.videoView1);
        videoView2=findViewById(R.id.videoView2);
        //From local storage
        videoView1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.kgf);
        MediaController mc=new MediaController(this);
        mc.setAnchorView(videoView1);
        videoView1.setMediaController(mc);

        //Display video from internet
        Uri uri= Uri.parse("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");
        videoView2.setVideoURI(uri);
        MediaController mc2=new MediaController(this);
        mc2.setAnchorView(videoView2);
        mc2.setMediaPlayer(videoView2);
        videoView2.setMediaController(mc2);
        videoView2.start();
    }
}