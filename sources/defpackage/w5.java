package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class w5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w5(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                y5 y5Var = (y5) obj;
                b6 b6Var = y5Var.L;
                b6Var.setSelection(i);
                if (b6Var.getOnItemClickListener() != null) {
                    b6Var.performItemClick(view, i, y5Var.I.getItemId(i));
                }
                y5Var.dismiss();
                break;
            default:
                fq fqVar = (fq) obj;
                fp fpVar = fqVar.j;
                if (i < 0) {
                    item = !fpVar.E.isShowing() ? null : fpVar.h.getSelectedItem();
                } else {
                    item = fqVar.getAdapter().getItem(i);
                }
                fqVar.setText(fqVar.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = fqVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !fpVar.E.isShowing() ? null : fpVar.h.getSelectedView();
                        i = !fpVar.E.isShowing() ? -1 : fpVar.h.getSelectedItemPosition();
                        j = !fpVar.E.isShowing() ? Long.MIN_VALUE : fpVar.h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(fpVar.h, view, i, j);
                }
                fpVar.dismiss();
                break;
        }
    }
}
