package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.o = false;
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                hd3 hd3Var = (hd3) obj;
                hd3Var.setEnabled(true);
                hd3Var.f.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.o = false;
                break;
            case 1:
                n3 n3Var = (n3) obj;
                ArrayList arrayList = new ArrayList(n3Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((lq) arrayList.get(i2)).b.t;
                    if (colorStateList != null) {
                        n3Var.setTintList(colorStateList);
                    }
                }
                break;
            default:
                hd3 hd3Var = (hd3) obj;
                hd3Var.setEnabled(true);
                hd3Var.f.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                n3 n3Var = (n3) obj;
                ArrayList arrayList = new ArrayList(n3Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    nq nqVar = ((lq) arrayList.get(i2)).b;
                    ColorStateList colorStateList = nqVar.t;
                    if (colorStateList != null) {
                        n3Var.setTint(colorStateList.getColorForState(nqVar.x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 2:
                hd3 hd3Var = (hd3) obj;
                hd3Var.setEnabled(false);
                hd3Var.f.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
