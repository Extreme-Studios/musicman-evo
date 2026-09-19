package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ao1 implements v11 {
    public final /* synthetic */ int f = 0;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public /* synthetic */ ao1(bo1 bo1Var, f82 f82Var, j52 j52Var, d72 d72Var) {
        this.g = new WeakReference(bo1Var);
        this.h = f82Var;
        this.i = j52Var;
        this.j = d72Var;
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        int i = this.f;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.j;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                bo1 bo1Var = (bo1) ((WeakReference) obj5).get();
                String str = (String) map.get("u");
                if (bo1Var != null && !TextUtils.isEmpty(str)) {
                    ((f82) obj3).b(str, (j52) obj2, (d72) obj4, bo1Var.I);
                    break;
                }
                break;
            case 1:
                Object obj6 = ((WeakReference) obj5).get();
                if (obj6 != null) {
                    ((v11) obj2).f(obj6, map);
                } else {
                    ((uq1) obj4).c((String) obj3, this);
                }
                break;
            default:
                md1 md1Var = (md1) obj;
                u11.b(map, (zm1) obj5);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    sg1 sg1Var = (sg1) obj2;
                    hp hpVarA = u11.a(md1Var, str2);
                    u40 u40Var = new u40(md1Var, sg1Var, (f82) obj3, (bw1) obj4, 16, false);
                    hpVarA.a(new in2(hpVarA, 0, u40Var), za1.a);
                } else {
                    jn.T("URL missing from click GMSG.");
                }
                break;
        }
    }

    public /* synthetic */ ao1(zm1 zm1Var, sg1 sg1Var, f82 f82Var, bw1 bw1Var) {
        this.g = zm1Var;
        this.i = sg1Var;
        this.h = f82Var;
        this.j = bw1Var;
    }

    public /* synthetic */ ao1(uq1 uq1Var, WeakReference weakReference, String str, v11 v11Var) {
        this.j = uq1Var;
        this.g = weakReference;
        this.h = str;
        this.i = v11Var;
    }
}
