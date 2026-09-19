package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class d4 extends AutoCompleteTextView {
    public static final int[] i = {R.attr.popupBackground};
    public final ts2 f;
    public final i6 g;
    public final vg2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x30.a(context);
        t30.a(getContext(), this);
        r52 r52VarR = r52.r(getContext(), attributeSet, i, i2);
        if (((TypedArray) r52VarR.h).hasValue(0)) {
            setDropDownBackgroundDrawable(r52VarR.k(0));
        }
        r52VarR.x();
        ts2 ts2Var = new ts2(this);
        this.f = ts2Var;
        ts2Var.d(attributeSet, i2);
        i6 i6Var = new i6(this);
        this.g = i6Var;
        i6Var.f(attributeSet, i2);
        i6Var.b();
        vg2 vg2Var = new vg2(this, 2);
        this.h = vg2Var;
        vg2Var.j(attributeSet, i2);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerI = vg2Var.i(keyListener);
        if (keyListenerI == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerI);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return yd.q(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        hn.o(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.h.k(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.f(i2);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yd.r(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(jn.f(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.l(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.i(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.g(context, i2);
        }
    }
}
