package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lo0 implements Comparator {
    public final boolean f;

    public lo0(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb A[RETURN] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iE = ec.e((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = i9 % 496612959;
        qo0 qo0Var = (qo0) obj;
        qo0 qo0Var2 = (qo0) obj2;
        int i11 = qo0Var.g;
        if (i11 != qo0Var2.g) {
            throw new IllegalArgumentException();
        }
        int i12 = i10 ^ iE;
        try {
            if (i11 == 0) {
                throw null;
            }
            int i13 = i11 + i12;
            boolean z = this.f;
            switch (i13) {
                case 1:
                    if (!z) {
                        throw new IllegalArgumentException();
                    }
                    if (qo0Var.l() != qo0Var2.l()) {
                        return 1;
                    }
                    return 0;
                case 2:
                    return Long.compare(qo0Var.m(), qo0Var2.m());
                case 3:
                    xn0 xn0VarN = qo0Var.n();
                    xn0 xn0VarN2 = qo0Var2.n();
                    int i14 = 0;
                    while (true) {
                        length = xn0VarN.a.length;
                        if (i < length && i14 < xn0VarN2.a.length) {
                            int iCompare = Integer.compare(xn0.f(xn0VarN.b(i)), xn0.f(xn0VarN2.b(i14)));
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            i++;
                            i14++;
                        }
                    }
                    return Integer.compare(length, xn0VarN2.a.length);
                case 4:
                    List listO = qo0Var.o();
                    List listO2 = qo0Var2.o();
                    Iterator it = ((ArrayList) listO).iterator();
                    Iterator it2 = ((ArrayList) listO2).iterator();
                    while (it.hasNext()) {
                        if (!it2.hasNext()) {
                            return 1;
                        }
                        int iCompare2 = compare(it.next(), it2.next());
                        if (iCompare2 != 0) {
                            return iCompare2;
                        }
                    }
                    if (it2.hasNext()) {
                        return -1;
                    }
                    return 0;
                case 5:
                    if (!z) {
                        throw new IllegalArgumentException();
                    }
                    if (qo0Var.p() != qo0Var2.p()) {
                        return 1;
                    }
                    return 0;
                case 6:
                    return Double.compare(qo0Var.q(), qo0Var2.q());
                default:
                    return 0;
            }
        } catch (mo0 e) {
            throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
        }
    }
}
