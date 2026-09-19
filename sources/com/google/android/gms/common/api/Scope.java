package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a2;
import defpackage.f0;
import defpackage.j7;
import defpackage.s90;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends f0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a2(27);
    public final int f;
    public final String g;

    public Scope(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            j7.p("scopeUri must not be null or empty");
            throw null;
        }
        this.f = i;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.g.equals(((Scope) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.q(parcel, 2, this.g);
        s90.J(parcel, iW);
    }
}
