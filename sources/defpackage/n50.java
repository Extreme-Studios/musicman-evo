package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class n50 implements Spannable {
    public boolean f = false;
    public Spannable g;

    public n50(Spannable spannable) {
        this.g = spannable;
    }

    public final void a() {
        Spannable spannable = this.g;
        if (!this.f) {
            if ((Build.VERSION.SDK_INT < 28 ? new ig(23) : new m50(23)).c(spannable)) {
                this.g = new SpannableString(spannable);
            }
        }
        this.f = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.g.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.g.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.g.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.g.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.g.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.g.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.g.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.g.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.g.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.g.toString();
    }
}
