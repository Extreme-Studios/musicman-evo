package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qn0 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qn0(uq1 uq1Var, String str, JSONObject jSONObject) {
        this.a = 3;
        this.b = uq1Var;
        this.d = str;
        this.c = jSONObject;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) throws JSONException {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ep0 ep0Var = (ep0) obj4;
                String str = (String) obj2;
                uq1 uq1Var = (uq1) obj;
                ((uq1[]) obj3)[0] = uq1Var;
                Context context = ep0Var.h;
                c71 c71Var = ep0Var.n;
                Map map = c71Var.g;
                JSONObject jSONObjectB = rs0.B(context, map, map, c71Var.f, null);
                JSONObject jSONObjectV = rs0.v(ep0Var.h, ep0Var.n.f);
                JSONObject jSONObjectX = rs0.x(ep0Var.n.f);
                JSONObject jSONObjectA = rs0.A(ep0Var.h, ep0Var.n.f);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectB);
                jSONObject.put("ad_view_signal", jSONObjectV);
                jSONObject.put("scroll_view_signal", jSONObjectX);
                jSONObject.put("lock_screen_signal", jSONObjectA);
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
                    jSONObject.put("click_signal", rs0.D(null, ep0Var.h, ep0Var.p, ep0Var.o));
                }
                return uq1Var.a(str, jSONObject);
            case 1:
                si1 si1Var = (si1) obj4;
                kd0 kd0Var = (kd0) obj3;
                hp hpVar = (hp) obj2;
                mi1 mi1Var = (mi1) obj;
                si1Var.getClass();
                if (mi1Var != null) {
                    kd0Var.mo5e(mi1Var);
                }
                return na1.K(hpVar, ((Long) hz0.a.u()).longValue(), TimeUnit.MILLISECONDS, si1Var.b);
            case 2:
                hq1 hq1Var = (hq1) obj4;
                md1 md1VarA = hq1Var.c.a(kb3.a(), null, null);
                yu0 yu0Var = new yu0(md1VarA);
                hq1Var.a(md1VarA, (vs0) obj3, (d91) obj2);
                md1VarA.e0().m = new ud1(yu0Var);
                md1VarA.loadUrl((String) tu0.e.c.a(lx0.f4));
                return yu0Var;
            case 3:
                String str2 = (String) obj2;
                JSONObject jSONObject2 = (JSONObject) obj3;
                md1 md1Var = (md1) obj;
                s11 s11Var = ((uq1) obj4).h;
                s11Var.getClass();
                cb1 cb1Var = new cb1();
                zb3 zb3Var = vc3.C.c;
                String string = UUID.randomUUID().toString();
                s11Var.a(string, new g21(s11Var, cb1Var));
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", string);
                    jSONObject3.put("args", jSONObject2);
                    md1Var.e(str2, jSONObject3);
                    break;
                } catch (Exception e) {
                    cb1Var.c(e);
                }
                return cb1Var;
            case 4:
                bx1 bx1Var = (bx1) obj4;
                x42 x42Var = (x42) obj3;
                e52 e52Var = (e52) obj2;
                cs1 cs1Var = bx1Var.i;
                ix0 ix0Var = lx0.p2;
                kx0 kx0Var = tu0.e.c;
                if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var.e, "rendering-webview-creation-start");
                }
                jr1 jr1Var = bx1Var.b;
                i52 i52Var = bx1Var.c;
                final md1 md1VarA2 = jr1Var.a(i52Var.f, x42Var, (z42) e52Var.b.h);
                md1VarA2.v0(x42Var.W);
                if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var.e, "rendering-webview-creation-end");
                }
                cb1 cb1Var2 = new cb1();
                nf1 nf1Var = bx1Var.a;
                p83 p83Var = new p83(e52Var, x42Var, (String) null);
                d60 d60Var = bx1Var.e;
                boolean z = bx1Var.g;
                b21 b21Var = bx1Var.f;
                lf1 lf1Var = new lf1(nf1Var.c, nf1Var.d, p83Var, new us2(new dx1(d60Var, cb1Var2, x42Var, md1VarA2, i52Var, z, b21Var, bx1Var.h, bx1Var.j), md1VarA2, 16, false), new yp(x42Var.a0, 1));
                if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var.e, "rendering-ad-component-creation-end");
                }
                q63 q63Var = lf1Var.f0;
                ir1 ir1Var = (ir1) q63Var.c();
                if (true != z) {
                    b21Var = null;
                }
                final int i2 = 0;
                ir1Var.a(md1VarA2, false, b21Var, cs1Var.e);
                cb1Var2.b(lf1Var);
                ((kk1) lf1Var.S.c()).I1(new lk1() { // from class: ax1
                    @Override // defpackage.lk1
                    public final /* synthetic */ void B0() {
                        int i3 = i2;
                        md1 md1Var2 = md1VarA2;
                        switch (i3) {
                            case 0:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            case 1:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            case 2:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            default:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                        }
                    }
                }, za1.g);
                b52 b52Var = x42Var.s;
                String strA = b52Var.a;
                if (((Boolean) kx0Var.a(lx0.J5)).booleanValue() && ((pw1) lf1Var.R.c()).a()) {
                    strA = je1.a(strA, je1.b(x42Var));
                }
                return na1.M(ir1.b(md1VarA2, b52Var.b, strA, cs1Var.e, (d72) nf1Var.f.c()), new lj1(md1VarA2, x42Var, lf1Var, 1), bx1Var.d);
            case 5:
                hx1 hx1Var = (hx1) obj4;
                e52 e52Var2 = (e52) obj3;
                x42 x42Var2 = (x42) obj2;
                Executor executor = hx1Var.e;
                cs1 cs1Var2 = hx1Var.g;
                ix0 ix0Var2 = lx0.p2;
                kx0 kx0Var2 = tu0.e.c;
                if (((Boolean) kx0Var2.a(ix0Var2)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var2.e, "rendering-webview-creation-start");
                }
                Context context2 = hx1Var.b;
                kb3 kb3VarU = na1.u(context2, x42Var2.u);
                final md1 md1VarA3 = hx1Var.c.a(kb3VarU, x42Var2, (z42) e52Var2.b.h);
                md1VarA3.v0(x42Var2.W);
                View viewA = (((Boolean) kx0Var2.a(lx0.z8)).booleanValue() && x42Var2.g0) ? ei1.a(context2, md1VarA3.p0(), x42Var2) : new lr1(context2, md1VarA3.p0(), (oo0) hx1Var.f.apply(x42Var2));
                if (((Boolean) kx0Var2.a(ix0Var2)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var2.e, "rendering-webview-creation-end");
                }
                pf1 pf1Var = hx1Var.a;
                of1 of1Var = new of1(pf1Var.d, pf1Var.e, new p83(e52Var2, x42Var2, (String) null), new y91(viewA, md1VarA3, new zx(27, md1VarA3), kb3VarU.n ? new y42(-3, 0, true) : new y42(kb3VarU.j, kb3VarU.g, false)));
                if (((Boolean) kx0Var2.a(ix0Var2)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var2.e, "rendering-ad-component-creation-end");
                }
                q63 q63Var2 = of1Var.i0;
                ((ir1) q63Var2.c()).a(md1VarA3, false, null, cs1Var2.e);
                kk1 kk1Var = (kk1) of1Var.W.c();
                final int i3 = 1;
                lk1 lk1Var = new lk1() { // from class: ax1
                    @Override // defpackage.lk1
                    public final /* synthetic */ void B0() {
                        int i4 = i3;
                        md1 md1Var2 = md1VarA3;
                        switch (i4) {
                            case 0:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            case 1:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            case 2:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            default:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                        }
                    }
                };
                ya1 ya1Var = za1.g;
                kk1Var.I1(lk1Var, ya1Var);
                b52 b52Var2 = x42Var2.s;
                String strA2 = b52Var2.a;
                if (((Boolean) kx0Var2.a(lx0.J5)).booleanValue() && ((pw1) of1Var.U.c()).a()) {
                    strA2 = je1.a(strA2, je1.b(x42Var2));
                }
                cb1 cb1VarB = ir1.b(md1VarA3, b52Var2.b, strA2, cs1Var2.e, (d72) pf1Var.k.c());
                tn2 tn2Var = cb1VarB.f;
                if (x42Var2.M) {
                    tn2Var.a(new xd1(md1VarA3, 7), executor);
                }
                tn2Var.a(new hb1(hx1Var, md1VarA3, 24, false), executor);
                return na1.M(cb1VarB, new zl0(3, of1Var), ya1Var);
            case 6:
                return na1.t(ei1.a(((ex1) obj4).b, (View) obj3, (x42) obj2));
            case 7:
                return na1.t(ei1.a(((kx1) obj4).b, (View) obj3, (x42) obj2));
            case 8:
                rx1 rx1Var = (rx1) obj4;
                x42 x42Var3 = (x42) obj3;
                e52 e52Var3 = (e52) obj2;
                cs1 cs1Var3 = rx1Var.j;
                ix0 ix0Var3 = lx0.p2;
                kx0 kx0Var3 = tu0.e.c;
                if (((Boolean) kx0Var3.a(ix0Var3)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var3.e, "rendering-webview-creation-start");
                }
                jr1 jr1Var2 = rx1Var.c;
                i52 i52Var2 = rx1Var.d;
                final md1 md1VarA4 = jr1Var2.a(i52Var2.f, x42Var3, (z42) e52Var3.b.h);
                md1VarA4.v0(x42Var3.W);
                if (((Boolean) kx0Var3.a(ix0Var3)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var3.e, "rendering-webview-creation-end");
                }
                cb1 cb1Var3 = new cb1();
                sf1 sf1Var = (sf1) rx1Var.l;
                p83 p83Var2 = new p83(e52Var3, x42Var3, (String) null);
                Context context3 = rx1Var.b;
                d60 d60Var2 = rx1Var.f;
                boolean z2 = rx1Var.h;
                b21 b21Var2 = rx1Var.g;
                rf1 rf1Var = new rf1(sf1Var.b, sf1Var.c, p83Var2, new us2(new qx1(context3, d60Var2, cb1Var3, x42Var3, md1VarA4, i52Var2, z2, b21Var2, rx1Var.i, rx1Var.k), md1VarA4, 16, false));
                cb1Var3.b(rf1Var);
                if (((Boolean) kx0Var3.a(ix0Var3)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var3.e, "rendering-ad-component-creation-end");
                }
                final int i4 = 2;
                ((kk1) rf1Var.R.c()).I1(new lk1() { // from class: ax1
                    @Override // defpackage.lk1
                    public final /* synthetic */ void B0() {
                        int i5 = i4;
                        md1 md1Var2 = md1VarA4;
                        switch (i5) {
                            case 0:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            case 1:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            case 2:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            default:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                        }
                    }
                }, za1.g);
                b52 b52Var3 = x42Var3.s;
                String strA3 = b52Var3.a;
                if (((Boolean) kx0Var3.a(lx0.J5)).booleanValue() && ((pw1) rf1Var.Q.c()).a()) {
                    strA3 = je1.a(strA3, je1.b(x42Var3));
                }
                q63 q63Var3 = rf1Var.h0;
                ((ir1) q63Var3.c()).a(md1VarA4, true, true != z2 ? null : b21Var2, cs1Var3.e);
                return na1.M(ir1.b(md1VarA4, b52Var3.b, strA3, cs1Var3.e, (d72) sf1Var.h.c()), new lj1(md1VarA4, x42Var3, rf1Var, i4), rx1Var.e);
            case 9:
                vx1 vx1Var = (vx1) obj4;
                e52 e52Var4 = (e52) obj3;
                x42 x42Var4 = (x42) obj2;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return na1.C(new au1(3));
                }
                int i5 = ((i52) e52Var4.a.g).l;
                if (i5 <= 1) {
                    return na1.M(vx1Var.c(e52Var4, x42Var4, jSONArray.getJSONObject(0)), lh0.m, vx1Var.b);
                }
                int length = jSONArray.length();
                if (((Boolean) tu0.e.c.a(lx0.q2)).booleanValue()) {
                    vx1Var.f.b("nsl", String.valueOf(length));
                }
                vx1Var.d.a(Math.min(length, i5));
                ArrayList arrayList = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    if (i6 < length) {
                        arrayList.add(vx1Var.c(e52Var4, x42Var4, jSONArray.getJSONObject(i6)));
                    } else {
                        arrayList.add(na1.C(new au1(3)));
                    }
                }
                return na1.t(arrayList);
            default:
                rx1 rx1Var2 = (rx1) obj4;
                x42 x42Var5 = (x42) obj3;
                e52 e52Var5 = (e52) obj2;
                cs1 cs1Var4 = rx1Var2.j;
                ix0 ix0Var4 = lx0.p2;
                kx0 kx0Var4 = tu0.e.c;
                if (((Boolean) kx0Var4.a(ix0Var4)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var4.e, "rendering-webview-creation-start");
                }
                jr1 jr1Var3 = rx1Var2.c;
                i52 i52Var3 = rx1Var2.d;
                final md1 md1VarA5 = jr1Var3.a(i52Var3.f, x42Var5, (z42) e52Var5.b.h);
                md1VarA5.v0(x42Var5.W);
                if (((Boolean) kx0Var4.a(ix0Var4)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var4.e, "rendering-webview-creation-end");
                }
                cb1 cb1Var4 = new cb1();
                wf1 wf1Var = (wf1) rx1Var2.l;
                p83 p83Var3 = new p83(e52Var5, x42Var5, (String) null);
                Context context4 = rx1Var2.b;
                d60 d60Var3 = rx1Var2.f;
                b21 b21Var3 = rx1Var2.g;
                boolean z3 = rx1Var2.h;
                hw1 hw1Var = rx1Var2.i;
                cs1 cs1Var5 = rx1Var2.j;
                vf1 vf1Var = new vf1(wf1Var.c, wf1Var.d, p83Var3, new dr1(new c00(context4, jr1Var3, i52Var3, d60Var3, x42Var5, cb1Var4, md1VarA5, b21Var3, z3, hw1Var, cs1Var5, rx1Var2.k), md1VarA5, 0));
                cb1Var4.b(vf1Var);
                if (((Boolean) kx0Var4.a(ix0Var4)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var5.e, "rendering-ad-component-creation-end");
                }
                md1VarA5.t0("/reward", new i11(5, (dn1) vf1Var.g0.c()));
                final int i7 = 3;
                ((kk1) vf1Var.R.c()).I1(new lk1() { // from class: ax1
                    @Override // defpackage.lk1
                    public final /* synthetic */ void B0() {
                        int i8 = i7;
                        md1 md1Var2 = md1VarA5;
                        switch (i8) {
                            case 0:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            case 1:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            case 2:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                            default:
                                if (md1Var2.e0() != null) {
                                    md1Var2.e0().Y();
                                }
                                break;
                        }
                    }
                }, za1.g);
                q63 q63Var4 = vf1Var.h0;
                ((ir1) q63Var4.c()).a(md1VarA5, true, true != z3 ? null : b21Var3, cs1Var5.e);
                b52 b52Var4 = x42Var5.s;
                String strA4 = b52Var4.a;
                if (((Boolean) kx0Var4.a(lx0.J5)).booleanValue() && ((pw1) vf1Var.Q.c()).a()) {
                    strA4 = je1.a(strA4, je1.b(x42Var5));
                }
                return na1.M(ir1.b(md1VarA5, b52Var4.b, strA4, cs1Var5.e, (d72) wf1Var.g.c()), new lj1(md1VarA5, x42Var5, vf1Var, 3), rx1Var2.e);
        }
    }

    public /* synthetic */ qn0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ qn0(tw1 tw1Var, x42 x42Var, e52 e52Var, el1 el1Var, int i) {
        this.a = i;
        this.b = tw1Var;
        this.c = x42Var;
        this.d = e52Var;
    }
}
