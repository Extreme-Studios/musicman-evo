package com.extremestudios.musicmanevo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import defpackage.fu;
import defpackage.gu;
import defpackage.j10;
import defpackage.o0;
import defpackage.w40;
import defpackage.xs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MusicService extends Service {
    public final String f = "MusicmanEvoChannel";
    public final int g = 1;

    public final void a() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                o0.r();
                ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(o0.C(this.f));
            } catch (Exception e) {
                Log.e("MusicService", "Error creating notification channel: " + e.getMessage(), e);
            }
        }
    }

    public final PendingIntent b(String str) {
        Intent intent = new Intent(this, (Class<?>) MusicService.class);
        intent.setAction(str);
        PendingIntent service = PendingIntent.getService(this, 0, intent, 67108864);
        service.getClass();
        return service;
    }

    public final void c() {
        try {
            a();
            j10 j10Var = (xs.i == -1 || xs.h.isEmpty()) ? null : (j10) xs.h.get(xs.i);
            Intent intent = new Intent(this, (Class<?>) PlayerActivity.class);
            ArrayList arrayList = new ArrayList();
            Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
            ComponentName component = intent2.getComponent();
            if (component == null) {
                component = intent2.resolveActivity(getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    Intent intentU = w40.u(this, component);
                    while (intentU != null) {
                        arrayList.add(size, intentU);
                        intentU = w40.u(this, intentU.getComponent());
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(intent2);
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            PendingIntent activities = PendingIntent.getActivities(this, 0, intentArr, 201326592, null);
            MediaPlayer mediaPlayer = xs.a;
            int i = (mediaPlayer == null || !mediaPlayer.isPlaying()) ? 17301540 : android.R.drawable.ic_media_pause;
            gu guVar = new gu(this, this.f);
            Notification notification = guVar.p;
            notification.icon = android.R.drawable.ic_media_play;
            guVar.e = gu.c(j10Var != null ? j10Var.b : "Musicman Evo");
            guVar.f = gu.c(j10Var != null ? j10Var.c : "Extreme Studios");
            guVar.g = activities;
            notification.deleteIntent = b("DISMISS");
            guVar.a(android.R.drawable.ic_media_previous, "Previous", b("PREV"));
            guVar.a(i, "Play/Pause", b("PLAY_PAUSE"));
            guVar.a(android.R.drawable.ic_media_next, "Next", b("NEXT"));
            guVar.a(android.R.drawable.ic_menu_close_clear_cancel, "Close", b("STOP"));
            fu fuVar = new fu(1);
            fuVar.i = new int[]{0, 1, 2, 3};
            guVar.f(fuVar);
            guVar.i = -1;
            guVar.d(2, false);
            Notification notificationB = guVar.b();
            notificationB.getClass();
            startForeground(this.g, notificationB);
        } catch (Exception e2) {
            Log.e("MusicService", "Error showing notification: " + e2.getMessage(), e2);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            switch (action.hashCode()) {
                case -1905312150:
                    if (action.equals("DISMISS")) {
                        try {
                            MediaPlayer mediaPlayer = xs.a;
                            if (mediaPlayer != null) {
                                if (mediaPlayer.isPlaying()) {
                                    mediaPlayer.stop();
                                }
                                mediaPlayer.release();
                            }
                            xs.a = null;
                            break;
                        } catch (Exception unused) {
                        }
                        stopForeground(1);
                        stopSelf();
                        return 2;
                    }
                    break;
                case -971121397:
                    if (action.equals("PLAY_PAUSE")) {
                        MediaPlayer mediaPlayer2 = xs.a;
                        if (mediaPlayer2 != null) {
                            if (mediaPlayer2.isPlaying()) {
                                mediaPlayer2.pause();
                            } else {
                                mediaPlayer2.start();
                            }
                        }
                        c();
                        return 2;
                    }
                    break;
                case 2392819:
                    if (action.equals("NEXT")) {
                        xs.b(this);
                        c();
                        return 2;
                    }
                    break;
                case 2464307:
                    if (action.equals("PREV")) {
                        xs.c(this);
                        c();
                        return 2;
                    }
                    break;
                case 2555906:
                    if (action.equals("STOP")) {
                        try {
                            MediaPlayer mediaPlayer3 = xs.a;
                            if (mediaPlayer3 != null) {
                                if (mediaPlayer3.isPlaying()) {
                                    mediaPlayer3.stop();
                                }
                                mediaPlayer3.release();
                            }
                            xs.a = null;
                            break;
                        } catch (Exception unused2) {
                        }
                        stopForeground(1);
                        stopSelf();
                        return 2;
                    }
                    break;
            }
        }
        c();
        return 2;
    }
}
