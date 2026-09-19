package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class js0 implements Callable {
    public final nr0 a;
    public final String b;
    public final String c;
    public final hp0 d;
    public Method e;
    public final int f;
    public final int g;

    public js0(nr0 nr0Var, String str, String str2, hp0 hp0Var, int i, int i2) {
        this.a = nr0Var;
        this.b = str;
        this.c = str2;
        this.d = hp0Var;
        this.f = i;
        this.g = i2;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            nr0 nr0Var = this.a;
            Method methodD = nr0Var.d(this.b, this.c);
            this.e = methodD;
            if (methodD == null) {
                return null;
            }
            a();
            uq0 uq0Var = nr0Var.k;
            if (uq0Var == null || (i = this.f) == Integer.MIN_VALUE) {
                return null;
            }
            uq0Var.a(this.g, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
