package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rs2 {
    public final HashMap a;
    public final HashMap b;

    public /* synthetic */ rs2(un1 un1Var) {
        this.a = new HashMap((HashMap) un1Var.g);
        this.b = new HashMap((HashMap) un1Var.h);
    }

    public final Object a(a23 a23Var, Class cls) throws GeneralSecurityException {
        qs2 qs2Var = new qs2(a23Var.getClass(), cls);
        HashMap map = this.a;
        if (map.containsKey(qs2Var)) {
            return ((os2) map.get(qs2Var)).c.b(a23Var);
        }
        String string = qs2Var.toString();
        throw new GeneralSecurityException(ec.n(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object b(r52 r52Var, xr2 xr2Var, Class cls) throws GeneralSecurityException {
        HashMap map = this.b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        ss2 ss2Var = (ss2) map.get(cls);
        return ss2Var.b(r52Var, xr2Var, new vg2(this, 24, ss2Var));
    }
}
