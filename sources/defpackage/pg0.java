package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pg0 implements Comparable {
    public final long f;
    public final long g;

    public pg0(long j, long j2) {
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f, ((pg0) obj).f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg0)) {
            return false;
        }
        pg0 pg0Var = (pg0) obj;
        return this.f == pg0Var.f && this.g == pg0Var.g;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f), Long.valueOf(this.g));
    }
}
