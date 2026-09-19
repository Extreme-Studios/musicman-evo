package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class vl0 implements ul0 {
    public long f;
    public long g;
    public Object h;

    public vl0() {
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.ul0
    public long a() {
        return this.g;
    }

    public void b(Exception exc) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.h) == null) {
            this.h = exc;
        }
        if (this.f == -9223372036854775807L) {
            synchronized (qb3.f0) {
                z = qb3.h0 > 0;
            }
            if (!z) {
                this.f = 200 + jElapsedRealtime;
            }
        }
        long j = this.f;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.g = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.h;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.h;
        this.h = null;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        throw exc3;
    }

    @Override // defpackage.ul0
    public void i(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = ((FileChannel) this.h).map(FileChannel.MapMode.READ_ONLY, this.f + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public vl0(FileChannel fileChannel, long j, long j2) {
        this.h = fileChannel;
        this.f = j;
        this.g = j2;
    }
}
