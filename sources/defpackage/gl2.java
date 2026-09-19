package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gl2 extends il2 {
    public gl2(String str, String str2) {
        this(new el2(str, str2.toCharArray()), (Character) '=');
    }

    @Override // defpackage.il2
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        hn.R(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            char[] cArr = this.a.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr[(i4 >>> 12) & 63]);
            sb.append(cArr[(i4 >>> 6) & 63]);
            sb.append(cArr[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            d(sb, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.il2
    public final int b(byte[] bArr, CharSequence charSequence) throws hl2 {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        el2 el2Var = this.a;
        if (!el2Var.h[length % el2Var.e]) {
            int length2 = charSequenceE.length();
            throw new hl2(ec.j(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceE.length()) {
            int i3 = i2 + 1;
            int iA = (el2Var.a(charSequenceE.charAt(i + 1)) << 12) | (el2Var.a(charSequenceE.charAt(i)) << 18);
            bArr[i2] = (byte) (iA >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceE.length()) {
                int i5 = i + 3;
                int iA2 = iA | (el2Var.a(charSequenceE.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iA2 >>> 8) & 255);
                if (i5 < charSequenceE.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iA2 | el2Var.a(charSequenceE.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.il2
    public final il2 c(el2 el2Var, Character ch) {
        return new gl2(el2Var, ch);
    }

    public gl2(el2 el2Var, Character ch) {
        super(el2Var, ch);
        hn.v(el2Var.b.length == 64);
    }
}
