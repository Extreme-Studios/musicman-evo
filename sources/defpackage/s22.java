package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s22 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s22(kn2 kn2Var) {
        this.a = 1;
        kn2 kn2Var2 = kn2.g;
        this.b = kn2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws PackageManager.NameNotFoundException {
        int i;
        Object objApply;
        Object objD;
        boolean zIsActiveNetworkMetered = false;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                Context context = ((k02) this.b).c;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                vc3 vc3Var = vc3.C;
                zb3 zb3Var = vc3Var.c;
                int iOrdinal = -1;
                if (zb3.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                        i = type;
                    } else {
                        i = -1;
                    }
                    zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                } else {
                    i = -2;
                }
                return new r22(networkOperator, i, vc3Var.f.l(context), phoneType, zIsActiveNetworkMetered, iOrdinal);
            case 1:
                String str = (String) ((kn2) this.b).f;
                kn2 kn2Var = kn2.g;
                return new c32(str, null);
            case 2:
                return new m02(4, (List) ((c02) this.b).c);
            case 3:
                ((o62) this.b).a();
                return null;
            case 4:
                Context context2 = (Context) ((y91) this.b).g;
                return w40.Z(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
            case 5:
                kd2 kd2Var = (kd2) this.b;
                synchronized (kd2Var) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(kd2Var.a);
                            try {
                                objD = kd2Var.c.d(fileInputStream);
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (id2 e) {
                            objApply = kd2Var.d.apply(e);
                            return objApply;
                        }
                    } catch (FileNotFoundException unused) {
                        objApply = kd2Var.c.h();
                        return objApply;
                    } catch (IOException e2) {
                        objApply = kd2Var.d.apply(new id2(e2));
                        return objApply;
                    }
                }
                return objD;
            case 6:
                ke2 ke2Var = (ke2) this.b;
                ((re2) ke2Var.c.c()).a();
                ((cf2) ke2Var.b.c()).a();
                return null;
            case 7:
                ((bg2) ((tf2) this.b).a.c()).a();
                return null;
            case 8:
                return ((o63) this.b).c();
            case 9:
                wg2 wg2Var = (wg2) this.b;
                zl0 zl0Var = new zl0(15, wg2Var);
                synchronized (wg2Var) {
                    dh2 dh2Var = wg2Var.c;
                    qm2 qm2VarM = na1.M(v51.i(new vg2(wg2Var.b, objArr == true ? 1 : 0, wg2Var.e)), zl0Var, wg2Var.d);
                    dh2Var.d(52, qm2VarM);
                    wg2Var.g = qm2VarM;
                    break;
                }
                return "";
            case 10:
                Context context3 = ((wg2) this.b).b;
                try {
                    return w40.Z(context3, context3.getPackageName(), Integer.toString(context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            case 11:
                ah2 ah2Var = (ah2) this.b;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                ah2Var.a.registerReceiver(ah2Var, intentFilter);
                return null;
            default:
                e32 e32Var = zb3.l;
                zb3 zb3Var2 = vc3.C.c;
                return zb3.o((Uri) this.b);
        }
    }

    public /* synthetic */ s22(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
