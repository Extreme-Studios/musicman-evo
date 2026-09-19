package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bp2 implements hn2 {
    public static final bp2 h;
    public static final bp2 i;
    public static final bp2 j;
    public static final bp2 k;
    public static final bp2 l;
    public static final bp2 m;
    public static final bp2 n;
    public static final bp2 o;
    public static final bp2 p;
    public final /* synthetic */ int f;
    public final String g;

    static {
        int i2 = 0;
        h = new bp2("TINK", i2);
        i = new bp2("CRUNCHY", i2);
        j = new bp2("NO_PREFIX", i2);
        int i3 = 1;
        k = new bp2("TINK", i3);
        l = new bp2("NO_PREFIX", i3);
        int i4 = 2;
        m = new bp2("TINK", i4);
        n = new bp2("CRUNCHY", i4);
        o = new bp2("LEGACY", i4);
        p = new bp2("NO_PREFIX", i4);
    }

    public /* synthetic */ bp2(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    public static bp2 a(cw1 cw1Var) {
        String str;
        cw1Var.G(2);
        int iK = cw1Var.K();
        int i2 = iK >> 1;
        int i3 = iK & 1;
        int iK2 = cw1Var.K() >> 3;
        int i4 = 4;
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i5 = iK2 | (i3 << 5);
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i5).length();
        String str2 = i2 < 10 ? ".0" : ".";
        int iF = ec.f(str2, str.length(), length);
        String str3 = i5 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(ec.f(str3, iF, length2));
        sb.append(str);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        sb.append(i5);
        return new bp2(sb.toString(), i4);
    }

    public String toString() {
        int i2 = this.f;
        String str = this.g;
        switch (i2) {
            case 0:
            case 1:
            case 2:
                return str;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        vc3.C.h.d(this.g, th);
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
    }
}
