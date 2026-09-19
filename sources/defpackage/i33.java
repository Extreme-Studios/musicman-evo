package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class i33 extends n13 {
    public static final int[] m = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int h;
    public final n13 i;
    public final n13 j;
    public final int k;
    public final int l;

    public i33(n13 n13Var, n13 n13Var2) {
        this.i = n13Var;
        this.j = n13Var2;
        int iD = n13Var.d();
        this.k = iD;
        this.h = n13Var2.d() + iD;
        this.l = Math.max(n13Var.g(), n13Var2.g()) + 1;
    }

    public static int r(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return m[i];
    }

    @Override // defpackage.n13
    public final byte b(int i) {
        n13.q(i, this.h);
        return c(i);
    }

    @Override // defpackage.n13
    public final byte c(int i) {
        int i2 = this.k;
        return i < i2 ? this.i.c(i) : this.j.c(i - i2);
    }

    @Override // defpackage.n13
    public final int d() {
        return this.h;
    }

    @Override // defpackage.n13
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n13) {
            n13 n13Var = (n13) obj;
            int iD = n13Var.d();
            int i = this.h;
            if (i == iD) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.f;
                int i3 = n13Var.f;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    h33 h33Var = new h33(this);
                    l13 l13VarA = h33Var.next();
                    h33 h33Var2 = new h33(n13Var);
                    l13 l13VarA2 = h33Var2.next();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int iD2 = l13VarA.d() - i4;
                        int iD3 = l13VarA2.d() - i5;
                        int iMin = Math.min(iD2, iD3);
                        if (!(i4 == 0 ? l13VarA.s(l13VarA2, i5, iMin) : l13VarA2.s(l13VarA, i4, iMin))) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            j7.a();
                            return false;
                        }
                        if (iMin == iD2) {
                            l13VarA = h33Var.next();
                            i4 = 0;
                        } else {
                            i4 += iMin;
                        }
                        if (iMin == iD3) {
                            l13VarA2 = h33Var2.next();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.n13
    public final void f(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        n13 n13Var = this.i;
        int i5 = this.k;
        if (i4 <= i5) {
            n13Var.f(i, i2, i3, bArr);
            return;
        }
        n13 n13Var2 = this.j;
        if (i >= i5) {
            n13Var2.f(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        n13Var.f(i, i2, i6, bArr);
        n13Var2.f(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // defpackage.n13
    public final int g() {
        return this.l;
    }

    @Override // defpackage.n13
    public final boolean h() {
        return this.h >= r(this.l);
    }

    @Override // defpackage.n13
    public final n13 i(int i, int i2) {
        int i3 = this.h;
        int iA = n13.a(i, i2, i3);
        if (iA == 0) {
            return n13.g;
        }
        if (iA == i3) {
            return this;
        }
        n13 n13Var = this.i;
        int i4 = this.k;
        if (i2 <= i4) {
            return n13Var.i(i, i2);
        }
        int i5 = i2 - i4;
        n13 n13Var2 = this.j;
        return i >= i4 ? n13Var2.i(i - i4, i5) : new i33(n13Var.i(i, n13Var.d()), n13Var2.i(0, i5));
    }

    @Override // defpackage.n13, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new g33(this);
    }

    @Override // defpackage.n13
    public final void j(u13 u13Var) {
        this.i.j(u13Var);
        this.j.j(u13Var);
    }

    @Override // defpackage.n13
    public final int k(int i, int i2, int i3) {
        int i4 = i2 + i3;
        n13 n13Var = this.i;
        int i5 = this.k;
        if (i4 <= i5) {
            return n13Var.k(i, i2, i3);
        }
        n13 n13Var2 = this.j;
        if (i2 >= i5) {
            return n13Var2.k(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return n13Var2.k(n13Var.k(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.n13
    public final r13 l() {
        l13 l13Var;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.l);
        arrayDeque.push(this);
        n13 n13Var = this.i;
        while (n13Var instanceof i33) {
            i33 i33Var = (i33) n13Var;
            arrayDeque.push(i33Var);
            n13Var = i33Var.i;
        }
        l13 l13Var2 = (l13) n13Var;
        while (true) {
            if (!(l13Var2 != null)) {
                int size = arrayList.size();
                int i = 0;
                int iRemaining = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    iRemaining += byteBuffer.remaining();
                    if (byteBuffer.hasArray()) {
                        i |= 1;
                    } else {
                        i = byteBuffer.isDirect() ? i | 2 : i | 4;
                    }
                }
                if (i == 2) {
                    return new p13(iRemaining, arrayList);
                }
                p23 p23Var = new p23();
                p23Var.f = arrayList.iterator();
                p23Var.h = 0;
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    p23Var.h++;
                }
                p23Var.i = -1;
                if (!p23Var.a()) {
                    p23Var.g = m23.c;
                    p23Var.i = 0;
                    p23Var.j = 0;
                    p23Var.n = 0L;
                }
                return new q13(p23Var);
            }
            if (l13Var2 == null) {
                throw new NoSuchElementException();
            }
            do {
                if (arrayDeque.isEmpty()) {
                    l13Var = null;
                    break;
                }
                n13 n13Var2 = ((i33) arrayDeque.pop()).j;
                while (n13Var2 instanceof i33) {
                    i33 i33Var2 = (i33) n13Var2;
                    arrayDeque.push(i33Var2);
                    n13Var2 = i33Var2.i;
                }
                l13Var = (l13) n13Var2;
            } while (l13Var.d() == 0);
            arrayList.add(ByteBuffer.wrap(l13Var2.h, l13Var2.r(), l13Var2.d()).asReadOnlyBuffer());
            l13Var2 = l13Var;
        }
    }

    @Override // defpackage.n13
    /* JADX INFO: renamed from: m */
    public final dl2 iterator() {
        return new g33(this);
    }
}
