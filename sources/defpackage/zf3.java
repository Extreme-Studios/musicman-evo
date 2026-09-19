package defpackage;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class zf3 {
    public static final kj2 k = new kj2();
    public b83 a;
    public kg3 b;
    public final Object c;
    public final Context d;
    public sf3 e;
    public Thread f;
    public md g;
    public qk1 h;
    public Boolean i;
    public final r53 j;

    public zf3(Context context) {
        r53 r53Var = new r53(29, (byte) 0);
        sf3 sf3Var = sf3.F;
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.j = r53Var;
        if (sf3Var != null) {
            this.e = sf3Var;
        } else {
            rf3 rf3Var = new rf3(sf3Var);
            rf3Var.a(sf3Var);
            this.e = new sf3(rf3Var);
        }
        this.h = qk1.b;
        if (this.e.A && context == null) {
            s90.Q("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int d(de3 de3Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(de3Var.d)) {
            return 4;
        }
        String strC = c(str);
        String strC2 = c(de3Var.d);
        if (strC2 == null || strC == null) {
            return (z && strC2 == null) ? 1 : 0;
        }
        if (strC2.startsWith(strC) || strC.startsWith(strC2)) {
            return 3;
        }
        String str2 = qz1.a;
        return strC2.split("-", 2)[0].equals(strC.split("-", 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int e(de3 de3Var, vj2 vj2Var) {
        for (int i = 0; i < vj2Var.size(); i++) {
            int i2 = 0;
            while (true) {
                vj2 vj2Var2 = de3Var.c;
                if (i2 < vj2Var2.size()) {
                    if (((jf3) vj2Var2.get(i2)).b.equals(vj2Var.get(i))) {
                        return i;
                    }
                    i2++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static final Pair g(int i, cg3 cg3Var, int[][][] iArr, vf3 vf3Var, Comparator comparator) {
        RandomAccess randomAccessI;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == cg3Var.a[i2]) {
                gf3 gf3Var = cg3Var.b[i2];
                for (int i3 = 0; i3 < gf3Var.a; i3++) {
                    cy0 cy0VarA = gf3Var.a(i3);
                    qk2 qk2VarC = vf3Var.c(i2, cy0VarA, iArr[i2][i3]);
                    int i4 = cy0VarA.a;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        xf3 xf3Var = (xf3) qk2VarC.get(i5);
                        int iA = xf3Var.a();
                        if (!zArr[i5] && iA != 0) {
                            if (iA == 1) {
                                randomAccessI = vj2.i(xf3Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(xf3Var);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    xf3 xf3Var2 = (xf3) qk2VarC.get(i7);
                                    if (xf3Var2.a() == 2 && xf3Var.b(xf3Var2)) {
                                        arrayList2.add(xf3Var2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccessI = arrayList2;
                            }
                            arrayList.add(randomAccessI);
                        }
                        i5 = i6;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((xf3) list.get(i8)).h;
        }
        xf3 xf3Var3 = (xf3) list.get(0);
        return Pair.create(new ag3(xf3Var3.g, iArr2), Integer.valueOf(xf3Var3.f));
    }

    public final void a() {
        md mdVar;
        tf3 tf3Var;
        Handler handler;
        synchronized (this.c) {
            try {
                Thread thread = this.f;
                if (thread != null) {
                    hn.N("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (mdVar = this.g) != null) {
            Spatializer spatializer = (Spatializer) mdVar.g;
            if (spatializer != null && (tf3Var = (tf3) mdVar.i) != null && (handler = (Handler) mdVar.h) != null) {
                spatializer.removeOnSpatializerStateChangedListener(tf3Var);
                handler.removeCallbacksAndMessages(null);
            }
            this.g = null;
        }
        this.a = null;
        this.b = null;
    }

    public final void b(qk1 qk1Var) {
        if (this.h.equals(qk1Var)) {
            return;
        }
        this.h = qk1Var;
        f();
    }

    public final void f() {
        boolean z;
        b83 b83Var;
        md mdVar;
        synchronized (this.c) {
            try {
                z = false;
                if (this.e.A && Build.VERSION.SDK_INT >= 32 && (mdVar = this.g) != null && mdVar.f) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (b83Var = this.a) == null) {
            return;
        }
        b83Var.m.b(10);
    }
}
