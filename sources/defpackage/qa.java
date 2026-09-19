package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa implements wu {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;

    public /* synthetic */ qa(c4 c4Var, int i) {
        this.a = i;
        this.b = c4Var;
    }

    @Override // defpackage.wu
    public final void a() {
        int i = this.a;
        c4 c4Var = this.b;
        switch (i) {
            case 0:
                Bundle bundleF = ((z61) c4Var.j.h).f("android:support:activity-result");
                if (bundleF != null) {
                    ra raVar = c4Var.o;
                    HashMap map = raVar.b;
                    HashMap map2 = raVar.a;
                    Bundle bundle = raVar.g;
                    ArrayList<Integer> integerArrayList = bundleF.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleF.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        raVar.d = bundleF.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(bundleF.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                            String str = stringArrayList.get(i2);
                            if (map.containsKey(str)) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            map2.put(num2, str2);
                            raVar.b.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                mj mjVar = (mj) c4Var.w.g;
                mjVar.F.b(mjVar, mjVar, null);
                break;
        }
    }
}
