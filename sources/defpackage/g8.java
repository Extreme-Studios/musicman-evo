package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class g8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public g8(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        rq rqVar = this.a.u;
        if (rqVar != null) {
            pq pqVar = rqVar.g;
            if (pqVar.j != fFloatValue) {
                pqVar.j = fFloatValue;
                rqVar.k = true;
                rqVar.l = true;
                rqVar.invalidateSelf();
            }
        }
    }
}
