package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bh1 implements v11 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ch1 g;

    public /* synthetic */ bh1(ch1 ch1Var, int i) {
        this.f = i;
        this.g = ch1Var;
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        int i = this.f;
        ch1 ch1Var = this.g;
        switch (i) {
            case 0:
                ch1Var.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(ch1Var.a)) {
                        ch1Var.c.execute(new va1(10, this));
                        break;
                    }
                }
                break;
            default:
                ch1Var.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(ch1Var.a)) {
                        ch1Var.c.execute(new va1(11, this));
                        break;
                    }
                }
                break;
        }
    }
}
