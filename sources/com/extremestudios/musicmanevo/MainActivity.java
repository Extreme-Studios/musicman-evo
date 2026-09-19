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
import com.google.android.gms.ads.AdView;
import defpackage.c4;
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
public final class MainActivity extends c4 {
    public static final /* synthetic */ int J = 0;
    public ListView C;
    public final String[] D = {"Folders", "All Songs", "Playlists"};
    public RelativeLayout E;
    public TextView F;
    public TextView G;
    public ImageButton H;
    public AdView I;

    @Override // defpackage.c4, defpackage.xa, defpackage.wa, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        MediaPlayer mediaPlayer = xs.a;
        Log.d("MusicPlayer", "MusicPlayer initialized - effects will attach after MediaPlayer prepare");
        final int i = 1;
        ArrayList arrayList = new ArrayList(new e7(new String[]{"android.permission.RECORD_AUDIO"}, true));
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
        relativeLayout.setOnClickListener(new View.OnClickListener(this) { // from class: bq
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
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
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: bq
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
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
        View viewFindViewById7 = findViewById(R.id.bottom_banner_ad);
        viewFindViewById7.getClass();
        AdView adView = (AdView) viewFindViewById7;
        this.I = adView;
        adView.b(new q2(new p2(1)));
    }

    @Override // defpackage.c4, android.app.Activity
    public final void onDestroy() {
        AdView adView = this.I;
        if (adView != null) {
            if (adView == null) {
                jn.k("bannerAdView");
                throw null;
            }
            adView.a();
        }
        super.onDestroy();
    }

    @Override // defpackage.c4, android.app.Activity
    public final void onPause() {
        AdView adView = this.I;
        if (adView != null) {
            if (adView == null) {
                jn.k("bannerAdView");
                throw null;
            }
            adView.c();
        }
        super.onPause();
    }

    @Override // defpackage.c4, android.app.Activity
    public final void onResume() {
        super.onResume();
        r();
        AdView adView = this.I;
        if (adView != null) {
            if (adView != null) {
                adView.d();
            } else {
                jn.k("bannerAdView");
                throw null;
            }
        }
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
                imageButton.setImageResource(mediaPlayer.isPlaying() ? android.R.drawable.ic_media_pause : android.R.drawable.ic_media_play);
            } else {
                jn.k("miniPlayPauseBtn");
                throw null;
            }
        }
    }
}
