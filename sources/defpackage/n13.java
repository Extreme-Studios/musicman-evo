package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class n13 implements Iterable, Serializable {
    public static final l13 g = new l13(m23.b);
    public int f = 0;

    static {
        int i = h13.a;
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(ec.k(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(ec.l(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length()), "Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(ec.l(new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length()), "End index: ", i2, " >= ", i3));
    }

    public static n13 e(Iterator it, int i) {
        if (i <= 0) {
            j7.m("length (", i, ") must be >= 1");
            return null;
        }
        if (i == 1) {
            return (n13) it.next();
        }
        int i2 = i >>> 1;
        n13 n13VarE = e(it, i2);
        n13 n13VarE2 = e(it, i - i2);
        if (Integer.MAX_VALUE - n13VarE.d() < n13VarE2.d()) {
            int iD = n13VarE.d();
            int iD2 = n13VarE2.d();
            j7.p(ec.l(new StringBuilder(String.valueOf(iD).length() + 31 + String.valueOf(iD2).length()), "ByteString would be too long: ", iD, "+", iD2));
            return null;
        }
        if (n13VarE2.d() == 0) {
            return n13VarE;
        }
        if (n13VarE.d() == 0) {
            return n13VarE2;
        }
        int iD3 = n13VarE2.d() + n13VarE.d();
        if (iD3 < 128) {
            int iD4 = n13VarE.d();
            int iD5 = n13VarE2.d();
            int i3 = iD4 + iD5;
            byte[] bArr = new byte[i3];
            a(0, iD4, n13VarE.d());
            a(0, iD4, i3);
            if (iD4 > 0) {
                n13VarE.f(0, 0, iD4, bArr);
            }
            a(0, iD5, n13VarE2.d());
            a(iD4, i3, i3);
            if (iD5 > 0) {
                n13VarE2.f(0, iD4, iD5, bArr);
            }
            return new l13(bArr);
        }
        if (n13VarE instanceof i33) {
            i33 i33Var = (i33) n13VarE;
            n13 n13Var = i33Var.i;
            n13 n13Var2 = i33Var.j;
            if (n13VarE2.d() + n13Var2.d() < 128) {
                int iD6 = n13Var2.d();
                int iD7 = n13VarE2.d();
                int i4 = iD6 + iD7;
                byte[] bArr2 = new byte[i4];
                a(0, iD6, n13Var2.d());
                a(0, iD6, i4);
                if (iD6 > 0) {
                    n13Var2.f(0, 0, iD6, bArr2);
                }
                a(0, iD7, n13VarE2.d());
                a(iD6, i4, i4);
                if (iD7 > 0) {
                    n13VarE2.f(0, iD6, iD7, bArr2);
                }
                return new i33(n13Var, new l13(bArr2));
            }
            if (n13Var.g() > n13Var2.g() && i33Var.l > n13VarE2.g()) {
                return new i33(n13Var, new i33(n13Var2, n13VarE2));
            }
        }
        if (iD3 >= i33.r(Math.max(n13VarE.g(), n13VarE2.g()) + 1)) {
            return new i33(n13VarE, n13VarE2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        s90.L(n13VarE, arrayDeque);
        s90.L(n13VarE2, arrayDeque);
        n13 i33Var2 = (n13) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            i33Var2 = new i33((n13) arrayDeque.pop(), i33Var2);
        }
        return i33Var2;
    }

    public static l13 n(byte[] bArr, int i, int i2) {
        a(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new l13(bArr2);
    }

    public static n13 o(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            int size2 = arrayList.size();
            size = 0;
            int i = 0;
            while (i < size2) {
                arrayList.get(i);
                i++;
                size++;
            }
        } else {
            size = arrayList.size();
        }
        return size == 0 ? g : e(arrayList.iterator(), size);
    }

    public static void q(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(ec.j(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(ec.l(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length()), "Index > length: ", i, ", ", i2));
        }
    }

    public abstract byte b(int i);

    public abstract byte c(int i);

    public abstract int d();

    public abstract boolean equals(Object obj);

    public abstract void f(int i, int i2, int i3, byte[] bArr);

    public abstract int g();

    public abstract boolean h();

    public final int hashCode() {
        int iK = this.f;
        if (iK == 0) {
            int iD = d();
            iK = k(iD, 0, iD);
            if (iK == 0) {
                iK = 1;
            }
            this.f = iK;
        }
        return iK;
    }

    public abstract n13 i(int i, int i2);

    public abstract void j(u13 u13Var);

    public abstract int k(int i, int i2, int i3);

    public abstract r13 l();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public dl2 iterator() {
        return new j13(this);
    }

    public final byte[] p() {
        int iD = d();
        if (iD == 0) {
            return m23.b;
        }
        byte[] bArr = new byte[iD];
        f(0, 0, iD, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        String strO = d() <= 50 ? rs0.o(this) : rs0.o(i(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iD);
        sb.append(" contents=\"");
        return ec.m(sb, strO, "\">");
    }
}
