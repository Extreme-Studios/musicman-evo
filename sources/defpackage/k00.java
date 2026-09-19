package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k00 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public k00() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        g00 g00Var = new g00(f4, f5, f4, f5);
        g00Var.f = this.d;
        g00Var.g = f3;
        this.g.add(new e00(g00Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((i00) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        h00 h00Var = new h00();
        h00Var.b = f;
        h00Var.c = f2;
        this.f.add(h00Var);
        f00 f00Var = new f00(h00Var, this.b, this.c);
        float fB = f00Var.b() + 270.0f;
        float fB2 = f00Var.b() + 270.0f;
        a(fB);
        this.g.add(f00Var);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
