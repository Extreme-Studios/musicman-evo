package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tz0 implements r63 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ tz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ro1 a() {
        ro1 ro1Var = (ro1) ((kc2) this.b).g;
        dq.D(ro1Var);
        return ro1Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        Object ck2Var;
        int i = this.a;
        yb ybVar = null;
        int i2 = 16;
        int i3 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new yy0(ya1Var, i3, ((i91) obj).a());
            case 1:
                return new kg1(i3, new sw1(((xe1) ((eg1) obj).b).a()));
            case 2:
                return (ViewGroup) ((kc2) obj).g;
            case 3:
                return ((th1) obj).a();
            case 4:
                i91 i91Var = (i91) obj;
                return new wm1(new ai1((md1) ((wh1) i91Var.b).b.j, (es1) i91Var.c.c(), ((ti1) i91Var.d).a()), za1.a);
            case 5:
                da1 da1Var = (da1) obj;
                bi1 bi1Var = new bi1((md1) ((wh1) da1Var.b).b.j, (Executor) da1Var.c.c());
                if (((Boolean) tu0.e.c.a(lx0.sd)).booleanValue()) {
                    wm1 wm1Var = new wm1(bi1Var, za1.a);
                    int i4 = bk2.h;
                    ck2Var = new ck2(wm1Var);
                } else {
                    int i5 = bk2.h;
                    ck2Var = wk2.o;
                }
                dq.D(ck2Var);
                return ck2Var;
            case 6:
                return ((jj1) obj).a();
            case 7:
                zh1 zh1Var = (zh1) obj;
                return new ki1(new z91(((xe1) zh1Var.b).a(), ((yj1) zh1Var.c).a().g));
            case 8:
                return new ni1(((t63) obj).c());
            case 9:
                return new oj1(((ti1) obj).b());
            case 10:
                return (un1) obj;
            case 11:
                wo1 wo1Var = (wo1) ((wn1) obj).a.g;
                dq.D(wo1Var);
                Set setSingleton = wo1Var.d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                dq.D(setSingleton);
                return setSingleton;
            case 12:
                so1 so1Var = (so1) ((hj1) obj).b.c();
                dq.D(so1Var);
                JSONObject jSONObject = so1Var.b;
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject(so1Var.a.z);
                    } catch (JSONException unused) {
                        return null;
                    }
                    break;
                }
                return jSONObject;
            case 13:
                go1 go1Var = new go1(((ho1) obj).b.a());
                po1 po1Var = new po1();
                po1Var.a = go1Var;
                return po1Var;
            case 14:
                ro1 ro1Var = (ro1) ((kc2) obj).g;
                dq.D(ro1Var);
                return ro1Var;
            case 15:
                return new og1(1, (md1) ((r63) obj).c());
            case 16:
                return new wm1(new og1(1, (md1) ((r63) ((tz0) obj).b).c()), za1.f);
            case 17:
                re1 re1Var = (re1) obj;
                i10 i10Var = (i10) re1Var.b.c();
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new nr1(new gr1(i10Var, new s62(ya1Var2), (or1) re1Var.c.c(), new el1(29, (byte) 0)));
            case 18:
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                da1 da1Var2 = (da1) obj;
                Set setSingleton2 = ((Boolean) tu0.e.c.a(lx0.A5)).booleanValue() ? Collections.singleton(new wm1(new yr1((cv0) ((q63) da1Var2.b).c(), ((t63) da1Var2.c).c()), ya1Var3)) : Collections.EMPTY_SET;
                dq.D(setSingleton2);
                return setSingleton2;
            case 19:
                zh1 zh1Var2 = (zh1) obj;
                av1 av1Var = new av1(((xe1) zh1Var2.b).a(), (aa1) zh1Var2.c.c());
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                return new wm1(av1Var, ya1Var4);
            case 20:
                da1 da1Var3 = (da1) obj;
                wv1 wv1Var = (wv1) ((q63) da1Var3.b).c();
                da1 da1Var4 = (da1) da1Var3.c;
                yr1 yr1Var = new yr1(wv1Var, new xv1(((da1) da1Var4.b).a(), ((ve1) da1Var4.c).c()));
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                return new wm1(yr1Var, ya1Var5);
            case zw0.zzm /* 21 */:
                return new xz1(5, (Bundle) ((wj1) obj).b.c);
            case 22:
                dq.D(za1.a);
                dq.D(((r71) ((j32) obj).b.h).i);
                return new b32();
            case 23:
                Context context = ((we1) obj).b.b;
                dq.D(context);
                tb2 tb2Var = ub2.a;
                vb2 vb2Var = new vb2(context);
                ke keVar = jf.a;
                ge geVar = ge.h;
                i20 i20Var = new i20();
                geVar.getClass();
                return new i10(vb2Var, a23.g(new sd(lh.f, ybVar, i3)), new ig(16), v51.b(ar.j(geVar, i20Var)));
            case 24:
                ge2 ge2Var = (ge2) ((q63) new y91((hm1) ((gv1) ((wc2) obj).c()).g).i).c();
                dq.D(ge2Var);
                return ge2Var;
            case 25:
                hm1 hm1Var = (hm1) ((w32) ((wc2) obj).c()).g;
                s63 s63Var = (s63) hm1Var.b;
                s63 s63Var2 = (s63) hm1Var.d;
                q63 q63VarA = q63.a(new jy1(s63Var, s63Var2, (q63) hm1Var.h, 7));
                int i6 = 13;
                q63 q63VarA2 = q63.a(new eh1(s63Var, q63VarA, i6));
                q63 q63Var = (q63) hm1Var.i;
                q63 q63Var2 = (q63) hm1Var.c;
                s63 s63Var3 = (s63) hm1Var.f;
                q63 q63VarA3 = q63.a(new fo1(q63VarA2, q63Var, q63Var2, s63Var3, 1));
                q63 q63Var3 = (q63) hm1Var.n;
                q63 q63VarA4 = q63.a(new q12(q63Var3, 10));
                q63 q63Var4 = (q63) hm1Var.o;
                q63 q63VarA5 = q63.a(new iq1(q63.a(new fy0(q63VarA4, q63Var4, q63Var, 1)), q63.a(new fy0(q63.a(new q12(q63Var3, 12)), q63Var4, q63Var, 2)), q63.a(new fy0(q63.a(new q12(q63Var3, 14)), q63Var4, q63Var, 3)), q63Var, 3));
                q63 q63VarA6 = q63.a(new q12(q63Var3, i6));
                q63 q63VarA7 = q63.a(i8.A);
                ge2 ge2Var2 = (ge2) q63.a(new dy0(q63.a(new iq1(q63VarA3, q63.a(new jj1(s63Var, q63VarA2, q63VarA5, q63Var, s63Var2, q63.a(new y11(q63VarA6, q63VarA7, q63Var, 2)), q63VarA)), q63VarA5, q63Var, 2)), q63.a(new yn1(q63.a(new jh1(s63Var, q63.a(new jy1(s63Var, s63Var3, (q63) hm1Var.k, 6)), q63VarA, s63Var3, q63VarA7)), q63VarA5, q63VarA3, q63Var, s63Var2, q63.a(new q12(q63Var3, 11)))), (q63) hm1Var.e, s63Var3, 16)).c();
                dq.D(ge2Var2);
                return ge2Var2;
            default:
                hm1 hm1Var2 = (hm1) ((j52) ((wc2) obj).c()).f;
                q63 q63Var5 = (q63) hm1Var2.c;
                q63 q63Var6 = (q63) hm1Var2.i;
                s63 s63Var4 = (s63) hm1Var2.f;
                q63 q63VarA8 = q63.a(new jy1(q63Var5, q63Var6, s63Var4, 8));
                q63 q63VarA9 = q63.a(yd.o);
                s63 s63Var5 = (s63) hm1Var2.b;
                s63 s63Var6 = (s63) hm1Var2.d;
                q63 q63VarA10 = q63.a(new yn1((v63) s63Var5, (v63) s63Var6, (v63) s63Var4, (v63) hm1Var2.g, (v63) q63Var6, (v63) q63VarA9, 14));
                q63 q63Var7 = (q63) hm1Var2.n;
                q63 q63VarA11 = q63.a(new q12(q63Var7, 15));
                q63 q63Var8 = (q63) hm1Var2.o;
                q63 q63VarA12 = q63.a(new iq1(q63.a(new fy0(q63VarA11, q63Var8, q63Var6, 4)), q63.a(new fy0(q63.a(new q12(q63Var7, i2)), q63Var8, q63Var6, 5)), q63.a(new fy0(q63.a(new q12(q63Var7, 17)), q63Var8, q63Var6, 6)), q63Var6, 4));
                ge2 ge2Var3 = (ge2) q63.a(new dy0(q63.a(new iq1(q63VarA8, q63VarA10, q63VarA12, q63Var6, 2)), q63.a(new tg1(q63VarA8, q63VarA12, (q63) hm1Var2.k, q63Var6, s63Var4, s63Var6)), (q63) hm1Var2.e, s63Var4, 16)).c();
                dq.D(ge2Var3);
                return ge2Var3;
        }
    }
}
