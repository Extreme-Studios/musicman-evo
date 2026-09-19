package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d00 extends j00 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public d00(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.j00
    public final void a(Matrix matrix, yz yzVar, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((j00) obj).a(this.d, yzVar, i, canvas);
        }
    }
}
