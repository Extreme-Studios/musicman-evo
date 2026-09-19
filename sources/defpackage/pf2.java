package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class pf2 implements of2 {
    public final String a;
    public final String b;
    public final cf2 c;
    public final hp0 d;
    public final ch2 e;

    public pf2(String str, String str2, hp0 hp0Var, cf2 cf2Var, ch2 ch2Var) {
        this.a = str;
        this.b = str2;
        this.d = hp0Var;
        this.c = cf2Var;
        this.e = ch2Var;
    }

    public abstract void a(Method method, hp0 hp0Var);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ch2 ch2Var = this.e;
        try {
            ch2Var.a();
            Method methodB = this.c.b(this.a, this.b);
            if (methodB != null) {
                a(methodB, this.d);
            }
            ch2Var.c();
            return null;
        } catch (Throwable th) {
            try {
                ch2Var.b(th);
                throw th;
            } catch (Throwable th2) {
                ch2Var.c();
                throw th2;
            }
        }
    }
}
