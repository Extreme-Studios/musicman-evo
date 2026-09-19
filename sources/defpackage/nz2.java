package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nz2 implements jo2 {
    public final /* synthetic */ int a = 0;
    public final byte[] b;
    public final byte[] c;
    public final Object d;

    public nz2(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!jn.r(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            j7.p("Given public key's length is not 32.");
            throw null;
        }
        this.d = j03.a(bArr);
        this.b = bArr2;
        this.c = bArr3;
        if (fr2.a != null) {
            return;
        }
        j7.e("Could not initialize Ed25519.");
        throw null;
    }

    public static byte[] b(ts2 ts2Var) {
        yw2 yw2Var = (yw2) ts2Var.j;
        Integer num = (Integer) ts2Var.k;
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return gs2.b(num.intValue()).b();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return gs2.a.b();
            }
            if (iOrdinal != 4) {
                j7.r("unknown output prefix type");
                return null;
            }
        }
        return gs2.a(num.intValue()).b();
    }

    @Override // defpackage.jo2
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        byte[] bArr3 = this.b;
        byte[] bArr4 = this.c;
        switch (i) {
            case 0:
                jo2 jo2Var = (jo2) this.d;
                int length = bArr3.length;
                if (length == 0 && bArr4.length == 0) {
                    jo2Var.a(bArr, bArr2);
                } else if (!ct2.c(bArr3, bArr)) {
                    j7.r("Invalid signature (output prefix mismatch)");
                } else {
                    if (bArr4.length != 0) {
                        bArr2 = na1.x(bArr2, bArr4);
                    }
                    jo2Var.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                }
                break;
            default:
                int length2 = bArr3.length;
                if (length2 == 0 && bArr4.length == 0) {
                    c(bArr, bArr2);
                } else if (!ct2.c(bArr3, bArr)) {
                    j7.r("Invalid signature (output prefix mismatch)");
                } else {
                    if (bArr4.length != 0) {
                        bArr2 = na1.x(bArr2, bArr4);
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                }
                break;
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            j7.r("The length of the signature is not 64.");
            return;
        }
        byte[] bArrB = ((j03) this.d).b();
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i = 31;
            while (i >= 0) {
                int i2 = bArrCopyOfRange[i] & 255;
                int i3 = w40.x[i] & 255;
                if (i2 != i3) {
                    if (i2 >= i3) {
                        break;
                    }
                    MessageDigest messageDigest = (MessageDigest) a03.e.a.l("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArrB);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jU0 = w40.U0(0, bArrDigest) & 2097151;
                    long jX0 = w40.X0(2, bArrDigest) >> 5;
                    long jU1 = w40.U0(5, bArrDigest) >> 2;
                    long jX1 = w40.X0(7, bArrDigest) >> 7;
                    long jX2 = w40.X0(10, bArrDigest) >> 4;
                    long jU2 = w40.U0(13, bArrDigest) >> 1;
                    long jX3 = w40.X0(15, bArrDigest) >> 6;
                    long jU3 = w40.U0(18, bArrDigest) >> 3;
                    long jU4 = w40.U0(21, bArrDigest) & 2097151;
                    long jX4 = w40.X0(23, bArrDigest) >> 5;
                    long jU5 = w40.U0(26, bArrDigest) >> 2;
                    long jX5 = w40.X0(28, bArrDigest) >> 7;
                    long jX6 = w40.X0(31, bArrDigest) >> 4;
                    long jU6 = w40.U0(34, bArrDigest) >> 1;
                    long jX7 = w40.X0(36, bArrDigest) >> 6;
                    long jU7 = w40.U0(39, bArrDigest) >> 3;
                    long jU8 = w40.U0(42, bArrDigest) & 2097151;
                    long jX8 = w40.X0(44, bArrDigest) >> 5;
                    long jU9 = (w40.U0(47, bArrDigest) >> 2) & 2097151;
                    long jX9 = (w40.X0(49, bArrDigest) >> 7) & 2097151;
                    long jX10 = (w40.X0(52, bArrDigest) >> 4) & 2097151;
                    long jU10 = (w40.U0(55, bArrDigest) >> 1) & 2097151;
                    long jX11 = (w40.X0(57, bArrDigest) >> 6) & 2097151;
                    long jX12 = w40.X0(60, bArrDigest) >> 3;
                    long j = (jX10 * 666643) + jU4;
                    long j2 = (jX9 * 666643) + jU3;
                    long j3 = (jU9 * 666643) + (jX3 & 2097151);
                    long j4 = (j3 + 1048576) >> 21;
                    long j5 = j4 << 21;
                    long j6 = (jU9 * 654183) + (jX9 * 470296) + j;
                    long j7 = (j6 + 1048576) >> 21;
                    long j8 = j7 << 21;
                    long j9 = (jU9 * 136657) + (((jX10 * 654183) + ((jU10 * 470296) + ((jX11 * 666643) + (jU5 & 2097151)))) - (jX9 * 997805));
                    long j10 = (j9 + 1048576) >> 21;
                    long j11 = j10 << 21;
                    long j12 = ((jX10 * 136657) + (((jX11 * 654183) + ((jX12 * 470296) + (jX6 & 2097151))) - (jU10 * 997805))) - (jX9 * 683901);
                    long j13 = (j12 + 1048576) >> 21;
                    long j14 = ((jX11 * 136657) + ((jX7 & 2097151) - (jX12 * 997805))) - (jU10 * 683901);
                    long j15 = (j14 + 1048576) >> 21;
                    long j16 = j15 << 21;
                    long j17 = jU8 - (jX12 * 683901);
                    long j18 = (j17 + 1048576) >> 21;
                    long j19 = (jU9 * 470296) + j2 + j4;
                    long j20 = (j19 + 1048576) >> 21;
                    long j21 = j20 << 21;
                    long j22 = (((jX9 * 654183) + ((jX10 * 470296) + ((jU10 * 666643) + (jX4 & 2097151)))) - (jU9 * 997805)) + j7;
                    long j23 = (j22 + 1048576) >> 21;
                    long j24 = j23 << 21;
                    long j25 = (((jX9 * 136657) + (((jU10 * 654183) + ((jX11 * 470296) + ((jX12 * 666643) + (jX5 & 2097151)))) - (jX10 * 997805))) - (jU9 * 683901)) + j10;
                    long j26 = (j25 + 1048576) >> 21;
                    long j27 = j26 << 21;
                    long j28 = (((jU10 * 136657) + (((jX12 * 654183) + (jU6 & 2097151)) - (jX11 * 997805))) - (jX10 * 683901)) + j13;
                    long j29 = (j28 + 1048576) >> 21;
                    long j30 = (((jX12 * 136657) + jU7) - (jX11 * 683901)) + j15;
                    long j31 = (j30 + 1048576) >> 21;
                    long j32 = (j12 - (j13 << 21)) + j26;
                    long j33 = (j32 * 666643) + jU0;
                    long j34 = (j33 + 1048576) >> 21;
                    long j35 = j34 << 21;
                    long j36 = (j14 - j16) + j29;
                    long j37 = j28 - (j29 << 21);
                    long j38 = (j32 * 654183) + (j37 * 470296) + (j36 * 666643) + (jU1 & 2097151);
                    long j39 = (j38 + 1048576) >> 21;
                    long j40 = j39 << 21;
                    long j41 = (j17 - (j18 << 21)) + j31;
                    long j42 = j30 - (j31 << 21);
                    long j43 = (j32 * 136657) + (((j36 * 654183) + ((j42 * 470296) + ((j41 * 666643) + (jX2 & 2097151)))) - (j37 * 997805));
                    long j44 = (j43 + 1048576) >> 21;
                    long j45 = j44 << 21;
                    long j46 = (jX8 & 2097151) + j18;
                    long j47 = ((j36 * 136657) + (((j41 * 654183) + ((j46 * 470296) + (j3 - j5))) - (j42 * 997805))) - (j37 * 683901);
                    long j48 = (j47 + 1048576) >> 21;
                    long j49 = j48 << 21;
                    long j50 = ((j41 * 136657) + (((j6 - j8) + j20) - (j46 * 997805))) - (j42 * 683901);
                    long j51 = (j50 + 1048576) >> 21;
                    long j52 = j51 << 21;
                    long j53 = ((j9 - j11) + j23) - (j46 * 683901);
                    long j54 = (j53 + 1048576) >> 21;
                    long j55 = j54 << 21;
                    long j56 = (j32 * 470296) + (j37 * 666643) + (jX0 & 2097151) + j34;
                    long j57 = (j56 + 1048576) >> 21;
                    long j58 = (((j37 * 654183) + ((j36 * 470296) + ((j42 * 666643) + (jX1 & 2097151)))) - (j32 * 997805)) + j39;
                    long j59 = (j58 + 1048576) >> 21;
                    long j60 = (((j37 * 136657) + (((j42 * 654183) + ((j41 * 470296) + ((j46 * 666643) + (jU2 & 2097151)))) - (j36 * 997805))) - (j32 * 683901)) + j44;
                    long j61 = (j60 + 1048576) >> 21;
                    long j62 = (((j42 * 136657) + (((j46 * 654183) + (j19 - j21)) - (j41 * 997805))) - (j36 * 683901)) + j48;
                    long j63 = (j62 + 1048576) >> 21;
                    long j64 = (((j46 * 136657) + (j22 - j24)) - (j41 * 683901)) + j51;
                    long j65 = (j64 + 1048576) >> 21;
                    long j66 = (j25 - j27) + j54;
                    long j67 = (j66 + 1048576) >> 21;
                    long j68 = j67 << 21;
                    long j69 = (j67 * 666643) + (j33 - j35);
                    long j70 = j69 >> 21;
                    long j71 = j70 << 21;
                    long j72 = (j67 * 470296) + (j56 - (j57 << 21)) + j70;
                    long j73 = j72 >> 21;
                    long j74 = j73 << 21;
                    long j75 = (j67 * 654183) + (j38 - j40) + j57 + j73;
                    long j76 = j75 >> 21;
                    long j77 = j76 << 21;
                    long j78 = ((j58 - (j59 << 21)) - (j67 * 997805)) + j76;
                    long j79 = j78 >> 21;
                    long j80 = j79 << 21;
                    long j81 = (j67 * 136657) + (j43 - j45) + j59 + j79;
                    long j82 = j81 >> 21;
                    long j83 = j82 << 21;
                    long j84 = ((j60 - (j61 << 21)) - (j67 * 683901)) + j82;
                    long j85 = j84 >> 21;
                    long j86 = j85 << 21;
                    long j87 = (j47 - j49) + j61 + j85;
                    long j88 = j87 >> 21;
                    long j89 = j88 << 21;
                    long j90 = (j62 - (j63 << 21)) + j88;
                    long j91 = j90 >> 21;
                    long j92 = j91 << 21;
                    long j93 = (j50 - j52) + j63 + j91;
                    long j94 = j93 >> 21;
                    long j95 = j94 << 21;
                    long j96 = (j64 - (j65 << 21)) + j94;
                    long j97 = j96 >> 21;
                    long j98 = j97 << 21;
                    long j99 = (j53 - j55) + j65 + j97;
                    long j100 = j99 >> 21;
                    long j101 = j100 << 21;
                    long j102 = (j66 - j68) + j100;
                    long j103 = j102 >> 21;
                    long j104 = j103 << 21;
                    long j105 = (666643 * j103) + (j69 - j71);
                    long j106 = j105 >> 21;
                    long j107 = j106 << 21;
                    long j108 = (470296 * j103) + (j72 - j74) + j106;
                    long j109 = j108 >> 21;
                    long j110 = j109 << 21;
                    long j111 = (654183 * j103) + (j75 - j77) + j109;
                    long j112 = j111 >> 21;
                    long j113 = j112 << 21;
                    long j114 = ((j78 - j80) - (997805 * j103)) + j112;
                    long j115 = j114 >> 21;
                    long j116 = j115 << 21;
                    long j117 = (136657 * j103) + (j81 - j83) + j115;
                    long j118 = j117 >> 21;
                    long j119 = j118 << 21;
                    long j120 = ((j84 - j86) - (j103 * 683901)) + j118;
                    long j121 = j120 >> 21;
                    long j122 = j121 << 21;
                    long j123 = (j87 - j89) + j121;
                    long j124 = j123 >> 21;
                    long j125 = j124 << 21;
                    long j126 = (j90 - j92) + j124;
                    long j127 = j126 >> 21;
                    long j128 = j127 << 21;
                    long j129 = (j93 - j95) + j127;
                    long j130 = j129 >> 21;
                    long j131 = j130 << 21;
                    long j132 = (j96 - j98) + j130;
                    long j133 = j132 >> 21;
                    long j134 = j133 << 21;
                    long j135 = (j99 - j101) + j133;
                    long j136 = j135 >> 21;
                    long j137 = j105 - j107;
                    bArrDigest[0] = (byte) j137;
                    long j138 = j126 - j128;
                    long j139 = j123 - j125;
                    long j140 = j120 - j122;
                    long j141 = j117 - j119;
                    long j142 = j114 - j116;
                    long j143 = j111 - j113;
                    long j144 = j108 - j110;
                    bArrDigest[1] = (byte) (j137 >> 8);
                    bArrDigest[2] = (byte) ((j137 >> 16) | (j144 << 5));
                    bArrDigest[3] = (byte) (j144 >> 3);
                    bArrDigest[4] = (byte) (j144 >> 11);
                    bArrDigest[5] = (byte) ((j144 >> 19) | (j143 << 2));
                    bArrDigest[6] = (byte) (j143 >> 6);
                    bArrDigest[7] = (byte) ((j143 >> 14) | (j142 << 7));
                    bArrDigest[8] = (byte) (j142 >> 1);
                    bArrDigest[9] = (byte) (j142 >> 9);
                    bArrDigest[10] = (byte) ((j142 >> 17) | (j141 << 4));
                    bArrDigest[11] = (byte) (j141 >> 4);
                    bArrDigest[12] = (byte) (j141 >> 12);
                    bArrDigest[13] = (byte) ((j141 >> 20) | (j140 + j140));
                    bArrDigest[14] = (byte) (j140 >> 7);
                    bArrDigest[15] = (byte) ((j140 >> 15) | (j139 << 6));
                    bArrDigest[16] = (byte) (j139 >> 2);
                    bArrDigest[17] = (byte) (j139 >> 10);
                    bArrDigest[18] = (byte) ((j139 >> 18) | (j138 << 3));
                    long j145 = j135 - (j136 << 21);
                    long j146 = (j102 - j104) + j136;
                    long j147 = j132 - j134;
                    long j148 = j129 - j131;
                    bArrDigest[19] = (byte) (j138 >> 5);
                    bArrDigest[20] = (byte) (j138 >> 13);
                    bArrDigest[21] = (byte) j148;
                    bArrDigest[22] = (byte) (j148 >> 8);
                    bArrDigest[23] = (byte) ((j148 >> 16) | (j147 << 5));
                    bArrDigest[24] = (byte) (j147 >> 3);
                    bArrDigest[25] = (byte) (j147 >> 11);
                    bArrDigest[26] = (byte) ((j147 >> 19) | (j145 << 2));
                    bArrDigest[27] = (byte) (j145 >> 6);
                    bArrDigest[28] = (byte) ((j145 >> 14) | (j146 << 7));
                    bArrDigest[29] = (byte) (j146 >> 1);
                    bArrDigest[30] = (byte) (j146 >> 9);
                    bArrDigest[31] = (byte) (j146 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrF0 = s90.f0(bArrB);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    s90.c0(jArr4, jArrF0);
                    s90.Z(jArr5, jArr4, fr2.a);
                    s90.M(jArr4, jArr4, jArr2);
                    s90.F(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    s90.c0(jArr8, jArr5);
                    s90.Z(jArr8, jArr8, jArr5);
                    s90.c0(jArr, jArr8);
                    s90.Z(jArr, jArr, jArr5);
                    s90.Z(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    s90.c0(jArr9, jArr);
                    s90.c0(jArr10, jArr9);
                    s90.c0(jArr10, jArr10);
                    s90.Z(jArr10, jArr, jArr10);
                    s90.Z(jArr9, jArr9, jArr10);
                    s90.c0(jArr9, jArr9);
                    s90.Z(jArr9, jArr10, jArr9);
                    s90.c0(jArr10, jArr9);
                    for (int i4 = 1; i4 < 5; i4++) {
                        s90.c0(jArr10, jArr10);
                    }
                    s90.Z(jArr9, jArr10, jArr9);
                    s90.c0(jArr10, jArr9);
                    for (int i5 = 1; i5 < 10; i5++) {
                        s90.c0(jArr10, jArr10);
                    }
                    s90.Z(jArr10, jArr10, jArr9);
                    s90.c0(jArr11, jArr10);
                    for (int i6 = 1; i6 < 20; i6++) {
                        s90.c0(jArr11, jArr11);
                    }
                    s90.Z(jArr10, jArr11, jArr10);
                    s90.c0(jArr10, jArr10);
                    for (int i7 = 1; i7 < 10; i7++) {
                        s90.c0(jArr10, jArr10);
                    }
                    s90.Z(jArr9, jArr10, jArr9);
                    s90.c0(jArr10, jArr9);
                    for (int i8 = 1; i8 < 50; i8++) {
                        s90.c0(jArr10, jArr10);
                    }
                    s90.Z(jArr10, jArr10, jArr9);
                    s90.c0(jArr11, jArr10);
                    for (int i9 = 1; i9 < 100; i9++) {
                        s90.c0(jArr11, jArr11);
                    }
                    s90.Z(jArr10, jArr11, jArr10);
                    s90.c0(jArr10, jArr10);
                    for (int i10 = 1; i10 < 50; i10++) {
                        s90.c0(jArr10, jArr10);
                    }
                    s90.Z(jArr9, jArr10, jArr9);
                    s90.c0(jArr9, jArr9);
                    s90.c0(jArr9, jArr9);
                    s90.Z(jArr, jArr9, jArr);
                    s90.Z(jArr, jArr, jArr8);
                    s90.Z(jArr, jArr, jArr4);
                    s90.c0(jArr6, jArr);
                    s90.Z(jArr6, jArr6, jArr5);
                    s90.M(jArr7, jArr6, jArr4);
                    if (w40.v0(jArr7)) {
                        s90.F(jArr7, jArr6, jArr4);
                        if (w40.v0(jArr7)) {
                            j7.r("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                            return;
                        }
                        s90.Z(jArr, jArr, fr2.c);
                    }
                    if (!w40.v0(jArr) && ((bArrB[31] & 255) >> 7) != 0) {
                        j7.r("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                        return;
                    }
                    if ((s90.h0(jArr)[0] & 1) == ((bArrB[31] & 255) >> 7)) {
                        for (int i11 = 0; i11 < 10; i11++) {
                            jArr[i11] = -jArr[i11];
                        }
                    }
                    s90.Z(jArr3, jArr, jArrF0);
                    r52 r52Var = new r52(jArr, jArrF0, jArr2, 28, false);
                    er2[] er2VarArr = new er2[8];
                    er2VarArr[0] = new er2(new vg2(r52Var, 23, jArr3));
                    un1 un1Var = new un1(new r52(28), 22, new long[10]);
                    w40.J0(un1Var, r52Var);
                    vg2 vg2Var = new vg2(un1Var);
                    for (int i12 = 1; i12 < 8; i12++) {
                        w40.D0(un1Var, vg2Var, er2VarArr[i12 - 1]);
                        er2VarArr[i12] = new er2(new vg2(un1Var));
                    }
                    byte[] bArrQ0 = w40.Q0(bArrDigest);
                    byte[] bArrQ1 = w40.Q0(bArrCopyOfRange);
                    un1 un1Var2 = new un1(22);
                    vg2 vg2Var2 = new vg2(23);
                    int i13 = 255;
                    while (i13 >= 0 && bArrQ0[i13] == 0 && bArrQ1[i13] == 0) {
                        i13--;
                    }
                    while (i13 >= 0) {
                        w40.J0(un1Var2, new r52(un1Var2));
                        byte b = bArrQ0[i13];
                        if (b > 0) {
                            vg2.r(vg2Var2, un1Var2);
                            w40.D0(un1Var2, vg2Var2, er2VarArr[bArrQ0[i13] / 2]);
                        } else if (b < 0) {
                            vg2.r(vg2Var2, un1Var2);
                            w40.H0(un1Var2, vg2Var2, er2VarArr[(-bArrQ0[i13]) / 2]);
                        }
                        byte b2 = bArrQ1[i13];
                        if (b2 > 0) {
                            vg2.r(vg2Var2, un1Var2);
                            w40.D0(un1Var2, vg2Var2, fr2.e[bArrQ1[i13] / 2]);
                        } else if (b2 < 0) {
                            vg2.r(vg2Var2, un1Var2);
                            w40.H0(un1Var2, vg2Var2, fr2.e[(-bArrQ1[i13]) / 2]);
                        }
                        i13--;
                    }
                    byte[] bArrI = new r52(un1Var2).I();
                    for (int i14 = 0; i14 < 32; i14++) {
                        if (bArrI[i14] != bArr[i14]) {
                            break;
                        }
                    }
                    return;
                }
                i--;
                bArr3 = bArr;
            }
        }
        j7.r("Signature check failed.");
    }

    public nz2(jo2 jo2Var, byte[] bArr, byte[] bArr2) {
        this.d = jo2Var;
        this.b = bArr;
        this.c = bArr2;
    }
}
