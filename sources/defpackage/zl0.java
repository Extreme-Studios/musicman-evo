package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl0 implements wh2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zl0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wh2
    public final Object apply(Object obj) {
        SharedPreferences sharedPreferences;
        boolean z;
        String str;
        float f;
        float f2;
        int iHeight;
        int i;
        String strP;
        int i2;
        int i3;
        WindowManager windowManager;
        DisplayMetrics displayMetrics;
        File file;
        File file2;
        wd2 wd2VarA;
        int i4 = 2;
        int i5 = -1;
        int i6 = 0;
        String str2 = null;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) this.b;
                String str3 = (String) obj;
                return !TextUtils.isEmpty(str3) ? ep0.I3(uri, "nas", str3) : uri;
            case 1:
                kd0 kd0Var = (kd0) this.b;
                JSONObject jSONObject = (JSONObject) obj;
                ix0 ix0Var = lx0.a;
                tu0 tu0Var = tu0.e;
                zf0 zf0Var = tu0Var.b;
                r52 r52Var = tu0Var.a;
                Context context = (Context) kd0Var.h;
                SharedPreferences sharedPreferencesE = zf0.e(context);
                if (sharedPreferencesE == null) {
                    return null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferencesE.edit();
                Objects.requireNonNull(r52Var);
                ArrayList arrayList = (ArrayList) r52Var.g;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    ix0 ix0Var2 = (ix0) obj2;
                    if (ix0Var2.a == 1) {
                        Object objA = ix0Var2.a(jSONObject);
                        switch (ix0Var2.e) {
                            case 0:
                                editorEdit.putBoolean(ix0Var2.b, ((Boolean) objA).booleanValue());
                                break;
                            case 1:
                                editorEdit.putInt(ix0Var2.b, ((Integer) objA).intValue());
                                break;
                            case 2:
                                editorEdit.putLong(ix0Var2.b, ((Long) objA).longValue());
                                break;
                            case 3:
                                editorEdit.putFloat(ix0Var2.b, ((Float) objA).floatValue());
                                break;
                            default:
                                editorEdit.putString(ix0Var2.b, (String) objA);
                                break;
                        }
                    }
                }
                if (jSONObject != null) {
                    editorEdit.putString("flag_configuration", jSONObject.toString());
                } else {
                    jn.M("Flag Json is null.");
                }
                zf0 zf0Var2 = tu0.e.b;
                editorEdit.commit();
                if (((Boolean) ry0.c.u()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
                    try {
                        sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                    } catch (IllegalStateException e) {
                        jn.V("", e);
                        sharedPreferences = null;
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        JSONObject jSONObject2 = new JSONObject();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (next.startsWith("adapter:")) {
                                try {
                                    jSONObject2.put(next, jSONObject.get(next));
                                } catch (JSONException unused) {
                                }
                            }
                        }
                        editorEdit2.putString("flag_configuration", jSONObject2.toString());
                        editorEdit2.commit();
                    }
                    break;
                }
                SharedPreferences sharedPreferences2 = (SharedPreferences) kd0Var.i;
                if (sharedPreferences2 == null) {
                    return null;
                }
                SharedPreferences.Editor editorEdit3 = sharedPreferences2.edit();
                vc3.C.k.getClass();
                editorEdit3.putLong("js_last_update", System.currentTimeMillis()).apply();
                return null;
            case 2:
                uq1 uq1Var = (uq1) this.b;
                md1 md1Var = (md1) obj;
                md1Var.t0("/result", uq1Var.h);
                he1 he1VarE0 = md1Var.e0();
                vs0 vs0Var = new vs0(uq1Var.c, null);
                bw1 bw1Var = uq1Var.i;
                f82 f82Var = uq1Var.j;
                es1 es1Var = uq1Var.d;
                qq1 qq1Var = uq1Var.a;
                he1VarE0.p(null, qq1Var, qq1Var, qq1Var, qq1Var, false, null, vs0Var, null, null, bw1Var, f82Var, es1Var, null, null, null, null, null, null, null, null);
                return md1Var;
            case 3:
                return ((of1) this.b).J();
            case 4:
                a02 a02Var = (a02) this.b;
                i52 i52Var = (i52) a02Var.b;
                kb3 kb3Var = i52Var.f;
                kb3[] kb3VarArr = kb3Var.l;
                if (kb3VarArr == null) {
                    str = kb3Var.f;
                    z = kb3Var.n;
                } else {
                    z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    str = null;
                    for (kb3 kb3Var2 : kb3VarArr) {
                        boolean z4 = kb3Var2.n;
                        if (!z4 && !z2) {
                            str = kb3Var2.f;
                            z2 = true;
                        }
                        if (z4) {
                            if (!z3) {
                                z = true;
                            }
                            z3 = true;
                        }
                        if (!z2 || !z3) {
                        }
                    }
                }
                Context context2 = (Context) a02Var.c;
                Resources resources = context2.getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                    iHeight = 0;
                    i = 0;
                    strP = null;
                } else {
                    sa1 sa1Var = (sa1) a02Var.e;
                    f2 = displayMetrics.density;
                    f = 0.0f;
                    i = displayMetrics.widthPixels;
                    iHeight = displayMetrics.heightPixels;
                    strP = sa1Var.g().p();
                }
                ix0 ix0Var3 = lx0.de;
                tu0 tu0Var2 = tu0.e;
                gn gnVarB = (!((Boolean) tu0Var2.c.a(ix0Var3)).booleanValue() || Build.VERSION.SDK_INT < 35) ? null : a02Var.b(f2);
                if (((Boolean) tu0Var2.c.a(lx0.ee)).booleanValue() && (i3 = Build.VERSION.SDK_INT) <= 34 && i3 >= 28 && (windowManager = (WindowManager) context2.getSystemService("window")) != null) {
                    if (i3 >= 30) {
                        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        int iWidth = currentWindowMetrics.getBounds().width();
                        iHeight = currentWindowMetrics.getBounds().height();
                        i = iWidth;
                    } else {
                        Point point = new Point();
                        windowManager.getDefaultDisplay().getRealSize(point);
                        i = point.x;
                        iHeight = point.y;
                    }
                    gnVarB = a02Var.b(f2);
                }
                StringBuilder sb = new StringBuilder();
                if (kb3VarArr != null) {
                    boolean z5 = false;
                    for (kb3 kb3Var3 : kb3VarArr) {
                        if (kb3Var3.n) {
                            z5 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i8 = kb3Var3.j;
                            if (i8 == -1) {
                                i8 = f2 != f ? (int) (kb3Var3.k / f2) : -1;
                            }
                            sb.append(i8);
                            sb.append("x");
                            int i9 = kb3Var3.g;
                            if (i9 == -2) {
                                i9 = f2 != f ? (int) (kb3Var3.h / f2) : -2;
                            }
                            sb.append(i9);
                        }
                    }
                    if (z5) {
                        if (sb.length() != 0) {
                            i2 = 0;
                            sb.insert(0, "|");
                        } else {
                            i2 = 0;
                        }
                        sb.insert(i2, "320x50");
                    }
                }
                return new h02(kb3Var, str, z, sb.toString(), f2, i, iHeight, strP, i52Var.r, gnVarB);
            case 5:
                ((o02) this.b).a.d("AppSetIdInfoSignal", (Exception) obj);
                return new p02(str2, i5, i6);
            case 6:
                ((sa1) ((g02) this.b).b).d("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new p02(str2, i5, i4);
            case 7:
                ((k32) this.b).a.d("TrustlessTokenSignal", (Exception) obj);
                return new f02(str2, 5);
            case 8:
                d62 d62Var = (d62) this.b;
                d62Var.c = (mi1) obj;
                return d62Var;
            case 9:
                return (ge2) this.b;
            case 10:
                ge2 ge2Var = (ge2) obj;
                ((je2) this.b).f.set(ge2Var);
                return ge2Var;
            case 11:
                if (((bg2) this.b).a.b((fe2) obj)) {
                    return new Integer(0);
                }
                throw new vf2();
            case 12:
                hg2 hg2Var = (hg2) this.b;
                fe2 fe2Var = (fe2) obj;
                dh2 dh2Var = hg2Var.e;
                if (!hg2Var.c.a(fe2Var) || fe2Var == null) {
                    dh2Var.b(15003);
                    throw new na(1);
                }
                ng2 ng2Var = hg2Var.b;
                switch (ng2Var.a) {
                    case 0:
                        file = ((kd2) ng2Var.d.c()).a;
                        break;
                    default:
                        file = ((kd2) ng2Var.d.c()).a;
                        break;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                File file3 = hg2Var.d;
                ht0 ht0VarZ = fe2Var.z();
                switch (ng2Var.a) {
                    case 0:
                        file2 = ng2Var.c.a;
                        break;
                    default:
                        file2 = ng2Var.c.a;
                        break;
                }
                dh2Var.e(15002, new ib(hg2Var, new kd0(ht0VarZ, file, file2, file3), fe2Var, 16));
                return null;
            case 13:
                ig2 ig2Var = (ig2) this.b;
                byte[] bArr = (byte[]) obj;
                mn0 mn0Var = new mn0(0);
                ch2 ch2VarA = ig2Var.e.a(20102);
                try {
                    try {
                        ch2VarA.a();
                        synchronized (ig2Var.f) {
                            try {
                                ig2Var.j = gh0.a(mn0Var, bArr);
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        ch2VarA.c();
                        return null;
                    } catch (Throwable th2) {
                        ch2VarA.c();
                        throw th2;
                    }
                } catch (in0 e2) {
                    e = e2;
                    ch2VarA.b(e);
                    throw new na("r: 2", e);
                } catch (ln0 e3) {
                    e = e3;
                    ch2VarA.b(e);
                    throw new na("r: 2", e);
                } catch (Throwable th3) {
                    ch2VarA.b(th3);
                    throw th3;
                }
            case 14:
                lg2 lg2Var = (lg2) this.b;
                fd2 fd2Var = (fd2) obj;
                dh2 dh2Var2 = lg2Var.d;
                if (fd2Var.a != 200) {
                    dh2Var2.a.b(20002, -1L, null, new String(rs0.t(), StandardCharsets.UTF_8));
                    return lg2.a(7);
                }
                try {
                    String str4 = new String(fd2Var.b);
                    if (TextUtils.isEmpty(str4)) {
                        dh2Var2.b(20004);
                        wd2VarA = lg2.a(8);
                    } else {
                        ms0 ms0VarA = ms0.A(na1.A(str4, true), v13.a());
                        if (!ms0VarA.z().B() || !ms0VarA.z().z()) {
                            dh2Var2.b(20004);
                            wd2VarA = lg2.a(8);
                        } else if (((mg2) lg2Var.h).a(ms0VarA)) {
                            vd2 vd2VarC = wd2.C();
                            xd2 xd2VarC = fe2.C();
                            ft0 ft0VarA = ms0VarA.z().A();
                            xd2VarC.b();
                            ((fe2) xd2VarC.g).F(ft0VarA);
                            vd2VarC.b();
                            ((wd2) vd2VarC.g).D((fe2) xd2VarC.c());
                            n13 n13VarC = ms0VarA.z().C();
                            vd2VarC.b();
                            ((wd2) vd2VarC.g).E(n13VarC);
                            vd2VarC.b();
                            ((wd2) vd2VarC.g).H(2);
                            wd2VarA = (wd2) vd2VarC.c();
                        } else {
                            dh2Var2.b(20006);
                            wd2VarA = lg2.a(12);
                        }
                    }
                    return wd2VarA;
                } catch (Throwable th4) {
                    dh2Var2.c(20005, th4);
                    return lg2.a(6);
                }
            default:
                wg2 wg2Var = (wg2) this.b;
                String str5 = (String) obj;
                if (!yd.v(str5)) {
                    return str5;
                }
                File file4 = new File(wg2Var.b.getPackageResourcePath());
                if (file4.exists() && file4.canRead()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file4);
                        try {
                            byte[] bArr2 = new byte[16384];
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                            for (int i10 = fileInputStream.read(bArr2); i10 != -1; i10 = fileInputStream.read(bArr2)) {
                                messageDigest.update(bArr2, 0, i10);
                            }
                            il2 il2VarF = il2.f.f();
                            byte[] bArrDigest = messageDigest.digest();
                            String strG = il2VarF.g(bArrDigest.length, bArrDigest);
                            fileInputStream.close();
                            return strG;
                        } catch (Throwable th5) {
                            try {
                                fileInputStream.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused2) {
                    }
                }
                return "";
        }
    }
}
