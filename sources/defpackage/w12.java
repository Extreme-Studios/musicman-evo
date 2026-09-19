package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w12 implements j22 {
    public final /* synthetic */ int a;
    public final Cloneable b;

    public /* synthetic */ w12(Cloneable cloneable, int i) {
        this.a = i;
        this.b = cloneable;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = this.a;
        Cloneable cloneable = this.b;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) cloneable;
                rj1 rj1Var = (rj1) obj;
                if (bundle != null) {
                    rj1Var.a.putAll(bundle);
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) cloneable;
                rj1 rj1Var2 = (rj1) obj;
                if (!bundle2.isEmpty()) {
                    rj1Var2.a.putBundle("shared_pref", bundle2);
                }
                break;
            default:
                ((rj1) obj).a.putStringArrayList("ad_types", (ArrayList) cloneable);
                break;
        }
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        int i = this.a;
        Cloneable cloneable = this.b;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) cloneable;
                rj1 rj1Var = (rj1) obj;
                if (bundle != null) {
                    rj1Var.b.putAll(bundle);
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) cloneable;
                rj1 rj1Var2 = (rj1) obj;
                if (!bundle2.isEmpty()) {
                    rj1Var2.b.putBundle("shared_pref", bundle2);
                }
                break;
            default:
                ((rj1) obj).b.putStringArrayList("ad_types", (ArrayList) cloneable);
                break;
        }
    }
}
