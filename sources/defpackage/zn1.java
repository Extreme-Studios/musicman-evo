package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zn1 implements v11 {
    public final /* synthetic */ int f;
    public final WeakReference g;

    public /* synthetic */ zn1(bo1 bo1Var, int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.g = new WeakReference(bo1Var);
                break;
            default:
                this.g = new WeakReference(bo1Var);
                break;
        }
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        int i = this.f;
        WeakReference weakReference = this.g;
        switch (i) {
            case 0:
                bo1 bo1Var = (bo1) weakReference.get();
                if (bo1Var != null) {
                    ym1 ym1Var = bo1Var.n;
                    if ("_ac".equals((String) map.get("eventName"))) {
                        bo1Var.m.B();
                        if (((Boolean) tu0.e.c.a(lx0.Ab)).booleanValue()) {
                            ym1Var.q0();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                ym1Var.T0();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                bo1 bo1Var2 = (bo1) weakReference.get();
                if (bo1Var2 != null) {
                    ym1 ym1Var2 = bo1Var2.n;
                    bo1Var2.m.B();
                    if (((Boolean) tu0.e.c.a(lx0.Ab)).booleanValue()) {
                        ym1Var2.q0();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            ym1Var2.T0();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
