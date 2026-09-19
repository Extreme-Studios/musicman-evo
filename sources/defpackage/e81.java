package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class e81 extends jt0 implements f81 {
    public e81() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                X1(rmVarO0);
                break;
            case 2:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                kt0.f(parcel);
                d0(rmVarO1, i2);
                break;
            case 3:
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                L(rmVarO2);
                break;
            case 4:
                rm rmVarO3 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                R(rmVarO3);
                break;
            case 5:
                rm rmVarO4 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                A0(rmVarO4);
                break;
            case 6:
                rm rmVarO5 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                p1(rmVarO5);
                break;
            case 7:
                rm rmVarO6 = ju.O0(parcel.readStrongBinder());
                g81 g81Var = (g81) kt0.b(parcel, g81.CREATOR);
                kt0.f(parcel);
                s0(rmVarO6, g81Var);
                break;
            case 8:
                rm rmVarO7 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                M2(rmVarO7);
                break;
            case 9:
                rm rmVarO8 = ju.O0(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                kt0.f(parcel);
                s3(rmVarO8, i3);
                break;
            case 10:
                rm rmVarO9 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                C(rmVarO9);
                break;
            case 11:
                rm rmVarO10 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                l2(rmVarO10);
                break;
            case 12:
                kt0.f(parcel);
                break;
            case 13:
                rm rmVarO11 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                b3(rmVarO11);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
