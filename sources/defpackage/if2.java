package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class if2 extends pf2 {
    public final Map f;
    public final Context g;
    public final dd2 h;
    public final long i;
    public final long j;

    public if2(hp0 hp0Var, cf2 cf2Var, Map map, Context context, dd2 dd2Var, vc2 vc2Var, dh2 dh2Var) {
        super("zRITP136LTX4rFLknKK5s+BdzyKXJ24gjaP1ECV594x04Hyj3q+IVU95/J2vSCm1", "E6K+C1ogZN29OFWU2j1wUPRhMI7Lv3qBcqHzi1vCWW4=", hp0Var, cf2Var, dh2Var.a(113));
        this.g = context;
        this.f = map;
        this.h = dd2Var;
        this.i = vc2Var.K();
        this.j = vc2Var.L();
    }

    @Override // defpackage.pf2
    public final void a(Method method, hp0 hp0Var) {
        sp0 sp0Var;
        Object[] objArr = (Object[]) method.invoke("", this.g, Integer.valueOf(this.h.ordinal()));
        objArr.getClass();
        String strU0 = "E";
        int i = 1;
        try {
            hp hpVar = (hp) this.f.get("gs");
            if (hpVar != null && ((Build.VERSION.SDK_INT < 31 || hpVar.isDone()) && (sp0Var = (sp0) hpVar.get(this.i, TimeUnit.MILLISECONDS)) != null && sp0Var.u0().length() > 1)) {
                strU0 = sp0Var.u0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strU0.equals("E")) {
            try {
                hp hpVar2 = (hp) this.f.get("ai");
                if (hpVar2 != null) {
                    String str = (String) hpVar2.get(this.j, TimeUnit.MILLISECONDS);
                    if (!yd.v(str)) {
                        strU0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (hp0Var) {
            try {
                long jLongValue = ((Long) objArr[0]).longValue();
                hp0Var.b();
                ((sp0) hp0Var.g).E(jLongValue);
                String str2 = (String) objArr[1];
                hp0Var.b();
                ((sp0) hp0Var.g).D(str2);
                String str3 = (String) objArr[2];
                hp0Var.b();
                ((sp0) hp0Var.g).N(str3);
                String str4 = (String) objArr[3];
                hp0Var.b();
                ((sp0) hp0Var.g).O(str4);
                il2 il2VarF = il2.f.f();
                byte[] bArr = (byte[]) objArr[4];
                String strG = il2VarF.g(bArr.length, bArr);
                hp0Var.b();
                ((sp0) hp0Var.g).z(strG);
                hp0Var.b();
                ((sp0) hp0Var.g).R0(strU0);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    hp0Var.b();
                    ((sp0) hp0Var.g).s0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
