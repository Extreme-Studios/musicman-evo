package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b23 implements Cloneable {
    public final d23 f;
    public d23 g;

    public b23(d23 d23Var) {
        this.f = d23Var;
        if (d23Var.h()) {
            j7.p("Default instance must be immutable.");
            throw null;
        }
        this.g = d23Var.p();
    }

    public static void e(int i, List list) {
        int size = list.size() - i;
        String strK = ec.k(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(strK);
            }
            list.remove(size2);
        }
    }

    public final void a(byte[] bArr, v13 v13Var) throws o23 {
        int length = bArr.length;
        b();
        try {
            d33.c.a(this.g.getClass()).i(this.g, bArr, 0, length, new i13(v13Var));
        } catch (o23 e) {
            throw e;
        } catch (IOException e2) {
            j7.h("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void b() {
        if (this.g.h()) {
            return;
        }
        d23 d23VarP = this.f.p();
        d33.c.a(d23VarP.getClass()).c(d23VarP, this.g);
        this.g = d23VarP;
    }

    public final d23 c() {
        boolean zH = this.g.h();
        d23 d23Var = this.g;
        if (zH) {
            d23Var.getClass();
            d33.c.a(d23Var.getClass()).h(d23Var);
            d23Var.i();
            d23Var = this.g;
        }
        d23Var.getClass();
        if (d23.w(d23Var, true)) {
            return d23Var;
        }
        throw new o33();
    }

    public final Object clone() {
        b23 b23Var = (b23) this.f.v(5, null);
        boolean zH = this.g.h();
        d23 d23Var = this.g;
        if (zH) {
            d23Var.getClass();
            d33.c.a(d23Var.getClass()).h(d23Var);
            d23Var.i();
            d23Var = this.g;
        }
        b23Var.g = d23Var;
        return b23Var;
    }

    public final b23 d(d23 d23Var) {
        if (this.f.equals(d23Var)) {
            return this;
        }
        b();
        d23 d23Var2 = this.g;
        d33.c.a(d23Var2.getClass()).c(d23Var2, d23Var);
        return this;
    }
}
