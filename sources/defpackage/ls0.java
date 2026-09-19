package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class ls0 extends d23 {
    private static final ls0 zzh;
    private static volatile b33 zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private n13 zzb = n13.g;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        ls0 ls0Var = new ls0();
        zzh = ls0Var;
        d23.t(ls0.class, ls0Var);
    }

    public static ks0 z() {
        return (ks0) zzh.q();
    }

    public final /* synthetic */ void A(l13 l13Var) {
        this.zza |= 1;
        this.zzb = l13Var;
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void C(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 4;
        this.zzd = str2;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iZ == 3) {
            return new ls0();
        }
        if (iZ == 4) {
            return new ks0(zzh);
        }
        if (iZ == 5) {
            return zzh;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzi;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (ls0.class) {
            try {
                c23Var = zzi;
                if (c23Var == null) {
                    c23Var = new c23(zzh);
                    zzi = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
