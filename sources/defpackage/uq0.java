package defpackage;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class uq0 {
    public static final ConditionVariable c = new ConditionVariable();
    public static volatile hb2 d = null;
    public static volatile Random e = null;
    public final nr0 a;
    public volatile Boolean b;

    public uq0(nr0 nr0Var) {
        this.a = nr0Var;
        nr0Var.b.execute(new q7(19, this));
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.b.booleanValue() || d == null) {
                return;
            }
            wo0 wo0VarZ = zo0.z();
            String packageName = this.a.a.getPackageName();
            wo0VarZ.b();
            ((zo0) wo0VarZ.g).A(packageName);
            wo0VarZ.b();
            ((zo0) wo0VarZ.g).B(j);
            if (str != null) {
                wo0VarZ.b();
                ((zo0) wo0VarZ.g).E(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                wo0VarZ.b();
                ((zo0) wo0VarZ.g).C(string);
                String name = exc.getClass().getName();
                wo0VarZ.b();
                ((zo0) wo0VarZ.g).D(name);
            }
            hb2 hb2Var = d;
            byte[] bArrB = ((zo0) wo0VarZ.c()).b();
            hb2Var.getClass();
            d6 d6Var = new d6(hb2Var, bArrB);
            d6Var.b = i;
            if (i2 != -1) {
                d6Var.a = i2;
            }
            d6Var.c();
        } catch (Exception unused) {
        }
    }
}
