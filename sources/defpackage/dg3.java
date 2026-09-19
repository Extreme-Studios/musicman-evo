package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dg3 implements el0 {
    public int f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public dg3(p83 p83Var) {
        ArrayList arrayList = (ArrayList) p83Var.h;
        int size = arrayList.size();
        this.g = (String[]) ((ArrayList) p83Var.g).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.h = dArr;
        ArrayList arrayList2 = (ArrayList) p83Var.i;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            dArr2[i2] = ((Double) arrayList2.get(i2)).doubleValue();
        }
        this.i = dArr2;
        this.j = new int[size];
        this.f = 0;
    }

    public boolean a(int i) {
        return ((z83[]) this.g)[i] != null;
    }

    public boolean b(dg3 dg3Var, int i) {
        return dg3Var != null && Objects.equals(((z83[]) this.g)[i], ((z83[]) dg3Var.g)[i]) && Objects.equals(((bg3[]) this.h)[i], ((bg3[]) dg3Var.h)[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void c() {
        x32 x32Var;
        if (((Boolean) tu0.e.c.a(lx0.F6)).booleanValue() && !vc3.C.h.g().m().j) {
            ((ArrayDeque) this.i).clear();
            return;
        }
        synchronized (this) {
            try {
                boolean z = false;
                Object[] objArr = 0;
                if (((g92) this.j) == null) {
                    while (true) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.i;
                        if (!arrayDeque.isEmpty()) {
                            x32Var = (x32) arrayDeque.pollFirst();
                            if (x32Var == null) {
                                break;
                            }
                            e62 e62Var = x32Var.g;
                            if (e62Var != null) {
                                r52 r52Var = (r52) this.g;
                                synchronized (r52Var) {
                                    y52 y52Var = (y52) ((ConcurrentHashMap) r52Var.g).get(e62Var);
                                    if (y52Var != null) {
                                        c62 c62Var = (c62) r52Var.h;
                                        y52Var.a();
                                        if (y52Var.a.size() < c62Var.j) {
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                    g92 g92Var = new g92((r52) this.g, (gv1) this.h, x32Var);
                    this.j = g92Var;
                    un1 un1Var = new un1(this, x32Var, 20, z);
                    synchronized (g92Var) {
                        pm2 pm2VarL = na1.L((vl2) g92Var.d, kg0.n, x32Var.e);
                        pm2VarL.a(new in2((Object) pm2VarL, (int) (objArr == true ? 1 : 0), (Object) un1Var), x32Var.e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0222  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:124:0x0328  */
    /* JADX WARN: Code duplicated, block: B:125:0x033b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0358  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e6  */
    @Override // defpackage.el0
    public void g(cw1 cw1Var) {
        SparseArray sparseArray;
        um0 um0Var;
        List listUnmodifiableList;
        int i;
        nl0 al0Var;
        nl0 al0Var2;
        int i2;
        if (cw1Var.K() != 2) {
            return;
        }
        kl0 kl0Var = (kl0) this.j;
        List list = kl0Var.a;
        SparseArray sparseArray2 = kl0Var.f;
        SparseBooleanArray sparseBooleanArray = kl0Var.g;
        int i3 = 0;
        ry1 ry1Var = (ry1) list.get(0);
        if ((cw1Var.K() & 128) != 0) {
            cw1Var.G(1);
            int iL = cw1Var.L();
            int i4 = 3;
            cw1Var.G(3);
            oe0 oe0Var = (oe0) this.g;
            cw1Var.H(oe0Var.a, 0, 2);
            oe0Var.l(0);
            oe0Var.o(3);
            int i5 = 13;
            kl0Var.o = oe0Var.r(13);
            cw1Var.H(oe0Var.a, 0, 2);
            oe0Var.l(0);
            int i6 = 4;
            oe0Var.o(4);
            cw1Var.G(oe0Var.r(12));
            SparseArray sparseArray3 = (SparseArray) this.h;
            sparseArray3.clear();
            SparseIntArray sparseIntArray = (SparseIntArray) this.i;
            sparseIntArray.clear();
            int iB = cw1Var.B();
            while (iB > 0) {
                cw1Var.H(oe0Var.a, i3, 5);
                oe0Var.l(i3);
                int iR = oe0Var.r(8);
                oe0Var.o(i4);
                int iR2 = oe0Var.r(i5);
                oe0Var.o(i6);
                int iR3 = oe0Var.r(12);
                int i7 = cw1Var.b;
                int i8 = i7 + iR3;
                int i9 = -1;
                String strTrim = null;
                ArrayList arrayList = null;
                int iK = 0;
                while (cw1Var.b < i8) {
                    int iK2 = cw1Var.K();
                    int iK3 = cw1Var.b + cw1Var.K();
                    if (iK3 > i8) {
                        SparseArray sparseArray4 = sparseArray2;
                        oe0 oe0Var2 = oe0Var;
                        cw1Var.E(i8);
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(cw1Var.a, i7, i8);
                        um0Var = new um0();
                        um0Var.f = iK;
                        if (arrayList == null) {
                            listUnmodifiableList = Collections.EMPTY_LIST;
                        } else {
                            listUnmodifiableList = Collections.unmodifiableList(arrayList);
                        }
                        um0Var.g = listUnmodifiableList;
                        um0Var.h = bArrCopyOfRange;
                        if (iR != 6 || iR == 5) {
                            iR = i9;
                        }
                        iB -= iR3 + 5;
                        if (sparseBooleanArray.get(iR2)) {
                            i = 3;
                        } else {
                            dr0 dr0Var = kl0Var.d;
                            if (iR != 2) {
                                i = 3;
                                if (iR != 3 || iR == 4) {
                                    al0Var = new al0(new xk0(um0Var.i(), strTrim, "video/mp2t"));
                                } else {
                                    if (iR == 21) {
                                        al0Var2 = new al0(new ik0());
                                    } else if (iR == 27) {
                                        al0Var = new al0(new qk0(new p83(dr0Var.t(um0Var))));
                                    } else if (iR == 36) {
                                        al0Var = new al0(new sk0(new p83(dr0Var.t(um0Var))));
                                    } else if (iR == 45) {
                                        al0Var2 = new al0(new yk0());
                                    } else if (iR == 89) {
                                        al0Var = new al0(new ik0((List) um0Var.g));
                                    } else if (iR == 172) {
                                        al0Var = new al0(new dk0(um0Var.i(), 1, strTrim, "video/mp2t"));
                                    } else if (iR == 257) {
                                        al0Var2 = new fl0(new r52("application/vnd.dvb.ait"));
                                    } else if (iR != 128) {
                                        if (iR == 129) {
                                            al0Var = new al0(new dk0(um0Var.i(), 0, strTrim, "video/mp2t"));
                                        } else if (iR == 138) {
                                            al0Var = new al0(new hk0(strTrim, um0Var.i(), 4096));
                                        } else if (iR != 139) {
                                            switch (iR) {
                                                case 15:
                                                    al0Var = new al0(new gk0(strTrim, um0Var.i(), "video/mp2t", false));
                                                    break;
                                                case 16:
                                                    al0Var = new al0(new ok0(new r52(dr0Var.t(um0Var))));
                                                    break;
                                                case 17:
                                                    al0Var = new al0(new wk0(strTrim, um0Var.i()));
                                                    break;
                                                default:
                                                    switch (iR) {
                                                        case 134:
                                                            al0Var2 = new fl0(new r52("application/x-scte35"));
                                                            break;
                                                        case 135:
                                                            al0Var = new al0(new dk0(um0Var.i(), 0, strTrim, "video/mp2t"));
                                                            break;
                                                        case 136:
                                                            al0Var = new al0(new hk0(strTrim, um0Var.i(), 4096));
                                                            break;
                                                        default:
                                                            al0Var = null;
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            al0Var = new al0(new hk0(strTrim, um0Var.i(), 5408));
                                        }
                                    }
                                    al0Var = al0Var2;
                                }
                                sparseIntArray.put(iR2, iR2);
                                sparseArray3.put(iR2, al0Var);
                            } else {
                                i = 3;
                            }
                            al0Var = new al0(new lk0(new r52(dr0Var.t(um0Var)), "video/mp2t"));
                            sparseIntArray.put(iR2, iR2);
                            sparseArray3.put(iR2, al0Var);
                        }
                        i4 = i;
                        sparseArray2 = sparseArray4;
                        oe0Var = oe0Var2;
                        i3 = 0;
                        i5 = 13;
                        i6 = 4;
                    } else {
                        oe0 oe0Var3 = oe0Var;
                        if (iK2 == 5) {
                            long jP = cw1Var.P();
                            if (jP == 1094921523) {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                i9 = 129;
                            } else if (jP == 1161904947) {
                                i2 = iK3;
                                i9 = 135;
                                sparseArray2 = sparseArray2;
                            } else if (jP == 1094921524) {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                i9 = 172;
                            } else if (jP == 1212503619) {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                i9 = 36;
                            } else {
                                i2 = iK3;
                            }
                        } else if (iK2 == 106) {
                            sparseArray2 = sparseArray2;
                            i2 = iK3;
                            i9 = 129;
                        } else if (iK2 == 122) {
                            i2 = iK3;
                            i9 = 135;
                            sparseArray2 = sparseArray2;
                        } else if (iK2 == 127) {
                            int iK4 = cw1Var.K();
                            if (iK4 == 21) {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                i9 = 172;
                            } else if (iK4 == 14) {
                                i9 = 136;
                                i2 = iK3;
                            } else if (iK4 == 33) {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                i9 = 139;
                            } else {
                                i2 = iK3;
                            }
                        } else if (iK2 == 123) {
                            sparseArray2 = sparseArray2;
                            i2 = iK3;
                            i9 = 138;
                        } else if (iK2 == 10) {
                            strTrim = cw1Var.k(3, StandardCharsets.UTF_8).trim();
                            iK = cw1Var.K();
                            i2 = iK3;
                        } else if (iK2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (cw1Var.b < iK3) {
                                String strTrim2 = cw1Var.k(3, StandardCharsets.UTF_8).trim();
                                cw1Var.K();
                                byte[] bArr = new byte[4];
                                cw1Var.H(bArr, 0, 4);
                                arrayList2.add(new ll0(strTrim2, bArr));
                                iK3 = iK3;
                                sparseArray2 = sparseArray2;
                            }
                            sparseArray2 = sparseArray2;
                            i2 = iK3;
                            arrayList = arrayList2;
                            i9 = 89;
                        } else {
                            sparseArray2 = sparseArray2;
                            i2 = iK3;
                            if (iK2 == 111) {
                                i9 = 257;
                            }
                        }
                        cw1Var.G(i2 - cw1Var.b);
                        sparseArray2 = sparseArray2;
                        oe0Var = oe0Var3;
                    }
                }
                SparseArray sparseArray5 = sparseArray2;
                oe0 oe0Var4 = oe0Var;
                cw1Var.E(i8);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(cw1Var.a, i7, i8);
                um0Var = new um0();
                um0Var.f = iK;
                if (arrayList == null) {
                    listUnmodifiableList = Collections.EMPTY_LIST;
                } else {
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                um0Var.g = listUnmodifiableList;
                um0Var.h = bArrCopyOfRange2;
                if (iR != 6) {
                    iR = i9;
                } else {
                    iR = i9;
                }
                iB -= iR3 + 5;
                if (sparseBooleanArray.get(iR2)) {
                    dr0 dr0Var2 = kl0Var.d;
                    if (iR != 2) {
                        i = 3;
                        if (iR != 3) {
                            al0Var = new al0(new xk0(um0Var.i(), strTrim, "video/mp2t"));
                        } else {
                            al0Var = new al0(new xk0(um0Var.i(), strTrim, "video/mp2t"));
                        }
                        sparseIntArray.put(iR2, iR2);
                        sparseArray3.put(iR2, al0Var);
                    } else {
                        i = 3;
                    }
                    al0Var = new al0(new lk0(new r52(dr0Var2.t(um0Var)), "video/mp2t"));
                    sparseIntArray.put(iR2, iR2);
                    sparseArray3.put(iR2, al0Var);
                } else {
                    i = 3;
                }
                i4 = i;
                sparseArray2 = sparseArray5;
                oe0Var = oe0Var4;
                i3 = 0;
                i5 = 13;
                i6 = 4;
            }
            SparseArray sparseArray6 = sparseArray2;
            int size = sparseIntArray.size();
            int i10 = 0;
            while (i10 < size) {
                int iKeyAt = sparseIntArray.keyAt(i10);
                int iValueAt = sparseIntArray.valueAt(i10);
                sparseBooleanArray.put(iKeyAt, true);
                kl0Var.h.put(iValueAt, true);
                nl0 nl0Var = (nl0) sparseArray3.valueAt(i10);
                if (nl0Var != null) {
                    nl0Var.d(ry1Var, kl0Var.k, new ml0(iL, iKeyAt, 8192));
                    sparseArray = sparseArray6;
                    sparseArray.put(iValueAt, nl0Var);
                } else {
                    sparseArray = sparseArray6;
                }
                i10++;
                sparseArray6 = sparseArray;
            }
            sparseArray6.remove(this.f);
            kl0Var.k.s();
            kl0Var.l = true;
        }
    }

    public dg3(kl0 kl0Var, int i) {
        Objects.requireNonNull(kl0Var);
        this.j = kl0Var;
        this.g = new oe0(5, new byte[5]);
        this.h = new SparseArray();
        this.i = new SparseIntArray();
        this.f = i;
    }

    public dg3(r52 r52Var, w52 w52Var, gv1 gv1Var) {
        this.f = 1;
        this.g = r52Var;
        this.h = gv1Var;
        this.i = new ArrayDeque();
        w52Var.a = new bz1(this);
    }

    public dg3(zd0 zd0Var, oc2 oc2Var, byte[] bArr, ph0[] ph0VarArr, int i) {
        this.g = zd0Var;
        this.h = oc2Var;
        this.i = bArr;
        this.j = ph0VarArr;
        this.f = i;
    }

    public dg3(z83[] z83VarArr, bg3[] bg3VarArr, l21 l21Var, cg3 cg3Var) {
        int length = z83VarArr.length;
        hn.v(length == bg3VarArr.length);
        this.g = z83VarArr;
        this.h = (bg3[]) bg3VarArr.clone();
        this.i = l21Var;
        this.j = cg3Var;
        this.f = length;
    }

    @Override // defpackage.el0
    public void d(ry1 ry1Var, pd0 pd0Var, ml0 ml0Var) {
    }
}
