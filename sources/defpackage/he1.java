package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class he1 extends WebViewClient implements ib0, zm1 {
    public static final /* synthetic */ int M = 0;
    public f61 A;
    public vs0 B;
    public d61 C;
    public d91 D;
    public es1 E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final HashSet J;
    public final hw1 K;
    public nd1 L;
    public final yd1 f;
    public final cv0 g;
    public final HashMap h;
    public final Object i;
    public ib0 j;
    public lb3 k;
    public ke1 l;
    public le1 m;
    public j11 n;
    public k11 o;
    public zm1 p;
    public boolean q;
    public boolean r;
    public int s;
    public String t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public md0 z;

    public he1(yd1 yd1Var, cv0 cv0Var, boolean z, hw1 hw1Var) {
        f61 f61Var = new f61(yd1Var, yd1Var.a0(), new n92(yd1Var.getContext()));
        this.h = new HashMap();
        this.i = new Object();
        this.s = 0;
        this.t = "";
        this.u = "";
        this.g = cv0Var;
        this.f = yd1Var;
        this.v = z;
        this.A = f61Var;
        this.C = null;
        this.J = new HashSet(Arrays.asList(((String) tu0.e.c.a(lx0.d6)).split(",")));
        this.K = hw1Var;
    }

    public static final boolean I(yd1 yd1Var) {
        x42 x42Var = yd1Var.f.o;
        return x42Var != null && x42Var.b();
    }

    public static final boolean N(boolean z, yd1 yd1Var) {
        return (!z || yd1Var.f.x().b() || yd1Var.f.V().equals("interstitial_mb")) ? false : true;
    }

    public static WebResourceResponse w() {
        if (((Boolean) tu0.e.c.a(lx0.S0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public final WebResourceResponse A(String str, Map map) throws IOException {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                zb3 zb3Var = vc3.C.c;
                yd1 yd1Var = this.f;
                zb3Var.B(yd1Var.getContext(), yd1Var.f.j.f, httpURLConnection, 60000);
                o83 o83Var = new o83();
                WebResourceResponse webResourceResponse = null;
                o83Var.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                o83Var.b(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    String contentType = httpURLConnection.getContentType();
                    String strTrim = "";
                    String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                    String contentType2 = httpURLConnection.getContentType();
                    if (!TextUtils.isEmpty(contentType2)) {
                        String[] strArrSplit = contentType2.split(";");
                        if (strArrSplit.length != 1) {
                            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                                if (strArrSplit[i2].trim().startsWith("charset")) {
                                    String[] strArrSplit2 = strArrSplit[i2].trim().split("=");
                                    if (strArrSplit2.length > 1) {
                                        strTrim = strArrSplit2[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String str2 = strTrim;
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap map2 = new HashMap(headerFields.size());
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                            map2.put(entry2.getKey(), entry2.getValue().get(0));
                        }
                    }
                    r53 r53Var = vc3.C.f;
                    int responseCode2 = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    r53Var.getClass();
                    webResourceResponse = new WebResourceResponse(strTrim2, str2, responseCode2, responseMessage, map2, inputStream);
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (!headerField.startsWith("tel:")) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            jn.T("Protocol is null");
                            webResourceResponse = w();
                        } else if (protocol.equals("http") || protocol.equals("https")) {
                            StringBuilder sb = new StringBuilder(headerField.length() + 15);
                            sb.append("Redirecting to ");
                            sb.append(headerField);
                            jn.F(sb.toString());
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            StringBuilder sb2 = new StringBuilder(protocol.length() + 20);
                            sb2.append("Unsupported scheme: ");
                            sb2.append(protocol);
                            jn.T(sb2.toString());
                            webResourceResponse = w();
                        }
                    }
                }
                TrafficStats.clearThreadStatsTag();
                return webResourceResponse;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // defpackage.ib0
    public final void B() {
        ib0 ib0Var = this.j;
        if (ib0Var != null) {
            ib0Var.B();
        }
    }

    public final void F(Map map, List list, String str) {
        if (jn.B()) {
            jn.p("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                jn.p(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((v11) it.next()).f(this.f, map);
        }
    }

    public final void P(sg1 sg1Var, bw1 bw1Var, f82 f82Var) {
        d("/click");
        if (bw1Var != null && f82Var != null) {
            b("/click", new ao1(this.p, sg1Var, f82Var, bw1Var));
            return;
        }
        zm1 zm1Var = this.p;
        m11 m11Var = u11.a;
        b("/click", new s11(zm1Var, 0, sg1Var));
    }

    public final void R(sg1 sg1Var, bw1 bw1Var, es1 es1Var) {
        d("/open");
        b("/open", new f21(this.B, this.C, bw1Var, es1Var, sg1Var, null));
    }

    @Override // defpackage.zm1
    public final void T0() {
        zm1 zm1Var = this.p;
        if (zm1Var != null) {
            zm1Var.T0();
        }
    }

    public final boolean U() {
        boolean z;
        synchronized (this.i) {
            z = this.w;
        }
        return z;
    }

    public final void Y() {
        d91 d91Var = this.D;
        if (d91Var != null) {
            yd1 yd1Var = this.f;
            de1 de1Var = yd1Var.f;
            WeakHashMap weakHashMap = w60.a;
            if (de1Var.isAttachedToWindow()) {
                s(de1Var, d91Var, 10);
                return;
            }
            nd1 nd1Var = this.L;
            if (nd1Var != null) {
                yd1Var.removeOnAttachStateChangeListener(nd1Var);
            }
            nd1 nd1Var2 = new nd1(this, d91Var);
            this.L = nd1Var2;
            yd1Var.addOnAttachStateChangeListener(nd1Var2);
        }
    }

    public final void Z() {
        de1 de1Var;
        us2 us2Var;
        ke1 ke1Var = this.l;
        yd1 yd1Var = this.f;
        if (ke1Var != null && ((this.F && this.H <= 0) || this.G || this.r)) {
            if (((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue() && (us2Var = (de1Var = yd1Var.f).Q) != null) {
                jn.q((sx0) us2Var.h, de1Var.O, "awfllc");
            }
            ke1 ke1Var2 = this.l;
            boolean z = false;
            if (!this.G && !this.r) {
                z = true;
            }
            ke1Var2.q(this.t, this.s, this.u, z);
            this.l = null;
        }
        de1 de1Var2 = yd1Var.f;
        if (de1Var2.P == null) {
            us2 us2Var2 = de1Var2.Q;
            us2Var2.getClass();
            rx0 rx0VarD = sx0.d();
            de1Var2.P = rx0VarD;
            ((HashMap) us2Var2.g).put("native:view_load", rx0VarD);
        }
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        r91 r91Var;
        d61 d61Var = this.C;
        boolean z = false;
        if (d61Var != null) {
            synchronized (d61Var.q) {
                z = d61Var.x != null;
            }
        }
        v33 v33Var = vc3.C.b;
        v33.a(this.f.getContext(), adOverlayInfoParcel, !z, this.E);
        d91 d91Var = this.D;
        if (d91Var != null) {
            String str = adOverlayInfoParcel.q;
            if (str == null && (r91Var = adOverlayInfoParcel.f) != null) {
                str = r91Var.g;
            }
            d91Var.a(str);
        }
    }

    public final void b(String str, v11 v11Var) {
        synchronized (this.i) {
            try {
                HashMap map = this.h;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(v11Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str) {
        synchronized (this.i) {
            try {
                List list = (List) this.h.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        d91 d91Var = this.D;
        int i = 1;
        int i2 = 0;
        if (d91Var != null) {
            synchronized (d91Var.h) {
                d91Var.b.keySet();
                kn2 kn2VarT = na1.t(Collections.EMPTY_MAP);
                r21 r21Var = new r21(i, d91Var);
                ya1 ya1Var = za1.g;
                pm2 pm2VarL = na1.L(kn2VarT, r21Var, ya1Var);
                hp hpVarK = na1.K(pm2VarL, 10L, TimeUnit.SECONDS, za1.d);
                pm2VarL.a(new in2(pm2VarL, i2, new zx(d91Var, hpVarK)), ya1Var);
                d91.l.add(hpVarK);
            }
            this.D = null;
        }
        nd1 nd1Var = this.L;
        if (nd1Var != null) {
            this.f.removeOnAttachStateChangeListener(nd1Var);
        }
        synchronized (this.i) {
            try {
                this.h.clear();
                this.j = null;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.q = false;
                this.v = false;
                this.w = false;
                this.x = false;
                this.z = null;
                this.B = null;
                this.A = null;
                d61 d61Var = this.C;
                if (d61Var != null) {
                    d61Var.E(true);
                    this.C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f0(r91 r91Var, boolean z, boolean z2, String str) {
        yd1 yd1Var = this.f;
        boolean zX0 = yd1Var.f.X0();
        boolean z3 = false;
        boolean z4 = N(zX0, yd1Var) || z2;
        if (z4 || !z) {
            z3 = true;
        }
        a(new AdOverlayInfoParcel(r91Var, z4 ? null : this.j, zX0 ? null : this.k, this.z, yd1Var.f.j, yd1Var, z3 ? null : this.p, str));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0221 A[Catch: all -> 0x022a, TryCatch #5 {all -> 0x022a, blocks: (B:98:0x020f, B:100:0x0221, B:104:0x022c), top: B:154:0x020f }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:145:0x0312 A[Catch: Exception | NoClassDefFoundError -> 0x0326, Exception | NoClassDefFoundError -> 0x0326, TryCatch #13 {Exception | NoClassDefFoundError -> 0x0326, blocks: (B:3:0x0014, B:4:0x001b, B:6:0x0021, B:6:0x0021, B:7:0x0023, B:7:0x0023, B:9:0x0033, B:9:0x0033, B:11:0x003a, B:11:0x003a, B:13:0x0046, B:13:0x0046, B:15:0x0062, B:16:0x0069, B:16:0x0069, B:18:0x007c, B:18:0x007c, B:20:0x0095, B:20:0x0095, B:22:0x009b, B:22:0x009b, B:26:0x00a3, B:26:0x00a3, B:27:0x00a5, B:28:0x00a9, B:28:0x00a9, B:30:0x00b5, B:33:0x00bf, B:33:0x00bf, B:34:0x00c1, B:35:0x00c7, B:35:0x00c7, B:37:0x00cd, B:37:0x00cd, B:39:0x00e2, B:39:0x00e2, B:40:0x00e6, B:41:0x00f3, B:41:0x00f3, B:105:0x022f, B:107:0x023c, B:107:0x023c, B:94:0x0202, B:94:0x0202, B:140:0x02fc, B:140:0x02fc, B:143:0x030c, B:143:0x030c, B:145:0x0312, B:145:0x0312, B:147:0x0320, B:147:0x0320, B:109:0x0268, B:111:0x0275, B:111:0x0275, B:112:0x02a1, B:112:0x02a1, B:91:0x01cc, B:93:0x01d9, B:93:0x01d9, B:58:0x0147, B:58:0x0147, B:59:0x0149, B:61:0x0152, B:61:0x0152, B:38:0x00d8, B:38:0x00d8, B:113:0x02a2, B:114:0x02a6, B:114:0x02a6, B:116:0x02ac, B:116:0x02ac, B:118:0x02b2, B:120:0x02b5, B:121:0x02b6, B:121:0x02b6, B:122:0x02d3, B:124:0x02d6, B:125:0x02d7, B:125:0x02d7, B:129:0x02e6, B:133:0x02f2, B:136:0x02f5), top: B:160:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    public final WebResourceResponse h(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i;
        InputStream wm0Var;
        boolean z;
        long j;
        InputStream inputStreamB;
        Long l;
        Throwable th;
        final boolean z2;
        InputStream inputStream;
        boolean z3;
        String string;
        String str2 = "ms";
        try {
            HashMap map2 = new HashMap();
            yd1 yd1Var = this.f;
            try {
                x42 x42Var = yd1Var.f.o;
                if (x42Var != null) {
                    map2 = x42Var.w0;
                }
                String strR = v51.r(str, yd1Var.getContext(), this.I, map2);
                if (!strR.equals(str)) {
                    return A(strR, map);
                }
                wu0 wu0VarA = wu0.a(Uri.parse(str));
                if (wu0VarA != null) {
                    HashMap map3 = new HashMap();
                    webResourceResponse = null;
                    map3.put("Access-Control-Allow-Origin", "*");
                    Uri uri = Uri.parse(str);
                    if (uri.getQueryParameterNames().contains("range")) {
                        List listM = bz1.c(new vh2('-')).m(uri.getQueryParameter("range"));
                        if (listM.size() == 2) {
                            int i2 = Integer.parseInt((String) listM.get(0));
                            int i3 = Integer.parseInt((String) listM.get(1)) + 1;
                            if (i2 > 0) {
                                wu0VarA.m = i2;
                            }
                            i = i3 - i2;
                        } else {
                            str2 = "ms";
                            i = -1;
                        }
                    } else {
                        str2 = "ms";
                        i = -1;
                    }
                    ix0 ix0Var = lx0.J4;
                    tu0 tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        String strO = yd1Var.f.o();
                        if (strO == null) {
                            strO = "";
                        }
                        wu0VarA.n = strO;
                        wu0VarA.o = yd1Var.f.q();
                        if (wu0VarA.l) {
                            l = (Long) tu0Var.c.a(lx0.L4);
                        } else {
                            l = (Long) tu0Var.c.a(lx0.K4);
                        }
                        long jLongValue = l.longValue();
                        vc3 vc3Var = vc3.C;
                        vc3Var.k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        yu0 yu0VarD = zf0.d(yd1Var.getContext(), wu0VarA);
                        try {
                            av0 av0Var = (av0) yu0VarD.f.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(av0Var.b));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(av0Var.c));
                                    map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(av0Var.e));
                                    map3.put("X-Afma-Gcache-CachedBytes", Long.toString(av0Var.d));
                                    inputStreamB = av0Var.a;
                                    if (i != -1) {
                                        long j2 = i;
                                        try {
                                            int i4 = ll2.a;
                                            inputStreamB = new wm0(inputStreamB, j2);
                                        } catch (InterruptedException e) {
                                            e = e;
                                            inputStream = inputStreamB;
                                            z3 = true;
                                            try {
                                                if (((Boolean) tu0.e.c.a(lx0.O4)).booleanValue()) {
                                                    vc3.C.h.d("AdWebViewClient.interceptRequest.gcache", e);
                                                }
                                                yu0VarD.cancel(true);
                                                Thread.currentThread().interrupt();
                                                vc3.C.k.getClass();
                                                final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                                final int i5 = 1;
                                                final boolean z4 = z3;
                                                zb3.l.post(new Runnable(this) { // from class: rd1
                                                    public final /* synthetic */ he1 g;

                                                    {
                                                        this.g = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        int i6 = i5;
                                                        long j3 = jElapsedRealtime2;
                                                        boolean z5 = z4;
                                                        he1 he1Var = this.g;
                                                        switch (i6) {
                                                            case 0:
                                                                he1Var.f.z(j3, z5);
                                                                break;
                                                            case 1:
                                                                he1Var.f.z(j3, z5);
                                                                break;
                                                            default:
                                                                he1Var.f.z(j3, z5);
                                                                break;
                                                        }
                                                    }
                                                });
                                                StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 24);
                                                sb.append("Cache connection took ");
                                                sb.append(jElapsedRealtime2);
                                                sb.append(str2);
                                                string = sb.toString();
                                                jn.p(string);
                                                wm0Var = inputStream;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z2 = z3;
                                                th = th;
                                                vc3.C.k.getClass();
                                                final long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                                final int i6 = 2;
                                                zb3.l.post(new Runnable(this) { // from class: rd1
                                                    public final /* synthetic */ he1 g;

                                                    {
                                                        this.g = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        int i7 = i6;
                                                        long j3 = jElapsedRealtime3;
                                                        boolean z5 = z2;
                                                        he1 he1Var = this.g;
                                                        switch (i7) {
                                                            case 0:
                                                                he1Var.f.z(j3, z5);
                                                                break;
                                                            case 1:
                                                                he1Var.f.z(j3, z5);
                                                                break;
                                                            default:
                                                                he1Var.f.z(j3, z5);
                                                                break;
                                                        }
                                                    }
                                                });
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                                                sb2.append("Cache connection took ");
                                                sb2.append(jElapsedRealtime3);
                                                sb2.append(str2);
                                                jn.p(sb2.toString());
                                                throw th;
                                            }
                                        } catch (ExecutionException e2) {
                                            e = e2;
                                            inputStream = inputStreamB;
                                            z3 = true;
                                            try {
                                                if (((Boolean) tu0.e.c.a(lx0.O4)).booleanValue()) {
                                                    vc3.C.h.d("AdWebViewClient.interceptRequest.gcache", e);
                                                }
                                                yu0VarD.cancel(true);
                                                vc3.C.k.getClass();
                                                final long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                                final int i7 = 0;
                                                final boolean z5 = z3;
                                                zb3.l.post(new Runnable(this) { // from class: rd1
                                                    public final /* synthetic */ he1 g;

                                                    {
                                                        this.g = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        int i8 = i7;
                                                        long j3 = jElapsedRealtime4;
                                                        boolean z6 = z5;
                                                        he1 he1Var = this.g;
                                                        switch (i8) {
                                                            case 0:
                                                                he1Var.f.z(j3, z6);
                                                                break;
                                                            case 1:
                                                                he1Var.f.z(j3, z6);
                                                                break;
                                                            default:
                                                                he1Var.f.z(j3, z6);
                                                                break;
                                                        }
                                                    }
                                                });
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                                                sb3.append("Cache connection took ");
                                                sb3.append(jElapsedRealtime4);
                                                sb3.append(str2);
                                                string = sb3.toString();
                                                jn.p(string);
                                                wm0Var = inputStream;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z2 = z3;
                                                th = th;
                                                vc3.C.k.getClass();
                                                final long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                                final int i8 = 2;
                                                zb3.l.post(new Runnable(this) { // from class: rd1
                                                    public final /* synthetic */ he1 g;

                                                    {
                                                        this.g = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        int i9 = i8;
                                                        long j3 = jElapsedRealtime5;
                                                        boolean z6 = z2;
                                                        he1 he1Var = this.g;
                                                        switch (i9) {
                                                            case 0:
                                                                he1Var.f.z(j3, z6);
                                                                break;
                                                            case 1:
                                                                he1Var.f.z(j3, z6);
                                                                break;
                                                            default:
                                                                he1Var.f.z(j3, z6);
                                                                break;
                                                        }
                                                    }
                                                });
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                                                sb4.append("Cache connection took ");
                                                sb4.append(jElapsedRealtime5);
                                                sb4.append(str2);
                                                jn.p(sb4.toString());
                                                throw th;
                                            }
                                        } catch (TimeoutException e3) {
                                            e = e3;
                                            inputStream = inputStreamB;
                                            z3 = true;
                                            if (((Boolean) tu0.e.c.a(lx0.O4)).booleanValue()) {
                                                vc3.C.h.d("AdWebViewClient.interceptRequest.gcache", e);
                                            }
                                            yu0VarD.cancel(true);
                                            vc3.C.k.getClass();
                                            final long jElapsedRealtime6 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                            final int i9 = 0;
                                            final boolean z6 = z3;
                                            zb3.l.post(new Runnable(this) { // from class: rd1
                                                public final /* synthetic */ he1 g;

                                                {
                                                    this.g = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    int i10 = i9;
                                                    long j3 = jElapsedRealtime6;
                                                    boolean z7 = z6;
                                                    he1 he1Var = this.g;
                                                    switch (i10) {
                                                        case 0:
                                                            he1Var.f.z(j3, z7);
                                                            break;
                                                        case 1:
                                                            he1Var.f.z(j3, z7);
                                                            break;
                                                        default:
                                                            he1Var.f.z(j3, z7);
                                                            break;
                                                    }
                                                }
                                            });
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(jElapsedRealtime6).length() + 24);
                                            sb5.append("Cache connection took ");
                                            sb5.append(jElapsedRealtime6);
                                            sb5.append(str2);
                                            string = sb5.toString();
                                            jn.p(string);
                                            wm0Var = inputStream;
                                        }
                                    }
                                    vc3Var.k.getClass();
                                    final long jElapsedRealtime7 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    zb3.l.post(new Runnable() { // from class: qd1
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.f.f.z(jElapsedRealtime7, true);
                                        }
                                    });
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(jElapsedRealtime7).length() + 24);
                                    sb6.append("Cache connection took ");
                                    sb6.append(jElapsedRealtime7);
                                    sb6.append(str2);
                                    jn.p(sb6.toString());
                                    wm0Var = inputStreamB;
                                } catch (Throwable th4) {
                                    th = th4;
                                    z2 = true;
                                    vc3.C.k.getClass();
                                    final long jElapsedRealtime8 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    final int i10 = 2;
                                    zb3.l.post(new Runnable(this) { // from class: rd1
                                        public final /* synthetic */ he1 g;

                                        {
                                            this.g = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            int i11 = i10;
                                            long j3 = jElapsedRealtime8;
                                            boolean z7 = z2;
                                            he1 he1Var = this.g;
                                            switch (i11) {
                                                case 0:
                                                    he1Var.f.z(j3, z7);
                                                    break;
                                                case 1:
                                                    he1Var.f.z(j3, z7);
                                                    break;
                                                default:
                                                    he1Var.f.z(j3, z7);
                                                    break;
                                            }
                                        }
                                    });
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(jElapsedRealtime8).length() + 24);
                                    sb7.append("Cache connection took ");
                                    sb7.append(jElapsedRealtime8);
                                    sb7.append(str2);
                                    jn.p(sb7.toString());
                                    throw th;
                                }
                            } catch (InterruptedException e4) {
                                e = e4;
                                inputStream = null;
                            } catch (ExecutionException e5) {
                                e = e5;
                                inputStream = null;
                                z3 = true;
                                if (((Boolean) tu0.e.c.a(lx0.O4)).booleanValue()) {
                                    vc3.C.h.d("AdWebViewClient.interceptRequest.gcache", e);
                                }
                                yu0VarD.cancel(true);
                                vc3.C.k.getClass();
                                final long jElapsedRealtime9 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                final int i11 = 0;
                                final boolean z7 = z3;
                                zb3.l.post(new Runnable(this) { // from class: rd1
                                    public final /* synthetic */ he1 g;

                                    {
                                        this.g = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        int i12 = i11;
                                        long j3 = jElapsedRealtime9;
                                        boolean z8 = z7;
                                        he1 he1Var = this.g;
                                        switch (i12) {
                                            case 0:
                                                he1Var.f.z(j3, z8);
                                                break;
                                            case 1:
                                                he1Var.f.z(j3, z8);
                                                break;
                                            default:
                                                he1Var.f.z(j3, z8);
                                                break;
                                        }
                                    }
                                });
                                StringBuilder sb8 = new StringBuilder(String.valueOf(jElapsedRealtime9).length() + 24);
                                sb8.append("Cache connection took ");
                                sb8.append(jElapsedRealtime9);
                                sb8.append(str2);
                                string = sb8.toString();
                                jn.p(string);
                                wm0Var = inputStream;
                                if (wm0Var != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, wm0Var);
                                }
                                if (o83.c()) {
                                }
                            } catch (TimeoutException e6) {
                                e = e6;
                                inputStream = null;
                                z3 = true;
                                if (((Boolean) tu0.e.c.a(lx0.O4)).booleanValue()) {
                                    vc3.C.h.d("AdWebViewClient.interceptRequest.gcache", e);
                                }
                                yu0VarD.cancel(true);
                                vc3.C.k.getClass();
                                final long jElapsedRealtime10 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                final int i12 = 0;
                                final boolean z8 = z3;
                                zb3.l.post(new Runnable(this) { // from class: rd1
                                    public final /* synthetic */ he1 g;

                                    {
                                        this.g = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        int i13 = i12;
                                        long j3 = jElapsedRealtime10;
                                        boolean z9 = z8;
                                        he1 he1Var = this.g;
                                        switch (i13) {
                                            case 0:
                                                he1Var.f.z(j3, z9);
                                                break;
                                            case 1:
                                                he1Var.f.z(j3, z9);
                                                break;
                                            default:
                                                he1Var.f.z(j3, z9);
                                                break;
                                        }
                                    }
                                });
                                StringBuilder sb9 = new StringBuilder(String.valueOf(jElapsedRealtime10).length() + 24);
                                sb9.append("Cache connection took ");
                                sb9.append(jElapsedRealtime10);
                                sb9.append(str2);
                                string = sb9.toString();
                                jn.p(string);
                                wm0Var = inputStream;
                                if (wm0Var != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, wm0Var);
                                }
                                if (o83.c()) {
                                }
                            }
                        } catch (InterruptedException e7) {
                            e = e7;
                            inputStream = null;
                            z3 = false;
                        } catch (ExecutionException e8) {
                            e = e8;
                            inputStream = null;
                            z3 = false;
                            if (((Boolean) tu0.e.c.a(lx0.O4)).booleanValue()) {
                                vc3.C.h.d("AdWebViewClient.interceptRequest.gcache", e);
                            }
                            yu0VarD.cancel(true);
                            vc3.C.k.getClass();
                            final long jElapsedRealtime11 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            final int i13 = 0;
                            final boolean z9 = z3;
                            zb3.l.post(new Runnable(this) { // from class: rd1
                                public final /* synthetic */ he1 g;

                                {
                                    this.g = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    int i14 = i13;
                                    long j3 = jElapsedRealtime11;
                                    boolean z10 = z9;
                                    he1 he1Var = this.g;
                                    switch (i14) {
                                        case 0:
                                            he1Var.f.z(j3, z10);
                                            break;
                                        case 1:
                                            he1Var.f.z(j3, z10);
                                            break;
                                        default:
                                            he1Var.f.z(j3, z10);
                                            break;
                                    }
                                }
                            });
                            StringBuilder sb10 = new StringBuilder(String.valueOf(jElapsedRealtime11).length() + 24);
                            sb10.append("Cache connection took ");
                            sb10.append(jElapsedRealtime11);
                            sb10.append(str2);
                            string = sb10.toString();
                            jn.p(string);
                            wm0Var = inputStream;
                            if (wm0Var != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, wm0Var);
                            }
                            if (o83.c()) {
                            }
                        } catch (TimeoutException e9) {
                            e = e9;
                            inputStream = null;
                            z3 = false;
                            if (((Boolean) tu0.e.c.a(lx0.O4)).booleanValue()) {
                                vc3.C.h.d("AdWebViewClient.interceptRequest.gcache", e);
                            }
                            yu0VarD.cancel(true);
                            vc3.C.k.getClass();
                            final long jElapsedRealtime12 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            final int i14 = 0;
                            final boolean z10 = z3;
                            zb3.l.post(new Runnable(this) { // from class: rd1
                                public final /* synthetic */ he1 g;

                                {
                                    this.g = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    int i15 = i14;
                                    long j3 = jElapsedRealtime12;
                                    boolean z11 = z10;
                                    he1 he1Var = this.g;
                                    switch (i15) {
                                        case 0:
                                            he1Var.f.z(j3, z11);
                                            break;
                                        case 1:
                                            he1Var.f.z(j3, z11);
                                            break;
                                        default:
                                            he1Var.f.z(j3, z11);
                                            break;
                                    }
                                }
                            });
                            StringBuilder sb11 = new StringBuilder(String.valueOf(jElapsedRealtime12).length() + 24);
                            sb11.append("Cache connection took ");
                            sb11.append(jElapsedRealtime12);
                            sb11.append(str2);
                            string = sb11.toString();
                            jn.p(string);
                            wm0Var = inputStream;
                            if (wm0Var != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, wm0Var);
                            }
                            if (o83.c()) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z2 = false;
                        }
                    } else {
                        uu0 uu0VarR = vc3.C.j.r(wu0VarA);
                        if (uu0VarR == null || !uu0VarR.a()) {
                            wm0Var = null;
                        } else {
                            synchronized (uu0VarR) {
                                z = uu0VarR.g;
                            }
                            map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(z));
                            map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(uu0VarR.d()));
                            map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(uu0VarR.c()));
                            synchronized (uu0VarR) {
                                j = uu0VarR.i;
                            }
                            map3.put("X-Afma-Gcache-CachedBytes", Long.toString(j));
                            inputStreamB = uu0VarR.b();
                            if (i != -1) {
                                long j3 = i;
                                int i15 = ll2.a;
                                wm0Var = new wm0(inputStreamB, j3);
                            } else {
                                wm0Var = inputStreamB;
                            }
                        }
                    }
                    if (wm0Var != null) {
                        return new WebResourceResponse("", "", 200, "OK", map3, wm0Var);
                    }
                } else {
                    webResourceResponse = null;
                }
                return (o83.c() || !((Boolean) oy0.b.u()).booleanValue()) ? webResourceResponse : A(str, map);
            } catch (NoClassDefFoundError e10) {
                e = e10;
                vc3.C.h.d("AdWebViewClient.interceptRequest", e);
                return w();
            }
        } catch (Exception | NoClassDefFoundError e11) {
            e = e11;
        }
    }

    public final void l(Uri uri) {
        jn.p("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.h.get(path);
        if (path == null || list == null) {
            jn.p("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) tu0.e.c.a(lx0.c7)).booleanValue() || vc3.C.h.a() == null) {
                return;
            }
            za1.a.execute(new va1(6, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        ix0 ix0Var = lx0.c6;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && this.J.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) tu0Var.c.a(lx0.e6)).intValue()) {
                jn.p("Parsing gmsg query params on BG thread: ".concat(path));
                zb3 zb3Var = vc3.C.c;
                zb3Var.getClass();
                xn2 xn2VarF = na1.F(new s22(12, uri), zb3Var.k);
                xn2VarF.a(new in2(xn2VarF, 0, new u40(this, list, path, uri, 8)), za1.f);
                return;
            }
        }
        zb3 zb3Var2 = vc3.C.c;
        F(zb3.o(uri), list, path);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        jn.p("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            l(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.i) {
            try {
                yd1 yd1Var = this.f;
                if (yd1Var.f.l0()) {
                    jn.p("Blank page loaded, 1...");
                    yd1Var.r();
                    return;
                }
                this.F = true;
                le1 le1Var = this.m;
                if (le1Var != null) {
                    le1Var.mo3a();
                    this.m = null;
                }
                Z();
                yd1 yd1Var2 = this.f;
                if (yd1Var2.f.x0() != null) {
                    if (!((Boolean) tu0.e.c.a(lx0.Ic)).booleanValue() || (toolbar = yd1Var2.f.x0().A) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.r = true;
        this.s = i;
        this.t = str;
        this.u = str2;
    }

    public final void p(ib0 ib0Var, j11 j11Var, lb3 lb3Var, k11 k11Var, md0 md0Var, boolean z, b21 b21Var, vs0 vs0Var, dr0 dr0Var, d91 d91Var, bw1 bw1Var, f82 f82Var, es1 es1Var, w11 w11Var, zm1 zm1Var, i11 i11Var, i11 i11Var2, w11 w11Var2, sg1 sg1Var, os1 os1Var, qj1 qj1Var) {
        x42 x42Var;
        yd1 yd1Var = this.f;
        vs0 vs0Var2 = vs0Var == null ? new vs0(yd1Var.getContext(), d91Var) : vs0Var;
        d61 d61Var = new d61(yd1Var, dr0Var);
        de1 de1Var = yd1Var.f;
        this.C = d61Var;
        this.D = d91Var;
        ix0 ix0Var = lx0.b1;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        boolean zBooleanValue = ((Boolean) kx0Var.a(ix0Var)).booleanValue();
        int i = 0;
        if (zBooleanValue) {
            b("/adMetadata", new i11(i, j11Var));
        }
        int i2 = 1;
        if (k11Var != null) {
            b("/appEvent", new i11(i2, k11Var));
        }
        b("/backButton", u11.e);
        b("/refresh", u11.f);
        b("/canOpenApp", m11.g);
        b("/canOpenURLs", m11.k);
        b("/canOpenIntents", m11.h);
        b("/close", u11.a);
        b("/customClose", u11.b);
        b("/instrument", u11.i);
        b("/delayPageLoaded", u11.k);
        b("/delayPageClosed", u11.l);
        b("/getLocationInfo", u11.m);
        b("/log", u11.c);
        b("/mraid", new c21(vs0Var2, this.C, dr0Var));
        f61 f61Var = this.A;
        if (f61Var != null) {
            b("/mraidLoaded", f61Var);
        }
        vs0 vs0Var3 = vs0Var2;
        int i3 = 0;
        b("/open", new f21(vs0Var3, this.C, bw1Var, es1Var, sg1Var, qj1Var));
        b("/precache", new m11(26));
        b("/touch", m11.j);
        b("/video", u11.g);
        b("/videoMeta", u11.h);
        if (bw1Var == null || f82Var == null) {
            b("/click", new s11(zm1Var, i3, sg1Var));
            b("/httpTrack", m11.i);
        } else {
            b("/click", new ao1(zm1Var, sg1Var, f82Var, bw1Var));
            b("/httpTrack", new s11(f82Var, 6, bw1Var));
        }
        if (vc3.C.y.a(yd1Var.getContext())) {
            HashMap map = new HashMap();
            x42 x42Var2 = de1Var.o;
            if (x42Var2 != null) {
                map = x42Var2.w0;
            }
            b("/logScionEvent", new s11(yd1Var.getContext(), 1, map));
        }
        if (b21Var != null) {
            b("/setInterstitialProperties", new i11(2, b21Var));
        }
        if (w11Var != null && ((Boolean) kx0Var2.a(lx0.I9)).booleanValue()) {
            b("/inspectorNetworkExtras", w11Var);
        }
        if (((Boolean) kx0Var2.a(lx0.ba)).booleanValue() && i11Var != null) {
            b("/shareSheet", i11Var);
        }
        if (((Boolean) kx0Var2.a(lx0.l8)).booleanValue() && os1Var != null) {
            b("/onDeviceStorageEvent", new i11(3, os1Var));
        }
        if (((Boolean) kx0Var2.a(lx0.ga)).booleanValue() && i11Var2 != null) {
            b("/inspectorOutOfContextTest", i11Var2);
        }
        if (((Boolean) kx0Var2.a(lx0.la)).booleanValue() && w11Var2 != null) {
            b("/inspectorStorage", w11Var2);
        }
        if (((Boolean) kx0Var2.a(lx0.nc)).booleanValue()) {
            b("/bindPlayStoreOverlay", u11.p);
            b("/presentPlayStoreOverlay", u11.q);
            b("/expandPlayStoreOverlay", u11.r);
            b("/collapsePlayStoreOverlay", u11.s);
            b("/closePlayStoreOverlay", u11.t);
        }
        if (((Boolean) kx0Var2.a(lx0.E3)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", u11.v);
            b("/resetPAID", u11.u);
        }
        if (((Boolean) kx0Var2.a(lx0.Hc)).booleanValue() && (x42Var = de1Var.o) != null && x42Var.r0) {
            b("/writeToLocalStorage", u11.w);
            b("/clearLocalStorageKeys", u11.x);
        }
        this.j = ib0Var;
        this.k = lb3Var;
        this.n = j11Var;
        this.o = k11Var;
        this.z = md0Var;
        this.B = vs0Var3;
        this.p = zm1Var;
        this.E = es1Var;
        this.q = z;
    }

    @Override // defpackage.zm1
    public final void q0() {
        zm1 zm1Var = this.p;
        if (zm1Var != null) {
            zm1Var.q0();
        }
    }

    public final void r(int i, int i2) {
        f61 f61Var = this.A;
        if (f61Var != null) {
            f61Var.E(i, i2);
        }
        d61 d61Var = this.C;
        if (d61Var != null) {
            synchronized (d61Var.q) {
                d61Var.k = i;
                d61Var.l = i2;
            }
        }
    }

    public final void s(View view, d91 d91Var, int i) {
        boolean z;
        Bitmap bitmapCreateBitmap;
        boolean z2 = d91Var.g.h;
        if (!z2 || (z = d91Var.j) || i <= 0) {
            return;
        }
        if (z2 && !z) {
            zb3 zb3Var = vc3.C.c;
            Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        jn.P("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            jn.T("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        jn.P("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                ss0.B("Failed to capture the webview bitmap.");
            } else {
                d91Var.j = true;
                in2 in2Var = new in2(d91Var, 26, bitmap);
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    in2Var.run();
                } else {
                    za1.a.execute(in2Var);
                }
            }
        }
        if (!d91Var.g.h || d91Var.j) {
            return;
        }
        zb3.l.postDelayed(new mc1(this, view, d91Var, i), 100L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String string = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof md1)) {
                jn.T("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            md1 md1Var = (md1) webView;
            d91 d91Var = this.D;
            if (d91Var != null) {
                d91Var.b(string, requestHeaders, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return h(string, requestHeaders);
            }
            if (md1Var.e0() != null) {
                he1 he1VarE0 = md1Var.e0();
                synchronized (he1VarE0.i) {
                    he1VarE0.q = false;
                    he1VarE0.v = true;
                    za1.f.execute(new va1(5, he1VarE0));
                }
            }
            if (md1Var.x().b()) {
                str = (String) tu0.e.c.a(lx0.Z);
            } else if (md1Var.X0()) {
                str = (String) tu0.e.c.a(lx0.Y);
            } else {
                str = (String) tu0.e.c.a(lx0.X);
            }
            vc3 vc3Var = vc3.C;
            zb3 zb3Var = vc3Var.c;
            Context context = md1Var.getContext();
            String str2 = md1Var.u().f;
            try {
                HashMap map = new HashMap();
                map.put("User-Agent", vc3Var.c.E(context, str2));
                map.put("Cache-Control", "max-stale=3600");
                sz0 sz0VarA = new n11(context).a(0, str, map, null);
                String str3 = (String) sz0VarA.f.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
                }
            } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
                jn.V("Could not fetch MRAID JS.", e);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        jn.p("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriB = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriB.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriB.getHost())) {
            l(uriB);
            return true;
        }
        boolean z = this.q;
        yd1 yd1Var = this.f;
        if (z && webView == yd1Var.f) {
            String scheme = uriB.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                ib0 ib0Var = this.j;
                if (ib0Var != null) {
                    ib0Var.B();
                    d91 d91Var = this.D;
                    if (d91Var != null) {
                        d91Var.a(str);
                    }
                    this.j = null;
                }
                zm1 zm1Var = this.p;
                if (zm1Var != null) {
                    zm1Var.q0();
                    this.p = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        de1 de1Var = yd1Var.f;
        de1 de1Var2 = yd1Var.f;
        if (de1Var.willNotDraw()) {
            jn.T("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            zq0 zq0Var = de1Var2.g;
            k52 k52Var = de1Var2.h;
            if (!((Boolean) tu0.e.c.a(lx0.Mc)).booleanValue() || k52Var == null) {
                if (zq0Var != null && zq0Var.a(uriB)) {
                    uriB = zq0Var.b(uriB, yd1Var.getContext(), yd1Var, yd1Var.g());
                }
            } else if (zq0Var != null && zq0Var.a(uriB)) {
                uriB = k52Var.a(uriB, yd1Var.getContext(), yd1Var, yd1Var.g());
            }
        } catch (ar0 unused) {
            jn.T("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        vs0 vs0Var = this.B;
        if (vs0Var == null || vs0Var.a()) {
            f0(new r91("android.intent.action.VIEW", uriB.toString(), null, null, null, null, null, null), true, false, de1Var2.o());
        } else {
            vs0Var.b(str);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return h(str, Collections.EMPTY_MAP);
    }
}
