package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gw2 extends d23 {
    private static final gw2 zzd;
    private static volatile b33 zze;
    private String zza = "";
    private n13 zzb = n13.g;
    private int zzc;

    static {
        gw2 gw2Var = new gw2();
        zzd = gw2Var;
        d23.t(gw2.class, gw2Var);
    }

    public static gw2 C(byte[] bArr, v13 v13Var) {
        d23 d23VarX = d23.x(zzd, bArr, bArr.length, v13Var);
        d23.y(d23VarX);
        return (gw2) d23VarX;
    }

    public static fw2 D() {
        return (fw2) zzd.q();
    }

    public static gw2 E() {
        return zzd;
    }

    public final n13 A() {
        return this.zzb;
    }

    public final yw2 B() {
        yw2 yw2VarB = yw2.b(this.zzc);
        return yw2VarB == null ? yw2.UNRECOGNIZED : yw2VarB;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void G(n13 n13Var) {
        n13Var.getClass();
        this.zzb = n13Var;
    }

    public final /* synthetic */ void H(yw2 yw2Var) {
        this.zzc = yw2Var.a();
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
            return new gw2();
        }
        if (iZ == 4) {
            return new fw2(zzd);
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
        synchronized (gw2.class) {
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
