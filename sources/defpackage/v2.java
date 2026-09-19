package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v2 implements dc {
    public final dc a;
    public final float b;

    public v2(float f, dc dcVar) {
        while (dcVar instanceof v2) {
            dcVar = ((v2) dcVar).a;
            f += ((v2) dcVar).b;
        }
        this.a = dcVar;
        this.b = f;
    }

    @Override // defpackage.dc
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.a.equals(v2Var.a) && this.b == v2Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
