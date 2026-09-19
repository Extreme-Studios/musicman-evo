package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class e6 implements Runnable {
    public final /* synthetic */ int f;
    public final int g;
    public final Object h;
    public final Object i;

    public /* synthetic */ e6(Object obj, int i, Parcelable parcelable, int i2) {
        this.f = i2;
        this.i = obj;
        this.g = i;
        this.h = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.i;
        int i2 = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, i2);
                break;
            case 1:
                ((id) obj).g.e(i2, (Bundle) obj2);
                break;
            case 2:
                ((w20) obj2).b((Intent) obj, i2);
                break;
            case 3:
                ((SystemForegroundService) obj).j.notify(i2, (Notification) obj2);
                break;
            case 4:
                for (cq1 cq1Var : (CopyOnWriteArraySet) obj2) {
                    hp1 hp1Var = (hp1) obj;
                    if (!cq1Var.d) {
                        if (i2 != -1) {
                            cq1Var.b.c(i2);
                        }
                        cq1Var.c = true;
                        hp1Var.mo6b(cq1Var.a);
                    }
                }
                break;
            default:
                ((sm2) obj2).s(i2, (hp) obj);
                break;
        }
    }

    public /* synthetic */ e6(Object obj, int i, Object obj2, int i2) {
        this.f = i2;
        this.h = obj;
        this.g = i;
        this.i = obj2;
    }

    public /* synthetic */ e6(Object obj, Object obj2, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.i = obj2;
        this.g = i;
    }
}
