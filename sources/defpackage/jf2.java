package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class jf2 extends pf2 {
    public final /* synthetic */ int f;
    public final Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf2(hp0 hp0Var, cf2 cf2Var, Context context, dh2 dh2Var, int i) {
        super("BhNDAdNbKVCXLou3UwS6SQycA6O/T9ZMbr2NWffNFtsRs3WScUuYHsaYRJ0jHvCA", "oaC5CLMjwUmi/i48MFPdrATPzdM8HcSPBi81Io4IqyU=", hp0Var, cf2Var, dh2Var.a(115));
        this.f = i;
        switch (i) {
            case 1:
                super("fPyGoeDuTUuDJV03GsNFpCGRO2J3Ui8HA6QvnuqOeQaxvLcgOY5Y2sf90BXpAioC", "znAIQ1vWTnsSA3nf0QmMCBs/bj4g6mmUyXonbfu9VUs=", hp0Var, cf2Var, dh2Var.a(119));
                this.g = context;
                break;
            default:
                this.g = context;
                break;
        }
    }

    @Override // defpackage.pf2
    public final void a(Method method, hp0 hp0Var) {
        int i = 1;
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", this.g);
                objArr.getClass();
                synchronized (hp0Var) {
                    try {
                        long jIntValue = ((Integer) objArr[0]).intValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).X(jIntValue);
                        long jIntValue2 = ((Integer) objArr[1]).intValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).G0(jIntValue2);
                        long jIntValue3 = ((Integer) objArr[2]).intValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).H0(jIntValue3);
                        long jIntValue4 = ((Integer) objArr[3]).intValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).l0(jIntValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            hp0Var.b();
                            ((sp0) hp0Var.g).p0(3);
                        } else {
                            int i2 = true != bool.booleanValue() ? 1 : 2;
                            hp0Var.b();
                            ((sp0) hp0Var.g).p0(i2);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            hp0Var.f(3);
                        } else {
                            if (true == bool2.booleanValue()) {
                                i = 2;
                            }
                            hp0Var.f(i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", this.g);
                objArr2.getClass();
                synchronized (hp0Var) {
                    long jLongValue = ((Long) objArr2[0]).longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).F0(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).Y(jLongValue2);
                    break;
                }
                return;
        }
    }
}
