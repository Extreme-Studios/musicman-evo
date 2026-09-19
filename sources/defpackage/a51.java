package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class a51 implements dr {
    public final /* synthetic */ int f;
    public final /* synthetic */ q41 g;
    public final /* synthetic */ b51 h;

    public /* synthetic */ a51(b51 b51Var, q41 q41Var, int i) {
        this.f = i;
        this.g = q41Var;
        this.h = b51Var;
    }

    @Override // defpackage.dr
    public final void A(g2 g2Var) {
        int i = this.f;
        q41 q41Var = this.g;
        b51 b51Var = this.h;
        switch (i) {
            case 0:
                try {
                    String canonicalName = b51Var.f.getClass().getCanonicalName();
                    int i2 = g2Var.g;
                    String str = (String) g2Var.h;
                    String str2 = (String) g2Var.i;
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i2).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb.append(canonicalName);
                    sb.append("failed to loaded mediation ad: ErrorCode = ");
                    sb.append(i2);
                    sb.append(". ErrorMessage = ");
                    sb.append(str);
                    sb.append(". ErrorDomain = ");
                    sb.append(str2);
                    jn.F(sb.toString());
                    q41Var.M0(g2Var.d());
                    q41Var.x0(str, i2);
                    q41Var.m0(i2);
                } catch (RemoteException e) {
                    jn.P("", e);
                    return;
                }
                break;
            default:
                try {
                    String canonicalName2 = b51Var.f.getClass().getCanonicalName();
                    int i3 = g2Var.g;
                    String str3 = (String) g2Var.h;
                    String str4 = (String) g2Var.i;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i3).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i3);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str3);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str4);
                    jn.F(sb2.toString());
                    q41Var.M0(g2Var.d());
                    q41Var.x0(str3, i3);
                    q41Var.m0(i3);
                } catch (RemoteException e2) {
                    jn.P("", e2);
                }
                break;
        }
    }
}
