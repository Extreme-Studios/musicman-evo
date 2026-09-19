package defpackage;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class se1 {
    public String a;
    public f43 b;
    public e63 c;
    public final ScheduledExecutorService d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public se1(ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
    }

    public final void a() {
        try {
            String strC = na1.k("GET_VARIATIONS_HEADER") ? v70.c() : null;
            if (strC != null && !strC.isEmpty()) {
                this.a = strC;
                byte[] bArrDecode = Base64.decode(strC, 10);
                this.b = f43.z(bArrDecode, v13.a());
                ix0 ix0Var = lx0.C9;
                try {
                    tu0 tu0Var = tu0.e;
                    kx0 kx0Var = tu0Var.c;
                    kx0 kx0Var2 = tu0Var.c;
                    if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
                        this.c = e63.z(bArrDecode, v13.a());
                    }
                    if (((Boolean) kx0Var2.a(lx0.A9)).booleanValue() && ((Boolean) kx0Var2.a(lx0.z9)).booleanValue()) {
                        this.d.schedule(new va1(9, this), ((Integer) kx0Var2.a(lx0.B9)).intValue(), TimeUnit.MINUTES);
                        return;
                    }
                    return;
                } catch (o23 e) {
                    e = e;
                }
                vc3.C.h.e("ChromeVariations", e);
            }
        } catch (IllegalArgumentException | o23 e2) {
            e = e2;
        }
    }
}
