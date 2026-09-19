package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gi2 implements Iterator {
    public String f;
    public final CharSequence h;
    public int g = 2;
    public int i = 0;
    public int j = Integer.MAX_VALUE;

    public gi2(CharSequence charSequence) {
        this.h = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        hn.M(this.g != 4);
        int i = this.g;
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.g = 4;
            int i3 = this.i;
            while (true) {
                int i4 = this.i;
                if (i4 == -1) {
                    this.g = 3;
                    break;
                }
                int iA = a(i4);
                CharSequence charSequence = this.h;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.i = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.i = iB;
                }
                if (iB != i3) {
                    if (i3 < iA) {
                        charSequence.charAt(i3);
                    }
                    if (i3 < iA) {
                        charSequence.charAt(iA - 1);
                    }
                    int i5 = this.j;
                    if (i5 == 1) {
                        iA = charSequence.length();
                        this.i = -1;
                        if (iA > i3) {
                            charSequence.charAt(iA - 1);
                        }
                    } else {
                        this.j = i5 - 1;
                    }
                    string = charSequence.subSequence(i3, iA).toString();
                    break;
                }
                int i6 = iB + 1;
                this.i = i6;
                if (i6 > charSequence.length()) {
                    this.i = -1;
                }
            }
            this.f = string;
            if (this.g != 3) {
                this.g = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.g = 2;
        String str = this.f;
        this.f = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
