package defpackage;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bl1 extends t33 implements j11 {
    public final Bundle h;

    public bl1(Set set) {
        super(set);
        this.h = new Bundle();
    }

    @Override // defpackage.j11
    public final synchronized void h(String str, Bundle bundle) {
        this.h.putAll(bundle);
        L1(zf0.p);
    }
}
