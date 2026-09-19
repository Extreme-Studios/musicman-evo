package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements rz {
    public final AtomicReference a;

    public fb(uz uzVar) {
        this.a = new AtomicReference(uzVar);
    }

    @Override // defpackage.rz
    public final Iterator iterator() {
        rz rzVar = (rz) this.a.getAndSet(null);
        if (rzVar != null) {
            return rzVar.iterator();
        }
        j7.e("This sequence can be consumed only once.");
        return null;
    }
}
