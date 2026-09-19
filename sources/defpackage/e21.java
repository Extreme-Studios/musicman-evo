package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e21 implements lb0 {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ib0 c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ Map e;

    public e21(f21 f21Var, boolean z, ib0 ib0Var, HashMap map, Map map2) {
        this.b = z;
        this.c = ib0Var;
        this.d = map;
        this.e = map2;
        Objects.requireNonNull(f21Var);
        this.a = false;
    }

    @Override // defpackage.lb0
    public final void T(boolean z) {
        if (this.a) {
            return;
        }
        ib0 ib0Var = this.c;
        if (z && this.b) {
            ((zm1) ib0Var).q0();
        }
        this.a = true;
        String str = (String) this.e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.d;
        map.put(str, boolValueOf);
        ((f31) ib0Var).a("openIntentAsync", map);
    }

    @Override // defpackage.lb0
    public final void d(int i) {
    }
}
