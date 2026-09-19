package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import defpackage.a2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a2(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        int iD = 0;
        tm tmVar = null;
        PendingIntent pendingIntent = null;
        String strK = null;
        Account account = null;
        db dbVar = null;
        ArrayList arrayListN = null;
        Intent intent = null;
        switch (this.a) {
            case 0:
                return new b2(parcel);
            case 1:
                z5 z5Var = new z5(parcel);
                z5Var.f = parcel.readByte() != 0;
                return z5Var;
            case 2:
                return new t7(parcel);
            case 3:
                return new u7(parcel);
            case 4:
                uj ujVar = new uj();
                ujVar.f = parcel.readString();
                ujVar.g = parcel.readInt();
                return ujVar;
            case 5:
                yj yjVar = new yj();
                yjVar.j = null;
                yjVar.k = new ArrayList();
                yjVar.l = new ArrayList();
                yjVar.f = parcel.createStringArrayList();
                yjVar.g = parcel.createStringArrayList();
                yjVar.h = (t7[]) parcel.createTypedArray(t7.CREATOR);
                yjVar.i = parcel.readInt();
                yjVar.j = parcel.readString();
                yjVar.k = parcel.createStringArrayList();
                yjVar.l = parcel.createTypedArrayList(u7.CREATOR);
                yjVar.m = parcel.createTypedArrayList(uj.CREATOR);
                return yjVar;
            case 6:
                return new dk(parcel);
            case 7:
                mq mqVar = new mq(parcel);
                mqVar.f = ((Integer) parcel.readValue(mq.class.getClassLoader())).intValue();
                return mqVar;
            case 8:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a2(8);
                    public final int f;
                    public final MediaDescriptionCompat g;

                    {
                        this.f = parcel.readInt();
                        this.g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f + ", mDescription=" + this.g + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.f);
                        this.g.writeToParcel(parcel2, i);
                    }
                };
            case 9:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = yq.g(mediaDescription);
                CharSequence charSequenceI = yq.i(mediaDescription);
                CharSequence charSequenceH = yq.h(mediaDescription);
                CharSequence charSequenceC = yq.c(mediaDescription);
                Bitmap bitmapE = yq.e(mediaDescription);
                Uri uriF = yq.f(mediaDescription);
                Bundle bundleD = yq.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = ar.o(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = zq.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.n = mediaDescription;
                return mediaDescriptionCompat;
            case 10:
                return new MediaMetadataCompat(parcel);
            case 11:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a2(11);
                    public final MediaDescriptionCompat f;
                    public final long g;

                    {
                        this.f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.g = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f + ", Id=" + this.g + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.f.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.g);
                    }
                };
            case 12:
                return new MediaSessionCompat$Token(parcel.readParcelable(null));
            case 13:
                mt mtVar = new mt(parcel);
                mtVar.f = parcel.readInt();
                return mtVar;
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f = parcel.readInt();
                parcelableVolumeInfo.h = parcel.readInt();
                parcelableVolumeInfo.i = parcel.readInt();
                parcelableVolumeInfo.j = parcel.readInt();
                parcelableVolumeInfo.g = parcel.readInt();
                return parcelableVolumeInfo;
            case 16:
                return new PlaybackStateCompat(parcel);
            case 17:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 18:
                ux uxVar = new ux();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = tx.g;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(tm.c);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof tm)) {
                        sm smVar = new sm();
                        smVar.f = strongBinder;
                        tmVar = smVar;
                    } else {
                        tmVar = (tm) iInterfaceQueryLocalInterface;
                    }
                }
                uxVar.f = tmVar;
                return uxVar;
            case 19:
                int iP = w40.P(parcel);
                while (true) {
                    ArrayList arrayListCreateTypedArrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iP) {
                            w40.p(parcel, iP);
                            return new p30(iD, arrayListCreateTypedArrayList);
                        }
                        int i2 = parcel.readInt();
                        char c = (char) i2;
                        if (c == 1) {
                            iD = w40.D(parcel, i2);
                        } else if (c != 2) {
                            w40.L(parcel, i2);
                        } else {
                            Parcelable.Creator<os> creator = os.CREATOR;
                            int iJ = w40.J(parcel, i2);
                            int iDataPosition = parcel.dataPosition();
                            if (iJ == 0) {
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition + iJ);
                        }
                        break;
                    }
                }
                break;
            case 20:
                int iP2 = w40.P(parcel);
                int iD2 = 0;
                while (parcel.dataPosition() < iP2) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        iD = w40.D(parcel, i3);
                    } else if (c2 == 2) {
                        iD2 = w40.D(parcel, i3);
                    } else if (c2 != 3) {
                        w40.L(parcel, i3);
                    } else {
                        intent = (Intent) w40.j(parcel, i3, Intent.CREATOR);
                    }
                }
                w40.p(parcel, iP2);
                return new u90(iD, iD2, intent);
            case zw0.zzm /* 21 */:
                int iP3 = w40.P(parcel);
                long jE = 0;
                int iD3 = 0;
                String strK2 = null;
                String strK3 = null;
                String strK4 = null;
                String strK5 = null;
                Uri uri = null;
                String strK6 = null;
                String strK7 = null;
                ArrayList arrayList = null;
                String strK8 = null;
                String strK9 = null;
                while (parcel.dataPosition() < iP3) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iD3 = w40.D(parcel, i4);
                            break;
                        case 2:
                            strK2 = w40.k(parcel, i4);
                            break;
                        case 3:
                            strK3 = w40.k(parcel, i4);
                            break;
                        case 4:
                            strK4 = w40.k(parcel, i4);
                            break;
                        case 5:
                            strK5 = w40.k(parcel, i4);
                            break;
                        case 6:
                            uri = (Uri) w40.j(parcel, i4, Uri.CREATOR);
                            break;
                        case 7:
                            strK6 = w40.k(parcel, i4);
                            break;
                        case '\b':
                            jE = w40.E(parcel, i4);
                            break;
                        case '\t':
                            strK7 = w40.k(parcel, i4);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int iJ2 = w40.J(parcel, i4);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iJ2 != 0) {
                                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(iDataPosition2 + iJ2);
                                arrayList = arrayListCreateTypedArrayList2;
                            } else {
                                arrayList = null;
                            }
                            break;
                        case 11:
                            strK8 = w40.k(parcel, i4);
                            break;
                        case '\f':
                            strK9 = w40.k(parcel, i4);
                            break;
                        default:
                            w40.L(parcel, i4);
                            break;
                    }
                }
                w40.p(parcel, iP3);
                return new GoogleSignInAccount(iD3, strK2, strK3, strK4, strK5, uri, strK6, jE, strK7, arrayList, strK8, strK9);
            case 22:
                int iP4 = w40.P(parcel);
                String strK10 = null;
                while (parcel.dataPosition() < iP4) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        arrayListN = w40.n(parcel, i5);
                    } else if (c3 != 2) {
                        w40.L(parcel, i5);
                    } else {
                        strK10 = w40.k(parcel, i5);
                    }
                }
                w40.p(parcel, iP4);
                return new ra0(arrayListN, strK10);
            case 23:
                int iP5 = w40.P(parcel);
                bb0 bb0Var = null;
                while (parcel.dataPosition() < iP5) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        iD = w40.D(parcel, i6);
                    } else if (c4 == 2) {
                        dbVar = (db) w40.j(parcel, i6, db.CREATOR);
                    } else if (c4 != 3) {
                        w40.L(parcel, i6);
                    } else {
                        bb0Var = (bb0) w40.j(parcel, i6, bb0.CREATOR);
                    }
                }
                w40.p(parcel, iP5);
                return new va0(iD, dbVar, bb0Var);
            case 24:
                int iP6 = w40.P(parcel);
                long jE2 = 0;
                long jE3 = 0;
                int iD4 = -1;
                int iD5 = 0;
                int iD6 = 0;
                int iD7 = 0;
                int iD8 = 0;
                String strK11 = null;
                String strK12 = null;
                while (parcel.dataPosition() < iP6) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iD5 = w40.D(parcel, i7);
                            break;
                        case 2:
                            iD6 = w40.D(parcel, i7);
                            break;
                        case 3:
                            iD7 = w40.D(parcel, i7);
                            break;
                        case 4:
                            jE2 = w40.E(parcel, i7);
                            break;
                        case 5:
                            jE3 = w40.E(parcel, i7);
                            break;
                        case 6:
                            strK11 = w40.k(parcel, i7);
                            break;
                        case 7:
                            strK12 = w40.k(parcel, i7);
                            break;
                        case '\b':
                            iD8 = w40.D(parcel, i7);
                            break;
                        case '\t':
                            iD4 = w40.D(parcel, i7);
                            break;
                        default:
                            w40.L(parcel, i7);
                            break;
                    }
                }
                w40.p(parcel, iP6);
                return new os(iD5, iD6, iD7, jE2, jE3, strK11, strK12, iD8, iD4);
            case 25:
                int iP7 = w40.P(parcel);
                int iD9 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iP7) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iD = w40.D(parcel, i8);
                    } else if (c5 == 2) {
                        account = (Account) w40.j(parcel, i8, Account.CREATOR);
                    } else if (c5 == 3) {
                        iD9 = w40.D(parcel, i8);
                    } else if (c5 != 4) {
                        w40.L(parcel, i8);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) w40.j(parcel, i8, GoogleSignInAccount.CREATOR);
                    }
                }
                w40.p(parcel, iP7);
                return new ab0(iD, account, iD9, googleSignInAccount);
            case 26:
                int iP8 = w40.P(parcel);
                int iD10 = 0;
                boolean zA = false;
                boolean zA2 = false;
                IBinder iBinderC = null;
                db dbVar2 = null;
                while (parcel.dataPosition() < iP8) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iD10 = w40.D(parcel, i9);
                    } else if (c6 == 2) {
                        iBinderC = w40.C(parcel, i9);
                    } else if (c6 == 3) {
                        dbVar2 = (db) w40.j(parcel, i9, db.CREATOR);
                    } else if (c6 == 4) {
                        zA = w40.A(parcel, i9);
                    } else if (c6 != 5) {
                        w40.L(parcel, i9);
                    } else {
                        zA2 = w40.A(parcel, i9);
                    }
                }
                w40.p(parcel, iP8);
                return new bb0(iD10, iBinderC, dbVar2, zA, zA2);
            case 27:
                int iP9 = w40.P(parcel);
                while (parcel.dataPosition() < iP9) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        iD = w40.D(parcel, i10);
                    } else if (c7 != 2) {
                        w40.L(parcel, i10);
                    } else {
                        strK = w40.k(parcel, i10);
                    }
                }
                w40.p(parcel, iP9);
                return new Scope(strK, iD);
            case 28:
                int iP10 = w40.P(parcel);
                int iD11 = 0;
                int iD12 = 0;
                int iD13 = 0;
                boolean zA3 = false;
                boolean zA4 = false;
                while (parcel.dataPosition() < iP10) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iD11 = w40.D(parcel, i11);
                    } else if (c8 == 2) {
                        zA3 = w40.A(parcel, i11);
                    } else if (c8 == 3) {
                        zA4 = w40.A(parcel, i11);
                    } else if (c8 == 4) {
                        iD12 = w40.D(parcel, i11);
                    } else if (c8 != 5) {
                        w40.L(parcel, i11);
                    } else {
                        iD13 = w40.D(parcel, i11);
                    }
                }
                w40.p(parcel, iP10);
                return new ay(iD11, iD12, iD13, zA3, zA4);
            default:
                int iP11 = w40.P(parcel);
                int iD14 = 0;
                String strK13 = null;
                while (parcel.dataPosition() < iP11) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        iD = w40.D(parcel, i12);
                    } else if (c9 == 2) {
                        iD14 = w40.D(parcel, i12);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) w40.j(parcel, i12, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        w40.L(parcel, i12);
                    } else {
                        strK13 = w40.k(parcel, i12);
                    }
                }
                w40.p(parcel, iP11);
                return new db(iD, iD14, pendingIntent, strK13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new b2[i];
            case 1:
                return new z5[i];
            case 2:
                return new t7[i];
            case 3:
                return new u7[i];
            case 4:
                return new uj[i];
            case 5:
                return new yj[i];
            case 6:
                return new dk[i];
            case 7:
                return new mq[i];
            case 8:
                return new MediaBrowserCompat$MediaItem[i];
            case 9:
                return new MediaDescriptionCompat[i];
            case 10:
                return new MediaMetadataCompat[i];
            case 11:
                return new MediaSessionCompat$QueueItem[i];
            case 12:
                return new MediaSessionCompat$Token[i];
            case 13:
                return new mt[i];
            case 14:
                return new ParcelImpl[i];
            case 15:
                return new ParcelableVolumeInfo[i];
            case 16:
                return new PlaybackStateCompat[i];
            case 17:
                return new RatingCompat[i];
            case 18:
                return new ux[i];
            case 19:
                return new p30[i];
            case 20:
                return new u90[i];
            case zw0.zzm /* 21 */:
                return new GoogleSignInAccount[i];
            case 22:
                return new ra0[i];
            case 23:
                return new va0[i];
            case 24:
                return new os[i];
            case 25:
                return new ab0[i];
            case 26:
                return new bb0[i];
            case 27:
                return new Scope[i];
            case 28:
                return new ay[i];
            default:
                return new db[i];
        }
    }
}
