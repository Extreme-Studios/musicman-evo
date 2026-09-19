package defpackage;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa2 extends AsyncTask {
    public r52 a;
    public final us2 b;

    public aa2(us2 us2Var) {
        this.b = us2Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        r52 r52Var = this.a;
        if (r52Var != null) {
            r52Var.i = null;
            aa2 aa2Var = (aa2) ((ArrayDeque) r52Var.h).poll();
            r52Var.i = aa2Var;
            if (aa2Var != null) {
                aa2Var.executeOnExecutor((ThreadPoolExecutor) r52Var.g, new Object[0]);
            }
        }
    }
}
