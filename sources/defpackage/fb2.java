package defpackage;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fb2 {
    public static final HashMap h = new HashMap();
    public final Context a;
    public final gb2 b;
    public final ga2 c;
    public final fa2 d;
    public final boolean e;
    public db2 f;
    public final Object g = new Object();

    public fb2(Context context, gb2 gb2Var, ga2 ga2Var, fa2 fa2Var, boolean z) {
        this.a = context;
        this.b = gb2Var;
        this.c = ga2Var;
        this.d = fa2Var;
        this.e = z;
    }

    public final boolean a(kd0 kd0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                db2 db2Var = new db2(c(kd0Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", kd0Var.m(), null, new Bundle(), 2), kd0Var, this.b, this.c, this.e);
                if (!db2Var.l()) {
                    throw new eb2("init failed", 4000);
                }
                int iN = db2Var.n();
                if (iN != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iN).length() + 4);
                    sb.append("ci: ");
                    sb.append(iN);
                    throw new eb2(sb.toString(), 4001);
                }
                synchronized (this.g) {
                    db2 db2Var2 = this.f;
                    if (db2Var2 != null) {
                        try {
                            db2Var2.m();
                        } catch (eb2 e) {
                            this.c.c(e.f, -1L, e);
                        }
                        this.f = db2Var;
                    } else {
                        this.f = db2Var;
                    }
                    throw th;
                }
                this.c.b(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new eb2(2004, e2);
            }
        } catch (eb2 e3) {
            this.c.c(e3.f, System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    public final db2 b() {
        db2 db2Var;
        synchronized (this.g) {
            db2Var = this.f;
        }
        return db2Var;
    }

    public final synchronized Class c(kd0 kd0Var) {
        try {
            ht0 ht0Var = (ht0) kd0Var.g;
            if (ht0Var == null) {
                throw new eb2("mc", 4010);
            }
            String strZ = ht0Var.z();
            HashMap map = h;
            Class cls = (Class) map.get(strZ);
            if (cls != null) {
                return cls;
            }
            try {
                fa2 fa2Var = this.d;
                File file = (File) kd0Var.h;
                fa2Var.getClass();
                if (!fa2.a(file)) {
                    throw new eb2("VM did not pass signature verification", 2026);
                }
                try {
                    File file2 = (File) kd0Var.i;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(((File) kd0Var.h).getAbsolutePath(), file2.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZ, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new eb2(2008, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new eb2(2008, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new eb2(2008, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new eb2(2026, e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
