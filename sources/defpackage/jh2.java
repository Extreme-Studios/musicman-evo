package defpackage;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class jh2 {
    public IBinder a;
    public String b;
    public int c;
    public float d;
    public int e;
    public String f;
    public byte g;

    public final kh2 a() {
        IBinder iBinder;
        if (this.g == 31 && (iBinder = this.a) != null) {
            return new kh2(iBinder, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" windowToken");
        }
        if ((this.g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        j7.e("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
