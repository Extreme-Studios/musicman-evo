package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public final class s6 extends ToggleButton {
    public final ts2 f;
    public final i6 g;
    public h5 h;

    public s6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        t30.a(getContext(), this);
        ts2 ts2Var = new ts2(this);
        this.f = ts2Var;
        ts2Var.d(attributeSet, R.attr.buttonStyleToggle);
        i6 i6Var = new i6(this);
        this.g = i6Var;
        i6Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private h5 getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new h5(this);
        }
        return this.h;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.a();
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            return ts2Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            return ts2Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i6 i6Var = this.g;
        i6Var.l(colorStateList);
        i6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i6 i6Var = this.g;
        i6Var.m(mode);
        i6Var.b();
    }
}
