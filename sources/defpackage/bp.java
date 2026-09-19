package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bp implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ fp g;

    public /* synthetic */ bp(fp fpVar, int i) {
        this.f = i;
        this.g = fpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        fp fpVar = this.g;
        switch (i) {
            case 0:
                yf yfVar = fpVar.h;
                if (yfVar != null) {
                    yfVar.setListSelectionHidden(true);
                    yfVar.requestLayout();
                }
                break;
            default:
                yf yfVar2 = fpVar.h;
                if (yfVar2 != null && yfVar2.isAttachedToWindow() && fpVar.h.getCount() > fpVar.h.getChildCount() && fpVar.h.getChildCount() <= fpVar.r) {
                    fpVar.E.setInputMethodMode(2);
                    fpVar.d();
                    break;
                }
                break;
        }
    }
}
