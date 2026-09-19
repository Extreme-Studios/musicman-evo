package com.extremestudios.musicmanevo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import defpackage.j10;
import defpackage.o0;
import defpackage.xs;

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
            // The recovered parent-activity metadata forms a cycle. A direct player intent
            // keeps notification startup constant-time and lets foreground promotion happen.
            Intent playerIntent = new Intent(this, (Class<?>) PlayerActivity.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            playerIntent.putExtra("SONG_INDEX", xs.i);
            playerIntent.putExtra("MEDIA_TYPE", xs.videoMode ? "video" : "audio");
            PendingIntent activities = PendingIntent.getActivity(
                    this,
                    0,
                    playerIntent,
                    PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
            );
            int i = xs.isPlaying() ? android.R.drawable.ic_media_pause : android.R.drawable.ic_media_play;
            androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(this, this.f)
                .setSmallIcon(android.R.drawable.ic_media_play)
                .setContentTitle(j10Var != null ? j10Var.b : "Musicman Evo")
                .setContentText(j10Var != null ? j10Var.c : "Extreme Studios")
                .setContentIntent(activities)
                .setDeleteIntent(b("DISMISS"))
                .addAction(android.R.drawable.ic_media_previous, "Previous", b("PREV"))
                .addAction(i, "Play/Pause", b("PLAY_PAUSE"))
                .addAction(android.R.drawable.ic_media_next, "Next", b("NEXT"))
                .addAction(android.R.drawable.ic_menu_close_clear_cancel, "Close", b("STOP"))
                // Android only permits three compact MediaStyle actions; Close remains expanded.
                .setStyle(new androidx.media.app.NotificationCompat.MediaStyle().setShowActionsInCompactView(0, 1, 2));
            Notification notificationB = builder.build();
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
                        xs.stopAndRelease();
                        stopForeground(1);
                        stopSelf();
                        return 2;
                    }
                    break;
                case -971121397:
                    if (action.equals("PLAY_PAUSE")) {
                        xs.togglePlayback();
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
                        xs.stopAndRelease();
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
