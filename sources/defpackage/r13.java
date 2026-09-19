package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r13 {
    public int a;
    public int b;
    public n9 c;

    public static o13 d(byte[] bArr, int i, int i2) {
        o13 o13Var = new o13(bArr, i, i2);
        try {
            o13Var.B(i2);
            return o13Var;
        } catch (o23 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int f(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long g(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract long A();

    public abstract int B(int i);

    public abstract void a(int i);

    public abstract boolean b();

    public abstract int c();

    public final void e() {
        boolean zJ;
        do {
            int iH = h();
            if (iH == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                j7.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i2 + 1;
                zJ = j(iH);
                this.b--;
            }
        } while (zJ);
    }

    public abstract int h();

    public abstract void i(int i);

    public abstract boolean j(int i);

    public abstract double k();

    public abstract float l();

    public abstract long m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract boolean r();

    public abstract String s();

    public abstract String t();

    public abstract l13 u();

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public abstract int z();
}
