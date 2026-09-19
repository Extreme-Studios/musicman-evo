package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mp {
    public final zx a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ bt d;

    public mp(bt btVar, zx zxVar) {
        this.d = btVar;
        this.a = zxVar;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        bt btVar = this.d;
        int i2 = btVar.c;
        btVar.c = i + i2;
        if (!btVar.d) {
            btVar.d = true;
            while (true) {
                try {
                    int i3 = btVar.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    btVar.d = false;
                    throw th;
                }
            }
            btVar.d = false;
        }
        if (this.b) {
            btVar.c(this);
        }
    }
}
