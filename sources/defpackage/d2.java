package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends a23 {
    public final /* synthetic */ int J;

    public /* synthetic */ d2(int i) {
        this.J = i;
    }

    @Override // defpackage.a23
    public final Object j(Intent intent, int i) {
        switch (this.J) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new lv(it.next(), it2.next()));
                        }
                        return dq.q(arrayList3);
                    }
                }
                return mh.f;
            case 1:
                return new b2(intent, i);
            default:
                return new b2(intent, i);
        }
    }
}
