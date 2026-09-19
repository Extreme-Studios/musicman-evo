package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class kp2 implements ah, gm1 {
    public static final kp2 h;
    public static final kp2 i;
    public static final kp2 j;
    public static final kp2 k;
    public static final kp2 l;
    public static final kp2 m;
    public final /* synthetic */ int f;
    public final String g;

    static {
        int i2 = 0;
        h = new kp2("TINK", i2);
        i = new kp2("CRUNCHY", i2);
        j = new kp2("NO_PREFIX", i2);
        int i3 = 1;
        k = new kp2("TINK", i3);
        l = new kp2("CRUNCHY", i3);
        m = new kp2("NO_PREFIX", i3);
    }

    public /* synthetic */ kp2(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((om1) obj).l(this.g);
    }

    @Override // defpackage.ah
    public boolean h(CharSequence charSequence, int i2, int i3, e50 e50Var) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.g)) {
            return true;
        }
        e50Var.c = (e50Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        int i2 = this.f;
        String str = this.g;
        switch (i2) {
            case 0:
            case 1:
                return str;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ah
    public Object c() {
        return this;
    }
}
