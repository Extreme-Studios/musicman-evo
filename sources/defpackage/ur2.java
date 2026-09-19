package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ur2 extends ho2 {
    public final String a;
    public final yw2 b;

    public ur2(String str, yw2 yw2Var) {
        this.a = str;
        this.b = yw2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.b != yw2.RAW;
    }

    public final String toString() {
        String str;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return "(typeUrl=" + this.a + ", outputPrefixType=" + str + ")";
    }
}
