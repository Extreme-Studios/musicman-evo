package defpackage;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a32 implements m22 {
    public final JSONObject a;

    public a32(Context context) {
        this.a = kd0.i(context, d60.a());
    }

    @Override // defpackage.m22
    public final hp a() {
        return ((Boolean) tu0.e.c.a(lx0.Kc)).booleanValue() ? na1.t(z22.a) : na1.t(new m02(3, this));
    }

    @Override // defpackage.m22
    public final int c() {
        return 46;
    }
}
