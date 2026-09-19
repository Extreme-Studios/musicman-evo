package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class hc3 implements nc3 {
    public final MediaCodec a;
    public final kc3 b;
    public final jc3 c;
    public final vg2 d;
    public boolean e;
    public int f = 0;

    public /* synthetic */ hc3(MediaCodec mediaCodec, HandlerThread handlerThread, jc3 jc3Var, vg2 vg2Var) {
        this.a = mediaCodec;
        this.b = new kc3(handlerThread);
        this.c = jc3Var;
        this.d = vg2Var;
    }

    public static String m(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.nc3
    public final ByteBuffer A(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.nc3
    public final void H(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.nc3
    public final void a(int i, int i2, long j, int i3) {
        jc3 jc3Var = this.c;
        jc3Var.b();
        ic3 ic3VarC = jc3.c();
        ic3VarC.a = i;
        ic3VarC.b = i2;
        ic3VarC.d = j;
        ic3VarC.e = i3;
        b3 b3Var = jc3Var.c;
        String str = qz1.a;
        b3Var.obtainMessage(1, ic3VarC).sendToTarget();
    }

    @Override // defpackage.nc3
    public final int b() {
        this.c.b();
        kc3 kc3Var = this.b;
        synchronized (kc3Var.a) {
            try {
                IllegalStateException illegalStateException = kc3Var.n;
                if (illegalStateException != null) {
                    kc3Var.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = kc3Var.j;
                if (codecException != null) {
                    kc3Var.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = kc3Var.k;
                if (cryptoException != null) {
                    kc3Var.k = null;
                    throw cryptoException;
                }
                int i = -1;
                if (kc3Var.l > 0 || kc3Var.m) {
                    return -1;
                }
                n9 n9Var = kc3Var.d;
                int i2 = n9Var.a;
                int i3 = n9Var.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = ((int[]) n9Var.d)[i2];
                    n9Var.a = (i2 + 1) & n9Var.c;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nc3
    public final boolean c(w32 w32Var) {
        kc3 kc3Var = this.b;
        synchronized (kc3Var.a) {
            kc3Var.o = w32Var;
        }
        return true;
    }

    @Override // defpackage.nc3
    public final void c0(Bundle bundle) {
        jc3 jc3Var = this.c;
        jc3Var.b();
        b3 b3Var = jc3Var.c;
        String str = qz1.a;
        b3Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.nc3
    public final void d(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.nc3
    public final MediaFormat e() {
        MediaFormat mediaFormat;
        kc3 kc3Var = this.b;
        synchronized (kc3Var.a) {
            try {
                mediaFormat = kc3Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.nc3
    public final void f(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.nc3
    public final void g() {
        this.c.a();
        MediaCodec mediaCodec = this.a;
        mediaCodec.flush();
        kc3 kc3Var = this.b;
        synchronized (kc3Var.a) {
            kc3Var.l++;
            Handler handler = kc3Var.c;
            String str = qz1.a;
            handler.post(new s73(3, kc3Var));
        }
        mediaCodec.start();
    }

    @Override // defpackage.nc3
    public final void h(int i, or2 or2Var, long j, int i2) {
        int length;
        int length2;
        int length3;
        int length4;
        jc3 jc3Var = this.c;
        jc3Var.b();
        ic3 ic3VarC = jc3.c();
        ic3VarC.a = i;
        ic3VarC.b = 0;
        ic3VarC.d = j;
        ic3VarC.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = ic3VarC.c;
        cryptoInfo.numSubSamples = or2Var.f;
        int[] iArr = or2Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = or2Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = or2Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < (length2 = bArr.length)) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, length2);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = or2Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < (length = bArr2.length)) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = or2Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(or2Var.g, or2Var.h));
        b3 b3Var = jc3Var.c;
        String str = qz1.a;
        b3Var.obtainMessage(2, ic3VarC).sendToTarget();
    }

    @Override // defpackage.nc3
    public final void i(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.nc3
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        this.c.b();
        kc3 kc3Var = this.b;
        synchronized (kc3Var.a) {
            try {
                IllegalStateException illegalStateException = kc3Var.n;
                if (illegalStateException != null) {
                    kc3Var.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = kc3Var.j;
                if (codecException != null) {
                    kc3Var.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = kc3Var.k;
                if (cryptoException != null) {
                    kc3Var.k = null;
                    throw cryptoException;
                }
                if (kc3Var.l > 0 || kc3Var.m) {
                    return -1;
                }
                n9 n9Var = kc3Var.e;
                int i = n9Var.a;
                int i2 = n9Var.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = ((int[]) n9Var.d)[i];
                n9Var.a = n9Var.c & (i + 1);
                if (i3 >= 0) {
                    if (kc3Var.h == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) kc3Var.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    kc3Var.h = (MediaFormat) kc3Var.g.remove();
                    i3 = -2;
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nc3
    public final void k() {
        vg2 vg2Var;
        vg2 vg2Var2;
        vg2 vg2Var3;
        try {
            try {
                if (this.f == 1) {
                    jc3 jc3Var = this.c;
                    if (jc3Var.f) {
                        jc3Var.a();
                        jc3Var.b.quit();
                    }
                    jc3Var.f = false;
                    kc3 kc3Var = this.b;
                    synchronized (kc3Var.a) {
                        kc3Var.m = true;
                        kc3Var.b.quit();
                        kc3Var.a();
                    }
                }
                this.f = 2;
                if (this.e) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (vg2Var3 = this.d) != null) {
                    vg2Var3.u(this.a);
                }
                this.a.release();
                this.e = true;
            } catch (Throwable th) {
                if (!this.e) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (vg2Var2 = this.d) != null) {
                        vg2Var2.u(this.a);
                    }
                    this.a.release();
                    this.e = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (vg2Var = this.d) != null) {
                vg2Var.u(this.a);
            }
            this.a.release();
            this.e = true;
            throw th2;
        }
    }

    public final void l(MediaFormat mediaFormat, Surface surface, int i) {
        vg2 vg2Var;
        LoudnessCodecController loudnessCodecController;
        kc3 kc3Var = this.b;
        hn.M(kc3Var.c == null);
        HandlerThread handlerThread = kc3Var.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(kc3Var, handler);
        kc3Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        jc3 jc3Var = this.c;
        if (!jc3Var.f) {
            HandlerThread handlerThread2 = jc3Var.b;
            handlerThread2.start();
            jc3Var.c = new b3(jc3Var, handlerThread2.getLooper());
            jc3Var.f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (vg2Var = this.d) != null && ((loudnessCodecController = (LoudnessCodecController) vg2Var.h) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            hn.M(((HashSet) vg2Var.g).add(mediaCodec));
        }
        this.f = 1;
    }

    @Override // defpackage.nc3
    public final void o() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.nc3
    public final ByteBuffer z(int i) {
        return this.a.getInputBuffer(i);
    }
}
