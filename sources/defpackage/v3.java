package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class v3 extends Exception {
    public final Status f;

    /* JADX WARN: Illegal instructions before constructor call */
    public v3(Status status) {
        int i = status.f;
        String str = status.g;
        super(i + ": " + (str == null ? "" : str));
        this.f = status;
    }
}
