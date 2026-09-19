package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e51 extends jt0 implements v41 {
    public final kb0 f;

    public e51(kb0 kb0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f = kb0Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String strB = b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 3:
                List listD = d();
                parcel2.writeNoException();
                parcel2.writeList(listD);
                return true;
            case 4:
                String strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 5:
                a01 a01VarF = f();
                parcel2.writeNoException();
                kt0.e(parcel2, a01VarF);
                return true;
            case 6:
                String strJ = j();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 7:
                String strG = g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 8:
                double dK = k();
                parcel2.writeNoException();
                parcel2.writeDouble(dK);
                return true;
            case 9:
                String strI = i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 10:
                String strM = m();
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            case 11:
                hv1 hv1VarO = o();
                parcel2.writeNoException();
                kt0.e(parcel2, hv1VarO);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                rm rmVarQ = q();
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarQ);
                return true;
            case 14:
                rm rmVarN = n();
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarN);
                return true;
            case 15:
                rm rmVarD = D();
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarD);
                return true;
            case 16:
                Bundle bundleV2 = v2();
                parcel2.writeNoException();
                kt0.d(parcel2, bundleV2);
                return true;
            case 17:
                boolean zM = M();
                parcel2.writeNoException();
                ClassLoader classLoader2 = kt0.a;
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 18:
                boolean zH0 = h0();
                parcel2.writeNoException();
                ClassLoader classLoader3 = kt0.a;
                parcel2.writeInt(zH0 ? 1 : 0);
                return true;
            case 19:
                s();
                parcel2.writeNoException();
                return true;
            case 20:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                l0(rmVarO0);
                parcel2.writeNoException();
                return true;
            case zw0.zzm /* 21 */:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                rm rmVarO3 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                o1(rmVarO1, rmVarO2, rmVarO3);
                parcel2.writeNoException();
                return true;
            case 22:
                rm rmVarO4 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                Y0(rmVarO4);
                parcel2.writeNoException();
                return true;
            case 23:
                float fX = X();
                parcel2.writeNoException();
                parcel2.writeFloat(fX);
                return true;
            case 24:
                float fK = K();
                parcel2.writeNoException();
                parcel2.writeFloat(fK);
                return true;
            case 25:
                float fB = B();
                parcel2.writeNoException();
                parcel2.writeFloat(fB);
                return true;
            case 26:
                E();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.v41
    public final float B() {
        this.f.getClass();
        return 0.0f;
    }

    @Override // defpackage.v41
    public final rm D() {
        Object obj = this.f.k;
        if (obj == null) {
            return null;
        }
        return new ju(obj);
    }

    @Override // defpackage.v41
    public final void E() {
        this.f.getClass();
    }

    @Override // defpackage.v41
    public final float K() {
        this.f.getClass();
        return 0.0f;
    }

    @Override // defpackage.v41
    public final boolean M() {
        return this.f.m;
    }

    @Override // defpackage.v41
    public final float X() {
        this.f.getClass();
        return 0.0f;
    }

    @Override // defpackage.v41
    public final void Y0(rm rmVar) {
        this.f.getClass();
    }

    @Override // defpackage.v41
    public final String b() {
        return this.f.a;
    }

    @Override // defpackage.v41
    public final List d() {
        List<b01> list = this.f.b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b01 b01Var : list) {
                arrayList.add(new oz0(b01Var.b, b01Var.c, b01Var.d, b01Var.e, b01Var.f, null));
            }
        }
        return arrayList;
    }

    @Override // defpackage.v41
    public final String e() {
        return this.f.c;
    }

    @Override // defpackage.v41
    public final a01 f() {
        b01 b01Var = this.f.d;
        if (b01Var != null) {
            return new oz0(b01Var.b, b01Var.c, b01Var.d, b01Var.e, b01Var.f, null);
        }
        return null;
    }

    @Override // defpackage.v41
    public final String g() {
        return this.f.f;
    }

    @Override // defpackage.v41
    public final boolean h0() {
        return this.f.n;
    }

    @Override // defpackage.v41
    public final String i() {
        return this.f.h;
    }

    @Override // defpackage.v41
    public final String j() {
        return this.f.e;
    }

    @Override // defpackage.v41
    public final double k() {
        Double d = this.f.g;
        if (d != null) {
            return d.doubleValue();
        }
        return -1.0d;
    }

    @Override // defpackage.v41
    public final void l0(rm rmVar) {
        this.f.getClass();
    }

    @Override // defpackage.v41
    public final String m() {
        return this.f.i;
    }

    @Override // defpackage.v41
    public final rm n() {
        this.f.getClass();
        return null;
    }

    @Override // defpackage.v41
    public final hv1 o() {
        hv1 hv1Var;
        h60 h60Var = this.f.j;
        if (h60Var == null) {
            return null;
        }
        synchronized (h60Var.a) {
            hv1Var = h60Var.b;
        }
        return hv1Var;
    }

    @Override // defpackage.v41
    public final void o1(rm rmVar, rm rmVar2, rm rmVar3) {
        View view = (View) ju.Z0(rmVar);
        this.f.getClass();
        if (w91.a.get(view) == null) {
            return;
        }
        j7.j();
    }

    @Override // defpackage.v41
    public final wz0 p() {
        return null;
    }

    @Override // defpackage.v41
    public final rm q() {
        this.f.getClass();
        return null;
    }

    @Override // defpackage.v41
    public final void s() {
        this.f.getClass();
    }

    @Override // defpackage.v41
    public final Bundle v2() {
        return this.f.l;
    }
}
