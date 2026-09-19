package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public class m5 extends RadioButton implements z30 {
    public final i4 f;
    public final ts2 g;
    public final i6 h;
    public h5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        x30.a(context);
        t30.a(getContext(), this);
        i4 i4Var = new i4(this);
        this.f = i4Var;
        i4Var.c(attributeSet, R.attr.radioButtonStyle);
        ts2 ts2Var = new ts2(this);
        this.g = ts2Var;
        ts2Var.d(attributeSet, R.attr.radioButtonStyle);
        i6 i6Var = new i6(this);
        this.h = i6Var;
        i6Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private h5 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new h5(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ts2 ts2Var = this.g;
        if (ts2Var != null) {
            ts2Var.a();
        }
        i6 i6Var = this.h;
        if (i6Var != null) {
            i6Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ts2 ts2Var = this.g;
        if (ts2Var != null) {
            return ts2Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ts2 ts2Var = this.g;
        if (ts2Var != null) {
            return ts2Var.c();
        }
        return null;
    }

    @Override // defpackage.z30
    public ColorStateList getSupportButtonTintList() {
        i4 i4Var = this.f;
        if (i4Var != null) {
            return (ColorStateList) i4Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i4 i4Var = this.f;
        if (i4Var != null) {
            return (PorterDuff.Mode) i4Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ts2 ts2Var = this.g;
        if (ts2Var != null) {
            ts2Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ts2 ts2Var = this.g;
        if (ts2Var != null) {
            ts2Var.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i4 i4Var = this.f;
        if (i4Var != null) {
            if (i4Var.e) {
                i4Var.e = false;
            } else {
                i4Var.e = true;
                i4Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i6 i6Var = this.h;
        if (i6Var != null) {
            i6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i6 i6Var = this.h;
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
        ts2 ts2Var = this.g;
        if (ts2Var != null) {
            ts2Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ts2 ts2Var = this.g;
        if (ts2Var != null) {
            ts2Var.i(mode);
        }
    }

    @Override // defpackage.z30
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i4 i4Var = this.f;
        if (i4Var != null) {
            i4Var.a = colorStateList;
            i4Var.c = true;
            i4Var.a();
        }
    }

    @Override // defpackage.z30
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i4 i4Var = this.f;
        if (i4Var != null) {
            i4Var.b = mode;
            i4Var.d = true;
            i4Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i6 i6Var = this.h;
        i6Var.l(colorStateList);
        i6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i6 i6Var = this.h;
        i6Var.m(mode);
        i6Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(jn.f(getContext(), i));
    }
}
