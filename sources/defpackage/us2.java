package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.view.Choreographer;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class us2 implements ys2, ah, el0, db1, dr, de2, hn2, ke1, o62, gm1, au2, hp1 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public us2(int i) {
        this.f = i;
        switch (i) {
            case 5:
                this.g = Collections.synchronizedMap(new WeakHashMap());
                this.h = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 7:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.g = byteArrayOutputStream;
                this.h = new DataOutputStream(byteArrayOutputStream);
                break;
            case 25:
                this.g = new HashMap();
                break;
            default:
                this.g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                break;
        }
    }

    public static void j(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public static us2 o(gw2 gw2Var) {
        return new us2(gw2Var, 0, ct2.a(gw2Var.z()));
    }

    @Override // defpackage.dr
    public void A(g2 g2Var) {
        try {
            String canonicalName = ((b51) this.h).f.getClass().getCanonicalName();
            int i = g2Var.g;
            String str = (String) g2Var.h;
            String str2 = (String) g2Var.i;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            jn.F(sb.toString());
            q41 q41Var = (q41) this.g;
            q41Var.M0(g2Var.d());
            q41Var.x0(str, i);
            q41Var.m0(i);
        } catch (RemoteException e) {
            jn.P("", e);
        }
    }

    public void B(int i, int i2, int i3, int i4) {
        try {
            ((md1) this.g).b("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            jn.P("Error occurred while dispatching size change.", e);
        }
    }

    public void C(String str) {
        try {
            ((md1) this.g).b("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            jn.P("Error occurred while dispatching state change.", e);
        }
    }

    public void D(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            ((md1) this.g).b("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            jn.P("Error occurred while obtaining screen information.", e);
        }
    }

    @Override // defpackage.db1
    /* JADX INFO: renamed from: a */
    public void mo3a() {
        switch (this.f) {
            case 10:
                jn.p("callJs > getEngine: Promise rejected");
                ((cb1) this.g).c(new w31("Unable to obtain a JavascriptEngine."));
                ((r31) this.h).p();
                break;
            default:
                vy1 vy1Var = (vy1) this.g;
                tx0 tx0Var = (tx0) this.h;
                ux0 ux0Var = (ux0) vy1Var.d;
                Parcel parcelU = ux0Var.U();
                kt0.e(parcelU, tx0Var);
                ux0Var.K0(parcelU, 1);
                break;
        }
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f) {
            case 23:
                p62 p62Var = (p62) this.g;
                ((v62) obj).F((r62) p62Var.f, p62Var.g, (Throwable) this.h);
                break;
            default:
                ((r93) obj).n((q93) this.g, (vd3) this.h);
                break;
        }
    }

    @Override // defpackage.ah
    public Object c() {
        return (n50) this.g;
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void mo5e(Object obj) {
        switch (this.f) {
            case 14:
                zg1 zg1Var = (zg1) this.h;
                List listP = zg1Var.p();
                oj1 oj1Var = zg1Var.t;
                zg1Var.m.a(zg1Var.l.b(zg1Var.j, zg1Var.k, false, (String) this.g, (String) obj, listP, oj1Var), zg1Var.s);
                return;
            case 15:
                si1 si1Var = (si1) this.h;
                si1Var.getClass();
                za1.f.execute(new va1(13, si1Var));
                ((kd0) this.g).mo5e((mi1) obj);
                return;
            default:
                mx0 mx0Var = (mx0) this.h;
                iy1 iy1Var = (iy1) obj;
                synchronized (mx0Var) {
                    try {
                        ((ay1) mx0Var.h).b(iy1Var, (x42) this.g);
                        x42 x42VarA = ((ay1) mx0Var.h).a();
                        if (x42VarA != null) {
                            mx0Var.c(x42VarA);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // defpackage.el0
    public void g(cw1 cw1Var) {
        kl0 kl0Var = (kl0) this.h;
        if (cw1Var.K() == 0 && (cw1Var.K() & 128) != 0) {
            cw1Var.G(6);
            int iB = cw1Var.B() / 4;
            for (int i = 0; i < iB; i++) {
                oe0 oe0Var = (oe0) this.g;
                cw1Var.H(oe0Var.a, 0, 4);
                oe0Var.l(0);
                int iR = oe0Var.r(16);
                oe0Var.o(3);
                if (iR == 0) {
                    oe0Var.o(13);
                } else {
                    int iR2 = oe0Var.r(13);
                    if (kl0Var.f.get(iR2) == null) {
                        kl0Var.f.put(iR2, new fl0(new dg3(kl0Var, iR2)));
                    }
                }
            }
            kl0Var.f.remove(0);
        }
    }

    @Override // defpackage.ah
    public boolean h(CharSequence charSequence, int i, int i2, e50 e50Var) {
        if ((e50Var.c & 4) > 0) {
            return true;
        }
        if (((n50) this.g) == null) {
            this.g = new n50(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((ig) this.h).getClass();
        ((n50) this.g).setSpan(new f50(e50Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.au2
    public byte[] i(int i, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = (Provider) this.h;
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.g;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(secretKeySpec);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:91:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:4: B:9:0x0020->B:95:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x005e A[SYNTHETIC] */
    public void k(lk lkVar, int i, int i2) {
        List list;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z;
        int iIntValue;
        zy1 zy1Var = (zy1) this.h;
        dr0 dr0Var = ((wd) this.g).d;
        dr0Var.getClass();
        int i3 = 0;
        if (i == i2) {
            list = Collections.EMPTY_LIST;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i4 = i;
            while (true) {
                if (z2) {
                    if (i4 < i2) {
                        treeMap = (TreeMap) ((HashMap) dr0Var.g).get(Integer.valueOf(i4));
                        if (treeMap != null) {
                            if (z2) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                Integer num = (Integer) it.next();
                                iIntValue = num.intValue();
                                if (!z2) {
                                    if (iIntValue >= i2 && iIntValue < i4) {
                                        arrayList.add(treeMap.get(num));
                                        z = true;
                                        i4 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (iIntValue <= i2 && iIntValue > i4) {
                                    arrayList.add(treeMap.get(num));
                                    z = true;
                                    i4 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        list = null;
                    } else {
                        list = arrayList;
                    }
                } else if (i4 > i2) {
                    treeMap = (TreeMap) ((HashMap) dr0Var.g).get(Integer.valueOf(i4));
                    if (treeMap != null) {
                        if (z2) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            Integer num2 = (Integer) it.next();
                            iIntValue = num2.intValue();
                            if (!z2) {
                                if (iIntValue <= i2) {
                                    continue;
                                }
                            } else if (iIntValue >= i2) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    list = null;
                } else {
                    list = arrayList;
                }
            }
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Cursor cursorE = lkVar.e("SELECT name FROM sqlite_master WHERE type = 'trigger'");
            while (cursorE.moveToNext()) {
                try {
                    arrayList2.add(cursorE.getString(0));
                } catch (Throwable th) {
                    cursorE.close();
                    throw th;
                }
            }
            cursorE.close();
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                String str = (String) obj;
                if (str.startsWith("room_fts_content_sync_")) {
                    lkVar.c("DROP TRIGGER IF EXISTS ".concat(str));
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((ps) it2.next()).a(lkVar);
            }
            xx xxVarL = zy1.l(lkVar);
            if (xxVarL.b) {
                l(lkVar);
                return;
            } else {
                j7.o(xxVarL.a, "Migration didn't properly handle: ");
                return;
            }
        }
        wd wdVar = (wd) this.g;
        if ((i <= i2 || !wdVar.h) && wdVar.g) {
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        lkVar.c("DROP TABLE IF EXISTS `Dependency`");
        lkVar.c("DROP TABLE IF EXISTS `WorkSpec`");
        lkVar.c("DROP TABLE IF EXISTS `WorkTag`");
        lkVar.c("DROP TABLE IF EXISTS `SystemIdInfo`");
        lkVar.c("DROP TABLE IF EXISTS `WorkName`");
        lkVar.c("DROP TABLE IF EXISTS `WorkProgress`");
        lkVar.c("DROP TABLE IF EXISTS `Preference`");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) zy1Var.g;
        List list2 = workDatabase_Impl.d;
        if (list2 != null) {
            int size2 = list2.size();
            while (i3 < size2) {
                ((c90) workDatabase_Impl.d.get(i3)).getClass();
                i3++;
            }
        }
        zy1.k(lkVar);
    }

    public void l(lk lkVar) {
        lkVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        lkVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public void m(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.g)) {
            map = new HashMap((Map) this.g);
        }
        synchronized (((Map) this.h)) {
            map2 = new HashMap((Map) this.h);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                j7.j();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((k30) entry2.getKey()).a(new v3(status));
            }
        }
    }

    public synchronized Map n() {
        try {
            if (((Map) this.h) == null) {
                this.h = Collections.unmodifiableMap(new HashMap((HashMap) this.g));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.h;
    }

    public void p(n62 n62Var) {
        br0 br0Var = new br0(6, (uv1) this.g);
        ya1 ya1Var = (ya1) this.h;
        hp hpVarB = ya1Var.b(br0Var);
        hpVarB.a(new in2(hpVarB, 0, new zx(this, 26, n62Var)), ya1Var);
    }

    @Override // defpackage.ke1
    public /* synthetic */ void q(String str, int i, String str2, boolean z) {
        mp1 mp1Var = (mp1) this.g;
        Map map = (Map) this.h;
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        mp1Var.b.d(map2);
    }

    public void r(x42 x42Var) {
        s("aai", x42Var.w);
        s("request_id", x42Var.n0);
        s("ad_format", x42.a(x42Var.b));
    }

    public void s(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.g).put(str, str2);
    }

    public void t() {
        ((es1) this.h).b.execute(new ds1(this, 2));
    }

    public Set u(nj1 nj1Var) {
        return Collections.singleton(new wm1(nj1Var, za1.g));
    }

    public sc3 v() {
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.Ne)).booleanValue();
        sc3 sc3Var = sc3.f;
        if (!zBooleanValue) {
            t();
            return sc3Var;
        }
        es1 es1Var = (es1) this.h;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g;
        hs1 hs1Var = es1Var.a;
        hs1Var.getClass();
        if (concurrentHashMap.isEmpty()) {
            jn.F("Empty paramMap.");
            return sc3Var;
        }
        String strC = hs1Var.f.c(concurrentHashMap);
        jn.p(strC);
        return hs1Var.d.a(strC, null);
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 14:
                zg1 zg1Var = (zg1) this.h;
                zg1Var.m.a(zg1Var.l.b(zg1Var.j, zg1Var.k, false, (String) this.g, null, zg1Var.p(), zg1Var.t), null);
                return;
            case 15:
                si1 si1Var = (si1) this.h;
                si1Var.getClass();
                za1.f.execute(new va1(13, si1Var));
                ((kd0) this.g).w(th);
                return;
            default:
                mx0 mx0Var = (mx0) this.h;
                synchronized (mx0Var) {
                    try {
                        ay1 ay1Var = (ay1) mx0Var.h;
                        x42 x42Var = (x42) this.g;
                        ay1Var.c(x42Var);
                        x42 x42VarA = ((ay1) mx0Var.h).a();
                        if (x42Var.v0) {
                            while (x42VarA != null) {
                                mx0Var.c(x42VarA);
                                x42VarA = ((ay1) mx0Var.h).a();
                            }
                        } else if (x42VarA != null) {
                            mx0Var.c(x42VarA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public Set x(nj1 nj1Var) {
        return Collections.singleton(new wm1(nj1Var, za1.g));
    }

    public void y() {
        ((es1) this.h).b.execute(new ds1(this, 0));
    }

    public void z(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", (String) this.h);
            md1 md1Var = (md1) this.g;
            if (md1Var != null) {
                md1Var.b("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            jn.P("Error occurred while dispatching error event.", e);
        }
    }

    @Override // defpackage.de2
    /* JADX INFO: renamed from: a */
    public /* synthetic */ oe2 mo12a() {
        ed1 ed1Var = (ed1) this.g;
        oe2 oe2VarMo12a = ((de2) this.h).mo12a();
        dr0 dr0Var = new dr0(18, ed1Var);
        return new xc1(ed1Var.f, oe2VarMo12a, ed1Var.s, ed1Var.t, ed1Var, dr0Var);
    }

    public /* synthetic */ us2(int i, boolean z) {
        this.f = i;
    }

    public /* synthetic */ us2(Object obj, int i, Object obj2) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    public /* synthetic */ us2(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public us2(kl0 kl0Var) {
        this.f = 8;
        this.h = kl0Var;
        this.g = new oe0(4, new byte[4]);
    }

    public us2(sx0 sx0Var) {
        this.f = 9;
        this.h = sx0Var;
        this.g = new HashMap();
    }

    public us2(r31 r31Var, c41 c41Var, cb1 cb1Var) {
        this.f = 10;
        this.g = cb1Var;
        this.h = r31Var;
    }

    public us2(si1 si1Var, kd0 kd0Var) {
        this.f = 15;
        this.g = kd0Var;
        Objects.requireNonNull(si1Var);
        this.h = si1Var;
    }

    public us2(es1 es1Var) {
        this.f = 18;
        this.h = es1Var;
        this.g = new ConcurrentHashMap();
    }

    public us2(qk2 qk2Var, int[] iArr) {
        this.f = 22;
        this.g = vj2.m(qk2Var);
        this.h = iArr;
    }

    public us2(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.f = 27;
        if (jn.r(1)) {
            this.g = new SecretKeySpec(bArr, "AES");
            this.h = provider;
        } else {
            j7.r("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
    }

    public /* synthetic */ us2(int i, Object obj) {
        this.f = i;
        this.h = obj;
    }

    @Override // defpackage.el0
    public void d(ry1 ry1Var, pd0 pd0Var, ml0 ml0Var) {
    }
}
