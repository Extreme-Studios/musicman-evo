package defpackage;

import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class o11 implements en1 {
    public final ns0 f;
    public final int g;
    public final String h;

    public o11(ns0 ns0Var, int i, String str) {
        this.f = ns0Var;
        this.g = i;
        this.h = str;
    }

    @Override // defpackage.en1
    public final void a(j01 j01Var) {
        if (j01Var == null || this.g != 2 || TextUtils.isEmpty(this.h)) {
            return;
        }
        in2 in2Var = new in2(this, 21, j01Var);
        e32 e32Var = zb3.l;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            in2Var.run();
        } else {
            za1.a.execute(in2Var);
        }
    }

    @Override // defpackage.en1
    public final void F(String str) {
    }
}
