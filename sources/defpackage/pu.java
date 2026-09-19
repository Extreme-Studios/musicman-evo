package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class pu implements OnBackAnimationCallback {
    public final /* synthetic */ cl a;
    public final /* synthetic */ cl b;
    public final /* synthetic */ rk c;
    public final /* synthetic */ rk d;

    public pu(cl clVar, cl clVar2, rk rkVar, rk rkVar2) {
        this.a = clVar;
        this.b = clVar2;
        this.c = rkVar;
        this.d = rkVar2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.h(new r7(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.h(new r7(backEvent));
    }
}
