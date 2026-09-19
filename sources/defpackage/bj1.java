package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bj1 implements fm1, yk1 {
    public final ae f;
    public final cj1 g;
    public final i52 h;
    public final String i;

    public bj1(ae aeVar, cj1 cj1Var, i52 i52Var, String str) {
        this.f = aeVar;
        this.g = cj1Var;
        this.h = i52Var;
        this.i = str;
    }

    @Override // defpackage.fm1
    public final void a() {
        this.f.getClass();
        this.g.c.put(this.i, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // defpackage.yk1
    public final void e() {
        this.f.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.h.g;
        cj1 cj1Var = this.g;
        ConcurrentHashMap concurrentHashMap = cj1Var.c;
        String str2 = this.i;
        Long l = (Long) concurrentHashMap.get(str2);
        if (l == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        cj1Var.d.put(str, Long.valueOf(jElapsedRealtime - l.longValue()));
    }
}
