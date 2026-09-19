package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa implements yy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yy
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ra raVar = ((c4) obj).o;
                raVar.getClass();
                HashMap map = raVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(raVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) raVar.g.clone());
                return bundle;
            case 1:
                c4 c4Var = (c4) obj;
                while (c4.l(((mj) c4Var.w.g).F)) {
                }
                c4Var.x.d(eo.ON_STOP);
                return new Bundle();
            default:
                return ((xj) obj).Q();
        }
    }
}
