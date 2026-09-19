package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dy2 implements pm1, vf3 {
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ dy2() {
        this.g = null;
        this.h = null;
        this.f = null;
    }

    public ey2 a() throws GeneralSecurityException {
        j03 j03VarA;
        by2 by2Var = (by2) this.g;
        if (by2Var == null) {
            j7.r("Cannot build without parameters");
            return null;
        }
        ECPoint eCPoint = (ECPoint) this.h;
        if (eCPoint == null) {
            j7.r("Cannot build without public point");
            return null;
        }
        hr2.a(eCPoint, by2Var.b.b.getCurve());
        if (((by2) this.g).a() && ((Integer) this.f) == null) {
            j7.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((by2) this.g).a() && ((Integer) this.f) != null) {
            j7.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        bp2 bp2Var = ((by2) this.g).d;
        if (bp2Var == bp2.p) {
            j03VarA = gs2.a;
        } else if (bp2Var == bp2.o || bp2Var == bp2.n) {
            j03VarA = gs2.a(((Integer) this.f).intValue());
        } else {
            if (bp2Var != bp2.m) {
                j7.e("Unknown EcdsaParameters.Variant: ".concat(bp2Var.g));
                return null;
            }
            j03VarA = gs2.b(((Integer) this.f).intValue());
        }
        return new ey2((by2) this.g, (ECPoint) this.h, j03VarA, (Integer) this.f);
    }

    @Override // defpackage.pm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo0b(Object obj) {
        ((ge3) obj).r(0, ((xb3) this.g).a, (qd3) this.h, (vd3) this.f);
    }

    @Override // defpackage.vf3
    public qk2 c(int i, cy0 cy0Var, int[] iArr) {
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < cy0Var.a) {
            int i4 = i;
            cy0 cy0Var2 = cy0Var;
            uf3 uf3Var = new uf3(i4, cy0Var2, i2, (sf3) this.g, iArr[i2], (String) this.h, (String) this.f);
            int length = objArrCopyOf.length;
            int i5 = i3 + 1;
            int iD = pj2.d(length, i5);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i3] = uf3Var;
            i2++;
            i3 = i5;
            i = i4;
            cy0Var = cy0Var2;
        }
        return vj2.o(objArrCopyOf, i3);
    }

    public cz2 d() throws GeneralSecurityException {
        j03 j03VarA;
        if (((az2) this.g) == null) {
            j7.r("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.h;
        if (bigInteger == null) {
            j7.r("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        az2 az2Var = (az2) this.g;
        int i = az2Var.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(ec.l(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", i));
        }
        if (az2Var.a() && ((Integer) this.f) == null) {
            j7.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((az2) this.g).a() && ((Integer) this.f) != null) {
            j7.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zy2 zy2Var = ((az2) this.g).c;
        if (zy2Var == zy2.e) {
            j03VarA = gs2.a;
        } else if (zy2Var == zy2.d || zy2Var == zy2.c) {
            j03VarA = gs2.a(((Integer) this.f).intValue());
        } else {
            if (zy2Var != zy2.b) {
                j7.e("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(zy2Var)));
                return null;
            }
            j03VarA = gs2.b(((Integer) this.f).intValue());
        }
        return new cz2((az2) this.g, (BigInteger) this.h, j03VarA, (Integer) this.f);
    }

    public /* synthetic */ dy2(Object obj, Object obj2, Object obj3) {
        this.g = obj;
        this.h = obj2;
        this.f = obj3;
    }
}
