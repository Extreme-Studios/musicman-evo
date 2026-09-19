package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {
    public Object a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final View f;

    public /* synthetic */ i4(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.c) {
                    drawableMutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        h4 h4Var = (h4) this.f;
        Drawable checkMarkDrawable = h4Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.c) {
                    drawableMutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(h4Var.getDrawableState());
                }
                h4Var.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = lw.m;
        r52 r52VarR = r52.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        w60.h(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r52VarR.h, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(jn.f(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(jn.f(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(jn.f(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(r52VarR.j(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(sf.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            r52VarR.x();
        }
    }

    public void d() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        de1 de1Var = (de1) this.b;
        if (this.c) {
            return;
        }
        Activity activity = (Activity) this.a;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(de1Var);
            }
        }
        de1 de1Var2 = (de1) this.f;
        zf0 zf0Var = vc3.C.B;
        fb1 fb1Var = new fb1(de1Var2, de1Var);
        View view = (View) ((WeakReference) fb1Var.f).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            fb1Var.R1(viewTreeObserver2);
        }
        this.c = true;
    }

    public i4(Activity activity, de1 de1Var, de1 de1Var2) {
        this.a = activity;
        this.f = de1Var;
        this.b = de1Var2;
    }
}
