package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ta1 {
    public final String g;
    public final h73 h;
    public long a = -1;
    public long b = -1;
    public int c = -1;
    public int d = -1;
    public long e = 0;
    public final Object f = new Object();
    public int i = 0;
    public int j = 0;
    public int k = 0;

    public ta1(String str, h73 h73Var) {
        this.g = str;
        this.h = h73Var;
    }

    public final void a(f93 f93Var, long j) {
        long j2;
        long j3;
        Bundle bundle;
        int i;
        synchronized (this.f) {
            try {
                h73 h73Var = this.h;
                h73Var.h();
                synchronized (h73Var.a) {
                    j2 = h73Var.o;
                }
                vc3.C.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.b == -1) {
                    if (jCurrentTimeMillis - j2 > ((Long) tu0.e.c.a(lx0.d1)).longValue()) {
                        this.d = -1;
                    } else {
                        h73Var.h();
                        synchronized (h73Var.a) {
                            i = h73Var.q;
                        }
                        this.d = i;
                    }
                    this.b = j;
                    this.a = j;
                } else {
                    this.a = j;
                }
                if (((Boolean) tu0.e.c.a(lx0.W3)).booleanValue() || (bundle = f93Var.h) == null || bundle.getInt("gw", 2) != 1) {
                    this.c++;
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 == 0) {
                        this.e = 0L;
                        h73Var.n(jCurrentTimeMillis);
                    } else {
                        h73Var.h();
                        synchronized (h73Var.a) {
                            j3 = h73Var.p;
                        }
                        this.e = jCurrentTimeMillis - j3;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) bz0.a.u()).booleanValue()) {
            synchronized (this.f) {
                this.c--;
                this.d--;
            }
        }
    }
}
