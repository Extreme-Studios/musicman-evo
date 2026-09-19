package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i12 extends c9 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public i12(int i, long j) {
        super(i, 1);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final l12 b(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            l12 l12Var = (l12) arrayList.get(i2);
            if (l12Var.b == i) {
                return l12Var;
            }
        }
        return null;
    }

    public final i12 c(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i12 i12Var = (i12) arrayList.get(i2);
            if (i12Var.b == i) {
                return i12Var;
            }
        }
        return null;
    }

    @Override // defpackage.c9
    public final String toString() {
        String strA = c9.a(this.b);
        String string = Arrays.toString(this.d.toArray());
        String string2 = Arrays.toString(this.e.toArray());
        int length = strA.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        ec.x(sb, strA, " leaves: ", string, " containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
