package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zp implements Cloneable {
    public /* synthetic */ boolean f;
    public /* synthetic */ long[] g;
    public /* synthetic */ Object[] h;
    public /* synthetic */ int i;

    public final void a(long j, Object obj) {
        Object obj2 = a23.f;
        int iD = rs0.d(this.g, this.i, j);
        if (iD >= 0) {
            this.h[iD] = obj;
            return;
        }
        int i = ~iD;
        int i2 = this.i;
        if (i < i2) {
            Object[] objArr = this.h;
            if (objArr[i] == obj2) {
                this.g[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f) {
            long[] jArr = this.g;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.h;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f = false;
                this.i = i3;
                i = ~rs0.d(this.g, i3, j);
            }
        }
        int i5 = this.i;
        if (i5 >= this.g.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.g = Arrays.copyOf(this.g, i9);
            this.h = Arrays.copyOf(this.h, i9);
        }
        int i10 = this.i - i;
        if (i10 != 0) {
            long[] jArr2 = this.g;
            int i11 = i + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.h;
            o7.b1(i11, i, this.i, objArr3, objArr3);
        }
        this.g[i] = j;
        this.h[i] = obj;
        this.i++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        zp zpVar = (zp) objClone;
        zpVar.g = (long[]) this.g.clone();
        zpVar.h = (Object[]) this.h.clone();
        return zpVar;
    }

    public final String toString() {
        int i;
        int i2;
        if (this.f) {
            int i3 = this.i;
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != a23.f) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f = false;
            this.i = i4;
        }
        if (this.i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 28);
        sb.append('{');
        int i6 = this.i;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            if (i7 < 0 || i7 >= (i = this.i)) {
                throw new IllegalArgumentException(ec.h("Expected index to be within 0..size()-1, but was ", i7).toString());
            }
            if (this.f) {
                long[] jArr2 = this.g;
                Object[] objArr2 = this.h;
                int i8 = 0;
                for (int i9 = 0; i9 < i; i9++) {
                    Object obj2 = objArr2[i9];
                    if (obj2 != a23.f) {
                        if (i9 != i8) {
                            jArr2[i8] = jArr2[i9];
                            objArr2[i8] = obj2;
                            objArr2[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f = false;
                this.i = i8;
            }
            sb.append(this.g[i7]);
            sb.append('=');
            if (i7 < 0 || i7 >= (i2 = this.i)) {
                throw new IllegalArgumentException(ec.h("Expected index to be within 0..size()-1, but was ", i7).toString());
            }
            if (this.f) {
                long[] jArr3 = this.g;
                Object[] objArr3 = this.h;
                int i10 = 0;
                for (int i11 = 0; i11 < i2; i11++) {
                    Object obj3 = objArr3[i11];
                    if (obj3 != a23.f) {
                        if (i11 != i10) {
                            jArr3[i10] = jArr3[i11];
                            objArr3[i10] = obj3;
                            objArr3[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f = false;
                this.i = i10;
            }
            Object obj4 = this.h[i7];
            if (obj4 != sb) {
                sb.append(obj4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
