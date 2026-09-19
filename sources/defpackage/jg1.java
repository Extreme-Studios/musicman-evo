package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jg1 implements fg1 {
    public final /* synthetic */ int a;
    public final qt1 b;

    public /* synthetic */ jg1(qt1 qt1Var, int i) {
        this.a = i;
        this.b = qt1Var;
    }

    @Override // defpackage.fg1
    public final void a(HashMap map) {
        int i = this.a;
        qt1 qt1Var = this.b;
        switch (i) {
            case 0:
                String str = (String) map.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int iHashCode = str.hashCode();
                    if (iHashCode == 97520651) {
                        if (str.equals("flick")) {
                            qt1Var.h(nt1.h, true);
                        }
                    } else if (iHashCode == 109399814 && str.equals("shake")) {
                        qt1Var.h(nt1.g, true);
                    }
                    qt1Var.h(nt1.f, true);
                    break;
                }
                break;
            default:
                String str2 = (String) map.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    qt1Var.b(str2.equals("true"));
                    break;
                }
                break;
        }
    }
}
