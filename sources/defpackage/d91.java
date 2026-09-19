package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d91 {
    public static final List l = Collections.synchronizedList(new ArrayList());
    public final n43 a;
    public final LinkedHashMap b;
    public final Context e;
    public boolean f;
    public final e91 g;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Object h = new Object();
    public final HashSet i = new HashSet();
    public boolean j = false;
    public boolean k = false;

    public d91(Context context, d60 d60Var, e91 e91Var, String str) {
        dq.g(e91Var, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = new LinkedHashMap();
        this.g = e91Var;
        Iterator it = e91Var.j.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        n43 n43VarC = s53.C();
        n43VarC.b();
        ((s53) n43VarC.g).N(9);
        if (str != null) {
            n43VarC.b();
            ((s53) n43VarC.g).D(str);
            n43VarC.b();
            ((s53) n43VarC.g).E(str);
        }
        o43 o43VarZ = p43.z();
        String str2 = this.g.f;
        if (str2 != null) {
            o43VarZ.b();
            ((p43) o43VarZ.g).A(str2);
        }
        p43 p43Var = (p43) o43VarZ.c();
        n43VarC.b();
        ((s53) n43VarC.g).F(p43Var);
        l53 l53VarZ = m53.z();
        boolean zE = q90.a(this.e).e();
        l53VarZ.b();
        ((m53) l53VarZ.g).C(zE);
        String str3 = d60Var.f;
        if (str3 != null) {
            l53VarZ.b();
            ((m53) l53VarZ.g).A(str3);
        }
        am amVar = am.b;
        Context context2 = this.e;
        amVar.getClass();
        long jA = am.a(context2);
        if (jA > 0) {
            l53VarZ.b();
            ((m53) l53VarZ.g).B(jA);
        }
        m53 m53Var = (m53) l53VarZ.c();
        n43VarC.b();
        ((s53) n43VarC.g).K(m53Var);
        this.a = n43VarC;
    }

    public final void a(String str) {
        synchronized (this.h) {
            n43 n43Var = this.a;
            try {
                if (str == null) {
                    n43Var.b();
                    ((s53) n43Var.g).I();
                } else {
                    n43Var.b();
                    ((s53) n43Var.g).H(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, Map map, int i) {
        synchronized (this.h) {
            int i2 = 1;
            if (i == 3) {
                try {
                    this.k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    j53 j53Var = (j53) linkedHashMap.get(str);
                    j53Var.b();
                    ((k53) j53Var.g).G(4);
                }
                return;
            }
            j53 j53VarB = k53.B();
            if (i != 0) {
                if (i == 1) {
                    i2 = 2;
                } else if (i != 2) {
                    i2 = i != 3 ? 0 : 4;
                } else {
                    i2 = 3;
                }
            }
            if (i2 != 0) {
                j53VarB.b();
                ((k53) j53VarB.g).G(i2);
            }
            int size = linkedHashMap.size();
            j53VarB.b();
            ((k53) j53VarB.g).C(size);
            j53VarB.b();
            ((k53) j53VarB.g).D(str);
            x43 x43VarZ = z43.z();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        v43 v43VarZ = w43.z();
                        Charset charset = m23.a;
                        l13 l13Var = new l13(str2.getBytes(charset));
                        v43VarZ.b();
                        ((w43) v43VarZ.g).A(l13Var);
                        l13 l13Var2 = new l13(str3.getBytes(charset));
                        v43VarZ.b();
                        ((w43) v43VarZ.g).B(l13Var2);
                        w43 w43Var = (w43) v43VarZ.c();
                        x43VarZ.b();
                        ((z43) x43VarZ.g).A(w43Var);
                    }
                }
            }
            z43 z43Var = (z43) x43VarZ.c();
            j53VarB.b();
            ((k53) j53VarB.g).E(z43Var);
            linkedHashMap.put(str, j53VarB);
        }
    }
}
