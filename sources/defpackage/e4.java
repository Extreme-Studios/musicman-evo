package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class e4 extends Button {
    public final ts2 f;
    public final i6 g;
    public h5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        x30.a(context);
        t30.a(getContext(), this);
        ts2 ts2Var = new ts2(this);
        this.f = ts2Var;
        ts2Var.d(attributeSet, i);
        i6 i6Var = new i6(this);
        this.g = i6Var;
        i6Var.f(attributeSet, i);
        i6Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private h5 getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new h5(this);
        }
        return this.h;
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
    public int getAutoSizeMaxTextSize() {
        if (m70.c) {
            return super.getAutoSizeMaxTextSize();
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            return Math.round(((r6) i6Var.l).e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (m70.c) {
            return super.getAutoSizeMinTextSize();
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            return Math.round(((r6) i6Var.l).d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (m70.c) {
            return super.getAutoSizeStepGranularity();
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            return Math.round(((r6) i6Var.l).c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (m70.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        i6 i6Var = this.g;
        return i6Var != null ? ((r6) i6Var.l).f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (m70.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            return ((r6) i6Var.l).a;
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i6 i6Var = this.g;
        if (i6Var == null || m70.c) {
            return;
        }
        ((r6) i6Var.l).a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i6 i6Var = this.g;
        if (i6Var != null) {
            r6 r6Var = (r6) i6Var.l;
            if (m70.c || !r6Var.f()) {
                return;
            }
            r6Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (m70.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (m70.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (m70.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.k(i);
        }
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
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yd.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        i6 i6Var = this.g;
        if (i6Var != null) {
            ((TextView) i6Var.d).setAllCaps(z);
        }
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = m70.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            r6 r6Var = (r6) i6Var.l;
            if (z || r6Var.f()) {
                return;
            }
            r6Var.g(i, f);
        }
    }
}
