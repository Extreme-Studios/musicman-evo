package com.extremestudios.musicmanevo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.extremestudios.musicmanevo.SplashActivity;
import defpackage.c4;
import defpackage.m4;
import defpackage.x1;

/* JADX INFO: loaded from: classes.dex */
public final class SplashActivity extends c4 {
    public static final /* synthetic */ int C = 0;

    @Override // defpackage.c4, defpackage.xa, defpackage.wa, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        final TextView textView = (TextView) findViewById(R.id.txt_musicman);
        final TextView textView2 = (TextView) findViewById(R.id.txt_evo);
        TextView textView3 = (TextView) findViewById(R.id.txt_subtitle);
        View viewFindViewById = findViewById(R.id.pulse_circle_1);
        View viewFindViewById2 = findViewById(R.id.pulse_circle_2);
        View viewFindViewById3 = findViewById(R.id.pulse_circle_3);
        ((TextView) findViewById(R.id.txt_version)).setText("Version 1.2.7");
        final Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        final Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        viewFindViewById.getClass();
        r(viewFindViewById, 0L);
        viewFindViewById2.getClass();
        r(viewFindViewById2, 300L);
        viewFindViewById3.getClass();
        r(viewFindViewById3, 600L);
        final int i = 0;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p10
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                Animation animation = animationLoadAnimation;
                TextView textView4 = textView;
                switch (i2) {
                    case 0:
                        int i3 = SplashActivity.C;
                        textView4.setVisibility(0);
                        textView4.startAnimation(animation);
                        break;
                    default:
                        int i4 = SplashActivity.C;
                        textView4.setVisibility(0);
                        textView4.startAnimation(animation);
                        break;
                }
            }
        }, 500L);
        final int i2 = 1;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p10
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                Animation animation = animationLoadAnimation2;
                TextView textView4 = textView2;
                switch (i3) {
                    case 0:
                        int i4 = SplashActivity.C;
                        textView4.setVisibility(0);
                        textView4.startAnimation(animation);
                        break;
                    default:
                        int i5 = SplashActivity.C;
                        textView4.setVisibility(0);
                        textView4.startAnimation(animation);
                        break;
                }
            }
        }, 800L);
        new Handler(Looper.getMainLooper()).postDelayed(new x1(10, textView3), 1500L);
        new Handler(Looper.getMainLooper()).postDelayed(new x1(11, this), 4500L);
    }

    public final void r(View view, long j) {
        view.animate().scaleX(1.5f).scaleY(1.5f).alpha(0.0f).setDuration(1500L).setStartDelay(j).withEndAction(new m4(view, 2, this)).start();
    }
}
