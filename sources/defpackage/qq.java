package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class qq extends ej1 {
    public final int p;

    public qq(int i) {
        this.p = i;
    }

    @Override // defpackage.ej1
    public final float j(Object obj) {
        float[] fArr = ((rq) obj).G;
        if (fArr != null) {
            return fArr[this.p];
        }
        return 0.0f;
    }

    @Override // defpackage.ej1
    public final void n(rq rqVar, float f) {
        float fA;
        float[] fArr = rqVar.G;
        if (fArr != null) {
            int i = this.p;
            if (fArr[i] != f) {
                fArr[i] = f;
                an anVar = rqVar.I;
                if (anVar != null) {
                    c00 c00Var = rqVar.x;
                    if (fArr != null) {
                        fA = (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
                    } else {
                        RectF rectFE = rqVar.e();
                        a00 a00Var = rqVar.g.a;
                        c00Var.getClass();
                        fA = (((rqVar.g.a.h.a(rectFE) + a00Var.e.a(rectFE)) - rqVar.g.a.g.a(rectFE)) - rqVar.g.a.f.a(rectFE)) / 2.0f;
                    }
                    jq jqVar = (jq) anVar.a;
                    int i2 = (int) (fA * 0.11f);
                    if (jqVar.A != i2) {
                        jqVar.A = i2;
                        jqVar.h();
                        jqVar.invalidate();
                    }
                }
                rqVar.invalidateSelf();
            }
        }
    }
}
