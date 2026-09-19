package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mg1 implements fg1 {
    @Override // defpackage.fg1
    public final void a(HashMap map) {
        if (!((Boolean) tu0.e.c.a(lx0.ib)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vc3.C.h.g().t(Boolean.parseBoolean(str));
    }
}
