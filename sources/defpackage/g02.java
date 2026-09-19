package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g02 implements m22 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public g02(sa1 sa1Var, ScheduledExecutorService scheduledExecutorService, ya1 ya1Var) {
        this.a = 5;
        this.b = sa1Var;
        this.d = scheduledExecutorService;
        this.c = ya1Var;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    @Override // defpackage.m22
    public final hp a() {
        String strValueOf;
        String str;
        String str2;
        String installingPackageName;
        int i = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String str3 = null;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Executor executor = (Executor) obj3;
                hp hpVarL = na1.L((hp) obj2, kg0.j, executor);
                ix0 ix0Var = lx0.md;
                tu0 tu0Var = tu0.e;
                if (((Integer) tu0Var.c.a(ix0Var)).intValue() > 0) {
                    hpVarL = na1.K(hpVarL, ((Integer) tu0Var.c.a(ix0Var)).intValue(), timeUnit, (ScheduledExecutorService) obj);
                }
                return na1.J(hpVarL, Throwable.class, kg0.i, executor);
            case 1:
                return ((ya1) obj2).b(new br0(12, this));
            case 2:
                Context context = (Context) obj;
                String str4 = ((ApplicationInfo) obj2).packageName;
                PackageInfo packageInfo = (PackageInfo) obj3;
                Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
                String str5 = packageInfo == null ? null : packageInfo.versionName;
                try {
                    e32 e32Var = zb3.l;
                    Context context2 = q90.a(context).f;
                    strValueOf = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str4, 0)));
                } catch (PackageManager.NameNotFoundException unused) {
                    strValueOf = null;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    if (((Boolean) tu0.e.c.a(lx0.Bd)).booleanValue()) {
                        try {
                            InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(str4);
                            if (installSourceInfo != null) {
                                installingPackageName = installSourceInfo.getInstallingPackageName();
                                try {
                                    if (TextUtils.isEmpty(installingPackageName)) {
                                        jn.p("No installing package name found");
                                        installingPackageName = null;
                                    }
                                    try {
                                        String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                                        try {
                                            if (TextUtils.isEmpty(initiatingPackageName)) {
                                                jn.p("No initiating package name found");
                                                str = installingPackageName;
                                                str2 = str3;
                                            } else {
                                                str2 = initiatingPackageName;
                                                str = installingPackageName;
                                            }
                                        } catch (PackageManager.NameNotFoundException e) {
                                            e = e;
                                            str3 = initiatingPackageName;
                                            vc3.C.h.d("PackageInfoSignalSource.getInstallSourceInfo", e);
                                        }
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        e = e2;
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    e = e3;
                                }
                            } else {
                                str = null;
                                str2 = null;
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                            e = e4;
                            installingPackageName = null;
                        }
                    } else {
                        str = null;
                        str2 = null;
                    }
                } else {
                    str = null;
                    str2 = null;
                }
                return na1.t(new u12(str4, numValueOf, str5, strValueOf, str, str2));
            case 3:
                return ((ya1) obj3).b(new br0(25, this));
            case 4:
                return ((ya1) obj2).b(new br0(29, this));
            default:
                ix0 ix0Var2 = lx0.k3;
                tu0 tu0Var2 = tu0.e;
                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                    if (((Boolean) tu0Var2.c.a(lx0.p3)).booleanValue()) {
                        ve3 ve3Var = new ve3();
                        ve3Var.e(null);
                        ya1 ya1Var = (ya1) obj3;
                        hp hpVarL2 = na1.L(v51.u(ve3Var), kg0.m, ya1Var);
                        if (((Boolean) hy0.a.u()).booleanValue()) {
                            hpVarL2 = na1.K(hpVarL2, ((Long) hy0.b.u()).longValue(), timeUnit, (ScheduledExecutorService) obj);
                        }
                        return na1.I(hpVarL2, Exception.class, new zl0(6, this), ya1Var);
                    }
                }
                return na1.t(new p02(str3, -1, 2));
        }
    }

    @Override // defpackage.m22
    public final int c() {
        switch (this.a) {
            case 0:
                return 6;
            case 1:
                return 9;
            case 2:
                return 29;
            case 3:
                return 34;
            case 4:
                return 38;
            default:
                return 43;
        }
    }

    public /* synthetic */ g02(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
