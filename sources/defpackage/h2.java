package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum h2 {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    public final int f;

    h2(int i) {
        this.f = i;
    }

    public static h2 a(int i) {
        for (h2 h2Var : values()) {
            if (h2Var.f == i) {
                return h2Var;
            }
        }
        return null;
    }
}
