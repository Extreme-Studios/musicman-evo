package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a2;
import defpackage.yq;
import defpackage.zq;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a2(9);
    public final String f;
    public final CharSequence g;
    public final CharSequence h;
    public final CharSequence i;
    public final Bitmap j;
    public final Uri k;
    public final Bundle l;
    public final Uri m;
    public MediaDescription n;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f = str;
        this.g = charSequence;
        this.h = charSequence2;
        this.i = charSequence3;
        this.j = bitmap;
        this.k = uri;
        this.l = bundle;
        this.m = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.g) + ", " + ((Object) this.h) + ", " + ((Object) this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionA = this.n;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = yq.b();
            yq.n(builderB, this.f);
            yq.p(builderB, this.g);
            yq.o(builderB, this.h);
            yq.j(builderB, this.i);
            yq.l(builderB, this.j);
            yq.m(builderB, this.k);
            yq.k(builderB, this.l);
            zq.b(builderB, this.m);
            mediaDescriptionA = yq.a(builderB);
            this.n = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i);
    }
}
