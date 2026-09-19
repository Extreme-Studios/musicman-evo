package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.bg1;
import defpackage.d60;
import defpackage.dc3;
import defpackage.dq;
import defpackage.e01;
import defpackage.ef1;
import defpackage.eg1;
import defpackage.ep0;
import defpackage.es1;
import defpackage.hl1;
import defpackage.hw1;
import defpackage.ia1;
import defpackage.if1;
import defpackage.j21;
import defpackage.j41;
import defpackage.j42;
import defpackage.jj1;
import defpackage.jt0;
import defpackage.ju;
import defpackage.jz1;
import defpackage.k61;
import defpackage.kb3;
import defpackage.kt0;
import defpackage.l41;
import defpackage.l81;
import defpackage.ls1;
import defpackage.lz1;
import defpackage.m51;
import defpackage.n71;
import defpackage.n82;
import defpackage.na1;
import defpackage.nf0;
import defpackage.nz1;
import defpackage.oh1;
import defpackage.q12;
import defpackage.q61;
import defpackage.q63;
import defpackage.qf1;
import defpackage.r63;
import defpackage.rm;
import defpackage.rs0;
import defpackage.s63;
import defpackage.s70;
import defpackage.ss1;
import defpackage.sz1;
import defpackage.u32;
import defpackage.u42;
import defpackage.uc0;
import defpackage.un1;
import defpackage.v32;
import defpackage.v42;
import defpackage.v63;
import defpackage.xt1;
import defpackage.yn1;
import defpackage.yo1;
import defpackage.ze1;
import defpackage.zo1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends jt0 implements oh1 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        j21 j21Var = null;
        switch (i) {
            case 1:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kb3 kb3Var = (kb3) kt0.b(parcel, kb3.CREATOR);
                String string = parcel.readString();
                l41 l41VarB3 = j41.B3(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                kt0.f(parcel);
                n71 n71VarU1 = U1(rmVarO0, kb3Var, string, l41VarB3, i2);
                parcel2.writeNoException();
                kt0.e(parcel2, n71VarU1);
                return true;
            case 2:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                kb3 kb3Var2 = (kb3) kt0.b(parcel, kb3.CREATOR);
                String string2 = parcel.readString();
                l41 l41VarB4 = j41.B3(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                kt0.f(parcel);
                n71 n71VarF2 = F2(rmVarO1, kb3Var2, string2, l41VarB4, i3);
                parcel2.writeNoException();
                kt0.e(parcel2, n71VarF2);
                return true;
            case 3:
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                String string3 = parcel.readString();
                l41 l41VarB5 = j41.B3(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                kt0.f(parcel);
                m51 m51VarK1 = k1(rmVarO2, string3, l41VarB5, i4);
                parcel2.writeNoException();
                kt0.e(parcel2, m51VarK1);
                return true;
            case 4:
                ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                rm rmVarO3 = ju.O0(parcel.readStrongBinder());
                rm rmVarO4 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                e01 e01VarY1 = y1(rmVarO3, rmVarO4);
                parcel2.writeNoException();
                kt0.e(parcel2, e01VarY1);
                return true;
            case 6:
                rm rmVarO5 = ju.O0(parcel.readStrongBinder());
                l41 l41VarB6 = j41.B3(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                kt0.f(parcel);
                Context context = (Context) ju.Z0(rmVarO5);
                if1 if1Var = if1.a(context, l41VarB6, i5).b;
                context.getClass();
                v42 v42Var = (v42) ((q63) new un1(if1Var, context, (String) null).g).c();
                parcel2.writeNoException();
                kt0.e(parcel2, v42Var);
                return true;
            case 7:
                ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                rm rmVarO6 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                q61 q61VarL = L(rmVarO6);
                parcel2.writeNoException();
                kt0.e(parcel2, q61VarL);
                return true;
            case 9:
                rm rmVarO7 = ju.O0(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                kt0.f(parcel);
                hl1 hl1VarJ2 = J2(rmVarO7, i6);
                parcel2.writeNoException();
                kt0.e(parcel2, hl1VarJ2);
                return true;
            case 10:
                rm rmVarO8 = ju.O0(parcel.readStrongBinder());
                kb3 kb3Var3 = (kb3) kt0.b(parcel, kb3.CREATOR);
                String string4 = parcel.readString();
                int i7 = parcel.readInt();
                kt0.f(parcel);
                n71 n71VarD1 = d1(rmVarO8, kb3Var3, string4, i7);
                parcel2.writeNoException();
                kt0.e(parcel2, n71VarD1);
                return true;
            case 11:
                rm rmVarO9 = ju.O0(parcel.readStrongBinder());
                rm rmVarO10 = ju.O0(parcel.readStrongBinder());
                rm rmVarO11 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                yo1 yo1Var = new yo1((View) ju.Z0(rmVarO9), (HashMap) ju.Z0(rmVarO10), (HashMap) ju.Z0(rmVarO11));
                parcel2.writeNoException();
                kt0.e(parcel2, yo1Var);
                return true;
            case 12:
                rm rmVarO12 = ju.O0(parcel.readStrongBinder());
                String string5 = parcel.readString();
                l41 l41VarB7 = j41.B3(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                kt0.f(parcel);
                l81 l81VarT2 = t2(rmVarO12, string5, l41VarB7, i8);
                parcel2.writeNoException();
                kt0.e(parcel2, l81VarT2);
                return true;
            case 13:
                rm rmVarO13 = ju.O0(parcel.readStrongBinder());
                kb3 kb3Var4 = (kb3) kt0.b(parcel, kb3.CREATOR);
                String string6 = parcel.readString();
                l41 l41VarB8 = j41.B3(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                kt0.f(parcel);
                n71 n71VarZ2 = Z2(rmVarO13, kb3Var4, string6, l41VarB8, i9);
                parcel2.writeNoException();
                kt0.e(parcel2, n71VarZ2);
                return true;
            case 14:
                rm rmVarO14 = ju.O0(parcel.readStrongBinder());
                l41 l41VarB9 = j41.B3(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                kt0.f(parcel);
                ia1 ia1VarD2 = d2(rmVarO14, l41VarB9, i10);
                parcel2.writeNoException();
                kt0.e(parcel2, ia1VarD2);
                return true;
            case 15:
                rm rmVarO15 = ju.O0(parcel.readStrongBinder());
                l41 l41VarB10 = j41.B3(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                kt0.f(parcel);
                k61 k61VarS1 = s1(rmVarO15, l41VarB10, i11);
                parcel2.writeNoException();
                kt0.e(parcel2, k61VarS1);
                return true;
            case 16:
                rm rmVarO16 = ju.O0(parcel.readStrongBinder());
                l41 l41VarB11 = j41.B3(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    j21Var = iInterfaceQueryLocalInterface instanceof j21 ? (j21) iInterfaceQueryLocalInterface : new j21(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 2);
                }
                kt0.f(parcel);
                Context context2 = (Context) ju.Z0(rmVarO16);
                if1 if1Var2 = if1.a(context2, l41VarB11, i12).b;
                context2.getClass();
                j21Var.getClass();
                ss1 ss1Var = (ss1) new qf1(if1Var2, context2, j21Var).e.c();
                parcel2.writeNoException();
                kt0.e(parcel2, ss1Var);
                return true;
            case 17:
                rm rmVarO17 = ju.O0(parcel.readStrongBinder());
                l41 l41VarB12 = j41.B3(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                kt0.f(parcel);
                ls1 ls1VarA1 = a1(rmVarO17, l41VarB12, i13);
                parcel2.writeNoException();
                kt0.e(parcel2, ls1VarA1);
                return true;
            case 18:
                rm rmVarO18 = ju.O0(parcel.readStrongBinder());
                l41 l41VarB13 = j41.B3(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                kt0.f(parcel);
                ze1 ze1VarV0 = V0(rmVarO18, l41VarB13, i14);
                parcel2.writeNoException();
                kt0.e(parcel2, ze1VarV0);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.oh1
    public final n71 F2(rm rmVar, kb3 kb3Var, String str, l41 l41Var, int i) {
        Context context = (Context) ju.Z0(rmVar);
        if1 if1Var = if1.a(context, l41Var, i).b;
        context.getClass();
        kb3Var.getClass();
        str.getClass();
        return (sz1) ((q63) new s70(if1Var, context, str, kb3Var).g).c();
    }

    @Override // defpackage.oh1
    public final hl1 J2(rm rmVar, int i) {
        return (bg1) if1.a((Context) ju.Z0(rmVar), null, i).B.c();
    }

    @Override // defpackage.oh1
    public final q61 L(rm rmVar) {
        Activity activity = (Activity) ju.Z0(rmVar);
        AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
        if (adOverlayInfoParcelA == null) {
            return new nf0(activity, 4);
        }
        int i = adOverlayInfoParcelA.p;
        if (i == 1) {
            return new nf0(activity, 3);
        }
        if (i == 2) {
            return new nf0(activity, 1);
        }
        if (i == 3) {
            return new nf0(activity, 2);
        }
        if (i != 4) {
            return i != 5 ? new nf0(activity, 4) : new nf0(activity, 0);
        }
        return new uc0(activity, adOverlayInfoParcelA);
    }

    @Override // defpackage.oh1
    public final n71 U1(rm rmVar, kb3 kb3Var, String str, l41 l41Var, int i) {
        Context context = (Context) ju.Z0(rmVar);
        if1 if1Var = if1.a(context, l41Var, i).b;
        context.getClass();
        kb3Var.getClass();
        str.getClass();
        s63 s63VarA = s63.a(context);
        s63 s63VarA2 = s63.a(kb3Var);
        q63 q63Var = if1Var.j;
        q63 q63VarA = q63.a(new eg1(q63Var, 23));
        v32 v32Var = (v32) q63.a(new jj1(s63VarA, if1Var.c, s63VarA2, if1Var.D, q63VarA, q63.a(rs0.s), q63.a(na1.l))).c();
        nz1 nz1Var = (nz1) q63VarA.c();
        d60 d60Var = if1Var.a.a;
        dq.D(d60Var);
        return new lz1(context, kb3Var, str, v32Var, nz1Var, d60Var, (es1) q63Var.c());
    }

    @Override // defpackage.oh1
    public final ze1 V0(rm rmVar, l41 l41Var, int i) {
        return (n82) if1.a((Context) ju.Z0(rmVar), l41Var, i).C.c();
    }

    @Override // defpackage.oh1
    public final n71 Z2(rm rmVar, kb3 kb3Var, String str, l41 l41Var, int i) {
        Context context = (Context) ju.Z0(rmVar);
        if1 if1Var = if1.a(context, l41Var, i).b;
        str.getClass();
        context.getClass();
        s63 s63VarA = s63.a(context);
        s63 s63VarA2 = s63.a(str);
        q63 q63Var = if1Var.I0;
        j42 j42Var = new j42(s63VarA, q63Var, if1Var.J0, 0);
        q63 q63VarA = q63.a(new q12(q63Var, 6));
        q63 q63Var2 = if1Var.c;
        s63 s63Var = if1Var.D;
        ef1 ef1Var = if1Var.h;
        return (u32) q63.a(new jj1(s63Var, s63VarA, s63VarA2, q63.a(new yn1(s63VarA, q63Var2, s63Var, (r63) j42Var, q63VarA, (v63) ef1Var, 7)), q63VarA, ef1Var, if1Var.j)).c();
    }

    @Override // defpackage.oh1
    public final ls1 a1(rm rmVar, l41 l41Var, int i) {
        return (xt1) if1.a((Context) ju.Z0(rmVar), l41Var, i).x.c();
    }

    @Override // defpackage.oh1
    public final n71 d1(rm rmVar, kb3 kb3Var, String str, int i) {
        return new dc3((Context) ju.Z0(rmVar), kb3Var, str, new d60(ModuleDescriptor.MODULE_VERSION, i, 0, true, false));
    }

    @Override // defpackage.oh1
    public final ia1 d2(rm rmVar, l41 l41Var, int i) {
        return (ep0) if1.a((Context) ju.Z0(rmVar), l41Var, i).M.c();
    }

    @Override // defpackage.oh1
    public final m51 k1(rm rmVar, String str, l41 l41Var, int i) {
        Context context = (Context) ju.Z0(rmVar);
        return new jz1(if1.a(context, l41Var, i), context, str);
    }

    @Override // defpackage.oh1
    public final k61 s1(rm rmVar, l41 l41Var, int i) {
        return (hw1) if1.a((Context) ju.Z0(rmVar), l41Var, i).J.c();
    }

    @Override // defpackage.oh1
    public final l81 t2(rm rmVar, String str, l41 l41Var, int i) {
        Context context = (Context) ju.Z0(rmVar);
        if1 if1Var = if1.a(context, l41Var, i).b;
        context.getClass();
        return (u42) ((q63) new un1(if1Var, context, str).h).c();
    }

    @Override // defpackage.oh1
    public final e01 y1(rm rmVar, rm rmVar2) {
        return new zo1((FrameLayout) ju.Z0(rmVar), (FrameLayout) ju.Z0(rmVar2));
    }
}
