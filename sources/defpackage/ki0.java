package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ki0 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep0 b;

    public /* synthetic */ ki0(ep0 ep0Var, int i) {
        this.a = i;
        this.b = ep0Var;
    }

    @Override // defpackage.xm2
    public final /* synthetic */ hp b(Object obj) {
        int i = this.a;
        int i2 = 0;
        ep0 ep0Var = this.b;
        switch (i) {
            case 0:
                return na1.M(ep0Var.H3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new hl0(ep0Var, i2, (ArrayList) obj), ep0Var.l);
            default:
                return na1.M(ep0Var.H3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zl0(i2, (Uri) obj), ep0Var.l);
        }
    }
}
