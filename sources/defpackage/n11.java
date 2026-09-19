package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n11 {
    public static nm0 a;
    public static final Object b = new Object();

    public n11(Context context) {
        nm0 nm0Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (b) {
            try {
                if (a == null) {
                    lx0.a(context);
                    if (((Boolean) tu0.e.c.a(lx0.P4)).booleanValue()) {
                        nm0Var = lr0.L(context);
                    } else {
                        nm0Var = new nm0(new ym0(new un1(context.getApplicationContext(), 9)), new z61(new zf0(2)));
                        nm0Var.a();
                    }
                    a = nm0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final sz0 a(int i, String str, HashMap map, byte[] bArr) {
        sz0 sz0Var = new sz0();
        un1 un1Var = new un1(this, str, sz0Var, 10);
        o83 o83Var = new o83();
        xy0 xy0Var = new xy0(this, i, str, sz0Var, un1Var, bArr, map, o83Var);
        if (o83.c()) {
            try {
                Map mapE = xy0Var.e();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (o83.c()) {
                    o83Var.e("onNetworkRequest", new u40(str, "GET", mapE, bArr2, 22, false));
                }
            } catch (cm0 e) {
                jn.T(e.getMessage());
            }
        }
        a.b(xy0Var);
        return sz0Var;
    }
}
