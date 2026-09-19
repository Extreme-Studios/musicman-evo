package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class cp extends DataSetObserver {
    public final /* synthetic */ fp a;

    public cp(fp fpVar) {
        this.a = fpVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        fp fpVar = this.a;
        if (fpVar.E.isShowing()) {
            fpVar.d();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
