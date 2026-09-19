package defpackage;

import android.content.Context;
import android.os.Binder;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e72 implements Runnable {
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static final Object q = new Object();
    public static Boolean r;
    public final Context f;
    public final d60 g;
    public int j;
    public final qr1 k;
    public final List l;
    public final se1 m;
    public final i72 h = l72.A();
    public String i = "";
    public boolean n = false;

    public e72(Context context, d60 d60Var, qr1 qr1Var, zf0 zf0Var, se1 se1Var) {
        this.f = context;
        this.g = d60Var;
        this.k = qr1Var;
        this.m = se1Var;
        if (((Boolean) tu0.e.c.a(lx0.y9)).booleanValue()) {
            this.l = zb3.H();
        } else {
            tj2 tj2Var = vj2.g;
            this.l = qk2.j;
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (o) {
            try {
                if (r == null) {
                    if (((Boolean) my0.b.u()).booleanValue()) {
                        r = Boolean.valueOf(Math.random() < ((Double) my0.a.u()).doubleValue());
                    } else {
                        r = Boolean.FALSE;
                    }
                }
                zBooleanValue = r.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void b(c72 c72Var) {
        za1.a.a(new u52(this, 2, c72Var));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrB;
        if (a()) {
            Object obj = p;
            synchronized (obj) {
                try {
                    if (((l72) this.h.g).z() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            i72 i72Var = this.h;
                            bArrB = ((l72) i72Var.c()).b();
                            i72Var.b();
                            ((l72) i72Var.g).C();
                        }
                        qv1 qv1Var = new qv1((String) tu0.e.c.a(lx0.s9), 60000, new HashMap(), bArrB, "application/x-protobuf");
                        Context context = this.f;
                        String str = this.g.f;
                        Binder.getCallingUid();
                        new xc(context, str, null).b(qv1Var);
                    } catch (Exception e) {
                        if ((e instanceof au1) && ((au1) e).f == 3) {
                            return;
                        }
                        vc3.C.h.e("CuiMonitor.sendCuiPing", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
