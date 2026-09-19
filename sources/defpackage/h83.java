package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class h83 {
    public final xd3 a;
    public final Object b;
    public final af3[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public i83 g;
    public boolean h;
    public final boolean[] i;
    public final yc3[] j;
    public final zf3 k;
    public final c00 l;
    public h83 m;
    public gf3 n;
    public dg3 o;
    public long p;

    public h83(yc3[] yc3VarArr, long j, zf3 zf3Var, fg3 fg3Var, c00 c00Var, i83 i83Var, dg3 dg3Var) {
        this.j = yc3VarArr;
        this.p = j;
        this.k = zf3Var;
        this.l = c00Var;
        yd3 yd3Var = i83Var.a;
        this.b = yd3Var.a;
        this.g = i83Var;
        this.n = gf3.d;
        this.o = dg3Var;
        this.c = new af3[2];
        this.i = new boolean[2];
        long j2 = i83Var.b;
        long j3 = i83Var.d;
        c00Var.getClass();
        int i = y83.k;
        Pair pair = (Pair) yd3Var.a;
        Object obj = pair.first;
        yd3 yd3VarA = yd3Var.a(pair.second);
        s83 s83Var = (s83) ((HashMap) c00Var.j).get(obj);
        s83Var.getClass();
        ((HashSet) c00Var.m).add(s83Var);
        r83 r83Var = (r83) ((HashMap) c00Var.l).get(s83Var);
        if (r83Var != null) {
            r83Var.a.o(r83Var.b);
        }
        s83Var.c.add(yd3VarA);
        rd3 rd3VarC = s83Var.a.c(yd3VarA, fg3Var, j2);
        ((IdentityHashMap) c00Var.i).put(rd3VarC, s83Var);
        c00Var.m();
        this.a = j3 != -9223372036854775807L ? new fd3(rd3VarC, j3) : rd3VarC;
    }

    public final long a() {
        return this.g.b + this.p;
    }

    public final boolean b() {
        if (this.e) {
            return !this.f || this.a.j() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.e) {
            return b() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long j = this.f ? this.a.j() : Long.MIN_VALUE;
        return j == Long.MIN_VALUE ? this.g.e : j;
    }

    public final void e(ox0 ox0Var) {
        this.e = true;
        this.n = this.a.l();
        dg3 dg3VarF = f(ox0Var);
        i83 i83Var = this.g;
        long jMax = i83Var.b;
        long j = i83Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jG = g(dg3VarF, jMax, false, new boolean[2]);
        long j2 = this.p;
        i83 i83Var2 = this.g;
        this.p = (i83Var2.b - jG) + j2;
        this.g = i83Var2.a(jG);
    }

    public final dg3 f(ox0 ox0Var) {
        sf3 sf3Var;
        boolean z;
        String str;
        int i;
        Point point;
        String languageTag;
        int i2;
        long j;
        Pair pairCreate;
        int[] iArr;
        int length;
        mf3 mf3Var;
        long j2;
        long[][] jArr;
        int[] iArr2;
        Object obj;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        ag3[] ag3VarArr;
        int i5;
        ag3[] ag3VarArr2;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Point point2;
        Point point3;
        Context context3;
        int[] iArr3;
        gf3 gf3Var = this.n;
        zf3 zf3Var = this.k;
        yc3[] yc3VarArr = this.j;
        zf3Var.getClass();
        int[] iArr4 = new int[3];
        cy0[][] cy0VarArr = new cy0[3][];
        int[][][] iArr5 = new int[3][][];
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = gf3Var.a;
            cy0VarArr[i6] = new cy0[i7];
            iArr5[i6] = new int[i7][];
        }
        int i8 = 2;
        int[] iArr6 = new int[2];
        for (int i9 = 0; i9 < 2; i9++) {
            yc3VarArr[i9].getClass();
            iArr6[i9] = 8;
        }
        int i10 = 0;
        while (i10 < gf3Var.a) {
            cy0 cy0VarA = gf3Var.a(i10);
            int i11 = cy0VarA.c;
            de3[] de3VarArr = cy0VarA.d;
            int i12 = cy0VarA.a;
            int i13 = i8;
            int i14 = 0;
            int i15 = 0;
            boolean z4 = true;
            while (i14 < i8) {
                yc3 yc3Var = yc3VarArr[i14];
                yc3[] yc3VarArr2 = yc3VarArr;
                gf3 gf3Var2 = gf3Var;
                int i16 = 0;
                int iMax = 0;
                while (i16 < i12) {
                    int i17 = i16;
                    iMax = Math.max(iMax, yc3Var.J(de3VarArr[i17]) & 7);
                    i16 = i17 + 1;
                }
                boolean z5 = iArr4[i14] == 0;
                if (iMax > i15) {
                    z4 = z5;
                    i15 = iMax;
                    i13 = i14;
                } else if (iMax == i15 && i11 == 5 && !z4 && z5) {
                    i15 = iMax;
                    i13 = i14;
                    z4 = true;
                }
                i14++;
                gf3Var = gf3Var2;
                yc3VarArr = yc3VarArr2;
                i8 = 2;
            }
            yc3[] yc3VarArr3 = yc3VarArr;
            gf3 gf3Var3 = gf3Var;
            if (i13 == i8) {
                iArr3 = new int[i12];
            } else {
                yc3 yc3Var2 = yc3VarArr3[i13];
                int[] iArr7 = new int[i12];
                for (int i18 = 0; i18 < i12; i18++) {
                    iArr7[i18] = yc3Var2.J(de3VarArr[i18]);
                }
                iArr3 = iArr7;
            }
            int i19 = iArr4[i13];
            cy0VarArr[i13][i19] = cy0VarA;
            iArr5[i13][i19] = iArr3;
            iArr4[i13] = i19 + 1;
            i10++;
            gf3Var = gf3Var3;
            yc3VarArr = yc3VarArr3;
            i8 = 2;
        }
        yc3[] yc3VarArr4 = yc3VarArr;
        int i20 = i8;
        gf3[] gf3VarArr = new gf3[i20];
        String[] strArr = new String[i20];
        int[] iArr8 = new int[i20];
        int i21 = 0;
        while (i21 < i20) {
            int i22 = iArr4[i21];
            gf3VarArr[i21] = new gf3((cy0[]) qz1.m(cy0VarArr[i21], i22));
            iArr5[i21] = (int[][]) qz1.m(iArr5[i21], i22);
            strArr[i21] = yc3VarArr4[i21].o();
            iArr8[i21] = yc3VarArr4[i21].g;
            i21++;
            i20 = 2;
        }
        int i23 = i20;
        cg3 cg3Var = new cg3(iArr8, gf3VarArr, iArr6, iArr5, new gf3((cy0[]) qz1.m(cy0VarArr[i23], iArr4[i23])));
        synchronized (zf3Var.c) {
            zf3Var.f = Thread.currentThread();
            sf3Var = zf3Var.e;
        }
        if (zf3Var.i == null && (context3 = zf3Var.d) != null) {
            zf3Var.i = Boolean.valueOf(qz1.h(context3));
        }
        if (sf3Var.A && Build.VERSION.SDK_INT >= 32 && zf3Var.g == null) {
            zf3Var.g = new md(zf3Var.d, zf3Var, zf3Var.i);
        }
        int i24 = 2;
        ag3[] ag3VarArr3 = new ag3[2];
        int i25 = 0;
        while (true) {
            if (i25 >= i24) {
                z = false;
                break;
            }
            if (cg3Var.a[i25] == i24 && cg3Var.b[i25].a > 0) {
                z = true;
                break;
            }
            i25++;
            i24 = 2;
        }
        Pair pairG = zf3.g(1, cg3Var, iArr5, new md(zf3Var, sf3Var, z, iArr6), ts.k);
        if (pairG != null) {
            ag3VarArr3[((Integer) pairG.second).intValue()] = (ag3) pairG.first;
        }
        if (pairG == null) {
            str = null;
        } else {
            ag3 ag3Var = (ag3) pairG.first;
            str = ag3Var.a.d[ag3Var.b[0]].d;
        }
        sf3Var.q.getClass();
        if (!sf3Var.g || (context2 = zf3Var.d) == null) {
            i = 1;
            point = null;
        } else {
            String str2 = qz1.a;
            DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                windowManager.getClass();
                display = windowManager.getDefaultDisplay();
            }
            if (display.getDisplayId() == 0 && qz1.h(context2)) {
                String strL = Build.VERSION.SDK_INT < 28 ? qz1.l("sys.display-size") : qz1.l("vendor.display-size");
                if (TextUtils.isEmpty(strL)) {
                    i = 1;
                } else {
                    try {
                        String[] strArrSplit = strL.trim().split("x", -1);
                        if (strArrSplit.length == 2) {
                            int i26 = Integer.parseInt(strArrSplit[0]);
                            i = 1;
                            try {
                                int i27 = Integer.parseInt(strArrSplit[1]);
                                if (i26 > 0 && i27 > 0) {
                                    point3 = new Point(i26, i27);
                                }
                            } catch (NumberFormatException unused) {
                            }
                            point = point3;
                        } else {
                            i = 1;
                        }
                    } catch (NumberFormatException unused2) {
                    }
                    s90.Y("Util", "Invalid display size: ".concat(String.valueOf(strL)));
                }
                if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context2.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point2 = new Point(3840, 2160);
                }
                point3 = point2;
                point = point3;
            } else {
                i = 1;
            }
            point2 = new Point();
            Display.Mode mode = display.getMode();
            point2.x = mode.getPhysicalWidth();
            point2.y = mode.getPhysicalHeight();
            point3 = point2;
            point = point3;
        }
        int i28 = i;
        Pair pairG2 = zf3.g(2, cg3Var, iArr5, new u40(sf3Var, str, iArr6, point, 24, false), ts.n);
        int i29 = 4;
        Pair pairG3 = pairG2 == null ? zf3.g(4, cg3Var, iArr5, new rz1(14, sf3Var), ts.l) : null;
        if (pairG3 != null) {
            ag3VarArr3[((Integer) pairG3.second).intValue()] = (ag3) pairG3.first;
        } else if (pairG2 != null) {
            ag3VarArr3[((Integer) pairG2.second).intValue()] = (ag3) pairG2.first;
        }
        if (!sf3Var.t || (context = zf3Var.d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str3 = qz1.a;
            languageTag = locale.toLanguageTag();
        }
        Pair pairG4 = zf3.g(3, cg3Var, iArr5, new dy2(sf3Var, str, languageTag), ts.m);
        if (pairG4 != null) {
            ag3VarArr3[((Integer) pairG4.second).intValue()] = (ag3) pairG4.first;
        }
        int i30 = 0;
        while (i30 < 2) {
            int i31 = cg3Var.a[i30];
            if (i31 == 2 || i31 == i28 || i31 == 3 || i31 == i29) {
                i4 = i30;
                ag3VarArr = ag3VarArr3;
            } else {
                gf3 gf3Var4 = cg3Var.b[i30];
                int[][] iArr9 = iArr5[i30];
                cy0 cy0Var = null;
                int i32 = 0;
                int i33 = 0;
                qf3 qf3Var = null;
                while (i32 < gf3Var4.a) {
                    cy0 cy0VarA2 = gf3Var4.a(i32);
                    int[] iArr10 = iArr9[i32];
                    qf3 qf3Var2 = qf3Var;
                    int i34 = i33;
                    cy0 cy0Var2 = cy0Var;
                    int i35 = 0;
                    while (i35 < cy0VarA2.a) {
                        if (yc3.I(iArr10[i35], sf3Var.B)) {
                            i5 = i30;
                            qf3 qf3Var3 = new qf3(cy0VarA2.d[i35], iArr10[i35]);
                            if (qf3Var2 != null) {
                                ag3VarArr2 = ag3VarArr3;
                                if (nj2.a.d(qf3Var3.g, qf3Var2.g).d(qf3Var3.f, qf3Var2.f).e() > 0) {
                                }
                            } else {
                                ag3VarArr2 = ag3VarArr3;
                            }
                            cy0Var2 = cy0VarA2;
                            qf3Var2 = qf3Var3;
                            i34 = i35;
                        } else {
                            i5 = i30;
                            ag3VarArr2 = ag3VarArr3;
                        }
                        i35++;
                        i30 = i5;
                        ag3VarArr3 = ag3VarArr2;
                    }
                    i32++;
                    cy0Var = cy0Var2;
                    i33 = i34;
                    qf3Var = qf3Var2;
                }
                i4 = i30;
                ag3VarArr = ag3VarArr3;
                ag3VarArr[i4] = cy0Var == null ? null : new ag3(cy0Var, new int[]{i33});
            }
            i30 = i4 + 1;
            ag3VarArr3 = ag3VarArr;
            i28 = 1;
            i29 = 4;
        }
        ag3[] ag3VarArr4 = ag3VarArr3;
        Object obj2 = null;
        HashMap map = new HashMap();
        int i36 = 0;
        loop11: while (true) {
            if (i36 >= 2) {
                gf3 gf3Var5 = cg3Var.d;
                int i37 = 0;
                while (true) {
                    if (i37 >= gf3Var5.a) {
                        int i38 = 0;
                        while (true) {
                            int i39 = 2;
                            if (i38 >= 2) {
                                int i40 = 0;
                                while (true) {
                                    if (i40 >= i39) {
                                        int i41 = 0;
                                        while (i41 < i39) {
                                            int i42 = cg3Var.a[i41];
                                            if (sf3Var.E.get(i41) || sf3Var.v.contains(Integer.valueOf(i42))) {
                                                ag3VarArr4[i41] = null;
                                            }
                                            i41++;
                                            i39 = 2;
                                        }
                                        r53 r53Var = zf3Var.j;
                                        zf3Var.b.getClass();
                                        ArrayList arrayList = new ArrayList();
                                        int i43 = 0;
                                        while (true) {
                                            i2 = 2;
                                            if (i43 >= 2) {
                                                break;
                                            }
                                            ag3 ag3Var2 = ag3VarArr4[i43];
                                            if (ag3Var2 == null || ag3Var2.b.length <= 1) {
                                                obj = obj2;
                                                arrayList.add(obj);
                                            } else {
                                                tj2 tj2Var = vj2.g;
                                                sj2 sj2Var = new sj2(4);
                                                sj2Var.a(new lf3(0L, 0L));
                                                arrayList.add(sj2Var);
                                                obj = obj2;
                                            }
                                            i43++;
                                            obj2 = obj;
                                        }
                                        long[][] jArr2 = new long[2][];
                                        int i44 = 0;
                                        while (true) {
                                            j = -1;
                                            if (i44 >= i2) {
                                                break;
                                            }
                                            ag3 ag3Var3 = ag3VarArr4[i44];
                                            if (ag3Var3 == null) {
                                                jArr2[i44] = new long[0];
                                            } else {
                                                int[] iArr11 = ag3Var3.b;
                                                jArr2[i44] = new long[iArr11.length];
                                                for (int i45 = 0; i45 < iArr11.length; i45++) {
                                                    long j3 = ag3Var3.a.d[iArr11[i45]].i;
                                                    long[] jArr3 = jArr2[i44];
                                                    if (j3 == -1) {
                                                        j3 = 0;
                                                    }
                                                    jArr3[i45] = j3;
                                                }
                                                Arrays.sort(jArr2[i44]);
                                            }
                                            i44++;
                                            i2 = 2;
                                        }
                                        int[] iArr12 = new int[i2];
                                        long[] jArr4 = new long[i2];
                                        int i46 = 0;
                                        while (i46 < i2) {
                                            long[] jArr5 = jArr2[i46];
                                            jArr4[i46] = jArr5.length == 0 ? 0L : jArr5[0];
                                            i46++;
                                            i2 = 2;
                                        }
                                        mf3.c(arrayList, jArr4);
                                        nk2 nk2Var = new nk2(new TreeMap(ok2.g), new o8());
                                        int i47 = 0;
                                        while (i47 < 2) {
                                            int length2 = jArr2[i47].length;
                                            if (length2 <= 1) {
                                                iArr2 = iArr12;
                                                j2 = j;
                                                jArr = jArr2;
                                            } else {
                                                double[] dArr = new double[length2];
                                                j2 = j;
                                                int i48 = 0;
                                                while (true) {
                                                    long[] jArr6 = jArr2[i47];
                                                    double dLog = 0.0d;
                                                    if (i48 >= jArr6.length) {
                                                        break;
                                                    }
                                                    long[][] jArr7 = jArr2;
                                                    int[] iArr13 = iArr12;
                                                    long j4 = jArr6[i48];
                                                    if (j4 != j2) {
                                                        dLog = Math.log(j4);
                                                    }
                                                    dArr[i48] = dLog;
                                                    i48++;
                                                    jArr2 = jArr7;
                                                    iArr12 = iArr13;
                                                }
                                                jArr = jArr2;
                                                iArr2 = iArr12;
                                                int i49 = length2 - 1;
                                                double d = dArr[i49] - dArr[0];
                                                int i50 = 0;
                                                while (i50 < i49) {
                                                    double d2 = dArr[i50];
                                                    i50++;
                                                    Double dValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i50]) * 0.5d) - dArr[0]) / d);
                                                    r53 r53Var2 = r53Var;
                                                    Integer numValueOf = Integer.valueOf(i47);
                                                    double d3 = d;
                                                    Map map2 = nk2Var.i;
                                                    Collection collection = (Collection) map2.get(dValueOf);
                                                    if (collection == null) {
                                                        List list = (List) nk2Var.k.a();
                                                        if (!list.add(numValueOf)) {
                                                            throw new AssertionError("New Collection violated the Collection spec");
                                                        }
                                                        nk2Var.j++;
                                                        map2.put(dValueOf, list);
                                                    } else if (collection.add(numValueOf)) {
                                                        nk2Var.j++;
                                                    }
                                                    r53Var = r53Var2;
                                                    d = d3;
                                                }
                                            }
                                            i47++;
                                            jArr2 = jArr;
                                            iArr12 = iArr2;
                                            r53Var = r53Var;
                                            j = j2;
                                        }
                                        r53 r53Var3 = r53Var;
                                        long[][] jArr8 = jArr2;
                                        int[] iArr14 = iArr12;
                                        Collection collectionA = nk2Var.g;
                                        if (collectionA == null) {
                                            collectionA = nk2Var.a();
                                            nk2Var.g = collectionA;
                                        }
                                        vj2 vj2VarM = vj2.m(collectionA);
                                        for (int i51 = 0; i51 < vj2VarM.size(); i51++) {
                                            int iIntValue = ((Integer) vj2VarM.get(i51)).intValue();
                                            int i52 = iArr14[iIntValue] + 1;
                                            iArr14[iIntValue] = i52;
                                            jArr4[iIntValue] = jArr8[iIntValue][i52];
                                            mf3.c(arrayList, jArr4);
                                        }
                                        for (int i53 = 0; i53 < 2; i53++) {
                                            if (arrayList.get(i53) != null) {
                                                long j5 = jArr4[i53];
                                                jArr4[i53] = j5 + j5;
                                            }
                                        }
                                        mf3.c(arrayList, jArr4);
                                        w40.k0("initialCapacity", 4);
                                        Object[] objArrCopyOf = new Object[4];
                                        int i54 = 0;
                                        int i55 = 0;
                                        while (i54 < arrayList.size()) {
                                            sj2 sj2Var2 = (sj2) arrayList.get(i54);
                                            qk2 qk2VarF = sj2Var2 == null ? qk2.j : sj2Var2.f();
                                            qk2VarF.getClass();
                                            int length3 = objArrCopyOf.length;
                                            int i56 = i55 + 1;
                                            int iD = pj2.d(length3, i56);
                                            if (iD > length3) {
                                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                                            }
                                            objArrCopyOf[i55] = qk2VarF;
                                            i54++;
                                            i55 = i56;
                                        }
                                        qk2 qk2VarO = vj2.o(objArrCopyOf, i55);
                                        int i57 = 2;
                                        bg3[] bg3VarArr = new bg3[2];
                                        int i58 = 0;
                                        while (i58 < i57) {
                                            ag3 ag3Var4 = ag3VarArr4[i58];
                                            if (ag3Var4 != null && (length = (iArr = ag3Var4.b).length) != 0) {
                                                cy0 cy0Var3 = ag3Var4.a;
                                                if (length == 1) {
                                                    mf3Var = new mf3(cy0Var3, new int[]{iArr[0]});
                                                } else {
                                                    vj2 vj2Var = (vj2) qk2VarO.get(i58);
                                                    r53Var3.getClass();
                                                    mf3 mf3Var2 = new mf3(cy0Var3, iArr);
                                                    vj2.m(vj2Var);
                                                    mf3Var = mf3Var2;
                                                }
                                                bg3VarArr[i58] = mf3Var;
                                            }
                                            i58++;
                                            i57 = 2;
                                        }
                                        z83[] z83VarArr = new z83[i57];
                                        int i59 = 0;
                                        while (i59 < i57) {
                                            z83VarArr[i59] = (sf3Var.E.get(i59) || sf3Var.v.contains(Integer.valueOf(cg3Var.a[i59])) || (cg3Var.a[i59] != -2 && bg3VarArr[i59] == null)) ? null : z83.a;
                                            i59++;
                                            i57 = 2;
                                        }
                                        pairCreate = Pair.create(z83VarArr, bg3VarArr);
                                        break;
                                    }
                                    gf3 gf3Var6 = cg3Var.b[i40];
                                    Map map3 = (Map) sf3Var.D.get(i40);
                                    if (map3 != null && map3.containsKey(gf3Var6)) {
                                        Map map4 = (Map) sf3Var.D.get(i40);
                                        if (map4 == null || map4.get(gf3Var6) == null) {
                                            ag3VarArr4[i40] = null;
                                        } else {
                                            j7.j();
                                        }
                                    }
                                    i40++;
                                    i39 = 2;
                                }
                            } else if (map.get(Integer.valueOf(cg3Var.a[i38])) == null) {
                                i38++;
                            } else {
                                j7.j();
                            }
                        }
                    } else if (sf3Var.u.get(gf3Var5.a(i37)) == null) {
                        i37++;
                    } else {
                        j7.j();
                    }
                }
            } else {
                gf3 gf3Var7 = cg3Var.b[i36];
                int i60 = 0;
                while (true) {
                    if (i60 >= gf3Var7.a) {
                        i36++;
                    } else if (sf3Var.u.get(gf3Var7.a(i60)) == null) {
                        i60++;
                    } else {
                        j7.j();
                    }
                }
            }
            pairCreate = null;
            break;
        }
        bg3[] bg3VarArr2 = (bg3[]) pairCreate.second;
        List[] listArr = new List[bg3VarArr2.length];
        for (int i61 = 0; i61 < bg3VarArr2.length; i61++) {
            bg3 bg3Var = bg3VarArr2[i61];
            listArr[i61] = bg3Var != null ? vj2.i(bg3Var) : qk2.j;
        }
        sj2 sj2Var3 = new sj2(4);
        for (int i62 = 0; i62 < 2; i62++) {
            gf3 gf3Var8 = gf3VarArr[i62];
            List list2 = listArr[i62];
            int i63 = 0;
            while (i63 < gf3Var8.a) {
                cy0 cy0VarA3 = gf3Var8.a(i63);
                int i64 = gf3VarArr[i62].a(i63).a;
                int[] iArr15 = new int[i64];
                int i65 = 0;
                int i66 = 0;
                while (i65 < i64) {
                    List[] listArr2 = listArr;
                    if ((iArr5[i62][i63][i65] & 7) == 4) {
                        iArr15[i66] = i65;
                        i66++;
                    }
                    i65++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr15, i66);
                gf3 gf3Var9 = gf3Var8;
                int iMin = 16;
                String str4 = null;
                int i67 = 0;
                boolean z6 = false;
                int i68 = 0;
                while (i67 < iArrCopyOf.length) {
                    String str5 = gf3VarArr[i62].a(i63).d[iArrCopyOf[i67]].m;
                    int i69 = i68 + 1;
                    if (i68 == 0) {
                        str4 = str5;
                    } else {
                        z6 = (!Objects.equals(str4, str5)) | z6;
                    }
                    iMin = Math.min(iMin, iArr5[i62][i63][i67] & 24);
                    i67++;
                    i68 = i69;
                }
                if (z6) {
                    iMin = Math.min(iMin, cg3Var.c[i62]);
                }
                boolean z7 = iMin != 0;
                int i70 = cy0VarA3.a;
                int[] iArr16 = new int[i70];
                boolean[] zArr = new boolean[i70];
                int i71 = 0;
                while (i71 < i70) {
                    iArr16[i71] = iArr5[i62][i63][i71] & 7;
                    int i72 = 0;
                    while (true) {
                        if (i72 >= list2.size()) {
                            i3 = i70;
                            z3 = false;
                            break;
                        }
                        bg3 bg3Var2 = (bg3) list2.get(i72);
                        i3 = i70;
                        if (bg3Var2.a().equals(cy0VarA3) && bg3Var2.m0(i71) != -1) {
                            z3 = true;
                            break;
                        }
                        i72++;
                        i70 = i3;
                    }
                    zArr[i71] = z3;
                    i71++;
                    i70 = i3;
                }
                sj2Var3.a(new z11(cy0VarA3, z7, iArr16, zArr));
                i63++;
                gf3Var8 = gf3Var9;
                listArr = listArr3;
            }
        }
        gf3 gf3Var10 = cg3Var.d;
        for (int i73 = 0; i73 < gf3Var10.a; i73++) {
            cy0 cy0VarA4 = gf3Var10.a(i73);
            int i74 = cy0VarA4.a;
            int[] iArr17 = new int[i74];
            Arrays.fill(iArr17, 0);
            sj2Var3.a(new z11(cy0VarA4, false, iArr17, new boolean[i74]));
        }
        dg3 dg3Var = new dg3((z83[]) pairCreate.first, (bg3[]) pairCreate.second, new l21(sj2Var3.f()), cg3Var);
        bg3[] bg3VarArr3 = (bg3[]) dg3Var.h;
        for (int i75 = 0; i75 < dg3Var.f; i75++) {
            if (dg3Var.a(i75)) {
                if (bg3VarArr3[i75] == null) {
                    yc3VarArr4[i75].getClass();
                    z2 = false;
                } else {
                    z2 = true;
                }
                hn.M(z2);
            } else {
                hn.M(bg3VarArr3[i75] == null);
            }
        }
        for (bg3 bg3Var3 : bg3VarArr3) {
        }
        return dg3Var;
    }

    public final long g(dg3 dg3Var, long j, boolean z, boolean[] zArr) {
        yc3[] yc3VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= dg3Var.f) {
                break;
            }
            if (z || !dg3Var.b(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            yc3VarArr = this.j;
            if (i2 >= 2) {
                break;
            }
            yc3VarArr[i2].getClass();
            i2++;
        }
        l();
        this.o = dg3Var;
        if (this.m == null) {
            int i3 = 0;
            while (true) {
                dg3 dg3Var2 = this.o;
                if (i3 >= dg3Var2.f) {
                    break;
                }
                dg3Var2.a(i3);
                bg3 bg3Var = ((bg3[]) this.o.h)[i3];
                i3++;
            }
        }
        bg3[] bg3VarArr = (bg3[]) dg3Var.h;
        xd3 xd3Var = this.a;
        boolean[] zArr2 = this.i;
        af3[] af3VarArr = this.c;
        long jM = xd3Var.m(bg3VarArr, zArr2, af3VarArr, zArr, j);
        for (int i4 = 0; i4 < 2; i4++) {
            yc3VarArr[i4].getClass();
        }
        this.f = false;
        for (int i5 = 0; i5 < 2; i5++) {
            if (af3VarArr[i5] != null) {
                hn.M(dg3Var.a(i5));
                yc3VarArr[i5].getClass();
                this.f = true;
            } else {
                hn.M(bg3VarArr[i5] == null);
            }
        }
        return jM;
    }

    public final void h() {
        l();
        xd3 xd3Var = this.a;
        try {
            boolean z = xd3Var instanceof fd3;
            c00 c00Var = this.l;
            if (z) {
                c00Var.g(((fd3) xd3Var).f);
            } else {
                c00Var.g(xd3Var);
            }
        } catch (RuntimeException e) {
            s90.b0("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final h83 i() {
        return this.m;
    }

    public final gf3 j() {
        return this.n;
    }

    public final dg3 k() {
        return this.o;
    }

    public final void l() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            dg3 dg3Var = this.o;
            if (i >= dg3Var.f) {
                return;
            }
            dg3Var.a(i);
            bg3 bg3Var = ((bg3[]) this.o.h)[i];
            i++;
        }
    }
}
