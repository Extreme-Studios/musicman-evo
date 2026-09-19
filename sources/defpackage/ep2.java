package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ep2 implements oe2 {
    public final oe2 f;
    public Uri g = Uri.EMPTY;

    public ep2(oe2 oe2Var) {
        this.f = oe2Var;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) {
        oe2 oe2Var = this.f;
        this.g = eg2Var.a;
        Map map = Collections.EMPTY_MAP;
        try {
            long jA = oe2Var.a(eg2Var);
            if (oe2Var.h() != null) {
            }
            return jA;
        } finally {
            Uri uriH = oe2Var.h();
            if (uriH != null) {
                this.g = uriH;
            }
            oe2Var.g();
        }
    }

    @Override // defpackage.oe2
    public final void c(qp2 qp2Var) {
        qp2Var.getClass();
        this.f.c(qp2Var);
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) {
        return this.f.d(bArr, i, i2);
    }

    @Override // defpackage.oe2
    public final Map g() {
        return this.f.g();
    }

    @Override // defpackage.oe2
    public final Uri h() {
        return this.f.h();
    }

    @Override // defpackage.oe2
    public final void l() {
        this.f.l();
    }
}
