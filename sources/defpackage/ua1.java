package defpackage;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ua1 implements yt0 {
    public final h73 g;
    public final un1 h;
    public final ta1 i;
    public final Object f = new Object();
    public final HashSet j = new HashSet();
    public final HashSet k = new HashSet();
    public boolean l = false;

    public ua1(String str, h73 h73Var) {
        this.i = new ta1(str, h73Var);
        this.g = h73Var;
        un1 un1Var = new un1(11);
        un1Var.g = BigInteger.ONE;
        un1Var.h = "0";
        this.h = un1Var;
    }

    @Override // defpackage.yt0
    public final void T(boolean z) {
        long j;
        int i;
        vc3.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        h73 h73Var = this.g;
        if (z) {
            h73Var.h();
            synchronized (h73Var.a) {
                j = h73Var.o;
            }
            long j2 = jCurrentTimeMillis - j;
            long jLongValue = ((Long) tu0.e.c.a(lx0.d1)).longValue();
            ta1 ta1Var = this.i;
            if (j2 > jLongValue) {
                ta1Var.d = -1;
            } else {
                h73Var.h();
                synchronized (h73Var.a) {
                    i = h73Var.q;
                }
                ta1Var.d = i;
            }
            this.l = true;
            return;
        }
        h73Var.h();
        synchronized (h73Var.a) {
            try {
                if (h73Var.o != jCurrentTimeMillis) {
                    h73Var.o = jCurrentTimeMillis;
                    SharedPreferences.Editor editor = h73Var.g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", jCurrentTimeMillis);
                        h73Var.g.apply();
                    }
                    h73Var.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = this.i.d;
        h73Var.h();
        synchronized (h73Var.a) {
            try {
                if (h73Var.q == i2) {
                    return;
                }
                h73Var.q = i2;
                SharedPreferences.Editor editor2 = h73Var.g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i2);
                    h73Var.g.apply();
                }
                h73Var.i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(pa1 pa1Var) {
        synchronized (this.f) {
            this.j.add(pa1Var);
        }
    }
}
