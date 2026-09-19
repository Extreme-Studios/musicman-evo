package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class e93 implements g83 {
    public boolean f;
    public long g;
    public long h;
    public up0 i;

    public final void a(long j) {
        this.g = j;
        if (this.f) {
            this.h = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.g83
    public final void b(up0 up0Var) {
        if (this.f) {
            a(e());
        }
        this.i = up0Var;
    }

    @Override // defpackage.g83
    public final long e() {
        long j = this.g;
        if (!this.f) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.h;
        up0 up0Var = this.i;
        return (up0Var.a == 1.0f ? qz1.r(jElapsedRealtime) : jElapsedRealtime * ((long) up0Var.c)) + j;
    }

    @Override // defpackage.g83
    public final up0 g() {
        return this.i;
    }
}
