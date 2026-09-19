package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class vn2 extends dn2 {
    public hp m;
    public ScheduledFuture n;

    @Override // defpackage.fm2
    public final void f() {
        n(this.m);
        ScheduledFuture scheduledFuture = this.n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.m = null;
        this.n = null;
    }

    @Override // defpackage.fm2
    public final String g() {
        hp hpVar = this.m;
        ScheduledFuture scheduledFuture = this.n;
        if (hpVar == null) {
            return null;
        }
        String string = hpVar.toString();
        String strN = ec.n(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                int length = strN.length();
                StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
                sb.append(strN);
                sb.append(", remaining delay=[");
                sb.append(delay);
                sb.append(" ms]");
                return sb.toString();
            }
        }
        return strN;
    }
}
