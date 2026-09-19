package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wu0 extends f0 {
    public static final Parcelable.Creator<wu0> CREATOR = new os0(6);
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final Bundle k;
    public final boolean l;
    public long m;
    public String n;
    public int o;

    public wu0(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.f = str;
        this.g = j;
        this.h = str2 == null ? "" : str2;
        this.i = str3 == null ? "" : str3;
        this.j = str4 == null ? "" : str4;
        this.k = bundle == null ? new Bundle() : bundle;
        this.l = z;
        this.m = j2;
        this.n = str5;
        this.o = i;
    }

    public static wu0 a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                jn.T(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new wu0(queryParameter, j, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            jn.V("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            jn.V("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 2, this.f);
        s90.P(parcel, 3, 8);
        parcel.writeLong(this.g);
        s90.q(parcel, 4, this.h);
        s90.q(parcel, 5, this.i);
        s90.q(parcel, 6, this.j);
        s90.m(parcel, 7, this.k);
        s90.P(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        long j = this.m;
        s90.P(parcel, 9, 8);
        parcel.writeLong(j);
        s90.q(parcel, 10, this.n);
        int i2 = this.o;
        s90.P(parcel, 11, 4);
        parcel.writeInt(i2);
        s90.J(parcel, iW);
    }
}
