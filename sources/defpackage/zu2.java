package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zu2 extends d23 {
    private static final zu2 zzc;
    private static volatile b33 zzd;
    private int zza;
    private n13 zzb = n13.g;

    static {
        zu2 zu2Var = new zu2();
        zzc = zu2Var;
        d23.t(zu2.class, zu2Var);
    }

    public static zu2 B(n13 n13Var, v13 v13Var) {
        return (zu2) d23.m(zzc, n13Var, v13Var);
    }

    public static yu2 C() {
        return (yu2) zzc.q();
    }

    public static b33 D() {
        return zzc.o();
    }

    public final n13 A() {
        return this.zzb;
    }

    public final /* synthetic */ void E(n13 n13Var) {
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
            return new f33(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new zu2();
        }
        if (iZ == 4) {
            return new yu2(zzc);
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
        synchronized (zu2.class) {
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
