package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vy implements yy {
    public final z61 a;
    public boolean b;
    public Bundle c;
    public final u20 d;

    public vy(z61 z61Var, d70 d70Var) {
        z61Var.getClass();
        this.a = z61Var;
        this.d = new u20(new oa(1, d70Var));
    }

    @Override // defpackage.yy
    public final Bundle a() {
        Bundle bundleD = ss0.d((lv[]) Arrays.copyOf(new lv[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleD.putAll(bundle);
        }
        Iterator it = ((wy) this.d.a()).b.entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return bundleD;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((ry) entry.getValue()).getClass();
        throw null;
    }
}
