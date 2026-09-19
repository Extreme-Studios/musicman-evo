package defpackage;

import android.content.DialogInterface;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ew1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ hw1 g;
    public final /* synthetic */ nf0 h;

    public /* synthetic */ ew1(hw1 hw1Var, nf0 nf0Var, int i) {
        this.f = i;
        this.g = hw1Var;
        this.h = nf0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f;
        nf0 nf0Var = this.h;
        hw1 hw1Var = this.g;
        switch (i2) {
            case 0:
                hw1Var.j.b(hw1Var.k);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                hw1Var.H3(hw1Var.k, "dialog_click", map);
                if (nf0Var != null) {
                    nf0Var.y();
                }
                break;
            default:
                hw1Var.j.b(hw1Var.k);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                hw1Var.H3(hw1Var.k, "rtsdc", map2);
                if (nf0Var != null) {
                    nf0Var.y();
                }
                break;
        }
    }
}
