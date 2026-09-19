package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vv2 extends d23 {
    private static final vv2 zzc;
    private static volatile b33 zzd;
    private int zza;
    private n13 zzb = n13.g;

    static {
        vv2 vv2Var = new vv2();
        zzc = vv2Var;
        d23.t(vv2.class, vv2Var);
    }

    public static vv2 B(n13 n13Var, v13 v13Var) {
        return (vv2) d23.m(zzc, n13Var, v13Var);
    }

    public static uv2 C() {
        return (uv2) zzc.q();
    }

    public static vv2 D() {
        return zzc;
    }

    public static b33 E() {
        return zzc.o();
    }

    public final n13 A() {
        return this.zzb;
    }

    public final /* synthetic */ void F(n13 n13Var) {
        this.zzb = n13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new vv2();
        }
        if (iZ == 4) {
            return new uv2(zzc);
        }
        if (iZ == 5) {
            return zzc;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzd;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (vv2.class) {
            try {
                c23Var = zzd;
                if (c23Var == null) {
                    c23Var = new c23(zzc);
                    zzd = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final int z() {
        return this.zza;
    }
}
