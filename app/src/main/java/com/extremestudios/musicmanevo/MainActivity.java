package com.extremestudios.musicmanevo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.extremestudios.musicmanevo.MainActivity;
import com.extremestudios.musicmanevo.MusicService;
import com.extremestudios.musicmanevo.PlayerActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.dq;
import defpackage.e7;
import defpackage.j10;
import defpackage.jn;
import defpackage.ni;
import defpackage.oi;
import defpackage.p2;
import defpackage.q2;
import defpackage.xs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AppCompatActivity {
    public static final /* synthetic */ int J = 0;
    public ListView C;
    public final String[] D = {"Folders", "All Songs", "Playlists"};
    public RelativeLayout E;
    public TextView F;
    public TextView G;
    public ImageButton H;

    @Override // defpackage.c4, defpackage.xa, defpackage.wa, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        try {
            MobileAds.initialize(this, initializationStatus -> { });
            AdView bannerAd = (AdView) findViewById(R.id.banner_ad);
            bannerAd.setVisibility(View.VISIBLE);
            bannerAd.loadAd(new AdRequest.Builder().build());
        } catch (RuntimeException error) {
            Log.w("MusicmanAds", "Banner unavailable", error);
        }
        MediaPlayer mediaPlayer = xs.a;
        Log.d("MusicPlayer", "MusicPlayer initialized - effects will attach after MediaPlayer prepare");
        final int i = 1;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList.add("android.permission.READ_MEDIA_AUDIO");
        } else {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        final int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (dq.h(this, (String) obj) != 0) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            dq.n(this, (String[]) arrayList2.toArray(new String[0]), 100);
        }
        View viewFindViewById = findViewById(R.id.menu_list);
        viewFindViewById.getClass();
        this.C = (ListView) viewFindViewById;
        oi oiVar = new oi(this, this.D);
        ListView listView = this.C;
        if (listView == null) {
            jn.k("menuList");
            throw null;
        }
        listView.setAdapter((ListAdapter) oiVar);
        ListView listView2 = this.C;
        if (listView2 == null) {
            jn.k("menuList");
            throw null;
        }
        listView2.setOnItemClickListener(new ni(this, i));
        View viewFindViewById2 = findViewById(R.id.mini_player);
        viewFindViewById2.getClass();
        this.E = (RelativeLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.mini_song_title);
        viewFindViewById3.getClass();
        this.F = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.mini_artist_name);
        viewFindViewById4.getClass();
        this.G = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.mini_play_pause);
        viewFindViewById5.getClass();
        this.H = (ImageButton) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.mini_album_art);
        viewFindViewById6.getClass();
        RelativeLayout relativeLayout = this.E;
        if (relativeLayout == null) {
            jn.k("miniPlayer");
            throw null;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: bq
            public final /* synthetic */ MainActivity g;

            {
                this.g = MainActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                MainActivity mainActivity = this.g;
                switch (i4) {
                    case 0:
                        int i5 = MainActivity.J;
                        if (xs.i != -1) {
                            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) PlayerActivity.class));
                        }
                        break;
                    default:
                        int i6 = MainActivity.J;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (mediaPlayer2.isPlaying()) {
                                mediaPlayer2.pause();
                            } else {
                                mediaPlayer2.start();
                            }
                            mainActivity.r();
                            try {
                                Intent intent = new Intent(mainActivity, (Class<?>) MusicService.class);
                                if (Build.VERSION.SDK_INT >= 26) {
                                    mainActivity.startForegroundService(intent);
                                } else {
                                    mainActivity.startService(intent);
                                }
                            } catch (Exception e) {
                                Log.e("MainActivity", "Error starting music service: " + e.getMessage(), e);
                                return;
                            }
                        }
                        break;
                }
            }
        });
        ImageButton imageButton = this.H;
        if (imageButton == null) {
            jn.k("miniPlayPauseBtn");
            throw null;
        }
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: bq
            public final /* synthetic */ MainActivity g;

            {
                this.g = MainActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                MainActivity mainActivity = this.g;
                switch (i4) {
                    case 0:
                        int i5 = MainActivity.J;
                        if (xs.i != -1) {
                            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) PlayerActivity.class));
                        }
                        break;
                    default:
                        int i6 = MainActivity.J;
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (mediaPlayer2.isPlaying()) {
                                mediaPlayer2.pause();
                            } else {
                                mediaPlayer2.start();
                            }
                            mainActivity.r();
                            try {
                                Intent intent = new Intent(mainActivity, (Class<?>) MusicService.class);
                                if (Build.VERSION.SDK_INT >= 26) {
                                    mainActivity.startForegroundService(intent);
                                } else {
                                    mainActivity.startService(intent);
                                }
                            } catch (Exception e) {
                                Log.e("MainActivity", "Error starting music service: " + e.getMessage(), e);
                                return;
                            }
                        }
                        break;
                }
            }
        });
        relativeLayout.setOnClickListener(view -> {
            if (xs.i == -1) return;
            Intent playerIntent = new Intent(this, PlayerActivity.class);
            playerIntent.putExtra("SONG_INDEX", xs.i);
            playerIntent.putExtra("MEDIA_TYPE", xs.videoMode ? "video" : "audio");
            startActivity(playerIntent);
        });
        imageButton.setOnClickListener(view -> {
            if (xs.togglePlayback()) {
                r();
                try {
                    Intent serviceIntent = new Intent(this, MusicService.class);
                    if (Build.VERSION.SDK_INT >= 26) startForegroundService(serviceIntent);
                    else startService(serviceIntent);
                } catch (RuntimeException error) {
                    Log.e("MainActivity", "Unable to update playback service", error);
                }
            }
        });
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        r();
    }

    public final void r() {
        if (xs.i == -1 || xs.h.isEmpty()) {
            RelativeLayout relativeLayout = this.E;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
                return;
            } else {
                jn.k("miniPlayer");
                throw null;
            }
        }
        j10 j10Var = (j10) xs.h.get(xs.i);
        TextView textView = this.F;
        if (textView == null) {
            jn.k("miniSongTitle");
            throw null;
        }
        textView.setText(j10Var.b);
        TextView textView2 = this.G;
        if (textView2 == null) {
            jn.k("miniArtistName");
            throw null;
        }
        textView2.setText(j10Var.c);
        RelativeLayout relativeLayout2 = this.E;
        if (relativeLayout2 == null) {
            jn.k("miniPlayer");
            throw null;
        }
        relativeLayout2.setVisibility(0);
        MediaPlayer mediaPlayer = xs.a;
        if (mediaPlayer != null) {
            ImageButton imageButton = this.H;
            if (imageButton != null) {
                imageButton.setImageResource(xs.isPlaying() ? android.R.drawable.ic_media_pause : android.R.drawable.ic_media_play);
            } else {
                jn.k("miniPlayPauseBtn");
                throw null;
            }
        }
    }

    public final void openTranspose(View view) {
        startActivity(new Intent(this, TransposeActivity.class));
    }
}
