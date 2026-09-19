package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.RemoteException;
import android.util.SparseArray;
import android.webkit.WebView;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m40 implements qi0 {
    public static final byte[] m = {0, 7, 8, 15};
    public static final byte[] n = {0, 119, -120, -1};
    public static final byte[] o = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public m40(yl1 yl1Var, WebView webView, String str, String str2, w82 w82Var) {
        this.h = new ArrayList();
        this.i = new HashMap();
        this.f = yl1Var;
        this.g = webView;
        this.l = w82Var;
        this.k = str;
        this.j = str2;
    }

    public static ti0 b(oe0 oe0Var, int i) {
        int[] iArr;
        int iR;
        int iR2;
        int iR3;
        int iR4;
        int i2 = 8;
        int iR5 = oe0Var.r(8);
        oe0Var.o(8);
        int i3 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrD = d();
        int[] iArrG = g();
        int i4 = i - 2;
        while (i4 > 0) {
            int iR6 = oe0Var.r(i2);
            int iR7 = oe0Var.r(i2);
            if ((iR7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iR7 & 64) != 0 ? iArrD : iArrG;
            }
            if ((iR7 & 1) != 0) {
                iR3 = oe0Var.r(i2);
                iR4 = oe0Var.r(i2);
                iR = oe0Var.r(i2);
                iR2 = oe0Var.r(i2);
                i4 -= 6;
            } else {
                int iR8 = oe0Var.r(6) << 2;
                int iR9 = oe0Var.r(4) << 4;
                i4 -= 4;
                iR = oe0Var.r(4) << 4;
                iR2 = oe0Var.r(2) << 6;
                iR3 = iR8;
                iR4 = iR9;
            }
            if (iR3 == 0) {
                iR2 = 255;
            }
            if (iR3 == 0) {
                iR = i3;
            }
            if (iR3 == 0) {
                iR4 = i3;
            }
            double d = iR3;
            String str = qz1.a;
            double d2 = iR4 - 128;
            double d3 = iR - 128;
            iArr[iR6] = h((byte) (255 - (iR2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            i3 = 0;
            iR5 = iR5;
            iArrG = iArrG;
            i2 = 8;
        }
        return new ti0(iR5, iArr2, iArrD, iArrG);
    }

    public static vi0 c(oe0 oe0Var) {
        byte[] bArr;
        int iR = oe0Var.r(16);
        oe0Var.o(4);
        int iR2 = oe0Var.r(2);
        boolean zQ = oe0Var.q();
        oe0Var.o(1);
        byte[] bArr2 = qz1.b;
        if (iR2 != 1) {
            if (iR2 == 0) {
                int iR3 = oe0Var.r(16);
                int iR4 = oe0Var.r(16);
                if (iR3 > 0) {
                    bArr2 = new byte[iR3];
                    hn.M(oe0Var.c == 0);
                    System.arraycopy(oe0Var.a, oe0Var.b, bArr2, 0, iR3);
                    oe0Var.b += iR3;
                    oe0Var.y();
                }
                if (iR4 > 0) {
                    bArr = new byte[iR4];
                    hn.M(oe0Var.c == 0);
                    System.arraycopy(oe0Var.a, oe0Var.b, bArr, 0, iR4);
                    oe0Var.b += iR4;
                    oe0Var.y();
                }
            }
            return new vi0(iR, zQ, bArr2, bArr);
        }
        oe0Var.o(oe0Var.r(8) * 16);
        bArr = bArr2;
        return new vi0(iR, zQ, bArr2, bArr);
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = h(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = h(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] g() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = h(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = h(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = h(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = h(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = h(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    public static void i(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c;
        int iR;
        int iR2;
        int iR3;
        int i4;
        int iR4;
        int iR5;
        int i5;
        int i6;
        int iR6;
        int i7;
        Paint paint2 = paint;
        oe0 oe0Var = new oe0(bArr.length, bArr);
        int i8 = i2;
        int i9 = i3;
        byte[] bArrJ = null;
        byte[] bArrJ2 = null;
        byte[] bArrJ3 = null;
        while (oe0Var.f() != 0) {
            int iR7 = oe0Var.r(8);
            if (iR7 != 240) {
                int i10 = 4;
                int i11 = 1;
                int i12 = 2;
                switch (iR7) {
                    case 16:
                        int i13 = 1;
                        if (i == 3) {
                            if (bArrJ == null) {
                                bArr3 = n;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrJ;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrJ3 == null) {
                            bArr3 = m;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrJ3;
                        }
                        int i14 = 0;
                        while (true) {
                            int iR8 = oe0Var.r(2);
                            if (iR8 != 0) {
                                iR2 = i13;
                                iR = iR8;
                            } else {
                                if (oe0Var.q()) {
                                    iR3 = oe0Var.r(3) + 3;
                                    iR = oe0Var.r(2);
                                } else {
                                    if (oe0Var.q()) {
                                        iR2 = i13;
                                        iR = 0;
                                    } else {
                                        int iR9 = oe0Var.r(2);
                                        if (iR9 == 0) {
                                            c = 4;
                                            i14 = i13;
                                            iR = 0;
                                            iR2 = 0;
                                        } else if (iR9 == i13) {
                                            c = 4;
                                            i14 = i14;
                                            iR2 = 2;
                                            iR = 0;
                                        } else if (iR9 == 2) {
                                            c = 4;
                                            i14 = i14;
                                            iR2 = oe0Var.r(4) + 12;
                                            iR = oe0Var.r(2);
                                        } else if (iR9 != 3) {
                                            iR = 0;
                                            iR2 = 0;
                                        } else {
                                            iR3 = oe0Var.r(8) + 29;
                                            iR = oe0Var.r(2);
                                        }
                                        if (iR2 == 0 && paint2 != null) {
                                            int i15 = i9 + 1;
                                            float f = i9;
                                            if (bArr2 != 0) {
                                                iR = bArr2[iR];
                                            }
                                            paint2.setColor(iArr[iR]);
                                            canvas.drawRect(i8, f, i8 + iR2, i15, paint2);
                                        }
                                        i8 += iR2;
                                        if (i14 != 0) {
                                            oe0Var.w();
                                        } else {
                                            paint2 = paint;
                                            i14 = i14;
                                            i13 = 1;
                                        }
                                    }
                                    c = 4;
                                    if (iR2 == 0) {
                                    }
                                    i8 += iR2;
                                    if (i14 != 0) {
                                        oe0Var.w();
                                    } else {
                                        paint2 = paint;
                                        i14 = i14;
                                        i13 = 1;
                                    }
                                }
                                iR2 = iR3;
                            }
                            c = 4;
                            if (iR2 == 0) {
                            }
                            i8 += iR2;
                            if (i14 != 0) {
                                oe0Var.w();
                            } else {
                                paint2 = paint;
                                i14 = i14;
                                i13 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrJ2 == null ? o : bArrJ2 : null;
                        boolean z = false;
                        while (true) {
                            int iR10 = oe0Var.r(i10);
                            if (iR10 != 0) {
                                i4 = 1;
                                z = z;
                            } else if (oe0Var.q()) {
                                if (oe0Var.q()) {
                                    int iR11 = oe0Var.r(i12);
                                    if (iR11 == 0) {
                                        i4 = 1;
                                    } else if (iR11 == 1) {
                                        i4 = i12;
                                    } else if (iR11 == i12) {
                                        iR4 = oe0Var.r(i10) + 9;
                                        iR5 = oe0Var.r(i10);
                                    } else if (iR11 != 3) {
                                        z = z;
                                        iR10 = 0;
                                        i4 = 0;
                                    } else {
                                        iR4 = oe0Var.r(8) + 25;
                                        iR5 = oe0Var.r(i10);
                                    }
                                    iR10 = 0;
                                } else {
                                    iR4 = oe0Var.r(i12) + i10;
                                    iR5 = oe0Var.r(i10);
                                }
                                i4 = iR4;
                                z = z;
                                iR10 = iR5;
                            } else {
                                int iR12 = oe0Var.r(3);
                                if (iR12 != 0) {
                                    i4 = iR12 + 2;
                                    iR10 = 0;
                                } else {
                                    z = true;
                                    iR10 = 0;
                                    i4 = 0;
                                }
                            }
                            if (i4 == 0 || paint2 == null) {
                                i5 = i12;
                            } else {
                                int i16 = i9 + 1;
                                float f2 = i9;
                                if (bArr4 != 0) {
                                    iR10 = bArr4[iR10];
                                }
                                paint2.setColor(iArr[iR10]);
                                i5 = 2;
                                canvas.drawRect(i8, f2, i8 + i4, i16, paint2);
                            }
                            i8 += i4;
                            if (z) {
                                oe0Var.w();
                                continue;
                            } else {
                                i12 = i5;
                                z = z;
                                i10 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i17 = i8;
                        int i18 = 0;
                        while (true) {
                            int iR13 = oe0Var.r(8);
                            if (iR13 != 0) {
                                i6 = i18;
                                iR6 = i11;
                            } else if (oe0Var.q()) {
                                i6 = i18;
                                iR6 = oe0Var.r(7);
                                iR13 = oe0Var.r(8);
                            } else {
                                int iR14 = oe0Var.r(7);
                                if (iR14 != 0) {
                                    i6 = i18;
                                    iR6 = iR14;
                                    iR13 = 0;
                                } else {
                                    i6 = i11;
                                    iR13 = 0;
                                    iR6 = 0;
                                }
                            }
                            if (iR6 == 0 || paint2 == null) {
                                i7 = i11;
                            } else {
                                paint2.setColor(iArr[iR13]);
                                i7 = i11;
                                canvas.drawRect(i17, i9, i17 + iR6, i9 + 1, paint2);
                            }
                            i17 += iR6;
                            if (i6 != 0) {
                                i8 = i17;
                                continue;
                            } else {
                                i11 = i7;
                                i18 = i6;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iR7) {
                            case 32:
                                bArrJ3 = j(4, 4, oe0Var);
                                break;
                            case 33:
                                bArrJ = j(4, 8, oe0Var);
                                break;
                            case 34:
                                bArrJ2 = j(16, 8, oe0Var);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i9 += 2;
                i8 = i2;
            }
            paint2 = paint;
        }
    }

    public static byte[] j(int i, int i2, oe0 oe0Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) oe0Var.r(i2);
        }
        return bArr;
    }

    public void a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            kb3 kb3VarB = kb3.b();
            es0 es0Var = ut0.f.b;
            Context context = (Context) this.f;
            String str = (String) this.h;
            j41 j41Var = (j41) this.k;
            es0Var.getClass();
            n71 n71Var = (n71) new bk0(es0Var, context, kb3VarB, str, j41Var).d(context, false);
            this.g = n71Var;
            if (n71Var != null) {
                xx1 xx1Var = (xx1) this.i;
                xx1Var.m = jCurrentTimeMillis;
                n71Var.L2(new gu0((y6) this.j, str));
                n71 n71Var2 = (n71) this.g;
                ((gm) this.l).getClass();
                n71Var2.Z(gm.j(context, xx1Var));
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public uy2 e() throws GeneralSecurityException {
        w32 w32Var;
        w32 w32Var2;
        vy2 vy2Var = (vy2) this.f;
        if (vy2Var == null) {
            j7.r("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        w32 w32Var3 = (w32) this.h;
        if (w32Var3 == null || (w32Var = (w32) this.i) == null) {
            j7.r("Cannot build without prime factors");
            return null;
        }
        w32 w32Var4 = (w32) this.g;
        if (w32Var4 == null) {
            j7.r("Cannot build without private exponent");
            return null;
        }
        w32 w32Var5 = (w32) this.j;
        if (w32Var5 == null || (w32Var2 = (w32) this.k) == null) {
            j7.r("Cannot build without prime exponents");
            return null;
        }
        w32 w32Var6 = (w32) this.l;
        if (w32Var6 == null) {
            j7.r("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = vy2Var.J.b;
        BigInteger bigInteger2 = vy2Var.K;
        BigInteger bigInteger3 = (BigInteger) w32Var3.g;
        BigInteger bigInteger4 = (BigInteger) w32Var.g;
        BigInteger bigInteger5 = (BigInteger) w32Var4.g;
        BigInteger bigInteger6 = (BigInteger) w32Var5.g;
        BigInteger bigInteger7 = (BigInteger) w32Var2.g;
        BigInteger bigInteger8 = (BigInteger) w32Var6.g;
        if (!bigInteger3.isProbablePrime(10)) {
            j7.r("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            j7.r("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            j7.r("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            j7.r("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            j7.r("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            j7.r("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new uy2((vy2) this.f, (w32) this.h, (w32) this.i, (w32) this.g, (w32) this.j, (w32) this.k, (w32) this.l);
        }
        j7.r("qInv is invalid.");
        return null;
    }

    public bz2 f() throws GeneralSecurityException {
        w32 w32Var;
        w32 w32Var2;
        cz2 cz2Var = (cz2) this.f;
        if (cz2Var == null) {
            j7.r("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        w32 w32Var3 = (w32) this.h;
        if (w32Var3 == null || (w32Var = (w32) this.i) == null) {
            j7.r("Cannot build without prime factors");
            return null;
        }
        w32 w32Var4 = (w32) this.g;
        if (w32Var4 == null) {
            j7.r("Cannot build without private exponent");
            return null;
        }
        w32 w32Var5 = (w32) this.j;
        if (w32Var5 == null || (w32Var2 = (w32) this.k) == null) {
            j7.r("Cannot build without prime exponents");
            return null;
        }
        w32 w32Var6 = (w32) this.l;
        if (w32Var6 == null) {
            j7.r("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = cz2Var.J.b;
        BigInteger bigInteger2 = cz2Var.K;
        BigInteger bigInteger3 = (BigInteger) w32Var3.g;
        BigInteger bigInteger4 = (BigInteger) w32Var.g;
        BigInteger bigInteger5 = (BigInteger) w32Var4.g;
        BigInteger bigInteger6 = (BigInteger) w32Var5.g;
        BigInteger bigInteger7 = (BigInteger) w32Var2.g;
        BigInteger bigInteger8 = (BigInteger) w32Var6.g;
        if (!bigInteger3.isProbablePrime(10)) {
            j7.r("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            j7.r("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            j7.r("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            j7.r("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            j7.r("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            j7.r("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new bz2((cz2) this.f, (w32) this.h, (w32) this.i, (w32) this.g, (w32) this.j, (w32) this.k, (w32) this.l);
        }
        j7.r("qInv is invalid.");
        return null;
    }

    @Override // defpackage.qi0
    public void s(byte[] bArr, int i, int i2, ri0 ri0Var) {
        boolean z;
        mi0 mi0Var;
        char c;
        char c2;
        char c3;
        int i3;
        int i4;
        xi0 xi0Var;
        int i5;
        xi0 xi0Var2;
        int iR;
        int iR2;
        int i6;
        int iR3;
        Canvas canvas = (Canvas) this.h;
        zi0 zi0Var = (zi0) this.k;
        oe0 oe0Var = new oe0(i + i2, bArr);
        oe0Var.l(i);
        while (true) {
            z = true;
            if (oe0Var.f() >= 48 && oe0Var.r(8) == 15) {
                int iR4 = oe0Var.r(8);
                int i7 = 16;
                int iR5 = oe0Var.r(16);
                int iR6 = oe0Var.r(16);
                int i8 = oe0Var.i() + iR6;
                if (iR6 * 8 > oe0Var.f()) {
                    s90.Q("DvbParser", "Data field length exceeds limit");
                    oe0Var.o(oe0Var.f());
                } else {
                    switch (iR4) {
                        case 16:
                            if (iR5 == zi0Var.a) {
                                tg0 tg0Var = zi0Var.i;
                                oe0Var.r(8);
                                int iR7 = oe0Var.r(4);
                                int iR8 = oe0Var.r(2);
                                oe0Var.o(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i9 = iR6 - 2; i9 > 0; i9 -= 6) {
                                    int iR9 = oe0Var.r(8);
                                    oe0Var.o(8);
                                    sparseArray.put(iR9, new wi0(oe0Var.r(16), oe0Var.r(16)));
                                }
                                tg0 tg0Var2 = new tg0();
                                tg0Var2.f = iR7;
                                tg0Var2.g = iR8;
                                tg0Var2.h = sparseArray;
                                if (iR8 != 0) {
                                    zi0Var.i = tg0Var2;
                                    zi0Var.c.clear();
                                    zi0Var.d.clear();
                                    zi0Var.e.clear();
                                } else if (tg0Var != null && tg0Var.f != iR7) {
                                    zi0Var.i = tg0Var2;
                                }
                            }
                            break;
                        case 17:
                            tg0 tg0Var3 = zi0Var.i;
                            SparseArray sparseArray2 = zi0Var.c;
                            if (iR5 == zi0Var.a && tg0Var3 != null) {
                                int iR10 = oe0Var.r(8);
                                oe0Var.o(4);
                                boolean zQ = oe0Var.q();
                                oe0Var.o(3);
                                int iR11 = oe0Var.r(16);
                                int iR12 = oe0Var.r(16);
                                oe0Var.r(3);
                                int iR13 = oe0Var.r(3);
                                oe0Var.o(2);
                                int iR14 = oe0Var.r(8);
                                int iR15 = oe0Var.r(8);
                                int iR16 = oe0Var.r(4);
                                int iR17 = oe0Var.r(2);
                                oe0Var.o(2);
                                int i10 = iR6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i10 > 0) {
                                    int iR18 = oe0Var.r(i7);
                                    int iR19 = oe0Var.r(2);
                                    oe0Var.r(2);
                                    int iR20 = oe0Var.r(12);
                                    oe0Var.o(4);
                                    int iR21 = oe0Var.r(12);
                                    int i11 = i10 - 6;
                                    if (iR19 == 1 || iR19 == 2) {
                                        oe0Var.r(8);
                                        oe0Var.r(8);
                                        i10 -= 8;
                                    } else {
                                        i10 = i11;
                                    }
                                    sparseArray3.put(iR18, new yi0(iR20, iR21));
                                    i7 = 16;
                                }
                                xi0 xi0Var3 = new xi0(iR10, zQ, iR11, iR12, iR13, iR14, iR15, iR16, iR17, sparseArray3);
                                if (tg0Var3.g == 0 && (xi0Var2 = (xi0) sparseArray2.get(iR10)) != null) {
                                    int i12 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = xi0Var2.j;
                                        if (i12 < sparseArray4.size()) {
                                            xi0Var3.j.put(sparseArray4.keyAt(i12), (yi0) sparseArray4.valueAt(i12));
                                            i12++;
                                        }
                                    }
                                }
                                sparseArray2.put(xi0Var3.a, xi0Var3);
                            }
                            break;
                        case 18:
                            if (iR5 == zi0Var.a) {
                                ti0 ti0VarB = b(oe0Var, iR6);
                                zi0Var.d.put(ti0VarB.a, ti0VarB);
                            } else if (iR5 == zi0Var.b) {
                                ti0 ti0VarB2 = b(oe0Var, iR6);
                                zi0Var.f.put(ti0VarB2.a, ti0VarB2);
                            }
                            break;
                        case 19:
                            if (iR5 == zi0Var.a) {
                                vi0 vi0VarC = c(oe0Var);
                                zi0Var.e.put(vi0VarC.a, vi0VarC);
                            } else if (iR5 == zi0Var.b) {
                                vi0 vi0VarC2 = c(oe0Var);
                                zi0Var.g.put(vi0VarC2.a, vi0VarC2);
                            }
                            break;
                        case 20:
                            if (iR5 == zi0Var.a) {
                                oe0Var.o(4);
                                boolean zQ2 = oe0Var.q();
                                oe0Var.o(3);
                                int iR22 = oe0Var.r(16);
                                int iR23 = oe0Var.r(16);
                                if (zQ2) {
                                    int iR24 = oe0Var.r(16);
                                    iR = oe0Var.r(16);
                                    iR3 = oe0Var.r(16);
                                    iR2 = oe0Var.r(16);
                                    i6 = iR24;
                                } else {
                                    iR = iR22;
                                    iR2 = iR23;
                                    i6 = 0;
                                    iR3 = 0;
                                }
                                zi0Var.h = new ui0(iR22, iR23, i6, iR, iR3, iR2);
                            }
                            break;
                    }
                    oe0Var.x(i8 - oe0Var.i());
                }
            }
        }
        tg0 tg0Var4 = zi0Var.i;
        if (tg0Var4 == null) {
            tj2 tj2Var = vj2.g;
            mi0Var = new mi0(qk2.j, -9223372036854775807L, -9223372036854775807L);
        } else {
            ui0 ui0Var = zi0Var.h;
            if (ui0Var == null) {
                ui0Var = (ui0) this.i;
            }
            ui0 ui0Var2 = ui0Var;
            Bitmap bitmap = (Bitmap) this.l;
            if (bitmap == null || ui0Var2.a + 1 != bitmap.getWidth() || ui0Var2.b + 1 != ((Bitmap) this.l).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ui0Var2.a + 1, ui0Var2.b + 1, Bitmap.Config.ARGB_8888);
                this.l = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) tg0Var4.h;
            int i13 = 0;
            while (i13 < sparseArray5.size()) {
                canvas.save();
                wi0 wi0Var = (wi0) sparseArray5.valueAt(i13);
                xi0 xi0Var4 = (xi0) zi0Var.c.get(sparseArray5.keyAt(i13));
                int i14 = wi0Var.a + ui0Var2.c;
                int i15 = wi0Var.b + ui0Var2.e;
                int i16 = xi0Var4.c;
                int i17 = i14 + i16;
                int iMin = Math.min(i17, ui0Var2.d);
                boolean z2 = z;
                int i18 = xi0Var4.d;
                int i19 = i15 + i18;
                canvas.clipRect(i14, i15, iMin, Math.min(i19, ui0Var2.f));
                int i20 = xi0Var4.f;
                ti0 ti0Var = (ti0) zi0Var.d.get(i20);
                if (ti0Var == null && (ti0Var = (ti0) zi0Var.f.get(i20)) == null) {
                    ti0Var = (ti0) this.j;
                }
                SparseArray sparseArray6 = xi0Var4.j;
                SparseArray sparseArray7 = sparseArray5;
                int i21 = i15;
                int i22 = 0;
                while (i22 < sparseArray6.size()) {
                    int iKeyAt = sparseArray6.keyAt(i22);
                    int i23 = i22;
                    yi0 yi0Var = (yi0) sparseArray6.valueAt(i22);
                    int i24 = i14;
                    vi0 vi0Var = (vi0) zi0Var.e.get(iKeyAt);
                    if (vi0Var == null) {
                        vi0Var = (vi0) zi0Var.g.get(iKeyAt);
                    }
                    vi0 vi0Var2 = vi0Var;
                    if (vi0Var2 != null) {
                        Paint paint = vi0Var2.b ? null : (Paint) this.f;
                        int i25 = xi0Var4.e;
                        xi0 xi0Var5 = xi0Var4;
                        int i26 = i24 + yi0Var.a;
                        int i27 = i21 + yi0Var.b;
                        int[] iArr = i25 == 3 ? ti0Var.d : i25 == 2 ? ti0Var.c : ti0Var.b;
                        xi0Var = xi0Var5;
                        Paint paint2 = paint;
                        i5 = i18;
                        i4 = i21;
                        i(vi0Var2.c, iArr, i25, i26, i27, paint2, canvas);
                        i(vi0Var2.d, iArr, i25, i26, i27 + 1, paint2, canvas);
                    } else {
                        i4 = i21;
                        xi0Var = xi0Var4;
                        i5 = i18;
                    }
                    i21 = i4;
                    i13 = i13;
                    xi0Var4 = xi0Var;
                    i14 = i24;
                    i22 = i23 + 1;
                    i17 = i17;
                    i16 = i16;
                    arrayList = arrayList;
                    zi0Var = zi0Var;
                    ui0Var2 = ui0Var2;
                    sparseArray6 = sparseArray6;
                    i18 = i5;
                }
                int i28 = i21;
                int i29 = i13;
                zi0 zi0Var2 = zi0Var;
                xi0 xi0Var6 = xi0Var4;
                int i30 = i14;
                ui0 ui0Var3 = ui0Var2;
                int i31 = i18;
                ArrayList arrayList2 = arrayList;
                int i32 = i16;
                int i33 = i17;
                float f = i28;
                float f2 = i30;
                if (xi0Var6.b) {
                    int i34 = xi0Var6.e;
                    c2 = 3;
                    if (i34 == 3) {
                        i3 = ti0Var.d[xi0Var6.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i34 == 2 ? ti0Var.c[xi0Var6.h] : ti0Var.b[xi0Var6.i];
                    }
                    Paint paint3 = (Paint) this.g;
                    paint3.setColor(i3);
                    c = c3;
                    canvas.drawRect(f2, f, i33, i19, paint3);
                } else {
                    c = 2;
                    c2 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.l, i30, i28, i32, i31);
                float f3 = ui0Var3.a;
                float f4 = f2 / f3;
                float f5 = ui0Var3.b;
                tf1 tf1Var = new tf1(null, null, null, bitmapCreateBitmap2, f / f5, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i32 / f3, i31 / f5, Integer.MIN_VALUE, 0.0f, 0);
                arrayList = arrayList2;
                arrayList.add(tf1Var);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i13 = i29 + 1;
                ui0Var2 = ui0Var3;
                sparseArray5 = sparseArray7;
                zi0Var = zi0Var2;
                z = z2;
            }
            mi0Var = new mi0(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        ri0Var.mo0b(mi0Var);
    }

    public m40() {
        this.k = new q00(0);
        this.l = new q00(0);
    }

    public m40(Context context, String str, xx1 xx1Var, y6 y6Var) {
        this.k = new j41();
        this.f = context;
        this.h = str;
        this.i = xx1Var;
        this.j = y6Var;
        this.l = gm.o;
    }

    public /* synthetic */ m40(boolean z) {
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
    }
}
