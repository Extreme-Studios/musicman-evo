package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zw2 extends d23 {
    public static final /* synthetic */ int zza = 0;
    private static final zw2 zzd;
    private static volatile b33 zze;
    private String zzb = "";
    private l23 zzc = e33.j;

    static {
        zw2 zw2Var = new zw2();
        zzd = zw2Var;
        d23.t(zw2.class, zw2Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", hw2.class});
        }
        if (iZ == 3) {
            return new zw2();
        }
        if (iZ == 4) {
            return new jw0(zzd);
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
        synchronized (zw2.class) {
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
}
