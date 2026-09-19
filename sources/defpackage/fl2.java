package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fl2 extends il2 {
    public final char[] g;

    public fl2(el2 el2Var) {
        super(el2Var, (Character) null);
        this.g = new char[512];
        hn.v(el2Var.b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.g;
            char[] cArr2 = el2Var.b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // defpackage.il2
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        hn.R(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.g;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.il2
    public final int b(byte[] bArr, CharSequence charSequence) throws hl2 {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new hl2(ec.j(new StringBuilder(String.valueOf(length).length() + 21), "Invalid input length ", length));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            el2 el2Var = this.a;
            bArr[i2] = (byte) ((el2Var.a(cCharAt) << 4) | el2Var.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.il2
    public final il2 c(el2 el2Var, Character ch) {
        return new fl2(el2Var);
    }
}
