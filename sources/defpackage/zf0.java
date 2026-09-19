package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf0 implements pi0, db1, eb1, x31, ym, cd, qd0, gm1 {
    public static final /* synthetic */ zf0 g = new zf0(0);
    public static final /* synthetic */ zf0 h = new zf0(9);
    public static final /* synthetic */ zf0 i = new zf0(11);
    public static final /* synthetic */ zf0 j = new zf0(20);
    public static final /* synthetic */ zf0 k = new zf0(22);
    public static final /* synthetic */ zf0 l = new zf0(23);
    public static final /* synthetic */ zf0 m = new zf0(24);
    public static final /* synthetic */ zf0 n = new zf0(25);
    public static final /* synthetic */ zf0 o = new zf0(26);
    public static final /* synthetic */ zf0 p = new zf0(27);
    public static final /* synthetic */ zf0 q = new zf0(28);
    public static final /* synthetic */ zf0 r = new zf0(29);
    public final /* synthetic */ int f;

    public zf0(tq0 tq0Var, fa2 fa2Var) {
        this.f = 4;
    }

    public static d6 c(mm0 mm0Var, Map map) {
        String str = mm0Var.h;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(mm0Var.e());
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i2 = mm0Var.q.a;
        httpURLConnection.setConnectTimeout(i2);
        httpURLConnection.setReadTimeout(i2);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str2 : map2.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
            }
            if (mm0Var.g != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrF = mm0Var.f();
                if (bArrF != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrF);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                d6 d6Var = new d6(responseCode, g(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return d6Var;
            }
            try {
                return new d6(responseCode, g(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zm0(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final yu0 d(Context context, wu0 wu0Var) {
        qk qkVar = new qk(context, 3);
        yu0 yu0Var = new yu0(qkVar);
        r52 r52Var = new r52(qkVar, wu0Var, yu0Var, 11);
        vg2 vg2Var = new vg2((Object) qkVar, (Object) yu0Var, 9, false);
        synchronized (qkVar.g) {
            vu0 vu0Var = new vu0(context, vc3.C.t.c(), r52Var, vg2Var, 0);
            qkVar.h = vu0Var;
            vu0Var.m();
        }
        return yu0Var;
    }

    public static final SharedPreferences e(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e) {
            jn.V("", e);
            return null;
        }
    }

    public static ArrayList g(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new gm0((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.qd0
    public nd0[] a() {
        AtomicInteger atomicInteger = ed1.z;
        return new nd0[]{new sh0(), new sg0(), new oh0(pi0.e, 32, qk2.j)};
    }

    @Override // defpackage.eb1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo11b(Object obj) {
        switch (this.f) {
            case 10:
                za1.f.execute(new o31((k31) obj, 2));
                break;
            case 22:
                ((ib0) obj).B();
                break;
            case 23:
                ((jk1) obj).s(a23.E(11, null, null));
                break;
            case 24:
                ((ck1) obj).a();
                break;
            case 25:
                ((ck1) obj).b();
                break;
            case 26:
                ((ck1) obj).U();
                break;
            case 27:
                ((ku) obj).l();
                break;
            case 28:
                ((lb3) obj).g3();
                break;
            default:
                ((lb3) obj).F1();
                break;
        }
    }

    @Override // defpackage.pi0
    public boolean f(de3 de3Var) {
        String str = de3Var.m;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.pi0
    public int i(de3 de3Var) {
        String str = de3Var.m;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return 2;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return 2;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return 1;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return 2;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return 1;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return 2;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return 1;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return 1;
                    }
                    break;
            }
        }
        j7.p("Unsupported MIME type: ".concat(String.valueOf(str)));
        return 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.pi0
    public qi0 m(de3 de3Var) {
        String str = de3Var.m;
        List list = de3Var.p;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        m40 m40Var = new m40();
                        cw1 cw1Var = new cw1((byte[]) list.get(0));
                        int iL = cw1Var.L();
                        int iL2 = cw1Var.L();
                        Paint paint = new Paint();
                        m40Var.f = paint;
                        paint.setStyle(Paint.Style.FILL_AND_STROKE);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                        paint.setPathEffect(null);
                        Paint paint2 = new Paint();
                        m40Var.g = paint2;
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                        paint2.setPathEffect(null);
                        m40Var.h = new Canvas();
                        int i2 = 719;
                        m40Var.i = new ui0(i2, 575, 0, i2, 0, 575);
                        m40Var.j = new ti0(0, new int[]{0, -1, -16777216, -8421505}, m40.d(), m40.g());
                        m40Var.k = new zi0(iL, iL2);
                        return m40Var;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new y91(4);
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new s70(12);
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new un1(8);
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new qj0(list);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new bj0(list);
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return new u40(list);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new ij0();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new nj0();
                    }
                    break;
            }
        }
        j7.p("Unsupported MIME type: ".concat(String.valueOf(str)));
        return null;
    }

    @Override // defpackage.x31
    public /* synthetic */ Object x(JSONObject jSONObject) {
        Charset charset = z31.a;
        return new ByteArrayInputStream(jSONObject.toString().getBytes(z31.a));
    }

    public /* synthetic */ zf0(int i2) {
        this.f = i2;
    }

    @Override // defpackage.db1
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo3a() {
    }
}
