package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf2 implements wh2 {
    public static final /* synthetic */ zf2 b = new zf2(0);
    public static final /* synthetic */ zf2 c = new zf2(1);
    public static final /* synthetic */ zf2 d = new zf2(2);
    public static final /* synthetic */ zf2 e = new zf2(3);
    public static final /* synthetic */ zf2 f = new zf2(4);
    public static final /* synthetic */ zf2 g = new zf2(5);
    public static final /* synthetic */ zf2 h = new zf2(6);
    public static final /* synthetic */ zf2 i = new zf2(7);
    public final /* synthetic */ int a;

    public /* synthetic */ zf2(int i2) {
        this.a = i2;
    }

    @Override // defpackage.wh2
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return lg2.b(5);
            case 4:
                nd0 nd0Var = (nd0) obj;
                nd0Var.getClass();
                return nd0Var.getClass().getSimpleName();
            case 5:
                jf3 jf3Var = (jf3) obj;
                int i2 = de3.N;
                String str = jf3Var.a;
                String str2 = jf3Var.b;
                return ec.n(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 6:
                return vj2.m(na1.B(((xd3) obj).l().b, i));
            default:
                gf3 gf3Var = gf3.d;
                return Integer.valueOf(((cy0) obj).c);
        }
    }
}
