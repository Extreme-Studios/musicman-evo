package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ oo0 g;

    public /* synthetic */ ae0(oo0 oo0Var, int i) {
        this.f = i;
        this.g = oo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        oo0 oo0Var = this.g;
        switch (i) {
            case 0:
                oo0Var.d(oo0Var.a);
                return;
            case 1:
                vc3 vc3Var = vc3.C;
                yq0 yq0Var = vc3Var.o;
                Context context = oo0Var.a;
                String str = oo0Var.d;
                String str2 = oo0Var.e;
                yq0Var.getClass();
                ix0 ix0Var = lx0.p5;
                tu0 tu0Var = tu0.e;
                String strJ = yq0.j(context, yq0Var.k(context, (String) tu0Var.c.a(ix0Var), str, str2).toString(), str2);
                if (!TextUtils.isEmpty(strJ)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ.trim());
                        String strOptString = jSONObject.optString("gct");
                        yq0Var.f = jSONObject.optString("status");
                        if (((Boolean) tu0Var.c.a(lx0.X9)).booleanValue()) {
                            boolean z = "0".equals(yq0Var.f) || "2".equals(yq0Var.f);
                            yq0Var.f(z);
                            vc3Var.h.g().f(!z ? "" : str);
                        }
                        synchronized (yq0Var.a) {
                            yq0Var.c = strOptString;
                            break;
                        }
                        if ("2".equals(yq0Var.f)) {
                            jn.F("Creative is not pushed for this device.");
                            yq0Var.i(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(yq0Var.f)) {
                            jn.F("The app is not linked for creative preview.");
                            yq0Var.c(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(yq0Var.f)) {
                                jn.F("Device is linked for in app preview.");
                                yq0Var.i(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e) {
                        jn.V("Fail to get in app preview response json.", e);
                    }
                    break;
                } else {
                    jn.F("Not linked for in app preview.");
                }
                yq0Var.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                yq0 yq0Var2 = vc3.C.o;
                String str3 = oo0Var.d;
                String str4 = oo0Var.e;
                String str5 = oo0Var.f;
                boolean zH = yq0Var2.h();
                Context context2 = oo0Var.a;
                boolean zB = yq0Var2.b(context2, str3, str4);
                synchronized (yq0Var2.a) {
                    yq0Var2.d = zB;
                    break;
                }
                if (!yq0Var2.h()) {
                    yq0Var2.c(context2, str3, str4);
                    return;
                }
                if (!zH && !TextUtils.isEmpty(str5)) {
                    yq0Var2.e(context2, str4, str5, str3);
                }
                jn.F("Device is linked for debug signals.");
                yq0Var2.i(context2, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 3:
                oo0Var.d(oo0Var.a);
                return;
            case 4:
                vc3.C.o.a(oo0Var.a);
                return;
            case 5:
                vc3.C.o.a(oo0Var.a);
                return;
            default:
                oo0Var.g = 4;
                oo0Var.b();
                return;
        }
    }
}
