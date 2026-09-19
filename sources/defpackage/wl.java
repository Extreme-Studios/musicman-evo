package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class wl extends a8 implements t3 {
    public final Set y;

    /* JADX WARN: Illegal instructions before constructor call */
    public wl(Context context, Looper looper, int i, es0 es0Var, bm bmVar, cm cmVar) {
        bc3 bc3VarA = bc3.a(context);
        zl zlVar = zl.d;
        dq.f(bmVar);
        dq.f(cmVar);
        super(context, looper, bc3VarA, zlVar, i, new oc2(7, bmVar), new zx(9, cmVar), (String) es0Var.i);
        Set set = (Set) es0Var.g;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                j7.e("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.y = set;
    }

    @Override // defpackage.t3
    public final Set b() {
        return k() ? this.y : Collections.EMPTY_SET;
    }

    @Override // defpackage.a8
    public final Account p() {
        return null;
    }

    @Override // defpackage.a8
    public final Set s() {
        return this.y;
    }
}
