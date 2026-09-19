package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class h5 {
    public final TextView a;
    public final kc2 b;

    public h5(TextView textView) {
        this.a = textView;
        this.b = new kc2(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((ss0) this.b.g).j(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, lw.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((ss0) this.b.g).u(z);
    }

    public final void d(boolean z) {
        ((ss0) this.b.g).v(z);
    }
}
