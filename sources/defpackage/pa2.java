package defpackage;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class pa2 extends d23 {
    private static final pa2 zzf;
    private static volatile b33 zzg;
    private int zza;
    private h23 zzb = e23.j;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        pa2 pa2Var = new pa2();
        zzf = pa2Var;
        d23.t(pa2.class, pa2Var);
    }

    public static oa2 z() {
        return (oa2) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void B(int i) {
        RandomAccess randomAccess = this.zzb;
        if (!((g13) randomAccess).f) {
            e23 e23Var = (e23) randomAccess;
            int i2 = e23Var.h;
            this.zzb = e23Var.z(i2 + i2);
        }
        ((e23) this.zzb).d(2);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", vo0.x, "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new pa2();
        }
        if (iZ == 4) {
            return new oa2(zzf);
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
        synchronized (pa2.class) {
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
}
