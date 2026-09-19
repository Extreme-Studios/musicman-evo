package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ja2 extends za2 {
    public final AssetManager j;
    public Uri k;
    public InputStream l;
    public long m;
    public boolean n;

    public ja2(Context context) {
        super(false);
        this.j = context.getAssets();
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws y92 {
        try {
            Uri uri = eg2Var.a;
            this.k = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(eg2Var);
            InputStream inputStreamOpen = this.j.open(path, 1);
            this.l = inputStreamOpen;
            long j = eg2Var.c;
            if (inputStreamOpen.skip(j) < j) {
                throw new y92(2008, null);
            }
            long j2 = eg2Var.d;
            if (j2 != -1) {
                this.m = j2;
            } else {
                long jAvailable = this.l.available();
                this.m = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.m = -1L;
                }
            }
            this.n = true;
            e(eg2Var);
            return this.m;
        } catch (y92 e) {
            throw e;
        } catch (IOException e2) {
            throw new y92(true != (e2 instanceof FileNotFoundException) ? 2000 : 2005, e2);
        }
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws y92 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.m;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new y92(2000, e);
                }
            }
            InputStream inputStream = this.l;
            String str = qz1.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.m;
                if (j2 != -1) {
                    this.m = j2 - ((long) i3);
                }
                f(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // defpackage.oe2
    public final Uri h() {
        return this.k;
    }

    @Override // defpackage.oe2
    public final void l() {
        this.k = null;
        try {
            try {
                InputStream inputStream = this.l;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.l = null;
                if (this.n) {
                    this.n = false;
                    j();
                }
            } catch (IOException e) {
                throw new y92(2000, e);
            }
        } catch (Throwable th) {
            this.l = null;
            if (this.n) {
                this.n = false;
                j();
            }
            throw th;
        }
    }
}
