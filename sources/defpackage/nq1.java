package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nq1 extends jt0 implements IInterface {
    public final String f;
    public final no1 g;
    public final ro1 h;

    public nq1(String str, no1 no1Var, ro1 ro1Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f = str;
        this.g = no1Var;
        this.h = ro1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        a01 a01Var;
        rm rmVar;
        switch (i) {
            case 2:
                ju juVar = new ju(this.g);
                parcel2.writeNoException();
                kt0.e(parcel2, juVar);
                return true;
            case 3:
                String strA = this.h.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 4:
                ro1 ro1Var = this.h;
                synchronized (ro1Var) {
                    list = ro1Var.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strC = this.h.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 6:
                ro1 ro1Var2 = this.h;
                synchronized (ro1Var2) {
                    a01Var = ro1Var2.t;
                }
                parcel2.writeNoException();
                kt0.e(parcel2, a01Var);
                return true;
            case 7:
                String strE = this.h.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 8:
                String strF = this.h.f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 9:
                Bundle bundleD = this.h.d();
                parcel2.writeNoException();
                kt0.d(parcel2, bundleD);
                return true;
            case 10:
                this.g.o();
                parcel2.writeNoException();
                return true;
            case 11:
                hv1 hv1VarR = this.h.r();
                parcel2.writeNoException();
                kt0.e(parcel2, hv1VarR);
                return true;
            case 12:
                Bundle bundle = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                no1 no1Var = this.g;
                synchronized (no1Var) {
                    no1Var.n.n(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                boolean zP = this.g.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                no1 no1Var2 = this.g;
                synchronized (no1Var2) {
                    no1Var2.n.k(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                wz0 wz0VarS = this.h.s();
                parcel2.writeNoException();
                kt0.e(parcel2, wz0VarS);
                return true;
            case 16:
                ro1 ro1Var3 = this.h;
                synchronized (ro1Var3) {
                    rmVar = ro1Var3.q;
                }
                parcel2.writeNoException();
                kt0.e(parcel2, rmVar);
                return true;
            case 17:
                String str = this.f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
