package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mz0 extends vz0 {
    public static final int n;
    public static final int o;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        n = Color.rgb(204, 204, 204);
        o = iRgb;
    }

    public mz0(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.f = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            oz0 oz0Var = (oz0) list.get(i3);
            this.g.add(oz0Var);
            this.h.add(oz0Var);
        }
        this.i = num != null ? num.intValue() : n;
        this.j = num2 != null ? num2.intValue() : o;
        this.k = num3 != null ? num3.intValue() : 12;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.wz0
    public final String c() {
        return this.f;
    }

    @Override // defpackage.wz0
    public final ArrayList h() {
        return this.h;
    }
}
