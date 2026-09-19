package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl0 implements wh2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hl0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wh2
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ep0 ep0Var = (ep0) obj3;
                String str = (String) obj;
                ArrayList arrayList = new ArrayList();
                for (Uri uri : (List) obj2) {
                    if (!ep0.F3(uri, ep0Var.E, ep0Var.F) || TextUtils.isEmpty(str)) {
                        arrayList.add(uri);
                    } else {
                        arrayList.add(ep0.I3(uri, "nas", str));
                    }
                }
                return arrayList;
            case 1:
                u31 u31Var = (u31) obj;
                u31Var.h((String) obj3, (v11) obj2);
                return u31Var;
            default:
                aq1 aq1Var = (aq1) obj3;
                JSONObject jSONObject = (JSONObject) obj2;
                List list = (List) obj;
                aq1Var.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject.optString("text");
                Integer numC = aq1.c("bg_color", jSONObject);
                Integer numC2 = aq1.c("text_color", jSONObject);
                int iOptInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
                return new mz0(strOptString, list, numC, numC2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, aq1Var.h.j);
        }
    }
}
