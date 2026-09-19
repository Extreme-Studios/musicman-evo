package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class dh extends ss0 {
    public final ch q;

    public dh(TextView textView) {
        this.q = new ch(textView);
    }

    @Override // defpackage.ss0
    public final InputFilter[] j(InputFilter[] inputFilterArr) {
        return !(qg.k != null) ? inputFilterArr : this.q.j(inputFilterArr);
    }

    @Override // defpackage.ss0
    public final boolean q() {
        return this.q.s;
    }

    @Override // defpackage.ss0
    public final void u(boolean z) {
        if (qg.k != null) {
            this.q.u(z);
        }
    }

    @Override // defpackage.ss0
    public final void v(boolean z) {
        boolean z2 = qg.k != null;
        ch chVar = this.q;
        if (z2) {
            chVar.v(z);
        } else {
            chVar.s = z;
        }
    }

    @Override // defpackage.ss0
    public final TransformationMethod w(TransformationMethod transformationMethod) {
        return !(qg.k != null) ? transformationMethod : this.q.w(transformationMethod);
    }
}
