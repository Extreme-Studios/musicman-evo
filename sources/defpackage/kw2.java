package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kw2 extends d23 {
    private static final kw2 zzf;
    private static volatile b33 zzg;
    private int zza;
    private ew2 zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        kw2 kw2Var = new kw2();
        zzf = kw2Var;
        d23.t(kw2.class, kw2Var);
    }

    public static jw2 D() {
        return (jw2) zzf.q();
    }

    public final ew2 A() {
        ew2 ew2Var = this.zzb;
        return ew2Var == null ? ew2.D() : ew2Var;
    }

    public final int B() {
        return this.zzd;
    }

    public final yw2 C() {
        yw2 yw2VarB = yw2.b(this.zze);
        return yw2VarB == null ? yw2.UNRECOGNIZED : yw2VarB;
    }

    public final /* synthetic */ void E(ew2 ew2Var) {
        this.zzb = ew2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzd = i;
    }

    public final /* synthetic */ void G(yw2 yw2Var) {
        this.zze = yw2Var.a();
    }

    public final int H() {
        int i = this.zzc;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final void I(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            j7.p("Can't get the number of an unknown enum value.");
        }
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new kw2();
        }
        if (iZ == 4) {
            return new jw2(zzf);
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
        synchronized (kw2.class) {
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

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
