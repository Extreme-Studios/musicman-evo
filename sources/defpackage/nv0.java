package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nv0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final nv0 zzv;
    private static volatile b33 zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private l23 zzj = e33.j;
    private String zzn = "";
    private String zzo = "";

    static {
        nv0 nv0Var = new nv0();
        zzv = nv0Var;
        d23.t(nv0.class, nv0Var);
    }

    public static lv0 z() {
        return (lv0) zzv.q();
    }

    public final void A(ArrayList arrayList) {
        l23 l23Var = this.zzj;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzj = l23Var.z(size + size);
        }
        f13.e(arrayList, this.zzj);
    }

    public final void B(int i) {
        this.zzi |= 1;
        this.zzk = i;
    }

    public final void C(int i) {
        this.zzi |= 2;
        this.zzl = i;
    }

    public final void D(long j) {
        this.zzi |= 4;
        this.zzm = j;
    }

    public final void E(String str) {
        str.getClass();
        this.zzi |= 8;
        this.zzn = str;
    }

    public final void F() {
        String str = Build.MODEL;
        str.getClass();
        this.zzi |= 16;
        this.zzo = str;
    }

    public final void G(long j) {
        this.zzi |= 32;
        this.zzp = j;
    }

    public final void H(int i) {
        this.zzi |= 64;
        this.zzu = i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", kv0.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (iZ == 3) {
            return new nv0();
        }
        if (iZ == 4) {
            return new lv0(zzv);
        }
        if (iZ == 5) {
            return zzv;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzw;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (nv0.class) {
            try {
                c23Var = zzw;
                if (c23Var == null) {
                    c23Var = new c23(zzv);
                    zzw = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
