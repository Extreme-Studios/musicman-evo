package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c22 implements wm2, g83 {
    public boolean f;
    public boolean g;
    public final Object h;
    public final Object i;
    public Object j;
    public Object k;

    public c22(b83 b83Var) {
        this.i = b83Var;
        e93 e93Var = new e93();
        e93Var.i = up0.d;
        this.h = e93Var;
        this.f = true;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.wm2
    public hp a() {
        s51 s51Var;
        s51 s51VarB;
        final e22 e22Var = (e22) this.h;
        String str = (String) this.i;
        final List list = (List) this.j;
        final Bundle bundle = (Bundle) this.k;
        boolean z = this.f;
        boolean z2 = this.g;
        final cb1 cb1Var = new cb1();
        if (z2) {
            if (((Boolean) tu0.e.c.a(lx0.M1)).booleanValue()) {
                try {
                    s51VarB = e22Var.g.b(str);
                } catch (RemoteException e) {
                    jn.w("Couldn't create RTB adapter : ", e);
                    s51Var = null;
                }
            } else {
                cz1 cz1Var = e22Var.f;
                cz1Var.getClass();
                try {
                    cz1Var.a.put(str, cz1Var.b.b(str));
                } catch (RemoteException e2) {
                    jn.w("Couldn't create RTB adapter : ", e2);
                }
                ConcurrentHashMap concurrentHashMap = cz1Var.a;
                s51VarB = concurrentHashMap.containsKey(str) ? (s51) concurrentHashMap.get(str) : null;
            }
            s51Var = s51VarB;
        } else {
            s51VarB = e22Var.g.b(str);
            s51Var = s51VarB;
        }
        if (s51Var == null) {
            ix0 ix0Var = lx0.C1;
            tu0 tu0Var = tu0.e;
            if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                throw null;
            }
            int i = gz1.j;
            synchronized (gz1.class) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("name", str);
                        jSONObject.put("signal_error", "Adapter failed to instantiate");
                        if (((Boolean) tu0Var.c.a(lx0.I1)).booleanValue()) {
                            jSONObject.put("signal_error_code", 1);
                        }
                        cb1Var.b(jSONObject);
                    } catch (JSONException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return cb1Var;
        }
        vc3.C.k.getClass();
        final gz1 gz1Var = new gz1(str, s51Var, cb1Var, SystemClock.elapsedRealtime());
        ix0 ix0Var2 = lx0.H1;
        tu0 tu0Var2 = tu0.e;
        if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
            e22Var.b.schedule(new ly1(1, gz1Var), ((Long) tu0Var2.c.a(lx0.A1)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (z) {
            if (!((Boolean) tu0Var2.c.a(lx0.O1)).booleanValue()) {
                s51Var.q3(new ju(e22Var.d), e22Var.j, bundle, (Bundle) list.get(0), e22Var.e.f, gz1Var);
                return cb1Var;
            }
            final s51 s51Var2 = s51Var;
            e22Var.a.a(new Runnable() { // from class: d22
                @Override // java.lang.Runnable
                public final void run() {
                    e22 e22Var2 = e22Var;
                    s51 s51Var3 = s51Var2;
                    Bundle bundle2 = bundle;
                    List list2 = list;
                    gz1 gz1Var2 = gz1Var;
                    try {
                        s51Var3.q3(new ju(e22Var2.d), e22Var2.j, bundle2, (Bundle) list2.get(0), e22Var2.e.f, gz1Var2);
                    } catch (RemoteException e3) {
                        cb1Var.c(e3);
                    }
                }
            });
            return cb1Var;
        }
        synchronized (gz1Var) {
            if (gz1Var.i) {
                return cb1Var;
            }
            try {
                if (((Boolean) tu0Var2.c.a(lx0.I1)).booleanValue()) {
                    gz1Var.g.put("signal_error_code", 0);
                }
            } catch (JSONException unused2) {
            }
            gz1Var.f.b(gz1Var.g);
            gz1Var.i = true;
            return cb1Var;
        }
    }

    @Override // defpackage.g83
    public void b(up0 up0Var) {
        g83 g83Var = (g83) this.k;
        if (g83Var != null) {
            g83Var.b(up0Var);
            up0Var = ((g83) this.k).g();
        }
        ((e93) this.h).b(up0Var);
    }

    public void c(yc3 yc3Var) {
        g83 g83Var;
        g83 g83VarM0 = yc3Var.m0();
        if (g83VarM0 == null || g83VarM0 == (g83Var = (g83) this.k)) {
            return;
        }
        if (g83Var != null) {
            throw new q43(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.k = g83VarM0;
        this.j = yc3Var;
        ((rb3) g83VarM0).b(((e93) this.h).i);
    }

    @Override // defpackage.g83
    public long e() {
        if (this.f) {
            return ((e93) this.h).e();
        }
        g83 g83Var = (g83) this.k;
        g83Var.getClass();
        return g83Var.e();
    }

    @Override // defpackage.g83
    public boolean f() {
        if (this.f) {
            return false;
        }
        g83 g83Var = (g83) this.k;
        g83Var.getClass();
        return g83Var.f();
    }

    @Override // defpackage.g83
    public up0 g() {
        g83 g83Var = (g83) this.k;
        return g83Var != null ? g83Var.g() : ((e93) this.h).i;
    }

    public /* synthetic */ c22(e22 e22Var, String str, List list, Bundle bundle, boolean z, boolean z2) {
        this.h = e22Var;
        this.i = str;
        this.j = list;
        this.k = bundle;
        this.f = z;
        this.g = z2;
    }
}
