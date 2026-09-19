package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class sr0 implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        switch (this.a) {
            case 0:
                tr0 tr0Var = (tr0) this.b;
                if (z) {
                    tr0Var.a = System.currentTimeMillis();
                    tr0Var.d = true;
                    return;
                }
                long j = tr0Var.b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j > 0) {
                    long j2 = tr0Var.b;
                    if (jCurrentTimeMillis >= j2) {
                        tr0Var.c = jCurrentTimeMillis - j2;
                    }
                }
                tr0Var.d = false;
                return;
            default:
                bh2 bh2Var = (bh2) this.b;
                synchronized (bh2Var) {
                    try {
                        if (z) {
                            bh2Var.c = System.currentTimeMillis();
                            bh2Var.f = true;
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j3 = bh2Var.d;
                            if (j3 > 0 && jCurrentTimeMillis2 >= j3) {
                                bh2Var.e = jCurrentTimeMillis2 - j3;
                            }
                            bh2Var.f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
