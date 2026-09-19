package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class t82 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ k82 g;

    public /* synthetic */ t82(k82 k82Var, int i) {
        this.f = i;
        this.g = k82Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        kc1 kc1Var;
        switch (this.f) {
            case 0:
                this.g.n();
                return;
            case 1:
                k82 k82Var = this.g;
                synchronized (k82Var) {
                    bb1 bb1Var = k82Var.g;
                    if (bb1Var != null) {
                        try {
                            ab2 ab2Var = k82Var.e;
                            Parcel parcelU = bb1Var.U();
                            kt0.c(parcelU, ab2Var);
                            bb1Var.K0(parcelU, 2);
                        } catch (RemoteException unused) {
                            jn.T("Failed to call onAdsExhausted");
                        }
                        kc1Var = k82Var.h;
                        if (kc1Var != null) {
                            try {
                                String str = k82Var.k;
                                Parcel parcelU2 = kc1Var.U();
                                parcelU2.writeString(str);
                                kc1Var.K0(parcelU2, 2);
                            } catch (RemoteException unused2) {
                                jn.T("Failed to call onAdsExhausted");
                                return;
                            }
                        }
                        break;
                    } else {
                        kc1Var = k82Var.h;
                        if (kc1Var != null) {
                            String str2 = k82Var.k;
                            Parcel parcelU3 = kc1Var.U();
                            parcelU3.writeString(str2);
                            kc1Var.K0(parcelU3, 2);
                        }
                        break;
                    }
                    throw th;
                }
                return;
            default:
                k82 k82Var2 = this.g;
                bz1 bz1Var = k82Var2.p;
                if (bz1Var != null) {
                    ae aeVar = k82Var2.q;
                    q82 q82Var = k82Var2.r;
                    aeVar.getClass();
                    bz1Var.q("pae", "paeo_ts", System.currentTimeMillis(), k82Var2.e.i, 0, null, q82Var, k82Var2.e());
                    return;
                }
                return;
        }
    }
}
