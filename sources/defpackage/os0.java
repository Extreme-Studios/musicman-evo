package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class os0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ os0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iD = 0;
        boolean zA = false;
        int iD2 = 0;
        int iD3 = 0;
        int iD4 = 0;
        int iD5 = 0;
        boolean zA2 = false;
        int iD6 = 0;
        int iD7 = 0;
        boolean zA3 = false;
        int iD8 = 0;
        boolean zA4 = false;
        String strK = null;
        IBinder iBinderC = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        String strK5 = null;
        String strK6 = null;
        f93 f93Var = null;
        String strK7 = null;
        ArrayList arrayListN = null;
        IBinder iBinderC2 = null;
        String strK8 = null;
        String strK9 = null;
        String strK10 = null;
        String strK11 = null;
        String strK12 = null;
        String strK13 = null;
        switch (this.a) {
            case 0:
                int iP = w40.P(parcel);
                PendingIntent pendingIntent = null;
                db dbVar = null;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iD = w40.D(parcel, i);
                    } else if (c == 2) {
                        strK = w40.k(parcel, i);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) w40.j(parcel, i, PendingIntent.CREATOR);
                    } else if (c != 4) {
                        w40.L(parcel, i);
                    } else {
                        dbVar = (db) w40.j(parcel, i, db.CREATOR);
                    }
                }
                w40.p(parcel, iP);
                return new Status(iD, strK, pendingIntent, dbVar);
            case 1:
                int iP2 = w40.P(parcel);
                while (parcel.dataPosition() < iP2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        w40.L(parcel, i2);
                    } else {
                        zA4 = w40.A(parcel, i2);
                    }
                }
                w40.p(parcel, iP2);
                return new o2(zA4);
            case 2:
                int iP3 = w40.P(parcel);
                String strK14 = null;
                String strK15 = null;
                while (parcel.dataPosition() < iP3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        strK13 = w40.k(parcel, i3);
                    } else if (c2 == 2) {
                        strK14 = w40.k(parcel, i3);
                    } else if (c2 != 3) {
                        w40.L(parcel, i3);
                    } else {
                        strK15 = w40.k(parcel, i3);
                    }
                }
                w40.p(parcel, iP3);
                return new jb0(strK13, strK14, strK15);
            case 3:
                int iP4 = w40.P(parcel);
                boolean zA5 = false;
                String strK16 = null;
                String strK17 = null;
                String strK18 = null;
                String strK19 = null;
                String strK20 = null;
                String strK21 = null;
                String strK22 = null;
                Intent intent = null;
                IBinder iBinderC3 = null;
                Bundle bundleC = null;
                while (parcel.dataPosition() < iP4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strK16 = w40.k(parcel, i4);
                            break;
                        case 3:
                            strK17 = w40.k(parcel, i4);
                            break;
                        case 4:
                            strK18 = w40.k(parcel, i4);
                            break;
                        case 5:
                            strK19 = w40.k(parcel, i4);
                            break;
                        case 6:
                            strK20 = w40.k(parcel, i4);
                            break;
                        case 7:
                            strK21 = w40.k(parcel, i4);
                            break;
                        case '\b':
                            strK22 = w40.k(parcel, i4);
                            break;
                        case '\t':
                            intent = (Intent) w40.j(parcel, i4, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderC3 = w40.C(parcel, i4);
                            break;
                        case 11:
                            zA5 = w40.A(parcel, i4);
                            break;
                        case '\f':
                            bundleC = w40.c(parcel, i4);
                            break;
                        default:
                            w40.L(parcel, i4);
                            break;
                    }
                }
                w40.p(parcel, iP4);
                return new r91(strK16, strK17, strK18, strK19, strK20, strK21, strK22, intent, iBinderC3, zA5, bundleC);
            case 4:
                int iP5 = w40.P(parcel);
                while (parcel.dataPosition() < iP5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        strK12 = w40.k(parcel, i5);
                    } else if (c3 != 2) {
                        w40.L(parcel, i5);
                    } else {
                        iD8 = w40.D(parcel, i5);
                    }
                }
                w40.p(parcel, iP5);
                return new zs0(strK12, iD8);
            case 5:
                int iP6 = w40.P(parcel);
                long jE = 0;
                boolean zA6 = false;
                boolean zA7 = false;
                boolean zA8 = false;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iP6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) w40.j(parcel, i6, ParcelFileDescriptor.CREATOR);
                    } else if (c4 == 3) {
                        zA6 = w40.A(parcel, i6);
                    } else if (c4 == 4) {
                        zA7 = w40.A(parcel, i6);
                    } else if (c4 == 5) {
                        jE = w40.E(parcel, i6);
                    } else if (c4 != 6) {
                        w40.L(parcel, i6);
                    } else {
                        zA8 = w40.A(parcel, i6);
                    }
                }
                w40.p(parcel, iP6);
                return new uu0(parcelFileDescriptor, zA6, zA7, jE, zA8);
            case 6:
                int iP7 = w40.P(parcel);
                long jE2 = 0;
                long jE3 = 0;
                boolean zA9 = false;
                int iD9 = 0;
                String strK23 = null;
                String strK24 = null;
                String strK25 = null;
                String strK26 = null;
                Bundle bundleC2 = null;
                String strK27 = null;
                while (parcel.dataPosition() < iP7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            strK23 = w40.k(parcel, i7);
                            break;
                        case 3:
                            jE2 = w40.E(parcel, i7);
                            break;
                        case 4:
                            strK24 = w40.k(parcel, i7);
                            break;
                        case 5:
                            strK25 = w40.k(parcel, i7);
                            break;
                        case 6:
                            strK26 = w40.k(parcel, i7);
                            break;
                        case 7:
                            bundleC2 = w40.c(parcel, i7);
                            break;
                        case '\b':
                            zA9 = w40.A(parcel, i7);
                            break;
                        case '\t':
                            jE3 = w40.E(parcel, i7);
                            break;
                        case '\n':
                            strK27 = w40.k(parcel, i7);
                            break;
                        case 11:
                            iD9 = w40.D(parcel, i7);
                            break;
                        default:
                            w40.L(parcel, i7);
                            break;
                    }
                }
                w40.p(parcel, iP7);
                return new wu0(strK23, jE2, strK24, strK25, strK26, bundleC2, zA9, jE3, strK27, iD9);
            case 7:
                int iP8 = w40.P(parcel);
                int iD10 = 0;
                boolean zA10 = false;
                int iD11 = 0;
                boolean zA11 = false;
                int iD12 = 0;
                boolean zA12 = false;
                int iD13 = 0;
                int iD14 = 0;
                boolean zA13 = false;
                int iD15 = 0;
                ee2 ee2Var = null;
                while (parcel.dataPosition() < iP8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            iD10 = w40.D(parcel, i8);
                            break;
                        case 2:
                            zA10 = w40.A(parcel, i8);
                            break;
                        case 3:
                            iD11 = w40.D(parcel, i8);
                            break;
                        case 4:
                            zA11 = w40.A(parcel, i8);
                            break;
                        case 5:
                            iD12 = w40.D(parcel, i8);
                            break;
                        case 6:
                            ee2Var = (ee2) w40.j(parcel, i8, ee2.CREATOR);
                            break;
                        case 7:
                            zA12 = w40.A(parcel, i8);
                            break;
                        case '\b':
                            iD13 = w40.D(parcel, i8);
                            break;
                        case '\t':
                            iD14 = w40.D(parcel, i8);
                            break;
                        case '\n':
                            zA13 = w40.A(parcel, i8);
                            break;
                        case 11:
                            iD15 = w40.D(parcel, i8);
                            break;
                        default:
                            w40.L(parcel, i8);
                            break;
                    }
                }
                w40.p(parcel, iP8);
                return new qz0(iD10, zA10, iD11, zA11, iD12, ee2Var, zA12, iD13, iD14, zA13, iD15);
            case 8:
                int iP9 = w40.P(parcel);
                String[] strArrM = null;
                String[] strArrM2 = null;
                while (parcel.dataPosition() < iP9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        strK11 = w40.k(parcel, i9);
                    } else if (c5 == 2) {
                        strArrM = w40.m(parcel, i9);
                    } else if (c5 != 3) {
                        w40.L(parcel, i9);
                    } else {
                        strArrM2 = w40.m(parcel, i9);
                    }
                }
                w40.p(parcel, iP9);
                return new n21(strK11, strArrM, strArrM2);
            case 9:
                int iP10 = w40.P(parcel);
                long jE4 = 0;
                boolean zA14 = false;
                int iD16 = 0;
                boolean zA15 = false;
                String strK28 = null;
                byte[] bArrD = null;
                String[] strArrM3 = null;
                String[] strArrM4 = null;
                while (parcel.dataPosition() < iP10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            zA14 = w40.A(parcel, i10);
                            break;
                        case 2:
                            strK28 = w40.k(parcel, i10);
                            break;
                        case 3:
                            iD16 = w40.D(parcel, i10);
                            break;
                        case 4:
                            bArrD = w40.d(parcel, i10);
                            break;
                        case 5:
                            strArrM3 = w40.m(parcel, i10);
                            break;
                        case 6:
                            strArrM4 = w40.m(parcel, i10);
                            break;
                        case 7:
                            zA15 = w40.A(parcel, i10);
                            break;
                        case '\b':
                            jE4 = w40.E(parcel, i10);
                            break;
                        default:
                            w40.L(parcel, i10);
                            break;
                    }
                }
                w40.p(parcel, iP10);
                return new o21(zA14, strK28, iD16, bArrD, strArrM3, strArrM4, zA15, jE4);
            case 10:
                int iP11 = w40.P(parcel);
                int iD17 = 0;
                String strK29 = null;
                while (parcel.dataPosition() < iP11) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        strK10 = w40.k(parcel, i11);
                    } else if (c6 == 2) {
                        zA3 = w40.A(parcel, i11);
                    } else if (c6 == 3) {
                        iD17 = w40.D(parcel, i11);
                    } else if (c6 != 4) {
                        w40.L(parcel, i11);
                    } else {
                        strK29 = w40.k(parcel, i11);
                    }
                }
                w40.p(parcel, iP11);
                return new s21(strK10, iD17, strK29, zA3);
            case 11:
                int iP12 = w40.P(parcel);
                Bundle bundleC3 = null;
                while (parcel.dataPosition() < iP12) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        strK9 = w40.k(parcel, i12);
                    } else if (c7 != 2) {
                        w40.L(parcel, i12);
                    } else {
                        bundleC3 = w40.c(parcel, i12);
                    }
                }
                w40.p(parcel, iP12);
                return new z21(strK9, bundleC3);
            case 12:
                int iP13 = w40.P(parcel);
                int iD18 = 0;
                int iD19 = 0;
                while (parcel.dataPosition() < iP13) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 1) {
                        iD18 = w40.D(parcel, i13);
                    } else if (c8 == 2) {
                        strK8 = w40.k(parcel, i13);
                    } else if (c8 == 3) {
                        iD19 = w40.D(parcel, i13);
                    } else if (c8 != 1000) {
                        w40.L(parcel, i13);
                    } else {
                        iD7 = w40.D(parcel, i13);
                    }
                }
                w40.p(parcel, iP13);
                return new a31(iD7, iD18, strK8, iD19);
            case 13:
                int iP14 = w40.P(parcel);
                int iD20 = 0;
                int iD21 = 0;
                while (parcel.dataPosition() < iP14) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        iD6 = w40.D(parcel, i14);
                    } else if (c9 == 2) {
                        iD20 = w40.D(parcel, i14);
                    } else if (c9 != 3) {
                        w40.L(parcel, i14);
                    } else {
                        iD21 = w40.D(parcel, i14);
                    }
                }
                w40.p(parcel, iP14);
                return new x51(iD6, iD20, iD21);
            case 14:
                int iP15 = w40.P(parcel);
                IBinder iBinderC4 = null;
                while (parcel.dataPosition() < iP15) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        iBinderC2 = w40.C(parcel, i15);
                    } else if (c10 != 2) {
                        w40.L(parcel, i15);
                    } else {
                        iBinderC4 = w40.C(parcel, i15);
                    }
                }
                w40.p(parcel, iP15);
                return new c71(iBinderC2, iBinderC4);
            case 15:
                int iP16 = w40.P(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                long jE5 = 0;
                long jE6 = 0;
                int iD22 = 0;
                int iD23 = 0;
                boolean zA16 = false;
                int iD24 = 0;
                int iD25 = 0;
                boolean zA17 = false;
                int iD26 = 0;
                int iD27 = 0;
                boolean zA18 = false;
                boolean zA19 = false;
                int iD28 = 0;
                boolean zA20 = false;
                boolean zA21 = false;
                int iD29 = 0;
                boolean zA22 = false;
                boolean zA23 = false;
                boolean zA24 = false;
                Bundle bundleC4 = null;
                f93 f93Var2 = null;
                kb3 kb3Var = null;
                String strK30 = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String strK31 = null;
                String strK32 = null;
                String strK33 = null;
                d60 d60Var = null;
                Bundle bundleC5 = null;
                ArrayList arrayListN2 = null;
                Bundle bundleC6 = null;
                String strK34 = null;
                String strK35 = null;
                ArrayList arrayListN3 = null;
                String strK36 = null;
                qz0 qz0Var = null;
                ArrayList arrayListN4 = null;
                String strK37 = null;
                String strK38 = null;
                String strK39 = null;
                Bundle bundleC7 = null;
                String strK40 = null;
                ow1 ow1Var = null;
                Bundle bundleC8 = null;
                String strK41 = null;
                String strK42 = null;
                String strK43 = null;
                ArrayList arrayList = null;
                String strK44 = null;
                ArrayList arrayListN5 = null;
                ArrayList arrayListN6 = null;
                String strK45 = null;
                a31 a31Var = null;
                String strK46 = null;
                Bundle bundleC9 = null;
                while (parcel.dataPosition() < iP16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iD22 = w40.D(parcel, i16);
                            break;
                        case 2:
                            bundleC4 = w40.c(parcel, i16);
                            break;
                        case 3:
                            f93Var2 = (f93) w40.j(parcel, i16, f93.CREATOR);
                            break;
                        case 4:
                            kb3Var = (kb3) w40.j(parcel, i16, kb3.CREATOR);
                            break;
                        case 5:
                            strK30 = w40.k(parcel, i16);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) w40.j(parcel, i16, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) w40.j(parcel, i16, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            strK31 = w40.k(parcel, i16);
                            break;
                        case '\t':
                            strK32 = w40.k(parcel, i16);
                            break;
                        case '\n':
                            strK33 = w40.k(parcel, i16);
                            break;
                        case 11:
                            d60Var = (d60) w40.j(parcel, i16, d60.CREATOR);
                            break;
                        case '\f':
                            bundleC5 = w40.c(parcel, i16);
                            break;
                        case '\r':
                            iD23 = w40.D(parcel, i16);
                            break;
                        case 14:
                            arrayListN2 = w40.n(parcel, i16);
                            break;
                        case 15:
                            bundleC6 = w40.c(parcel, i16);
                            break;
                        case 16:
                            zA16 = w40.A(parcel, i16);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case '&':
                        case '>':
                        default:
                            w40.L(parcel, i16);
                            break;
                        case 18:
                            iD24 = w40.D(parcel, i16);
                            break;
                        case 19:
                            iD25 = w40.D(parcel, i16);
                            break;
                        case 20:
                            w40.j0(parcel, i16, 4);
                            f = parcel.readFloat();
                            break;
                        case zw0.zzm /* 21 */:
                            strK34 = w40.k(parcel, i16);
                            break;
                        case 25:
                            jE5 = w40.E(parcel, i16);
                            break;
                        case 26:
                            strK35 = w40.k(parcel, i16);
                            break;
                        case 27:
                            arrayListN3 = w40.n(parcel, i16);
                            break;
                        case 28:
                            strK36 = w40.k(parcel, i16);
                            break;
                        case 29:
                            qz0Var = (qz0) w40.j(parcel, i16, qz0.CREATOR);
                            break;
                        case 30:
                            arrayListN4 = w40.n(parcel, i16);
                            break;
                        case 31:
                            jE6 = w40.E(parcel, i16);
                            break;
                        case '!':
                            strK37 = w40.k(parcel, i16);
                            break;
                        case '\"':
                            w40.j0(parcel, i16, 4);
                            f2 = parcel.readFloat();
                            break;
                        case '#':
                            iD26 = w40.D(parcel, i16);
                            break;
                        case '$':
                            iD27 = w40.D(parcel, i16);
                            break;
                        case '%':
                            zA18 = w40.A(parcel, i16);
                            break;
                        case '\'':
                            strK38 = w40.k(parcel, i16);
                            break;
                        case '(':
                            zA17 = w40.A(parcel, i16);
                            break;
                        case ')':
                            strK39 = w40.k(parcel, i16);
                            break;
                        case '*':
                            zA19 = w40.A(parcel, i16);
                            break;
                        case '+':
                            iD28 = w40.D(parcel, i16);
                            break;
                        case ',':
                            bundleC7 = w40.c(parcel, i16);
                            break;
                        case '-':
                            strK40 = w40.k(parcel, i16);
                            break;
                        case '.':
                            ow1Var = (ow1) w40.j(parcel, i16, ow1.CREATOR);
                            break;
                        case '/':
                            zA20 = w40.A(parcel, i16);
                            break;
                        case '0':
                            bundleC8 = w40.c(parcel, i16);
                            break;
                        case '1':
                            strK41 = w40.k(parcel, i16);
                            break;
                        case '2':
                            strK42 = w40.k(parcel, i16);
                            break;
                        case '3':
                            strK43 = w40.k(parcel, i16);
                            break;
                        case '4':
                            zA21 = w40.A(parcel, i16);
                            break;
                        case '5':
                            int iJ = w40.J(parcel, i16);
                            int iDataPosition = parcel.dataPosition();
                            if (iJ == 0) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                int i17 = parcel.readInt();
                                for (int i18 = 0; i18 < i17; i18++) {
                                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(iDataPosition + iJ);
                                arrayList = arrayList2;
                            }
                            break;
                        case '6':
                            strK44 = w40.k(parcel, i16);
                            break;
                        case '7':
                            arrayListN5 = w40.n(parcel, i16);
                            break;
                        case '8':
                            iD29 = w40.D(parcel, i16);
                            break;
                        case '9':
                            zA22 = w40.A(parcel, i16);
                            break;
                        case ':':
                            zA23 = w40.A(parcel, i16);
                            break;
                        case ';':
                            zA24 = w40.A(parcel, i16);
                            break;
                        case '<':
                            arrayListN6 = w40.n(parcel, i16);
                            break;
                        case '=':
                            strK45 = w40.k(parcel, i16);
                            break;
                        case '?':
                            a31Var = (a31) w40.j(parcel, i16, a31.CREATOR);
                            break;
                        case '@':
                            strK46 = w40.k(parcel, i16);
                            break;
                        case 'A':
                            bundleC9 = w40.c(parcel, i16);
                            break;
                    }
                }
                w40.p(parcel, iP16);
                return new h71(iD22, bundleC4, f93Var2, kb3Var, strK30, applicationInfo, packageInfo, strK31, strK32, strK33, d60Var, bundleC5, iD23, arrayListN2, bundleC6, zA16, iD24, iD25, f, strK34, jE5, strK35, arrayListN3, strK36, qz0Var, arrayListN4, jE6, strK37, f2, zA17, iD26, iD27, zA18, strK38, strK39, zA19, iD28, bundleC7, strK40, ow1Var, zA20, bundleC8, strK41, strK42, strK43, zA21, arrayList, strK44, arrayListN5, iD29, zA22, zA23, zA24, arrayListN6, strK45, a31Var, strK46, bundleC9);
            case 16:
                int iP17 = w40.P(parcel);
                while (parcel.dataPosition() < iP17) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 2) {
                        zA2 = w40.A(parcel, i19);
                    } else if (c11 != 3) {
                        w40.L(parcel, i19);
                    } else {
                        arrayListN = w40.n(parcel, i19);
                    }
                }
                w40.p(parcel, iP17);
                return new i71(zA2, arrayListN);
            case 17:
                int iP18 = w40.P(parcel);
                while (parcel.dataPosition() < iP18) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        w40.L(parcel, i20);
                    } else {
                        strK7 = w40.k(parcel, i20);
                    }
                }
                w40.p(parcel, iP18);
                return new j71(strK7);
            case 18:
                int iP19 = w40.P(parcel);
                boolean zA25 = false;
                boolean zA26 = false;
                int iD30 = 0;
                Bundle bundleC10 = null;
                d60 d60Var2 = null;
                ApplicationInfo applicationInfo2 = null;
                String strK47 = null;
                ArrayList arrayListN7 = null;
                PackageInfo packageInfo2 = null;
                String strK48 = null;
                String strK49 = null;
                c62 c62Var = null;
                String strK50 = null;
                Bundle bundleC11 = null;
                Bundle bundleC12 = null;
                while (parcel.dataPosition() < iP19) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            bundleC10 = w40.c(parcel, i21);
                            break;
                        case 2:
                            d60Var2 = (d60) w40.j(parcel, i21, d60.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) w40.j(parcel, i21, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            strK47 = w40.k(parcel, i21);
                            break;
                        case 5:
                            arrayListN7 = w40.n(parcel, i21);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) w40.j(parcel, i21, PackageInfo.CREATOR);
                            break;
                        case 7:
                            strK48 = w40.k(parcel, i21);
                            break;
                        case '\b':
                        default:
                            w40.L(parcel, i21);
                            break;
                        case '\t':
                            strK49 = w40.k(parcel, i21);
                            break;
                        case '\n':
                            c62Var = (c62) w40.j(parcel, i21, c62.CREATOR);
                            break;
                        case 11:
                            strK50 = w40.k(parcel, i21);
                            break;
                        case '\f':
                            zA25 = w40.A(parcel, i21);
                            break;
                        case '\r':
                            zA26 = w40.A(parcel, i21);
                            break;
                        case 14:
                            bundleC11 = w40.c(parcel, i21);
                            break;
                        case 15:
                            bundleC12 = w40.c(parcel, i21);
                            break;
                        case 16:
                            iD30 = w40.D(parcel, i21);
                            break;
                    }
                }
                w40.p(parcel, iP19);
                return new r71(bundleC10, d60Var2, applicationInfo2, strK47, arrayListN7, packageInfo2, strK48, strK49, c62Var, strK50, zA25, zA26, bundleC11, bundleC12, iD30);
            case 19:
                int iP20 = w40.P(parcel);
                String strK51 = null;
                while (parcel.dataPosition() < iP20) {
                    int i22 = parcel.readInt();
                    char c12 = (char) i22;
                    if (c12 == 2) {
                        f93Var = (f93) w40.j(parcel, i22, f93.CREATOR);
                    } else if (c12 != 3) {
                        w40.L(parcel, i22);
                    } else {
                        strK51 = w40.k(parcel, i22);
                    }
                }
                w40.p(parcel, iP20);
                return new c81(strK51, f93Var);
            case 20:
                int iP21 = w40.P(parcel);
                while (parcel.dataPosition() < iP21) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 2) {
                        strK6 = w40.k(parcel, i23);
                    } else if (c13 != 3) {
                        w40.L(parcel, i23);
                    } else {
                        iD5 = w40.D(parcel, i23);
                    }
                }
                w40.p(parcel, iP21);
                return new g81(strK6, iD5);
            case zw0.zzm /* 21 */:
                int iP22 = w40.P(parcel);
                String strK52 = null;
                while (parcel.dataPosition() < iP22) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 1) {
                        strK5 = w40.k(parcel, i24);
                    } else if (c14 != 2) {
                        w40.L(parcel, i24);
                    } else {
                        strK52 = w40.k(parcel, i24);
                    }
                }
                w40.p(parcel, iP22);
                return new z81(strK5, strK52);
            case 22:
                int iP23 = w40.P(parcel);
                boolean zA27 = false;
                boolean zA28 = false;
                boolean zA29 = false;
                boolean zA30 = false;
                String strK53 = null;
                String strK54 = null;
                ArrayList arrayListN8 = null;
                ArrayList arrayListN9 = null;
                while (parcel.dataPosition() < iP23) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            strK53 = w40.k(parcel, i25);
                            break;
                        case 3:
                            strK54 = w40.k(parcel, i25);
                            break;
                        case 4:
                            zA27 = w40.A(parcel, i25);
                            break;
                        case 5:
                            zA28 = w40.A(parcel, i25);
                            break;
                        case 6:
                            arrayListN8 = w40.n(parcel, i25);
                            break;
                        case 7:
                            zA29 = w40.A(parcel, i25);
                            break;
                        case '\b':
                            zA30 = w40.A(parcel, i25);
                            break;
                        case '\t':
                            arrayListN9 = w40.n(parcel, i25);
                            break;
                        default:
                            w40.L(parcel, i25);
                            break;
                    }
                }
                w40.p(parcel, iP23);
                return new e91(strK53, strK54, zA27, zA28, arrayListN8, zA29, zA30, arrayListN9);
            case 23:
                int iP24 = w40.P(parcel);
                long jE7 = -1;
                while (parcel.dataPosition() < iP24) {
                    int i26 = parcel.readInt();
                    char c15 = (char) i26;
                    if (c15 == 1) {
                        strK4 = w40.k(parcel, i26);
                    } else if (c15 == 2) {
                        iD4 = w40.D(parcel, i26);
                    } else if (c15 != 3) {
                        w40.L(parcel, i26);
                    } else {
                        jE7 = w40.E(parcel, i26);
                    }
                }
                w40.p(parcel, iP24);
                return new ei(iD4, jE7, strK4);
            case 24:
                int iP25 = w40.P(parcel);
                int iD31 = 0;
                String strK55 = null;
                String strK56 = null;
                kb3 kb3Var2 = null;
                f93 f93Var3 = null;
                String strK57 = null;
                while (parcel.dataPosition() < iP25) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            strK55 = w40.k(parcel, i27);
                            break;
                        case 2:
                            strK56 = w40.k(parcel, i27);
                            break;
                        case 3:
                            kb3Var2 = (kb3) w40.j(parcel, i27, kb3.CREATOR);
                            break;
                        case 4:
                            f93Var3 = (f93) w40.j(parcel, i27, f93.CREATOR);
                            break;
                        case 5:
                            iD31 = w40.D(parcel, i27);
                            break;
                        case 6:
                            strK57 = w40.k(parcel, i27);
                            break;
                        default:
                            w40.L(parcel, i27);
                            break;
                    }
                }
                w40.p(parcel, iP25);
                return new ma1(strK55, strK56, kb3Var2, f93Var3, iD31, strK57);
            case 25:
                int iP26 = w40.P(parcel);
                String strK58 = null;
                while (parcel.dataPosition() < iP26) {
                    int i28 = parcel.readInt();
                    char c16 = (char) i28;
                    if (c16 == 1) {
                        strK3 = w40.k(parcel, i28);
                    } else if (c16 != 2) {
                        w40.L(parcel, i28);
                    } else {
                        strK58 = w40.k(parcel, i28);
                    }
                }
                w40.p(parcel, iP26);
                return new q91(strK3, strK58);
            case 26:
                int iP27 = w40.P(parcel);
                while (parcel.dataPosition() < iP27) {
                    int i29 = parcel.readInt();
                    char c17 = (char) i29;
                    if (c17 == 1) {
                        strK2 = w40.k(parcel, i29);
                    } else if (c17 != 2) {
                        w40.L(parcel, i29);
                    } else {
                        iD3 = w40.D(parcel, i29);
                    }
                }
                w40.p(parcel, iP27);
                return new v91(strK2, iD3);
            case 27:
                int iP28 = w40.P(parcel);
                while (parcel.dataPosition() < iP28) {
                    int i30 = parcel.readInt();
                    if (((char) i30) != 2) {
                        w40.L(parcel, i30);
                    } else {
                        iD2 = w40.D(parcel, i30);
                    }
                }
                w40.p(parcel, iP28);
                return new ow1(iD2);
            case 28:
                int iP29 = w40.P(parcel);
                IBinder iBinderC5 = null;
                while (parcel.dataPosition() < iP29) {
                    int i31 = parcel.readInt();
                    char c18 = (char) i31;
                    if (c18 == 1) {
                        zA = w40.A(parcel, i31);
                    } else if (c18 == 2) {
                        iBinderC = w40.C(parcel, i31);
                    } else if (c18 != 3) {
                        w40.L(parcel, i31);
                    } else {
                        iBinderC5 = w40.C(parcel, i31);
                    }
                }
                w40.p(parcel, iP29);
                return new ew(zA, iBinderC, iBinderC5);
            default:
                int iP30 = w40.P(parcel);
                int iD32 = 0;
                String strK59 = null;
                String strK60 = null;
                fu1 fu1Var = null;
                IBinder iBinderC6 = null;
                while (parcel.dataPosition() < iP30) {
                    int i32 = parcel.readInt();
                    char c19 = (char) i32;
                    if (c19 == 1) {
                        iD32 = w40.D(parcel, i32);
                    } else if (c19 == 2) {
                        strK59 = w40.k(parcel, i32);
                    } else if (c19 == 3) {
                        strK60 = w40.k(parcel, i32);
                    } else if (c19 == 4) {
                        fu1Var = (fu1) w40.j(parcel, i32, fu1.CREATOR);
                    } else if (c19 != 5) {
                        w40.L(parcel, i32);
                    } else {
                        iBinderC6 = w40.C(parcel, i32);
                    }
                }
                w40.p(parcel, iP30);
                return new fu1(iD32, strK59, strK60, fu1Var, iBinderC6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Status[i];
            case 1:
                return new o2[i];
            case 2:
                return new jb0[i];
            case 3:
                return new r91[i];
            case 4:
                return new zs0[i];
            case 5:
                return new uu0[i];
            case 6:
                return new wu0[i];
            case 7:
                return new qz0[i];
            case 8:
                return new n21[i];
            case 9:
                return new o21[i];
            case 10:
                return new s21[i];
            case 11:
                return new z21[i];
            case 12:
                return new a31[i];
            case 13:
                return new x51[i];
            case 14:
                return new c71[i];
            case 15:
                return new h71[i];
            case 16:
                return new i71[i];
            case 17:
                return new j71[i];
            case 18:
                return new r71[i];
            case 19:
                return new c81[i];
            case 20:
                return new g81[i];
            case zw0.zzm /* 21 */:
                return new z81[i];
            case 22:
                return new e91[i];
            case 23:
                return new ei[i];
            case 24:
                return new ma1[i];
            case 25:
                return new q91[i];
            case 26:
                return new v91[i];
            case 27:
                return new ow1[i];
            case 28:
                return new ew[i];
            default:
                return new fu1[i];
        }
    }
}
