package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xp0 extends d23 {
    private static final xp0 zzf;
    private static volatile b33 zzg;
    private int zza;
    private n13 zzb;
    private n13 zzc;
    private n13 zzd;
    private n13 zze;

    static {
        xp0 xp0Var = new xp0();
        zzf = xp0Var;
        d23.t(xp0.class, xp0Var);
    }

    public xp0() {
        l13 l13Var = n13.g;
        this.zzb = l13Var;
        this.zzc = l13Var;
        this.zzd = l13Var;
        this.zze = l13Var;
    }

    public static xp0 D(byte[] bArr, v13 v13Var) throws o23 {
        d23 d23VarX = d23.x(zzf, bArr, bArr.length, v13Var);
        d23.y(d23VarX);
        return (xp0) d23VarX;
    }

    public static wp0 E() {
        return (wp0) zzf.q();
    }

    public final n13 A() {
        return this.zzc;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final n13 C() {
        return this.zze;
    }

    public final /* synthetic */ void F(n13 n13Var) {
        this.zza |= 1;
        this.zzb = n13Var;
    }

    public final /* synthetic */ void G(l13 l13Var) {
        this.zza |= 2;
        this.zzc = l13Var;
    }

    public final /* synthetic */ void H(n13 n13Var) {
        this.zza |= 4;
        this.zzd = n13Var;
    }

    public final /* synthetic */ void I(l13 l13Var) {
        this.zza |= 8;
        this.zze = l13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new xp0();
        }
        if (iZ == 4) {
            return new wp0(zzf);
        }
        if (iZ == 5) {
            return zzf;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzg;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (xp0.class) {
            try {
                c23Var = zzg;
                if (c23Var == null) {
                    c23Var = new c23(zzf);
                    zzg = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final n13 z() {
        return this.zzb;
    }
}
