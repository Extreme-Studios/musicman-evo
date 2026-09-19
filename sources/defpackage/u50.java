package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class u50 extends t50 {
    public mv[] a;
    public String b;
    public int c;

    public u50(u50 u50Var) {
        this.a = null;
        this.c = 0;
        this.b = u50Var.b;
        mv[] mvVarArr = u50Var.a;
        mv[] mvVarArr2 = new mv[mvVarArr.length];
        for (int i = 0; i < mvVarArr.length; i++) {
            mvVarArr2[i] = new mv(mvVarArr[i]);
        }
        this.a = mvVarArr2;
    }

    public mv[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(mv[] mvVarArr) {
        mv[] mvVarArr2 = this.a;
        if (mvVarArr2 != null && mvVarArr != null && mvVarArr2.length == mvVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= mvVarArr2.length) {
                    mv[] mvVarArr3 = this.a;
                    for (int i2 = 0; i2 < mvVarArr.length; i2++) {
                        mvVarArr3[i2].a = mvVarArr[i2].a;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = mvVarArr[i2].b;
                            if (i3 < fArr.length) {
                                mvVarArr3[i2].b[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                mv mvVar = mvVarArr2[i];
                char c = mvVar.a;
                mv mvVar2 = mvVarArr[i];
                if (c != mvVar2.a || mvVar.b.length != mvVar2.b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        mv[] mvVarArr4 = new mv[mvVarArr.length];
        for (int i4 = 0; i4 < mvVarArr.length; i4++) {
            mvVarArr4[i4] = new mv(mvVarArr[i4]);
        }
        this.a = mvVarArr4;
    }

    public u50() {
        this.a = null;
        this.c = 0;
    }
}
