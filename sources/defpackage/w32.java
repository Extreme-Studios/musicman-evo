package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w32 implements i42, gm1, ke1, ii2, hp1, zb {
    public final /* synthetic */ int f;
    public Object g;

    public w32(int i) {
        this.f = i;
        switch (i) {
            case 12:
                this.g = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        return new zf3((Context) this.g);
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f) {
            case 1:
                p62 p62Var = (p62) this.g;
                ((v62) obj).s(p62Var.g);
                break;
            case 8:
                ((ds0) obj).E((i61) this.g);
                break;
            default:
                ((r93) obj).p();
                break;
        }
    }

    @Override // defpackage.zb
    public Object c(ve3 ve3Var) {
        fe3 fe3Var = (fe3) this.g;
        if (!ve3Var.c() && !ve3Var.d) {
            Exception excA = ve3Var.a();
            if (excA instanceof v3) {
                int i = ((v3) excA).f.f;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    return ((p83) fe3Var.g).e();
                }
                if (i == 43000) {
                    Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    ve3 ve3Var2 = new ve3();
                    ve3Var2.d(exc);
                    return ve3Var2;
                }
                if (i == 15) {
                    Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
                    ve3 ve3Var3 = new ve3();
                    ve3Var3.d(exc2);
                    return ve3Var3;
                }
            }
        }
        return ve3Var;
    }

    public JSONObject d(View view) {
        int currentModeType;
        JSONObject jSONObjectA = v92.a(0, 0, 0, 0);
        UiModeManager uiModeManager = yd.q;
        int i = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : jn.E;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i2 == 0);
            return jSONObjectA;
        } catch (JSONException e) {
            hn.u("Error with setting output device status", e);
            return jSONObjectA;
        }
    }

    public hp e(vg2 vg2Var, h42 h42Var, tj1 tj1Var) {
        mf1 mf1VarG = h42Var.g((g42) vg2Var.h);
        k42 k42Var = new k42();
        switch (mf1VarG.a) {
            case 0:
                mf1VarG.c = k42Var;
                break;
            default:
                mf1VarG.c = k42Var;
                break;
        }
        tj1 tj1Var2 = (tj1) mf1VarG.c();
        this.g = tj1Var2;
        vi1 vi1VarA = tj1Var2.a();
        d62 d62Var = new d62();
        fn2 fn2VarR = fn2.r(vi1VarA.b());
        yy0 yy0Var = new yy0(d62Var, 13, vi1VarA);
        cn2 cn2Var = cn2.f;
        return na1.M(na1.L(fn2VarR, yy0Var, cn2Var), new zl0(8, d62Var), cn2Var);
    }

    @Override // defpackage.i42
    public /* bridge */ /* synthetic */ hp f(vg2 vg2Var, h42 h42Var) {
        return e(vg2Var, h42Var, null);
    }

    @Override // defpackage.i42
    public /* synthetic */ Object l() {
        return (tj1) this.g;
    }

    @Override // defpackage.ke1
    public /* synthetic */ void q(String str, int i, String str2, boolean z) {
        md1 md1Var = ((nf0) this.g).i;
        if (md1Var != null) {
            md1Var.M();
        }
    }

    public w32(Matcher matcher) {
        this.f = 5;
        matcher.getClass();
        this.g = matcher;
    }

    public /* synthetic */ w32(q93 q93Var, Object obj, long j) {
        this.f = 9;
        this.g = obj;
    }

    public /* synthetic */ w32(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
