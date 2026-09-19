package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ik0 implements jk0 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public ik0(List list) {
        this.a = 0;
        this.f = list;
        this.g = new me0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.jk0
    public final void a() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (cw1Var.B() == 0) {
                            z2 = false;
                        } else {
                            if (cw1Var.K() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (cw1Var.B() == 0) {
                            z = false;
                        } else {
                            if (cw1Var.K() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = cw1Var.b;
                    int iB = cw1Var.B();
                    for (me0 me0Var : (me0[]) this.g) {
                        cw1Var.E(i);
                        me0Var.a(cw1Var, iB, 0);
                    }
                    this.e += iB;
                }
                break;
            default:
                ((me0) this.g).getClass();
                if (this.b) {
                    int iB2 = cw1Var.B();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iB2, 10 - i2);
                        byte[] bArr = cw1Var.a;
                        int i3 = cw1Var.b;
                        cw1 cw1Var2 = (cw1) this.f;
                        System.arraycopy(bArr, i3, cw1Var2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            cw1Var2.E(0);
                            if (cw1Var2.K() == 73 && cw1Var2.K() == 68 && cw1Var2.K() == 51) {
                                cw1Var2.G(3);
                                this.d = cw1Var2.g() + 10;
                            } else {
                                s90.Q("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iB2, this.d - this.e);
                    ((me0) this.g).a(cw1Var, iMin2, 0);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    hn.M(this.c != -9223372036854775807L);
                    for (me0 me0Var : (me0[]) this.g) {
                        me0Var.c(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                }
                break;
            default:
                ((me0) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    hn.M(this.c != -9223372036854775807L);
                    ((me0) this.g).c(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    me0[] me0VarArr = (me0[]) this.g;
                    if (i < me0VarArr.length) {
                        ll0 ll0Var = (ll0) ((List) this.f).get(i);
                        ml0Var.a();
                        ml0Var.b();
                        me0 me0VarZ = pd0Var.z(ml0Var.d, 3);
                        uc3 uc3Var = new uc3();
                        ml0Var.b();
                        uc3Var.a = ml0Var.e;
                        uc3Var.d("video/mp2t");
                        uc3Var.e("application/dvbsubs");
                        uc3Var.o = Collections.singletonList(ll0Var.b);
                        uc3Var.d = ll0Var.a;
                        me0VarZ.d(new de3(uc3Var));
                        me0VarArr[i] = me0VarZ;
                        i++;
                    }
                    break;
                }
                break;
            default:
                ml0Var.a();
                ml0Var.b();
                me0 me0VarZ2 = pd0Var.z(ml0Var.d, 5);
                this.g = me0VarZ2;
                uc3 uc3Var2 = new uc3();
                ml0Var.b();
                uc3Var2.a = ml0Var.e;
                uc3Var2.d("video/mp2t");
                uc3Var2.e("application/id3");
                me0VarZ2.d(new de3(uc3Var2));
                break;
        }
    }

    public ik0() {
        this.a = 1;
        this.f = new cw1(10);
        this.c = -9223372036854775807L;
    }
}
