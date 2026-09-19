package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lg0 implements il0 {
    public final float a;
    public final int b;

    public lg0(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lg0.class == obj.getClass()) {
            lg0 lg0Var = (lg0) obj;
            if (this.a == lg0Var.a && this.b == lg0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.a) + 527) * 31) + this.b;
    }

    public final String toString() {
        float f = this.a;
        int length = String.valueOf(f).length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }
}
