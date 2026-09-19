package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class z2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ d3 f;
    public final /* synthetic */ a3 g;

    public z2(a3 a3Var, d3 d3Var) {
        this.g = a3Var;
        this.f = d3Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a3 a3Var = this.g;
        DialogInterface.OnClickListener onClickListener = a3Var.h;
        d3 d3Var = this.f;
        onClickListener.onClick(d3Var.b, i);
        if (a3Var.i) {
            return;
        }
        d3Var.b.dismiss();
    }
}
