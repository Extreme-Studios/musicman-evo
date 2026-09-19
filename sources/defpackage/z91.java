package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class z91 implements qt0 {
    public final Context f;
    public final Object g;
    public final String h;
    public boolean i;

    public z91(Context context, String str) {
        this.f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.h = str;
        this.i = false;
        this.g = new Object();
    }

    @Override // defpackage.qt0
    public final void Q0(pt0 pt0Var) {
        a(pt0Var.j);
    }

    public final void a(boolean z) {
        vc3 vc3Var = vc3.C;
        aa1 aa1Var = vc3Var.y;
        Context context = this.f;
        if (aa1Var.a(context)) {
            synchronized (this.g) {
                try {
                    if (this.i == z) {
                        return;
                    }
                    this.i = z;
                    String str = this.h;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.i) {
                        aa1 aa1Var2 = vc3Var.y;
                        if (aa1Var2.a(context)) {
                            aa1Var2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        aa1 aa1Var3 = vc3Var.y;
                        if (aa1Var3.a(context)) {
                            aa1Var3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
