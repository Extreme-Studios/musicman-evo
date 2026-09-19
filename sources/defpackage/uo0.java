package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class uo0 extends d23 {
    private static final uo0 zzn;
    private static volatile b33 zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private l23 zzb = e33.j;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        uo0 uo0Var = new uo0();
        zzn = uo0Var;
        d23.t(uo0.class, uo0Var);
    }

    public static to0 z() {
        return (to0) zzn.q();
    }

    public final void A(cp0 cp0Var) {
        l23 l23Var = this.zzb;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzb = l23Var.z(size + size);
        }
        this.zzb.add(cp0Var);
    }

    public final void B() {
        this.zzb = e33.j;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void D(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void K(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    public final /* synthetic */ void M(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", cp0.class, "zzc", "zzd", "zze", "zzf", "zzg", vo0.d, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iZ == 3) {
            return new uo0();
        }
        if (iZ == 4) {
            return new to0(zzn);
        }
        if (iZ == 5) {
            return zzn;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzo;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (uo0.class) {
            try {
                c23Var = zzo;
                if (c23Var == null) {
                    c23Var = new c23(zzn);
                    zzo = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
