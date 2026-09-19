package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class u13 {
    public static final Logger b = Logger.getLogger(u13.class.getName());
    public static final boolean c = u33.e;
    public j52 a;

    public static int a(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int b(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int c(String str) {
        int length;
        try {
            length = x33.b(str);
        } catch (w33 unused) {
            length = str.getBytes(m23.a).length;
        }
        return a(length) + length;
    }

    public final void d() {
        if (l() == 0) {
            return;
        }
        j7.e("Did not write as much data as expected.");
    }

    public final void e(String str, w33 w33Var) throws e13 {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) w33Var);
        byte[] bytes = str.getBytes(m23.a);
        try {
            int length = bytes.length;
            v(length);
            k(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new e13(e);
        }
    }

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public abstract void h(int i, int i2);

    public abstract void i(int i, int i2);

    public abstract void j(int i, long j);

    public abstract void k(byte[] bArr, int i, int i2);

    public abstract int l();

    public abstract void m(int i, long j);

    public abstract void n(int i, boolean z);

    public abstract void o(String str, int i);

    public abstract void p(int i, n13 n13Var);

    public abstract void q(n13 n13Var);

    public abstract void r(int i, byte[] bArr);

    public abstract void s(f13 f13Var);

    public abstract void t(byte b2);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(int i);

    public abstract void x(long j);

    public abstract void y(long j);

    public abstract void z(String str);
}
