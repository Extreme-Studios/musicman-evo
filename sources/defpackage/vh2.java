package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vh2 implements zh2 {
    public final char f;

    public vh2(char c) {
        this.f = c;
    }

    public final boolean a(char c) {
        return c == this.f;
    }

    @Override // defpackage.zh2
    public final /* synthetic */ boolean b(Object obj) {
        return a(((Character) obj).charValue());
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return ec.n(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }
}
