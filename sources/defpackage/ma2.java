package defpackage;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ma2 {
    public final Context a;
    public final Looper b;

    public ma2(Context context, Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void a(String str) {
        qa2 qa2VarZ = ra2.z();
        Context context = this.a;
        String packageName = context.getPackageName();
        qa2VarZ.b();
        ((ra2) qa2VarZ.g).A(packageName);
        qa2VarZ.b();
        ((ra2) qa2VarZ.g).C(2);
        oa2 oa2VarZ = pa2.z();
        oa2VarZ.b();
        ((pa2) oa2VarZ.g).A(str);
        oa2VarZ.b();
        ((pa2) oa2VarZ.g).B(2);
        qa2VarZ.b();
        ((ra2) qa2VarZ.g).B((pa2) oa2VarZ.c());
        dd1 dd1Var = new dd1(context, this.b, (ra2) qa2VarZ.c());
        synchronized (dd1Var.j) {
            try {
                if (!dd1Var.f) {
                    dd1Var.f = true;
                    ((va2) dd1Var.h).m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
