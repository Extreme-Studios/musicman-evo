package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class if1 {
    public static if1 P0;
    public final q63 A;
    public final q63 A0;
    public final q63 B;
    public final dg1 B0;
    public final q63 C;
    public final q63 C0;
    public final s63 D;
    public final q63 D0;
    public final q63 E;
    public final q63 E0;
    public final yf1 F;
    public final tt0 F0;
    public final q63 G;
    public final q63 G0;
    public final q63 H;
    public final rh1 H0;
    public final q63 I;
    public final q63 I0;
    public final q63 J;
    public final q63 J0;
    public final q63 K;
    public final q63 K0;
    public final q63 L;
    public final q63 L0;
    public final q63 M;
    public final q63 M0;
    public final q63 N;
    public final q63 N0;
    public final q63 O;
    public final q63 O0;
    public final q63 P;
    public final q63 Q;
    public final df1 R;
    public final gf1 S;
    public final q63 T;
    public final q63 U;
    public final ff1 V;
    public final q63 W;
    public final ve1 X;
    public final q63 Y;
    public final q63 Z;
    public final ue1 a;
    public final q63 a0;
    public final if1 b = this;
    public final q63 b0;
    public final q63 c;
    public final v12 c0;
    public final q63 d;
    public final q63 d0;
    public final q63 e;
    public final q63 e0;
    public final q63 f;
    public final x02 f0;
    public final xe1 g;
    public final q63 g0;
    public final ef1 h;
    public final h22 h0;
    public final q63 i;
    public final q63 i0;
    public final q63 j;
    public final t22 j0;
    public final q63 k;
    public final q63 k0;
    public final q63 l;
    public final q63 l0;
    public final q63 m;
    public final q63 m0;
    public final q63 n;
    public final q63 n0;
    public final q63 o;
    public final q63 o0;
    public final q63 p;
    public final n02 p0;
    public final q63 q;
    public final q63 q0;
    public final q63 r;
    public final zz1 r0;
    public final q63 s;
    public final q63 s0;
    public final q63 t;
    public final t02 t0;
    public final q63 u;
    public final q63 u0;
    public final q63 v;
    public final q63 v0;
    public final q63 w;
    public final o12 w0;
    public final q63 x;
    public final q63 x0;
    public final af1 y;
    public final q63 y0;
    public final q63 z;
    public final q63 z0;

    public if1(ue1 ue1Var, zf0 zf0Var) {
        this.a = ue1Var;
        q63 q63VarA = q63.a(jn.l);
        this.c = q63VarA;
        q63 q63VarA2 = q63.a(new jt1(q63.a(rs0.t), 11));
        this.d = q63VarA2;
        this.e = q63.a(ar.m);
        int i = 5;
        q63 q63VarA3 = q63.a(new l32(i));
        this.f = q63VarA3;
        xe1 xe1Var = new xe1(ue1Var);
        this.g = xe1Var;
        v63 v63VarA = x63.a(new cf1(xe1Var, q63.a(new we1(ue1Var, i)), 1));
        ef1 ef1Var = new ef1(ue1Var);
        this.h = ef1Var;
        int i2 = 0;
        q63 q63VarA4 = q63.a(new i91(v63VarA, new yc(xe1Var, ef1Var, i2), xe1Var, 12));
        this.i = q63VarA4;
        int i3 = 19;
        q63 q63VarA5 = q63.a(new eo1(q63VarA4, i3));
        this.j = q63VarA5;
        q63 q63VarA6 = q63.a(yd.k);
        this.k = q63VarA6;
        this.l = q63.a(new re1(q63VarA6, q63VarA5, i2));
        q63 q63VarA7 = q63.a(new yc(xe1Var, ef1Var, 2));
        this.m = q63VarA7;
        x91 x91Var = new x91(xe1Var, 3);
        q63 q63VarA8 = q63.a(w40.s);
        this.n = q63VarA8;
        q63 q63VarA9 = q63.a(new da1(x91Var, q63VarA8, i3));
        this.o = q63VarA9;
        q63 q63VarA10 = q63.a(new bf1(q63VarA9, 2));
        this.p = q63VarA10;
        q63 q63VarA11 = q63.a(new xn1(23));
        this.q = q63VarA11;
        we1 we1Var = new we1(ue1Var, 2);
        q63 q63VarA12 = q63.a(new tt0(5));
        this.r = q63VarA12;
        q63 q63VarA13 = q63.a(new re1(q63VarA12, q63VarA4, 9));
        q63 q63VarA14 = q63.a(hn.q);
        this.s = q63VarA14;
        q63 q63VarA15 = q63.a(new bf1(q63VarA14, 0));
        int i4 = w63.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(q63VarA15);
        bk1 bk1Var = new bk1(new w63(list, arrayList), 17);
        q63 q63VarA16 = q63.a(new re1(q63VarA6, q63VarA2, 1));
        q63 q63VarA17 = q63.a(new dy0(xe1Var, ef1Var, q63VarA8, q63VarA16));
        this.t = q63VarA17;
        q63 q63VarA18 = q63.a(new nx0(q63VarA, xe1Var, we1Var, q63VarA9, q63VarA2, q63VarA13, ef1Var, bk1Var, q63VarA17));
        this.u = q63VarA18;
        int i5 = 10;
        q63 q63VarA19 = q63.a(new tt0(i5));
        this.v = q63VarA19;
        q63 q63VarA20 = q63.a(new xn1(i5));
        this.w = q63VarA20;
        q63 q63VarA21 = q63.a(new yc(xe1Var, ef1Var, 1));
        q63 q63VarA22 = q63.a(new x91(xe1Var, 5));
        q63 q63VarA23 = q63.a(new x91(xe1Var, 4));
        q63 q63VarA24 = q63.a(new re1(q63VarA18, q63VarA8, 10));
        q63 q63VarA25 = q63.a(new i91(xe1Var, we1Var, q63VarA21, 13));
        this.x = q63VarA25;
        af1 af1Var = new af1(xe1Var);
        this.y = af1Var;
        q63 q63VarA26 = q63.a(new bp1(q63VarA21, q63VarA22, q63VarA23, xe1Var, ef1Var, q63VarA24, q63VarA25, af1Var));
        this.z = q63VarA26;
        we1 we1Var2 = new we1(ue1Var, 3);
        q63 q63VarA27 = q63.a(new gj1(xe1Var, q63VarA17, ef1Var));
        this.A = q63VarA27;
        this.B = q63.a(new cg1(xe1Var, ef1Var, q63VarA9, q63VarA10, q63VarA11, q63VarA18, q63VarA19, q63VarA20, q63VarA26, we1Var2, q63VarA17, x91Var, q63VarA27, q63VarA5));
        q63 q63VarA28 = q63.a(new u91(xe1Var, ef1Var, q63VarA2, x91Var, q63VarA3));
        cf1 cf1Var = new cf1(xe1Var, q63VarA5);
        this.C = q63.a(new re1(q63.a(new i82(q63VarA28, cf1Var, xe1Var, q63VarA3, 1)), q63.a(new i82(q63VarA28, cf1Var, xe1Var, q63VarA3, 0)), 15));
        s63 s63VarA = s63.a(this);
        this.D = s63VarA;
        q63 q63VarA29 = q63.a(new re1(q63.a(new we1(ue1Var, 4)), q63.a(new we1(ue1Var, 0)), 2));
        this.E = q63VarA29;
        yf1 yf1Var = new yf1(zf0Var);
        this.F = yf1Var;
        q63 q63VarA30 = q63.a(new x91(xe1Var, 7));
        this.G = q63VarA30;
        q63 q63VarA31 = q63.a(w40.u);
        q63 q63VarA32 = q63.a(new jt1(q63VarA30, 12));
        this.H = q63VarA32;
        q63 q63VarA33 = q63.a(new yn1(xe1Var, q63VarA31, v63VarA, q63VarA32, q63VarA17, q63VarA16));
        this.I = q63VarA33;
        q63 q63VarA34 = q63.a(new dy0(xe1Var, q63VarA30, v63VarA, q63VarA5));
        this.J = q63VarA34;
        q63 q63VarA35 = q63.a(new jt1(q63VarA29, 9));
        this.K = q63VarA35;
        int i6 = 3;
        q63 q63VarA36 = q63.a(new bf1(q63.a(new nx0(xe1Var, q63VarA, q63VarA29, ef1Var, yf1Var, q63VarA30, q63VarA33, q63VarA5, q63VarA34, q63VarA35)), i6));
        this.L = q63VarA36;
        q63 q63VarA37 = q63.a(new cf1(xe1Var, q63VarA4, 4));
        q63 q63VarA38 = q63.a(new yc(xe1Var, ef1Var, i6));
        this.M = q63.a(new tp0(s63VarA, xe1Var, q63VarA29, q63VarA36, q63VarA2, q63VarA4, q63VarA33, ef1Var, new dy0(q63VarA2, q63VarA37, q63VarA38, q63VarA4, 0), q63VarA35, q63VarA37, q63VarA38));
        this.N = q63.a(new jt1(q63VarA4, 15));
        this.O = q63.a(dq.t);
        this.P = q63.a(new x91(xe1Var, 0));
        int i7 = 1;
        int i8 = 16;
        this.Q = q63.a(new tz0(17, new re1(q63.a(new tz0(23, new we1(ue1Var, i7))), q63.a(new eo1(q63VarA5, 7)), i8)));
        this.R = new df1(s63VarA);
        this.S = new gf1(xe1Var, q63VarA17);
        this.T = q63.a(hn.o);
        int i9 = 2;
        q63 q63VarA39 = q63.a(new tt0(i9));
        this.U = q63VarA39;
        this.V = new ff1(q63VarA39);
        this.W = q63.a(new eo1(q63VarA3, 20));
        this.X = new ve1(q63VarA39);
        q63 q63VarA40 = q63.a(new x91(xe1Var, i7));
        this.Y = q63VarA40;
        q63 q63VarA41 = q63.a(new cf1(xe1Var, q63VarA40, 0));
        this.Z = q63VarA41;
        this.a0 = q63.a(new i91(new cf1(xe1Var, q63VarA7, i9), q63VarA3, q63VarA5, 18));
        this.b0 = q63.a(ss0.l);
        v12 v12Var = new v12(q63VarA40, q63VarA41, xe1Var);
        this.c0 = v12Var;
        this.d0 = q63.a(new i91(v12Var, q63VarA3, q63VarA5, 24));
        this.e0 = q63.a(v51.l);
        x02 x02Var = new x02(xe1Var);
        this.f0 = x02Var;
        this.g0 = q63.a(new i91(x02Var, q63VarA3, q63VarA5, 22));
        h22 h22Var = new h22(xe1Var, ef1Var, af1Var);
        this.h0 = h22Var;
        this.i0 = q63.a(new i91(h22Var, q63VarA3, q63VarA5, 25));
        t22 t22Var = new t22(xe1Var);
        this.j0 = t22Var;
        this.k0 = q63.a(new i91(t22Var, q63VarA3, q63VarA5, 26));
        int i10 = 8;
        this.l0 = q63.a(new i91(new x91(xe1Var, i10), q63VarA3, q63VarA5, i8));
        this.m0 = q63.a(new re1(q63VarA3, q63VarA5, 12));
        this.n0 = q63.a(yd.m);
        this.o0 = q63.a(new re1(q63VarA3, q63VarA5, 13));
        n02 n02Var = new n02(q63VarA39);
        this.p0 = n02Var;
        this.q0 = q63.a(new i91(n02Var, q63VarA3, q63VarA5, 20));
        zz1 zz1Var = new zz1(xe1Var);
        this.r0 = zz1Var;
        this.s0 = q63.a(new i91(zz1Var, q63VarA3, q63VarA5, 19));
        t02 t02Var = new t02(ef1Var);
        this.t0 = t02Var;
        this.u0 = q63.a(new i91(t02Var, q63VarA3, q63VarA5, 21));
        q63 q63VarA42 = q63.a(new tt0(4));
        this.v0 = q63VarA42;
        o12 o12Var = new o12(xe1Var, q63VarA42);
        this.w0 = o12Var;
        this.x0 = q63.a(new i91(o12Var, q63VarA3, q63VarA5, 23));
        this.y0 = q63.a(ss0.j);
        int i11 = 6;
        q63 q63VarA43 = q63.a(new we1(ue1Var, i11));
        this.z0 = q63VarA43;
        this.A0 = q63.a(new i91(new x91(xe1Var, 9), q63VarA3, q63VarA5, 17));
        this.B0 = new dg1(xe1Var);
        this.C0 = q63.a(a23.E);
        this.D0 = q63.a(s90.s);
        this.E0 = q63.a(new bf1(q63VarA9, 1));
        this.F0 = new tt0(i10);
        this.G0 = q63.a(new gj1(xe1Var, ef1Var, q63VarA17));
        this.H0 = new rh1(q63VarA2, q63VarA3, q63VarA5);
        this.I0 = q63.a(yd.n);
        this.J0 = q63.a(hn.r);
        this.K0 = q63.a(new x91(xe1Var, 2));
        this.L0 = q63.a(new eo1(q63VarA5, 3));
        this.M0 = q63.a(ej1.j);
        this.N0 = q63.a(new u91(xe1Var, q63VarA43, q63VarA41, q63.a(new x91(xe1Var, i11)), q63VarA2, 0));
        this.O0 = q63.a(new x91(xe1Var, 10));
    }

    public static if1 a(Context context, l41 l41Var, int i) {
        ya1 ya1Var;
        SharedPreferences sharedPreferences;
        synchronized (if1.class) {
            try {
                if1 if1Var = P0;
                if (if1Var != null) {
                    return if1Var;
                }
                vc3 vc3Var = vc3.C;
                vc3Var.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                lx0.a(context);
                int i2 = 1;
                boolean z = false;
                if (((Boolean) ly0.e.u()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", i8.H(context, "init_without_write") + 1).commit();
                }
                r52 r52VarY = r52.y(context);
                boolean zF = zb3.f((Context) r52VarY.g);
                d60 d60Var = new d60(ModuleDescriptor.MODULE_VERSION, i, 0, true, zF);
                if (((Boolean) sy0.c.u()).booleanValue()) {
                    vj1 vj1Var = (vj1) r52VarY.h;
                    s32 liteSdkVersion = null;
                    if (vj1Var != null) {
                        try {
                            liteSdkVersion = vj1Var.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (liteSdkVersion != null) {
                        d60Var = new d60(ModuleDescriptor.MODULE_VERSION, liteSdkVersion.g, 0, true, zF);
                    }
                }
                r52VarY.K(l41Var);
                ue1 ue1Var = new ue1();
                ue1Var.a = d60Var;
                ue1Var.d = new WeakReference(context);
                ue1Var.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                ue1Var.c = jCurrentTimeMillis;
                ue1 ue1Var2 = new ue1();
                ue1Var2.a = ue1Var.a;
                ue1Var2.b = ue1Var.b;
                ue1Var2.d = ue1Var.d;
                ue1Var2.c = ue1Var.c;
                if1 if1Var2 = new if1(ue1Var2, new zf0(21));
                ix0 ix0Var = lx0.se;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    wa1 wa1Var = vc3Var.e;
                    ya1 ya1Var2 = za1.a;
                    dq.D(ya1Var2);
                    wa1Var.a(ya1Var2, (es1) if1Var2.j.c());
                    wa1 wa1Var2 = vc3Var.e;
                    if (wa1Var2.c.get() && wa1Var2.e >= 0 && wa1Var2.f >= 0 && wa1Var2.d.compareAndSet(false, true) && (ya1Var = wa1Var2.a) != null) {
                        ya1Var.a(new va1(i2, wa1Var2));
                    }
                }
                ((zt1) if1Var2.m.c()).a();
                ((qe1) if1Var2.l.c()).a(context, d60Var);
                vc3Var.h.b(context, d60Var, (es1) if1Var2.j.c());
                vc3Var.j.m(context);
                vc3Var.c.C(context);
                vc3Var.c.D(context);
                i8.u(context);
                vc3Var.g.a(context);
                vc3Var.z.a(context);
                if (((Boolean) tu0Var.c.a(lx0.Le)).booleanValue()) {
                    String str = (String) tu0Var.c.a(lx0.Me);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            ((nr1) if1Var2.Q.c()).a(vc3Var.g);
                        }
                    }
                } else if (((Boolean) tu0Var.c.a(lx0.Ke)).booleanValue()) {
                    ((nr1) if1Var2.Q.c()).a(vc3Var.g);
                }
                ((v81) if1Var2.P.c()).a();
                y91.v(context);
                if (((Boolean) tu0Var.c.a(lx0.C6)).booleanValue()) {
                    if (!((Boolean) tu0Var.c.a(lx0.G0)).booleanValue()) {
                        cv0 cv0Var = new cv0(new qk(context, 4));
                        us2 us2Var = new us2(new uv1(context), (ya1) if1Var2.e.c(), 19, z);
                        try {
                            us2Var.p(new mn0(new r52(context, d60Var, cv0Var, us2Var), vc3Var.h.g().s()));
                        } catch (Exception e) {
                            jn.M("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                }
                if (((Boolean) tu0.e.c.a(lx0.Ee)).booleanValue()) {
                    Context context2 = if1Var2.a.b;
                    dq.D(context2);
                    ya1 ya1Var3 = za1.a;
                    dq.D(ya1Var3);
                    ya1Var3.execute(new va1(27, new p83(if1Var2, context2, ya1Var3)));
                }
                P0 = if1Var2;
                return if1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Executor b() {
        return (Executor) this.c.c();
    }

    public final e72 c() {
        return (e72) this.t.c();
    }
}
