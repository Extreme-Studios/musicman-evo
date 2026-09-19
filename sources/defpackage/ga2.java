package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ga2 {
    public static volatile int e = 1;
    public final Context a;
    public final Executor b;
    public final ve3 c;
    public final boolean d;

    public ga2(Context context, Executor executor, ve3 ve3Var, boolean z) {
        this.a = context;
        this.b = executor;
        this.c = ve3Var;
        this.d = z;
    }

    public static ga2 a(Context context, Executor executor, boolean z) {
        k30 k30Var = new k30();
        if (z) {
            executor.execute(new u52(context, 6, k30Var));
        } else {
            executor.execute(new ly1(17, k30Var));
        }
        return new ga2(context, executor, k30Var.a, z);
    }

    public void b(int i, long j) {
        e(i, j, null, null, null);
    }

    public void c(int i, long j, Exception exc) {
        e(i, j, exc, null, null);
    }

    public void d(String str, int i) {
        e(i, 0L, null, null, str);
    }

    public final ve3 e(int i, long j, Exception exc, String str, String str2) {
        int i2 = 0;
        if (!this.d) {
            ve3 ve3Var = this.c;
            Executor executor = this.b;
            fl1 fl1Var = fl1.B;
            ve3Var.getClass();
            ve3 ve3Var2 = new ve3();
            ve3Var.b.b(new tk1(executor, fl1Var, ve3Var2, i2));
            ve3Var.h();
            return ve3Var2;
        }
        Context context = this.a;
        wo0 wo0VarZ = zo0.z();
        String packageName = context.getPackageName();
        wo0VarZ.b();
        ((zo0) wo0VarZ.g).A(packageName);
        wo0VarZ.b();
        ((zo0) wo0VarZ.g).B(j);
        int i3 = e;
        wo0VarZ.b();
        ((zo0) wo0VarZ.g).G(i3);
        if (exc != null) {
            Object obj = ni2.a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            wo0VarZ.b();
            ((zo0) wo0VarZ.g).C(string);
            String name = exc.getClass().getName();
            wo0VarZ.b();
            ((zo0) wo0VarZ.g).D(name);
        }
        if (str2 != null) {
            wo0VarZ.b();
            ((zo0) wo0VarZ.g).E(str2);
        }
        if (str != null) {
            wo0VarZ.b();
            ((zo0) wo0VarZ.g).F(str);
        }
        ve3 ve3Var3 = this.c;
        Executor executor2 = this.b;
        e3 e3Var = new e3(i, 13, wo0VarZ);
        ve3Var3.getClass();
        ve3 ve3Var4 = new ve3();
        ve3Var3.b.b(new tk1(executor2, e3Var, ve3Var4, i2));
        ve3Var3.h();
        return ve3Var4;
    }
}
