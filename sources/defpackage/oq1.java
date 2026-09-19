package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class oq1 extends jt0 implements n01 {
    public final Context f;
    public final ro1 g;
    public ap1 h;
    public no1 i;

    public oq1(Context context, ro1 ro1Var, ap1 ap1Var, no1 no1Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f = context;
        this.g = ro1Var;
        this.h = ap1Var;
        this.i = no1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        List<String> arrayList;
        q00 q00Var;
        q00 q00Var2;
        yz0 yz0Var;
        String str;
        q00 q00Var3;
        q00 q00Var4;
        no1 no1Var;
        yz0 yz0Var2 = null;
        int i2 = 0;
        switch (i) {
            case 1:
                String string = parcel.readString();
                kt0.f(parcel);
                ro1 ro1Var = this.g;
                synchronized (ro1Var) {
                    q00Var3 = ro1Var.w;
                }
                String str2 = (String) q00Var3.get(string);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String string2 = parcel.readString();
                kt0.f(parcel);
                ro1 ro1Var2 = this.g;
                synchronized (ro1Var2) {
                    q00Var4 = ro1Var2.v;
                }
                a01 a01Var = (a01) q00Var4.get(string2);
                parcel2.writeNoException();
                kt0.e(parcel2, a01Var);
                return true;
            case 3:
                try {
                    ro1 ro1Var3 = this.g;
                    synchronized (ro1Var3) {
                        q00Var = ro1Var3.v;
                    }
                    synchronized (ro1Var3) {
                        q00Var2 = ro1Var3.w;
                    }
                    String[] strArr = new String[q00Var.h + q00Var2.h];
                    int i3 = 0;
                    for (int i4 = 0; i4 < q00Var.h; i4++) {
                        strArr[i3] = (String) q00Var.f(i4);
                        i3++;
                    }
                    while (i2 < q00Var2.h) {
                        strArr[i3] = (String) q00Var2.f(i2);
                        i3++;
                        i2++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e) {
                    vc3.C.h.d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String strG = this.g.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 5:
                String string3 = parcel.readString();
                kt0.f(parcel);
                no1 no1Var2 = this.i;
                if (no1Var2 != null) {
                    synchronized (no1Var2) {
                        no1Var2.n.I(string3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                no1 no1Var3 = this.i;
                if (no1Var3 != null) {
                    synchronized (no1Var3) {
                        if (!no1Var3.y) {
                            no1Var3.n.j0();
                        }
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 7:
                hv1 hv1VarR = this.g.r();
                parcel2.writeNoException();
                kt0.e(parcel2, hv1VarR);
                return true;
            case 8:
                no1 no1Var4 = this.i;
                if (no1Var4 != null) {
                    no1Var4.o();
                }
                this.i = null;
                this.h = null;
                parcel2.writeNoException();
                return true;
            case 9:
                rm rmVarT0 = T0();
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarT0);
                return true;
            case 10:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                boolean zC = C(rmVarO0);
                parcel2.writeNoException();
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                no1 no1Var5 = this.i;
                if (no1Var5 == null || no1Var5.p.c()) {
                    ro1 ro1Var4 = this.g;
                    if (ro1Var4.j() != null && ro1Var4.h() == null) {
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = kt0.a;
                parcel2.writeInt(i2);
                return true;
            case 13:
                ro1 ro1Var5 = this.g;
                qw1 qw1VarK = ro1Var5.k();
                if (qw1VarK != null) {
                    el1 el1Var = vc3.C.x;
                    x82 x82Var = qw1VarK.a;
                    el1Var.getClass();
                    el1.f(x82Var);
                    if (ro1Var5.j() != null) {
                        ro1Var5.j().a("onSdkLoaded", new m7(0));
                    }
                    i2 = 1;
                } else {
                    jn.T("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = kt0.a;
                parcel2.writeInt(i2);
                return true;
            case 14:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                Object objZ0 = ju.Z0(rmVarO1);
                if ((objZ0 instanceof View) && this.g.k() != null && (no1Var = this.i) != null) {
                    no1Var.f((View) objZ0);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    ro1 ro1Var6 = this.g;
                    synchronized (ro1Var6) {
                        str = ro1Var6.y;
                    }
                    if (Objects.equals(str, "Google")) {
                        jn.T("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        jn.T("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        no1 no1Var6 = this.i;
                        if (no1Var6 != null) {
                            no1Var6.e(str, false);
                        }
                    }
                } catch (NullPointerException e2) {
                    vc3.C.h.d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e2);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    po1 po1Var = this.i.F;
                    synchronized (po1Var) {
                        yz0Var = po1Var.a;
                    }
                    yz0Var2 = yz0Var;
                } catch (NullPointerException e3) {
                    vc3.C.h.d("InternalNativeCustomTemplateAdShim.getMediaContent", e3);
                }
                parcel2.writeNoException();
                kt0.e(parcel2, yz0Var2);
                return true;
            case 17:
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                boolean zQ0 = q0(rmVarO2);
                parcel2.writeNoException();
                parcel2.writeInt(zQ0 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.n01
    public final boolean C(rm rmVar) {
        ap1 ap1Var;
        Object objZ0 = ju.Z0(rmVar);
        if (!(objZ0 instanceof ViewGroup) || (ap1Var = this.h) == null || !ap1Var.c((ViewGroup) objZ0, true)) {
            return false;
        }
        this.g.h().L(new oc2(25, this));
        return true;
    }

    @Override // defpackage.n01
    public final rm T0() {
        return new ju(this.f);
    }

    @Override // defpackage.n01
    public final String f() {
        return this.g.g();
    }

    @Override // defpackage.n01
    public final boolean q0(rm rmVar) {
        ap1 ap1Var;
        Object objZ0 = ju.Z0(rmVar);
        if (!(objZ0 instanceof ViewGroup) || (ap1Var = this.h) == null || !ap1Var.c((ViewGroup) objZ0, false)) {
            return false;
        }
        this.g.i().L(new oc2(25, this));
        return true;
    }
}
