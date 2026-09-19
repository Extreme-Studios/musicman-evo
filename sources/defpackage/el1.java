package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class el1 implements gm1, dg, x31, c42, ii2 {
    public static final /* synthetic */ el1 A;
    public static final /* synthetic */ el1 B;
    public static final /* synthetic */ el1 C;
    public static final /* synthetic */ el1 D;
    public static final /* synthetic */ el1 E;
    public static final /* synthetic */ el1 g;
    public static final /* synthetic */ el1 h;
    public static final /* synthetic */ el1 i;
    public static final /* synthetic */ el1 j;
    public static final /* synthetic */ el1 k;
    public static final /* synthetic */ el1 l;
    public static final /* synthetic */ el1 m;
    public static final /* synthetic */ el1 n;
    public static final /* synthetic */ el1 o;
    public static final /* synthetic */ el1 p;
    public static final /* synthetic */ el1 q;
    public static final /* synthetic */ el1 r;
    public static final /* synthetic */ el1 s;
    public static final /* synthetic */ el1 t;
    public static final /* synthetic */ el1 u;
    public static final /* synthetic */ el1 v;
    public static final /* synthetic */ el1 w;
    public static final /* synthetic */ el1 x;
    public static final /* synthetic */ el1 y;
    public static final /* synthetic */ el1 z;
    public final /* synthetic */ int f;

    static {
        byte b = 0;
        g = new el1(0, b);
        h = new el1(1, b);
        i = new el1(2, b);
        j = new el1(3, b);
        k = new el1(4, b);
        l = new el1(5, b);
        m = new el1(6, b);
        n = new el1(7, b);
        o = new el1(8, b);
        p = new el1(9, b);
        q = new el1(10, b);
        r = new el1(11, b);
        s = new el1(12, b);
        t = new el1(13, b);
        u = new el1(14, b);
        v = new el1(15, b);
        w = new el1(16, b);
        x = new el1(18, b);
        y = new el1(20, b);
        z = new el1(22, b);
        A = new el1(23, b);
        B = new el1(24, b);
        C = new el1(25, b);
        D = new el1(26, b);
        E = new el1(28, b);
    }

    public el1(int i2) {
        this.f = 27;
    }

    public static boolean c(Context context) {
        if (((Boolean) tu0.e.c.a(lx0.G5)).booleanValue()) {
            Boolean bool = (Boolean) k(new kz0(context));
            return bool != null && bool.booleanValue();
        }
        jn.T("Omid flag is disabled");
        return false;
    }

    public static String d() {
        if (((Boolean) tu0.e.c.a(lx0.G5)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public static qw1 e(final int i2, final int i3, final WebView webView, final String str, final String str2, final String str3) {
        if (((Boolean) tu0.e.c.a(lx0.G5)).booleanValue() && v51.m.g) {
            return (qw1) k(new mw1() { // from class: jw1
                @Override // defpackage.mw1
                public final Object a() {
                    if (TextUtils.isEmpty("Google")) {
                        j7.p("Name is null or empty");
                        return null;
                    }
                    String str4 = str;
                    if (TextUtils.isEmpty(str4)) {
                        j7.p("Version is null or empty");
                        return null;
                    }
                    yl1 yl1Var = new yl1("Google", str4);
                    d92 d92VarH = el1.h("javascript");
                    int i4 = i3;
                    y82 y82VarJ = el1.j(ec.b(i4));
                    d92 d92Var = d92.i;
                    if (d92VarH == d92Var) {
                        jn.T("Omid html session error; Unable to parse impression owner: javascript");
                        return null;
                    }
                    if (y82VarJ == null) {
                        jn.T("Omid html session error; Unable to parse creative type: ".concat(ec.A(i4)));
                        return null;
                    }
                    String str5 = str2;
                    d92 d92VarH2 = el1.h(str5);
                    if (y82VarJ == y82.j && d92VarH2 == d92Var) {
                        jn.T("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str5)));
                        return null;
                    }
                    m40 m40Var = new m40(yl1Var, webView, str3, "", w82.g);
                    db2 db2VarE = db2.e(y82VarJ, el1.i(ec.c(i2)), d92VarH, d92VarH2, true);
                    if (v51.m.g) {
                        return new qw1(new x82(db2VarE, m40Var, UUID.randomUUID().toString()), m40Var);
                    }
                    j7.e("Method called before OM SDK activation");
                    return null;
                }
            });
        }
        return null;
    }

    public static void f(x82 x82Var) {
        if (((Boolean) tu0.e.c.a(lx0.G5)).booleanValue() && v51.m.g) {
            n(new iw1(x82Var, 0));
        }
    }

    public static void g(x82 x82Var, View view) {
        n(new lw1(x82Var, view, 1));
    }

    public static d92 h(String str) {
        if ("native".equals(str)) {
            return d92.g;
        }
        return "javascript".equals(str) ? d92.h : d92.i;
    }

    public static b92 i(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return b92.j;
                }
            } else if (str.equals("definedByJavascript")) {
                return b92.g;
            }
        } else if (str.equals("beginToRender")) {
            return b92.i;
        }
        return b92.h;
    }

    public static y82 j(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return y82.h;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return y82.j;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return y82.i;
        }
        return null;
    }

    public static final Object k(mw1 mw1Var) {
        try {
            return mw1Var.a();
        } catch (RuntimeException e) {
            vc3.C.h.e("omid exception", e);
            return null;
        }
    }

    public static final void n(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            vc3.C.h.e("omid exception", e);
        }
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        return -1;
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public void mo4b(Object obj) {
        int i2;
        ov1 ov1VarP = null;
        switch (this.f) {
            case 0:
                ((lb3) obj).N1();
                return;
            case 1:
                ((lb3) obj).Y();
                return;
            case 2:
                ((lb3) obj).n2();
                return;
            case 3:
                ((lb3) obj).f();
                return;
            case 4:
                lz1 lz1Var = (lz1) obj;
                synchronized (lz1Var) {
                    v32 v32Var = lz1Var.g;
                    if (v32Var.d()) {
                        v32Var.c();
                        return;
                    }
                    am1 am1Var = v32Var.j;
                    nl1 nl1Var = v32Var.h;
                    synchronized (am1Var) {
                        i2 = am1Var.g;
                    }
                    nl1Var.S1(i2);
                    return;
                }
            case 5:
                ((vl1) obj).a();
                return;
            case 6:
                ((xl1) obj).p();
                return;
            case 7:
                ((fm1) obj).a();
                return;
            case 8:
                ((om1) obj).b();
                return;
            case 9:
                ((qm1) obj).e();
                return;
            case 10:
                ((sm1) obj).y();
                return;
            case 11:
                ((vm1) obj).j();
                return;
            case 12:
                ((zm1) obj).q0();
                return;
            case 13:
                ((i21) obj).r();
                return;
            case 14:
                hv1 hv1VarR = ((ar1) obj).a.r();
                if (hv1VarR != null) {
                    try {
                        ov1VarP = hv1VarR.p();
                        break;
                    } catch (RemoteException unused) {
                    }
                }
                if (ov1VarP == null) {
                    return;
                }
                try {
                    ov1VarP.f();
                    return;
                } catch (RemoteException e) {
                    jn.V("Unable to call onVideoEnd()", e);
                    return;
                }
            case 15:
                ((ar1) obj).getClass();
                return;
            case 16:
                hv1 hv1VarR2 = ((ar1) obj).a.r();
                if (hv1VarR2 != null) {
                    try {
                        ov1VarP = hv1VarR2.p();
                        break;
                    } catch (RemoteException unused2) {
                    }
                }
                if (ov1VarP == null) {
                    return;
                }
                try {
                    ov1VarP.e();
                    return;
                } catch (RemoteException e2) {
                    jn.V("Unable to call onVideoEnd()", e2);
                    return;
                }
            case 17:
            case 18:
            case 19:
            case 20:
            case zw0.zzm /* 21 */:
            default:
                ((o81) obj).k();
                return;
            case 22:
                ((b11) obj).g();
                return;
            case 23:
                ((xi1) obj).l();
                return;
            case 24:
                ((dl1) obj).i();
                return;
            case 25:
                ((lb3) obj).S2();
                return;
        }
    }

    @Override // defpackage.dg
    public int l(Context context) {
        return fg.a(context);
    }

    @Override // defpackage.dg
    public int m(Context context, boolean z2) {
        return fg.d(context, z2);
    }

    @Override // defpackage.x31
    public /* synthetic */ Object x(JSONObject jSONObject) {
        return new s71(jSONObject);
    }

    public /* synthetic */ el1(int i2, byte b) {
        this.f = i2;
    }
}
