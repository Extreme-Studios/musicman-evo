package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ro1 {
    public int a;
    public hv1 b;
    public wz0 c;
    public View d;
    public List e;
    public y22 g;
    public Bundle h;
    public md1 i;
    public md1 j;
    public md1 k;
    public qw1 l;
    public hp m;
    public cb1 n;
    public View o;
    public View p;
    public rm q;
    public double r;
    public a01 s;
    public a01 t;
    public String u;
    public float x;
    public String y;
    public final q00 v = new q00(0);
    public final q00 w = new q00(0);
    public List f = Collections.EMPTY_LIST;

    public static ro1 l(v41 v41Var) {
        qo1 qo1Var;
        v41 v41Var2;
        try {
            hv1 hv1VarO = v41Var.o();
            if (hv1VarO == null) {
                v41Var2 = v41Var;
                qo1Var = null;
            } else {
                v41Var2 = v41Var;
                qo1Var = new qo1(hv1VarO, v41Var2);
            }
            return m(qo1Var, v41Var2.p(), (View) n(v41Var2.q()), v41Var2.b(), v41Var2.d(), v41Var2.e(), v41Var2.v2(), v41Var2.j(), (View) n(v41Var2.n()), v41Var2.D(), v41Var2.i(), v41Var2.m(), v41Var2.k(), v41Var2.f(), v41Var2.g(), v41Var2.X());
        } catch (RemoteException e) {
            jn.V("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static ro1 m(qo1 qo1Var, wz0 wz0Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, rm rmVar, String str4, String str5, double d, a01 a01Var, String str6, float f) {
        ro1 ro1Var = new ro1();
        ro1Var.a = 6;
        ro1Var.b = qo1Var;
        ro1Var.c = wz0Var;
        ro1Var.d = view;
        ro1Var.o("headline", str);
        ro1Var.e = list;
        ro1Var.o("body", str2);
        ro1Var.h = bundle;
        ro1Var.o("call_to_action", str3);
        ro1Var.o = view2;
        ro1Var.q = rmVar;
        ro1Var.o("store", str4);
        ro1Var.o("price", str5);
        ro1Var.r = d;
        ro1Var.s = a01Var;
        ro1Var.o("advertiser", str6);
        synchronized (ro1Var) {
            ro1Var.x = f;
        }
        return ro1Var;
    }

    public static Object n(rm rmVar) {
        if (rmVar == null) {
            return null;
        }
        return ju.Z0(rmVar);
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final a01 b() {
        List list = this.e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.e.get(0);
        if (obj instanceof IBinder) {
            return oz0.B3((IBinder) obj);
        }
        return null;
    }

    public final synchronized String c() {
        return p("body");
    }

    public final synchronized Bundle d() {
        try {
            if (this.h == null) {
                this.h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p("advertiser");
    }

    public final synchronized String g() {
        return this.u;
    }

    public final synchronized md1 h() {
        return this.i;
    }

    public final synchronized md1 i() {
        return this.j;
    }

    public final synchronized md1 j() {
        return this.k;
    }

    public final synchronized qw1 k() {
        return this.l;
    }

    public final synchronized void o(String str, String str2) {
        q00 q00Var = this.w;
        try {
            if (str2 == null) {
                q00Var.remove(str);
            } else {
                q00Var.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String p(String str) {
        return (String) this.w.get(str);
    }

    public final synchronized int q() {
        return this.a;
    }

    public final synchronized hv1 r() {
        return this.b;
    }

    public final synchronized wz0 s() {
        return this.c;
    }
}
