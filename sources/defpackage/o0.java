package defpackage;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o0 {
    public static /* synthetic */ NotificationChannel C(String str) {
        return new NotificationChannel(str, "Music Playback", 2);
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ AudioFocusRequest.Builder g() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest l(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ void r() {
    }
}
