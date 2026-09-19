package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ze2 extends IOException {
    public final int f;

    public ze2() {
        this.f = 2008;
    }

    public ze2(String str, int i) {
        super(str);
        this.f = i;
    }

    public ze2(String str, Exception exc, int i) {
        super(str, exc);
        this.f = i;
    }

    public ze2(int i, Exception exc) {
        super(exc);
        this.f = i;
    }
}
