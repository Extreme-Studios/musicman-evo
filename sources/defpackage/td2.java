package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class td2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ud2 g;

    public /* synthetic */ td2(int i, ud2 ud2Var) {
        this.f = i;
        this.g = ud2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        to0 to0Var;
        vj2 vj2VarM;
        String string;
        int i = this.f;
        int i2 = 2;
        ud2 ud2Var = this.g;
        switch (i) {
            case 0:
                if (!ud2Var.e || ud2Var.l.getAndSet(true)) {
                    return;
                }
                Context context = ud2Var.a;
                String str = ud2Var.j;
                double d = ud2Var.i;
                long j = ud2Var.k;
                Locale locale = Locale.getDefault();
                to0 to0VarZ = uo0.z();
                long j2 = Build.VERSION.SDK_INT;
                to0VarZ.b();
                ((uo0) to0VarZ.g).C(j2);
                String str2 = Build.MODEL;
                to0VarZ.b();
                ((uo0) to0VarZ.g).D(str2);
                String language = locale.getLanguage();
                to0VarZ.b();
                ((uo0) to0VarZ.g).E(language);
                String country = locale.getCountry();
                to0VarZ.b();
                ((uo0) to0VarZ.g).F(country);
                to0VarZ.b();
                ((uo0) to0VarZ.g).I(str);
                String packageName = context.getPackageName();
                to0VarZ.b();
                ((uo0) to0VarZ.g).G(packageName);
                to0VarZ.b();
                ((uo0) to0VarZ.g).L(j);
                if (d > 0.0d) {
                    to0VarZ.b();
                    ((uo0) to0VarZ.g).K((int) (1.0d / d));
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j3 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    to0VarZ.b();
                    ((uo0) to0VarZ.g).H(j3);
                    break;
                } catch (Exception unused) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        i2 = 5;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        i2 = 4;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                        i2 = 7;
                    } else {
                        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                            i2 = 6;
                        }
                    }
                    to0VarZ.b();
                    ((uo0) to0VarZ.g).M(i2);
                    break;
                } catch (RuntimeException unused2) {
                }
                uo0 uo0Var = (uo0) to0VarZ.c();
                synchronized (ud2Var.m) {
                    ud2Var.p.d(uo0Var);
                    break;
                }
                return;
            default:
                synchronized (ud2Var.m) {
                    to0 to0Var2 = ud2Var.p;
                    b23 b23Var = (b23) to0Var2.f.v(5, null);
                    boolean zH = to0Var2.g.h();
                    d23 d23Var = to0Var2.g;
                    if (zH) {
                        d23Var.getClass();
                        d33.c.a(d23Var.getClass()).h(d23Var);
                        d23Var.i();
                        d23Var = to0Var2.g;
                    }
                    b23Var.g = d23Var;
                    to0Var = (to0) b23Var;
                    break;
                }
                synchronized (ud2Var.n) {
                    ArrayList arrayList = ud2Var.q;
                    vj2VarM = vj2.m(arrayList);
                    arrayList.clear();
                    ud2Var.r = false;
                    break;
                }
                int size = vj2VarM.size();
                int i3 = 0;
                int i4 = 0;
                while (i3 < size) {
                    sd2 sd2Var = (sd2) vj2VarM.get(i3);
                    if (i4 >= ud2Var.g) {
                        ud2Var.c((uo0) to0Var.c());
                        to0Var.b();
                        ((uo0) to0Var.g).B();
                        i4 = 0;
                    }
                    bp0 bp0VarZ = cp0.z();
                    long j4 = sd2Var.a;
                    bp0VarZ.b();
                    ((cp0) bp0VarZ.g).A(j4);
                    long j5 = sd2Var.b;
                    bp0VarZ.b();
                    ((cp0) bp0VarZ.g).B(j5);
                    long j6 = sd2Var.e;
                    bp0VarZ.b();
                    ((cp0) bp0VarZ.g).E(j6);
                    String str3 = sd2Var.d;
                    if (str3 != null) {
                        bp0VarZ.b();
                        ((cp0) bp0VarZ.g).F(str3);
                    }
                    Throwable th = sd2Var.c;
                    int i5 = th == null ? 2 : 3;
                    bp0VarZ.b();
                    ((cp0) bp0VarZ.g).G(i5);
                    if (th != null) {
                        String name = th.getClass().getName();
                        bp0VarZ.b();
                        ((cp0) bp0VarZ.g).C(name);
                        try {
                            StringWriter stringWriter = new StringWriter();
                            try {
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                try {
                                    th.printStackTrace(printWriter);
                                    string = stringWriter.toString();
                                    printWriter.close();
                                    stringWriter.close();
                                    bp0VarZ.b();
                                    ((cp0) bp0VarZ.g).D(string);
                                } catch (Throwable th2) {
                                    try {
                                        printWriter.close();
                                        break;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                try {
                                    stringWriter.close();
                                    break;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (IOException unused3) {
                            string = "";
                        }
                    }
                    cp0 cp0Var = (cp0) bp0VarZ.c();
                    to0Var.b();
                    ((uo0) to0Var.g).A(cp0Var);
                    i3++;
                    i4++;
                }
                if (i4 > 0) {
                    ud2Var.c((uo0) to0Var.c());
                    to0Var.b();
                    ((uo0) to0Var.g).B();
                    return;
                }
                return;
        }
    }
}
