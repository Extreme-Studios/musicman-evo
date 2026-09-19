package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class f13 {
    protected int zzq;

    public static void e(Iterable iterable, List list) {
        Charset charset = m23.a;
        iterable.getClass();
        if (iterable instanceof c33) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof e33) {
                e33 e33Var = (e33) list;
                int i = e33Var.h + size;
                int length = e33Var.g.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        e33Var.g = Arrays.copyOf(e33Var.g, length);
                    } else {
                        e33Var.g = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    b23.e(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                b23.e(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final l13 a() {
        try {
            int iD = ((d23) this).d(null);
            l13 l13Var = n13.g;
            byte[] bArr = new byte[iD];
            Logger logger = u13.b;
            s13 s13Var = new s13(iD, bArr);
            ((d23) this).u(s13Var);
            s13Var.d();
            return new l13(bArr);
        } catch (IOException e) {
            j7.h(f("ByteString"), e);
            return null;
        }
    }

    public final byte[] b() {
        try {
            int iD = ((d23) this).d(null);
            byte[] bArr = new byte[iD];
            Logger logger = u13.b;
            s13 s13Var = new s13(iD, bArr);
            ((d23) this).u(s13Var);
            s13Var.d();
            return bArr;
        } catch (IOException e) {
            j7.h(f("byte array"), e);
            return null;
        }
    }

    public final void c(OutputStream outputStream) {
        d23 d23Var = (d23) this;
        int iD = d23Var.d(null);
        Logger logger = u13.b;
        if (iD > 4096) {
            iD = 4096;
        }
        t13 t13Var = new t13(outputStream, iD);
        d23Var.u(t13Var);
        if (t13Var.f > 0) {
            t13Var.B();
        }
    }

    public abstract int d(j33 j33Var);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + str.length() + 44);
        ec.x(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}
