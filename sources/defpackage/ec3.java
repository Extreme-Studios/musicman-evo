package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class ec3 {
    public static final /* synthetic */ int a = 0;

    static {
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str)) {
                return;
            }
            "AFTB".equals(str);
        }
    }
}
