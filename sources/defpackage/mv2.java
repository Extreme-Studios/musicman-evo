package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mv2 extends d23 {
    private static final mv2 zzd;
    private static volatile b33 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        mv2 mv2Var = new mv2();
        zzd = mv2Var;
        d23.t(mv2.class, mv2Var);
    }

    public static lv2 A() {
        return (lv2) zzd.q();
    }

    public static mv2 B() {
        return zzd;
    }

    public final /* synthetic */ void C(wv2 wv2Var) {
        this.zza = wv2Var.a();
    }

    public final int D() {
        int i = this.zzb;
        int i2 = 2;
        if (i != 0) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3) {
                i2 = 5;
            } else if (i != 4) {
                i2 = i != 5 ? 0 : 7;
            } else {
                i2 = 6;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int E() {
        int i = this.zzc;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final void F(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            j7.p("Can't get the number of an unknown enum value.");
        }
    }

    public final void G(int i) {
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
            return new f33(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new mv2();
        }
        if (iZ == 4) {
            return new lv2(zzd);
        }
        if (iZ == 5) {
            return zzd;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zze;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (mv2.class) {
            try {
                c23Var = zze;
                if (c23Var == null) {
                    c23Var = new c23(zzd);
                    zze = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final wv2 z() {
        wv2 wv2VarB = wv2.b(this.zza);
        return wv2VarB == null ? wv2.UNRECOGNIZED : wv2VarB;
    }
}
