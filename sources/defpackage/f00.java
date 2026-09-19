package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class f00 extends j00 {
    public final h00 c;
    public final float d;
    public final float e;

    public f00(h00 h00Var, float f, float f2) {
        this.c = h00Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.j00
    public final void a(Matrix matrix, yz yzVar, int i, Canvas canvas) {
        h00 h00Var = this.c;
        float f = h00Var.c;
        float f2 = this.e;
        float f3 = h00Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        yzVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = yzVar.f;
        int[] iArr = yz.i;
        iArr[0] = i2;
        iArr[1] = yzVar.e;
        iArr[2] = yzVar.d;
        Paint paint = yzVar.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, yz.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        h00 h00Var = this.c;
        return (float) Math.toDegrees(Math.atan((h00Var.c - this.e) / (h00Var.b - this.d)));
    }
}
