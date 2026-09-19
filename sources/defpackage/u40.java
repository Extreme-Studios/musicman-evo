package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.Inflater;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u40 implements qi0, hn2, o62, t73, vf3 {
    public static u40 k;
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public u40(Context context, String str) {
        this.f = 6;
        this.i = context;
        this.j = str;
        this.g = (String) dq.q.u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.h = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        vc3 vc3Var = vc3.C;
        zb3 zb3Var = vc3Var.c;
        linkedHashMap.put("device", zb3.P());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        linkedHashMap.put("is_lite_sdk", true != zb3.f(context) ? "0" : "1");
        oc2 oc2Var = vc3Var.p;
        oc2Var.getClass();
        hp hpVarB = za1.a.b(new hq0(oc2Var, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((u71) hpVarB.get()).j));
            linkedHashMap.put("network_fine", Integer.toString(((u71) hpVarB.get()).k));
        } catch (Exception e) {
            vc3.C.h.d("CsiConfiguration.CsiConfiguration", e);
        }
        ix0 ix0Var = lx0.ec;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.h;
            zb3 zb3Var2 = vc3.C.c;
            linkedHashMap2.put("is_bstar", true != zb3.d(context) ? "0" : "1");
        }
        if (((Boolean) kx0Var2.a(lx0.ja)).booleanValue() && ((Boolean) kx0Var2.a(lx0.z2)).booleanValue()) {
            vc3 vc3Var2 = vc3.C;
            if (yd.v(vc3Var2.h.g)) {
                return;
            }
            ((LinkedHashMap) this.h).put("plugin", vc3Var2.h.g);
        }
    }

    public static synchronized u40 d(Context context, l30 l30Var) {
        try {
            if (k == null) {
                u40 u40Var = new u40(0);
                Context applicationContext = context.getApplicationContext();
                u40Var.g = new c8(applicationContext, l30Var);
                u40Var.h = new d8(applicationContext, l30Var);
                u40Var.i = new ut(applicationContext, l30Var);
                u40Var.j = new e20(applicationContext, l30Var);
                k = u40Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return k;
    }

    public static final boolean u(Context context) {
        if (!((Boolean) ez0.c.u()).booleanValue()) {
            return false;
        }
        List listAsList = Arrays.asList(((String) ez0.d.u()).split(","));
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return listAsList.contains(zb3.J(context).g.toLowerCase(Locale.ROOT));
    }

    public pt2 A() throws GeneralSecurityException {
        Integer num = (Integer) this.g;
        if (num == null) {
            j7.r("key size is not set");
            return null;
        }
        if (((Integer) this.h) == null) {
            j7.r("tag size is not set");
            return null;
        }
        if (((nt2) this.i) == null) {
            j7.r("hash type is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.g));
        }
        Integer num2 = (Integer) this.h;
        int iIntValue = num2.intValue();
        nt2 nt2Var = (nt2) this.i;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (nt2Var == nt2.b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (nt2Var == nt2.c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (nt2Var == nt2.d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (nt2Var == nt2.e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (nt2Var != nt2.f) {
                j7.r("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new pt2(((Integer) this.g).intValue(), ((Integer) this.h).intValue(), (ot2) this.j, (nt2) this.i);
    }

    public String B() {
        int i = ((ct0) this.j).f;
        return ec.j(new StringBuilder(String.valueOf(i).length() + 6), "LATMTD", i);
    }

    @Override // defpackage.o62
    public /* synthetic */ void a() {
        vy1 vy1Var = (vy1) this.g;
        ((zw1) vy1Var.e).b((e52) this.h, (x42) this.i, (ww1) this.j);
    }

    @Override // defpackage.t73
    public void b(JsonWriter jsonWriter) throws IOException {
        String str = (String) this.g;
        String str2 = (String) this.h;
        Map map = (Map) this.i;
        byte[] bArr = (byte[]) this.j;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        o83.d(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    @Override // defpackage.vf3
    public qk2 c(int i, cy0 cy0Var, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Point point;
        cy0 cy0Var2 = cy0Var;
        Point point2 = (Point) this.j;
        int i7 = ((int[]) this.i)[i];
        sf3 sf3Var = (sf3) this.g;
        int i8 = point2 != null ? point2.x : sf3Var.e;
        int i9 = point2 != null ? point2.y : sf3Var.f;
        boolean z = sf3Var.h;
        if (i8 == Integer.MAX_VALUE || i9 == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < cy0Var2.a; i11++) {
                de3 de3Var = cy0Var2.d[i11];
                int i12 = de3Var.t;
                if (i12 > 0 && (i4 = de3Var.u) > 0) {
                    if (!z) {
                        i5 = i9;
                        i6 = i8;
                    } else if ((i12 > i4) != (i8 > i9)) {
                        i6 = i9;
                        i5 = i8;
                    } else {
                        i5 = i9;
                        i6 = i8;
                    }
                    int i13 = i12 * i5;
                    int i14 = i4 * i6;
                    if (i13 >= i14) {
                        String str = qz1.a;
                        point = new Point(i6, ((i14 + i12) - 1) / i12);
                    } else {
                        String str2 = qz1.a;
                        point = new Point(((i13 + i4) - 1) / i4, i5);
                    }
                    int i15 = i12 * i4;
                    if (i12 >= ((int) (point.x * 0.98f)) && i4 >= ((int) (point.y * 0.98f)) && i15 < i10) {
                        i10 = i15;
                    }
                }
            }
            i2 = i10;
        }
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i16 = 0;
        int i17 = 0;
        while (i16 < cy0Var2.a) {
            de3 de3Var2 = cy0Var2.d[i16];
            int i18 = de3Var2.t;
            int i19 = (i18 == -1 || (i3 = de3Var2.u) == -1) ? -1 : i18 * i3;
            yf3 yf3Var = new yf3(i, cy0Var2, i16, sf3Var, iArr[i16], (String) this.h, i2 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i2));
            int length = objArrCopyOf.length;
            int i20 = i17 + 1;
            int iD = pj2.d(length, i20);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i17] = yf3Var;
            i16++;
            i17 = i20;
            cy0Var2 = cy0Var;
        }
        return vj2.o(objArrCopyOf, i17);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        sg1 sg1Var;
        int i;
        long j;
        int i2 = 1;
        int i3 = 0;
        switch (this.f) {
            case 8:
                ((he1) this.j).F((Map) obj, (List) this.g, (String) this.h);
                break;
            case 9:
                ((sg1) this.j).e.a(new ib((f82) this.g, (String) obj, (j52) this.i, 13));
                break;
            case 11:
                md1 md1Var = (md1) obj;
                x42 x42Var = (x42) this.g;
                md1Var.C0(x42Var, (z42) this.h);
                he1 he1VarE0 = md1Var.e0();
                ix0 ix0Var = lx0.Ta;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && he1VarE0 != null) {
                    sg1 sg1Var2 = (sg1) this.i;
                    uq1 uq1Var = (uq1) this.j;
                    he1VarE0.P(sg1Var2, uq1Var.i, uq1Var.j);
                    he1VarE0.R(sg1Var2, uq1Var.i, uq1Var.d);
                }
                if (((Boolean) tu0Var.c.a(lx0.Pd)).booleanValue() && he1VarE0 != null) {
                    yd1 yd1Var = he1VarE0.f;
                    if (vc3.C.y.a(yd1Var.getContext())) {
                        he1VarE0.d("/logScionEvent");
                        new HashMap();
                        he1VarE0.b("/logScionEvent", new s11(yd1Var.getContext(), i2, x42Var.w0));
                    }
                    break;
                }
                break;
            case 16:
                String str = (String) obj;
                md1 md1Var2 = (md1) this.g;
                x42 x42VarE = md1Var2.E();
                if (x42VarE == null || x42VarE.i0) {
                    z42 z42VarD0 = md1Var2.D0();
                    if (z42VarD0 != null) {
                        int i4 = 2;
                        vc3 vc3Var = vc3.C;
                        vc3Var.k.getClass();
                        boolean z = false;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        boolean zI = vc3Var.h.i(md1Var2.getContext());
                        boolean z2 = ((Boolean) tu0.e.c.a(lx0.E6)).booleanValue() && x42VarE != null && x42VarE.S;
                        if (x42VarE != null && x42VarE.d0 != null) {
                            z = true;
                        }
                        if (!zI && !z2 && !z) {
                            i4 = 1;
                        }
                        ym0 ym0Var = new ym0(jCurrentTimeMillis, z42VarD0.b, str, i4);
                        bw1 bw1Var = (bw1) this.j;
                        bw1Var.getClass();
                        bw1Var.a(new z61(bw1Var, 20, ym0Var));
                    } else {
                        vc3.C.h.d("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    }
                    break;
                } else {
                    j52 j52Var = x42VarE.x0;
                    ix0 ix0Var2 = lx0.Pa;
                    tu0 tu0Var2 = tu0.e;
                    if (!((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue() || (sg1Var = (sg1) this.h) == null || !sg1.b(str)) {
                        ((f82) this.i).b(str, j52Var, null, null);
                        break;
                    } else {
                        f82 f82Var = (f82) this.i;
                        Random random = ut0.f.e;
                        if (!TextUtils.isEmpty(str)) {
                            hp hpVarK = na1.K(sg1Var.c(str, sg1Var.d.a, random), ((Integer) tu0Var2.c.a(lx0.cb)).intValue(), TimeUnit.MILLISECONDS, sg1Var.g);
                            hpVarK.a(new in2(hpVarK, i3, new u40(sg1Var, f82Var, str, j52Var)), sg1Var.e);
                            break;
                        }
                    }
                }
                break;
            default:
                f82 f82Var2 = (f82) this.j;
                a72 a72Var = (a72) this.g;
                sc3 sc3Var = (sc3) obj;
                if (a72Var != null) {
                    a72Var.b(sc3Var == sc3.f);
                    d72 d72Var = (d72) this.h;
                    if (d72Var == null) {
                        f82Var2.f.b(a72Var.m());
                    } else {
                        d72Var.a(a72Var);
                        d72Var.h();
                    }
                }
                il1 il1Var = (il1) this.i;
                if (il1Var != null) {
                    String str2 = f82Var2.d.h;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            String strOptString = jSONObject.optString("type");
                            String strOptString2 = jSONObject.optString("precision");
                            String strOptString3 = jSONObject.optString("currency");
                            long jOptLong = jSONObject.optLong("value", 0L);
                            int iHashCode = strOptString.hashCode();
                            int i5 = 3;
                            if (iHashCode != 66934) {
                                if (iHashCode == 66944) {
                                    if (strOptString.equals("CPM")) {
                                        i = 1;
                                    }
                                    j = jOptLong;
                                } else if (iHashCode == 1349395245 && strOptString.equals("ONE_PIXEL")) {
                                    j = jOptLong / 1000;
                                    i = 3;
                                }
                                j = jOptLong;
                            } else {
                                i = strOptString.equals("CPC") ? 2 : 0;
                                j = jOptLong;
                            }
                            int iHashCode2 = strOptString2.hashCode();
                            if (iHashCode2 != -2131980260) {
                                if (iHashCode2 != 399232571) {
                                    if (iHashCode2 == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                                        i5 = 2;
                                    } else {
                                        i5 = 0;
                                    }
                                } else if (!strOptString2.equals("PRECISE")) {
                                    i5 = 0;
                                }
                            } else if (strOptString2.equals("ESTIMATED")) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                            qc3 qc3Var = new qc3(i, i5, j, strOptString3);
                            if (jn.N((i52) il1Var.j.a.g) == 1) {
                                i2 = 0;
                            }
                            if (i2 != 0 && il1Var.h.B0) {
                                il1Var.L1(new zx(21, qc3Var));
                            }
                        } catch (JSONException e) {
                            vc3.C.h.d("UrlPinger.pingUrl", e);
                        }
                        break;
                    }
                }
                break;
        }
    }

    public z60 f(q9 q9Var, String str) {
        z60 z60Var;
        boolean zIsInstance;
        z60 z60VarB;
        synchronized (((gm) this.j)) {
            try {
                c70 c70Var = (c70) this.g;
                c70Var.getClass();
                z60Var = (z60) c70Var.a.get(str);
                Class clsL = q9Var.a;
                Map map = q9.b;
                map.getClass();
                Integer num = (Integer) map.get(clsL);
                if (num != null) {
                    zIsInstance = w40.w(num.intValue(), z60Var);
                } else {
                    if (clsL.isPrimitive()) {
                        clsL = ss0.l(tw.a(clsL));
                    }
                    zIsInstance = clsL.isInstance(z60Var);
                }
                if (zIsInstance) {
                    if (((b70) this.h) instanceof cz) {
                        z60Var.getClass();
                    }
                    z60Var.getClass();
                } else {
                    at atVar = new at((wc) this.i);
                    atVar.a.put(s70.h, str);
                    b70 b70Var = (b70) this.h;
                    try {
                        try {
                            z60VarB = b70Var.d(q9Var, atVar);
                        } catch (AbstractMethodError unused) {
                            z60VarB = b70Var.c(ss0.k(q9Var), atVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        z60VarB = b70Var.b(ss0.k(q9Var));
                    }
                    z60Var = z60VarB;
                    c70 c70Var2 = (c70) this.g;
                    c70Var2.getClass();
                    z60Var.getClass();
                    z60 z60Var2 = (z60) c70Var2.a.put(str, z60Var);
                    if (z60Var2 != null) {
                        z60Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z60Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0250 A[EDGE_INSN: B:105:0x0250->B:115:0x0278 BREAK  A[LOOP:0: B:9:0x0038->B:57:0x0180]] */
    /* JADX WARN: Code duplicated, block: B:106:0x025d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0261  */
    /* JADX WARN: Code duplicated, block: B:109:0x0265  */
    /* JADX WARN: Code duplicated, block: B:111:0x0268  */
    /* JADX WARN: Code duplicated, block: B:130:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0219 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x021f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0225  */
    public void g(t00 t00Var) throws Throwable {
        k8 k8Var;
        int i;
        int i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        t00 t00Var2;
        xo2 xo2Var;
        Object obj;
        j9 j9Var;
        xo2 xo2Var2;
        long j2;
        boolean z;
        int i3;
        boolean z2;
        int iP;
        Object h9Var;
        p70 p70Var;
        Object objE;
        j9 j9Var2;
        j9 j9Var3;
        j9 j9Var4;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        l8 l8Var;
        t00 t00Var3 = t00Var;
        k8 k8Var2 = (k8) this.i;
        k8Var2.getClass();
        Object h9Var2 = ar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = k8.b;
        long j3 = atomicLongFieldUpdater3.get(k8Var2);
        boolean z3 = false;
        boolean z4 = true;
        long j4 = 1152921504606846975L;
        if (!(k8Var2.i(j3, false) ? false : !k8Var2.a(j3 & 1152921504606846975L))) {
            xo2 xo2Var3 = m8.j;
            j9 j9Var5 = (j9) k8.f.get(k8Var2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater3.getAndIncrement(k8Var2);
                long j5 = andIncrement & j4;
                boolean zI = k8Var2.i(andIncrement, z3);
                int i4 = m8.b;
                long j6 = i4;
                boolean z5 = z4;
                long j7 = j5 / j6;
                int i5 = (int) (j5 % j6);
                if (j9Var5.c != j7) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater4 = k8.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k8.f;
                    j9 j9Var6 = m8.a;
                    l8 l8Var2 = l8.n;
                    while (true) {
                        objE = s90.e(j9Var5, j7, l8Var2);
                        if (ss0.p(objE)) {
                            j = j4;
                            xo2Var = xo2Var3;
                            break;
                        }
                        lz lzVarN = ss0.n(objE);
                        while (true) {
                            j = j4;
                            lz lzVar = (lz) atomicReferenceFieldUpdater.get(k8Var2);
                            xo2Var = xo2Var3;
                            l8Var = l8Var2;
                            if (lzVar.c >= lzVarN.c) {
                                break;
                            }
                            if (!lzVarN.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(k8Var2, lzVar, lzVarN)) {
                                    if (!lzVar.e()) {
                                        break;
                                    }
                                    lzVar.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(k8Var2) == lzVar);
                            if (lzVarN.e()) {
                                lzVarN.d();
                            }
                            xo2Var3 = xo2Var;
                            l8Var2 = l8Var;
                            j4 = j;
                        }
                        xo2Var3 = xo2Var;
                        l8Var2 = l8Var;
                        j4 = j;
                    }
                    if (ss0.p(objE)) {
                        k8Var2.c();
                        if (j9Var5.c * ((long) m8.b) < atomicLongFieldUpdater4.get(k8Var2)) {
                            j9Var5.a();
                            j9 j9Var7 = j9Var5;
                            k8Var = k8Var2;
                            j9Var2 = j9Var7;
                            i = i4;
                            i2 = i5;
                            obj = h9Var2;
                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                            j9Var3 = null;
                            t00Var2 = null;
                        } else {
                            j9 j9Var8 = j9Var5;
                            k8Var = k8Var2;
                            j9Var2 = j9Var8;
                            i = i4;
                            i2 = i5;
                            obj = h9Var2;
                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                            t00Var2 = null;
                            j9Var3 = t00Var2;
                        }
                    } else {
                        j9 j9Var9 = (j9) ss0.n(objE);
                        obj = h9Var2;
                        atomicLongFieldUpdater = atomicLongFieldUpdater3;
                        long j8 = j9Var9.c;
                        if (j8 > j7) {
                            long j9 = ((long) m8.b) * j8;
                            AtomicLongFieldUpdater atomicLongFieldUpdater5 = k8.b;
                            int i6 = i4;
                            int i7 = i5;
                            while (true) {
                                long j10 = atomicLongFieldUpdater5.get(k8Var2);
                                long j11 = j10 & j;
                                if (j11 >= j9) {
                                    j9 j9Var10 = j9Var5;
                                    k8Var = k8Var2;
                                    j9Var2 = j9Var10;
                                    j9Var4 = j9Var9;
                                    i = i6;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                    i2 = i7;
                                    t00Var2 = null;
                                    break;
                                }
                                k8 k8Var3 = k8Var2;
                                j9Var4 = j9Var9;
                                long j12 = (((long) ((int) (j10 >> 60))) << 60) + j11;
                                i = i6;
                                AtomicLongFieldUpdater atomicLongFieldUpdater6 = atomicLongFieldUpdater5;
                                i2 = i7;
                                t00Var2 = null;
                                j9Var2 = j9Var5;
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                k8Var = k8Var3;
                                if (k8.b.compareAndSet(k8Var, j10, j12)) {
                                    break;
                                }
                                j9Var5 = j9Var2;
                                k8Var2 = k8Var;
                                atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                i7 = i2;
                                i6 = i;
                                atomicLongFieldUpdater5 = atomicLongFieldUpdater6;
                                j9Var9 = j9Var4;
                            }
                            if (j8 * ((long) m8.b) < atomicLongFieldUpdater2.get(k8Var)) {
                                j9Var4.a();
                            }
                            j9Var3 = t00Var2;
                        } else {
                            j9 j9Var11 = j9Var5;
                            k8Var = k8Var2;
                            j9Var2 = j9Var11;
                            i = i4;
                            i2 = i5;
                            t00Var2 = null;
                            j9Var3 = j9Var9;
                        }
                    }
                    if (j9Var3 != null) {
                        j9Var = j9Var3;
                    } else if (zI) {
                        h9Var2 = new h9(k8Var.f());
                        h9Var = h9Var2;
                        i3 = 2;
                        break;
                    } else {
                        k8 k8Var4 = k8Var;
                        j9Var5 = j9Var2;
                        k8Var2 = k8Var4;
                        h9Var2 = obj;
                        xo2Var3 = xo2Var;
                        z4 = z5;
                    }
                    atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                    j4 = j;
                    z3 = false;
                } else {
                    j9 j9Var12 = j9Var5;
                    k8Var = k8Var2;
                    i = i4;
                    i2 = i5;
                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                    j = j4;
                    t00Var2 = null;
                    xo2Var = xo2Var3;
                    obj = h9Var2;
                    j9Var = j9Var12;
                }
                j9Var.m(i2, t00Var3);
                if (!zI) {
                    k8Var2 = k8Var;
                    xo2Var2 = xo2Var;
                    j2 = j5;
                    z = zI;
                    t00 t00Var4 = t00Var2;
                    i3 = 2;
                    Object objK = j9Var.k(i2);
                    if (objK == null) {
                        if (k8Var2.a(j2)) {
                            if (j9Var.j(t00Var4, i2, m8.d)) {
                                z2 = z5;
                                iP = z2;
                            }
                        } else if (xo2Var2 == null) {
                            iP = 3;
                        } else if (j9Var.j(t00Var4, i2, xo2Var2)) {
                            iP = 2;
                        }
                        z2 = z5;
                        iP = k8Var2.p(j9Var, i2, t00Var3, j2, xo2Var2, z);
                    } else if (objK instanceof p70) {
                        j9Var.m(i2, t00Var4);
                        if (k8Var2.m(objK, t00Var3)) {
                            j9Var.n(i2, m8.i);
                            z2 = z5;
                            iP = 0;
                        } else {
                            xo2 xo2Var4 = m8.k;
                            if (j9Var.f.getAndSet((i2 * 2) + 1, xo2Var4) != xo2Var4) {
                                z2 = z5;
                                j9Var.l(i2, z2);
                            } else {
                                z2 = z5;
                            }
                            iP = 5;
                        }
                    } else {
                        z2 = z5;
                        iP = k8Var2.p(j9Var, i2, t00Var3, j2, xo2Var2, z);
                    }
                    Object obj2 = k50.a;
                    if (iP != 0) {
                        j9Var.a();
                    } else if (iP != z2) {
                        if (iP != i3) {
                            if (z) {
                                if (xo2Var2 instanceof p70) {
                                    p70Var = (p70) xo2Var2;
                                } else {
                                    p70Var = null;
                                }
                                if (p70Var != null) {
                                    p70Var.a(j9Var, i2 + i);
                                }
                                j9Var.h();
                                h9Var = obj;
                                break;
                            }
                            j9Var.h();
                            h9Var = new h9(k8Var2.f());
                            break;
                        }
                        if (iP != 3) {
                            j7.e("unexpected");
                            h9Var = null;
                            break;
                        }
                        if (iP != 4) {
                            if (j2 < k8.c.get(k8Var2)) {
                                j9Var.a();
                            }
                            h9Var = new h9(k8Var2.f());
                            break;
                        }
                        if (iP == 5) {
                            j9Var.a();
                        }
                        t00Var3 = t00Var;
                        j9Var5 = j9Var;
                        xo2Var3 = xo2Var2;
                        z4 = z2;
                        h9Var2 = obj;
                        atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                        j4 = j;
                        z3 = false;
                    }
                    h9Var = obj2;
                    break;
                }
                k8Var2 = k8Var;
                xo2Var2 = xo2Var;
                j2 = j5;
                z = zI;
                i3 = 2;
                iP = k8Var2.p(j9Var, i2, t00Var3, j2, xo2Var2, z);
                z2 = z5;
                Object obj3 = k50.a;
                if (iP != 0) {
                    j9Var.a();
                } else if (iP != z2) {
                    if (iP != i3) {
                        if (z) {
                            if (xo2Var2 instanceof p70) {
                                p70Var = (p70) xo2Var2;
                            } else {
                                p70Var = null;
                            }
                            if (p70Var != null) {
                                p70Var.a(j9Var, i2 + i);
                            }
                            j9Var.h();
                            h9Var = obj;
                            break;
                        }
                        j9Var.h();
                        h9Var = new h9(k8Var2.f());
                        break;
                    }
                    if (iP != 3) {
                        j7.e("unexpected");
                        h9Var = null;
                        break;
                    }
                    if (iP != 4) {
                        if (j2 < k8.c.get(k8Var2)) {
                            j9Var.a();
                        }
                        h9Var = new h9(k8Var2.f());
                        break;
                    }
                    if (iP == 5) {
                        j9Var.a();
                    }
                    t00Var3 = t00Var;
                    j9Var5 = j9Var;
                    xo2Var3 = xo2Var2;
                    z4 = z2;
                    h9Var2 = obj;
                    atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                    j4 = j;
                    z3 = false;
                }
                h9Var = obj3;
                break;
            }
        } else {
            h9Var = h9Var2;
            i3 = 2;
            break;
        }
        if (h9Var instanceof h9) {
            Throwable th = ((h9) h9Var).a;
            if (th != null) {
                throw th;
            }
            throw new v9("Channel was closed normally");
        }
        if (h9Var instanceof i9) {
            j7.e("Check failed.");
        } else if (((AtomicInteger) this.j).getAndIncrement() == 0) {
            rs0.j((qc) this.g, new sd(this, (yb) null, i3));
        }
    }

    public void h(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.g) {
            try {
                try {
                    ((nm) ((pm) this.h)).U((id) this.i, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a41 i(Context context, d60 d60Var, e72 e72Var) {
        a41 a41Var;
        synchronized (this.h) {
            try {
                if (((a41) this.j) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    this.j = new a41(applicationContext, d60Var, u(context) ? (String) ez0.b.u() : (String) ez0.f.u(), e72Var);
                }
                a41Var = (a41) this.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a41Var;
    }

    public void j(int i) throws InvalidAlgorithmParameterException {
        switch (this.f) {
            case 20:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.g = Integer.valueOf(i);
                return;
            default:
                this.g = Integer.valueOf(i);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(defpackage.dt0 r9, defpackage.zf0 r10) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u40.k(dt0, zf0):boolean");
    }

    public a41 n(Context context, d60 d60Var, e72 e72Var) {
        a41 a41Var;
        String str;
        synchronized (this.g) {
            try {
                if (((a41) this.i) == null) {
                    if (u(context)) {
                        str = ((Boolean) az0.g.u()).booleanValue() ? (String) ez0.a.u() : (String) ez0.e.u();
                    } else if (((Boolean) az0.f.u()).booleanValue()) {
                        str = (String) tu0.e.c.a(lx0.a);
                    } else {
                        str = (String) tu0.e.c.a(lx0.b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.i = new a41(context, d60Var, str, e72Var);
                }
                a41Var = (a41) this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a41Var;
    }

    public void o() {
        this.h = 12;
    }

    public void p(int i) {
        this.h = Integer.valueOf(i);
    }

    public ht0 q(int i) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.i;
        String string = i == 1 ? sharedPreferences.getString(B(), null) : sharedPreferences.getString(v(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrO = ej1.o(string);
                ht0 ht0VarE = ht0.E(n13.n(bArrO, 0, bArrO.length));
                String strZ = ht0VarE.z();
                File fileA = ss0.A(strZ, "pcam.jar", t());
                if (!fileA.exists()) {
                    fileA = ss0.A(strZ, "pcam", t());
                }
                File fileA2 = ss0.A(strZ, "pcbc", t());
                if (fileA.exists() && fileA2.exists()) {
                    return ht0VarE;
                }
            } catch (o23 unused) {
            }
        }
        return null;
    }

    public void r() {
        this.i = 16;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01df  */
    @Override // defpackage.qi0
    public void s(byte[] bArr, int i, int i2, ri0 ri0Var) {
        qk2 qk2VarI;
        Rect rect;
        cw1 cw1Var = (cw1) this.g;
        cw1Var.z(i + i2, bArr);
        cw1Var.E(i);
        if (((Inflater) this.j) == null) {
            this.j = new Inflater();
        }
        cw1 cw1Var2 = (cw1) this.h;
        if (qz1.g(cw1Var, cw1Var2, (Inflater) this.j)) {
            cw1Var.z(cw1Var2.c, cw1Var2.a);
        }
        rj0 rj0Var = (rj0) this.i;
        rj0Var.c = false;
        tf1 tf1Var = null;
        rj0Var.g = null;
        rj0Var.h = -1;
        rj0Var.i = -1;
        int iB = cw1Var.B();
        if (iB < 2) {
            tf1Var = null;
        } else if (cw1Var.L() == iB) {
            int[] iArr = rj0Var.a;
            int[] iArr2 = rj0Var.d;
            if (iArr2 != null && rj0Var.b) {
                cw1Var.G(cw1Var.L() - 2);
                int iL = cw1Var.L();
                while (cw1Var.b < iL && cw1Var.B() > 0) {
                    switch (cw1Var.K()) {
                        case 0:
                        case 1:
                        case 2:
                            break;
                        case 3:
                            if (cw1Var.B() >= 2) {
                                int iK = cw1Var.K();
                                int iK2 = cw1Var.K();
                                int i3 = iK >> 4;
                                if (i3 >= iArr2.length) {
                                    i3 = 0;
                                }
                                iArr[3] = iArr2[i3];
                                int i4 = iK & 15;
                                if (i4 >= iArr2.length) {
                                    i4 = 0;
                                }
                                iArr[2] = iArr2[i4];
                                int i5 = iK2 >> 4;
                                if (i5 >= iArr2.length) {
                                    i5 = 0;
                                }
                                iArr[1] = iArr2[i5];
                                int i6 = iK2 & 15;
                                if (i6 >= iArr2.length) {
                                    i6 = 0;
                                }
                                iArr[0] = iArr2[i6];
                                rj0Var.c = true;
                            }
                            break;
                        case 4:
                            if (cw1Var.B() >= 2 && rj0Var.c) {
                                int iK3 = cw1Var.K();
                                int iK4 = cw1Var.K();
                                iArr[3] = rj0.a(iArr[3], iK3 >> 4);
                                iArr[2] = rj0.a(iArr[2], iK3 & 15);
                                iArr[1] = rj0.a(iArr[1], iK4 >> 4);
                                iArr[0] = rj0.a(iArr[0], iK4 & 15);
                            }
                            break;
                        case 5:
                            if (cw1Var.B() >= 6) {
                                int iK5 = cw1Var.K();
                                int iK6 = cw1Var.K();
                                int i7 = iK6 >> 4;
                                int iK7 = ((iK6 & 15) << 8) | cw1Var.K();
                                int iK8 = cw1Var.K();
                                int iK9 = cw1Var.K();
                                rj0Var.g = new Rect((iK5 << 4) | i7, (iK8 << 4) | (iK9 >> 4), iK7 + 1, (((iK9 & 15) << 8) | cw1Var.K()) + 1);
                            }
                            break;
                        case 6:
                            if (cw1Var.B() >= 4) {
                                rj0Var.h = cw1Var.L();
                                rj0Var.i = cw1Var.L();
                            }
                            break;
                    }
                }
            }
            if (rj0Var.d == null || !rj0Var.b || !rj0Var.c || (rect = rj0Var.g) == null || rj0Var.h == -1 || rj0Var.i == -1 || rect.width() < 2 || rj0Var.g.height() < 2) {
                tf1Var = null;
            } else {
                Rect rect2 = rj0Var.g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                oe0 oe0Var = new oe0();
                cw1Var.E(rj0Var.h);
                oe0Var.b(cw1Var);
                rj0Var.b(oe0Var, true, rect2, iArr3);
                cw1Var.E(rj0Var.i);
                oe0Var.b(cw1Var);
                rj0Var.b(oe0Var, false, rect2, iArr3);
                tf1Var = new tf1(null, null, null, Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / rj0Var.f, 0, 0, rect2.left / rj0Var.e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / rj0Var.e, rect2.height() / rj0Var.f, Integer.MIN_VALUE, 0.0f, 0);
            }
        }
        if (tf1Var != null) {
            qk2VarI = vj2.i(tf1Var);
        } else {
            tj2 tj2Var = vj2.g;
            qk2VarI = qk2.j;
        }
        ri0Var.mo0b(new mi0(qk2VarI, -9223372036854775807L, 5000000L));
    }

    public File t() {
        File file = new File((File) this.g, Integer.toString(((ct0) this.j).f));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public String v() {
        int i = ((ct0) this.j).f;
        return ec.j(new StringBuilder(String.valueOf(i).length() + 6), "FBAMTD", i);
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 8:
                jn.T("Failed to parse gmsg params for: ".concat(String.valueOf((Uri) this.i)));
                break;
            case 9:
                ((sg1) this.j).e.a(new oc1(this, th, (f82) this.g, (String) this.h, (j52) this.i));
                break;
            case 11:
            case 16:
                break;
            default:
                a72 a72Var = (a72) this.g;
                if (a72Var != null) {
                    a72Var.b(false);
                    d72 d72Var = (d72) this.h;
                    if (d72Var != null) {
                        d72Var.a(a72Var);
                        d72Var.h();
                    } else {
                        f82 f82Var = (f82) this.j;
                        f82Var.f.b(a72Var.m());
                    }
                    break;
                }
                break;
        }
    }

    public f62 x() {
        i52 i52VarC = ((tj1) this.h).c();
        f93 f93Var = i52VarC.d;
        String str = i52VarC.g;
        kf3 kf3Var = i52VarC.k;
        c62 c62Var = (c62) ((r52) this.g).h;
        return new f62(f93Var, str, new t71(c62Var.f).a().j, c62Var.l, kf3Var);
    }

    public so2 y() throws GeneralSecurityException {
        gv1 gv1Var;
        j03 j03VarB;
        yo2 yo2Var = (yo2) this.g;
        if (yo2Var == null) {
            j7.r("Cannot build without parameters");
            return null;
        }
        gv1 gv1Var2 = (gv1) this.h;
        if (gv1Var2 == null || (gv1Var = (gv1) this.i) == null) {
            j7.r("Cannot build without key material");
            return null;
        }
        if (yo2Var.a != ((j03) gv1Var2.g).a.length) {
            j7.r("AES key size mismatch");
            return null;
        }
        if (yo2Var.b != ((j03) gv1Var.g).a.length) {
            j7.r("HMAC key size mismatch");
            return null;
        }
        if (yo2Var.a() && ((Integer) this.j) == null) {
            j7.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((yo2) this.g).a() && ((Integer) this.j) != null) {
            j7.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        xo2 xo2Var = ((yo2) this.g).e;
        if (xo2Var == xo2.j) {
            j03VarB = gs2.a;
        } else if (xo2Var == xo2.i) {
            j03VarB = gs2.a(((Integer) this.j).intValue());
        } else {
            if (xo2Var != xo2.h) {
                j7.e("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(xo2Var)));
                return null;
            }
            j03VarB = gs2.b(((Integer) this.j).intValue());
        }
        return new so2((yo2) this.g, (gv1) this.h, (gv1) this.i, j03VarB, (Integer) this.j);
    }

    public hp2 z() throws GeneralSecurityException {
        Integer num = (Integer) this.g;
        if (num == null) {
            j7.r("Key size is not set");
            return null;
        }
        if (((Integer) this.h) == null) {
            j7.r("IV size is not set");
            return null;
        }
        if (((Integer) this.i) == null) {
            j7.r("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        ((Integer) this.h).getClass();
        ((Integer) this.i).getClass();
        return new hp2(iIntValue, (gp2) this.j);
    }

    private final void l(Throwable th) {
    }

    private final void m(Throwable th) {
    }

    public /* synthetic */ u40(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj;
    }

    public /* synthetic */ u40(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    public u40(r52 r52Var, tj1 tj1Var, Executor executor) {
        this.f = 15;
        this.g = r52Var;
        this.h = tj1Var;
        this.i = executor;
    }

    public u40(int i) {
        this.f = i;
        switch (i) {
            case 7:
                this.g = new Object();
                this.h = new Object();
                break;
            case 19:
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                break;
            case 20:
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = gp2.j;
                break;
            case zw0.zzm /* 21 */:
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = ot2.e;
                break;
        }
    }

    public u40(Context context, ct0 ct0Var) {
        this.f = 18;
        this.i = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        ss0.V(dir, false);
        this.g = dir;
        File dir2 = context.getDir("tmppccache", 0);
        ss0.V(dir2, true);
        this.h = dir2;
        this.j = ct0Var;
    }

    public u40(AudioTrack audioTrack, qx1 qx1Var) {
        this.f = 23;
        this.g = audioTrack;
        this.h = qx1Var;
        this.j = new AudioRouting.OnRoutingChangedListener() { // from class: ob3
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                u40 u40Var = this.a;
                if (((ob3) u40Var.j) == null) {
                    return;
                }
                ej1.r().execute(new u52(u40Var, 22, audioRouting));
            }
        };
        Handler handler = new Handler(Looper.myLooper());
        this.i = handler;
        audioTrack.addOnRoutingChangedListener((ob3) this.j, handler);
    }

    public u40(List list) {
        int i;
        this.f = 5;
        this.g = new cw1();
        this.h = new cw1();
        rj0 rj0Var = new rj0();
        this.i = rj0Var;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = qz1.a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                rj0Var.d = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = rj0Var.d;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        rj0Var.e = Integer.parseInt(strArrSplit2[0]);
                        rj0Var.f = Integer.parseInt(strArrSplit2[1]);
                        rj0Var.b = true;
                    } catch (RuntimeException e) {
                        s90.T("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    public u40(sg1 sg1Var, f82 f82Var, String str, j52 j52Var) {
        this.f = 9;
        this.g = f82Var;
        this.h = str;
        this.i = j52Var;
        Objects.requireNonNull(sg1Var);
        this.j = sg1Var;
    }

    public u40(qc qcVar, mu muVar, v00 v00Var) {
        this.f = 3;
        this.g = qcVar;
        this.h = v00Var;
        this.i = new k8(Integer.MAX_VALUE);
        this.j = new AtomicInteger(0);
        wn wnVar = (wn) qcVar.a().f(gm.h);
        if (wnVar == null) {
            return;
        }
        int i = 1;
        wnVar.z(true, new k9(i, new fc(muVar, i, this)));
    }

    public u40(c70 c70Var, b70 b70Var, wc wcVar) {
        this.f = 4;
        c70Var.getClass();
        wcVar.getClass();
        this.g = c70Var;
        this.h = b70Var;
        this.i = wcVar;
        this.j = new gm();
    }

    public u40(Typeface typeface, ms msVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f = 2;
        this.j = typeface;
        this.g = msVar;
        this.i = new ns(1024);
        int iA = msVar.a(6);
        if (iA != 0) {
            int i5 = iA + msVar.a;
            i = ((ByteBuffer) msVar.d).getInt(((ByteBuffer) msVar.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.h = new char[i * 2];
        int iA2 = msVar.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + msVar.a;
            i2 = ((ByteBuffer) msVar.d).getInt(((ByteBuffer) msVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            e50 e50Var = new e50(this, i7);
            ls lsVarB = e50Var.b();
            int iA3 = lsVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) lsVarB.d).getInt(iA3 + lsVarB.a) : 0, (char[]) this.h, i7 * 2);
            ls lsVarB2 = e50Var.b();
            int iA4 = lsVarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + lsVarB2.a;
                i3 = ((ByteBuffer) lsVarB2.d).getInt(((ByteBuffer) lsVarB2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                ns nsVar = (ns) this.i;
                ls lsVarB3 = e50Var.b();
                int iA5 = lsVarB3.a(16);
                if (iA5 != 0) {
                    int i9 = iA5 + lsVarB3.a;
                    i4 = ((ByteBuffer) lsVarB3.d).getInt(((ByteBuffer) lsVarB3.d).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                nsVar.a(e50Var, 0, i4 - 1);
            } else {
                j7.p("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public u40(pm pmVar, id idVar, ComponentName componentName) {
        this.f = 1;
        this.g = new Object();
        this.h = pmVar;
        this.i = idVar;
        this.j = componentName;
    }
}
