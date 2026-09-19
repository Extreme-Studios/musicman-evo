package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tr0 {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a;
    public long b;
    public long c;
    public boolean d;

    public static tr0 a(Context context, Executor executor) {
        String[] strArr = e;
        tr0 tr0Var = new tr0();
        tr0Var.a = 0L;
        tr0Var.b = 0L;
        tr0Var.c = -1L;
        tr0Var.d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new sr0(0, tr0Var));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return tr0Var;
    }
}
