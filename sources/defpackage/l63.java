package defpackage;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class l63 extends na1 {
    public final /* synthetic */ int q;
    public final Object r;

    public l63(String str, int i) {
        this.q = i;
        switch (i) {
            case 1:
                this.r = Logger.getLogger(str);
                break;
            default:
                this.r = str;
                break;
        }
    }

    @Override // defpackage.na1
    public final void v(String str) {
        int i = this.q;
        Object obj = this.r;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                StringBuilder sb = new StringBuilder(str.length() + str2.length() + 1);
                sb.append(str2);
                sb.append(":");
                sb.append(str);
                Log.d("isoparser", sb.toString());
                break;
            default:
                ((Logger) obj).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
