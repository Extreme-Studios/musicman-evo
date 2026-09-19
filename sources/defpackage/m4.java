package defpackage;

import android.graphics.Typeface;
import android.view.View;
import com.extremestudios.musicmanevo.SplashActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m4(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                n4 n4Var = (n4) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    n4Var.a();
                }
            case 1:
                ((d6) obj2).b((Typeface) obj);
                return;
            default:
                View view = (View) obj2;
                int i2 = SplashActivity.C;
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setAlpha(0.6f);
                ((SplashActivity) obj).r(view, 0L);
                return;
        }
    }
}
