package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class e00 extends j00 {
    public final g00 c;

    public e00(g00 g00Var) {
        this.c = g00Var;
    }

    @Override // defpackage.j00
    public final void a(Matrix matrix, yz yzVar, int i, Canvas canvas) {
        g00 g00Var = this.c;
        float f = g00Var.f;
        float f2 = g00Var.g;
        RectF rectF = new RectF(g00Var.b, g00Var.c, g00Var.d, g00Var.e);
        Paint paint = yzVar.b;
        boolean z = f2 < 0.0f;
        Path path = yzVar.g;
        int[] iArr = yz.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = yzVar.f;
            iArr[2] = yzVar.e;
            iArr[3] = yzVar.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = yzVar.d;
            iArr[2] = yzVar.e;
            iArr[3] = yzVar.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = yz.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, yzVar.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
