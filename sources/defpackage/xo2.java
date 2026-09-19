package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xo2 implements gm1 {
    public static final xo2 h;
    public static final xo2 i;
    public static final xo2 j;
    public static final xo2 k;
    public static final xo2 l;
    public static final xo2 m;
    public static final xo2 n;
    public static final xo2 o;
    public static final xo2 p;
    public static final xo2 q;
    public static final xo2 r;
    public final /* synthetic */ int f;
    public String g;

    static {
        int i2 = 0;
        h = new xo2("TINK", i2);
        i = new xo2("CRUNCHY", i2);
        j = new xo2("NO_PREFIX", i2);
        int i3 = 1;
        k = new xo2("ASSUME_AES_GCM", i3);
        l = new xo2("ASSUME_XCHACHA20POLY1305", i3);
        m = new xo2("ASSUME_CHACHA20POLY1305", i3);
        n = new xo2("ASSUME_AES_CTR_HMAC", i3);
        o = new xo2("ASSUME_AES_EAX", i3);
        p = new xo2("ASSUME_AES_GCM_SIV", i3);
        int i4 = 2;
        q = new xo2("IEEE_P1363", i4);
        r = new xo2("DER", i4);
    }

    public /* synthetic */ xo2(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((en1) obj).F(this.g);
    }

    public String toString() {
        switch (this.f) {
            case 0:
                return this.g;
            case 1:
                return this.g;
            case 2:
                return this.g;
            case 3:
                return "<" + this.g + '>';
            default:
                return super.toString();
        }
    }
}
