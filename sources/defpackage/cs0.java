package defpackage;

import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class cs0 implements r63 {
    public final /* synthetic */ int a;
    public final p83 b;

    public /* synthetic */ cs0(p83 p83Var, int i) {
        this.a = i;
        this.b = p83Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        p83 p83Var = this.b;
        switch (i) {
            case 0:
                String str = (String) p83Var.g;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            return dv0.AD_LOADER;
                        }
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            return dv0.INTERSTITIAL;
                        }
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            return dv0.REWARD_BASED_VIDEO_AD;
                        }
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            return dv0.BANNER;
                        }
                        break;
                }
                return dv0.AD_INITIATER_UNSPECIFIED;
            case 1:
                String lowerCase = ((String) p83Var.g).toLowerCase(Locale.ROOT);
                dq.D(lowerCase);
                return lowerCase;
            case 2:
                HashSet hashSet = new HashSet();
                hashSet.add(((String) p83Var.g).toLowerCase(Locale.ROOT));
                return hashSet;
            case 3:
                return (String) p83Var.h;
            default:
                return (ma1) p83Var.i;
        }
    }
}
