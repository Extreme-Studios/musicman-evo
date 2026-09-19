package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zf extends ej1 {
    public final /* synthetic */ int p;

    public /* synthetic */ zf(int i) {
        this.p = i;
    }

    @Override // defpackage.ej1
    public final float j(Object obj) {
        switch (this.p) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ej1
    public final void n(rq rqVar, float f) {
        switch (this.p) {
            case 0:
                ((View) rqVar).setAlpha(f);
                break;
            case 1:
                ((View) rqVar).setScaleX(f);
                break;
            case 2:
                ((View) rqVar).setScaleY(f);
                break;
            case 3:
                ((View) rqVar).setRotation(f);
                break;
            case 4:
                ((View) rqVar).setRotationX(f);
                break;
            default:
                ((View) rqVar).setRotationY(f);
                break;
        }
    }
}
