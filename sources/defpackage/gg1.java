package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gg1 implements fg1 {
    public final /* synthetic */ int a;
    public final h73 b;

    public /* synthetic */ gg1(h73 h73Var, int i) {
        this.a = i;
        this.b = h73Var;
    }

    @Override // defpackage.fg1
    public final void a(HashMap map) {
        switch (this.a) {
            case 0:
                boolean z = Boolean.parseBoolean((String) map.get("content_url_opted_out"));
                h73 h73Var = this.b;
                h73Var.h();
                synchronized (h73Var.a) {
                    try {
                        if (h73Var.u == z) {
                            return;
                        }
                        h73Var.u = z;
                        SharedPreferences.Editor editor = h73Var.g;
                        if (editor != null) {
                            editor.putBoolean("content_url_opted_out", z);
                            h73Var.g.apply();
                        }
                        h73Var.i();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                boolean z2 = Boolean.parseBoolean((String) map.get("content_vertical_opted_out"));
                h73 h73Var2 = this.b;
                h73Var2.h();
                synchronized (h73Var2.a) {
                    try {
                        if (h73Var2.v == z2) {
                            return;
                        }
                        h73Var2.v = z2;
                        SharedPreferences.Editor editor2 = h73Var2.g;
                        if (editor2 != null) {
                            editor2.putBoolean("content_vertical_opted_out", z2);
                            h73Var2.g.apply();
                        }
                        h73Var2.i();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
