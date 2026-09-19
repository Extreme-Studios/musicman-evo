package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.io.File;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class un1 implements qi0, xm0, om0, pz0, hn2, mw1, pn1, i42, de2, au2 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public un1(if1 if1Var, Context context, String str) {
        this.f = 12;
        s63 s63VarA = s63.a(context);
        q63 q63Var = if1Var.I0;
        int i = 1;
        j42 j42Var = new j42(s63VarA, q63Var, if1Var.J0, i);
        q63 q63VarA = q63.a(new q12(q63Var, 7));
        q63 q63VarA2 = q63.a(ej1.m);
        q63 q63VarA3 = q63.a(new yn1(s63VarA, if1Var.c, if1Var.D, (r63) j42Var, q63VarA, (v63) q63VarA2, 8));
        this.g = q63.a(new dx0(q63VarA3, q63VarA, q63VarA2, i));
        this.h = q63.a(new bp1(s63.b(str), q63VarA3, s63VarA, q63VarA, q63VarA2, if1Var.h, if1Var.E, if1Var.j));
    }

    @Override // defpackage.mw1
    public Object a() {
        d60 d60Var = (d60) this.g;
        int i = d60Var.g;
        int i2 = d60Var.h;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        String string = sb.toString();
        if (TextUtils.isEmpty("Google")) {
            j7.p("Name is null or empty");
            return null;
        }
        if (!TextUtils.isEmpty(string)) {
            return new c92(new yl1("Google", string), (WebView) this.h);
        }
        j7.p("Version is null or empty");
        return null;
    }

    public void b(v1 v1Var) {
        y91 y91Var = (y91) this.g;
        ((ActionMode.Callback) y91Var.g).onDestroyActionMode(y91Var.h(v1Var));
        c5 c5Var = (c5) this.h;
        if (c5Var.A != null) {
            c5Var.q.getDecorView().removeCallbacks(c5Var.B);
        }
        if (c5Var.z != null) {
            h70 h70Var = c5Var.C;
            if (h70Var != null) {
                h70Var.b();
            }
            h70 h70VarA = w60.a(c5Var.z);
            h70VarA.a(0.0f);
            c5Var.C = h70VarA;
            h70VarA.d(new r4(2, this));
        }
        c5Var.y = null;
        ViewGroup viewGroup = c5Var.E;
        WeakHashMap weakHashMap = w60.a;
        n60.c(viewGroup);
        c5Var.H();
    }

    @Override // defpackage.pn1
    public x42 c() {
        return (x42) this.h;
    }

    @Override // defpackage.om0
    public void d(qm0 qm0Var) {
        String str = (String) this.g;
        String string = qm0Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        jn.T(sb.toString());
        ((sz0) this.h).b(null);
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        switch (this.f) {
            case 15:
                ((md1) obj).d1((String) this.g, (v11) this.h);
                return;
            case 16:
                String str = (String) obj;
                try {
                    q71 q71Var = (q71) this.h;
                    j71 j71Var = (j71) this.g;
                    Parcel parcelU = q71Var.U();
                    parcelU.writeString(str);
                    kt0.c(parcelU, j71Var);
                    q71Var.K0(parcelU, 1);
                    return;
                } catch (RemoteException e) {
                    jn.w("Service can't call client", e);
                    return;
                }
            default:
                dg3 dg3Var = (dg3) this.h;
                synchronized (dg3Var) {
                    try {
                        dg3Var.j = null;
                        ((ArrayDeque) dg3Var.i).addFirst((x32) this.g);
                        if (dg3Var.f == 1) {
                            dg3Var.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // defpackage.i42
    public /* bridge */ /* synthetic */ hp f(vg2 vg2Var, h42 h42Var) {
        return t(vg2Var, h42Var, null);
    }

    @Override // defpackage.pz0
    public void g(MotionEvent motionEvent) {
        ((np1) this.g).onTouch(null, motionEvent);
    }

    @Override // defpackage.pz0
    public JSONObject h() {
        return ((np1) this.g).q();
    }

    @Override // defpackage.au2
    public byte[] i(int i, byte[] bArr) {
        return bArr.length <= 64 ? ((bu2) this.g).i(i, bArr) : ((us2) this.h).i(i, bArr);
    }

    public boolean j(v1 v1Var, Menu menu) {
        ViewGroup viewGroup = ((c5) this.h).E;
        WeakHashMap weakHashMap = w60.a;
        n60.c(viewGroup);
        y91 y91Var = (y91) this.g;
        ActionMode.Callback callback = (ActionMode.Callback) y91Var.g;
        j20 j20VarH = y91Var.h(v1Var);
        q00 q00Var = (q00) y91Var.j;
        Menu ksVar = (Menu) q00Var.get(menu);
        if (ksVar == null) {
            ksVar = new ks((Context) y91Var.h, (rr) menu);
            q00Var.put(menu, ksVar);
        }
        return callback.onPrepareActionMode(j20VarH, ksVar);
    }

    public void k(Bundle bundle) {
        az azVar = (az) this.g;
        bz bzVar = azVar.a;
        if (!azVar.e) {
            azVar.a();
        }
        if (bzVar.e().c.compareTo(fo.i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + bzVar.e().c).toString());
        }
        if (azVar.g) {
            j7.e("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleG = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleG = rs0.g("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        azVar.f = bundleG;
        azVar.g = true;
    }

    @Override // defpackage.i42
    public Object l() {
        tj1 tj1Var;
        synchronized (this) {
            tj1Var = (tj1) this.h;
        }
        return tj1Var;
    }

    public void m(Bundle bundle) {
        az azVar = (az) this.g;
        Bundle bundleD = ss0.d((lv[]) Arrays.copyOf(new lv[0], 0));
        Bundle bundle2 = azVar.f;
        if (bundle2 != null) {
            bundleD.putAll(bundle2);
        }
        synchronized (azVar.c) {
            for (Map.Entry entry : azVar.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((yy) entry.getValue()).a();
                str.getClass();
                bundleD.putBundle(str, bundleA);
            }
        }
        if (bundleD.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleD);
    }

    public void n() {
        Integer num;
        ra raVar = (ra) this.h;
        String str = (String) this.g;
        Bundle bundle = raVar.g;
        HashMap map = raVar.f;
        if (!raVar.d.contains(str) && (num = (Integer) raVar.b.remove(str)) != null) {
            raVar.a.remove(num);
        }
        raVar.e.remove(str);
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        if (raVar.c.get(str) == null) {
            return;
        }
        j7.j();
    }

    @Override // defpackage.pn1
    public void o(boolean z, Context context, ik1 ik1Var) throws on1 {
        try {
            s52 s52Var = (s52) ((ww1) this.g).b;
            s52Var.b(z);
            try {
                s52Var.a.S();
            } catch (Throwable th) {
                throw new l52(th);
            }
        } catch (l52 e) {
            jn.V("Cannot show rewarded video.", e);
            throw new on1(e.getCause());
        }
    }

    public nd0 p(Object... objArr) {
        Constructor constructorA;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.h;
        synchronized (atomicBoolean) {
            try {
                if (!atomicBoolean.get()) {
                    try {
                        constructorA = ((gd0) this.g).a();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.h).set(true);
                        constructorA = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorA = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (nd0) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public void q(os2 os2Var) throws GeneralSecurityException {
        if (os2Var == null) {
            j7.l("primitive constructor must be non-null");
            return;
        }
        qs2 qs2Var = new qs2(os2Var.a, os2Var.b);
        HashMap map = (HashMap) this.g;
        if (!map.containsKey(qs2Var)) {
            map.put(qs2Var, os2Var);
            return;
        }
        os2 os2Var2 = (os2) map.get(qs2Var);
        if (!os2Var2.equals(os2Var) || os2Var != os2Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(qs2Var.toString()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0233  */
    /* JADX WARN: Code duplicated, block: B:127:0x0256  */
    /* JADX WARN: Code duplicated, block: B:129:0x0261  */
    /* JADX WARN: Code duplicated, block: B:131:0x026a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0273  */
    /* JADX WARN: Code duplicated, block: B:134:0x027b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0283  */
    /* JADX WARN: Code duplicated, block: B:137:0x0286  */
    /* JADX WARN: Code duplicated, block: B:139:0x028e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0292  */
    /* JADX WARN: Code duplicated, block: B:142:0x029a  */
    /* JADX WARN: Code duplicated, block: B:146:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:156:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0306  */
    /* JADX WARN: Code duplicated, block: B:171:0x0316  */
    /* JADX WARN: Code duplicated, block: B:172:0x0339  */
    /* JADX WARN: Code duplicated, block: B:174:0x0349  */
    /* JADX WARN: Code duplicated, block: B:176:0x034d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0360  */
    /* JADX WARN: Code duplicated, block: B:183:0x0368  */
    /* JADX WARN: Code duplicated, block: B:185:0x036e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0377  */
    /* JADX WARN: Code duplicated, block: B:211:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:232:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // defpackage.qi0
    public void s(byte[] bArr, int i, int i2, ri0 ri0Var) {
        int i3;
        uj0 uj0VarB;
        String strTrim;
        int i4;
        String string;
        int i5;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        boolean z;
        un1 un1Var = this;
        cw1 cw1Var = (cw1) un1Var.g;
        cw1Var.z(i + i2, bArr);
        cw1Var.E(i);
        ArrayList arrayList = new ArrayList();
        try {
            int i6 = cw1Var.b;
            Charset charset = StandardCharsets.UTF_8;
            String strN = cw1Var.n(charset);
            String str = null;
            if (strN == null || !strN.startsWith("WEBVTT")) {
                cw1Var.E(i6);
                throw no0.a(null, "Expected WEBVTT. Got ".concat(String.valueOf(cw1Var.n(charset))));
            }
            while (!TextUtils.isEmpty(cw1Var.n(StandardCharsets.UTF_8))) {
                un1Var = this;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i7 = -1;
                boolean z2 = false;
                byte b = -1;
                int i8 = 0;
                while (true) {
                    i3 = 1;
                    if (b != -1) {
                        break;
                    }
                    i8 = cw1Var.b;
                    String strN2 = cw1Var.n(StandardCharsets.UTF_8);
                    if (strN2 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strN2)) {
                        b = 2;
                    } else {
                        b = strN2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                cw1Var.E(i8);
                if (b == 0) {
                    s90.D(new p83(arrayList2), ri0Var);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(cw1Var.n(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (b != 2) {
                        Pattern pattern = zj0.a;
                        Charset charset2 = StandardCharsets.UTF_8;
                        String strN3 = cw1Var.n(charset2);
                        if (strN3 == null) {
                            uj0VarB = null;
                        } else {
                            Pattern pattern2 = zj0.a;
                            Matcher matcher2 = pattern2.matcher(strN3);
                            if (matcher2.matches()) {
                                uj0VarB = zj0.b(null, matcher2, cw1Var, arrayList);
                            } else {
                                String strN4 = cw1Var.n(charset2);
                                if (strN4 != null) {
                                    Matcher matcher3 = pattern2.matcher(strN4);
                                    if (matcher3.matches()) {
                                        uj0VarB = zj0.b(strN3.trim(), matcher3, cw1Var, arrayList);
                                    } else {
                                        uj0VarB = null;
                                    }
                                } else {
                                    uj0VarB = null;
                                }
                            }
                        }
                        if (uj0VarB != null) {
                            arrayList2.add(uj0VarB);
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            j7.p("A style block was found after the first cue.");
                            return;
                        }
                        cw1Var.n(StandardCharsets.UTF_8);
                        sj0 sj0Var = (sj0) un1Var.h;
                        StringBuilder sb = sj0Var.b;
                        sb.setLength(0);
                        int i9 = cw1Var.b;
                        while (!TextUtils.isEmpty(cw1Var.n(StandardCharsets.UTF_8))) {
                        }
                        cw1 cw1Var2 = sj0Var.a;
                        cw1Var2.z(cw1Var.b, cw1Var.a);
                        cw1Var2.E(i9);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            sj0.a(cw1Var2);
                            if (cw1Var2.B() >= 5 && "::cue".equals(cw1Var2.k(5, StandardCharsets.UTF_8))) {
                                int i10 = cw1Var2.b;
                                String strB = sj0.b(cw1Var2, sb);
                                if (strB == null) {
                                    strTrim = str;
                                } else if ("{".equals(strB)) {
                                    cw1Var2.E(i10);
                                    strTrim = "";
                                } else {
                                    if ("(".equals(strB)) {
                                        int i11 = cw1Var2.b;
                                        int i12 = cw1Var2.c;
                                        int i13 = z2 ? 1 : 0;
                                        while (i11 < i12 && i13 == 0) {
                                            int i14 = i11 + 1;
                                            i13 = ((char) cw1Var2.a[i11]) == ')' ? i3 : z2 ? 1 : 0;
                                            i11 = i14;
                                        }
                                        strTrim = cw1Var2.k((i11 - 1) - cw1Var2.b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        strTrim = str;
                                    }
                                    if (!")".equals(sj0.b(cw1Var2, sb))) {
                                        strTrim = str;
                                    }
                                }
                            } else {
                                strTrim = str;
                            }
                            if (strTrim == null || !"{".equals(sj0.b(cw1Var2, sb))) {
                                break;
                            }
                            tj0 tj0Var = new tj0();
                            tj0Var.a = "";
                            tj0Var.b = "";
                            tj0Var.c = Collections.EMPTY_SET;
                            tj0Var.d = "";
                            tj0Var.e = str;
                            tj0Var.g = z2;
                            tj0Var.i = z2;
                            tj0Var.j = i7;
                            tj0Var.k = i7;
                            tj0Var.l = i7;
                            tj0Var.m = i7;
                            tj0Var.o = i7;
                            tj0Var.p = z2;
                            if (!strTrim.isEmpty()) {
                                int iIndexOf = strTrim.indexOf(91);
                                if (iIndexOf != i7) {
                                    Matcher matcher4 = sj0.c.matcher(strTrim.substring(iIndexOf));
                                    if (matcher4.matches()) {
                                        String strGroup2 = matcher4.group(i3);
                                        strGroup2.getClass();
                                        tj0Var.d = strGroup2;
                                    }
                                    strTrim = strTrim.substring(z2 ? 1 : 0, iIndexOf);
                                }
                                String str2 = qz1.a;
                                String[] strArrSplit = strTrim.split("\\.", i7);
                                String str3 = strArrSplit[z2 ? 1 : 0];
                                int iIndexOf2 = str3.indexOf(35);
                                if (iIndexOf2 != i7) {
                                    tj0Var.b = str3.substring(z2 ? 1 : 0, iIndexOf2);
                                    tj0Var.a = str3.substring(iIndexOf2 + 1);
                                } else {
                                    tj0Var.b = str3;
                                }
                                int length = strArrSplit.length;
                                if (length > i3) {
                                    tj0Var.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i3, length)));
                                }
                            }
                            ?? r9 = z2 ? 1 : 0;
                            String strB2 = str;
                            while (r9 == 0) {
                                int i15 = cw1Var2.b;
                                strB2 = sj0.b(cw1Var2, sb);
                                ?? r15 = (strB2 == null || "}".equals(strB2)) ? i3 : z2;
                                if (r15 == 0) {
                                    cw1Var2.E(i15);
                                    sj0.a(cw1Var2);
                                    String strC = sj0.c(cw1Var2, sb);
                                    if (!strC.isEmpty() && ":".equals(sj0.b(cw1Var2, sb))) {
                                        sj0.a(cw1Var2);
                                        StringBuilder sb2 = new StringBuilder();
                                        boolean z3 = false;
                                        while (true) {
                                            if (z3) {
                                                string = sb2.toString();
                                                break;
                                            }
                                            int i16 = cw1Var2.b;
                                            String strB3 = sj0.b(cw1Var2, sb);
                                            if (strB3 == null) {
                                                string = null;
                                                break;
                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                cw1Var2.E(i16);
                                                z3 = true;
                                            } else {
                                                sb2.append(strB3);
                                            }
                                        }
                                        if (string == null || string.isEmpty()) {
                                            i4 = 1;
                                        } else {
                                            int i17 = cw1Var2.b;
                                            String strB4 = sj0.b(cw1Var2, sb);
                                            if (";".equals(strB4)) {
                                                if ("color".equals(strC)) {
                                                    i5 = 1;
                                                    tj0Var.f = bm1.a(string, true);
                                                    tj0Var.g = true;
                                                } else {
                                                    i5 = 1;
                                                    if ("background-color".equals(strC)) {
                                                        tj0Var.h = bm1.a(string, true);
                                                        tj0Var.i = true;
                                                    } else if (!"ruby-position".equals(strC)) {
                                                        if ("text-combine-upright".equals(strC)) {
                                                            if ("all".equals(string)) {
                                                                z = true;
                                                            } else {
                                                                z = true;
                                                            }
                                                            tj0Var.p = z;
                                                        } else if ("text-decoration".equals(strC)) {
                                                            if ("underline".equals(string)) {
                                                                i5 = 1;
                                                                tj0Var.j = 1;
                                                            }
                                                        } else if ("font-family".equals(strC)) {
                                                            tj0Var.e = dq.v(string);
                                                        } else if ("font-weight".equals(strC)) {
                                                            i5 = 1;
                                                            if ("font-style".equals(strC)) {
                                                                if ("italic".equals(string)) {
                                                                    tj0Var.l = 1;
                                                                }
                                                            } else if ("font-size".equals(strC)) {
                                                                matcher = sj0.d.matcher(dq.v(string));
                                                                if (matcher.matches()) {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    iHashCode = strGroup.hashCode();
                                                                    if (iHashCode != 37) {
                                                                        if (iHashCode != 3240) {
                                                                            if (iHashCode != 3592) {
                                                                            }
                                                                        } else if (strGroup.equals("em")) {
                                                                            tj0Var.m = 2;
                                                                            i4 = 1;
                                                                        }
                                                                        j7.a();
                                                                        return;
                                                                    }
                                                                    if (strGroup.equals("%")) {
                                                                        j7.a();
                                                                        return;
                                                                    } else {
                                                                        tj0Var.m = 3;
                                                                        i4 = 1;
                                                                    }
                                                                    String strGroup3 = matcher.group(i4);
                                                                    strGroup3.getClass();
                                                                    tj0Var.n = Float.parseFloat(strGroup3);
                                                                } else {
                                                                    StringBuilder sb3 = new StringBuilder(string.length() + 22);
                                                                    sb3.append("Invalid font-size: '");
                                                                    sb3.append(string);
                                                                    sb3.append("'.");
                                                                    s90.Q("WebvttCssParser", sb3.toString());
                                                                }
                                                            }
                                                        } else if ("bold".equals(string)) {
                                                            i5 = 1;
                                                            tj0Var.k = 1;
                                                        }
                                                        i4 = 1;
                                                    } else if ("over".equals(string)) {
                                                        tj0Var.o = 1;
                                                    } else {
                                                        if ("under".equals(string)) {
                                                            tj0Var.o = 2;
                                                        }
                                                        i4 = 1;
                                                    }
                                                }
                                                i4 = i5;
                                            } else {
                                                if ("}".equals(strB4)) {
                                                    cw1Var2.E(i17);
                                                    if ("color".equals(strC)) {
                                                        i5 = 1;
                                                        tj0Var.f = bm1.a(string, true);
                                                        tj0Var.g = true;
                                                    } else {
                                                        i5 = 1;
                                                        if ("background-color".equals(strC)) {
                                                            tj0Var.h = bm1.a(string, true);
                                                            tj0Var.i = true;
                                                        } else if (!"ruby-position".equals(strC)) {
                                                            if ("over".equals(string)) {
                                                                tj0Var.o = 1;
                                                            } else if ("under".equals(string)) {
                                                                tj0Var.o = 2;
                                                            }
                                                        } else if ("text-combine-upright".equals(strC)) {
                                                            if ("all".equals(string) || string.startsWith("digits")) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            tj0Var.p = z;
                                                        } else if ("text-decoration".equals(strC)) {
                                                            if ("underline".equals(string)) {
                                                                i5 = 1;
                                                                tj0Var.j = 1;
                                                            }
                                                        } else if ("font-family".equals(strC)) {
                                                            tj0Var.e = dq.v(string);
                                                        } else if ("font-weight".equals(strC)) {
                                                            i5 = 1;
                                                            if ("font-style".equals(strC)) {
                                                                if ("italic".equals(string)) {
                                                                    tj0Var.l = 1;
                                                                }
                                                            } else if ("font-size".equals(strC)) {
                                                                matcher = sj0.d.matcher(dq.v(string));
                                                                if (matcher.matches()) {
                                                                    StringBuilder sb4 = new StringBuilder(string.length() + 22);
                                                                    sb4.append("Invalid font-size: '");
                                                                    sb4.append(string);
                                                                    sb4.append("'.");
                                                                    s90.Q("WebvttCssParser", sb4.toString());
                                                                } else {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    iHashCode = strGroup.hashCode();
                                                                    if (iHashCode != 37) {
                                                                        if (iHashCode != 3240) {
                                                                            if (iHashCode != 3592 && strGroup.equals("px")) {
                                                                                tj0Var.m = 1;
                                                                                i4 = 1;
                                                                            }
                                                                        } else if (strGroup.equals("em")) {
                                                                            tj0Var.m = 2;
                                                                            i4 = 1;
                                                                        }
                                                                        j7.a();
                                                                        return;
                                                                    }
                                                                    if (strGroup.equals("%")) {
                                                                        j7.a();
                                                                        return;
                                                                    } else {
                                                                        tj0Var.m = 3;
                                                                        i4 = 1;
                                                                    }
                                                                    String strGroup4 = matcher.group(i4);
                                                                    strGroup4.getClass();
                                                                    tj0Var.n = Float.parseFloat(strGroup4);
                                                                }
                                                            }
                                                        } else if ("bold".equals(string)) {
                                                            i5 = 1;
                                                            tj0Var.k = 1;
                                                        }
                                                    }
                                                    i4 = i5;
                                                }
                                                i4 = 1;
                                            }
                                        }
                                    } else {
                                        i4 = i3;
                                    }
                                } else {
                                    i4 = i3;
                                }
                                i3 = i4;
                                r9 = r15;
                                z2 = false;
                            }
                            int i18 = i3;
                            if ("}".equals(strB2)) {
                                arrayList3.add(tj0Var);
                            }
                            i3 = i18;
                            i7 = -1;
                            z2 = false;
                            str = null;
                        }
                        arrayList.addAll(arrayList3);
                    }
                    un1Var = this;
                    str = null;
                }
            }
        } catch (no0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public synchronized hp t(vg2 vg2Var, h42 h42Var, tj1 tj1Var) {
        r71 r71Var;
        this.h = tj1Var;
        if (tj1Var == null || (r71Var = (r71) vg2Var.g) == null) {
            return ((dr0) this.g).s(vg2Var, h42Var, tj1Var);
        }
        vi1 vi1VarA = tj1Var.a();
        return vi1VarA.c(vi1VarA.a(na1.t(r71Var)));
    }

    public void u(ss2 ss2Var) throws GeneralSecurityException {
        HashMap map = (HashMap) this.h;
        Class clsA = ss2Var.a();
        if (!map.containsKey(clsA)) {
            map.put(clsA, ss2Var);
            return;
        }
        ss2 ss2Var2 = (ss2) map.get(clsA);
        if (!ss2Var2.equals(ss2Var) || !ss2Var.equals(ss2Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsA.toString()));
        }
    }

    public boolean v(int i) {
        return ((cc3) this.g).a.get(i);
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 15:
                return;
            case 16:
                try {
                    q71 q71Var = (q71) this.h;
                    fu1 fu1VarS = a23.s(th);
                    zs0 zs0Var = new zs0(yd.v(th.getMessage()) ? fu1VarS.g : th.getMessage(), fu1VarS.f);
                    Parcel parcelU = q71Var.U();
                    kt0.c(parcelU, zs0Var);
                    q71Var.K0(parcelU, 2);
                    return;
                } catch (RemoteException e) {
                    jn.w("Service can't call client", e);
                    return;
                }
            default:
                dg3 dg3Var = (dg3) this.h;
                synchronized (dg3Var) {
                    dg3Var.j = null;
                    break;
                }
                return;
        }
    }

    @Override // defpackage.pz0
    /* JADX INFO: renamed from: l, reason: collision with other method in class */
    public JSONObject mo15l() {
        return ((np1) this.g).n();
    }

    private final void r(Throwable th) {
    }

    public /* synthetic */ un1(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.xm0
    /* JADX INFO: renamed from: a */
    public File mo2a() {
        if (((File) this.g) == null) {
            this.g = new File(((Context) this.h).getCacheDir(), "volley");
        }
        return (File) this.g;
    }

    public /* synthetic */ un1(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    @Override // defpackage.mw1
    public oe2 a() {
        tg0 tg0Var = (tg0) this.h;
        return new pg2((Context) this.g, new yh2(null, tg0Var.f, tg0Var.g, false, (us2) tg0Var.h));
    }

    public /* synthetic */ un1(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
    }

    public un1(dr0 dr0Var) {
        this.f = 19;
        this.g = dr0Var;
    }

    public un1(int i) {
        this.f = i;
        switch (i) {
            case 11:
                break;
            case 22:
                un1 un1Var = w40.w;
                this.g = new r52((r52) un1Var.g);
                this.h = Arrays.copyOf((long[]) un1Var.h, 10);
                break;
            case 23:
                this.g = new HashMap();
                this.h = new HashMap();
                break;
            default:
                this.g = new cw1();
                this.h = new sj0();
                break;
        }
    }

    @Override // defpackage.pz0
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo14a() {
        qk2 qk2Var = zo1.u;
        np1 np1Var = (np1) this.g;
        Map mapK = np1Var.k();
        if (mapK == null) {
            return;
        }
        int i = qk2Var.i;
        int i2 = 0;
        while (i2 < i) {
            Object obj = mapK.get((String) qk2Var.get(i2));
            i2++;
            if (obj != null) {
                np1Var.onClick((ViewGroup) this.h);
                return;
            }
        }
    }

    public un1(gd0 gd0Var) {
        this.f = 7;
        this.g = gd0Var;
        this.h = new AtomicBoolean(false);
    }

    public un1(Context context, int i) {
        this.f = i;
        switch (i) {
            case zw0.zzm /* 21 */:
                tg0 tg0Var = new tg0(5);
                this.g = context.getApplicationContext();
                this.h = tg0Var;
                break;
            default:
                this.h = context;
                this.g = null;
                break;
        }
    }

    public un1(uq1 uq1Var, String str, v11 v11Var) {
        this.f = 15;
        this.g = str;
        this.h = v11Var;
        Objects.requireNonNull(uq1Var);
    }

    public un1(pv1 pv1Var, q71 q71Var, j71 j71Var) {
        this.f = 16;
        this.h = q71Var;
        this.g = j71Var;
    }

    public un1(cc3 cc3Var, SparseArray sparseArray) {
        this.f = 25;
        this.g = cc3Var;
        SparseBooleanArray sparseBooleanArray = cc3Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iA = cc3Var.a(i);
            q93 q93Var = (q93) sparseArray.get(iA);
            q93Var.getClass();
            sparseArray2.append(iA, q93Var);
        }
        this.h = sparseArray2;
    }

    public /* synthetic */ un1(rs2 rs2Var) {
        this.f = 23;
        this.g = new HashMap(rs2Var.a);
        this.h = new HashMap(rs2Var.b);
    }

    public un1(az azVar) {
        this.f = 5;
        this.g = azVar;
        this.h = new z61(5, azVar);
    }

    public un1(ra raVar, String str, a23 a23Var) {
        this.f = 1;
        this.h = raVar;
        this.g = str;
    }

    public un1(ArrayList arrayList, ArrayList arrayList2) {
        this.f = 4;
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.g)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.h)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public un1(int i, int i2) {
        this.f = 4;
        this.g = new int[]{i, i2};
        this.h = new float[]{0.0f, 1.0f};
    }

    public un1(int i, int i2, int i3) {
        this.f = 4;
        this.g = new int[]{i, i2, i3};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }
}
