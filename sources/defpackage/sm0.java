package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sm0 {
    public static final boolean c = tm0.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(String str, long j) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new rm0(j, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        ArrayList arrayList = this.a;
        int i = 0;
        if (arrayList.size() == 0) {
            j = 0;
        } else {
            j = ((rm0) arrayList.get(arrayList.size() - 1)).c - ((rm0) arrayList.get(0)).c;
        }
        if (j > 0) {
            long j2 = ((rm0) arrayList.get(0)).c;
            tm0.b("(%-4d ms) %s", Long.valueOf(j), str);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                rm0 rm0Var = (rm0) obj;
                long j3 = rm0Var.c;
                tm0.b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(rm0Var.b), rm0Var.a);
                j2 = j3;
            }
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        tm0.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
