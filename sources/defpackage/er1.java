package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class er1 implements r63 {
    public final /* synthetic */ int a;
    public final yj1 b;

    public /* synthetic */ er1(yj1 yj1Var, int i) {
        this.a = i;
        this.b = yj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.v63
    public final Object c() {
        String strValueOf;
        q91 q91Var;
        int i = this.a;
        yj1 yj1Var = this.b;
        switch (i) {
            case 0:
                return yj1Var.a().p.g == 3 ? dv0.REWARDED_INTERSTITIAL : dv0.REWARD_BASED_VIDEO_AD;
            case 1:
                return yj1Var.a().p.g == 3 ? "rewarded_interstitial" : "rewarded";
            case 2:
                f93 f93Var = yj1Var.a().d;
                if (((Boolean) tu0.e.c.a(lx0.F7)).booleanValue()) {
                    String str = f93Var.C;
                    if (TextUtils.isEmpty(str)) {
                        q91Var = f93Var.x;
                        if (q91Var != null) {
                            strValueOf = new JSONObject(q91Var.f).getString("request_id");
                            if (TextUtils.isEmpty(strValueOf)) {
                                strValueOf = String.valueOf(ut0.f.e.nextInt() & Integer.MAX_VALUE);
                            }
                        } else {
                            strValueOf = String.valueOf(ut0.f.e.nextInt() & Integer.MAX_VALUE);
                        }
                    } else {
                        try {
                            strValueOf = new JSONObject(str).getString("request_id");
                            if (TextUtils.isEmpty(strValueOf)) {
                                q91Var = f93Var.x;
                                if (q91Var != null) {
                                    try {
                                        strValueOf = new JSONObject(q91Var.f).getString("request_id");
                                        if (TextUtils.isEmpty(strValueOf)) {
                                            strValueOf = String.valueOf(ut0.f.e.nextInt() & Integer.MAX_VALUE);
                                        }
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    strValueOf = String.valueOf(ut0.f.e.nextInt() & Integer.MAX_VALUE);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                } else {
                    strValueOf = String.valueOf(ut0.f.e.nextInt() & Integer.MAX_VALUE);
                }
                dq.D(strValueOf);
                return strValueOf;
            case 3:
                return new xz1(2, yj1Var.a());
            default:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new c02(ya1Var, 3, yj1Var.a());
        }
    }
}
