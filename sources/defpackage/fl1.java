package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fl1 implements gm1, hn2, n62, y31, li1, c42, zb, ii2 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ fl1 g = new fl1(0);
    public static final /* synthetic */ fl1 h = new fl1(1);
    public static final /* synthetic */ fl1 i = new fl1(2);
    public static final /* synthetic */ fl1 j = new fl1(3);
    public static final /* synthetic */ fl1 k = new fl1(4);
    public static final /* synthetic */ fl1 l = new fl1(5);
    public static final /* synthetic */ fl1 m = new fl1(6);
    public static final /* synthetic */ fl1 n = new fl1(8);
    public static final /* synthetic */ fl1 o = new fl1(9);
    public static final /* synthetic */ fl1 p = new fl1(10);
    public static final /* synthetic */ fl1 q = new fl1(11);
    public static final /* synthetic */ fl1 r = new fl1(12);
    public static final /* synthetic */ fl1 s = new fl1(13);
    public static final /* synthetic */ fl1 t = new fl1(14);
    public static final /* synthetic */ fl1 u = new fl1(15);
    public static final /* synthetic */ fl1 v = new fl1(18);
    public static final /* synthetic */ fl1 w = new fl1(19);
    public static final /* synthetic */ fl1 x = new fl1(21);
    public static final /* synthetic */ fl1 y = new fl1(22);
    public static final /* synthetic */ fl1 z = new fl1(24);
    public static final /* synthetic */ fl1 A = new fl1(26);
    public static final /* synthetic */ fl1 B = new fl1(27);

    public /* synthetic */ fl1(int i2) {
        this.f = i2;
    }

    public static final Set g(ms1 ms1Var, Executor executor) {
        return ((Boolean) ty0.a.u()).booleanValue() ? Collections.singleton(new wm1(ms1Var, executor)) : Collections.EMPTY_SET;
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        switch (this.f) {
            case 28:
                return -1;
            default:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void mo4b(Object obj) {
        int i2;
        switch (this.f) {
            case 0:
                ((lb3) obj).S2();
                return;
            case 1:
                ((lb3) obj).C1();
                return;
            case 2:
                ((lb3) obj).i3();
                return;
            case 3:
                ((ll1) obj).k();
                return;
            case 4:
                lz1 lz1Var = (lz1) obj;
                synchronized (lz1Var) {
                    try {
                        if (!lz1Var.g.d()) {
                            v32 v32Var = lz1Var.g;
                            am1 am1Var = v32Var.j;
                            nl1 nl1Var = v32Var.h;
                            synchronized (am1Var) {
                                i2 = am1Var.f;
                            }
                            nl1Var.R1(i2);
                            return;
                        }
                        h52 h52Var = lz1Var.k;
                        kb3 kb3VarU = h52Var.b;
                        sh1 sh1Var = lz1Var.n;
                        if (sh1Var != null && h52Var.q) {
                            kb3VarU = na1.u(lz1Var.f, Collections.singletonList(sh1Var.o));
                        }
                        synchronized (lz1Var) {
                            h52 h52Var2 = lz1Var.k;
                            h52Var2.b = kb3VarU;
                            h52Var2.q = lz1Var.j.s;
                            h52Var.p = true;
                            try {
                                lz1Var.B3(h52Var.a);
                            } catch (RemoteException unused) {
                                jn.T("Failed to refresh the banner ad.");
                            }
                            lz1Var.k.p = false;
                            break;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
            case 5:
                ((xl1) obj).w();
                return;
            case 6:
                ((dm1) obj).p();
                return;
            case 7:
                ((om1) obj).I("MalformedJson");
                return;
            case 8:
                ((om1) obj).d();
                return;
            case 9:
                ((qm1) obj).f();
                return;
            case 10:
                ((sm1) obj).a();
                return;
            case 11:
                ((zm1) obj).T0();
                return;
            case 12:
                bn1 bn1Var = (bn1) obj;
                if (bn1Var.d) {
                    return;
                }
                bn1Var.b.a(bn1Var.a, bn1Var.c);
                bn1Var.d = true;
                return;
            case 13:
                ((i21) obj).a();
                return;
            case 14:
                ((ar1) obj).a();
                return;
            case 15:
                ((ar1) obj).a();
                return;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case zw0.zzm /* 21 */:
            case 23:
            default:
                ((ku) obj).l();
                return;
            case 22:
                ((b11) obj).y();
                return;
            case 24:
                ((lb3) obj).N1();
                return;
        }
    }

    @Override // defpackage.zb
    public /* synthetic */ Object c(ve3 ve3Var) {
        return new Boolean(ve3Var.c());
    }

    public eg d(Context context, dg dgVar) {
        eg egVar = new eg();
        egVar.a = 0;
        egVar.b = 0;
        egVar.c = 0;
        int iM = dgVar.m(context, true);
        egVar.b = iM;
        if (iM != 0) {
            egVar.c = 1;
            return egVar;
        }
        int iL = dgVar.l(context);
        egVar.a = iL;
        if (iL != 0) {
            egVar.c = -1;
        }
        return egVar;
    }

    @Override // defpackage.y31
    public JSONObject e(Object obj) throws JSONException {
        lv1 lv1Var = (lv1) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) tu0.e.c.a(lx0.ba)).booleanValue()) {
            s71 s71Var = lv1Var.c;
            jSONObject2.put("ad_request_url", s71Var.f);
            jSONObject2.put("ad_request_post_body", s71Var.c);
        }
        s71 s71Var2 = lv1Var.c;
        jSONObject2.put("base_url", s71Var2.b);
        jSONObject2.put("signals", lv1Var.b);
        rv1 rv1Var = lv1Var.a;
        jSONObject3.put("body", rv1Var.c);
        jSONObject3.put("headers", ut0.f.a.j(rv1Var.b));
        jSONObject3.put("response_code", rv1Var.a);
        jSONObject3.put("latency", rv1Var.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", s71Var2.h);
        return jSONObject;
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 16:
                break;
            default:
                jn.p("Notification of cache hit failed.");
                break;
        }
    }

    @Override // defpackage.li1
    /* JADX INFO: renamed from: a */
    public /* synthetic */ hv1 mo1a() {
        return null;
    }

    private final void f(Throwable th) {
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public /* synthetic */ void mo5e(Object obj) {
        switch (this.f) {
            case 16:
                ((md1) obj).destroy();
                break;
            default:
                jn.p("Notification of cache hit successful.");
                break;
        }
    }

    @Override // defpackage.n62
    public /* synthetic */ Object b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        jn.p("Ad request signals:");
        jn.p(jSONObject.toString(2));
        return jSONObject;
    }
}
