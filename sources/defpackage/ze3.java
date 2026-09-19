package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ze3 implements me0 {
    public boolean A;
    public final xe3 a;
    public final ig d;
    public qe3 e;
    public de3 f;
    public s62 g;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean v;
    public de3 y;
    public final ri0 b = new ri0();
    public int h = 1000;
    public long[] i = new long[1000];
    public long[] j = new long[1000];
    public long[] m = new long[1000];
    public int[] l = new int[1000];
    public int[] k = new int[1000];
    public le0[] n = new le0[1000];
    public final um0 c = new um0(11, false);
    public long s = Long.MIN_VALUE;
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public boolean x = true;
    public boolean w = true;
    public boolean z = true;

    public ze3(fg3 fg3Var, ig igVar, xb3 xb3Var) {
        this.d = igVar;
        this.a = new xe3(fg3Var);
    }

    @Override // defpackage.me0
    public final void a(cw1 cw1Var, int i, int i2) {
        while (true) {
            xe3 xe3Var = this.a;
            if (i <= 0) {
                xe3Var.getClass();
                return;
            }
            int iB = xe3Var.b(i);
            gh0 gh0Var = xe3Var.e;
            eg3 eg3Var = (eg3) gh0Var.h;
            byte[] bArr = eg3Var.a;
            long j = xe3Var.f - gh0Var.f;
            eg3Var.getClass();
            cw1Var.H(bArr, (int) j, iB);
            i -= iB;
            long j2 = xe3Var.f + ((long) iB);
            xe3Var.f = j2;
            gh0 gh0Var2 = xe3Var.e;
            if (j2 == gh0Var2.g) {
                xe3Var.e = (gh0) gh0Var2.i;
            }
        }
    }

    @Override // defpackage.me0
    public final int b(k73 k73Var, int i, boolean z) throws EOFException {
        xe3 xe3Var = this.a;
        int iB = xe3Var.b(i);
        gh0 gh0Var = xe3Var.e;
        eg3 eg3Var = (eg3) gh0Var.h;
        byte[] bArr = eg3Var.a;
        long j = xe3Var.f - gh0Var.f;
        eg3Var.getClass();
        int iD = k73Var.d(bArr, (int) j, iB);
        if (iD == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j2 = xe3Var.f + ((long) iD);
        xe3Var.f = j2;
        gh0 gh0Var2 = xe3Var.e;
        if (j2 == gh0Var2.g) {
            xe3Var.e = (gh0) gh0Var2.i;
        }
        return iD;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a4, B:60:0x010d, B:62:0x0116, B:41:0x00bd, B:43:0x00c1, B:45:0x00d3, B:49:0x00dc, B:50:0x00e1, B:52:0x00e7, B:56:0x00f5, B:58:0x00fa, B:59:0x010a, B:68:0x0184), top: B:71:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a4, B:60:0x010d, B:62:0x0116, B:41:0x00bd, B:43:0x00c1, B:45:0x00d3, B:49:0x00dc, B:50:0x00e1, B:52:0x00e7, B:56:0x00f5, B:58:0x00fa, B:59:0x010a, B:68:0x0184), top: B:71:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a4, B:60:0x010d, B:62:0x0116, B:41:0x00bd, B:43:0x00c1, B:45:0x00d3, B:49:0x00dc, B:50:0x00e1, B:52:0x00e7, B:56:0x00f5, B:58:0x00fa, B:59:0x010a, B:68:0x0184), top: B:71:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a4, B:60:0x010d, B:62:0x0116, B:41:0x00bd, B:43:0x00c1, B:45:0x00d3, B:49:0x00dc, B:50:0x00e1, B:52:0x00e7, B:56:0x00f5, B:58:0x00fa, B:59:0x010a, B:68:0x0184), top: B:71:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a4, B:60:0x010d, B:62:0x0116, B:41:0x00bd, B:43:0x00c1, B:45:0x00d3, B:49:0x00dc, B:50:0x00e1, B:52:0x00e7, B:56:0x00f5, B:58:0x00fa, B:59:0x010a, B:68:0x0184), top: B:71:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    @Override // defpackage.me0
    public final void c(long j, int i, int i2, int i3, le0 le0Var) {
        de3 de3Var;
        int i4;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        if (this.w) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.w = false;
            }
        }
        if (this.z) {
            if (j < this.s) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.A) {
                    s90.Q("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.y)));
                    this.A = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.a.f - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i5 = this.o;
                if (i5 > 0) {
                    int iH = h(i5 - 1);
                    hn.v(this.j[iH] + ((long) this.k[iH]) <= j2);
                }
                this.v = (536870912 & i) != 0;
                this.u = Math.max(this.u, j);
                int iH2 = h(this.o);
                this.m[iH2] = j;
                this.j[iH2] = j2;
                this.k[iH2] = i2;
                this.l[iH2] = i;
                this.n[iH2] = le0Var;
                this.i[iH2] = 0;
                um0 um0Var = this.c;
                if (((SparseArray) um0Var.g).size() == 0) {
                    de3Var = this.y;
                    if (de3Var != null) {
                        throw null;
                    }
                    i4 = this.p + this.o;
                    ye3 ye3Var = new ye3(de3Var);
                    sparseArray = (SparseArray) um0Var.g;
                    if (um0Var.f == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        hn.M(z2);
                        um0Var.f = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i4 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hn.v(z);
                        if (iKeyAt == i4) {
                            ((v33) um0Var.h).mo6b(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i4, ye3Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) um0Var.g;
                    if (!((ye3) sparseArray2.valueAt(sparseArray2.size() - 1)).a.equals(this.y)) {
                        de3Var = this.y;
                        if (de3Var != null) {
                            throw null;
                        }
                        i4 = this.p + this.o;
                        ye3 ye3Var2 = new ye3(de3Var);
                        sparseArray = (SparseArray) um0Var.g;
                        if (um0Var.f == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            hn.M(z2);
                            um0Var.f = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i4 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            hn.v(z);
                            if (iKeyAt == i4) {
                                ((v33) um0Var.h).mo6b(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i4, ye3Var2);
                    }
                }
                int i6 = this.o + 1;
                this.o = i6;
                int i7 = this.h;
                if (i6 == i7) {
                    int i8 = i7 + 1000;
                    long[] jArr = new long[i8];
                    long[] jArr2 = new long[i8];
                    long[] jArr3 = new long[i8];
                    int[] iArr = new int[i8];
                    int[] iArr2 = new int[i8];
                    le0[] le0VarArr = new le0[i8];
                    int i9 = this.q;
                    int i10 = i7 - i9;
                    System.arraycopy(this.j, i9, jArr2, 0, i10);
                    System.arraycopy(this.m, this.q, jArr3, 0, i10);
                    System.arraycopy(this.l, this.q, iArr, 0, i10);
                    System.arraycopy(this.k, this.q, iArr2, 0, i10);
                    System.arraycopy(this.n, this.q, le0VarArr, 0, i10);
                    System.arraycopy(this.i, this.q, jArr, 0, i10);
                    int i11 = this.q;
                    System.arraycopy(this.j, 0, jArr2, i10, i11);
                    System.arraycopy(this.m, 0, jArr3, i10, i11);
                    System.arraycopy(this.l, 0, iArr, i10, i11);
                    System.arraycopy(this.k, 0, iArr2, i10, i11);
                    System.arraycopy(this.n, 0, le0VarArr, i10, i11);
                    System.arraycopy(this.i, 0, jArr, i10, i11);
                    this.j = jArr2;
                    this.m = jArr3;
                    this.l = iArr;
                    this.k = iArr2;
                    this.n = le0VarArr;
                    this.i = jArr;
                    this.q = 0;
                    this.h = i8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0038, B:19:0x0051, B:18:0x004f), top: B:29:0x0002 }] */
    @Override // defpackage.me0
    public final void d(de3 de3Var) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                this.x = false;
                if (!Objects.equals(de3Var, this.y)) {
                    um0 um0Var = this.c;
                    if (((SparseArray) um0Var.g).size() == 0) {
                        this.y = de3Var;
                    } else {
                        SparseArray sparseArray = (SparseArray) um0Var.g;
                        if (((ye3) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(de3Var)) {
                            SparseArray sparseArray2 = (SparseArray) um0Var.g;
                            this.y = ((ye3) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        } else {
                            this.y = de3Var;
                        }
                    }
                    boolean z2 = this.z;
                    de3 de3Var2 = this.y;
                    this.z = z2 & rn0.d(de3Var2.m, de3Var2.j);
                    this.A = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        qe3 qe3Var = this.e;
        if (qe3Var == null || !z) {
            return;
        }
        qe3Var.t.post(qe3Var.r);
    }

    public final void e(de3 de3Var, us2 us2Var) {
        de3 de3Var2 = this.f;
        va3 va3Var = de3Var2 == null ? null : de3Var2.q;
        this.f = de3Var;
        va3 va3Var2 = de3Var.q;
        this.d.getClass();
        int i = va3Var2 != null ? 1 : 0;
        uc3 uc3Var = new uc3(de3Var);
        uc3Var.K = i;
        us2Var.h = new de3(uc3Var);
        us2Var.g = this.g;
        if (de3Var2 == null || !Objects.equals(va3Var, va3Var2)) {
            s62 s62Var = va3Var2 != null ? new s62(new vb3(new fc3())) : null;
            this.g = s62Var;
            us2Var.g = s62Var;
        }
    }

    public final int f(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.m[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.h) {
                i = 0;
            }
        }
        return i3;
    }

    public final long g(int i) {
        long j = this.t;
        long jMax = Long.MIN_VALUE;
        int i2 = 0;
        if (i != 0) {
            int iH = h(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.m[iH]);
                if ((this.l[iH] & 1) != 0) {
                    break;
                }
                iH--;
                if (iH == -1) {
                    iH = this.h - 1;
                }
            }
        }
        this.t = Math.max(j, jMax);
        this.o -= i;
        int i4 = this.p + i;
        this.p = i4;
        int i5 = this.q + i;
        this.q = i5;
        int i6 = this.h;
        if (i5 >= i6) {
            this.q = i5 - i6;
        }
        int i7 = this.r - i;
        this.r = i7;
        if (i7 < 0) {
            this.r = 0;
        }
        while (true) {
            um0 um0Var = this.c;
            SparseArray sparseArray = (SparseArray) um0Var.g;
            if (i2 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((v33) um0Var.h).mo6b(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = um0Var.f;
            if (i9 > 0) {
                um0Var.f = i9 - 1;
            }
            i2 = i8;
        }
        if (this.o != 0) {
            return this.j[this.q];
        }
        int i10 = this.q;
        if (i10 == 0) {
            i10 = this.h;
        }
        int i11 = i10 - 1;
        return this.j[i11] + ((long) this.k[i11]);
    }

    public final int h(int i) {
        int i2 = this.q + i;
        int i3 = this.h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final void i(boolean z) {
        um0 um0Var;
        SparseArray sparseArray;
        xe3 xe3Var = this.a;
        fg3 fg3Var = xe3Var.a;
        gh0 gh0Var = xe3Var.c;
        if (((eg3) gh0Var.h) != null) {
            fg3Var.h(gh0Var);
            gh0Var.h = null;
            gh0Var.i = null;
        }
        gh0 gh0Var2 = xe3Var.c;
        int i = 0;
        hn.M(((eg3) gh0Var2.h) == null);
        gh0Var2.f = 0L;
        gh0Var2.g = 65536L;
        gh0 gh0Var3 = xe3Var.c;
        xe3Var.d = gh0Var3;
        xe3Var.e = gh0Var3;
        xe3Var.f = 0L;
        fg3Var.mo9l();
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.w = true;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        while (true) {
            um0Var = this.c;
            sparseArray = (SparseArray) um0Var.g;
            if (i >= sparseArray.size()) {
                break;
            }
            ((v33) um0Var.h).mo6b(sparseArray.valueAt(i));
            i++;
        }
        um0Var.f = -1;
        sparseArray.clear();
        if (z) {
            this.y = null;
            this.x = true;
            this.z = true;
        }
    }

    public final synchronized boolean j(boolean z) {
        int i = this.r;
        boolean z2 = false;
        if (i != this.o) {
            if (((ye3) this.c.j(this.p + i)).a != this.f) {
                return true;
            }
            int iH = h(this.r);
            if (this.g != null) {
                int i2 = this.l[iH];
            } else {
                z2 = true;
            }
            return z2;
        }
        if (z || this.v) {
            z2 = true;
        } else {
            de3 de3Var = this.y;
            if (de3Var != null) {
                if (de3Var == this.f) {
                    return false;
                }
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean k(long r11, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L74
            r0 = 0
            r10.r = r0     // Catch: java.lang.Throwable -> L7c
            xe3 r1 = r10.a     // Catch: java.lang.Throwable -> L7c
            gh0 r2 = r1.c     // Catch: java.lang.Throwable -> L7c
            r1.d = r2     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L79
            int r4 = r10.h(r0)     // Catch: java.lang.Throwable -> L6f
            int r1 = r10.r     // Catch: java.lang.Throwable -> L74
            int r5 = r10.o     // Catch: java.lang.Throwable -> L74
            r2 = 1
            if (r1 == r5) goto L19
            r1 = r2
            goto L1a
        L19:
            r1 = r0
        L1a:
            if (r1 == 0) goto L2e
            long[] r1 = r10.m     // Catch: java.lang.Throwable -> L6f
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L6f
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 < 0) goto L2e
            long r6 = r10.u     // Catch: java.lang.Throwable -> L6f
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 <= 0) goto L30
            if (r13 == 0) goto L2e
            r13 = r2
            goto L30
        L2e:
            r3 = r10
            goto L72
        L30:
            boolean r1 = r10.z     // Catch: java.lang.Throwable -> L6f
            r9 = -1
            if (r1 == 0) goto L59
            r1 = r0
        L36:
            if (r1 >= r5) goto L52
            long[] r3 = r10.m     // Catch: java.lang.Throwable -> L4a
            r6 = r3[r4]     // Catch: java.lang.Throwable -> L4a
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 >= 0) goto L4e
            int r4 = r4 + 1
            int r3 = r10.h     // Catch: java.lang.Throwable -> L4a
            if (r4 != r3) goto L47
            r4 = r0
        L47:
            int r1 = r1 + 1
            goto L36
        L4a:
            r0 = move-exception
            r11 = r0
            r3 = r10
            goto L85
        L4e:
            r3 = r10
            r6 = r11
            r5 = r1
            goto L60
        L52:
            r3 = r10
            r6 = r11
            if (r13 == 0) goto L57
            goto L60
        L57:
            r5 = r9
            goto L60
        L59:
            r8 = 1
            r3 = r10
            r6 = r11
            int r5 = r3.f(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L6c
        L60:
            if (r5 != r9) goto L63
            goto L72
        L63:
            r3.s = r6     // Catch: java.lang.Throwable -> L6c
            int r10 = r3.r     // Catch: java.lang.Throwable -> L6c
            int r10 = r10 + r5
            r3.r = r10     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r3)
            return r2
        L6c:
            r0 = move-exception
        L6d:
            r11 = r0
            goto L85
        L6f:
            r0 = move-exception
            r3 = r10
            goto L6d
        L72:
            monitor-exit(r3)
            return r0
        L74:
            r0 = move-exception
            r3 = r10
        L76:
            r10 = r0
            r11 = r10
            goto L85
        L79:
            r0 = move-exception
            r3 = r10
            goto L76
        L7c:
            r0 = move-exception
            r3 = r10
        L7e:
            r10 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
            throw r10     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            goto L76
        L83:
            r0 = move-exception
            goto L7e
        L85:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze3.k(long, boolean):boolean");
    }

    public final void l() {
        long jG;
        xe3 xe3Var = this.a;
        synchronized (this) {
            int i = this.o;
            jG = i == 0 ? -1L : g(i);
        }
        xe3Var.a(jG);
    }
}
