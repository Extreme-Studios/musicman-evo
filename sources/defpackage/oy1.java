package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class oy1 extends jt0 implements q51 {
    public final ww1 f;

    public oy1(gx1 gx1Var, ww1 ww1Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
        this.f = ww1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        ww1 ww1Var = this.f;
        if (i == 2) {
            ((nx1) ww1Var.c).g();
        } else if (i == 3) {
            String string = parcel.readString();
            kt0.f(parcel);
            ((nx1) ww1Var.c).x0(string, 0);
        } else {
            if (i != 4) {
                return false;
            }
            fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
            kt0.f(parcel);
            a(fu1Var);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.q51
    public final void a(fu1 fu1Var) {
        ((nx1) this.f.c).M0(fu1Var);
    }
}
