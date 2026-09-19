package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dr1 extends us2 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr1(pn1 pn1Var, md1 md1Var, int i) {
        super(pn1Var, md1Var, 16, false);
        this.i = i;
    }

    @Override // defpackage.us2
    public Set u(nj1 nj1Var) {
        switch (this.i) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.u(nj1Var);
        }
    }

    @Override // defpackage.us2
    public Set x(nj1 nj1Var) {
        switch (this.i) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.x(nj1Var);
        }
    }
}
