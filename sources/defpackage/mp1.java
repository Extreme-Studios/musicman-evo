package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class mp1 {
    public final jr1 a;
    public final uq1 b;
    public lp1 c = null;

    public mp1(jr1 jr1Var, uq1 uq1Var) {
        this.a = jr1Var;
        this.b = uq1Var;
    }

    public static final int b(int i, Context context, String str) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        f32 f32Var = ut0.f.a;
        return f32.b(context, i);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        md1 md1VarA = this.a.a(kb3.a(), null, null);
        md1VarA.p0().setVisibility(4);
        md1VarA.p0().setContentDescription("policy_validator");
        md1VarA.t0("/sendMessageToSdk", new i11(9, this));
        md1VarA.t0("/hideValidatorOverlay", new kp1(this, windowManager, frameLayout));
        md1VarA.t0("/open", new f21(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(md1VarA);
        kp1 kp1Var = new kp1(this, frameLayout, windowManager);
        uq1 uq1Var = this.b;
        uq1Var.b("/loadNativeAdPolicyViolations", new ao1(uq1Var, weakReference, "/loadNativeAdPolicyViolations", kp1Var));
        uq1Var.b("/showValidatorOverlay", new ao1(uq1Var, new WeakReference(md1VarA), "/showValidatorOverlay", m11.l));
        return md1VarA.p0();
    }
}
