package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class d13 implements Closeable, Flushable {
    public static final Pattern o = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] p = new String[128];
    public final xp f;
    public int[] g;
    public int h;
    public final m03 i;
    public final String j;
    public final String k;
    public final boolean l;
    public int m;
    public String n;

    static {
        for (int i = 0; i <= 31; i++) {
            p[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public d13(xp xpVar) {
        int[] iArr = new int[32];
        this.g = iArr;
        boolean z = false;
        this.h = 0;
        if (iArr.length == 0) {
            this.g = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.g;
        int i = this.h;
        this.h = i + 1;
        iArr2[i] = 6;
        this.m = 2;
        this.f = xpVar;
        m03 m03Var = m03.d;
        Objects.requireNonNull(m03Var);
        String str = m03Var.a;
        this.i = m03Var;
        this.k = ",";
        if (m03Var.c) {
            this.j = ": ";
            if (str.isEmpty()) {
                this.k = ", ";
            }
        } else {
            this.j = ":";
        }
        if (str.isEmpty() && m03Var.b.isEmpty()) {
            z = true;
        }
        this.l = z;
    }

    public final void a(int i, int i2, char c) {
        int iB = b();
        if (iB != i2 && iB != i) {
            j7.e("Nesting problem.");
            return;
        }
        String str = this.n;
        if (str != null) {
            j7.e("Dangling name: ".concat(str));
            return;
        }
        this.h--;
        if (iB == i2) {
            e();
        }
        this.f.write(c);
    }

    public final int b() {
        int i = this.h;
        if (i != 0) {
            return this.g[i - 1];
        }
        j7.e("JsonWriter is closed.");
        return 0;
    }

    public final void c() {
        if (this.n != null) {
            int iB = b();
            if (iB == 5) {
                this.f.write(this.k);
            } else if (iB != 3) {
                j7.e("Nesting problem.");
                return;
            }
            e();
            this.g[this.h - 1] = 4;
            d(this.n);
            this.n = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.getClass();
        int i = this.h;
        if (i > 1 || (i == 1 && this.g[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.h = 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    public final void d(String str) {
        String str2;
        xp xpVar = this.f;
        xpVar.write(34);
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                str2 = p[cCharAt];
                if (str2 != null) {
                    if (i2 < i) {
                        xpVar.write(str, i2, i - i2);
                    }
                    xpVar.write(str2);
                    i2 = i3;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                    xpVar.write(str, i2, i - i2);
                }
                xpVar.write(str2);
                i2 = i3;
            }
            i = i3;
        }
        if (i2 < length) {
            xpVar.write(str, i2, length - i2);
        }
        xpVar.write(34);
    }

    public final void e() throws IOException {
        if (this.l) {
            return;
        }
        m03 m03Var = this.i;
        String str = m03Var.a;
        xp xpVar = this.f;
        xpVar.write(str);
        int i = this.h;
        for (int i2 = 1; i2 < i; i2++) {
            xpVar.write(m03Var.b);
        }
    }

    public final void f() {
        int iB = b();
        if (iB == 1) {
            this.g[this.h - 1] = 2;
            e();
            return;
        }
        xp xpVar = this.f;
        if (iB == 2) {
            xpVar.append((CharSequence) this.k);
            e();
            return;
        }
        if (iB == 4) {
            xpVar.append((CharSequence) this.j);
            this.g[this.h - 1] = 5;
            return;
        }
        if (iB != 6) {
            if (iB != 7) {
                j7.e("Nesting problem.");
                return;
            } else if (this.m != 1) {
                j7.e("JSON must have only one top-level value.");
                return;
            }
        }
        this.g[this.h - 1] = 7;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.h != 0) {
            this.f.getClass();
        } else {
            j7.e("JsonWriter is closed.");
        }
    }
}
