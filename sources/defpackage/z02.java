package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class z02 {
    public final hp a;
    public final long b;
    public final ae c;

    public z02(hp hpVar, long j, ae aeVar) {
        this.a = hpVar;
        this.c = aeVar;
        aeVar.getClass();
        this.b = SystemClock.elapsedRealtime() + j;
    }
}
