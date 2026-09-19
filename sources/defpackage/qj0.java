package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qj0 implements qi0 {
    public final cw1 f = new cw1();
    public final boolean g;
    public final int h;
    public final int i;
    public final String j;
    public final float k;
    public final int l;

    public qj0(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.h = 0;
            this.i = -1;
            this.j = "sans-serif";
            this.g = false;
            this.k = 0.85f;
            this.l = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.h = bArr[24];
        this.i = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.j = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.l = i;
        boolean z = (bArr[0] & 32) != 0;
        this.g = z;
        if (z) {
            this.k = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.k = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qi0
    public final void s(byte[] bArr, int i, int i2, ri0 ri0Var) {
        String strK;
        int i3;
        int i4;
        float f;
        int i5;
        float fMax;
        int i6;
        cw1 cw1Var = this.f;
        cw1Var.z(i + i2, bArr);
        cw1Var.E(i);
        int i7 = 0;
        int i8 = 1;
        int i9 = 2;
        hn.v(cw1Var.B() >= 2);
        int iL = cw1Var.L();
        if (iL == 0) {
            strK = "";
        } else {
            int i10 = cw1Var.b;
            Charset charsetQ = cw1Var.q();
            int i11 = cw1Var.b - i10;
            if (charsetQ == null) {
                charsetQ = StandardCharsets.UTF_8;
            }
            strK = cw1Var.k(iL - i11, charsetQ);
        }
        if (strK.isEmpty()) {
            tj2 tj2Var = vj2.g;
            ri0Var.mo0b(new mi0(qk2.j, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK);
        int length = spannableStringBuilder.length();
        int i12 = this.h;
        a(spannableStringBuilder, i12, 0, 0, length, 16711680);
        int i13 = i12;
        int length2 = spannableStringBuilder.length();
        int i14 = this.i;
        b(spannableStringBuilder, i14, -1, 0, length2, 16711680);
        int i15 = i14;
        int length3 = spannableStringBuilder.length();
        String str = this.j;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f2 = this.k;
        while (cw1Var.B() >= 8) {
            int i16 = cw1Var.b;
            int iB = cw1Var.b();
            int iB2 = cw1Var.b();
            if (iB2 == 1937013100) {
                hn.v(cw1Var.B() >= i9 ? i8 : i7);
                int iL2 = cw1Var.L();
                int i17 = i7;
                while (i17 < iL2) {
                    hn.v(cw1Var.B() >= 12 ? i8 : i7);
                    int iL3 = cw1Var.L();
                    int iL4 = cw1Var.L();
                    cw1Var.G(i9);
                    int i18 = iL2;
                    int iK = cw1Var.K();
                    cw1Var.G(i8);
                    int iB3 = cw1Var.b();
                    if (iL4 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder(ec.f(String.valueOf(length4), String.valueOf(iL4).length() + 44, 2));
                        sb.append("Truncating styl end (");
                        sb.append(iL4);
                        sb.append(") to cueText.length() (");
                        sb.append(length4);
                        sb.append(").");
                        s90.Q("Tx3gParser", sb.toString());
                        iL4 = spannableStringBuilder.length();
                    }
                    if (iL3 >= iL4) {
                        StringBuilder sb2 = new StringBuilder(ec.f(String.valueOf(iL4), String.valueOf(iL3).length() + 36, 2));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iL3);
                        sb2.append(") >= end (");
                        sb2.append(iL4);
                        sb2.append(").");
                        s90.Q("Tx3gParser", sb2.toString());
                        i6 = i15;
                    } else {
                        a(spannableStringBuilder, iK, i13, iL3, iL4, 0);
                        i6 = i15;
                        b(spannableStringBuilder, iB3, i6, iL3, iL4, 0);
                    }
                    iL2 = i18;
                    i15 = i6;
                    f2 = f2;
                    i13 = i13;
                    i8 = 1;
                    i9 = 2;
                    i17++;
                    i7 = 0;
                }
                i3 = i13;
                i4 = i15;
                f = f2;
                i5 = i9;
            } else {
                i3 = i13;
                i4 = i15;
                f = f2;
                if (iB2 == 1952608120 && this.g) {
                    i5 = 2;
                    hn.v(cw1Var.B() >= 2);
                    float fL = cw1Var.L();
                    String str2 = qz1.a;
                    fMax = Math.max(0.0f, Math.min(fL / this.l, 0.95f));
                } else {
                    i5 = 2;
                }
                cw1Var.E(i16 + iB);
                i9 = i5;
                i15 = i4;
                i7 = 0;
                i8 = 1;
                f2 = fMax;
                i13 = i3;
            }
            fMax = f;
            cw1Var.E(i16 + iB);
            i9 = i5;
            i15 = i4;
            i7 = 0;
            i8 = 1;
            f2 = fMax;
            i13 = i3;
        }
        ri0Var.mo0b(new mi0(vj2.i(new tf1(spannableStringBuilder, null, null, null, f2, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0)), -9223372036854775807L, -9223372036854775807L));
    }
}
