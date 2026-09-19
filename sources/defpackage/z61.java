package defpackage;

import android.R;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AbsSeekBar;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class z61 implements hm0, dr, de2, hu1, hn2, n62, pn1 {
    public static ia1 i;
    public static final int[] j = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static z61 k;
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public z61(int i2) {
        this.f = i2;
        switch (i2) {
            case 8:
                break;
            case 26:
                this.g = null;
                this.h = null;
                break;
            default:
                zl zlVar = zl.d;
                this.g = new SparseIntArray();
                this.h = zlVar;
                break;
        }
    }

    @Override // defpackage.dr
    public void A(g2 g2Var) {
        switch (this.f) {
            case 11:
                try {
                    String canonicalName = ((t2) this.h).getClass().getCanonicalName();
                    int i2 = g2Var.g;
                    String str = (String) g2Var.h;
                    String str2 = (String) g2Var.i;
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i2).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb.append(canonicalName);
                    sb.append("failed to load mediation ad: ErrorCode = ");
                    sb.append(i2);
                    sb.append(". ErrorMessage = ");
                    sb.append(str);
                    sb.append(". ErrorDomain = ");
                    sb.append(str2);
                    jn.F(sb.toString());
                    q41 q41Var = (q41) this.g;
                    q41Var.M0(g2Var.d());
                    q41Var.x0(str, i2);
                    q41Var.m0(i2);
                } catch (RemoteException e) {
                    jn.P("", e);
                    return;
                }
                break;
            default:
                try {
                    String canonicalName2 = ((b51) this.h).f.getClass().getCanonicalName();
                    int i3 = g2Var.g;
                    String str3 = (String) g2Var.h;
                    String str4 = (String) g2Var.i;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i3).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i3);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str3);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str4);
                    jn.F(sb2.toString());
                    q41 q41Var2 = (q41) this.g;
                    q41Var2.M0(g2Var.d());
                    q41Var2.x0(str3, i3);
                    q41Var2.m0(i3);
                } catch (RemoteException e2) {
                    jn.P("", e2);
                }
                break;
        }
    }

    public Drawable B(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.h) == null) {
                this.h = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            int id = layerDrawable.getId(i2);
            drawableArr[i2] = B(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i3 = 0; i3 < numberOfLayers; i3++) {
            layerDrawable2.setId(i3, layerDrawable.getId(i3));
            layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
            layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
            layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
            layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
            layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
            layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
            layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
            layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
            layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
        }
        return layerDrawable2;
    }

    public Enum D(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) ((Map) this.h).get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public void E(fw fwVar) {
        ia1 ia1Var;
        ju juVar;
        ia1 ia1Var2;
        f93 f93VarJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.g;
        synchronized (z61.class) {
            try {
                if (i == null) {
                    es0 es0Var = ut0.f.b;
                    j41 j41Var = new j41();
                    es0Var.getClass();
                    i = (ia1) new pf0(es0Var, context, j41Var).d(context, false);
                }
                ia1Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ia1Var == null) {
            fwVar.a("Internal Error, query info generator is null.");
            return;
        }
        ju juVar2 = new ju(context);
        xx1 xx1Var = (xx1) this.h;
        if (xx1Var == null) {
            juVar = juVar2;
            ia1Var2 = ia1Var;
            f93VarJ = new f93(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, jCurrentTimeMillis, 0L);
        } else {
            juVar = juVar2;
            ia1Var2 = ia1Var;
            xx1Var.m = jCurrentTimeMillis;
            f93VarJ = gm.j(context, xx1Var);
        }
        try {
            ia1Var2.f2(juVar, new ma1(null, "BANNER", null, f93VarJ, 0, null), new y61(this, fwVar));
        } catch (RemoteException unused) {
            fwVar.a("Internal Error.");
        }
    }

    public void F(Object obj, String str) throws IOException {
        boolean zCommit;
        String str2 = (String) this.g;
        SharedPreferences sharedPreferences = (SharedPreferences) this.h;
        if (obj instanceof String) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Integer) {
                    zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
                } else {
                    String strValueOf = String.valueOf(obj.getClass());
                    Log.e("GpidLifecycleSPHandler", ec.o(new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", strValueOf, " for app ", str2));
                }
                throw new IOException(ec.o(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException(ec.o(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public Object H(Enum r2) throws GeneralSecurityException {
        Object obj = ((Map) this.g).get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r2)));
    }

    public cy2 I() throws GeneralSecurityException {
        ECPoint eCPoint;
        ey2 ey2Var = (ey2) this.g;
        if (ey2Var == null) {
            j7.r("Cannot build without a ecdsa public key");
            return null;
        }
        w32 w32Var = (w32) this.h;
        if (w32Var == null) {
            j7.r("Cannot build without a private value");
            return null;
        }
        BigInteger bigInteger = (BigInteger) w32Var.g;
        ECPoint eCPoint2 = ey2Var.K;
        zx2 zx2Var = ey2Var.J.b;
        BigInteger order = zx2Var.b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            j7.r("Invalid private value");
            return null;
        }
        ECParameterSpec eCParameterSpec = zx2Var.b;
        if (!hr2.b(eCParameterSpec, hr2.a) && !hr2.b(eCParameterSpec, hr2.b) && !hr2.b(eCParameterSpec, hr2.c)) {
            j7.r("spec must be NIST P256, P384 or P521");
            return null;
        }
        if (bigInteger.signum() != 1) {
            j7.r("k must be positive");
            return null;
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            j7.r("k must be smaller than the order of the generator");
            return null;
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        hr2.a(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerC = hr2.c(curve);
        gr2 gr2VarD = hr2.d(ECPoint.POINT_INFINITY, bigIntegerC);
        gr2 gr2VarD2 = hr2.d(generator, bigIntegerC);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                gr2VarD = hr2.f(gr2VarD, gr2VarD2, a, bigIntegerC);
                gr2VarD2 = hr2.e(gr2VarD2, a, bigIntegerC);
            } else {
                gr2VarD2 = hr2.f(gr2VarD, gr2VarD2, a, bigIntegerC);
                gr2VarD = hr2.e(gr2VarD, a, bigIntegerC);
            }
        }
        if (gr2VarD.c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = gr2VarD.c.modInverse(bigIntegerC);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerC);
            eCPoint = new ECPoint(gr2VarD.a.multiply(bigIntegerMod).mod(bigIntegerC), gr2VarD.b.multiply(bigIntegerMod).mod(bigIntegerC).multiply(bigIntegerModInverse).mod(bigIntegerC));
        }
        hr2.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new cy2((ey2) this.g, (w32) this.h);
        }
        j7.r("Invalid private value");
        return null;
    }

    public void J(String str) throws IOException {
        if (((SharedPreferences) this.h).edit().remove(str).commit()) {
            return;
        }
        String str2 = (String) this.g;
        throw new IOException(ec.o(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    public void K(i61 i61Var) {
        Handler handler = (Handler) this.g;
        if (handler != null) {
            handler.post(new in2(this, 14, i61Var));
        }
    }

    @Override // defpackage.de2
    /* JADX INFO: renamed from: a */
    public /* synthetic */ oe2 mo12a() {
        AtomicInteger atomicInteger = ed1.z;
        oe2 oe2VarMo12a = ((de2) this.g).mo12a();
        byte[] bArr = (byte[]) this.h;
        return new yc1(new cc2(bArr), bArr.length, oe2VarMo12a);
    }

    @Override // defpackage.n62
    public Object b(Object obj) {
        bw1 bw1Var = (bw1) this.g;
        ym0 ym0Var = (ym0) this.h;
        bw1Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(ym0Var.a));
        contentValues.put("gws_query_id", (String) ym0Var.c);
        contentValues.put("url", (String) ym0Var.d);
        contentValues.put("event_state", Integer.valueOf(ym0Var.b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        zb3 zb3Var = vc3.C.c;
        Context context = bw1Var.f;
        u21 u21VarB = zb3.b(context);
        if (u21VarB != null) {
            try {
                u21VarB.zzf(new ju(context));
                return null;
            } catch (RemoteException e) {
                jn.w("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    @Override // defpackage.pn1
    public x42 c() {
        return (x42) this.h;
    }

    @Override // defpackage.hm0
    public km0 d(mm0 mm0Var) throws Throwable {
        long j2;
        d6 d6VarC;
        byte[] bArr;
        Throwable jm0Var;
        String str;
        Map map;
        byte[] byteArray;
        byte[] bArrO;
        String str2 = mm0Var.h;
        pt ptVar = mm0Var.q;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                dm0 dm0Var = mm0Var.o;
                if (dm0Var == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str3 = dm0Var.b;
                    if (str3 != null) {
                        map2.put("If-None-Match", str3);
                    }
                    long j3 = dm0Var.d;
                    if (j3 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map2.put("If-Modified-Since", simpleDateFormat.format(new Date(j3)));
                    }
                    map = map2;
                }
                ((zf0) this.g).getClass();
                d6VarC = zf0.c(mm0Var, map);
                try {
                    int i2 = d6VarC.a;
                    List listUnmodifiableList = Collections.unmodifiableList((ArrayList) d6VarC.c);
                    try {
                        if (i2 == 304) {
                            SystemClock.elapsedRealtime();
                            dm0 dm0Var2 = mm0Var.o;
                            if (dm0Var2 == null) {
                                return new km0(304, null, true, listUnmodifiableList);
                            }
                            TreeSet treeSet = new TreeSet(comparator);
                            if (!listUnmodifiableList.isEmpty()) {
                                Iterator it = listUnmodifiableList.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((gm0) it.next()).a);
                                }
                            }
                            ArrayList arrayList = new ArrayList(listUnmodifiableList);
                            List list = dm0Var2.h;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (gm0 gm0Var : dm0Var2.h) {
                                        if (!treeSet.contains(gm0Var.a)) {
                                            arrayList.add(gm0Var);
                                        }
                                    }
                                }
                            } else if (!dm0Var2.g.isEmpty()) {
                                for (Map.Entry entry : dm0Var2.g.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        long j4 = jElapsedRealtime;
                                        arrayList.add(new gm0((String) entry.getKey(), (String) entry.getValue()));
                                        jElapsedRealtime = j4;
                                    }
                                }
                            }
                            return new km0(304, dm0Var2.a, true, arrayList);
                        }
                        j2 = jElapsedRealtime;
                        InputStream inputStream = (InputStream) d6VarC.d;
                        if (inputStream == null) {
                            inputStream = null;
                        }
                        if (inputStream != null) {
                            int i3 = d6VarC.b;
                            um0 um0Var = (um0) this.h;
                            an0 an0Var = new an0(um0Var, i3);
                            try {
                                bArrO = um0Var.o(1024);
                                while (true) {
                                    try {
                                        int i4 = inputStream.read(bArrO);
                                        if (i4 == -1) {
                                            break;
                                        }
                                        an0Var.write(bArrO, 0, i4);
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused) {
                                            tm0.a("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        um0Var.r(bArrO);
                                        an0Var.close();
                                        throw th;
                                    }
                                    e = e;
                                    bArr = null;
                                }
                                byteArray = an0Var.toByteArray();
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                    tm0.a("Error occurred when closing InputStream", new Object[0]);
                                }
                                um0Var.r(bArrO);
                                an0Var.close();
                            } catch (Throwable th2) {
                                th = th2;
                                bArrO = null;
                            }
                        } else {
                            byteArray = new byte[0];
                        }
                        bArr = byteArray;
                        try {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
                            if (tm0.a || jElapsedRealtime2 > 3000) {
                                tm0.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", mm0Var, Long.valueOf(jElapsedRealtime2), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i2), Integer.valueOf(ptVar.b));
                            }
                            if (i2 < 200 || i2 > 299) {
                                throw new IOException();
                            }
                            SystemClock.elapsedRealtime();
                            return new km0(i2, bArr, false, listUnmodifiableList);
                        } catch (IOException e) {
                            e = e;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bArr = null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    j2 = jElapsedRealtime;
                }
            } catch (IOException e4) {
                e = e4;
                j2 = jElapsedRealtime;
                d6VarC = null;
            }
            if (e instanceof SocketTimeoutException) {
                jm0Var = new jm0();
                str = "socket";
            } else {
                if (e instanceof MalformedURLException) {
                    j7.h("Bad URL ".concat(String.valueOf(str2)), e);
                    return null;
                }
                if (d6VarC == null) {
                    throw new lm0(e);
                }
                int i5 = d6VarC.a;
                tm0.c("Unexpected response code %d for %s", Integer.valueOf(i5), str2);
                if (bArr != null) {
                    List<gm0> listUnmodifiableList2 = Collections.unmodifiableList((ArrayList) d6VarC.c);
                    SystemClock.elapsedRealtime();
                    if (listUnmodifiableList2 != null) {
                        if (listUnmodifiableList2.isEmpty()) {
                            Map map3 = Collections.EMPTY_MAP;
                        } else {
                            TreeMap treeMap = new TreeMap(comparator);
                            for (gm0 gm0Var2 : listUnmodifiableList2) {
                                treeMap.put(gm0Var2.a, gm0Var2.b);
                            }
                        }
                    }
                    if (listUnmodifiableList2 != null) {
                        Collections.unmodifiableList(listUnmodifiableList2);
                    }
                    if (i5 != 401 && i5 != 403) {
                        if (i5 < 400 || i5 > 499) {
                            throw new jm0();
                        }
                        throw new fm0();
                    }
                    jm0Var = new cm0();
                    str = "auth";
                } else {
                    jm0Var = new jm0();
                    str = "network";
                }
            }
            int i6 = ptVar.a;
            try {
                int i7 = ptVar.b + 1;
                ptVar.b = i7;
                ptVar.a = i6 + i6;
                if (i7 > 1) {
                    throw jm0Var;
                }
                mm0Var.a(str + "-retry [timeout=" + i6 + "]");
                jElapsedRealtime = j2;
            } catch (qm0 e5) {
                mm0Var.a(str + "-timeout-giveup [timeout=" + i6 + "]");
                throw e5;
            }
        }
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        switch (this.f) {
            case 17:
                ((no1) this.h).n((View) this.g, (qw1) obj);
                break;
            case 18:
                ((md1) obj).t0((String) this.g, (v11) this.h);
                break;
        }
    }

    public Bundle f(String str) {
        az azVar = (az) this.g;
        if (!azVar.g) {
            j7.e("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = azVar.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleG = bundle.containsKey(str) ? rs0.g(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            azVar.f = null;
        }
        return bundleG;
    }

    public void g(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void h(boolean z) {
        xj xjVar = (xj) this.h;
        xjVar.t.getClass();
        kj kjVar = xjVar.v;
        if (kjVar != null) {
            kjVar.i().l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void i(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void j(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void k(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.hu1
    public sc3 l(String str) {
        int i2 = this.f;
        sc3 sc3Var = sc3.f;
        switch (i2) {
            case 16:
                new t91((f32) this.h, (Context) this.g, str).start();
                break;
            default:
                e32 e32Var = zb3.l;
                zb3 zb3Var = vc3.C.c;
                new l51((Context) this.g, (String) this.h, str, null).o1();
                break;
        }
        return sc3Var;
    }

    public void m(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void n(boolean z) {
        xj xjVar = (xj) this.h;
        xjVar.t.getClass();
        kj kjVar = xjVar.v;
        if (kjVar != null) {
            kjVar.i().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.pn1
    public void o(boolean z, Context context, ik1 ik1Var) throws on1 {
        try {
            s52 s52Var = (s52) ((ww1) this.g).b;
            s52Var.b(z);
            try {
                s52Var.a.z3(new ju(context));
            } catch (Throwable th) {
                throw new l52(th);
            }
        } catch (l52 e) {
            throw new on1(e.getCause());
        }
    }

    public void p(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void s(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void t(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void u(boolean z) {
        kj kjVar = ((xj) this.h).v;
        if (kjVar != null) {
            kjVar.i().l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                j7.j();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void v(AttributeSet attributeSet, int i2) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.g;
        r52 r52VarR = r52.r(absSeekBar.getContext(), attributeSet, j, i2);
        Drawable drawableL = r52VarR.l(0);
        if (drawableL != null) {
            if (drawableL instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableL;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable drawableB = B(animationDrawable.getFrame(i3), true);
                    drawableB.setLevel(10000);
                    animationDrawable2.addFrame(drawableB, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(10000);
                drawableL = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableL);
        }
        Drawable drawableL2 = r52VarR.l(1);
        if (drawableL2 != null) {
            absSeekBar.setProgressDrawable(B(drawableL2, false));
        }
        r52VarR.x();
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 17:
                if (((Boolean) tu0.e.c.a(lx0.O5)).booleanValue()) {
                    vc3.C.h.e("omid native display exp", th);
                }
                break;
            case 18:
                break;
            default:
                a72 a72Var = (a72) this.h;
                a72Var.f(th);
                a72Var.b(false);
                ((d72) this.g).a(a72Var);
                break;
        }
    }

    public void x(xi xiVar) {
        fx fxVar = (fx) this.h;
        zy1 zy1Var = (zy1) this.g;
        int i2 = xiVar.b;
        if (i2 != 0) {
            fxVar.execute(new t8(zy1Var, i2));
        } else {
            fxVar.execute(new in2(zy1Var, 5, xiVar.a));
        }
    }

    public void y(String str, yy yyVar) {
        yyVar.getClass();
        az azVar = (az) this.g;
        synchronized (azVar.c) {
            if (azVar.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            azVar.d.put(str, yyVar);
        }
    }

    public void z() {
        if (!((az) this.g).h) {
            j7.e("Can not perform this action after onSaveInstanceState");
            return;
        }
        a4 a4Var = (a4) this.h;
        if (a4Var == null) {
            a4Var = new a4(this);
        }
        this.h = a4Var;
        try {
            ao.class.getDeclaredConstructor(null);
            a4 a4Var2 = (a4) this.h;
            if (a4Var2 != null) {
                ((LinkedHashSet) a4Var2.b).add(ao.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + ao.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public /* synthetic */ z61(Object obj, int i2, Object obj2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ z61(Object obj, Object obj2, int i2, boolean z) {
        this.f = i2;
        this.g = obj2;
        this.h = obj;
    }

    public /* synthetic */ z61(Object obj, Object obj2, Object obj3, int i2) {
        this.f = i2;
        this.g = obj2;
        this.h = obj3;
    }

    public z61(Context context) {
        this.f = 23;
        this.g = context.getPackageName();
        this.h = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public /* synthetic */ z61(MediaCodec.CryptoInfo cryptoInfo) {
        this.f = 24;
        this.g = cryptoInfo;
        this.h = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public z61(Handler handler, d73 d73Var) {
        this.f = 7;
        if (d73Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.g = handler;
        this.h = d73Var;
    }

    public z61(String str, yd ydVar, ig igVar) {
        this.f = 2;
        this.h = str;
        this.g = ydVar;
    }

    public z61(zf0 zf0Var) {
        this.f = 9;
        um0 um0Var = new um0(0, false);
        this.g = zf0Var;
        this.h = um0Var;
    }

    public /* synthetic */ z61(int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    public z61(xj xjVar) {
        this.f = 4;
        this.g = new CopyOnWriteArrayList();
        this.h = xjVar;
    }

    private final void C(Throwable th) {
    }

    private final void G(Object obj) {
    }
}
