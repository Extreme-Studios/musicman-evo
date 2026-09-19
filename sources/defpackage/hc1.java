package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hc1 implements Runnable {
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ qc1 j;

    public hc1(qc1 qc1Var, String str, String str2, int i, int i2) {
        this.f = str;
        this.g = str2;
        this.h = i;
        this.i = i2;
        this.j = qc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f);
        map.put("cachedSrc", this.g);
        map.put("bytesLoaded", Integer.toString(this.h));
        map.put("totalBytes", Integer.toString(this.i));
        map.put("cacheReady", "0");
        this.j.n(map);
    }
}
