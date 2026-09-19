package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ci2 extends sx {
    public final Object f;

    public ci2(Object obj) {
        this.f = obj;
    }

    @Override // defpackage.sx
    public final Object b() {
        return this.f;
    }

    @Override // defpackage.sx
    public final sx c(wh2 wh2Var) {
        Object objApply = wh2Var.apply(this.f);
        hn.O(objApply, "the Function passed to Optional.transform() must not return null.");
        return new ci2(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ci2) {
            return this.f.equals(((ci2) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f.toString();
        return ec.n(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }
}
