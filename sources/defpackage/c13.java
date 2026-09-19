package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c13 implements Closeable {
    public final StringReader f;
    public long m;
    public int n;
    public int[] o;
    public String[] q;
    public int[] r;
    public final char[] g = new char[1024];
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int p = 1;

    public c13(StringReader stringReader) {
        int[] iArr = new int[32];
        this.o = iArr;
        iArr[0] = 6;
        this.q = new String[32];
        this.r = new int[32];
        this.f = stringReader;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0152  */
    /* JADX WARN: Code duplicated, block: B:103:0x0156  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x0202  */
    /* JADX WARN: Code duplicated, block: B:177:0x0207  */
    /* JADX WARN: Code duplicated, block: B:182:0x0214 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:183:0x0215  */
    /* JADX WARN: Code duplicated, block: B:185:0x021f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0223  */
    /* JADX WARN: Code duplicated, block: B:189:0x0229 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:238:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0146  */
    /* JADX WARN: Code duplicated, block: B:99:0x014a A[PHI: r1 r3
  0x014a: PHI (r1v30 int) = (r1v29 int), (r1v47 int) binds: [B:91:0x0131, B:98:0x0146] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r3v9 int) = (r3v8 int), (r3v10 int) binds: [B:91:0x0131, B:98:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ce, code lost:
    
        if (r6 == 0) goto L154;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c13.a():int");
    }

    public final String b() throws IOException {
        String str;
        int iA = this.l;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 10) {
            str = g();
        } else if (iA == 8) {
            str = f('\'');
        } else if (iA == 9) {
            str = f('\"');
        } else if (iA == 11) {
            str = null;
        } else if (iA == 15) {
            str = Long.toString(this.m);
        } else {
            if (iA != 16) {
                throw n("a string");
            }
            str = new String(this.g, this.h, this.n);
            this.h += this.n;
        }
        this.l = 0;
        int[] iArr = this.r;
        int i = this.p - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final String c() {
        int i = this.j + 1;
        int i2 = this.h - this.k;
        StringBuilder sb = new StringBuilder("$");
        for (int i3 = 0; i3 < this.p; i3++) {
            int i4 = this.o[i3];
            switch (i4) {
                case 1:
                case 2:
                    int i5 = this.r[i3];
                    sb.append('[');
                    sb.append(i5);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.q[i3];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(ec.j(new StringBuilder(String.valueOf(i4).length() + 21), "Unknown scope value: ", i4));
            }
        }
        int i6 = i2 + 1;
        String string = sb.toString();
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i6).length();
        StringBuilder sb2 = new StringBuilder(string.length() + length2 + length + 17 + 6);
        ec.v(sb2, " at line ", i, " column ", i6);
        return ec.m(sb2, " path ", string);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.l = 0;
        this.o[0] = 8;
        this.p = 1;
        this.f.close();
    }

    public final int d() throws IOException {
        int iA = this.l;
        if (iA == 0) {
            iA = a();
        }
        switch (iA) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final boolean e(char c) throws e13 {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        l();
        throw null;
    }

    public final String f(char c) throws e13 {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.h;
            int i3 = this.i;
            int i4 = i2;
            while (true) {
                cArr = this.g;
                if (i2 < i3) {
                    int i5 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        int i6 = (i5 - i4) - 1;
                        this.h = i5;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    }
                    char c3 = '\n';
                    if (c2 == '\\') {
                        int i7 = i5 - i4;
                        int i8 = i7 - 1;
                        this.h = i5;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i7 + i7, 16));
                        }
                        sb.append(cArr, i4, i8);
                        if (this.h == this.i && !j(1)) {
                            m("Unterminated escape sequence");
                            throw null;
                        }
                        int i9 = this.h;
                        int i10 = i9 + 1;
                        this.h = i10;
                        char c4 = cArr[i9];
                        if (c4 != '\n') {
                            if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                                if (c4 == 'b') {
                                    c3 = '\b';
                                } else if (c4 == 'f') {
                                    c3 = '\f';
                                } else if (c4 != 'n') {
                                    if (c4 == 'r') {
                                        c3 = '\r';
                                    } else if (c4 == 't') {
                                        c3 = '\t';
                                    } else {
                                        if (c4 != 'u') {
                                            m("Invalid escape sequence");
                                            throw null;
                                        }
                                        if (i9 + 5 > this.i && !j(4)) {
                                            m("Unterminated escape sequence");
                                            throw null;
                                        }
                                        int i11 = this.h;
                                        int i12 = i11 + 4;
                                        int i13 = 0;
                                        while (i11 < i12) {
                                            int i14 = i13 << 4;
                                            char c5 = cArr[i11];
                                            if (c5 >= '0' && c5 <= '9') {
                                                i = c5 - '0';
                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                i = c5 - 'W';
                                            } else {
                                                if (c5 < 'A' || c5 > 'F') {
                                                    m("Malformed Unicode escape \\u".concat(new String(cArr, this.h, 4)));
                                                    throw null;
                                                }
                                                i = c5 - '7';
                                            }
                                            i13 = i + i14;
                                            i11++;
                                        }
                                        this.h += 4;
                                        c3 = (char) i13;
                                    }
                                }
                            }
                            sb.append(c3);
                            i4 = this.h;
                            i3 = this.i;
                            i2 = i4;
                        } else {
                            this.j++;
                            this.k = i10;
                        }
                        c3 = c4;
                        sb.append(c3);
                        i4 = this.h;
                        i3 = this.i;
                        i2 = i4;
                    } else {
                        if (c2 == '\n') {
                            this.j++;
                            this.k = i5;
                        }
                        i2 = i5;
                    }
                }
            }
            int i15 = i2 - i4;
            if (sb == null) {
                sb = new StringBuilder(Math.max(i15 + i15, 16));
            }
            sb.append(cArr, i4, i15);
            this.h = i2;
        } while (j(1));
        m("Unterminated string");
        throw null;
    }

    public final String g() throws e13 {
        char[] cArr;
        String string;
        int i = 0;
        int i2 = 0;
        StringBuilder sb = null;
        while (true) {
            int i3 = this.h + i2;
            int i4 = this.i;
            cArr = this.g;
            if (i3 < i4) {
                char c = cArr[i3];
                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                    if (c != '#') {
                        if (c != ',') {
                            if (c != '/' && c != '=') {
                                if (c != '{' && c != '}' && c != ':') {
                                    if (c != ';') {
                                        switch (c) {
                                            case '[':
                                            case ']':
                                                break;
                                            case '\\':
                                                break;
                                            default:
                                                i2++;
                                                continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    l();
                    throw null;
                }
                i = i2;
            } else if (i2 >= 1024) {
                if (sb == null) {
                    sb = new StringBuilder(Math.max(i2, 16));
                }
                sb.append(cArr, this.h, i2);
                this.h += i2;
                if (j(1)) {
                    i2 = 0;
                }
            } else if (!j(i2 + 1)) {
                i = i2;
            }
        }
        int i5 = this.h;
        if (sb == null) {
            string = new String(cArr, i5, i);
        } else {
            sb.append(cArr, i5, i);
            string = sb.toString();
        }
        this.h += i;
        return string;
    }

    public final void h(int i) throws e13 {
        int i2 = this.p;
        if (i2 - 1 >= 1280) {
            String strC = c();
            throw new e13(ec.m(new StringBuilder(strC.length() + 26), "Nesting limit 1280 reached", strC));
        }
        int[] iArr = this.o;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.o = Arrays.copyOf(iArr, i3);
            this.r = Arrays.copyOf(this.r, i3);
            this.q = (String[]) Arrays.copyOf(this.q, i3);
        }
        int[] iArr2 = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean j(int i) throws IOException {
        int i2;
        int i3 = this.k;
        int i4 = this.h;
        this.k = i3 - i4;
        int i5 = this.i;
        char[] cArr = this.g;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.i = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.i = 0;
        }
        this.h = 0;
        do {
            int i7 = this.i;
            int i8 = this.f.read(cArr, i7, 1024 - i7);
            if (i8 == -1) {
                return false;
            }
            i2 = this.i + i8;
            this.i = i2;
            if (this.j == 0 && this.k == 0 && i2 > 0 && cArr[0] == 65279) {
                this.h++;
                this.k = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final int k(boolean z) throws IOException {
        int i = this.h;
        int i2 = this.i;
        while (true) {
            if (i == i2) {
                this.h = i;
                if (!j(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(c()));
                    }
                    return -1;
                }
                i = this.h;
                i2 = this.i;
            }
            int i3 = i + 1;
            char c = this.g[i];
            if (c == '\n') {
                this.j++;
                this.k = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c != '/') {
                    if (c != '#') {
                        this.h = i3;
                        return c;
                    }
                    this.h = i3;
                    l();
                    throw null;
                }
                this.h = i3;
                if (i3 == i2) {
                    this.h = i;
                    boolean zJ = j(2);
                    this.h++;
                    if (!zJ) {
                        return 47;
                    }
                }
                l();
                throw null;
            }
            i = i3;
        }
    }

    public final void l() throws e13 {
        m("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void m(String str) throws e13 {
        String strC = c();
        throw new e13(ec.n(new StringBuilder(str.length() + strC.length() + 79), str, strC, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException n(String str) throws IOException {
        int iD = d();
        String strQ = ar.q(d());
        String strC = c();
        int iF = ec.f(strQ, str.length() + 18, strC.length());
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iD == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(strConcat.length() + iF + 5);
        ec.x(sb, "Expected ", str, " but was ", strQ);
        return new IllegalStateException(ec.n(sb, strC, "\nSee ", strConcat));
    }

    public final String toString() {
        return c13.class.getSimpleName().concat(c());
    }
}
