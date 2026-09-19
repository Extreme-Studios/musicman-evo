package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w11 implements v11 {
    public final /* synthetic */ int f;
    public final qt1 g;

    public /* synthetic */ w11(qt1 qt1Var, int i) {
        this.f = i;
        this.g = qt1Var;
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        switch (this.f) {
            case 0:
                if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    return;
                }
                qt1 qt1Var = this.g;
                String str = (String) map.get("persistentData");
                synchronized (qt1Var) {
                    qt1Var.x = str;
                    vc3.C.h.g().g(qt1Var.x);
                }
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j = Long.parseLong((String) map.get("expires"));
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                qt1 qt1Var2 = this.g;
                String str2 = (String) map.get("extras");
                synchronized (qt1Var2) {
                    qt1Var2.o = str2;
                    qt1Var2.q = j;
                    qt1Var2.m();
                }
                return;
        }
    }
}
