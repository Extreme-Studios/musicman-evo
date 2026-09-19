package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xb3 {
    public final yd3 a;
    public final CopyOnWriteArrayList b;

    public /* synthetic */ xb3(CopyOnWriteArrayList copyOnWriteArrayList, yd3 yd3Var) {
        this.b = copyOnWriteArrayList;
        this.a = yd3Var;
    }

    public void a(pm1 pm1Var) {
        for (ae3 ae3Var : this.b) {
            ge3 ge3Var = ae3Var.b;
            Handler handler = ae3Var.a;
            u52 u52Var = new u52(pm1Var, 24, ge3Var);
            String str = qz1.a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    u52Var.run();
                } else {
                    handler.post(u52Var);
                }
            }
        }
    }
}
