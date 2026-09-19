package defpackage;

import android.os.RemoteException;
import com.extremestudios.musicmanevo.MusicmanEvoApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b22 {
    public static b22 h;
    public hl1 f;
    public final Object a = new Object();
    public boolean c = false;
    public boolean d = false;
    public final Object e = new Object();
    public final cx g = new cx(new ArrayList());
    public final ArrayList b = new ArrayList();

    static {
        new HashSet(Arrays.asList(h2.APP_OPEN_AD, h2.INTERSTITIAL, h2.REWARDED));
    }

    public static b22 c() {
        b22 b22Var;
        synchronized (b22.class) {
            try {
                if (h == null) {
                    h = new b22();
                }
                b22Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b22Var;
    }

    public final void a(MusicmanEvoApp musicmanEvoApp) {
        if (this.f == null) {
            this.f = (hl1) new fp0(ut0.f.b, musicmanEvoApp).d(musicmanEvoApp, false);
        }
    }

    public final void b() {
        try {
            this.f.b();
            this.f.T2(new ju(null), null);
        } catch (RemoteException e) {
            jn.V("MobileAdsSettingManager initialization failed", e);
        }
    }
}
