package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ok implements q20 {
    public final Context f;
    public final String g;
    public final us2 h;
    public final boolean i;
    public final Object j = new Object();
    public nk k;
    public boolean l;

    public ok(Context context, String str, us2 us2Var, boolean z) {
        this.f = context;
        this.g = str;
        this.h = us2Var;
        this.i = z;
    }

    public final nk a() {
        nk nkVar;
        synchronized (this.j) {
            try {
                if (this.k == null) {
                    lk[] lkVarArr = new lk[1];
                    if (this.g == null || !this.i) {
                        this.k = new nk(this.f, this.g, lkVarArr, this.h);
                    } else {
                        this.k = new nk(this.f, new File(this.f.getNoBackupFilesDir(), this.g).getAbsolutePath(), lkVarArr, this.h);
                    }
                    this.k.setWriteAheadLoggingEnabled(this.l);
                }
                nkVar = this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nkVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // defpackage.q20
    public final lk i() {
        return a().b();
    }

    @Override // defpackage.q20
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.j) {
            try {
                nk nkVar = this.k;
                if (nkVar != null) {
                    nkVar.setWriteAheadLoggingEnabled(z);
                }
                this.l = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
