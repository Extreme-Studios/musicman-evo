package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wr2 extends ho2 {
    public final us2 a;

    public wr2(us2 us2Var) {
        this.a = us2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return ((gw2) this.a.h).B() != yw2.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wr2)) {
            return false;
        }
        us2 us2Var = ((wr2) obj).a;
        gw2 gw2Var = (gw2) this.a.h;
        yw2 yw2VarB = gw2Var.B();
        gw2 gw2Var2 = (gw2) us2Var.h;
        return yw2VarB.equals(gw2Var2.B()) && gw2Var.z().equals(gw2Var2.z()) && gw2Var.A().equals(gw2Var2.A());
    }

    public final int hashCode() {
        us2 us2Var = this.a;
        return Objects.hash((gw2) us2Var.h, (j03) us2Var.g);
    }

    public final String toString() {
        String str;
        gw2 gw2Var = (gw2) this.a.h;
        String strZ = gw2Var.z();
        int iOrdinal = gw2Var.B().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return "(typeUrl=" + strZ + ", outputPrefixType=" + str + ")";
    }
}
