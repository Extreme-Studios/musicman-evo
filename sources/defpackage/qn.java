package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class qn extends wn {
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn() {
        super(true);
        boolean z = true;
        y(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wn.g;
        l9 l9Var = (l9) atomicReferenceFieldUpdater.get(this);
        m9 m9Var = l9Var instanceof m9 ? (m9) l9Var : null;
        if (m9Var == null) {
            z = false;
            break;
        }
        wn wnVarJ = m9Var.j();
        while (!wnVarJ.t()) {
            l9 l9Var2 = (l9) atomicReferenceFieldUpdater.get(wnVarJ);
            m9 m9Var2 = l9Var2 instanceof m9 ? (m9) l9Var2 : null;
            if (m9Var2 == null) {
                z = false;
                break;
            }
            wnVarJ = m9Var2.j();
        }
        this.h = z;
    }

    @Override // defpackage.wn
    public final boolean t() {
        return this.h;
    }

    @Override // defpackage.wn
    public final boolean u() {
        return true;
    }
}
