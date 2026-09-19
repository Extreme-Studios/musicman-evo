package defpackage;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e92 implements Runnable {
    public final /* synthetic */ float f;
    public final /* synthetic */ ly1 g;

    public e92(ly1 ly1Var, float f) {
        this.f = f;
        this.g = ly1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p92 p92Var = ((f92) this.g.g).g;
        float f = this.f;
        p92Var.a = f;
        if (p92Var.c == null) {
            p92Var.c = i92.c;
        }
        Iterator it = Collections.unmodifiableCollection(p92Var.c.b).iterator();
        while (it.hasNext()) {
            r92 r92Var = ((x82) it.next()).d;
            gm.m.p(r92Var.c(), "setDeviceVolume", Float.valueOf(f), r92Var.a);
        }
    }
}
