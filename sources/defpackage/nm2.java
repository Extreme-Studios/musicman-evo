package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class nm2 implements hp {
    public static final Object i = new Object();
    public static final nn2 j = new nn2(fm2.class);
    public static final boolean k;
    public static final ss0 l;
    public volatile Object f;
    public volatile cm2 g;
    public volatile mm2 h;

    static {
        boolean z;
        ss0 hm2Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        k = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                hm2Var = new lm2();
            } catch (Error | Exception e) {
                try {
                    hm2Var = new gm2();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    hm2Var = new hm2();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                hm2Var = new gm2();
            } catch (NoClassDefFoundError unused2) {
                hm2Var = new hm2();
            }
        }
        th = null;
        th2 = null;
        l = hm2Var;
        if (th != null) {
            nn2 nn2Var = j;
            Logger loggerA = nn2Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            nn2Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(mm2 mm2Var) {
        mm2Var.a = null;
        while (true) {
            mm2 mm2Var2 = this.h;
            if (mm2Var2 != mm2.c) {
                mm2 mm2Var3 = null;
                while (mm2Var2 != null) {
                    mm2 mm2Var4 = mm2Var2.b;
                    if (mm2Var2.a != null) {
                        mm2Var3 = mm2Var2;
                    } else if (mm2Var3 != null) {
                        mm2Var3.b = mm2Var4;
                        if (mm2Var3.a == null) {
                        }
                    } else if (!l.R(this, mm2Var2, mm2Var4)) {
                    }
                    mm2Var2 = mm2Var4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable c();
}
