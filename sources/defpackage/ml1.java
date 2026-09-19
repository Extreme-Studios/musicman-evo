package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ml1 implements Runnable {
    public final /* synthetic */ int f;
    public final WeakReference g;

    public /* synthetic */ ml1(nl1 nl1Var, int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.g = new WeakReference(nl1Var);
                break;
            default:
                this.g = new WeakReference(nl1Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        WeakReference weakReference = this.g;
        switch (i) {
            case 0:
                nl1 nl1Var = (nl1) weakReference.get();
                if (nl1Var != null) {
                    nl1Var.L1(fl1.k);
                }
                break;
            default:
                nl1 nl1Var2 = (nl1) weakReference.get();
                if (nl1Var2 != null) {
                    nl1Var2.L1(el1.k);
                }
                break;
        }
    }
}
