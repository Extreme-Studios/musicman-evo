package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class dj2 extends za2 {
    public RandomAccessFile j;
    public Uri k;
    public long l;
    public boolean m;

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws mi2 {
        Uri uri = eg2Var.a;
        this.k = uri;
        b(eg2Var);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.j = randomAccessFile;
            try {
                long j = eg2Var.c;
                randomAccessFile.seek(j);
                long length = eg2Var.d;
                if (length == -1) {
                    length = this.j.length() - j;
                }
                this.l = length;
                if (length < 0) {
                    throw new mi2(null, null, 2008);
                }
                this.m = true;
                e(eg2Var);
                return this.l;
            } catch (IOException e) {
                throw new mi2(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new mi2(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            throw new mi2("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e2, 1004);
        } catch (SecurityException e3) {
            throw new mi2(2006, e3);
        } catch (RuntimeException e4) {
            throw new mi2(2000, e4);
        }
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws mi2 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.l;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.j;
            String str = qz1.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.l -= (long) i3;
                f(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new mi2(2000, e);
        }
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
                RandomAccessFile randomAccessFile = this.j;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.j = null;
                if (this.m) {
                    this.m = false;
                    j();
                }
            } catch (IOException e) {
                throw new mi2(2000, e);
            }
        } catch (Throwable th) {
            this.j = null;
            if (this.m) {
                this.m = false;
                j();
            }
            throw th;
        }
    }
}
