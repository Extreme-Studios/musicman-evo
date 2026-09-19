package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class qz extends lz {
    public final /* synthetic */ AtomicReferenceArray e;

    public qz(long j, qz qzVar, int i) {
        super(j, qzVar, i);
        this.e = new AtomicReferenceArray(pz.f);
    }

    @Override // defpackage.lz
    public final int f() {
        return pz.f;
    }

    @Override // defpackage.lz
    public final void g(int i, ic icVar) {
        this.e.set(i, pz.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
