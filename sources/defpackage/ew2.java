package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ew2 extends d23 {
    private static final ew2 zzd;
    private static volatile b33 zze;
    private String zza = "";
    private n13 zzb = n13.g;
    private int zzc;

    static {
        ew2 ew2Var = new ew2();
        zzd = ew2Var;
        d23.t(ew2.class, ew2Var);
    }

    public static dw2 C() {
        return (dw2) zzd.q();
    }

    public static ew2 D() {
        return zzd;
    }

    public final n13 A() {
        return this.zzb;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0014 A[PHI: r1
  0x0014: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:5:0x0006, B:9:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    public final int B() {
        int i = this.zzc;
        int i2 = 1;
        if (i != 0) {
            int i3 = 2;
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i3 = 4;
                    if (i != 3) {
                        i2 = i != 4 ? 0 : 5;
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i2 = i3;
            }
        }
        if (i2 == 0) {
            return 6;
        }
        return i2;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void F(n13 n13Var) {
        n13Var.getClass();
        this.zzb = n13Var;
    }

    public final void G(int i) {
        int i2;
        if (i != 6) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 2;
                    break;
                case 4:
                    i2 = 3;
                    break;
                case 5:
                    i2 = 4;
                    break;
                case 6:
                    i2 = -1;
                    break;
                default:
                    throw null;
            }
            this.zzc = i2;
        }
        j7.p("Can't get the number of an unknown enum value.");
        i2 = 0;
        this.zzc = i2;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new ew2();
        }
        if (iZ == 4) {
            return new dw2(zzd);
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
        synchronized (ew2.class) {
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

    public final String z() {
        return this.zza;
    }
}
