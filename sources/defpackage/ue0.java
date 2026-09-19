package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Environment;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ue0 implements gi0, pi0, on0, bd, i23, eb1, x31, y31, p00, f71, db1, qd0, hn2, gm1 {
    public static final /* synthetic */ ue0 g = new ue0(20);
    public static final /* synthetic */ ue0 h = new ue0(23);
    public static final /* synthetic */ ue0 i = new ue0(24);
    public static final /* synthetic */ ue0 j = new ue0(25);
    public static final /* synthetic */ ue0 k = new ue0(26);
    public static final /* synthetic */ ue0 l = new ue0(27);
    public static final /* synthetic */ ue0 m = new ue0(28);
    public static final /* synthetic */ ue0 n = new ue0(29);
    public final /* synthetic */ int f;

    public /* synthetic */ ue0(boolean z) {
        this.f = 3;
    }

    public static qo0 o(final long j2) {
        return qo0.f(new io0() { // from class: un0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((ko0) obj).a.k(qo0.b(j2));
                    return Optional.empty();
                } catch (ho0 unused) {
                    return Optional.of(jn0.g);
                }
            }
        });
    }

    public static final md1 p(final Context context, final eg egVar, final String str, final boolean z, final boolean z2, final zq0 zq0Var, final ey0 ey0Var, final d60 d60Var, final s70 s70Var, final vg2 vg2Var, final cv0 cv0Var, final x42 x42Var, final z42 z42Var, final hw1 hw1Var, final k52 k52Var, final es1 es1Var) throws wd1 {
        lx0.a(context);
        try {
            ii2 ii2Var = new ii2() { // from class: td1
                @Override // defpackage.ii2
                public final Object a() {
                    eg egVar2 = egVar;
                    String str2 = str;
                    boolean z3 = z;
                    boolean z4 = z2;
                    hw1 hw1Var2 = hw1Var;
                    es1 es1Var2 = es1Var;
                    w93 w93Var = s70Var;
                    vg2 vg2Var2 = vg2Var;
                    cv0 cv0Var2 = cv0Var;
                    x42 x42Var2 = x42Var;
                    z42 z42Var2 = z42Var;
                    k52 k52Var2 = k52Var;
                    zq0 zq0Var2 = zq0Var;
                    ey0 ey0Var2 = ey0Var;
                    d60 d60Var2 = d60Var;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i2 = de1.h0;
                        oe1 oe1Var = new oe1(context2);
                        oe1Var.setBaseContext(context2);
                        yd1 yd1Var = new yd1(new de1(oe1Var, egVar2, str2, z3, zq0Var2, ey0Var2, d60Var2, w93Var, vg2Var2, cv0Var2, x42Var2, z42Var2, k52Var2), es1Var2);
                        yd1Var.setWebViewClient(vc3.C.f.e(yd1Var, cv0Var2, z4, hw1Var2));
                        yd1Var.setWebChromeClient(new ld1(yd1Var));
                        return yd1Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (md1) ii2Var.a();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new wd1("Webview initialization failed.", th);
        }
    }

    public static final void q(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i2));
            }
            Collections.unmodifiableList(arrayList);
        }
    }

    public static final void r(mx0 mx0Var, u40 u40Var) {
        File externalStorageDirectory;
        Context context = (Context) u40Var.i;
        String str = (String) u40Var.j;
        if (context == null) {
            j7.p("Context can't be null. Please set up context in CsiConfiguration.");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            j7.p("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
            return;
        }
        String str2 = (String) u40Var.g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) u40Var.h;
        mx0Var.g = context;
        mx0Var.f = str;
        mx0Var.e = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        mx0Var.a = atomicBoolean;
        atomicBoolean.set(((Boolean) ny0.c.u()).booleanValue());
        if (((AtomicBoolean) mx0Var.a).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            mx0Var.i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) mx0Var.c).put((String) entry.getKey(), (String) entry.getValue());
        }
        za1.a.execute(new q7(26, mx0Var));
        HashMap map = (HashMap) mx0Var.d;
        qx0 qx0Var = qx0.c;
        map.put("action", qx0Var);
        map.put("ad_format", qx0Var);
        map.put("e", qx0.d);
    }

    public static void s(long j2, kc2 kc2Var, boolean z) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
        long j12 = j10 % 1629190168;
        long j13 = z ? (j2 + j2) ^ (j2 >> 63) : j2;
        int i2 = 1;
        while (true) {
            long j14 = j11 ^ j12;
            long j15 = j13 >>> 7;
            boolean z2 = j15 != 0 || i2 < 0;
            int i3 = (int) (j13 & j14);
            if (z2) {
                i3 = ((i3 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) kc2Var.g).write((byte) i3);
            if (!z2) {
                return;
            }
            i2++;
            j13 = j15;
        }
    }

    @Override // defpackage.qd0
    public /* synthetic */ nd0[] a() {
        AtomicInteger atomicInteger = ed1.z;
        return new nd0[]{new sh0(), new sg0()};
    }

    @Override // defpackage.eb1
    /* JADX INFO: renamed from: b */
    public void mo11b(Object obj) {
        switch (this.f) {
            case 10:
                jn.p("Ending javascript session.");
                v31 v31Var = (v31) ((u31) obj);
                HashSet<AbstractMap.SimpleEntry> hashSet = v31Var.g;
                for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
                    jn.p("Unregistering eventhandler: ".concat(String.valueOf(((v11) simpleEntry.getValue()).toString())));
                    v31Var.f.h((String) simpleEntry.getKey(), (v11) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            case 23:
                ((fk1) obj).b();
                break;
            case 24:
                ((lk1) obj).B0();
                break;
            case 25:
                ((ck1) obj).r();
                break;
            case 26:
                ((ck1) obj).d();
                break;
            case 27:
                ((yk1) obj).e();
                break;
            case 28:
                ((dl1) obj).i();
                break;
            default:
                ((lb3) obj).K0();
                break;
        }
    }

    @Override // defpackage.gi0
    public long d(od0 od0Var) {
        return -1L;
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void mo5e(Object obj) {
        ((mi1) obj).m();
    }

    @Override // defpackage.pi0
    public boolean f(de3 de3Var) {
        return false;
    }

    @Override // defpackage.gi0
    public ee0 h() {
        return new sd0(-9223372036854775807L, 0L);
    }

    @Override // defpackage.pi0
    public int i(de3 de3Var) {
        return 1;
    }

    @Override // defpackage.on0
    public byte k(xn0 xn0Var, int i2) {
        return xn0Var.b(i2);
    }

    @Override // defpackage.pi0
    public qi0 m(de3 de3Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.on0
    public xn0 n(xn0 xn0Var, int i2, int i3) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i2 < 0 || i2 > i3 || i3 > (length = (bArr = xn0Var.a).length) || i2 > i3 || i3 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        if (i4 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, i2, bArr3, 0, i4);
            bArr2 = bArr3;
        }
        return new xn0(bArr2);
    }

    public /* synthetic */ ue0(int i2) {
        this.f = i2;
    }

    @Override // defpackage.y31
    public /* bridge */ /* synthetic */ JSONObject e(Object obj) {
        return (JSONObject) obj;
    }

    @Override // defpackage.on0
    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public on0 mo13h() {
        return new ue0(false);
    }

    @Override // defpackage.db1
    /* JADX INFO: renamed from: a */
    public void mo3a() {
    }

    @Override // defpackage.gi0
    public void j(long j2) {
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
    }

    @Override // defpackage.x31
    public /* bridge */ /* synthetic */ Object x(JSONObject jSONObject) {
        return jSONObject;
    }

    @Override // defpackage.f71
    public void c(String str, Throwable th) {
    }

    @Override // defpackage.f71
    public void g(Throwable th, String str, float f) {
    }
}
