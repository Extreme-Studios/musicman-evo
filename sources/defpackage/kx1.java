package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class kx1 implements zw1 {
    public final /* synthetic */ int a = 1;
    public final Context b;
    public final Object c;
    public Object d;
    public Object e;

    public kx1(Context context, d60 d60Var, sf1 sf1Var, ya1 ya1Var) {
        this.b = context;
        this.d = d60Var;
        this.c = sf1Var;
        this.e = ya1Var;
    }

    @Override // defpackage.zw1
    public final Object a(e52 e52Var, x42 x42Var, ww1 ww1Var) throws ky1, l52 {
        View view;
        int i = this.a;
        int i2 = 7;
        Object obj = this.c;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (((Boolean) tu0.e.c.a(lx0.z8)).booleanValue() && x42Var.g0) {
                    try {
                        view = (View) ju.Z0(((r41) this.e).Z0());
                        boolean zD = ((r41) this.e).d();
                        if (view == null) {
                            throw new l52(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (zD) {
                            try {
                                view = (View) na1.L(kn2.g, new qn0(this, view, x42Var, 7), za1.f).get();
                            } catch (InterruptedException | ExecutionException e) {
                                throw new l52(e);
                            }
                        }
                    } catch (RemoteException e2) {
                        throw new l52(e2);
                    }
                    break;
                } else {
                    view = (View) this.d;
                }
                pf1 pf1Var = (pf1) obj;
                p83 p83Var = new p83(e52Var, x42Var, ww1Var.a);
                y91 y91Var = new y91(view, (md1) null, new dr0(26, ww1Var), (y42) x42Var.u.get(0));
                if1 if1Var = pf1Var.d;
                pf1 pf1Var2 = pf1Var.e;
                of1 of1Var = new of1(if1Var, pf1Var2, p83Var, y91Var);
                ((xm1) of1Var.h0.c()).R1(view);
                ((nx1) ww1Var.c).C3(new uy1((ak1) of1Var.T.c(), (ym1) of1Var.Z.c(), (kk1) of1Var.W.c(), (ok1) of1Var.S.c(), of1Var.I(), (zl1) pf1Var2.S.c(), (gl1) of1Var.c0.c(), (gn1) of1Var.d0.c(), (wl1) of1Var.e0.c(), (ik1) of1Var.f0.c()));
                return of1Var.J();
            case 1:
                p83 p83Var2 = new p83(e52Var, x42Var, ww1Var.a);
                us2 us2Var = new us2(new p83(this, ww1Var, x42Var, 19, false), obj2, 16, false);
                sf1 sf1Var = (sf1) obj;
                if1 if1Var2 = sf1Var.b;
                sf1 sf1Var2 = sf1Var.c;
                rf1 rf1Var = new rf1(if1Var2, sf1Var2, p83Var2, us2Var);
                ((nk1) rf1Var.N.c()).I1(new og1(0, (s52) ww1Var.b), (Executor) this.e);
                ((nx1) ww1Var.c).C3(new wy1((ak1) rf1Var.V.c(), (ym1) rf1Var.Y.c(), (kk1) rf1Var.R.c(), (ok1) rf1Var.U.c(), (xk1) rf1Var.Z.c(), (zl1) sf1Var2.Q.c(), (gl1) rf1Var.b0.c(), (gn1) rf1Var.c0.c(), (wl1) rf1Var.d0.c(), (ik1) rf1Var.f0.c()));
                return rf1Var.I();
            default:
                ArrayList arrayList = ((i52) e52Var.a.g).h;
                if (!arrayList.contains(Integer.toString(6))) {
                    throw new ky1("Unified must be used for RTB.", 2);
                }
                ro1 ro1VarL = ro1.l((v41) this.d);
                int i3 = 1;
                if (!arrayList.contains(Integer.toString(ro1VarL.q()))) {
                    throw new ky1("No corresponding native ad listener", 1);
                }
                hf1 hf1Var = (hf1) obj;
                p83 p83Var3 = new p83(e52Var, x42Var, ww1Var.a);
                kc2 kc2Var = new kc2(23, ro1VarL);
                r52 r52Var = new r52((t41) null, (s41) null, (v41) this.d);
                if1 if1Var3 = hf1Var.b;
                hf1 hf1Var2 = hf1Var.c;
                ti1 ti1Var = new ti1(p83Var3, 0);
                q63 q63Var = hf1Var2.g;
                tt0 tt0Var = if1Var3.F0;
                q63 q63VarA = q63.a(new vg1(q63Var, ti1Var, i3));
                q63 q63VarA2 = q63.a(new hj1(q63VarA, i2));
                int i4 = w63.c;
                ArrayList arrayList2 = new ArrayList(1);
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(hf1Var2.o);
                arrayList3.add(hf1Var2.p);
                arrayList2.add(q63VarA2);
                q63 q63VarA3 = q63.a(new bk1(new w63(arrayList2, arrayList3), 3));
                q63 q63VarA4 = q63.a(v51.j);
                q63 q63Var2 = if1Var3.c;
                q63 q63VarA5 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 4));
                ti1 ti1Var2 = new ti1(p83Var3, 3);
                ti1 ti1Var3 = new ti1(p83Var3, 2);
                xe1 xe1Var = if1Var3.g;
                q63 q63VarA6 = q63.a(new yn1(if1Var3.I, if1Var3.H, ti1Var, ti1Var3, q63.a(new tg1(xe1Var, if1Var3.X, q63.a(new eg1(xe1Var, 20)), q63.a(ar.j), if1Var3.D0, if1Var3.d)), hf1Var2.e));
                xn1 xn1Var = new xn1(4);
                xn1 xn1Var2 = new xn1(2);
                q63 q63VarA7 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 9));
                q63 q63VarA8 = q63.a(hn.p);
                eo1 eo1Var = new eo1(q63VarA8, 2);
                ArrayList arrayList4 = new ArrayList(2);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(hf1Var2.u);
                arrayList4.add(q63VarA7);
                arrayList4.add(eo1Var);
                q63 q63VarA9 = q63.a(new i91(new w63(arrayList4, arrayList5), ti1Var, ti1Var2, 5));
                q63 q63VarA10 = q63.a(new tz0(9, ti1Var2));
                q63 q63VarA11 = q63.a(new ah1(if1Var3.g, if1Var3.c, if1Var3.d, ti1Var2, ti1Var, hf1Var2.k, q63VarA6, xn1Var, xn1Var2, if1Var3.E, hf1Var2.l, hf1Var2.e, hf1Var2.t, q63VarA9, q63VarA10));
                bf1 bf1Var = new bf1(q63VarA11, 24);
                hj1 hj1Var = new hj1(q63.a(new vg1(ti1Var, if1Var3.V, 0)), 11);
                ArrayList arrayList6 = new ArrayList(4);
                ArrayList arrayList7 = new ArrayList(2);
                arrayList6.add(hf1Var2.q);
                arrayList7.add(hf1Var2.r);
                arrayList7.add(hf1Var2.s);
                arrayList6.add(q63VarA5);
                arrayList6.add(bf1Var);
                arrayList6.add(hj1Var);
                q63 q63VarA12 = q63.a(new bk1(new w63(arrayList6, arrayList7), 4));
                q63 q63VarA13 = q63.a(new jj1(if1Var3.g, if1Var3.C0, if1Var3.j, ti1Var2, ti1Var, if1Var3.G, yd.l));
                q63 q63VarA14 = q63.a(new hj1(q63VarA13, 5));
                q63 q63VarA15 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 3));
                q63 q63Var3 = if1Var3.y0;
                yj1 yj1Var = hf1Var2.d;
                q63 q63VarA16 = q63.a(new hj1(q63.a(new zh1(q63Var3, yj1Var, 1)), 3));
                bf1 bf1Var2 = new bf1(q63VarA11, 23);
                ArrayList arrayList8 = new ArrayList(5);
                ArrayList arrayList9 = new ArrayList(3);
                arrayList8.add(hf1Var2.v);
                arrayList8.add(hf1Var2.w);
                arrayList9.add(hf1Var2.x);
                arrayList9.add(hf1Var2.y);
                arrayList8.add(q63VarA14);
                arrayList8.add(q63VarA15);
                arrayList9.add(q63VarA16);
                arrayList8.add(bf1Var2);
                q63 q63VarA17 = q63.a(new bk1(new w63(arrayList8, arrayList9), 0));
                int i5 = 6;
                q63 q63VarA18 = q63.a(new hj1(q63VarA13, i5));
                q63 q63VarA19 = q63.a(new eh1(q63VarA4, (v63) q63Var2, i5));
                bf1 bf1Var3 = new bf1(q63VarA9, 12);
                bf1 bf1Var4 = new bf1(q63VarA11, 26);
                ArrayList arrayList10 = new ArrayList(6);
                ArrayList arrayList11 = new ArrayList(2);
                arrayList10.add(hf1Var2.z);
                arrayList10.add(hf1Var2.A);
                arrayList11.add(hf1Var2.B);
                arrayList11.add(hf1Var2.C);
                arrayList10.add(q63VarA18);
                arrayList10.add(q63VarA19);
                arrayList10.add(bf1Var3);
                arrayList10.add(bf1Var4);
                q63 q63VarA20 = q63.a(new bk1(new w63(arrayList10, arrayList11), 2));
                bf1 bf1Var5 = new bf1(q63VarA11, 29);
                ArrayList arrayList12 = new ArrayList(1);
                ArrayList arrayList13 = new ArrayList(1);
                arrayList13.add(hf1Var2.D);
                arrayList12.add(bf1Var5);
                q63 q63VarA21 = q63.a(new bk1(new w63(arrayList12, arrayList13), 19));
                bf1 bf1Var6 = new bf1(q63.a(new vg1(ti1Var, if1Var3.I, 2)), 22);
                ArrayList arrayList14 = new ArrayList(1);
                new ArrayList(1).add(hf1Var2.E);
                arrayList14.add(bf1Var6);
                q63 q63VarA22 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 10));
                ArrayList arrayList15 = new ArrayList(1);
                ArrayList arrayList16 = new ArrayList(1);
                arrayList16.add(hf1Var2.F);
                arrayList15.add(q63VarA22);
                q63 q63VarA23 = q63.a(new bk1(new w63(arrayList15, arrayList16), 20));
                int i6 = 8;
                q63 q63VarA24 = q63.a(new hj1(q63VarA, i6));
                bf1 bf1Var7 = new bf1(q63VarA11, 27);
                ArrayList arrayList17 = new ArrayList(7);
                ArrayList arrayList18 = new ArrayList(4);
                arrayList17.add(hf1Var2.G);
                arrayList18.add(hf1Var2.H);
                arrayList17.add(hf1Var2.I);
                arrayList17.add(hf1Var2.J);
                arrayList18.add(hf1Var2.K);
                arrayList18.add(hf1Var2.L);
                arrayList18.add(hf1Var2.M);
                arrayList17.add(hf1Var2.N);
                arrayList17.add(hf1Var2.O);
                arrayList17.add(q63VarA24);
                arrayList17.add(bf1Var7);
                q63 q63VarA25 = q63.a(new bk1(new w63(arrayList17, arrayList18), 5));
                hj1 hj1Var2 = new hj1(q63.a(new bf1(q63VarA12, 11)), 1);
                q63 q63VarA26 = q63.a(new eh1(q63VarA4, (v63) q63Var2, i6));
                ArrayList arrayList19 = new ArrayList(2);
                ArrayList arrayList20 = new ArrayList(1);
                arrayList20.add(hf1Var2.Q);
                arrayList19.add(hj1Var2);
                arrayList19.add(q63VarA26);
                q63 q63VarA27 = q63.a(new bk1(new w63(arrayList19, arrayList20), 9));
                tz0 tz0Var = new tz0(14, kc2Var);
                da1 da1Var = new da1(new ho1(tz0Var, 1), q63Var2, 15);
                ArrayList arrayList21 = new ArrayList(1);
                ArrayList arrayList22 = new ArrayList(1);
                arrayList22.add(hf1Var2.R);
                arrayList21.add(da1Var);
                q63 q63VarA28 = q63.a(new bk1(new w63(arrayList21, arrayList22), 24));
                q63 q63VarA29 = q63.a(new hj1(q63VarA13, 4));
                qp1 qp1Var = new qp1(r52Var, 0);
                qp1 qp1Var2 = new qp1(r52Var, 1);
                int i7 = 2;
                qp1 qp1Var3 = new qp1(r52Var, i7);
                q63 q63VarA30 = q63.a(new hj1(q63VarA13, i7));
                bf1 bf1Var8 = new bf1(q63VarA11, 28);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(hf1Var2.Y);
                arrayList23.add(q63VarA30);
                arrayList23.add(bf1Var8);
                q63 q63VarA31 = q63.a(new wi1(qp1Var, qp1Var2, qp1Var3, q63VarA20, q63.a(new bk1(new w63(arrayList23, arrayList24), 10)), q63VarA17, q63VarA23, hf1Var2.g, ti1Var, if1Var3.h, yj1Var));
                eo1 eo1Var2 = new eo1(q63VarA31, 5);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList25.add(q63VarA29);
                arrayList26.add(eo1Var2);
                q63 q63VarA32 = q63.a(new bk1(new w63(arrayList25, arrayList26), 13));
                q63 q63VarA33 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 5));
                bf1 bf1Var9 = new bf1(q63VarA11, 25);
                ArrayList arrayList27 = new ArrayList(2);
                ArrayList arrayList28 = new ArrayList(1);
                arrayList28.add(hf1Var2.S);
                arrayList27.add(q63VarA33);
                arrayList27.add(bf1Var9);
                bk1 bk1Var = new bk1(new w63(arrayList27, arrayList28), 1);
                q63 q63VarA34 = q63.a(new hj1(q63VarA13, 0));
                ArrayList arrayList29 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList29.add(q63VarA34);
                q63 q63VarA35 = q63.a(new i91(bk1Var, new w63(arrayList29, list), if1Var3.d, 4));
                ti1 ti1Var4 = new ti1(p83Var3, 1);
                u91 u91Var = new u91(ti1Var, ti1Var4, hf1Var2.h, ti1Var3, hf1Var2.f, 4);
                ArrayList arrayList30 = new ArrayList(1);
                ArrayList arrayList31 = new ArrayList(1);
                arrayList31.add(hf1Var2.U);
                arrayList30.add(hf1Var2.V);
                wi1 wi1Var = new wi1(ti1Var2, ti1Var, q63VarA3, q63VarA25, hf1Var2.T, u91Var, q63VarA4, new bk1(new w63(arrayList30, arrayList31), 6), q63VarA21, q63VarA10, if1Var3.n0);
                eo1 eo1Var3 = new eo1(q63VarA31, 4);
                q63 q63VarA36 = q63.a(new lh1(ti1Var, 1));
                xn1 xn1Var3 = new xn1(5);
                xn1 xn1Var4 = new xn1(6);
                q63 q63VarA37 = q63.a(new tz0(13, new ho1(tz0Var, 0)));
                ve1 ve1Var = if1Var3.X;
                q63 q63Var4 = if1Var3.c;
                bp1 bp1Var = new bp1(ve1Var, yj1Var, q63VarA36, tz0Var, xn1Var3, xn1Var4, q63Var4, q63VarA37);
                q12 q12Var = new q12();
                q63 q63VarA38 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 1));
                q63 q63VarA39 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 0));
                q63 q63VarA40 = q63.a(new dy0((v63) ti1Var4, (v63) q12Var, (v63) tz0Var, (v63) if1Var3.j, 8));
                q63 q63VarA41 = q63.a(new da1(q12Var, tz0Var, 17));
                xe1 xe1Var2 = if1Var3.g;
                q12.a(q12Var, q63.a(new oo1(wi1Var, q63Var4, tz0Var, eo1Var3, bp1Var, q63VarA36, hf1Var2.i, q63VarA38, q63VarA39, q63VarA40, q63VarA41, q63.a(new dy0(xe1Var2, tz0Var, bp1Var, q12Var, 7)), new xo1(xe1Var2, yj1Var, 0), if1Var3.E, if1Var3.h, xe1Var2, q63VarA37, q63VarA8, if1Var3.M0)));
                ((nx1) ww1Var.c).C3(new uy1((ak1) q63VarA17.c(), (ym1) q63VarA23.c(), (kk1) q63VarA20.c(), (ok1) q63VarA12.c(), (xk1) q63VarA25.c(), (zl1) hf1Var2.P.c(), (gl1) q63VarA27.c(), (gn1) q63VarA28.c(), (wl1) q63VarA32.c(), (ik1) q63VarA35.c()));
                return (no1) q12Var.c();
        }
    }

    @Override // defpackage.zw1
    public final void b(e52 e52Var, x42 x42Var, ww1 ww1Var) throws l52 {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                try {
                    Object obj = ww1Var.b;
                    pk1 pk1Var = ww1Var.c;
                    s51 s51Var = (s51) obj;
                    String str = x42Var.Z;
                    JSONObject jSONObject = x42Var.v;
                    s51Var.l1(str);
                    if (((Boolean) tu0.e.c.a(lx0.z8)).booleanValue() && x42Var.g0) {
                        String str2 = x42Var.U;
                        String string = jSONObject.toString();
                        i52 i52Var = (i52) e52Var.a.g;
                        s51Var.Q1(str2, string, i52Var.d, new ju(context), new jx1(this, ww1Var), (q41) pk1Var, i52Var.f);
                        return;
                    }
                    String str3 = x42Var.U;
                    String string2 = jSONObject.toString();
                    i52 i52Var2 = (i52) e52Var.a.g;
                    s51Var.z1(str3, string2, i52Var2.d, new ju(context), new jx1(this, ww1Var), (q41) pk1Var, i52Var2.f);
                    return;
                } catch (RemoteException e) {
                    throw new l52(e);
                }
            case 1:
                s52 s52Var = (s52) ww1Var.b;
                i52 i52Var3 = (i52) e52Var.a.g;
                String string3 = x42Var.v.toString();
                String strS0 = w40.S0(x42Var.s);
                q41 q41Var = (q41) ww1Var.c;
                try {
                    s52Var.a.B0(new ju(context), i52Var3.d, string3, strS0, q41Var);
                    return;
                } catch (Throwable th) {
                    throw new l52(th);
                }
            default:
                try {
                    Object obj2 = ww1Var.b;
                    pk1 pk1Var2 = ww1Var.c;
                    s51 s51Var2 = (s51) obj2;
                    String str4 = x42Var.Z;
                    JSONObject jSONObject2 = x42Var.v;
                    s51Var2.l1(str4);
                    int i2 = ((d60) this.e).h;
                    int iIntValue = ((Integer) tu0.e.c.a(lx0.P1)).intValue();
                    String str5 = x42Var.U;
                    if (i2 < iIntValue) {
                        s51Var2.p3(str5, jSONObject2.toString(), ((i52) e52Var.a.g).d, new ju(context), new yx1(this, ww1Var), (q41) pk1Var2);
                        return;
                    }
                    String string4 = jSONObject2.toString();
                    i52 i52Var4 = (i52) e52Var.a.g;
                    s51Var2.M1(str5, string4, i52Var4.d, new ju(context), new yx1(this, ww1Var), (q41) pk1Var2, i52Var4.j);
                    return;
                } catch (RemoteException e2) {
                    throw new l52(e2);
                }
        }
    }

    public kx1(Context context, hf1 hf1Var, d60 d60Var) {
        this.b = context;
        this.c = hf1Var;
        this.e = d60Var;
    }

    public kx1(Context context, pf1 pf1Var) {
        this.b = context;
        this.c = pf1Var;
    }
}
