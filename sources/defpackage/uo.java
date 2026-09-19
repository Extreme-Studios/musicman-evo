package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class uo implements Iterator {
    public final String f;
    public int g;
    public int h;
    public int i;
    public int j;

    public uo(String str) {
        this.f = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.g;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.j < 0) {
            this.g = 2;
            return false;
        }
        String str = this.f;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.h; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.g = 1;
                this.j = i;
                this.i = length;
                return true;
            }
        }
        i = -1;
        this.g = 1;
        this.j = i;
        this.i = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.g = 0;
        int i = this.i;
        int i2 = this.h;
        this.h = this.j + i;
        return this.f.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
