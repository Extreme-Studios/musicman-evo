package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yy0 implements xm2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public yy0(tc2 tc2Var, Context context) {
        this.a = 15;
        this.b = context;
        Objects.requireNonNull(tc2Var);
        this.c = tc2Var;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) throws JSONException, w31 {
        hp hpVarB;
        ky1 ky1Var;
        int i = 25;
        d62 d62Var = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                kd0 kd0Var = (kd0) this.c;
                r71 r71Var = (r71) obj;
                String str = r71Var.i;
                zb3 zb3Var = vc3.C.c;
                if (zb3.e(str)) {
                    hpVarB = na1.C(new dv1(1));
                } else {
                    hpVarB = (((Boolean) tu0.e.c.a(lx0.R7)).booleanValue() || ((Boolean) fz0.a.u()).booleanValue()) ? ((ya1) kd0Var.i).b(new hq0(kd0Var, 8, r71Var)) : ((su1) kd0Var.j).c(r71Var);
                }
                return na1.L(na1.J((fn2) na1.K(fn2.r(hpVarB), ((Integer) tu0.e.c.a(lx0.Z5)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) kd0Var.g), Throwable.class, new mu1(kd0Var, r71Var, Binder.getCallingUid(), 1), (ya1) kd0Var.h), new by0(r71Var, 0), (Executor) this.b);
            case 1:
                u31 u31Var = (u31) obj;
                u31Var.p((String) this.b, (v11) this.c);
                return na1.t(u31Var);
            case 2:
                g41 g41Var = (g41) this.b;
                Object obj2 = this.c;
                cb1 cb1Var = new cb1();
                zb3 zb3Var2 = vc3.C.c;
                String string = UUID.randomUUID().toString();
                u11.j.a(string, new g21(g41Var, cb1Var));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", string);
                jSONObject.put("args", (JSONObject) obj2);
                g31 g31Var = (g31) ((u31) obj);
                g31Var.getClass();
                g31Var.s("google.afma.activeView.handleUpdate", jSONObject.toString());
                return cb1Var;
            case 3:
                sg1 sg1Var = (sg1) this.b;
                Uri.Builder builder = (Uri.Builder) this.c;
                sg1Var.e.a(new rg1(sg1Var, (Throwable) obj, i2));
                builder.appendQueryParameter((String) tu0.e.c.a(lx0.Ya), "9");
                return na1.t(builder.toString());
            case 4:
                vi1 vi1Var = (vi1) this.b;
                r71 r71Var2 = (r71) obj;
                r71Var2.n = (c62) this.c;
                r52 r52Var = vi1Var.h;
                return r52Var.V(r71Var2, new zx(i, (zu1) r52Var.h), new gv1(0, r52Var), new by0(r71Var2, 3));
            case 5:
                hq1 hq1Var = (hq1) this.b;
                JSONObject jSONObject2 = (JSONObject) this.c;
                md1 md1Var = (md1) obj;
                a31 a31Var = hq1Var.a.b;
                yu0 yu0Var = new yu0(md1Var);
                if (a31Var != null) {
                    md1Var.W(new eg(5, 0, 0));
                } else {
                    md1Var.W(new eg(4, 0, 0));
                }
                md1Var.e0().l = new p83(hq1Var, md1Var, yu0Var, 16);
                md1Var.e("google.afma.nativeAds.renderVideo", jSONObject2);
                return yu0Var;
            case 6:
                ru1 ru1Var = (ru1) this.b;
                c41 c41Var = (c41) this.c;
                JSONObject jSONObject3 = (JSONObject) obj;
                if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
                    ec.q(vc3.C.k, ru1Var.i.e, "scar-preloader-processing-done");
                }
                return c41Var.a(jSONObject3);
            case 7:
                ru1 ru1Var2 = (ru1) this.b;
                List list = (List) this.c;
                Exception exc = (Exception) obj;
                vc3.C.h.e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    ky1Var = new ky1("Timed out waiting for ad response.", 1);
                } else if (exc instanceof ky1) {
                    ky1Var = (ky1) exc;
                } else {
                    ky1Var = new ky1(exc.getMessage() == null ? "Fetch failed." : exc.getMessage(), 1);
                }
                String message = ky1Var.getMessage() == null ? "" : ky1Var.getMessage();
                if (list != null && !list.isEmpty()) {
                    String str2 = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str2 = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List listM = bz1.c(new vh2(':')).m(message);
                            if (listM.size() == 2) {
                                message = (String) listM.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(e82.c(e82.c((String) it.next(), "@gw_adnetstatus@", str2), "@error_code@", message));
                    }
                    ru1Var2.j.a(arrayList, null);
                }
                return na1.C(ky1Var);
            case 8:
                return ((cv1) ((v63) this.b).c()).d((r71) this.c);
            case 9:
                Bundle bundle = (Bundle) obj;
                y91 y91Var = (y91) this.b;
                e3 e3Var = (e3) y91Var.g;
                if1 if1Var = (if1) y91Var.j;
                Context context = if1Var.a.b;
                dq.D(context);
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                r71 r71Var3 = (r71) e3Var.h;
                dq.D(r71Var3.i);
                b32 b32Var = new b32();
                q63 q63Var = if1Var.d;
                t12 t12Var = new t12(b32Var, 0L, (ScheduledExecutorService) q63Var.c());
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) q63Var.c();
                Context context2 = if1Var.a.b;
                dq.D(context2);
                t12 t12Var2 = new t12(new xz1(6, scheduledExecutorService), ((Long) tu0.e.c.a(lx0.D4)).longValue(), (ScheduledExecutorService) q63Var.c());
                ue0 ue0Var = new ue0(17);
                dq.D(context2);
                t12 t12Var3 = new t12(new w22(ue0Var, context2, (ScheduledExecutorService) q63Var.c(), ya1Var, e3Var.g, r71Var3.q, r71Var3.p), 0L, (ScheduledExecutorService) q63Var.c());
                t12 t12Var4 = new t12(new c12(ya1Var, 5), 0L, (ScheduledExecutorService) q63Var.c());
                c12 c12Var = new c12(ya1Var, 4);
                dq.D(ya1Var);
                List list2 = ((r71) e3Var.h).j;
                dq.D(list2);
                c02 c02Var = new c02(ya1Var, 8, list2);
                e3 e3Var2 = (e3) y91Var.g;
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                r71 r71Var4 = (r71) e3Var2.h;
                String string2 = r71Var4.f.getString("ms");
                if (string2 == null) {
                    string2 = "";
                }
                PackageInfo packageInfo = r71Var4.k;
                c02 c02Var2 = new c02(ya1Var2, 7, string2);
                m22 m22Var = (m22) if1Var.O0.c();
                q63 q63Var2 = if1Var.U;
                dq.D(r71Var3.i);
                return new o22(context, ya1Var, bk2.h(t12Var, t12Var2, t12Var3, t12Var4, c12Var, c02Var, c02Var2, m22Var, new g02((sa1) q63Var2.c(), (ScheduledExecutorService) q63Var.c(), ya1Var)), (d72) ((q63) y91Var.h).c(), (es1) if1Var.j.c()).a(ut0.f.a.k(bundle), ((r71) this.c).r, false);
            case 10:
                return ((o22) this.b).a(ut0.f.a.k((Bundle) obj), ((r71) this.c).r, false);
            case 11:
                vx1 vx1Var = (vx1) this.b;
                uq1 uq1Var = (uq1) this.c;
                JSONObject jSONObject4 = (JSONObject) obj;
                t52 t52Var = vx1Var.d;
                kn2 kn2VarT = na1.t(uq1Var);
                synchronized (t52Var) {
                    t52Var.a.addFirst(kn2VarT);
                }
                if (!jSONObject4.optBoolean("success")) {
                    throw new w31("process json failed");
                }
                if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
                    ec.q(vc3.C.k, vx1Var.f.e, "rendering-native-ads-preprocess-end");
                }
                return na1.t(jSONObject4.getJSONObject("json").getJSONArray("ads"));
            case 12:
                vx1 vx1Var2 = (vx1) this.b;
                x42 x42Var = (x42) this.c;
                uq1 uq1Var2 = (uq1) obj;
                ix0 ix0Var = lx0.o2;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    ec.q(vc3.C.k, vx1Var2.f.e, "rendering-native-ads-preprocess-start");
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("isNonagon", true);
                if (((Boolean) tu0Var.c.a(lx0.p9)).booleanValue() && ej1.m()) {
                    jSONObject5.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("response", x42Var.s.c);
                jSONObject6.put("sdk_params", jSONObject5);
                return na1.L(uq1Var2.a("google.afma.nativeAds.preProcessJson", jSONObject6), new yy0(vx1Var2, 11, uq1Var2), vx1Var2.b);
            case 13:
                e52 e52Var = (e52) obj;
                ((d62) this.b).b = e52Var;
                Iterator it2 = ((List) e52Var.b.g).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((x42) it2.next()).a.iterator();
                    while (it3.hasNext()) {
                        if (!((String) it3.next()).contains("FirstPartyRenderer")) {
                            return kn2.g;
                        }
                        i2 = 1;
                    }
                }
                if (i2 != 0) {
                    return ((vi1) this.c).c(na1.t(e52Var));
                }
                return kn2.g;
            case 14:
                p83 p83Var = (p83) this.b;
                tj1 tj1Var = (tj1) this.c;
                e42 e42Var = (e42) obj;
                r52 r52Var2 = (r52) p83Var.g;
                e62 e62Var = e42Var.b;
                r71 r71Var5 = e42Var.a;
                synchronized (r52Var2) {
                    try {
                        y52 y52Var = (y52) ((ConcurrentHashMap) r52Var2.g).get(e62Var);
                        if (y52Var != null) {
                            l62 l62Var = y52Var.d;
                            l62Var.getClass();
                            vc3.C.k.getClass();
                            l62Var.c = System.currentTimeMillis();
                            l62Var.d++;
                            y52Var.a();
                            LinkedList linkedList = y52Var.a;
                            if (!linkedList.isEmpty() && (d62Var = (d62) linkedList.remove()) != null) {
                                l62Var.e++;
                                l62Var.b.f = true;
                            }
                            if (d62Var == null) {
                                ((a62) r52Var2.i).e++;
                            }
                            k62 k62Var = y52Var.d.b;
                            k62 k62VarClone = k62Var.clone();
                            k62Var.f = false;
                            k62Var.g = 0;
                            if (d62Var != null) {
                                bw0 bw0VarZ = gw0.z();
                                zv0 zv0VarA = aw0.A();
                                zv0VarA.b();
                                ((aw0) zv0VarA.g).B();
                                cw0 cw0VarZ = dw0.z();
                                boolean z = k62VarClone.f;
                                cw0VarZ.b();
                                ((dw0) cw0VarZ.g).B(z);
                                int i3 = k62VarClone.g;
                                cw0VarZ.b();
                                ((dw0) cw0VarZ.g).C(i3);
                                zv0VarA.b();
                                ((aw0) zv0VarA.g).C((dw0) cw0VarZ.c());
                                bw0VarZ.b();
                                ((gw0) bw0VarZ.g).A((aw0) zv0VarA.c());
                                d62Var.a.a().f.F((gw0) bw0VarZ.c());
                            }
                            r52Var2.S();
                        } else {
                            ((a62) r52Var2.i).d++;
                            r52Var2.S();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (d62Var != null && r71Var5 != null) {
                    vi1 vi1VarA = tj1Var.a();
                    r52 r52Var3 = vi1VarA.h;
                    p62 p62VarY = vi1VarA.c.a(r52Var3.V(r71Var5, new dr0(i, r52Var3), new zy1(27, r52Var3), kg0.g), r62.A).y();
                    p62VarY.a(new in2(p62VarY, i2, new zx(19, vi1VarA)), vi1VarA.j);
                    p62VarY.a(new in2(p62VarY, i2, (fl1) p83Var.i), (Executor) p83Var.h);
                }
                return na1.t(new z32(e62Var, r71Var5, d62Var));
            default:
                return ((ge2) ((tc2) this.c).b.f.get()).h((Context) this.b);
        }
    }

    public /* synthetic */ yy0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
