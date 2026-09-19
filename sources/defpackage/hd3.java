package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class hd3 extends FrameLayout implements View.OnClickListener {
    public final ImageButton f;
    public final nf0 g;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hd3(android.content.Context r7, defpackage.rc3 r8, defpackage.nf0 r9) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd3.<init>(android.content.Context, rc3, nf0):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nf0 nf0Var = this.g;
        if (nf0Var != null) {
            nf0Var.B = 2;
            nf0Var.g.finish();
        }
    }
}
