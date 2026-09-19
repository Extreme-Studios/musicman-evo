package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class x12 implements j22 {
    public final je0 a;
    public final je0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e = false;
    public final boolean f;

    public x12(je0 je0Var, je0 je0Var2, boolean z, boolean z2, boolean z3) {
        this.a = je0Var;
        this.b = je0Var2;
        this.c = z;
        this.d = z2;
        this.f = z3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[DONT_INVERT] */
    @Override // defpackage.j22
    public final void b(Object obj) {
        String str;
        long j;
        String str2;
        long j2;
        Bundle bundle = ((rj1) obj).a;
        if (this.e) {
            return;
        }
        Bundle bundleQ = ej1.q("pii", bundle);
        boolean z = this.f;
        if (!z) {
            if (((Boolean) tu0.e.c.a(lx0.r3)).booleanValue()) {
                je0 je0Var = this.a;
                str2 = (String) je0Var.g;
                j2 = je0Var.f;
                if (str2 != null) {
                    bundleQ.putString("paidv1_id_android", str2);
                    bundleQ.putLong("paidv1_creation_time_android", j2);
                }
            } else if (z) {
                if (((Boolean) tu0.e.c.a(lx0.t3)).booleanValue()) {
                    je0 je0Var2 = this.a;
                    str2 = (String) je0Var2.g;
                    j2 = je0Var2.f;
                    if (str2 != null && j2 > 0) {
                        bundleQ.putString("paidv1_id_android", str2);
                        bundleQ.putLong("paidv1_creation_time_android", j2);
                    }
                }
            }
        } else if (z) {
            if (((Boolean) tu0.e.c.a(lx0.t3)).booleanValue()) {
                je0 je0Var3 = this.a;
                str2 = (String) je0Var3.g;
                j2 = je0Var3.f;
                if (str2 != null) {
                    bundleQ.putString("paidv1_id_android", str2);
                    bundleQ.putLong("paidv1_creation_time_android", j2);
                }
            }
        }
        if (!z) {
            if (((Boolean) tu0.e.c.a(lx0.s3)).booleanValue()) {
                je0 je0Var4 = this.b;
                str = (String) je0Var4.g;
                j = je0Var4.f;
                if (str != null) {
                    bundleQ.putString("paidv2_id_android", str);
                    bundleQ.putLong("paidv2_creation_time_android", j);
                }
                bundleQ.putBoolean("paidv2_pub_option_android", this.c);
                bundleQ.putBoolean("paidv2_user_option_android", this.d);
            } else if (z) {
                if (((Boolean) tu0.e.c.a(lx0.u3)).booleanValue()) {
                    je0 je0Var5 = this.b;
                    str = (String) je0Var5.g;
                    j = je0Var5.f;
                    if (str != null && j > 0) {
                        bundleQ.putString("paidv2_id_android", str);
                        bundleQ.putLong("paidv2_creation_time_android", j);
                    }
                    bundleQ.putBoolean("paidv2_pub_option_android", this.c);
                    bundleQ.putBoolean("paidv2_user_option_android", this.d);
                }
            }
        } else if (z) {
            if (((Boolean) tu0.e.c.a(lx0.u3)).booleanValue()) {
                je0 je0Var6 = this.b;
                str = (String) je0Var6.g;
                j = je0Var6.f;
                if (str != null) {
                    bundleQ.putString("paidv2_id_android", str);
                    bundleQ.putLong("paidv2_creation_time_android", j);
                }
                bundleQ.putBoolean("paidv2_pub_option_android", this.c);
                bundleQ.putBoolean("paidv2_user_option_android", this.d);
            }
        }
        if (bundleQ.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleQ);
    }

    public x12(boolean z) {
        this.f = z;
    }
}
