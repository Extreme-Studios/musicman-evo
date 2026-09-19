package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cu1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cu1.class == obj.getClass()) {
            if (Float.compare(0.0f, 0.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
