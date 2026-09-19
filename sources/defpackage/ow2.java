package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ow2 extends d23 {
    private static final ow2 zze;
    private static volatile b33 zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        ow2 ow2Var = new ow2();
        zze = ow2Var;
        d23.t(ow2.class, ow2Var);
    }

    public static nw2 z() {
        return (nw2) zze.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void B(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void C(yw2 yw2Var) {
        this.zzd = yw2Var.a();
    }

    public final void D(int i) {
        if (i != 1) {
            this.zzb = i - 2;
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
            return new f33(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new ow2();
        }
        if (iZ == 4) {
            return new nw2(zze);
        }
        if (iZ == 5) {
            return zze;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzf;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (ow2.class) {
            try {
                c23Var = zzf;
                if (c23Var == null) {
                    c23Var = new c23(zze);
                    zzf = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
