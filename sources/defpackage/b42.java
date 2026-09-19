package defpackage;

import android.accounts.Account;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b42 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b42(int i) {
        this.a = i;
    }

    public static void a(sl slVar, Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        int i2 = slVar.f;
        s90.P(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = slVar.g;
        s90.P(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = slVar.h;
        s90.P(parcel, 3, 4);
        parcel.writeInt(i4);
        s90.q(parcel, 4, slVar.i);
        s90.o(parcel, 5, slVar.j);
        s90.t(parcel, 6, slVar.k, i);
        s90.m(parcel, 7, slVar.l);
        s90.p(parcel, 8, slVar.m, i);
        s90.t(parcel, 10, slVar.n, i);
        s90.t(parcel, 11, slVar.o, i);
        boolean z = slVar.p;
        s90.P(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = slVar.q;
        s90.P(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = slVar.r;
        s90.P(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        s90.q(parcel, 15, slVar.s);
        s90.J(parcel, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String strK = null;
        Bundle bundleC = null;
        String strK2 = null;
        String strK3 = null;
        byte[] bArrD = null;
        byte[] bArrD2 = null;
        String strK4 = null;
        byte[] bArrD3 = null;
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        boolean zA = false;
        int iD4 = 0;
        int iD5 = 0;
        int iD6 = 0;
        int iD7 = 0;
        int iD8 = 0;
        int iD9 = 0;
        switch (this.a) {
            case 0:
                int iP = w40.P(parcel);
                int iD10 = 0;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iD = w40.D(parcel, i);
                    } else if (c == 2) {
                        iD10 = w40.D(parcel, i);
                    } else if (c != 3) {
                        w40.L(parcel, i);
                    } else {
                        strK = w40.k(parcel, i);
                    }
                }
                w40.p(parcel, iP);
                return new s32(strK, iD, iD10);
            case 1:
                int iP2 = w40.P(parcel);
                String strK5 = null;
                int iD11 = 0;
                int iD12 = 0;
                int iD13 = 0;
                int iD14 = 0;
                int iD15 = 0;
                int iD16 = 0;
                while (parcel.dataPosition() < iP2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iD11 = w40.D(parcel, i2);
                            break;
                        case 2:
                            iD12 = w40.D(parcel, i2);
                            break;
                        case 3:
                            iD13 = w40.D(parcel, i2);
                            break;
                        case 4:
                            iD14 = w40.D(parcel, i2);
                            break;
                        case 5:
                            strK5 = w40.k(parcel, i2);
                            break;
                        case 6:
                            iD15 = w40.D(parcel, i2);
                            break;
                        case 7:
                            iD16 = w40.D(parcel, i2);
                            break;
                        default:
                            w40.L(parcel, i2);
                            break;
                    }
                }
                w40.p(parcel, iP2);
                return new c62(iD11, iD12, iD13, iD14, strK5, iD15, iD16);
            case 2:
                int iP3 = w40.P(parcel);
                while (parcel.dataPosition() < iP3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        iD9 = w40.D(parcel, i3);
                    } else if (c2 != 2) {
                        w40.L(parcel, i3);
                    } else {
                        bArrD3 = w40.d(parcel, i3);
                    }
                }
                w40.p(parcel, iP3);
                return new ua2(iD9, bArrD3);
            case 3:
                int iP4 = w40.P(parcel);
                String strK6 = null;
                while (parcel.dataPosition() < iP4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iD8 = w40.D(parcel, i4);
                    } else if (c3 == 2) {
                        strK4 = w40.k(parcel, i4);
                    } else if (c3 != 3) {
                        w40.L(parcel, i4);
                    } else {
                        strK6 = w40.k(parcel, i4);
                    }
                }
                w40.p(parcel, iP4);
                return new wa2(iD8, strK4, strK6);
            case 4:
                int iP5 = w40.P(parcel);
                while (parcel.dataPosition() < iP5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        iD7 = w40.D(parcel, i5);
                    } else if (c4 != 2) {
                        w40.L(parcel, i5);
                    } else {
                        bArrD2 = w40.d(parcel, i5);
                    }
                }
                w40.p(parcel, iP5);
                return new xa2(iD7, bArrD2);
            case 5:
                int iP6 = w40.P(parcel);
                String strK7 = null;
                String strK8 = null;
                int iD17 = 0;
                int iD18 = 0;
                int iD19 = 0;
                while (parcel.dataPosition() < iP6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iD17 = w40.D(parcel, i6);
                    } else if (c5 == 2) {
                        iD18 = w40.D(parcel, i6);
                    } else if (c5 == 3) {
                        strK7 = w40.k(parcel, i6);
                    } else if (c5 == 4) {
                        strK8 = w40.k(parcel, i6);
                    } else if (c5 != 5) {
                        w40.L(parcel, i6);
                    } else {
                        iD19 = w40.D(parcel, i6);
                    }
                }
                w40.p(parcel, iP6);
                return new bb2(iD17, iD18, iD19, strK7, strK8);
            case 6:
                int iP7 = w40.P(parcel);
                int iD20 = 0;
                while (parcel.dataPosition() < iP7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        iD6 = w40.D(parcel, i7);
                    } else if (c6 == 2) {
                        bArrD = w40.d(parcel, i7);
                    } else if (c6 != 3) {
                        w40.L(parcel, i7);
                    } else {
                        iD20 = w40.D(parcel, i7);
                    }
                }
                w40.p(parcel, iP7);
                return new cb2(bArrD, iD6, iD20);
            case 7:
                int iP8 = w40.P(parcel);
                f93 f93Var = null;
                int iD21 = 0;
                while (parcel.dataPosition() < iP8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        strK3 = w40.k(parcel, i8);
                    } else if (c7 == 2) {
                        iD5 = w40.D(parcel, i8);
                    } else if (c7 == 3) {
                        f93Var = (f93) w40.j(parcel, i8, f93.CREATOR);
                    } else if (c7 != 4) {
                        w40.L(parcel, i8);
                    } else {
                        iD21 = w40.D(parcel, i8);
                    }
                }
                w40.p(parcel, iP8);
                return new ab2(strK3, iD5, f93Var, iD21);
            case 8:
                int iP9 = w40.P(parcel);
                int iD22 = 0;
                while (parcel.dataPosition() < iP9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        iD4 = w40.D(parcel, i9);
                    } else if (c8 != 2) {
                        w40.L(parcel, i9);
                    } else {
                        iD22 = w40.D(parcel, i9);
                    }
                }
                w40.p(parcel, iP9);
                return new nb2(iD4, iD22);
            case 9:
                int iP10 = w40.P(parcel);
                while (parcel.dataPosition() < iP10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 15) {
                        w40.L(parcel, i10);
                    } else {
                        strK2 = w40.k(parcel, i10);
                    }
                }
                w40.p(parcel, iP10);
                return new qc2(strK2);
            case 10:
                int iP11 = w40.P(parcel);
                boolean zA2 = false;
                boolean zA3 = false;
                while (parcel.dataPosition() < iP11) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 2) {
                        zA = w40.A(parcel, i11);
                    } else if (c9 == 3) {
                        zA2 = w40.A(parcel, i11);
                    } else if (c9 != 4) {
                        w40.L(parcel, i11);
                    } else {
                        zA3 = w40.A(parcel, i11);
                    }
                }
                w40.p(parcel, iP11);
                return new ee2(zA, zA2, zA3);
            case 11:
                int iP12 = w40.P(parcel);
                ei[] eiVarArr = null;
                eb ebVar = null;
                while (parcel.dataPosition() < iP12) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        bundleC = w40.c(parcel, i12);
                    } else if (c10 == 2) {
                        eiVarArr = (ei[]) w40.o(parcel, i12, ei.CREATOR);
                    } else if (c10 == 3) {
                        iD3 = w40.D(parcel, i12);
                    } else if (c10 != 4) {
                        w40.L(parcel, i12);
                    } else {
                        ebVar = (eb) w40.j(parcel, i12, eb.CREATOR);
                    }
                }
                w40.p(parcel, iP12);
                w73 w73Var = new w73();
                w73Var.f = bundleC;
                w73Var.g = eiVarArr;
                w73Var.h = iD3;
                w73Var.i = ebVar;
                return w73Var;
            case 12:
                int iP13 = w40.P(parcel);
                ay ayVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean zA4 = false;
                boolean zA5 = false;
                int iD23 = 0;
                while (parcel.dataPosition() < iP13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            ayVar = (ay) w40.j(parcel, i13, ay.CREATOR);
                            break;
                        case 2:
                            zA4 = w40.A(parcel, i13);
                            break;
                        case 3:
                            zA5 = w40.A(parcel, i13);
                            break;
                        case 4:
                            int iJ = w40.J(parcel, i13);
                            int iDataPosition = parcel.dataPosition();
                            if (iJ != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iJ);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iD23 = w40.D(parcel, i13);
                            break;
                        case 6:
                            int iJ2 = w40.J(parcel, i13);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iJ2 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iJ2);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            w40.L(parcel, i13);
                            break;
                    }
                }
                w40.p(parcel, iP13);
                return new eb(ayVar, zA4, zA5, iArr, iD23, iArr2);
            case 13:
                int iP14 = w40.P(parcel);
                float f = 0.0f;
                String strK9 = null;
                boolean zA6 = false;
                boolean zA7 = false;
                boolean zA8 = false;
                int iD24 = 0;
                boolean zA9 = false;
                boolean zA10 = false;
                boolean zA11 = false;
                while (parcel.dataPosition() < iP14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            zA6 = w40.A(parcel, i14);
                            break;
                        case 3:
                            zA7 = w40.A(parcel, i14);
                            break;
                        case 4:
                            strK9 = w40.k(parcel, i14);
                            break;
                        case 5:
                            zA8 = w40.A(parcel, i14);
                            break;
                        case 6:
                            w40.j0(parcel, i14, 4);
                            f = parcel.readFloat();
                            break;
                        case 7:
                            iD24 = w40.D(parcel, i14);
                            break;
                        case '\b':
                            zA9 = w40.A(parcel, i14);
                            break;
                        case '\t':
                            zA10 = w40.A(parcel, i14);
                            break;
                        case '\n':
                            zA11 = w40.A(parcel, i14);
                            break;
                        default:
                            w40.L(parcel, i14);
                            break;
                    }
                }
                w40.p(parcel, iP14);
                return new q83(zA6, zA7, strK9, zA8, f, iD24, zA9, zA10, zA11);
            case 14:
                int iP15 = w40.P(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = sl.t;
                ei[] eiVarArr2 = sl.u;
                ei[] eiVarArr3 = eiVarArr2;
                String strK10 = null;
                IBinder iBinderC = null;
                Account account = null;
                String strK11 = null;
                int iD25 = 0;
                int iD26 = 0;
                int iD27 = 0;
                boolean zA12 = false;
                int iD28 = 0;
                boolean zA13 = false;
                while (parcel.dataPosition() < iP15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iD25 = w40.D(parcel, i15);
                            break;
                        case 2:
                            iD26 = w40.D(parcel, i15);
                            break;
                        case 3:
                            iD27 = w40.D(parcel, i15);
                            break;
                        case 4:
                            strK10 = w40.k(parcel, i15);
                            break;
                        case 5:
                            iBinderC = w40.C(parcel, i15);
                            break;
                        case 6:
                            scopeArr = (Scope[]) w40.o(parcel, i15, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = w40.c(parcel, i15);
                            break;
                        case '\b':
                            account = (Account) w40.j(parcel, i15, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            w40.L(parcel, i15);
                            break;
                        case '\n':
                            eiVarArr2 = (ei[]) w40.o(parcel, i15, ei.CREATOR);
                            break;
                        case 11:
                            eiVarArr3 = (ei[]) w40.o(parcel, i15, ei.CREATOR);
                            break;
                        case '\f':
                            zA12 = w40.A(parcel, i15);
                            break;
                        case '\r':
                            iD28 = w40.D(parcel, i15);
                            break;
                        case 14:
                            zA13 = w40.A(parcel, i15);
                            break;
                        case 15:
                            strK11 = w40.k(parcel, i15);
                            break;
                    }
                }
                w40.p(parcel, iP15);
                return new sl(iD25, iD26, iD27, strK10, iBinderC, scopeArr, bundle, account, eiVarArr2, eiVarArr3, zA12, iD28, zA13, strK11);
            case 15:
                return new va3(parcel);
            case 16:
                int iP16 = w40.P(parcel);
                long jE = 0;
                long jE2 = 0;
                long jE3 = 0;
                Bundle bundleC2 = null;
                ArrayList arrayListN = null;
                String strK12 = null;
                qc2 qc2Var = null;
                Location location = null;
                String strK13 = null;
                Bundle bundleC3 = null;
                Bundle bundleC4 = null;
                ArrayList arrayListN2 = null;
                String strK14 = null;
                String strK15 = null;
                q91 q91Var = null;
                String strK16 = null;
                ArrayList arrayListN3 = null;
                String strK17 = null;
                int iD29 = 0;
                int iD30 = 0;
                boolean zA14 = false;
                int iD31 = 0;
                boolean zA15 = false;
                boolean zA16 = false;
                int iD32 = 0;
                int iD33 = 0;
                int iD34 = 0;
                while (parcel.dataPosition() < iP16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iD29 = w40.D(parcel, i16);
                            break;
                        case 2:
                            jE = w40.E(parcel, i16);
                            break;
                        case 3:
                            bundleC2 = w40.c(parcel, i16);
                            break;
                        case 4:
                            iD30 = w40.D(parcel, i16);
                            break;
                        case 5:
                            arrayListN = w40.n(parcel, i16);
                            break;
                        case 6:
                            zA14 = w40.A(parcel, i16);
                            break;
                        case 7:
                            iD31 = w40.D(parcel, i16);
                            break;
                        case '\b':
                            zA15 = w40.A(parcel, i16);
                            break;
                        case '\t':
                            strK12 = w40.k(parcel, i16);
                            break;
                        case '\n':
                            qc2Var = (qc2) w40.j(parcel, i16, qc2.CREATOR);
                            break;
                        case 11:
                            location = (Location) w40.j(parcel, i16, Location.CREATOR);
                            break;
                        case '\f':
                            strK13 = w40.k(parcel, i16);
                            break;
                        case '\r':
                            bundleC3 = w40.c(parcel, i16);
                            break;
                        case 14:
                            bundleC4 = w40.c(parcel, i16);
                            break;
                        case 15:
                            arrayListN2 = w40.n(parcel, i16);
                            break;
                        case 16:
                            strK14 = w40.k(parcel, i16);
                            break;
                        case 17:
                            strK15 = w40.k(parcel, i16);
                            break;
                        case 18:
                            zA16 = w40.A(parcel, i16);
                            break;
                        case 19:
                            q91Var = (q91) w40.j(parcel, i16, q91.CREATOR);
                            break;
                        case 20:
                            iD32 = w40.D(parcel, i16);
                            break;
                        case zw0.zzm /* 21 */:
                            strK16 = w40.k(parcel, i16);
                            break;
                        case 22:
                            arrayListN3 = w40.n(parcel, i16);
                            break;
                        case 23:
                            iD33 = w40.D(parcel, i16);
                            break;
                        case 24:
                            strK17 = w40.k(parcel, i16);
                            break;
                        case 25:
                            iD34 = w40.D(parcel, i16);
                            break;
                        case 26:
                            jE2 = w40.E(parcel, i16);
                            break;
                        case 27:
                            jE3 = w40.E(parcel, i16);
                            break;
                        default:
                            w40.L(parcel, i16);
                            break;
                    }
                }
                w40.p(parcel, iP16);
                return new f93(iD29, jE, bundleC2, iD30, arrayListN, zA14, iD31, zA15, strK12, qc2Var, location, strK13, bundleC3, bundleC4, arrayListN2, strK14, strK15, zA16, q91Var, iD32, strK16, arrayListN3, iD33, strK17, iD34, jE2, jE3);
            case 17:
                int iP17 = w40.P(parcel);
                long jE4 = 0;
                r91 r91Var = null;
                IBinder iBinderC2 = null;
                IBinder iBinderC3 = null;
                IBinder iBinderC4 = null;
                IBinder iBinderC5 = null;
                String strK18 = null;
                String strK19 = null;
                IBinder iBinderC6 = null;
                String strK20 = null;
                d60 d60Var = null;
                String strK21 = null;
                q83 q83Var = null;
                IBinder iBinderC7 = null;
                String strK22 = null;
                String strK23 = null;
                String strK24 = null;
                IBinder iBinderC8 = null;
                IBinder iBinderC9 = null;
                IBinder iBinderC10 = null;
                boolean zA17 = false;
                int iD35 = 0;
                int iD36 = 0;
                boolean zA18 = false;
                while (parcel.dataPosition() < iP17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            r91Var = (r91) w40.j(parcel, i17, r91.CREATOR);
                            break;
                        case 3:
                            iBinderC2 = w40.C(parcel, i17);
                            break;
                        case 4:
                            iBinderC3 = w40.C(parcel, i17);
                            break;
                        case 5:
                            iBinderC4 = w40.C(parcel, i17);
                            break;
                        case 6:
                            iBinderC5 = w40.C(parcel, i17);
                            break;
                        case 7:
                            strK18 = w40.k(parcel, i17);
                            break;
                        case '\b':
                            zA17 = w40.A(parcel, i17);
                            break;
                        case '\t':
                            strK19 = w40.k(parcel, i17);
                            break;
                        case '\n':
                            iBinderC6 = w40.C(parcel, i17);
                            break;
                        case 11:
                            iD35 = w40.D(parcel, i17);
                            break;
                        case '\f':
                            iD36 = w40.D(parcel, i17);
                            break;
                        case '\r':
                            strK20 = w40.k(parcel, i17);
                            break;
                        case 14:
                            d60Var = (d60) w40.j(parcel, i17, d60.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case zw0.zzm /* 21 */:
                        case 22:
                        case 23:
                        default:
                            w40.L(parcel, i17);
                            break;
                        case 16:
                            strK21 = w40.k(parcel, i17);
                            break;
                        case 17:
                            q83Var = (q83) w40.j(parcel, i17, q83.CREATOR);
                            break;
                        case 18:
                            iBinderC7 = w40.C(parcel, i17);
                            break;
                        case 19:
                            strK22 = w40.k(parcel, i17);
                            break;
                        case 24:
                            strK23 = w40.k(parcel, i17);
                            break;
                        case 25:
                            strK24 = w40.k(parcel, i17);
                            break;
                        case 26:
                            iBinderC8 = w40.C(parcel, i17);
                            break;
                        case 27:
                            iBinderC9 = w40.C(parcel, i17);
                            break;
                        case 28:
                            iBinderC10 = w40.C(parcel, i17);
                            break;
                        case 29:
                            zA18 = w40.A(parcel, i17);
                            break;
                        case 30:
                            jE4 = w40.E(parcel, i17);
                            break;
                    }
                }
                w40.p(parcel, iP17);
                return new AdOverlayInfoParcel(r91Var, iBinderC2, iBinderC3, iBinderC4, iBinderC5, strK18, zA17, strK19, iBinderC6, iD35, iD36, strK20, d60Var, strK21, q83Var, iBinderC7, strK22, strK23, strK24, iBinderC8, iBinderC9, iBinderC10, zA18, jE4);
            case 18:
                return new ia3(parcel);
            case 19:
                int iP18 = w40.P(parcel);
                String strK25 = null;
                kb3[] kb3VarArr = null;
                int iD37 = 0;
                int iD38 = 0;
                boolean zA19 = false;
                int iD39 = 0;
                int iD40 = 0;
                boolean zA20 = false;
                boolean zA21 = false;
                boolean zA22 = false;
                boolean zA23 = false;
                boolean zA24 = false;
                boolean zA25 = false;
                boolean zA26 = false;
                boolean zA27 = false;
                while (parcel.dataPosition() < iP18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            strK25 = w40.k(parcel, i18);
                            break;
                        case 3:
                            iD37 = w40.D(parcel, i18);
                            break;
                        case 4:
                            iD38 = w40.D(parcel, i18);
                            break;
                        case 5:
                            zA19 = w40.A(parcel, i18);
                            break;
                        case 6:
                            iD39 = w40.D(parcel, i18);
                            break;
                        case 7:
                            iD40 = w40.D(parcel, i18);
                            break;
                        case '\b':
                            kb3VarArr = (kb3[]) w40.o(parcel, i18, kb3.CREATOR);
                            break;
                        case '\t':
                            zA20 = w40.A(parcel, i18);
                            break;
                        case '\n':
                            zA21 = w40.A(parcel, i18);
                            break;
                        case 11:
                            zA22 = w40.A(parcel, i18);
                            break;
                        case '\f':
                            zA23 = w40.A(parcel, i18);
                            break;
                        case '\r':
                            zA24 = w40.A(parcel, i18);
                            break;
                        case 14:
                            zA25 = w40.A(parcel, i18);
                            break;
                        case 15:
                            zA26 = w40.A(parcel, i18);
                            break;
                        case 16:
                            zA27 = w40.A(parcel, i18);
                            break;
                        default:
                            w40.L(parcel, i18);
                            break;
                    }
                }
                w40.p(parcel, iP18);
                return new kb3(strK25, iD37, iD38, zA19, iD39, iD40, kb3VarArr, zA20, zA21, zA22, zA23, zA24, zA25, zA26, zA27);
            case 20:
                int iP19 = w40.P(parcel);
                long jE5 = 0;
                String strK26 = null;
                int iD41 = 0;
                int iD42 = 0;
                while (parcel.dataPosition() < iP19) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        iD41 = w40.D(parcel, i19);
                    } else if (c11 == 2) {
                        iD42 = w40.D(parcel, i19);
                    } else if (c11 == 3) {
                        strK26 = w40.k(parcel, i19);
                    } else if (c11 != 4) {
                        w40.L(parcel, i19);
                    } else {
                        jE5 = w40.E(parcel, i19);
                    }
                }
                w40.p(parcel, iP19);
                return new qc3(iD41, iD42, jE5, strK26);
            case zw0.zzm /* 21 */:
                int iP20 = w40.P(parcel);
                long jE6 = 0;
                String strK27 = null;
                fu1 fu1Var = null;
                Bundle bundleC5 = null;
                String strK28 = null;
                String strK29 = null;
                String strK30 = null;
                String strK31 = null;
                while (parcel.dataPosition() < iP20) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strK27 = w40.k(parcel, i20);
                            break;
                        case 2:
                            jE6 = w40.E(parcel, i20);
                            break;
                        case 3:
                            fu1Var = (fu1) w40.j(parcel, i20, fu1.CREATOR);
                            break;
                        case 4:
                            bundleC5 = w40.c(parcel, i20);
                            break;
                        case 5:
                            strK28 = w40.k(parcel, i20);
                            break;
                        case 6:
                            strK29 = w40.k(parcel, i20);
                            break;
                        case 7:
                            strK30 = w40.k(parcel, i20);
                            break;
                        case '\b':
                            strK31 = w40.k(parcel, i20);
                            break;
                        default:
                            w40.L(parcel, i20);
                            break;
                    }
                }
                w40.p(parcel, iP20);
                return new ee3(strK27, jE6, fu1Var, bundleC5, strK28, strK29, strK30, strK31);
            case 22:
                int iP21 = w40.P(parcel);
                String strK32 = null;
                int iD43 = 0;
                int iD44 = 0;
                boolean zA28 = false;
                boolean zA29 = false;
                while (parcel.dataPosition() < iP21) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 2) {
                        strK32 = w40.k(parcel, i21);
                    } else if (c12 == 3) {
                        iD43 = w40.D(parcel, i21);
                    } else if (c12 == 4) {
                        iD44 = w40.D(parcel, i21);
                    } else if (c12 == 5) {
                        zA28 = w40.A(parcel, i21);
                    } else if (c12 != 6) {
                        w40.L(parcel, i21);
                    } else {
                        zA29 = w40.A(parcel, i21);
                    }
                }
                w40.p(parcel, iP21);
                return new d60(strK32, iD43, iD44, zA28, zA29);
            default:
                int iP22 = w40.P(parcel);
                while (parcel.dataPosition() < iP22) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        w40.L(parcel, i22);
                    } else {
                        iD2 = w40.D(parcel, i22);
                    }
                }
                w40.p(parcel, iP22);
                return new kf3(iD2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new s32[i];
            case 1:
                return new c62[i];
            case 2:
                return new ua2[i];
            case 3:
                return new wa2[i];
            case 4:
                return new xa2[i];
            case 5:
                return new bb2[i];
            case 6:
                return new cb2[i];
            case 7:
                return new ab2[i];
            case 8:
                return new nb2[i];
            case 9:
                return new qc2[i];
            case 10:
                return new ee2[i];
            case 11:
                return new w73[i];
            case 12:
                return new eb[i];
            case 13:
                return new q83[i];
            case 14:
                return new sl[i];
            case 15:
                return new va3[i];
            case 16:
                return new f93[i];
            case 17:
                return new AdOverlayInfoParcel[i];
            case 18:
                return new ia3[i];
            case 19:
                return new kb3[i];
            case 20:
                return new qc3[i];
            case zw0.zzm /* 21 */:
                return new ee3[i];
            case 22:
                return new d60[i];
            default:
                return new kf3[i];
        }
    }
}
