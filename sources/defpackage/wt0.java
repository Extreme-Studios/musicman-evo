package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wt0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final e3 e;
    public final tg0 f;
    public int n;
    public final Object g = new Object();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public String o = "";
    public String p = "";
    public String q = "";

    public wt0(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = new e3(i4, 8);
        tg0 tg0Var = new tg0();
        tg0Var.f = i5;
        i6 = (i6 > 64 || i6 < 0) ? 64 : i6;
        if (i7 <= 0) {
            tg0Var.g = 1;
        } else {
            tg0Var.g = i7;
        }
        tg0Var.h = new fu0(i6);
        this.f = tg0Var;
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb.append((String) arrayList.get(i));
            sb.append(' ');
            i++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final void a(String str, boolean z, float f, float f2, float f3, float f4) {
        c(str, z, f, f2, f3, f4);
        synchronized (this.g) {
            try {
                if (this.m < 0) {
                    jn.F("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.g) {
            try {
                int i = this.k;
                int i2 = this.l;
                int i3 = this.b;
                if (!this.d) {
                    i3 = (i2 * i3) + (i * this.a);
                }
                if (i3 > this.n) {
                    this.n = i3;
                    vc3 vc3Var = vc3.C;
                    if (!vc3Var.h.g().k()) {
                        e3 e3Var = this.e;
                        this.o = e3Var.f(this.h);
                        this.p = e3Var.f(this.i);
                    }
                    if (!vc3Var.h.g().l()) {
                        this.q = this.f.b(this.i, this.j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.c) {
                return;
            }
            synchronized (this.g) {
                try {
                    this.h.add(str);
                    this.k += str.length();
                    if (z) {
                        ArrayList arrayList = this.i;
                        arrayList.add(str);
                        this.j.add(new bu0(f, f2, f3, f4, arrayList.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wt0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((wt0) obj).o;
        return str != null && str.equals(this.o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        int i = this.l;
        int i2 = this.n;
        int i3 = this.k;
        String strD = d(this.h);
        String strD2 = d(this.i);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i3).length();
        int length4 = strD.length();
        int length5 = strD2.length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        ec.v(sb, "ActivityContent fetchId: ", i, " score:", i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(strD);
        ec.x(sb, "\n viewableText", strD2, "\n signture: ", str);
        return ec.o(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
