package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class no0 extends IOException {
    public final boolean f;
    public final int g;

    public no0(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f = z;
        this.g = i;
    }

    public static no0 a(RuntimeException runtimeException, String str) {
        return new no0(str, runtimeException, true, 1);
    }

    public static no0 b(String str) {
        return new no0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        int length = strConcat.length();
        boolean z = this.f;
        int length2 = String.valueOf(z).length() + length + 20;
        int i = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z);
        sb.append(", dataType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
