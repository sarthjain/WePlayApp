package com.practice.makeathon;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayVideo extends AppCompatActivity {

    public static String EXTRA_POSITION = "PostitionClicked";
    public static String EXTRA_OBJECT = "Object";
    private MediaController ctlr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

        String link = "https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4";
        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(link));
        videoView.start();
        ctlr = new MediaController(this);
        ctlr.setMediaPlayer(videoView);
        videoView.setMediaController(ctlr);
        videoView.requestFocus();
    }
}
