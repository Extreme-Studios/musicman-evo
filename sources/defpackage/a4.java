package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a4 implements yy {
    public final /* synthetic */ int a;
    public final Object b;

    public a4(z61 z61Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        z61Var.y("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.yy
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((c4) obj).k().getClass();
                return bundle;
            default:
                Bundle bundleD = ss0.d((lv[]) Arrays.copyOf(new lv[0], 0));
                List listJ = x9.J((LinkedHashSet) obj);
                bundleD.putStringArrayList("classes_to_restore", listJ instanceof ArrayList ? (ArrayList) listJ : new ArrayList<>(listJ));
                return bundleD;
        }
    }

    public a4(c4 c4Var) {
        this.a = 0;
        this.b = c4Var;
    }
}
