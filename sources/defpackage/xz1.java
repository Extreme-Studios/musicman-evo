package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class xz1 implements m22 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xz1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.m22
    public final hp a() {
        int i = this.a;
        char c = 1;
        int i2 = 2;
        Object obj = this.b;
        switch (i) {
            case 0:
                return na1.t(new yz1(0, dq.h((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return na1.t(new w12(arrayList, 2));
            case 2:
                return na1.t(new yz1(1, ((i52) obj).q));
            case 3:
                y32 y32Var = (y32) obj;
                String str = null;
                if (y32Var == null) {
                    return na1.t(new f02(str, i2));
                }
                String str2 = y32Var.a;
                int i3 = f20.a;
                return (str2 == null || str2.trim().isEmpty()) ? na1.t(new f02(str, i2)) : na1.t(new f02(str2, i2));
            case 4:
                return na1.t(new m02(c == true ? 1 : 0, (w42) obj));
            case 5:
                return na1.t(new w12((Bundle) obj, 0));
            default:
                return na1.M(na1.K(na1.t(new Bundle()), ((Long) tu0.e.c.a(lx0.D4)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), lh0.q, za1.a);
        }
    }

    @Override // defpackage.m22
    public final int c() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            default:
                return 49;
        }
    }
}
