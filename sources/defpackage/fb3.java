package defpackage;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class fb3 implements nc3 {
    public final Object a;
    public Object b;

    public fb3(MediaCodec mediaCodec, vg2 vg2Var) {
        this.a = mediaCodec;
        this.b = vg2Var;
        if (Build.VERSION.SDK_INT < 35 || vg2Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) vg2Var.h;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            hn.M(((HashSet) vg2Var.g).add(mediaCodec));
        }
    }

    @Override // defpackage.nc3
    public ByteBuffer A(int i) {
        return ((MediaCodec) this.a).getOutputBuffer(i);
    }

    @Override // defpackage.nc3
    public void H(int i) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.nc3
    public void a(int i, int i2, long j, int i3) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.nc3
    public int b() {
        return ((MediaCodec) this.a).dequeueInputBuffer(0L);
    }

    @Override // defpackage.nc3
    public void c0(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    @Override // defpackage.nc3
    public void d(int i) {
        ((MediaCodec) this.a).setVideoScalingMode(i);
    }

    @Override // defpackage.nc3
    public MediaFormat e() {
        return ((MediaCodec) this.a).getOutputFormat();
    }

    @Override // defpackage.nc3
    public void f(int i, long j) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.nc3
    public void g() {
        ((MediaCodec) this.a).flush();
    }

    @Override // defpackage.nc3
    public void h(int i, or2 or2Var, long j, int i2) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, or2Var.i, j, i2);
    }

    @Override // defpackage.nc3
    public void i(Surface surface) {
        ((MediaCodec) this.a).setOutputSurface(surface);
    }

    @Override // defpackage.nc3
    public int j(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.a).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.nc3
    public void k() {
        vg2 vg2Var = (vg2) this.b;
        MediaCodec mediaCodec = (MediaCodec) this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && vg2Var != null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && vg2Var != null) {
                vg2Var.u(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // defpackage.nc3
    public void o() {
        ((MediaCodec) this.a).detachOutputSurface();
    }

    @Override // defpackage.nc3
    public ByteBuffer z(int i) {
        return ((MediaCodec) this.a).getInputBuffer(i);
    }

    public fb3(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }
}
