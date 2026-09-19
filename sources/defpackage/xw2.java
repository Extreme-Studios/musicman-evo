package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xw2 extends d23 {
    private static final xw2 zzd;
    private static volatile b33 zze;
    private int zza;
    private String zzb = "";
    private gw2 zzc;

    static {
        xw2 xw2Var = new xw2();
        zzd = xw2Var;
        d23.t(xw2.class, xw2Var);
    }

    public static xw2 B(n13 n13Var, v13 v13Var) {
        return (xw2) d23.m(zzd, n13Var, v13Var);
    }

    public static ww2 C() {
        return (ww2) zzd.q();
    }

    public static xw2 D() {
        return zzd;
    }

    public final gw2 A() {
        gw2 gw2Var = this.zzc;
        return gw2Var == null ? gw2.E() : gw2Var;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void F(gw2 gw2Var) {
        gw2Var.getClass();
        this.zzc = gw2Var;
        this.zza |= 1;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new xw2();
        }
        if (iZ == 4) {
            return new ww2(zzd);
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
        synchronized (xw2.class) {
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
        return this.zzb;
    }
}
