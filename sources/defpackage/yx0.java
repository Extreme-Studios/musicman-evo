package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yx0 extends dd {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final List b = Arrays.asList(((String) tu0.e.c.a(lx0.Ia)).split(","));
    public final ay0 c;
    public final dd d;
    public final hs1 e;

    public yx0(ay0 ay0Var, dd ddVar, hs1 hs1Var) {
        this.d = ddVar;
        this.c = ay0Var;
        this.e = hs1Var;
    }

    @Override // defpackage.dd
    public final void a(String str, Bundle bundle) {
        dd ddVar = this.d;
        if (ddVar != null) {
            ddVar.a(str, bundle);
        }
    }

    @Override // defpackage.dd
    public final Bundle b(String str, Bundle bundle) {
        dd ddVar = this.d;
        if (ddVar != null) {
            return ddVar.b(str, bundle);
        }
        return null;
    }

    @Override // defpackage.dd
    public final void c(int i, int i2, Bundle bundle) {
        dd ddVar = this.d;
        if (ddVar != null) {
            ddVar.c(i, i2, bundle);
        }
    }

    @Override // defpackage.dd
    public final void d(Bundle bundle) {
        this.a.set(false);
        dd ddVar = this.d;
        if (ddVar != null) {
            ddVar.d(bundle);
        }
    }

    @Override // defpackage.dd
    public final void e(int i, Bundle bundle) {
        this.a.set(false);
        dd ddVar = this.d;
        if (ddVar != null) {
            ddVar.e(i, bundle);
        }
        vc3 vc3Var = vc3.C;
        vc3Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ay0 ay0Var = this.c;
        ay0Var.j = jCurrentTimeMillis;
        List list = this.b;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        vc3Var.k.getClass();
        ay0Var.i = SystemClock.elapsedRealtime() + ((long) ((Integer) tu0.e.c.a(lx0.Fa)).intValue());
        if (ay0Var.e == null) {
            ay0Var.e = new q7(28, ay0Var);
        }
        ay0Var.d();
        jn.I(this.e, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // defpackage.dd
    public final void f(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.a.set(true);
                jn.I(this.e, "pact_action", new Pair("pe", "pact_con"));
                this.c.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            jn.w("Message is not in JSON format: ", e);
        }
        dd ddVar = this.d;
        if (ddVar != null) {
            ddVar.f(str, bundle);
        }
    }

    @Override // defpackage.dd
    public final void g(int i, Uri uri, boolean z, Bundle bundle) {
        dd ddVar = this.d;
        if (ddVar != null) {
            ddVar.g(i, uri, z, bundle);
        }
    }
}
