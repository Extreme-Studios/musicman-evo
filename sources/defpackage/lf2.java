package defpackage;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lf2 extends pf2 {
    public final /* synthetic */ int f = 1;
    public final Object g;

    public lf2(hp0 hp0Var, cf2 cf2Var, Map map, dh2 dh2Var) {
        super("xLMBD0ZYDeFbDZVCzCownSP8NNmORP0EKF5jeEnOGlb2W22XICiCfQYSI28gi51p", "CL6HTaJ4+bHVCQXLR1XCftwOp39gWYfgPib+AnvHUWA=", hp0Var, cf2Var, dh2Var.a(118));
        this.g = map;
    }

    @Override // defpackage.pf2
    public final void a(Method method, hp0 hp0Var) {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", ((vc2) this.g).D());
                objArr.getClass();
                synchronized (hp0Var) {
                    String str = (String) objArr[0];
                    hp0Var.b();
                    ((sp0) hp0Var.g).E0(str);
                    String str2 = (String) objArr[1];
                    hp0Var.b();
                    ((sp0) hp0Var.g).k0(str2);
                    break;
                }
                return;
            default:
                Map map = (Map) this.g;
                Object[] objArr2 = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr2.getClass();
                synchronized (hp0Var) {
                    long jLongValue = ((Long) objArr2[0]).longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).I0(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    if (jLongValue2 >= 0) {
                        hp0Var.b();
                        ((sp0) hp0Var.g).g0(jLongValue2);
                    }
                    long jLongValue3 = ((Long) objArr2[2]).longValue();
                    if (jLongValue3 >= 0) {
                        hp0Var.b();
                        ((sp0) hp0Var.g).h0(jLongValue3);
                    }
                    break;
                }
                return;
        }
    }

    public lf2(hp0 hp0Var, cf2 cf2Var, vc2 vc2Var, dh2 dh2Var) {
        super("By5K9EmVfikEcCFMOZQd1jxZLLuKkdFWcNBLbmtQ/cGwaIFZzYRhON9QKnCD3h+X", "jO4sZLvDsqH0XT1pMychedS7fP8lDaqZlRwqYI2S90Y=", hp0Var, cf2Var, dh2Var.a(116));
        this.g = vc2Var;
    }
}
