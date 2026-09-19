package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class n9 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public n9() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.c = iHighestOneBit - 1;
        this.d = new int[iHighestOneBit];
    }

    public static final void w(int i) throws o23 {
        if ((i & 3) == 0) {
            return;
        }
        j7.s("Failed to parse the message.");
    }

    public static final void x(int i) throws o23 {
        if ((i & 7) == 0) {
            return;
        }
        j7.s("Failed to parse the message.");
    }

    public void A(l23 l23Var) throws o23 {
        int iH;
        r13 r13Var = (r13) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                l23Var.add(Double.valueOf(r13Var.k()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            this.c = iH;
            return;
        }
        if (i != 2) {
            j7.q();
            return;
        }
        int iV = r13Var.v();
        x(iV);
        int iC = r13Var.c() + iV;
        do {
            l23Var.add(Double.valueOf(r13Var.k()));
        } while (r13Var.c() < iC);
    }

    public void B(l23 l23Var) throws o23 {
        int iH;
        r13 r13Var = (r13) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iV = r13Var.v();
            w(iV);
            int iC = r13Var.c() + iV;
            do {
                l23Var.add(Float.valueOf(r13Var.l()));
            } while (r13Var.c() < iC);
            return;
        }
        if (i != 5) {
            j7.q();
            return;
        }
        do {
            l23Var.add(Float.valueOf(r13Var.l()));
            if (r13Var.b()) {
                return;
            } else {
                iH = r13Var.h();
            }
        } while (iH == this.a);
        this.c = iH;
    }

    public void C(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof s23;
        int i = this.a;
        if (z) {
            s23 s23Var = (s23) l23Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    j7.q();
                    return;
                }
                int iC = r13Var.c() + r13Var.v();
                do {
                    s23Var.c(r13Var.m());
                } while (r13Var.c() < iC);
                v(iC);
                return;
            }
            do {
                s23Var.c(r13Var.m());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    j7.q();
                    return;
                }
                int iC2 = r13Var.c() + r13Var.v();
                do {
                    l23Var.add(Long.valueOf(r13Var.m()));
                } while (r13Var.c() < iC2);
                v(iC2);
                return;
            }
            do {
                l23Var.add(Long.valueOf(r13Var.m()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void a(int i) {
        int[] iArr = (int[]) this.d;
        int i2 = this.b;
        iArr[i2] = i;
        int i3 = this.c & (i2 + 1);
        this.b = i3;
        int i4 = this.a;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            o7.a1(0, i4, length, iArr, iArr2);
            o7.a1(i5, 0, this.a, (int[]) this.d, iArr2);
            this.d = iArr2;
            this.a = 0;
            this.b = length;
            this.c = i6 - 1;
        }
    }

    public void b(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof s23;
        int i = this.a;
        if (z) {
            s23 s23Var = (s23) l23Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    j7.q();
                    return;
                }
                int iC = r13Var.c() + r13Var.v();
                do {
                    s23Var.c(r13Var.n());
                } while (r13Var.c() < iC);
                v(iC);
                return;
            }
            do {
                s23Var.c(r13Var.n());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    j7.q();
                    return;
                }
                int iC2 = r13Var.c() + r13Var.v();
                do {
                    l23Var.add(Long.valueOf(r13Var.n()));
                } while (r13Var.c() < iC2);
                v(iC2);
                return;
            }
            do {
                l23Var.add(Long.valueOf(r13Var.n()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void c(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof e23;
        int i = this.a;
        if (z) {
            e23 e23Var = (e23) l23Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    j7.q();
                    return;
                }
                int iC = r13Var.c() + r13Var.v();
                do {
                    e23Var.d(r13Var.o());
                } while (r13Var.c() < iC);
                v(iC);
                return;
            }
            do {
                e23Var.d(r13Var.o());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    j7.q();
                    return;
                }
                int iC2 = r13Var.c() + r13Var.v();
                do {
                    l23Var.add(Integer.valueOf(r13Var.o()));
                } while (r13Var.c() < iC2);
                v(iC2);
                return;
            }
            do {
                l23Var.add(Integer.valueOf(r13Var.o()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void d(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof s23;
        int i = this.a;
        if (z) {
            s23 s23Var = (s23) l23Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    j7.q();
                    return;
                }
                int iV = r13Var.v();
                x(iV);
                int iC = r13Var.c() + iV;
                do {
                    s23Var.c(r13Var.p());
                } while (r13Var.c() < iC);
                return;
            }
            do {
                s23Var.c(r13Var.p());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    j7.q();
                    return;
                }
                int iV2 = r13Var.v();
                x(iV2);
                int iC2 = r13Var.c() + iV2;
                do {
                    l23Var.add(Long.valueOf(r13Var.p()));
                } while (r13Var.c() < iC2);
                return;
            }
            do {
                l23Var.add(Long.valueOf(r13Var.p()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void e(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof e23;
        int i = this.a;
        if (z) {
            e23 e23Var = (e23) l23Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iV = r13Var.v();
                w(iV);
                int iC = r13Var.c() + iV;
                do {
                    e23Var.d(r13Var.q());
                } while (r13Var.c() < iC);
                return;
            }
            if (i2 != 5) {
                j7.q();
                return;
            }
            do {
                e23Var.d(r13Var.q());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iV2 = r13Var.v();
                w(iV2);
                int iC2 = r13Var.c() + iV2;
                do {
                    l23Var.add(Integer.valueOf(r13Var.q()));
                } while (r13Var.c() < iC2);
                return;
            }
            if (i3 != 5) {
                j7.q();
                return;
            }
            do {
                l23Var.add(Integer.valueOf(r13Var.q()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void f(l23 l23Var) throws o23 {
        int iH;
        r13 r13Var = (r13) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                l23Var.add(Boolean.valueOf(r13Var.r()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            this.c = iH;
            return;
        }
        if (i != 2) {
            j7.q();
            return;
        }
        int iC = r13Var.c() + r13Var.v();
        do {
            l23Var.add(Boolean.valueOf(r13Var.r()));
        } while (r13Var.c() < iC);
        v(iC);
    }

    public void g(l23 l23Var, boolean z) throws n23 {
        String strS;
        int iH;
        r13 r13Var = (r13) this.d;
        if ((this.a & 7) != 2) {
            j7.q();
            return;
        }
        do {
            if (z) {
                r(2);
                strS = r13Var.t();
            } else {
                r(2);
                strS = r13Var.s();
            }
            l23Var.add(strS);
            if (r13Var.b()) {
                return;
            } else {
                iH = r13Var.h();
            }
        } while (iH == this.a);
        this.c = iH;
    }

    public void h(l23 l23Var, j33 j33Var, v13 v13Var) throws o23 {
        int iH;
        int i = this.a;
        if ((i & 7) != 2) {
            j7.q();
            return;
        }
        do {
            d23 d23VarA = j33Var.a();
            s(d23VarA, j33Var, v13Var);
            j33Var.h(d23VarA);
            l23Var.add(d23VarA);
            r13 r13Var = (r13) this.d;
            if (r13Var.b() || this.c != 0) {
                return;
            } else {
                iH = r13Var.h();
            }
        } while (iH == i);
        this.c = iH;
    }

    public void i(l23 l23Var, j33 j33Var, v13 v13Var) throws n23 {
        int iH;
        int i = this.a;
        if ((i & 7) != 3) {
            j7.q();
            return;
        }
        do {
            d23 d23VarA = j33Var.a();
            t(d23VarA, j33Var, v13Var);
            j33Var.h(d23VarA);
            l23Var.add(d23VarA);
            r13 r13Var = (r13) this.d;
            if (r13Var.b() || this.c != 0) {
                return;
            } else {
                iH = r13Var.h();
            }
        } while (iH == i);
        this.c = iH;
    }

    public void j(l23 l23Var) throws n23 {
        int iH;
        if ((this.a & 7) != 2) {
            j7.q();
            return;
        }
        do {
            l23Var.add(z());
            r13 r13Var = (r13) this.d;
            if (r13Var.b()) {
                return;
            } else {
                iH = r13Var.h();
            }
        } while (iH == this.a);
        this.c = iH;
    }

    public void k(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof e23;
        int i = this.a;
        if (z) {
            e23 e23Var = (e23) l23Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    j7.q();
                    return;
                }
                int iC = r13Var.c() + r13Var.v();
                do {
                    e23Var.d(r13Var.v());
                } while (r13Var.c() < iC);
                v(iC);
                return;
            }
            do {
                e23Var.d(r13Var.v());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    j7.q();
                    return;
                }
                int iC2 = r13Var.c() + r13Var.v();
                do {
                    l23Var.add(Integer.valueOf(r13Var.v()));
                } while (r13Var.c() < iC2);
                v(iC2);
                return;
            }
            do {
                l23Var.add(Integer.valueOf(r13Var.v()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void l(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof e23;
        int i = this.a;
        if (z) {
            e23 e23Var = (e23) l23Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    j7.q();
                    return;
                }
                int iC = r13Var.c() + r13Var.v();
                do {
                    e23Var.d(r13Var.w());
                } while (r13Var.c() < iC);
                v(iC);
                return;
            }
            do {
                e23Var.d(r13Var.w());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    j7.q();
                    return;
                }
                int iC2 = r13Var.c() + r13Var.v();
                do {
                    l23Var.add(Integer.valueOf(r13Var.w()));
                } while (r13Var.c() < iC2);
                v(iC2);
                return;
            }
            do {
                l23Var.add(Integer.valueOf(r13Var.w()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void m(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof e23;
        int i = this.a;
        if (z) {
            e23 e23Var = (e23) l23Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iV = r13Var.v();
                w(iV);
                int iC = r13Var.c() + iV;
                do {
                    e23Var.d(r13Var.x());
                } while (r13Var.c() < iC);
                return;
            }
            if (i2 != 5) {
                j7.q();
                return;
            }
            do {
                e23Var.d(r13Var.x());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iV2 = r13Var.v();
                w(iV2);
                int iC2 = r13Var.c() + iV2;
                do {
                    l23Var.add(Integer.valueOf(r13Var.x()));
                } while (r13Var.c() < iC2);
                return;
            }
            if (i3 != 5) {
                j7.q();
                return;
            }
            do {
                l23Var.add(Integer.valueOf(r13Var.x()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void n(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof s23;
        int i = this.a;
        if (z) {
            s23 s23Var = (s23) l23Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    j7.q();
                    return;
                }
                int iV = r13Var.v();
                x(iV);
                int iC = r13Var.c() + iV;
                do {
                    s23Var.c(r13Var.y());
                } while (r13Var.c() < iC);
                return;
            }
            do {
                s23Var.c(r13Var.y());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    j7.q();
                    return;
                }
                int iV2 = r13Var.v();
                x(iV2);
                int iC2 = r13Var.c() + iV2;
                do {
                    l23Var.add(Long.valueOf(r13Var.y()));
                } while (r13Var.c() < iC2);
                return;
            }
            do {
                l23Var.add(Long.valueOf(r13Var.y()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void o(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof e23;
        int i = this.a;
        if (z) {
            e23 e23Var = (e23) l23Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    j7.q();
                    return;
                }
                int iC = r13Var.c() + r13Var.v();
                do {
                    e23Var.d(r13Var.z());
                } while (r13Var.c() < iC);
                v(iC);
                return;
            }
            do {
                e23Var.d(r13Var.z());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    j7.q();
                    return;
                }
                int iC2 = r13Var.c() + r13Var.v();
                do {
                    l23Var.add(Integer.valueOf(r13Var.z()));
                } while (r13Var.c() < iC2);
                v(iC2);
                return;
            }
            do {
                l23Var.add(Integer.valueOf(r13Var.z()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void p(l23 l23Var) throws o23 {
        int iH;
        int iH2;
        r13 r13Var = (r13) this.d;
        boolean z = l23Var instanceof s23;
        int i = this.a;
        if (z) {
            s23 s23Var = (s23) l23Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    j7.q();
                    return;
                }
                int iC = r13Var.c() + r13Var.v();
                do {
                    s23Var.c(r13Var.A());
                } while (r13Var.c() < iC);
                v(iC);
                return;
            }
            do {
                s23Var.c(r13Var.A());
                if (r13Var.b()) {
                    return;
                } else {
                    iH2 = r13Var.h();
                }
            } while (iH2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    j7.q();
                    return;
                }
                int iC2 = r13Var.c() + r13Var.v();
                do {
                    l23Var.add(Long.valueOf(r13Var.A()));
                } while (r13Var.c() < iC2);
                v(iC2);
                return;
            }
            do {
                l23Var.add(Long.valueOf(r13Var.A()));
                if (r13Var.b()) {
                    return;
                } else {
                    iH = r13Var.h();
                }
            } while (iH == this.a);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public void q(u23 u23Var, dy2 dy2Var, v13 v13Var) {
        int i;
        int i2;
        r(2);
        r13 r13Var = (r13) this.d;
        int iB = r13Var.B(r13Var.v());
        Object obj = dy2Var.f;
        Object objU = "";
        Object objU2 = obj;
        while (true) {
            try {
                int iY = y();
                if (iY == Integer.MAX_VALUE || r13Var.b()) {
                    break;
                }
                boolean zJ = false;
                if (iY == 1) {
                    objU = u((y33) dy2Var.g, null, null);
                } else if (iY != 2) {
                    try {
                        if (!((r13Var.b() || (i2 = this.a) == this.b) ? false : r13Var.j(i2))) {
                            throw new o23("Unable to parse map entry.");
                        }
                    } catch (n23 e) {
                        if (!r13Var.b() && (i = this.a) != this.b) {
                            zJ = r13Var.j(i);
                        }
                        if (!zJ) {
                            throw new o23("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objU2 = u((y33) dy2Var.h, obj.getClass(), v13Var);
                }
            } catch (Throwable th) {
                r13Var.a(iB);
                throw th;
            }
        }
        u23Var.put(objU, objU2);
        r13Var.a(iB);
    }

    public void r(int i) {
        if ((this.a & 7) == i) {
            return;
        }
        j7.q();
    }

    public void s(Object obj, j33 j33Var, v13 v13Var) throws o23 {
        r13 r13Var = (r13) this.d;
        int iV = r13Var.v();
        if (r13Var.a + r13Var.b >= 100) {
            j7.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iB = r13Var.B(iV);
        r13Var.a++;
        j33Var.g(obj, this, v13Var);
        r13Var.i(0);
        r13Var.a--;
        r13Var.a(iB);
    }

    public void t(Object obj, j33 j33Var, v13 v13Var) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            j33Var.g(obj, this, v13Var);
            if (this.a != this.b) {
                throw new o23("Failed to parse the message.");
            }
            this.b = i;
        } catch (Throwable th) {
            this.b = i;
            throw th;
        }
    }

    public Object u(y33 y33Var, Class cls, v13 v13Var) throws o23 {
        r13 r13Var = (r13) this.d;
        y33 y33Var2 = y33.h;
        switch (y33Var.ordinal()) {
            case 0:
                r(1);
                return Double.valueOf(r13Var.k());
            case 1:
                r(5);
                return Float.valueOf(r13Var.l());
            case 2:
                r(0);
                return Long.valueOf(r13Var.n());
            case 3:
                r(0);
                return Long.valueOf(r13Var.m());
            case 4:
                r(0);
                return Integer.valueOf(r13Var.o());
            case 5:
                r(1);
                return Long.valueOf(r13Var.p());
            case 6:
                r(5);
                return Integer.valueOf(r13Var.q());
            case 7:
                r(0);
                return Boolean.valueOf(r13Var.r());
            case 8:
                r(2);
                return r13Var.t();
            case 9:
            default:
                j7.p("unsupported field type.");
                return null;
            case 10:
                r(2);
                j33 j33VarA = d33.c.a(cls);
                d23 d23VarA = j33VarA.a();
                s(d23VarA, j33VarA, v13Var);
                j33VarA.h(d23VarA);
                return d23VarA;
            case 11:
                return z();
            case 12:
                r(0);
                return Integer.valueOf(r13Var.v());
            case 13:
                r(0);
                return Integer.valueOf(r13Var.w());
            case 14:
                r(5);
                return Integer.valueOf(r13Var.x());
            case 15:
                r(1);
                return Long.valueOf(r13Var.y());
            case 16:
                r(0);
                return Integer.valueOf(r13Var.z());
            case 17:
                r(0);
                return Long.valueOf(r13Var.A());
        }
    }

    public void v(int i) throws o23 {
        if (((r13) this.d).c() == i) {
            return;
        }
        j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public int y() {
        int iH = this.c;
        if (iH != 0) {
            this.a = iH;
            this.c = 0;
        } else {
            iH = ((r13) this.d).h();
            this.a = iH;
        }
        if (iH == 0 || iH == this.b) {
            return Integer.MAX_VALUE;
        }
        return iH >>> 3;
    }

    public n13 z() {
        r(2);
        return ((r13) this.d).u();
    }

    public n9(r13 r13Var) {
        this.c = 0;
        Charset charset = m23.a;
        if (r13Var == null) {
            j7.l("input");
            throw null;
        }
        this.d = r13Var;
        r13Var.c = this;
    }
}
