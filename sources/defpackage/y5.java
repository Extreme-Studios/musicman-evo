package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class y5 extends fp implements a6 {
    public CharSequence H;
    public v5 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ b6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(b6 b6Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = b6Var;
        this.J = new Rect();
        this.t = b6Var;
        this.D = true;
        this.E.setFocusable(true);
        this.u = new w5(0, this);
    }

    @Override // defpackage.a6
    public final void e(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // defpackage.a6
    public final void k(int i) {
        this.K = i;
    }

    @Override // defpackage.a6
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        l5 l5Var = this.E;
        boolean zIsShowing = l5Var.isShowing();
        s();
        l5Var.setInputMethodMode(2);
        d();
        yf yfVar = this.h;
        yfVar.setChoiceMode(1);
        yfVar.setTextDirection(i);
        yfVar.setTextAlignment(i2);
        b6 b6Var = this.L;
        int selectedItemPosition = b6Var.getSelectedItemPosition();
        yf yfVar2 = this.h;
        if (l5Var.isShowing() && yfVar2 != null) {
            yfVar2.setListSelectionHidden(false);
            yfVar2.setSelection(selectedItemPosition);
            if (yfVar2.getChoiceMode() != 0) {
                yfVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = b6Var.getViewTreeObserver()) == null) {
            return;
        }
        s5 s5Var = new s5(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(s5Var);
        l5Var.setOnDismissListener(new x5(this, s5Var));
    }

    @Override // defpackage.a6
    public final CharSequence o() {
        return this.H;
    }

    @Override // defpackage.fp, defpackage.a6
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.I = (v5) listAdapter;
    }

    public final void s() {
        int i;
        l5 l5Var = this.E;
        Drawable background = l5Var.getBackground();
        b6 b6Var = this.L;
        Rect rect = b6Var.m;
        if (background != null) {
            background.getPadding(rect);
            boolean z = m70.a;
            i = b6Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = b6Var.getPaddingLeft();
        int paddingRight = b6Var.getPaddingRight();
        int width = b6Var.getWidth();
        int i2 = b6Var.l;
        if (i2 == -2) {
            int iA = b6Var.a(this.I, l5Var.getBackground());
            int i3 = (b6Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = m70.a;
        this.k = b6Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.j) - this.K) + i : paddingLeft + this.K + i;
    }
}
