package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a2;
import defpackage.f0;
import defpackage.j7;
import defpackage.s90;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends f0 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a2(21);
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Uri k;
    public String l;
    public final long m;
    public final String n;
    public final List o;
    public final String p;
    public final String q;
    public final HashSet r = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f = i;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = uri;
        this.l = str5;
        this.m = j;
        this.n = str6;
        this.o = arrayList;
        this.p = str7;
        this.q = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i), 1));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            j7.p("Given String is empty or null");
            return null;
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.n.equals(this.n)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.o);
        hashSet.addAll(googleSignInAccount.r);
        HashSet hashSet2 = new HashSet(this.o);
        hashSet2.addAll(this.r);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = (this.n.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.o);
        hashSet.addAll(this.r);
        return hashSet.hashCode() + iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.q(parcel, 2, this.g);
        s90.q(parcel, 3, this.h);
        s90.q(parcel, 4, this.i);
        s90.q(parcel, 5, this.j);
        s90.p(parcel, 6, this.k, i);
        s90.q(parcel, 7, this.l);
        s90.P(parcel, 8, 8);
        parcel.writeLong(this.m);
        s90.q(parcel, 9, this.n);
        s90.u(parcel, 10, this.o);
        s90.q(parcel, 11, this.p);
        s90.q(parcel, 12, this.q);
        s90.J(parcel, iW);
    }
}
