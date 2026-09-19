package com.extremestudios.musicmanevo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.extremestudios.musicmanevo.EqualizerActivity;
import com.extremestudios.musicmanevo.PlayerActivity;
import com.extremestudios.musicmanevo.R;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.g;
import defpackage.j10;
import defpackage.jn;
import defpackage.na;
import defpackage.q7;
import defpackage.sv;
import defpackage.vs;
import defpackage.xs;
import defpackage.yd;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerActivity extends AppCompatActivity {
    public static final /* synthetic */ int Y = 0;
    public TextView C;
    public TextView D;
    public SeekBar E;
    public TextView F;
    public TextView G;
    public ImageButton H;
    public ImageButton I;
    public ImageButton J;
    public ImageButton K;
    public ImageButton L;
    public ImageButton M;
    public Button N;
    public Button O;
    public Button P;
    public TextView Q;
    public Button R_btn;
    public Button S;
    public TextView T;
    public ImageButton U;
    public ImageButton V;
    private SurfaceView videoSurfaceView;
    private ImageButton fullscreenButton;
    private View logoContainer;
    private boolean videoPlayback;
    private boolean fullscreen;
    private int normalVideoHeight;
    public final Handler W = new Handler(Looper.getMainLooper());
    public final g X = new g(2, this);

    public static String r(int i) {
        int i2 = i / 1000;
        return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
    }

    @Override // defpackage.c4, defpackage.xa, defpackage.wa, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_player);
        this.videoSurfaceView = (SurfaceView) findViewById(R.id.player_video_surface);
        this.fullscreenButton = (ImageButton) findViewById(R.id.btn_video_fullscreen);
        this.logoContainer = findViewById(R.id.logo_container);
        this.fullscreenButton.setOnClickListener(view -> setVideoFullscreen(!fullscreen));
        View viewFindViewById = findViewById(R.id.player_song_title);
        viewFindViewById.getClass();
        this.C = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.player_artist_name);
        viewFindViewById2.getClass();
        this.D = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.player_seekbar);
        viewFindViewById3.getClass();
        this.E = (SeekBar) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_current_time);
        viewFindViewById4.getClass();
        this.F = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_total_time);
        viewFindViewById5.getClass();
        this.G = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.btn_play_pause);
        viewFindViewById6.getClass();
        this.H = (ImageButton) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.btn_next);
        viewFindViewById7.getClass();
        this.I = (ImageButton) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.btn_prev);
        viewFindViewById8.getClass();
        this.J = (ImageButton) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.btn_shuffle);
        viewFindViewById9.getClass();
        this.K = (ImageButton) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.btn_repeat);
        viewFindViewById10.getClass();
        this.L = (ImageButton) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.btn_go_to_eq);
        viewFindViewById11.getClass();
        this.M = (ImageButton) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.btn_ab_repeat);
        viewFindViewById12.getClass();
        this.N = (Button) viewFindViewById12;
        View viewFindViewById13 = findViewById(R.id.btn_pitch_minus);
        viewFindViewById13.getClass();
        this.O = (Button) viewFindViewById13;
        View viewFindViewById14 = findViewById(R.id.btn_pitch_plus);
        viewFindViewById14.getClass();
        this.P = (Button) viewFindViewById14;
        View viewFindViewById15 = findViewById(R.id.tv_pitch_value);
        viewFindViewById15.getClass();
        this.Q = (TextView) viewFindViewById15;
        View viewFindViewById16 = findViewById(R.id.btn_speed_minus);
        viewFindViewById16.getClass();
        this.R_btn = (Button) viewFindViewById16;
        View viewFindViewById17 = findViewById(R.id.btn_speed_plus);
        viewFindViewById17.getClass();
        this.S = (Button) viewFindViewById17;
        View viewFindViewById18 = findViewById(R.id.tv_speed_value);
        viewFindViewById18.getClass();
        this.T = (TextView) viewFindViewById18;
        View viewFindViewById19 = findViewById(R.id.btn_forward_5);
        viewFindViewById19.getClass();
        this.U = (ImageButton) viewFindViewById19;
        View viewFindViewById20 = findViewById(R.id.btn_rewind_5);
        viewFindViewById20.getClass();
        this.V = (ImageButton) viewFindViewById20;
        final int i = 4;
        ((ImageButton) findViewById(R.id.btn_back_player)).setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i2 = i;
                PlayerActivity playerActivity = this.g;
                switch (i2) {
                    case 0:
                        int i3 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i4 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i5 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i6 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i7 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i8 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i9 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i10 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i11 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i12 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i13 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i14 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button = playerActivity.N;
                                if (button == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button2 = playerActivity.N;
                                if (button2 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button2.setText("A-B OFF");
                                Button button3 = playerActivity.N;
                                if (button3 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button3.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button4 = playerActivity.N;
                            if (button4 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button4.setText("A-B ON");
                            Button button5 = playerActivity.N;
                            if (button5 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button5.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        ImageButton imageButton = this.M;
        if (imageButton == null) {
            jn.k("eqBtn");
            throw null;
        }
        final int i2 = 5;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i3 = i2;
                PlayerActivity playerActivity = this.g;
                switch (i3) {
                    case 0:
                        int i4 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i5 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i6 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i7 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i8 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i9 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i10 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i11 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i12 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i13 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i14 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i15 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button = playerActivity.N;
                                if (button == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button2 = playerActivity.N;
                                if (button2 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button2.setText("A-B OFF");
                                Button button3 = playerActivity.N;
                                if (button3 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button3.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button4 = playerActivity.N;
                            if (button4 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button4.setText("A-B ON");
                            Button button5 = playerActivity.N;
                            if (button5 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button5.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        ImageButton imageButton2 = this.H;
        if (imageButton2 == null) {
            jn.k("playPauseBtn");
            throw null;
        }
        final int i3 = 6;
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i4 = i3;
                PlayerActivity playerActivity = this.g;
                switch (i4) {
                    case 0:
                        int i5 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i6 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i7 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i8 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i9 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i10 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i11 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i12 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i13 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i14 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i15 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i16 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button = playerActivity.N;
                                if (button == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button2 = playerActivity.N;
                                if (button2 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button2.setText("A-B OFF");
                                Button button3 = playerActivity.N;
                                if (button3 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button3.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button4 = playerActivity.N;
                            if (button4 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button4.setText("A-B ON");
                            Button button5 = playerActivity.N;
                            if (button5 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button5.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        imageButton2.setOnClickListener(view -> {
            if (xs.togglePlayback()) {
                u();
                s();
            }
        });
        ImageButton imageButton3 = this.I;
        if (imageButton3 == null) {
            jn.k("nextBtn");
            throw null;
        }
        final int i4 = 7;
        imageButton3.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i5 = i4;
                PlayerActivity playerActivity = this.g;
                switch (i5) {
                    case 0:
                        int i6 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i7 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i8 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i9 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i10 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i11 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i12 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i13 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i14 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i15 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i16 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i17 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button = playerActivity.N;
                                if (button == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button2 = playerActivity.N;
                                if (button2 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button2.setText("A-B OFF");
                                Button button3 = playerActivity.N;
                                if (button3 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button3.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button4 = playerActivity.N;
                            if (button4 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button4.setText("A-B ON");
                            Button button5 = playerActivity.N;
                            if (button5 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button5.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        ImageButton imageButton4 = this.J;
        if (imageButton4 == null) {
            jn.k("prevBtn");
            throw null;
        }
        final int i5 = 8;
        imageButton4.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i6 = i5;
                PlayerActivity playerActivity = this.g;
                switch (i6) {
                    case 0:
                        int i7 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i8 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i9 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i10 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i11 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i12 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i13 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i14 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i15 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i16 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i17 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i18 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button = playerActivity.N;
                                if (button == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button2 = playerActivity.N;
                                if (button2 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button2.setText("A-B OFF");
                                Button button3 = playerActivity.N;
                                if (button3 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button3.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button4 = playerActivity.N;
                            if (button4 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button4.setText("A-B ON");
                            Button button5 = playerActivity.N;
                            if (button5 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button5.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        ImageButton imageButton5 = this.K;
        if (imageButton5 == null) {
            jn.k("shuffleBtn");
            throw null;
        }
        final int i6 = 9;
        imageButton5.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i7 = i6;
                PlayerActivity playerActivity = this.g;
                switch (i7) {
                    case 0:
                        int i8 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i9 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i10 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i11 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i12 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i13 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i14 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i15 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i16 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i17 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i18 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i19 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button = playerActivity.N;
                                if (button == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button2 = playerActivity.N;
                                if (button2 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button2.setText("A-B OFF");
                                Button button3 = playerActivity.N;
                                if (button3 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button3.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button4 = playerActivity.N;
                            if (button4 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button4.setText("A-B ON");
                            Button button5 = playerActivity.N;
                            if (button5 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button5.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        ImageButton imageButton6 = this.L;
        if (imageButton6 == null) {
            jn.k("repeatBtn");
            throw null;
        }
        final int i7 = 10;
        imageButton6.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i8 = i7;
                PlayerActivity playerActivity = this.g;
                switch (i8) {
                    case 0:
                        int i9 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i10 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i11 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i12 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i13 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i14 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i15 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i16 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i17 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i18 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i19 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i110 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button = playerActivity.N;
                                if (button == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button2 = playerActivity.N;
                                if (button2 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button2.setText("A-B OFF");
                                Button button3 = playerActivity.N;
                                if (button3 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button3.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button4 = playerActivity.N;
                            if (button4 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button4.setText("A-B ON");
                            Button button5 = playerActivity.N;
                            if (button5 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button5.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        SeekBar seekBar = this.E;
        if (seekBar == null) {
            jn.k("seekBar");
            throw null;
        }
        final int i8 = 0;
        seekBar.setOnSeekBarChangeListener(new sv(0));
        Button button = this.N;
        if (button == null) {
            jn.k("btnABRepeat");
            throw null;
        }
        final int i9 = 11;
        button.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i10 = i9;
                PlayerActivity playerActivity = this.g;
                switch (i10) {
                    case 0:
                        int i11 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i12 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i13 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i14 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i15 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i16 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i17 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i18 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i19 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i110 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i111 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i112 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button2 = playerActivity.N;
                                if (button2 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button2.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button3 = playerActivity.N;
                                if (button3 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button3.setText("A-B OFF");
                                Button button4 = playerActivity.N;
                                if (button4 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button4.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button5 = playerActivity.N;
                            if (button5 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button5.setText("A-B ON");
                            Button button6 = playerActivity.N;
                            if (button6 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button6.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        button.setOnClickListener(view -> handleAbRepeat());
        Button button2 = this.P;
        if (button2 == null) {
            jn.k("btnPitchPlus");
            throw null;
        }
        button2.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i10 = i8;
                PlayerActivity playerActivity = this.g;
                switch (i10) {
                    case 0:
                        int i11 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i12 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i13 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i14 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i15 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i16 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i17 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i18 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i19 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i110 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i111 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i112 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button3 = playerActivity.N;
                                if (button3 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button3.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button4 = playerActivity.N;
                                if (button4 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button4.setText("A-B OFF");
                                Button button5 = playerActivity.N;
                                if (button5 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button5.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button6 = playerActivity.N;
                            if (button6 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button6.setText("A-B ON");
                            Button button7 = playerActivity.N;
                            if (button7 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button7.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        Button button3 = this.O;
        if (button3 == null) {
            jn.k("btnPitchMinus");
            throw null;
        }
        final int i10 = 1;
        button3.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i11 = i10;
                PlayerActivity playerActivity = this.g;
                switch (i11) {
                    case 0:
                        int i12 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i13 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i14 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i15 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i16 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i17 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i18 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i19 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i110 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i111 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i112 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i113 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button4 = playerActivity.N;
                                if (button4 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button4.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button5 = playerActivity.N;
                                if (button5 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button5.setText("A-B OFF");
                                Button button6 = playerActivity.N;
                                if (button6 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button6.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button7 = playerActivity.N;
                            if (button7 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button7.setText("A-B ON");
                            Button button8 = playerActivity.N;
                            if (button8 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button8.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        Button button4 = this.S;
        if (button4 == null) {
            jn.k("btnSpeedPlus");
            throw null;
        }
        final int i11 = 2;
        button4.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i12 = i11;
                PlayerActivity playerActivity = this.g;
                switch (i12) {
                    case 0:
                        int i13 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i14 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i15 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i16 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i17 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i18 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i19 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i110 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i111 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i112 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i113 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i114 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button5 = playerActivity.N;
                                if (button5 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button5.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button6 = playerActivity.N;
                                if (button6 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button6.setText("A-B OFF");
                                Button button7 = playerActivity.N;
                                if (button7 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button7.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button8 = playerActivity.N;
                            if (button8 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button8.setText("A-B ON");
                            Button button9 = playerActivity.N;
                            if (button9 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button9.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        Button button5 = this.R_btn;
        if (button5 == null) {
            jn.k("btnSpeedMinus");
            throw null;
        }
        final int i12 = 3;
        button5.setOnClickListener(new View.OnClickListener() { // from class: qv
            public final /* synthetic */ PlayerActivity g;

            {
                this.g = PlayerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vs vsVar;
                int i13 = i12;
                PlayerActivity playerActivity = this.g;
                switch (i13) {
                    case 0:
                        int i14 = PlayerActivity.Y;
                        float fD = yd.d(xs.t + 0.1f);
                        xs.t = fD;
                        xs.t = fD;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 1:
                        int i15 = PlayerActivity.Y;
                        float fD2 = yd.d(xs.t - 0.1f);
                        xs.t = fD2;
                        xs.t = fD2;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 2:
                        int i16 = PlayerActivity.Y;
                        float fD3 = yd.d(xs.s + 0.1f);
                        xs.s = fD3;
                        xs.s = fD3;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 3:
                        int i17 = PlayerActivity.Y;
                        float fD4 = yd.d(xs.s - 0.1f);
                        xs.s = fD4;
                        xs.s = fD4;
                        xs.a();
                        playerActivity.t();
                        return;
                    case 4:
                        int i18 = PlayerActivity.Y;
                        playerActivity.finish();
                        return;
                    case 5:
                        int i19 = PlayerActivity.Y;
                        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) EqualizerActivity.class));
                        return;
                    case 6:
                        int i110 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                            } else {
                                mediaPlayer.start();
                            }
                            playerActivity.u();
                            playerActivity.s();
                            return;
                        }
                        return;
                    case 7:
                        int i111 = PlayerActivity.Y;
                        xs.b(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 8:
                        int i112 = PlayerActivity.Y;
                        xs.c(playerActivity);
                        playerActivity.w();
                        playerActivity.s();
                        return;
                    case 9:
                        int i113 = PlayerActivity.Y;
                        xs.q = !xs.q;
                        playerActivity.v();
                        return;
                    case 10:
                        int i114 = PlayerActivity.Y;
                        int iOrdinal = xs.r.ordinal();
                        if (iOrdinal == 0) {
                            vsVar = vs.g;
                        } else if (iOrdinal == 1) {
                            vsVar = vs.h;
                        } else {
                            if (iOrdinal != 2) {
                                throw new na();
                            }
                            vsVar = vs.f;
                        }
                        xs.r = vsVar;
                        playerActivity.v();
                        return;
                    default:
                        int i115 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (xs.u == -1) {
                                xs.u = mediaPlayer2.getCurrentPosition();
                                Button button6 = playerActivity.N;
                                if (button6 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button6.setText("A-...");
                                Toast.makeText(playerActivity, "Point A set", 0).show();
                                return;
                            }
                            if (xs.v != -1) {
                                xs.u = -1;
                                xs.v = -1;
                                xs.w = false;
                                Button button7 = playerActivity.N;
                                if (button7 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button7.setText("A-B OFF");
                                Button button8 = playerActivity.N;
                                if (button8 == null) {
                                    jn.k("btnABRepeat");
                                    throw null;
                                }
                                button8.setTextColor(playerActivity.getColor(R.color.white));
                                Toast.makeText(playerActivity, "A-B Loop cleared", 0).show();
                                return;
                            }
                            if (mediaPlayer2.getCurrentPosition() <= xs.u) {
                                Toast.makeText(playerActivity, "Point B must be after A", 0).show();
                                return;
                            }
                            xs.v = mediaPlayer2.getCurrentPosition();
                            xs.w = true;
                            Button button9 = playerActivity.N;
                            if (button9 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button9.setText("A-B ON");
                            Button button10 = playerActivity.N;
                            if (button10 == null) {
                                jn.k("btnABRepeat");
                                throw null;
                            }
                            button10.setTextColor(playerActivity.getColor(R.color.neon_purple));
                            Toast.makeText(playerActivity, "A-B Loop enabled", 0).show();
                            return;
                        }
                        return;
                }
            }
        });
        ImageButton imageButton7 = this.U;
        if (imageButton7 == null) {
            jn.k("btnForward5");
            throw null;
        }
        imageButton7.setOnClickListener(new View.OnClickListener() { // from class: rv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        int i13 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            mediaPlayer.seekTo(yd.e(mediaPlayer.getCurrentPosition() + 5000, 0, mediaPlayer.getDuration()));
                        }
                        break;
                    default:
                        int i14 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.seekTo(yd.e(mediaPlayer2.getCurrentPosition() - 5000, 0, mediaPlayer2.getDuration()));
                        }
                        break;
                }
            }
        });
        imageButton7.setOnClickListener(view -> seekRelative(5000));
        ImageButton imageButton8 = this.V;
        if (imageButton8 == null) {
            jn.k("btnRewind5");
            throw null;
        }
        imageButton8.setOnClickListener(new View.OnClickListener() { // from class: rv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        int i13 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer = xs.a;
                        if (mediaPlayer != null) {
                            mediaPlayer.seekTo(yd.e(mediaPlayer.getCurrentPosition() + 5000, 0, mediaPlayer.getDuration()));
                        }
                        break;
                    default:
                        int i14 = PlayerActivity.Y;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.seekTo(yd.e(mediaPlayer2.getCurrentPosition() - 5000, 0, mediaPlayer2.getDuration()));
                        }
                        break;
                }
            }
        });
        imageButton8.setOnClickListener(view -> seekRelative(-5000));
        int intExtra = getIntent().getIntExtra("SONG_INDEX", -1);
        this.videoPlayback = false;
        setupAudioPlayback(intExtra);
    }

    @Override // defpackage.c4, android.app.Activity
    public final void onDestroy() {
        if (this.videoPlayback) {
            xs.setVideoSurface(null);
        }
        this.W.removeCallbacksAndMessages(null);
        super.onDestroy();
        Log.d("PlayerActivity", "onDestroy - handler cleaned up");
    }

    @Override // defpackage.c4, android.app.Activity
    public final void onStart() {
        super.onStart();
        MediaPlayer mediaPlayer = xs.a;
        g gVar = this.X;
        gVar.getClass();
        xs.p.add(gVar);
        w();
    }

    @Override // defpackage.c4, android.app.Activity
    public final void onStop() {
        MediaPlayer mediaPlayer = xs.a;
        g gVar = this.X;
        gVar.getClass();
        xs.p.remove(gVar);
        this.W.removeCallbacksAndMessages(null);
        super.onStop();
    }

    private void setupAudioPlayback(int index) {
        xs.videoMode = false;
        xs.setVideoSurface(null);
        this.videoSurfaceView.setVisibility(View.GONE);
        this.fullscreenButton.setVisibility(View.GONE);
        ((TextView) findViewById(R.id.player_header_title)).setText("MUSICMAN EVO");
        if (index != -1) {
            xs.d(this, index);
            s();
        }
        w();
    }

    private void setupVideoPlayback(int index) {
        boolean startNewVideo = xs.a == null || xs.i != index || !xs.videoMode;
        xs.videoMode = true;
        this.videoSurfaceView.setVisibility(View.VISIBLE);
        this.fullscreenButton.setVisibility(View.VISIBLE);
        ((TextView) findViewById(R.id.player_header_title)).setText("VIDEO PLAYER");
        if (startNewVideo && index != -1) xs.stopAndRelease();

        this.videoSurfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            private boolean started;

            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                xs.setVideoSurface(holder);
                if (startNewVideo && !started && index != -1) {
                    started = true;
                    xs.d(PlayerActivity.this, index);
                    s();
                }
                w();
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
                fitVideoSurface();
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                xs.setVideoSurface(null);
            }
        });
    }

    private void handleAbRepeat() {
        MediaPlayer player = xs.a;
        if (player == null || !xs.isPrepared) return;
        try {
            if (xs.u == -1) {
                xs.u = player.getCurrentPosition();
                Toast.makeText(this, "Point A set", Toast.LENGTH_SHORT).show();
            } else if (xs.v != -1) {
                xs.u = -1;
                xs.v = -1;
                xs.w = false;
                Toast.makeText(this, "A-B Loop cleared", Toast.LENGTH_SHORT).show();
            } else {
                int pointB = player.getCurrentPosition();
                if (pointB <= xs.u) {
                    Toast.makeText(this, "Point B must be after A", Toast.LENGTH_SHORT).show();
                    return;
                }
                xs.v = pointB;
                xs.w = true;
                Toast.makeText(this, "A-B Loop enabled", Toast.LENGTH_SHORT).show();
            }
            t();
        } catch (RuntimeException error) {
            Log.w("PlayerActivity", "Unable to update A-B repeat", error);
        }
    }

    private void seekRelative(int offsetMs) {
        MediaPlayer player = xs.a;
        if (player == null || !xs.isPrepared) return;
        try {
            int target = Math.max(0, Math.min(player.getDuration(), player.getCurrentPosition() + offsetMs));
            player.seekTo(target);
        } catch (RuntimeException error) {
            Log.w("PlayerActivity", "Unable to seek", error);
        }
    }

    private void adjustVideoContainer() {
        if (!this.videoPlayback || this.fullscreen || !xs.isPrepared || xs.a == null) return;
        int videoWidth = xs.a.getVideoWidth();
        int videoHeight = xs.a.getVideoHeight();
        if (videoWidth <= 0 || videoHeight <= 0) return;
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        int screenHeight = getResources().getDisplayMetrics().heightPixels;
        int availableWidth = screenWidth - dp(40);
        int desiredHeight = Math.round(availableWidth * (videoHeight / (float) videoWidth));
        int minimumHeight = dp(180);
        int maximumHeight = Math.max(minimumHeight, Math.round(screenHeight * 0.52f));
        normalVideoHeight = Math.max(minimumHeight, Math.min(desiredHeight, maximumHeight));
        ViewGroup.LayoutParams params = this.logoContainer.getLayoutParams();
        params.height = normalVideoHeight;
        this.logoContainer.setLayoutParams(params);
        this.logoContainer.post(this::fitVideoSurface);
    }

    private void fitVideoSurface() {
        if (!this.videoPlayback || xs.a == null || !xs.isPrepared) return;
        int videoWidth = xs.a.getVideoWidth();
        int videoHeight = xs.a.getVideoHeight();
        int containerWidth = this.logoContainer.getWidth();
        int containerHeight = this.logoContainer.getHeight();
        if (videoWidth <= 0 || videoHeight <= 0 || containerWidth <= 0 || containerHeight <= 0) return;
        float scale = Math.min(containerWidth / (float) videoWidth, containerHeight / (float) videoHeight);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                Math.max(1, Math.round(videoWidth * scale)),
                Math.max(1, Math.round(videoHeight * scale))
        );
        params.gravity = android.view.Gravity.CENTER;
        this.videoSurfaceView.setLayoutParams(params);
    }

    private void setVideoFullscreen(boolean enabled) {
        if (!this.videoPlayback) return;
        this.fullscreen = enabled;
        int[] controlledViews = {
                R.id.header, R.id.advanced_controls, R.id.extra_controls,
                R.id.info_container, R.id.progress_container, R.id.transport_controls
        };
        for (int id : controlledViews) findViewById(id).setVisibility(enabled ? View.GONE : View.VISIBLE);

        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) this.logoContainer.getLayoutParams();
        if (enabled) {
            if (normalVideoHeight <= 0) normalVideoHeight = params.height;
            params.removeRule(RelativeLayout.BELOW);
            params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            params.width = ViewGroup.LayoutParams.MATCH_PARENT;
            params.height = getResources().getDisplayMetrics().heightPixels;
            params.setMargins(0, 0, 0, 0);
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            );
            this.fullscreenButton.setContentDescription("Normal video");
        } else {
            params.removeRule(RelativeLayout.ALIGN_PARENT_TOP);
            params.addRule(RelativeLayout.BELOW, R.id.header);
            params.width = ViewGroup.LayoutParams.MATCH_PARENT;
            params.height = normalVideoHeight > 0 ? normalVideoHeight : dp(220);
            params.setMargins(dp(20), dp(5), dp(20), 0);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
            this.fullscreenButton.setContentDescription("Fullscreen video");
        }
        this.logoContainer.setLayoutParams(params);
        this.logoContainer.bringToFront();
        this.logoContainer.post(this::fitVideoSurface);
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    @Override
    public void onBackPressed() {
        if (this.fullscreen) setVideoFullscreen(false); else super.onBackPressed();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.fullscreen) {
            ViewGroup.LayoutParams params = this.logoContainer.getLayoutParams();
            params.height = getResources().getDisplayMetrics().heightPixels;
            this.logoContainer.setLayoutParams(params);
            this.logoContainer.post(this::fitVideoSurface);
        } else {
            adjustVideoContainer();
        }
    }

    public final void s() {
        try {
            Intent intent = new Intent(this, (Class<?>) MusicService.class);
            if (Build.VERSION.SDK_INT >= 26) {
                startForegroundService(intent);
            } else {
                startService(intent);
            }
        } catch (Exception e) {
            Log.e("PlayerActivity", "Error starting music service: " + e.getMessage(), e);
        }
    }

    public final void openTranspose(View view) {
        startActivity(new Intent(this, TransposeActivity.class));
    }

    public final void t() {
        TextView textView = this.Q;
        if (textView == null) {
            jn.k("tvPitchValue");
            throw null;
        }
        Locale locale = Locale.getDefault();
        MediaPlayer mediaPlayer = xs.a;
        textView.setText(String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(xs.t)}, 1)));
        TextView textView2 = this.T;
        if (textView2 == null) {
            jn.k("tvSpeedValue");
            throw null;
        }
        textView2.setText(String.format(Locale.getDefault(), "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(xs.s)}, 1)));
        boolean z = xs.w;
        Button button = this.N;
        if (z) {
            if (button == null) {
                jn.k("btnABRepeat");
                throw null;
            }
            button.setText("A-B ON");
            Button button2 = this.N;
            if (button2 != null) {
                button2.setTextColor(getColor(R.color.neon_purple));
                return;
            } else {
                jn.k("btnABRepeat");
                throw null;
            }
        }
        if (button == null) {
            jn.k("btnABRepeat");
            throw null;
        }
        button.setText(xs.u == -1 ? "A-B OFF" : "A-...");
        Button button3 = this.N;
        if (button3 != null) {
            button3.setTextColor(getColor(R.color.white));
        } else {
            jn.k("btnABRepeat");
            throw null;
        }
    }

    public final void u() {
        if (!xs.isPlaying()) {
            ImageButton imageButton = this.H;
            if (imageButton != null) {
                imageButton.setImageResource(android.R.drawable.ic_media_play);
                return;
            } else {
                jn.k("playPauseBtn");
                throw null;
            }
        }
        ImageButton imageButton2 = this.H;
        if (imageButton2 != null) {
            imageButton2.setImageResource(android.R.drawable.ic_media_pause);
        } else {
            jn.k("playPauseBtn");
            throw null;
        }
    }

    public final void v() {
        int color = getColor(R.color.neon_purple);
        int color2 = getColor(R.color.white);
        ImageButton imageButton = this.K;
        if (imageButton == null) {
            jn.k("shuffleBtn");
            throw null;
        }
        MediaPlayer mediaPlayer = xs.a;
        imageButton.setColorFilter(xs.q ? color : color2);
        int iOrdinal = xs.r.ordinal();
        if (iOrdinal == 0) {
            ImageButton imageButton2 = this.L;
            if (imageButton2 == null) {
                jn.k("repeatBtn");
                throw null;
            }
            imageButton2.setImageResource(android.R.drawable.ic_menu_rotate);
            ImageButton imageButton3 = this.L;
            if (imageButton3 != null) {
                imageButton3.setColorFilter(color2);
                return;
            } else {
                jn.k("repeatBtn");
                throw null;
            }
        }
        if (iOrdinal == 1) {
            ImageButton imageButton4 = this.L;
            if (imageButton4 == null) {
                jn.k("repeatBtn");
                throw null;
            }
            imageButton4.setImageResource(android.R.drawable.ic_menu_rotate);
            ImageButton imageButton5 = this.L;
            if (imageButton5 != null) {
                imageButton5.setColorFilter(color);
                return;
            } else {
                jn.k("repeatBtn");
                throw null;
            }
        }
        if (iOrdinal != 2) {
            throw new na();
        }
        ImageButton imageButton6 = this.L;
        if (imageButton6 == null) {
            jn.k("repeatBtn");
            throw null;
        }
        imageButton6.setImageResource(android.R.drawable.ic_menu_revert);
        ImageButton imageButton7 = this.L;
        if (imageButton7 != null) {
            imageButton7.setColorFilter(color);
        } else {
            jn.k("repeatBtn");
            throw null;
        }
    }

    public final void w() {
        if (xs.i == -1 || xs.h.isEmpty()) {
            return;
        }
        j10 j10Var = (j10) xs.h.get(xs.i);
        TextView textView = this.C;
        if (textView == null) {
            jn.k("songTitleTv");
            throw null;
        }
        textView.setText(j10Var.b);
        TextView textView2 = this.D;
        if (textView2 == null) {
            jn.k("artistNameTv");
            throw null;
        }
        textView2.setText(j10Var.c);
        MediaPlayer mediaPlayer = xs.a;
        if (mediaPlayer != null) {
            adjustVideoContainer();
            fitVideoSurface();
            u();
        }
        v();
        t();
        Handler handler = this.W;
        handler.removeCallbacksAndMessages(null);
        handler.post(new q7(7, this));
    }
}
