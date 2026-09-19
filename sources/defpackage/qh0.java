package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh0 implements ee0 {
    public final long a;
    public final rh0[] b;
    public final int c;

    public qh0(long j, rh0[] rh0VarArr, int i) {
        this.a = j;
        this.b = rh0VarArr;
        this.c = i;
    }

    @Override // defpackage.ee0
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ee0
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x0095 A[LOOP:2: B:35:0x0087->B:40:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be A[LOOP:3: B:50:0x00b4->B:54:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00bc A[EDGE_INSN: B:80:0x00bc->B:53:0x00bc BREAK  A[LOOP:3: B:50:0x00b4->B:54:0x00be], SYNTHETIC] */
    @Override // defpackage.ee0
    public final de0 g(long j) {
        long j2;
        long j3;
        long j4;
        long jMin;
        int i;
        long jMin2;
        int i2;
        zh0 zh0Var;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iP;
        int iA;
        int iP2;
        int iA2;
        rh0[] rh0VarArr = this.b;
        int length = rh0VarArr.length;
        fe0 fe0Var = fe0.c;
        if (length == 0) {
            return new de0(fe0Var, fe0Var);
        }
        boolean z = false;
        int i3 = this.c;
        if (i3 != -1) {
            zh0 zh0Var2 = rh0VarArr[i3].b;
            long[] jArr3 = zh0Var2.f;
            int iP3 = qz1.p(jArr3, j, false);
            while (true) {
                if (iP3 < 0) {
                    iP3 = -1;
                    break;
                }
                if ((zh0Var2.g[iP3] & 1) != 0) {
                    break;
                }
                iP3--;
            }
            if (iP3 == -1) {
                iP3 = zh0Var2.a(j);
            }
            if (iP3 == -1) {
                return new de0(fe0Var, fe0Var);
            }
            j3 = jArr3[iP3];
            long[] jArr4 = zh0Var2.c;
            j2 = jArr4[iP3];
            if (j3 < j && iP3 < zh0Var2.b - 1 && (iA2 = zh0Var2.a(j)) != -1 && iA2 != iP3) {
                long j5 = jArr3[iA2];
                jMin = jArr4[iA2];
                j4 = j5;
            }
            i = 0;
            jMin2 = j2;
            while (i < rh0VarArr.length) {
                if (i != i3) {
                    zh0Var = rh0VarArr[i].b;
                    jArr = zh0Var.c;
                    iArr = zh0Var.g;
                    jArr2 = zh0Var.f;
                    iP = qz1.p(jArr2, j3, z);
                    while (true) {
                        if (iP >= 0) {
                            iA = -1;
                            break;
                        }
                        if ((iArr[iP] & 1) != 0) {
                            iA = iP;
                            break;
                        }
                        iP--;
                    }
                    i2 = i3;
                    if (iA == -1) {
                        iA = zh0Var.a(j3);
                    }
                    if (iA == -1) {
                        jMin2 = Math.min(jArr[iA], jMin2);
                    }
                    if (j4 != -9223372036854775807L) {
                        iP2 = qz1.p(jArr2, j4, false);
                        while (true) {
                            if (iP2 >= 0) {
                                iP2 = -1;
                                break;
                            }
                            if ((iArr[iP2] & 1) != 0) {
                                break;
                            }
                            iP2--;
                        }
                        if (iP2 == -1) {
                            iP2 = zh0Var.a(j4);
                        }
                        if (iP2 == -1) {
                            jMin = Math.min(jArr[iP2], jMin);
                        }
                    }
                } else {
                    i2 = i3;
                    rh0VarArr = rh0VarArr;
                }
                i++;
                rh0VarArr = rh0VarArr;
                i3 = i2;
                z = false;
            }
            fe0 fe0Var2 = new fe0(j3, jMin2);
            return j4 == -9223372036854775807L ? new de0(fe0Var2, fe0Var2) : new de0(fe0Var2, new fe0(j4, jMin));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        j4 = -9223372036854775807L;
        jMin = -1;
        i = 0;
        jMin2 = j2;
        while (i < rh0VarArr.length) {
            if (i != i3) {
                zh0Var = rh0VarArr[i].b;
                jArr = zh0Var.c;
                iArr = zh0Var.g;
                jArr2 = zh0Var.f;
                iP = qz1.p(jArr2, j3, z);
                while (true) {
                    if (iP >= 0) {
                        iA = -1;
                        break;
                    }
                    if ((iArr[iP] & 1) != 0) {
                        iA = iP;
                        break;
                    }
                    iP--;
                }
                i2 = i3;
                if (iA == -1) {
                    iA = zh0Var.a(j3);
                }
                if (iA == -1) {
                    jMin2 = Math.min(jArr[iA], jMin2);
                }
                if (j4 != -9223372036854775807L) {
                    iP2 = qz1.p(jArr2, j4, false);
                    while (true) {
                        if (iP2 >= 0) {
                            iP2 = -1;
                            break;
                        }
                        if ((iArr[iP2] & 1) != 0) {
                            break;
                            break;
                        }
                        iP2--;
                    }
                    if (iP2 == -1) {
                        iP2 = zh0Var.a(j4);
                    }
                    if (iP2 == -1) {
                        jMin = Math.min(jArr[iP2], jMin);
                    }
                }
            } else {
                i2 = i3;
                rh0VarArr = rh0VarArr;
            }
            i++;
            rh0VarArr = rh0VarArr;
            i3 = i2;
            z = false;
        }
        fe0 fe0Var3 = new fe0(j3, jMin2);
        if (j4 == -9223372036854775807L) {
        }
    }
}
