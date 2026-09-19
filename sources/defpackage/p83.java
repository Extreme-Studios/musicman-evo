package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class p83 implements a7, en, ni0, db1, gm1, ke1, n62, pn1, i42, fg3 {
    public static p83 j;
    public static final sl0 k = new sl0(2, -9223372036854775807L);
    public static final sl0 l = new sl0(3, -9223372036854775807L);
    public static p83 m;
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    public p83(ArrayList arrayList) {
        this.f = 6;
        this.g = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.h = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            uj0 uj0Var = (uj0) arrayList.get(i);
            long[] jArr = (long[]) this.h;
            int i2 = i + i;
            jArr[i2] = uj0Var.b;
            jArr[i2 + 1] = uj0Var.c;
        }
        long[] jArr2 = (long[]) this.h;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.i = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public static final SharedPreferences D(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void E(Context context) {
        if (D(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new x73("Failed to store the app set ID last used time.");
    }

    public static String w(Context context) {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i);
                }
                il2 il2VarF = il2.f.f();
                byte[] bArrDigest = messageDigest.digest();
                String strG = il2VarF.g(bArrDigest.length, bArrDigest);
                fileInputStream.close();
                return strG;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public jt2 A() throws GeneralSecurityException {
        gv1 gv1Var;
        j03 j03VarA;
        pt2 pt2Var = (pt2) this.g;
        if (pt2Var == null || (gv1Var = (gv1) this.h) == null) {
            j7.r("Cannot build without parameters and/or key material");
            return null;
        }
        if (pt2Var.a != ((j03) gv1Var.g).a.length) {
            j7.r("Key size mismatch");
            return null;
        }
        if (pt2Var.a() && ((Integer) this.i) == null) {
            j7.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((pt2) this.g).a() && ((Integer) this.i) != null) {
            j7.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        ot2 ot2Var = ((pt2) this.g).c;
        if (ot2Var == ot2.e) {
            j03VarA = gs2.a;
        } else if (ot2Var == ot2.d || ot2Var == ot2.c) {
            j03VarA = gs2.a(((Integer) this.i).intValue());
        } else {
            if (ot2Var != ot2.b) {
                j7.e("Unknown HmacParameters.Variant: ".concat(String.valueOf(ot2Var)));
                return null;
            }
            j03VarA = gs2.b(((Integer) this.i).intValue());
        }
        return new jt2((pt2) this.g, (gv1) this.h, j03VarA, (Integer) this.i);
    }

    public vy2 B() throws GeneralSecurityException {
        j03 j03VarA;
        if (((ty2) this.g) == null) {
            j7.r("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.h;
        if (bigInteger == null) {
            j7.r("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        ty2 ty2Var = (ty2) this.g;
        int i = ty2Var.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(ec.l(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", i));
        }
        if (ty2Var.a() && ((Integer) this.i) == null) {
            j7.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((ty2) this.g).a() && ((Integer) this.i) != null) {
            j7.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        sy2 sy2Var = ((ty2) this.g).c;
        if (sy2Var == sy2.e) {
            j03VarA = gs2.a;
        } else if (sy2Var == sy2.d || sy2Var == sy2.c) {
            j03VarA = gs2.a(((Integer) this.i).intValue());
        } else {
            if (sy2Var != sy2.b) {
                j7.e("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(sy2Var)));
                return null;
            }
            j03VarA = gs2.b(((Integer) this.i).intValue());
        }
        return new vy2((ty2) this.g, (BigInteger) this.h, j03VarA, (Integer) this.i);
    }

    public void C(eg3 eg3Var) {
        la3 la3Var = (la3) ((HashMap) this.g).remove(eg3Var);
        la3Var.getClass();
        w13 w13Var = (w13) ((k23) this.i).n.get(la3Var);
        if (w13Var != null) {
            synchronized (w13Var) {
                w13Var.d--;
            }
        }
    }

    @Override // defpackage.db1
    /* JADX INFO: renamed from: a */
    public void mo3a() {
        e72 e72Var;
        jn.p("loadNewJavascriptEngine (failure): Trying to acquire lock");
        uj1 uj1Var = (uj1) this.i;
        synchronized (uj1Var.b) {
            try {
                jn.p("loadNewJavascriptEngine (failure): Lock acquired");
                uj1Var.g = 1;
                jn.p("Failed loading new engine. Marking new engine destroyable.");
                ((t31) this.g).r();
                if (((Boolean) my0.d.u()).booleanValue() && (e72Var = (e72) uj1Var.e) != null) {
                    a72 a72Var = (a72) this.h;
                    a72Var.k("Failed loading new engine");
                    a72Var.b(false);
                    e72Var.b(a72Var.m());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jn.p("loadNewJavascriptEngine (failure): Lock released");
    }

    @Override // defpackage.n62
    public Object b(Object obj) {
        bw1 bw1Var = (bw1) this.g;
        id3 id3Var = (id3) this.h;
        String str = (String) this.i;
        bw1Var.getClass();
        bw1Var.g.execute(new ib((SQLiteDatabase) obj, str, id3Var, 14));
        return null;
    }

    @Override // defpackage.pn1
    public x42 c() {
        return (x42) this.h;
    }

    @Override // defpackage.ni0
    public long d(int i) {
        hn.v(i >= 0);
        long[] jArr = (long[]) this.i;
        hn.v(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.a7
    public ve3 e() {
        k30 k30Var = new k30();
        ((ExecutorService) this.i).execute(new u52(this, 9, k30Var));
        return k30Var.a;
    }

    @Override // defpackage.i42
    public /* bridge */ /* synthetic */ hp f(vg2 vg2Var, h42 h42Var) {
        return r(null);
    }

    @Override // defpackage.ni0
    public ArrayList g(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            List list = (List) this.g;
            if (i2 >= list.size()) {
                break;
            }
            long[] jArr = (long[]) this.h;
            int i3 = i2 + i2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                uj0 uj0Var = (uj0) list.get(i2);
                tf1 tf1Var = uj0Var.a;
                if (tf1Var.e == -3.4028235E38f) {
                    arrayList2.add(uj0Var);
                } else {
                    arrayList.add(tf1Var);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, ts.h);
        while (i < arrayList2.size()) {
            tf1 tf1Var2 = ((uj0) arrayList2.get(i)).a;
            arrayList.add(new tf1(tf1Var2.a, tf1Var2.b, tf1Var2.c, tf1Var2.d, (-1) - i, 1, tf1Var2.g, tf1Var2.h, tf1Var2.i, tf1Var2.l, tf1Var2.m, tf1Var2.j, tf1Var2.k, tf1Var2.n, tf1Var2.o, tf1Var2.p));
            i++;
            arrayList2 = arrayList2;
        }
        return arrayList;
    }

    @Override // defpackage.en
    public ClipDescription getDescription() {
        return (ClipDescription) this.h;
    }

    @Override // defpackage.fg3
    public synchronized void h(gh0 gh0Var) {
        ((k23) this.i).c.h(gh0Var);
        while (gh0Var != null) {
            eg3 eg3Var = (eg3) gh0Var.h;
            eg3Var.getClass();
            C(eg3Var);
            gh0Var = (gh0) gh0Var.i;
            if (gh0Var == null || ((eg3) gh0Var.h) == null) {
                gh0Var = null;
            }
        }
    }

    @Override // defpackage.en
    public Object i() {
        return null;
    }

    @Override // defpackage.en
    public Uri j() {
        return (Uri) this.g;
    }

    @Override // defpackage.fg3
    /* JADX INFO: renamed from: l, reason: collision with other method in class */
    public synchronized void mo9l() {
        ((k23) this.i).c.mo9l();
    }

    @Override // defpackage.fg3
    public synchronized void m(eg3 eg3Var) {
        ((k23) this.i).c.m(eg3Var);
        C(eg3Var);
    }

    @Override // defpackage.en
    public Uri n() {
        return (Uri) this.i;
    }

    @Override // defpackage.pn1
    public void o(boolean z, Context context, ik1 ik1Var) throws on1 {
        try {
            s52 s52Var = (s52) ((ww1) this.g).b;
            s52Var.b(z);
            int i = ((d60) ((kx1) this.i).d).h;
            int iIntValue = ((Integer) tu0.e.c.a(lx0.Q0)).intValue();
            n41 n41Var = s52Var.a;
            if (i < iIntValue) {
                try {
                    n41Var.f();
                    return;
                } catch (Throwable th) {
                    throw new l52(th);
                }
            } else {
                try {
                    n41Var.g1(new ju(context));
                    return;
                } catch (Throwable th2) {
                    throw new l52(th2);
                }
            }
        } catch (l52 e) {
            jn.R("Cannot show interstitial.");
            throw new on1(e.getCause());
        }
        jn.R("Cannot show interstitial.");
        throw new on1(e.getCause());
    }

    public void p(eo eoVar) {
        wz wzVar = (wz) this.i;
        if (wzVar != null) {
            wzVar.run();
        }
        wz wzVar2 = new wz((oo) this.g, eoVar);
        this.i = wzVar2;
        ((Handler) this.h).postAtFrontOfQueue(wzVar2);
    }

    @Override // defpackage.ke1
    public void q(String str, int i, String str2, boolean z) {
        hq1 hq1Var = (hq1) this.g;
        md1 md1Var = (md1) this.h;
        yu0 yu0Var = (yu0) this.i;
        hq1Var.getClass();
        i52 i52Var = hq1Var.a;
        if (!((Boolean) tu0.e.c.a(lx0.n4)).booleanValue()) {
            ee2 ee2Var = i52Var.a;
            if (ee2Var != null && md1Var.f() != null) {
                md1Var.f().C3(ee2Var);
            }
            yu0Var.d();
            return;
        }
        if (z) {
            ee2 ee2Var2 = i52Var.a;
            if (ee2Var2 != null && md1Var.f() != null) {
                md1Var.f().C3(ee2Var2);
            }
            yu0Var.d();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        yu0Var.c(new ky1(ec.m(sb, ", Failing URL: ", str2), 1));
    }

    public fn2 r(tj1 tj1Var) {
        hp hpVarT;
        hp hpVarI;
        r52 r52Var = (r52) this.g;
        Executor executor = (Executor) this.h;
        u40 u40Var = new u40(r52Var, tj1Var, executor);
        e42 e42Var = (e42) u40Var.j;
        if (e42Var == null) {
            if (((Boolean) bz0.a.u()).booleanValue()) {
                vi1 vi1VarA = tj1Var.a();
                c62 c62Var = (c62) r52Var.h;
                sj1 sj1Var = vi1VarA.i;
                p62 p62VarY = vi1VarA.c.a(sj1Var.b(), r62.z).q(new yy0(vi1VarA, 4, c62Var)).y();
                oc2 oc2Var = new oc2(19, vi1VarA);
                int i = 0;
                p62VarY.a(new in2(p62VarY, i, oc2Var), vi1VarA.j);
                hpVarI = na1.I(na1.M(fn2.r(p62VarY), new d42(u40Var, 1), executor), dv1.class, new d42(u40Var, i), executor);
            } else {
                e42 e42Var2 = new e42(null, u40Var.x());
                u40Var.j = e42Var2;
                hpVarI = na1.t(e42Var2);
            }
            hpVarT = na1.M(hpVarI, lh0.s, executor);
        } else {
            hpVarT = na1.t(e42Var);
        }
        return na1.I(na1.L(fn2.r(hpVarT), new yy0(this, 14, tj1Var), executor), Exception.class, new lh0(18), executor);
    }

    public void s(String str, double d, double d2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = (ArrayList) this.i;
        int i = 0;
        while (true) {
            arrayList = (ArrayList) this.g;
            if (i >= arrayList.size()) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d));
        arrayList2.add(i, Double.valueOf(d2));
    }

    public void t(pd0 pd0Var, ml0 ml0Var) {
        int i = 0;
        while (true) {
            me0[] me0VarArr = (me0[]) this.h;
            if (i >= me0VarArr.length) {
                return;
            }
            ml0Var.a();
            ml0Var.b();
            me0 me0VarZ = pd0Var.z(ml0Var.d, 3);
            de3 de3Var = (de3) ((List) this.g).get(i);
            String str = de3Var.m;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            hn.K(z, "Invalid closed caption MIME type provided: %s", str);
            String str2 = de3Var.a;
            if (str2 == null) {
                ml0Var.b();
                str2 = ml0Var.e;
            }
            uc3 uc3Var = new uc3();
            uc3Var.a = str2;
            uc3Var.d("video/mp2t");
            uc3Var.e(str);
            uc3Var.e = de3Var.e;
            uc3Var.d = de3Var.d;
            uc3Var.I = de3Var.J;
            uc3Var.o = de3Var.p;
            me0VarZ.d(new de3(uc3Var));
            me0VarArr[i] = me0VarZ;
            i++;
        }
    }

    public String toString() {
        switch (this.f) {
            case 23:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.g);
                sb.append('{');
                vg2 vg2Var = (vg2) ((vg2) this.h).h;
                String str = "";
                while (vg2Var != null) {
                    Object obj = vg2Var.g;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    vg2Var = (vg2) vg2Var.h;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public synchronized void u(f93 f93Var, int i) {
        this.i = null;
        vz1 vz1Var = new vz1(i);
        zx zxVar = new zx(this);
        ((es0) this.g).n(f93Var, (String) this.h, vz1Var, zxVar);
    }

    public z42 v() {
        return (z42) ((e52) this.g).b.h;
    }

    public zo2 x() throws GeneralSecurityException {
        gv1 gv1Var;
        j03 j03VarB;
        cp2 cp2Var = (cp2) this.g;
        if (cp2Var == null || (gv1Var = (gv1) this.h) == null) {
            j7.r("Cannot build without parameters and/or key material");
            return null;
        }
        if (cp2Var.a != ((j03) gv1Var.g).a.length) {
            j7.r("Key size mismatch");
            return null;
        }
        if (cp2Var.a() && ((Integer) this.i) == null) {
            j7.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((cp2) this.g).a() && ((Integer) this.i) != null) {
            j7.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        bp2 bp2Var = ((cp2) this.g).c;
        if (bp2Var == bp2.j) {
            j03VarB = gs2.a;
        } else if (bp2Var == bp2.i) {
            j03VarB = gs2.a(((Integer) this.i).intValue());
        } else {
            if (bp2Var != bp2.h) {
                j7.e("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(bp2Var)));
                return null;
            }
            j03VarB = gs2.b(((Integer) this.i).intValue());
        }
        return new zo2((cp2) this.g, (gv1) this.h, j03VarB, (Integer) this.i);
    }

    public ip2 y() throws GeneralSecurityException {
        gv1 gv1Var;
        j03 j03VarB;
        lp2 lp2Var = (lp2) this.g;
        if (lp2Var == null || (gv1Var = (gv1) this.h) == null) {
            j7.r("Cannot build without parameters and/or key material");
            return null;
        }
        if (lp2Var.a != ((j03) gv1Var.g).a.length) {
            j7.r("Key size mismatch");
            return null;
        }
        if (lp2Var.a() && ((Integer) this.i) == null) {
            j7.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((lp2) this.g).a() && ((Integer) this.i) != null) {
            j7.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        kp2 kp2Var = ((lp2) this.g).b;
        if (kp2Var == kp2.j) {
            j03VarB = gs2.a;
        } else if (kp2Var == kp2.i) {
            j03VarB = gs2.a(((Integer) this.i).intValue());
        } else {
            if (kp2Var != kp2.h) {
                j7.e("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(kp2Var)));
                return null;
            }
            j03VarB = gs2.b(((Integer) this.i).intValue());
        }
        return new ip2((lp2) this.g, (gv1) this.h, j03VarB, (Integer) this.i);
    }

    public dt2 z() throws GeneralSecurityException {
        gv1 gv1Var;
        j03 j03VarA;
        gt2 gt2Var = (gt2) this.g;
        if (gt2Var == null || (gv1Var = (gv1) this.h) == null) {
            j7.r("Cannot build without parameters and/or key material");
            return null;
        }
        if (gt2Var.a != ((j03) gv1Var.g).a.length) {
            j7.r("Key size mismatch");
            return null;
        }
        if (gt2Var.a() && ((Integer) this.i) == null) {
            j7.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((gt2) this.g).a() && ((Integer) this.i) != null) {
            j7.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        ao2 ao2Var = ((gt2) this.g).c;
        if (ao2Var == ao2.q) {
            j03VarA = gs2.a;
        } else if (ao2Var == ao2.p || ao2Var == ao2.o) {
            j03VarA = gs2.a(((Integer) this.i).intValue());
        } else {
            if (ao2Var != ao2.n) {
                j7.e("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(ao2Var)));
                return null;
            }
            j03VarA = gs2.b(((Integer) this.i).intValue());
        }
        return new dt2((gt2) this.g, (gv1) this.h, j03VarA, (Integer) this.i);
    }

    @Override // defpackage.i42
    public /* bridge */ /* synthetic */ Object l() {
        return null;
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((ck1) obj).I((w71) this.g, (String) this.h, (String) this.i);
    }

    @Override // defpackage.en
    public void k() {
    }

    public /* synthetic */ p83(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ p83(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public /* synthetic */ p83(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
        this.i = obj;
    }

    public p83(if1 if1Var, Context context, ya1 ya1Var) {
        this.f = 17;
        this.h = if1Var;
        this.g = context;
        this.i = ya1Var;
    }

    public p83(e52 e52Var, x42 x42Var, String str) {
        this.f = 13;
        this.g = e52Var;
        this.h = x42Var;
        this.i = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public /* synthetic */ p83(r52 r52Var) {
        this.f = 9;
        this.g = (String) r52Var.g;
        this.h = (String) r52Var.h;
        this.i = (ma1) r52Var.i;
    }

    public p83(int i) {
        this.f = i;
        switch (i) {
            case 10:
                this.g = new ArrayList();
                this.h = new ArrayList();
                this.i = new ArrayList();
                break;
            default:
                String str = qz1.a;
                this.g = new h90(3, Executors.newSingleThreadExecutor(new oe("ExoPlayer:Loader:ProgressiveMediaPeriod")));
                break;
        }
    }

    @Override // defpackage.fg3
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized eg3 mo8a() {
        eg3 eg3VarMo8a;
        k23 k23Var = (k23) this.i;
        ig3 ig3Var = k23Var.c;
        HashMap map = (HashMap) this.g;
        eg3VarMo8a = ig3Var.mo8a();
        la3 la3Var = (la3) this.h;
        map.put(eg3VarMo8a, la3Var);
        w13 w13Var = (w13) k23Var.n.get(la3Var);
        if (w13Var != null) {
            synchronized (w13Var) {
                w13Var.d++;
            }
        }
        return eg3VarMo8a;
    }

    public p83(Context context) {
        this.f = 0;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.h = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.i = Executors.newSingleThreadExecutor();
        this.g = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new ly1(27, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    @Override // defpackage.ni0
    public int a() {
        return ((long[]) this.i).length;
    }

    public p83(Context context, Executor executor, ap0 ap0Var, dr0 dr0Var) {
        this.f = 8;
        this.h = dr0Var;
        this.i = ap0Var;
        this.g = na1.F(new hq0(this, 0, context), executor);
    }

    public /* synthetic */ p83(int i, boolean z) {
        this.f = i;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public p83(List list) {
        this.f = 7;
        this.g = list;
        this.h = new me0[list.size()];
        this.i = new ts2(new kc2(12, this));
    }

    public p83(r52 r52Var, ya1 ya1Var) {
        this.f = 21;
        this.i = new fl1(25);
        this.g = r52Var;
        this.h = ya1Var;
    }

    public p83(k23 k23Var, la3 la3Var) {
        this.f = 29;
        this.i = k23Var;
        this.g = new HashMap();
        this.h = la3Var;
    }

    public p83(String str) {
        this.f = 23;
        vg2 vg2Var = new vg2(22);
        this.h = vg2Var;
        this.i = vg2Var;
        this.g = str;
    }

    public p83(po poVar) {
        this.f = 4;
        this.g = new oo(poVar);
        this.h = new Handler(Looper.getMainLooper());
    }

    public p83(Context context, LocationManager locationManager) {
        this.f = 5;
        this.i = new v40();
        this.g = context;
        this.h = locationManager;
    }
}
