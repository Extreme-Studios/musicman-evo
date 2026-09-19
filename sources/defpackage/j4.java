package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    public /* synthetic */ j4(Context context, int i) {
        this.f = i;
        this.g = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    @Override // java.lang.Runnable
    public final void run() {
        qp qpVar;
        Object systemService;
        Context context;
        int i = this.f;
        Context context2 = this.g;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            n7 n7Var = p4.l;
                            n7Var.getClass();
                            h7 h7Var = new h7(n7Var);
                            while (true) {
                                if (h7Var.hasNext()) {
                                    p4 p4Var = (p4) ((WeakReference) h7Var.next()).get();
                                    if (p4Var != null && (context = ((c5) p4Var).p) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                qpVar = new qp(new rp(l4.a(systemService)));
                            } else {
                                qpVar = qp.b;
                            }
                        } else {
                            qpVar = p4.h;
                            if (qpVar == null) {
                                qpVar = qp.b;
                            }
                        }
                        if (qpVar.a.a.isEmpty()) {
                            String strK = yd.k(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                l4.b(systemService2, k4.a(strK));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                p4.k = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new j4(context2, 2));
                break;
            default:
                ar.p(context2, new c7(1), ar.g, false);
                break;
        }
    }
}
