package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by0 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r71 b;

    public /* synthetic */ by0(r71 r71Var, int i) {
        this.a = i;
        this.b = r71Var;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) {
        int i = this.a;
        r71 r71Var = this.b;
        switch (i) {
            case 0:
                ev1 ev1Var = (ev1) obj;
                j01 j01Var = new j01(new JsonReader(new InputStreamReader(ev1Var.a)), ev1Var.b);
                try {
                    j01Var.b = ut0.f.a.k(r71Var.f).toString();
                    break;
                } catch (JSONException unused) {
                    j01Var.b = "{}";
                }
                Bundle bundle = r71Var.s;
                if (!bundle.isEmpty()) {
                    try {
                        j01Var.c = ut0.f.a.k(bundle).toString();
                        break;
                    } catch (JSONException unused2) {
                    }
                }
                return na1.t(j01Var);
            case 1:
                return na1.t(new ev1((InputStream) obj, r71Var));
            case 2:
                return na1.t(new ev1((InputStream) obj, r71Var));
            default:
                r71Var.o = new String(ll2.a((InputStream) obj), StandardCharsets.UTF_8);
                return na1.t(r71Var);
        }
    }
}
