package com.extremestudios.musicmanevo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

public final class VideoPlayerActivity extends Activity {
    private static final int PICK_VIDEO = 41;
    private VideoView videoView;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_video_player);
        videoView = findViewById(R.id.video_view);
        Button open = findViewById(R.id.video_open);
        Button play = findViewById(R.id.video_play);
        Button equalizer = findViewById(R.id.video_equalizer);
        Button transpose = findViewById(R.id.video_transpose);
        open.setOnClickListener(v -> pickVideo());
        play.setOnClickListener(v -> { if (videoView.isPlaying()) videoView.pause(); else videoView.start(); });
        equalizer.setOnClickListener(v -> startActivity(new Intent(this, EqualizerActivity.class)));
        transpose.setOnClickListener(v -> startActivity(new Intent(this, TransposeActivity.class)));
        Uri selected = getIntent().getData();
        if (selected != null) playVideo(selected);
    }

    private void pickVideo() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.setType("video/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent, PICK_VIDEO);
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_VIDEO && resultCode == RESULT_OK && data != null && data.getData() != null) {
            try { getContentResolver().takePersistableUriPermission(data.getData(), Intent.FLAG_GRANT_READ_URI_PERMISSION); } catch (SecurityException ignored) { }
            playVideo(data.getData());
        }
    }

    private void playVideo(Uri uri) {
        videoView.setVideoURI(uri);
        videoView.setOnPreparedListener(player -> {
            player.setLooping(false);
            videoView.start();
        });
    }
}
