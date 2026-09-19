package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lq1 extends jt0 implements IInterface {
    public final String f;
    public final no1 g;
    public final ro1 h;

    public lq1(String str, no1 no1Var, ro1 ro1Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f = str;
        this.g = no1Var;
        this.h = ro1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        a01 a01Var;
        double d;
        String strP;
        String strP2;
        rm rmVar;
        no1 no1Var = this.g;
        ro1 ro1Var = this.h;
        switch (i) {
            case 2:
                ju juVar = new ju(no1Var);
                parcel2.writeNoException();
                kt0.e(parcel2, juVar);
                return true;
            case 3:
                String strA = ro1Var.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 4:
                synchronized (ro1Var) {
                    list = ro1Var.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strC = ro1Var.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 6:
                synchronized (ro1Var) {
                    a01Var = ro1Var.s;
                }
                parcel2.writeNoException();
                kt0.e(parcel2, a01Var);
                return true;
            case 7:
                String strE = ro1Var.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 8:
                synchronized (ro1Var) {
                    d = ro1Var.r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                synchronized (ro1Var) {
                    strP = ro1Var.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 10:
                synchronized (ro1Var) {
                    strP2 = ro1Var.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP2);
                return true;
            case 11:
                Bundle bundleD = ro1Var.d();
                parcel2.writeNoException();
                kt0.d(parcel2, bundleD);
                return true;
            case 12:
                no1Var.o();
                parcel2.writeNoException();
                return true;
            case 13:
                hv1 hv1VarR = ro1Var.r();
                parcel2.writeNoException();
                kt0.e(parcel2, hv1VarR);
                return true;
            case 14:
                Bundle bundle = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                synchronized (no1Var) {
                    no1Var.n.n(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                boolean zP = no1Var.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                synchronized (no1Var) {
                    no1Var.n.k(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                wz0 wz0VarS = ro1Var.s();
                parcel2.writeNoException();
                kt0.e(parcel2, wz0VarS);
                return true;
            case 18:
                synchronized (ro1Var) {
                    rmVar = ro1Var.q;
                }
                parcel2.writeNoException();
                kt0.e(parcel2, rmVar);
                return true;
            case 19:
                String str = this.f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
