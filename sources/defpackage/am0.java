package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class am0 {
    public final il0[] a;

    public am0(List list) {
        this.a = (il0[]) list.toArray(new il0[0]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public final qk2 a(Class cls, zh2 zh2Var) {
        il0 il0Var;
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        for (il0 il0Var2 : this.a) {
            if (cls.isAssignableFrom(il0Var2.getClass())) {
                il0Var = (il0) cls.cast(il0Var2);
                if (!zh2Var.b(il0Var)) {
                    il0Var = null;
                }
            } else {
                il0Var = null;
            }
            if (il0Var != null) {
                int length = objArrCopyOf.length;
                int i2 = i + 1;
                int iD = pj2.d(length, i2);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i] = il0Var;
                i = i2;
            }
        }
        return vj2.o(objArrCopyOf, i);
    }

    public final am0 b(am0 am0Var) {
        return am0Var == null ? this : c(am0Var.a);
    }

    public final am0 c(il0... il0VarArr) {
        int length = il0VarArr.length;
        if (length == 0) {
            return this;
        }
        String str = qz1.a;
        il0[] il0VarArr2 = this.a;
        int length2 = il0VarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(il0VarArr2, length2 + length);
        System.arraycopy(il0VarArr, 0, objArrCopyOf, length2, length);
        return new am0((il0[]) objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && am0.class == obj.getClass() && Arrays.equals(this.a, ((am0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(-9223372036854775807L) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        return ec.n(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public am0(il0... il0VarArr) {
        this.a = il0VarArr;
    }
}
