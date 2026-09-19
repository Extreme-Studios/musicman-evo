package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class iz {
    public final hz a;

    public iz(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new gz(nestedScrollView);
        } else {
            this.a = new ig(21);
        }
    }
}
