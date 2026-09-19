package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public f1(d61 d61Var) {
        this.f = 3;
        Objects.requireNonNull(d61Var);
        this.g = d61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((v1) obj).a();
                break;
            case 1:
                d3 d3Var = (d3) obj;
                d3Var.v.obtainMessage(1, d3Var.b).sendToTarget();
                break;
            case 2:
                c40 c40Var = ((Toolbar) obj).Q;
                ur urVar = c40Var == null ? null : c40Var.g;
                if (urVar != null) {
                    urVar.collapseActionView();
                }
                break;
            case 3:
                ((d61) obj).E(true);
                break;
            case 4:
                nf0 nf0Var = (nf0) obj;
                nf0Var.B = 2;
                nf0Var.g.finish();
                break;
            default:
                ((ir1) obj).j.b = true;
                break;
        }
    }

    public /* synthetic */ f1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
