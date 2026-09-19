package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class wr0 extends js0 {
    public static final kc2 k = new kc2(14);
    public final ap0 h;
    public final Context i;
    public final p83 j;

    public wr0(nr0 nr0Var, hp0 hp0Var, int i, Context context, ap0 ap0Var, p83 p83Var) {
        super(nr0Var, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", hp0Var, i, 27);
        this.i = context;
        this.h = ap0Var;
        this.j = p83Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0, B:55:0x00c3, B:57:0x00d8, B:61:0x00e1), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0, B:55:0x00c3, B:57:0x00d8, B:61:0x00e1), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0, B:55:0x00c3, B:57:0x00d8, B:61:0x00e1), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0, B:55:0x00c3, B:57:0x00d8, B:61:0x00e1), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00c2, TryCatch #0 {InterruptedException | ExecutionException -> 0x00c2, blocks: (B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0), top: B:79:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0 A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00c2, TryCatch #0 {InterruptedException | ExecutionException -> 0x00c2, blocks: (B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0), top: B:79:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00c2, TryCatch #0 {InterruptedException | ExecutionException -> 0x00c2, blocks: (B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0), top: B:79:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00c2, TryCatch #0 {InterruptedException | ExecutionException -> 0x00c2, blocks: (B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0), top: B:79:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0, B:55:0x00c3, B:57:0x00d8, B:61:0x00e1), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.js0
    public final void a() {
        tu0 tu0Var;
        Boolean bool;
        String strU0;
        fq0 fq0Var;
        String str;
        fq0 fq0VarC;
        boolean z;
        nr0 nr0Var;
        dr0 dr0Var;
        Object obj;
        sp0 sp0VarB;
        Future future;
        fq0 fq0Var2;
        kc2 kc2Var = k;
        Context context = this.i;
        AtomicReference atomicReferenceK = kc2Var.k(context.getPackageName());
        synchronized (atomicReferenceK) {
            try {
                fq0 fq0Var3 = (fq0) atomicReferenceK.get();
                if (fq0Var3 != null) {
                    String str2 = fq0Var3.s;
                    char[] cArr = pr0.a;
                    if ((str2 == null || str2.isEmpty()) || fq0Var3.s.equals("E") || fq0Var3.s.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                        char[] cArr2 = pr0.a;
                        if (this.j != null) {
                            fq0VarC = c();
                        } else {
                            Boolean boolValueOf = Boolean.valueOf(!this.h.z());
                            ix0 ix0Var = lx0.H2;
                            tu0Var = tu0.e;
                            bool = (Boolean) tu0Var.c.a(ix0Var);
                            if (((Boolean) tu0Var.c.a(lx0.G2)).booleanValue()) {
                                strU0 = b();
                            } else {
                                strU0 = null;
                            }
                            if (bool.booleanValue() && this.a.l) {
                                if (strU0 != null || strU0.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    try {
                                        nr0Var = this.a;
                                        dr0Var = nr0Var.j;
                                        if (dr0Var != null) {
                                            obj = (xn2) dr0Var.g;
                                        } else {
                                            obj = nr0Var.i;
                                        }
                                        if (obj != null) {
                                            if (dr0Var != null) {
                                                future = (xn2) dr0Var.g;
                                            } else {
                                                future = nr0Var.i;
                                            }
                                            future.get();
                                        }
                                        sp0VarB = nr0Var.b();
                                        if (sp0VarB == null && sp0VarB.Z()) {
                                            strU0 = sp0VarB.u0();
                                        } else {
                                            strU0 = null;
                                        }
                                    } catch (InterruptedException | ExecutionException unused) {
                                    }
                                }
                            }
                            fq0Var = new fq0((String) this.e.invoke(null, context, boolValueOf, strU0));
                            str = fq0Var.s;
                            if (!(str != null || str.isEmpty())) {
                                fq0Var.s.equals("E");
                            }
                            fq0VarC = fq0Var;
                        }
                        atomicReferenceK.set(fq0VarC);
                    }
                } else {
                    char[] cArr3 = pr0.a;
                    if (this.j != null) {
                        fq0VarC = c();
                    } else {
                        Boolean boolValueOf2 = Boolean.valueOf(!this.h.z());
                        ix0 ix0Var2 = lx0.H2;
                        tu0Var = tu0.e;
                        bool = (Boolean) tu0Var.c.a(ix0Var2);
                        if (((Boolean) tu0Var.c.a(lx0.G2)).booleanValue()) {
                            strU0 = b();
                        } else {
                            strU0 = null;
                        }
                        if (bool.booleanValue()) {
                            if (strU0 != null) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (z) {
                                nr0Var = this.a;
                                dr0Var = nr0Var.j;
                                if (dr0Var != null) {
                                    obj = (xn2) dr0Var.g;
                                } else {
                                    obj = nr0Var.i;
                                }
                                if (obj != null) {
                                    if (dr0Var != null) {
                                        future = (xn2) dr0Var.g;
                                    } else {
                                        future = nr0Var.i;
                                    }
                                    future.get();
                                }
                                sp0VarB = nr0Var.b();
                                if (sp0VarB == null) {
                                    strU0 = null;
                                } else {
                                    strU0 = null;
                                }
                            }
                        }
                        fq0Var = new fq0((String) this.e.invoke(null, context, boolValueOf2, strU0));
                        str = fq0Var.s;
                        if (!(str != null || str.isEmpty())) {
                            fq0Var.s.equals("E");
                        }
                        fq0VarC = fq0Var;
                    }
                    atomicReferenceK.set(fq0VarC);
                }
                fq0Var2 = (fq0) atomicReferenceK.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        hp0 hp0Var = this.d;
        synchronized (hp0Var) {
            if (fq0Var2 != null) {
                try {
                    String str3 = fq0Var2.s;
                    hp0Var.b();
                    ((sp0) hp0Var.g).R0(str3);
                    long j = fq0Var2.t;
                    hp0Var.b();
                    ((sp0) hp0Var.g).E(j);
                    String str4 = fq0Var2.u;
                    hp0Var.b();
                    ((sp0) hp0Var.g).D(str4);
                    String str5 = fq0Var2.v;
                    hp0Var.b();
                    ((sp0) hp0Var.g).N(str5);
                    String str6 = fq0Var2.w;
                    hp0Var.b();
                    ((sp0) hp0Var.g).O(str6);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ix0 ix0Var = lx0.I2;
            tu0 tu0Var = tu0.e;
            byte[] bArrA = pr0.a((String) tu0Var.c.a(ix0Var));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrA)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(pr0.a((String) tu0Var.c.a(lx0.J2)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.a.b;
            return na1.q(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final fq0 c() {
        String str;
        xn2 xn2Var;
        ix0 ix0Var = lx0.T2;
        tu0 tu0Var = tu0.e;
        int iIntValue = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue() ? ((Integer) tu0Var.c.a(lx0.Z2)).intValue() : this.h.A();
        fq0 fq0Var = new fq0((String) this.e.invoke(null, this.i, Boolean.FALSE, ""));
        p83 p83Var = this.j;
        if (p83Var == null || (xn2Var = (xn2) p83Var.g) == null) {
            str = "E";
        } else {
            try {
                str = (String) xn2Var.get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = "E";
            }
        }
        fq0Var.s = str;
        return fq0Var;
    }
}
