package com.extremestudios.musicmanevo;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import defpackage.xs;

public final class TransposeActivity extends Activity {
    private TextView value;
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_transpose);
        value = findViewById(R.id.transpose_value);
        findViewById(R.id.transpose_minus).setOnClickListener(v -> change(-1));
        findViewById(R.id.transpose_plus).setOnClickListener(v -> change(1));
        findViewById(R.id.transpose_reset).setOnClickListener(v -> { xs.t = 1.0f; apply(); });
        apply();
    }
    private void change(int direction) {
        xs.t = Math.max(0.5f, Math.min(2.0f, xs.t + direction * 0.1f));
        apply();
    }
    private void apply() {
        xs.a();
        value.setText(String.format(java.util.Locale.US, "%.1fx", xs.t));
    }
}
