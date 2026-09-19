package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class j10 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final Uri f;
    public final Uri g;

    public j10(long j, String str, String str2, String str3, long j2, Uri uri, Uri uri2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = uri;
        this.g = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j10)) {
            return false;
        }
        j10 j10Var = (j10) obj;
        return this.a == j10Var.a && this.b.equals(j10Var.b) && this.c.equals(j10Var.c) && this.d.equals(j10Var.d) && this.e == j10Var.e && this.f.equals(j10Var.f) && this.g.equals(j10Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((Long.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Song(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        ec.x(sb, ", artist=", this.c, ", album=", this.d);
        ec.w(sb, ", duration=", this.e, ", uri=");
        sb.append(this.f);
        sb.append(", albumArtUri=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
