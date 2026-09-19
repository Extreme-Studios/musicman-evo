package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class db2 implements n62, pm1 {
    public static final Object k = new Object();
    public boolean f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public db2(Context context, ct0 ct0Var, sa2 sa2Var, boolean z) {
        this.f = false;
        this.g = context;
        this.i = Integer.toString(ct0Var.f);
        this.h = context.getSharedPreferences("pcvmspf", 0);
        this.j = sa2Var;
        this.f = z;
    }

    public static db2 e(y82 y82Var, b92 b92Var, d92 d92Var, d92 d92Var2, boolean z) {
        if (d92Var == d92.i) {
            j7.p("Impression owner is none");
            return null;
        }
        y82 y82Var2 = y82.g;
        d92 d92Var3 = d92.g;
        if (y82Var == y82Var2 && d92Var == d92Var3) {
            j7.p("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (b92Var == b92.g && d92Var == d92Var3) {
            j7.p("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        db2 db2Var = new db2();
        db2Var.i = y82Var;
        db2Var.j = b92Var;
        db2Var.g = d92Var;
        db2Var.h = d92Var2;
        db2Var.f = z;
        return db2Var;
    }

    public static String o(dt0 dt0Var) {
        gt0 gt0VarG = ht0.G();
        String strZ = dt0Var.z().z();
        gt0VarG.b();
        ((ht0) gt0VarG.g).I(strZ);
        String strA = dt0Var.z().A();
        gt0VarG.b();
        ((ht0) gt0VarG.g).J(strA);
        long jC = dt0Var.z().C();
        gt0VarG.b();
        ((ht0) gt0VarG.g).L(jC);
        long jD = dt0Var.z().D();
        gt0VarG.b();
        ((ht0) gt0VarG.g).M(jD);
        long jB = dt0Var.z().B();
        gt0VarG.b();
        ((ht0) gt0VarG.g).K(jB);
        return ej1.b(((ht0) gt0VarG.c()).b());
    }

    public static String p(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        dq0 dq0VarZ = eq0.z();
        dq0VarZ.b();
        ((eq0) dq0VarZ.g).D(5);
        l13 l13VarN = n13.n(bArr, 0, bArr.length);
        dq0VarZ.b();
        ((eq0) dq0VarZ.g).A(l13VarN);
        return Base64.encodeToString(((eq0) dq0VarZ.c()).b(), 11);
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentC;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.i;
        if (this.f && (viewParentC = c(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.j) == null) {
                        this.j = new int[2];
                    }
                    int[] iArr4 = (int[]) this.j;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentC instanceof ot) {
                    ((ot) viewParentC).c(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentC instanceof nt) {
                        ((nt) viewParentC).e(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentC.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0123 */
    @Override // defpackage.n62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db2.b(java.lang.Object):java.lang.Object");
    }

    public ViewParent c(int i) {
        if (i == 0) {
            return (ViewParent) this.g;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.h;
    }

    public synchronized String d(Context context) {
        byte[] bArrR;
        try {
            HashMap mapC = ((gb2) this.i).c();
            mapC.put("f", "q");
            mapC.put("ctx", context);
            mapC.put("aid", null);
            bArrR = r(mapC);
            if (this.f) {
                mapC.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return p(bArrR);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f9 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x00a9, B:33:0x00c9, B:34:0x00ce, B:36:0x00d0, B:38:0x00de, B:39:0x00e3, B:42:0x00e7, B:47:0x00f1, B:48:0x00f7, B:50:0x00f9, B:52:0x012f, B:53:0x0140, B:55:0x0146, B:56:0x014b, B:58:0x014d, B:60:0x0158, B:61:0x015f, B:63:0x0166, B:64:0x016d, B:66:0x0187, B:68:0x0193, B:69:0x0196, B:70:0x0199, B:71:0x019e, B:23:0x0086, B:25:0x008c, B:28:0x0097, B:29:0x00a7), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012f A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x00a9, B:33:0x00c9, B:34:0x00ce, B:36:0x00d0, B:38:0x00de, B:39:0x00e3, B:42:0x00e7, B:47:0x00f1, B:48:0x00f7, B:50:0x00f9, B:52:0x012f, B:53:0x0140, B:55:0x0146, B:56:0x014b, B:58:0x014d, B:60:0x0158, B:61:0x015f, B:63:0x0166, B:64:0x016d, B:66:0x0187, B:68:0x0193, B:69:0x0196, B:70:0x0199, B:71:0x019e, B:23:0x0086, B:25:0x008c, B:28:0x0097, B:29:0x00a7), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0146 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x00a9, B:33:0x00c9, B:34:0x00ce, B:36:0x00d0, B:38:0x00de, B:39:0x00e3, B:42:0x00e7, B:47:0x00f1, B:48:0x00f7, B:50:0x00f9, B:52:0x012f, B:53:0x0140, B:55:0x0146, B:56:0x014b, B:58:0x014d, B:60:0x0158, B:61:0x015f, B:63:0x0166, B:64:0x016d, B:66:0x0187, B:68:0x0193, B:69:0x0196, B:70:0x0199, B:71:0x019e, B:23:0x0086, B:25:0x008c, B:28:0x0097, B:29:0x00a7), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x00a9, B:33:0x00c9, B:34:0x00ce, B:36:0x00d0, B:38:0x00de, B:39:0x00e3, B:42:0x00e7, B:47:0x00f1, B:48:0x00f7, B:50:0x00f9, B:52:0x012f, B:53:0x0140, B:55:0x0146, B:56:0x014b, B:58:0x014d, B:60:0x0158, B:61:0x015f, B:63:0x0166, B:64:0x016d, B:66:0x0187, B:68:0x0193, B:69:0x0196, B:70:0x0199, B:71:0x019e, B:23:0x0086, B:25:0x008c, B:28:0x0097, B:29:0x00a7), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0158 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x00a9, B:33:0x00c9, B:34:0x00ce, B:36:0x00d0, B:38:0x00de, B:39:0x00e3, B:42:0x00e7, B:47:0x00f1, B:48:0x00f7, B:50:0x00f9, B:52:0x012f, B:53:0x0140, B:55:0x0146, B:56:0x014b, B:58:0x014d, B:60:0x0158, B:61:0x015f, B:63:0x0166, B:64:0x016d, B:66:0x0187, B:68:0x0193, B:69:0x0196, B:70:0x0199, B:71:0x019e, B:23:0x0086, B:25:0x008c, B:28:0x0097, B:29:0x00a7), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0166 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x00a9, B:33:0x00c9, B:34:0x00ce, B:36:0x00d0, B:38:0x00de, B:39:0x00e3, B:42:0x00e7, B:47:0x00f1, B:48:0x00f7, B:50:0x00f9, B:52:0x012f, B:53:0x0140, B:55:0x0146, B:56:0x014b, B:58:0x014d, B:60:0x0158, B:61:0x015f, B:63:0x0166, B:64:0x016d, B:66:0x0187, B:68:0x0193, B:69:0x0196, B:70:0x0199, B:71:0x019e, B:23:0x0086, B:25:0x008c, B:28:0x0097, B:29:0x00a7), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0187 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x00a9, B:33:0x00c9, B:34:0x00ce, B:36:0x00d0, B:38:0x00de, B:39:0x00e3, B:42:0x00e7, B:47:0x00f1, B:48:0x00f7, B:50:0x00f9, B:52:0x012f, B:53:0x0140, B:55:0x0146, B:56:0x014b, B:58:0x014d, B:60:0x0158, B:61:0x015f, B:63:0x0166, B:64:0x016d, B:66:0x0187, B:68:0x0193, B:69:0x0196, B:70:0x0199, B:71:0x019e, B:23:0x0086, B:25:0x008c, B:28:0x0097, B:29:0x00a7), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0193 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x00a9, B:33:0x00c9, B:34:0x00ce, B:36:0x00d0, B:38:0x00de, B:39:0x00e3, B:42:0x00e7, B:47:0x00f1, B:48:0x00f7, B:50:0x00f9, B:52:0x012f, B:53:0x0140, B:55:0x0146, B:56:0x014b, B:58:0x014d, B:60:0x0158, B:61:0x015f, B:63:0x0166, B:64:0x016d, B:66:0x0187, B:68:0x0193, B:69:0x0196, B:70:0x0199, B:71:0x019e, B:23:0x0086, B:25:0x008c, B:28:0x0097, B:29:0x00a7), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0196 A[SYNTHETIC] */
    public boolean f(dt0 dt0Var, zf0 zf0Var) {
        boolean zA;
        long jCurrentTimeMillis;
        String string;
        SharedPreferences.Editor editorEdit;
        HashSet hashSet;
        ht0 ht0VarS;
        ht0 ht0VarS2;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (k) {
            try {
                ht0 ht0VarS3 = s(1);
                String strZ = dt0Var.z().z();
                if (ht0VarS3 != null && ht0VarS3.z().equals(strZ)) {
                    q(4014, jCurrentTimeMillis2);
                    return false;
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                File fileK = k(strZ);
                if (fileK.exists()) {
                    String str = true != fileK.isDirectory() ? "0" : "1";
                    String str2 = true != fileK.isFile() ? "0" : "1";
                    StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    ((sa2) this.j).r(4023, jCurrentTimeMillis3, sb.toString());
                    q(4015, jCurrentTimeMillis3);
                } else if (!fileK.mkdirs()) {
                    ((sa2) this.j).r(4024, jCurrentTimeMillis3, "cw:".concat(true != fileK.canWrite() ? "0" : "1"));
                    q(4015, jCurrentTimeMillis3);
                    return false;
                }
                File fileK2 = k(strZ);
                File file = new File(fileK2, "pcam.jar");
                File file2 = new File(fileK2, "pcbc");
                if (!ss0.M(file, dt0Var.A().p())) {
                    q(4016, jCurrentTimeMillis2);
                    return false;
                }
                if (!ss0.M(file2, dt0Var.B().p())) {
                    q(4017, jCurrentTimeMillis2);
                    return false;
                }
                if (zf0Var != null) {
                    try {
                        zA = fa2.a(file);
                    } catch (GeneralSecurityException unused) {
                        zA = false;
                    }
                    if (zA) {
                        String strO = o(dt0Var);
                        jCurrentTimeMillis = System.currentTimeMillis();
                        SharedPreferences sharedPreferences = (SharedPreferences) this.h;
                        string = sharedPreferences.getString("LATMTD".concat(String.valueOf((String) this.i)), null);
                        editorEdit = sharedPreferences.edit();
                        editorEdit.putString("LATMTD".concat(String.valueOf((String) this.i)), strO);
                        if (string != null) {
                            editorEdit.putString("FBAMTD".concat(String.valueOf((String) this.i)), string);
                        }
                        if (!editorEdit.commit()) {
                            hashSet = new HashSet();
                            ht0VarS = s(1);
                            if (ht0VarS != null) {
                                hashSet.add(ht0VarS.z());
                            }
                            ht0VarS2 = s(2);
                            if (ht0VarS2 != null) {
                                hashSet.add(ht0VarS2.z());
                            }
                            for (File file3 : new File(((Context) this.g).getDir("pccache", 0), (String) this.i).listFiles()) {
                                if (!hashSet.contains(file3.getName())) {
                                    ss0.a0(file3);
                                }
                            }
                            q(5014, jCurrentTimeMillis2);
                            return true;
                        }
                        q(4019, jCurrentTimeMillis);
                    } else {
                        q(4018, jCurrentTimeMillis2);
                        ss0.a0(fileK2);
                    }
                } else {
                    String strO2 = o(dt0Var);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    SharedPreferences sharedPreferences2 = (SharedPreferences) this.h;
                    string = sharedPreferences2.getString("LATMTD".concat(String.valueOf((String) this.i)), null);
                    editorEdit = sharedPreferences2.edit();
                    editorEdit.putString("LATMTD".concat(String.valueOf((String) this.i)), strO2);
                    if (string != null) {
                        editorEdit.putString("FBAMTD".concat(String.valueOf((String) this.i)), string);
                    }
                    if (!editorEdit.commit()) {
                        hashSet = new HashSet();
                        ht0VarS = s(1);
                        if (ht0VarS != null) {
                            hashSet.add(ht0VarS.z());
                        }
                        ht0VarS2 = s(2);
                        if (ht0VarS2 != null) {
                            hashSet.add(ht0VarS2.z());
                        }
                        while (i < r8) {
                            if (!hashSet.contains(file3.getName())) {
                                ss0.a0(file3);
                            }
                        }
                        q(5014, jCurrentTimeMillis2);
                        return true;
                    }
                    q(4019, jCurrentTimeMillis);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized String g(Context context, View view, Activity activity) {
        byte[] bArrR;
        try {
            HashMap mapH = ((gb2) this.i).h();
            mapH.put("f", "v");
            mapH.put("ctx", context);
            mapH.put("aid", null);
            mapH.put("view", view);
            mapH.put("act", activity);
            bArrR = r(mapH);
            if (this.f) {
                mapH.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return p(bArrR);
    }

    public boolean h(dt0 dt0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (k) {
            try {
                if (!ss0.M(new File(k(dt0Var.z().z()), "pcbc"), dt0Var.B().p())) {
                    q(4020, jCurrentTimeMillis);
                    return false;
                }
                String strO = o(dt0Var);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.h).edit();
                editorEdit.putString("LATMTD".concat(String.valueOf((String) this.i)), strO);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    q(5015, jCurrentTimeMillis);
                } else {
                    q(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized String i(Context context, String str, View view, Activity activity) {
        byte[] bArrR;
        try {
            HashMap mapL = ((gb2) this.i).l();
            mapL.put("f", "c");
            mapL.put("ctx", context);
            mapL.put("cs", str);
            mapL.put("aid", null);
            mapL.put("view", view);
            mapL.put("act", activity);
            bArrR = r(mapL);
            if (this.f) {
                mapL.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return p(bArrR);
    }

    public synchronized void j(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap mapB = ((gb2) this.i).b();
            mapB.put("aid", null);
            mapB.put("evt", motionEvent);
            Object obj = this.g;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapB);
            ((ga2) this.j).b(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new eb2(2005, e);
        }
    }

    public File k(String str) {
        return new File(new File(((Context) this.g).getDir("pccache", 0), (String) this.i), str);
    }

    public synchronized boolean l() {
        Object obj;
        try {
            obj = this.g;
        } catch (Exception e) {
            throw new eb2(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public synchronized void m() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.g;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            ((ga2) this.j).b(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new eb2(2003, e);
        }
    }

    public synchronized int n() {
        Object obj;
        try {
            obj = this.g;
        } catch (Exception e) {
            throw new eb2(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    public void q(int i, long j) {
        ((sa2) this.j).B(i, j);
    }

    public synchronized byte[] r(Map map) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.g;
        } catch (Exception e) {
            ((ga2) this.j).c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public ht0 s(int i) {
        v13 v13VarA;
        SharedPreferences sharedPreferences = (SharedPreferences) this.h;
        String str = (String) this.i;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                byte[] bArrO = ej1.o(string);
                l13 l13VarN = n13.n(bArrO, 0, bArrO.length);
                if (this.f) {
                    v13 v13Var = v13.a;
                    int i2 = h13.a;
                    v13VarA = v13.b;
                } else {
                    v13VarA = v13.a();
                }
                return ht0.F(l13VarN, v13VarA);
            } catch (NullPointerException unused) {
                q(2029, jCurrentTimeMillis);
            } catch (RuntimeException unused2) {
                q(2032, jCurrentTimeMillis);
            } catch (o23 unused3) {
            }
        }
        return null;
    }

    public /* synthetic */ db2(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.f = z;
    }

    @Override // defpackage.pm1
    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public /* synthetic */ void mo0b(Object obj) {
        ((ge3) obj).o(0, ((xb3) this.g).a, (qd3) this.h, (vd3) this.i, (IOException) this.j, this.f);
    }
}
