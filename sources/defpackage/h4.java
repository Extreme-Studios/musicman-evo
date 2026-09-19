package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends CheckedTextView {
    public final i4 f;
    public final ts2 g;
    public final i6 h;
    public h5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        x30.a(context);
        t30.a(getContext(), this);
        i6 i6Var = new i6(this);
        this.h = i6Var;
        i6Var.f(attributeSet, R.attr.checkedTextViewStyle);
        i6Var.b();
        ts2 ts2Var = new ts2(this);
        this.g = ts2Var;
        ts2Var.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f = new i4(this);
        Context context2 = getContext();
        int[] iArr = lw.l;
        r52 r52VarR = r52.r(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        w60.h(this, getContext(), iArr, attributeSet, (TypedArray) r52VarR.h, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(jn.f(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(jn.f(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(jn.f(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(r52VarR.j(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(sf.c(typedArray.getInt(3, -1), null));
            }
            r52VarR.x();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            r52VarR.x();
            throw th;
        }
    }

    private h5 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new h5(this);
        }
        return this.i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        i6 i6Var = this.h;
        if (i6Var != null) {
            i6Var.b();
        }
        ts2 ts2Var = this.g;
        if (ts2Var != null) {
            ts2Var.a();
        }
        i4 i4Var = this.f;
        if (i4Var != null) {
            i4Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return yd.q(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        i4 i4Var = this.f;
        if (i4Var != null) {
            return (ColorStateList) i4Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        hn.o(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i4 i4Var = this.f;
        if (i4Var != null) {
            if (i4Var.e) {
                i4Var.e = false;
            } else {
                i4Var.e = true;
                i4Var.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yd.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i4 i4Var = this.f;
        if (i4Var != null) {
            i4Var.a = colorStateList;
            i4Var.c = true;
            i4Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i4 i4Var = this.f;
        if (i4Var != null) {
            i4Var.b = mode;
            i4Var.d = true;
            i4Var.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        i6 i6Var = this.h;
        if (i6Var != null) {
            i6Var.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(jn.f(getContext(), i));
    }
}
