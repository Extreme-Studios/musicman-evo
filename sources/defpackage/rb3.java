package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rb3 extends yc3 implements g83 {
    public final un1 E0;
    public final qb3 F0;
    public final vg2 G0;
    public int H0;
    public boolean I0;
    public de3 J0;
    public de3 K0;
    public long L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public boolean Q0;
    public long R0;

    /* JADX WARN: Illegal instructions before constructor call */
    public rb3(Context context, sw1 sw1Var, Handler handler, d73 d73Var, qb3 qb3Var) {
        r53 r53Var = r53.i;
        vg2 vg2Var = Build.VERSION.SDK_INT >= 35 ? new vg2(27) : null;
        super(1, sw1Var, r53Var, 44100.0f);
        context.getApplicationContext();
        this.F0 = qb3Var;
        this.G0 = vg2Var;
        this.P0 = -1000;
        this.E0 = new un1(handler, 26, d73Var);
        this.R0 = -9223372036854775807L;
        qb3Var.n = new bz1(this);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0133  */
    /* JADX WARN: Code duplicated, block: B:88:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.AbstractCollection, qk2] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // defpackage.yc3
    public final int K(r53 r53Var, de3 de3Var) {
        int i;
        int i2;
        int i3;
        boolean z;
        ?? r8;
        ?? B;
        ?? r1;
        int i4;
        qa3 qa3VarA;
        boolean zBooleanValue;
        int iB;
        String str = de3Var.m;
        String str2 = de3Var.m;
        int i5 = de3Var.E;
        int i6 = de3Var.F;
        if (!rn0.a(str)) {
            return 128;
        }
        int i7 = de3Var.L;
        boolean z2 = i7 == 0;
        qb3 qb3Var = this.F0;
        if (!z2) {
            i = 0;
        } else if (i7 != 0) {
            List listA = cd3.a("audio/raw", false, false);
            if ((listA.isEmpty() ? null : (pc3) listA.get(0)) != null) {
                if (qb3Var.V) {
                    qa3VarA = qa3.d;
                } else {
                    fb3 fb3Var = qb3Var.e0;
                    qk1 qk1Var = qb3Var.v;
                    fb3Var.getClass();
                    qk1Var.getClass();
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 29 || i6 == -1) {
                        qa3VarA = qa3.d;
                    } else {
                        Context context = (Context) fb3Var.a;
                        Boolean bool = (Boolean) fb3Var.b;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            if (context != null) {
                                String parameters = na1.o(context).getParameters("offloadVariableRateSupported");
                                fb3Var.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                            } else {
                                fb3Var.b = Boolean.FALSE;
                            }
                            zBooleanValue = ((Boolean) fb3Var.b).booleanValue();
                        }
                        str2.getClass();
                        int iH = rn0.h(str2, de3Var.j);
                        if (iH == 0 || i4 < qz1.c(iH) || (iB = qz1.b(i5)) == 0) {
                            qa3VarA = qa3.d;
                        } else {
                            try {
                                AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i6).setChannelMask(iB).setEncoding(iH).build();
                                if (i4 >= 31) {
                                    int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, qk1Var.a());
                                    if (playbackOffloadSupport == 0) {
                                        qa3VarA = qa3.d;
                                    } else {
                                        i60 i60Var = new i60();
                                        boolean z3 = i4 > 32 && playbackOffloadSupport == 2;
                                        i60Var.a = true;
                                        i60Var.b = z3;
                                        i60Var.c = zBooleanValue;
                                        qa3VarA = i60Var.a();
                                    }
                                } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, qk1Var.a())) {
                                    i60 i60Var2 = new i60();
                                    i60Var2.a = true;
                                    i60Var2.c = zBooleanValue;
                                    qa3VarA = i60Var2.a();
                                } else {
                                    qa3VarA = qa3.d;
                                }
                            } catch (IllegalArgumentException unused) {
                                qa3VarA = qa3.d;
                            }
                        }
                    }
                }
                if (qa3VarA.a) {
                    if (true != qa3VarA.b) {
                        i = 512;
                    } else {
                        i = 1536;
                    }
                    if (qa3VarA.c) {
                        i |= 2048;
                    }
                } else {
                    i = 0;
                }
                if (qb3Var.o(de3Var) != 0) {
                    return i | 172;
                }
            } else {
                i = 0;
            }
        } else {
            if (qb3Var.V) {
                qa3VarA = qa3.d;
            } else {
                fb3 fb3Var2 = qb3Var.e0;
                qk1 qk1Var2 = qb3Var.v;
                fb3Var2.getClass();
                qk1Var2.getClass();
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    qa3VarA = qa3.d;
                } else {
                    qa3VarA = qa3.d;
                }
            }
            if (qa3VarA.a) {
                i = 0;
            } else {
                if (true != qa3VarA.b) {
                    i = 512;
                } else {
                    i = 1536;
                }
                if (qa3VarA.c) {
                    i |= 2048;
                }
            }
            if (qb3Var.o(de3Var) != 0) {
                return i | 172;
            }
        }
        if ("audio/raw".equals(str) && qb3Var.o(de3Var) == 0) {
            i3 = 128;
            i2 = 1;
        } else {
            uc3 uc3Var = new uc3();
            uc3Var.e("audio/raw");
            uc3Var.D = i5;
            uc3Var.E = i6;
            uc3Var.F = 2;
            if (qb3Var.o(new de3(uc3Var)) != 0) {
                if (str2 == null) {
                    r8 = 0;
                    B = qk2.j;
                } else {
                    if (qb3Var.o(de3Var) != 0) {
                        z = false;
                        r8 = 0;
                        List listA2 = cd3.a("audio/raw", false, false);
                        pc3 pc3Var = listA2.isEmpty() ? null : (pc3) listA2.get(0);
                        if (pc3Var != null) {
                            B = vj2.i(pc3Var);
                        }
                    } else {
                        z = false;
                    }
                    B = cd3.b(r53Var, de3Var, z, z);
                    r8 = z;
                }
                if (B.isEmpty()) {
                    i3 = 128;
                    i2 = 1;
                } else {
                    if (z2) {
                        pc3 pc3Var2 = (pc3) B.get(r8);
                        boolean zB = pc3Var2.b(de3Var);
                        if (!zB) {
                            int i8 = 1;
                            while (true) {
                                if (i8 >= B.i) {
                                    r1 = 1;
                                    break;
                                }
                                pc3 pc3Var3 = (pc3) B.get(i8);
                                if (pc3Var3.b(de3Var)) {
                                    pc3Var2 = pc3Var3;
                                    r1 = r8;
                                    zB = true;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            r1 = 1;
                            break;
                        }
                        int i9 = true != zB ? 3 : 4;
                        int i10 = 8;
                        if (zB && pc3Var2.c(de3Var)) {
                            i10 = 16;
                        }
                        return (true != pc3Var2.g ? r8 : 64) | i9 | i10 | 32 | (1 != r1 ? r8 : 128) | i;
                    }
                    i2 = 2;
                }
            } else {
                i2 = 1;
            }
            i3 = 128;
        }
        return i3 | i2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // defpackage.yc3
    public final ArrayList M(r53 r53Var, de3 de3Var) {
        qk2 qk2VarB;
        if (de3Var.m == null) {
            qk2VarB = qk2.j;
        } else if (this.F0.o(de3Var) != 0) {
            List listA = cd3.a("audio/raw", false, false);
            pc3 pc3Var = listA.isEmpty() ? null : (pc3) listA.get(0);
            if (pc3Var != null) {
                qk2VarB = vj2.i(pc3Var);
            } else {
                qk2VarB = cd3.b(r53Var, de3Var, false, false);
            }
        } else {
            qk2VarB = cd3.b(r53Var, de3Var, false, false);
        }
        HashMap map = cd3.a;
        ArrayList arrayList = new ArrayList(qk2VarB);
        Collections.sort(arrayList, new s82(1, new gv1(17, de3Var)));
        return arrayList;
    }

    @Override // defpackage.yc3
    public final boolean N(de3 de3Var) {
        l();
        return this.F0.o(de3Var) != 0;
    }

    @Override // defpackage.yc3
    public final kd0 O(pc3 pc3Var, de3 de3Var, float f) {
        de3[] de3VarArr = this.o;
        de3VarArr.getClass();
        int length = de3VarArr.length;
        String str = pc3Var.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = de3Var.n;
        if (length != 1) {
            for (de3 de3Var2 : de3VarArr) {
                if (pc3Var.d(de3Var, de3Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, de3Var2.n);
                }
            }
        }
        this.H0 = iMax;
        this.I0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = pc3Var.c;
        int i = this.H0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i2 = de3Var.E;
        mediaFormat.setInteger("channel-count", i2);
        int i3 = de3Var.F;
        mediaFormat.setInteger("sample-rate", i3);
        ar.v(mediaFormat, de3Var.p);
        ar.z(mediaFormat, "max-input-size", i);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = de3Var.m;
        if ("audio/ac4".equals(str3)) {
            Pair pairB = rl1.b(de3Var);
            if (pairB != null) {
                ar.z(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                ar.z(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        uc3 uc3Var = new uc3();
        uc3Var.e("audio/raw");
        uc3Var.D = i2;
        uc3Var.E = i3;
        uc3Var.F = 4;
        if (this.F0.o(new de3(uc3Var)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i4 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.P0));
        }
        de3 de3Var3 = null;
        if ("audio/raw".equals(pc3Var.b) && !"audio/raw".equals(str3)) {
            de3Var3 = de3Var;
        }
        this.K0 = de3Var3;
        return new kd0(pc3Var, mediaFormat, de3Var, (Object) null, this.G0, 14);
    }

    @Override // defpackage.yc3
    public final k03 P(pc3 pc3Var, de3 de3Var, de3 de3Var2) {
        int i;
        int i2;
        k03 k03VarD = pc3Var.d(de3Var, de3Var2);
        int i3 = k03VarD.e;
        if (this.K == null && N(de3Var2)) {
            i3 |= 32768;
        }
        "OMX.google.raw.decoder".equals(pc3Var.a);
        if (de3Var2.n > this.H0) {
            i3 |= 64;
        }
        String str = pc3Var.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = k03VarD.d;
        }
        return new k03(str, de3Var, de3Var2, i2, i);
    }

    @Override // defpackage.yc3
    public final long Q(long j, long j2) {
        long jT;
        qb3 qb3Var = this.F0;
        boolean z = qb3Var.s() && this.R0 != -9223372036854775807L;
        if (this.Q0) {
            if (qb3Var.h()) {
                gb3 gb3Var = qb3Var.p;
                int i = gb3Var.c;
                AudioTrack audioTrack = qb3Var.r;
                if (i == 0) {
                    jT = qz1.s(gb3Var.e, audioTrack.getBufferSizeInFrames());
                } else {
                    long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                    int iC = rs0.C(qb3Var.p.g);
                    hn.M(iC != -2147483647);
                    jT = qz1.t(bufferSizeInFrames, 1000000L, iC, RoundingMode.DOWN);
                }
            } else {
                jT = -9223372036854775807L;
            }
            if (z && jT != -9223372036854775807L) {
                float fMin = Math.min(jT, this.R0 - j);
                up0 up0Var = qb3Var.y;
                float f = up0Var != null ? up0Var.a : 1.0f;
                this.l.getClass();
                return Math.max(10000L, ((long) ((fMin / f) / 2.0f)) - (qz1.r(SystemClock.elapsedRealtime()) - j2));
            }
        } else if (z || this.u0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.yc3
    public final float R(float f, de3 de3Var, de3[] de3VarArr) {
        int iMax = -1;
        for (de3 de3Var2 : de3VarArr) {
            int i = de3Var2.F;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // defpackage.yc3
    public final void S(long j, long j2, String str) {
        un1 un1Var = this.E0;
        Handler handler = (Handler) un1Var.g;
        if (handler != null) {
            handler.post(new ra3(un1Var, str, j, j2));
        }
    }

    @Override // defpackage.yc3
    public final void T(String str) {
        un1 un1Var = this.E0;
        Handler handler = (Handler) un1Var.g;
        if (handler != null) {
            handler.post(new ra3(un1Var, str, 4));
        }
    }

    @Override // defpackage.yc3
    public final void U(Exception exc) {
        s90.b0("MediaCodecAudioRenderer", "Audio codec error", exc);
        un1 un1Var = this.E0;
        Handler handler = (Handler) un1Var.g;
        if (handler != null) {
            handler.post(new ra3(un1Var, exc, 6));
        }
    }

    @Override // defpackage.yc3
    public final k03 V(us2 us2Var) {
        de3 de3Var = (de3) us2Var.h;
        de3Var.getClass();
        this.J0 = de3Var;
        k03 k03VarV = super.V(us2Var);
        un1 un1Var = this.E0;
        Handler handler = (Handler) un1Var.g;
        if (handler != null) {
            handler.post(new ib(un1Var, de3Var, k03VarV, 23));
        }
        return k03VarV;
    }

    @Override // defpackage.yc3
    public final void W(de3 de3Var, MediaFormat mediaFormat) throws q43 {
        int iY;
        de3 de3Var2 = this.K0;
        int[] iArr = null;
        boolean z = true;
        if (de3Var2 != null) {
            de3Var = de3Var2;
        } else if (this.P != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(de3Var.m)) {
                iY = de3Var.G;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iY = mediaFormat.getInteger("pcm-encoding");
            } else {
                iY = mediaFormat.containsKey("v-bits-per-sample") ? qz1.y(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            uc3 uc3Var = new uc3();
            uc3Var.e("audio/raw");
            uc3Var.F = iY;
            uc3Var.G = de3Var.H;
            uc3Var.H = de3Var.I;
            uc3Var.j = de3Var.k;
            uc3Var.a = de3Var.a;
            uc3Var.b = de3Var.b;
            uc3Var.c = vj2.m(de3Var.c);
            uc3Var.d = de3Var.d;
            uc3Var.e = de3Var.e;
            uc3Var.f = de3Var.f;
            uc3Var.D = mediaFormat.getInteger("channel-count");
            uc3Var.E = mediaFormat.getInteger("sample-rate");
            de3Var = new de3(uc3Var);
            if (this.I0) {
                int i = de3Var.E;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                if (this.i0) {
                    l();
                }
                if (i2 < 29) {
                    z = false;
                }
                hn.M(z);
            }
            this.F0.p(de3Var, iArr);
        } catch (za3 e) {
            throw m(e, e.f, false, 5001);
        }
    }

    @Override // defpackage.yc3
    public final void X() {
        this.F0.F = true;
    }

    @Override // defpackage.yc3
    public final boolean Y(long j, long j2, nc3 nc3Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, de3 de3Var) throws q43 {
        byteBuffer.getClass();
        this.R0 = -9223372036854775807L;
        if (this.K0 != null && (i2 & 2) != 0) {
            nc3Var.getClass();
            nc3Var.H(i);
            return true;
        }
        qb3 qb3Var = this.F0;
        if (z) {
            if (nc3Var != null) {
                nc3Var.H(i);
            }
            this.w0.f += i3;
            qb3Var.F = true;
            return true;
        }
        try {
            if (!qb3Var.r(byteBuffer, j3, i3)) {
                this.R0 = j3;
                return false;
            }
            if (nc3Var != null) {
                nc3Var.H(i);
            }
            this.w0.e += i3;
            return true;
        } catch (ab3 e) {
            de3 de3Var2 = this.J0;
            if (this.i0) {
                l();
            }
            throw m(e, de3Var2, e.g, 5001);
        } catch (bb3 e2) {
            if (this.i0) {
                l();
            }
            throw m(e2, de3Var, e2.g, 5002);
        }
    }

    @Override // defpackage.yc3
    public final void Z() throws q43 {
        try {
            qb3 qb3Var = this.F0;
            if (!qb3Var.M && qb3Var.h() && qb3Var.d()) {
                qb3Var.m();
                qb3Var.M = true;
            }
            long j = this.x0.e;
            if (j != -9223372036854775807L) {
                this.R0 = j;
            }
        } catch (bb3 e) {
            throw m(e, e.h, e.g, true != this.i0 ? 5002 : 5003);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0041  */
    @Override // defpackage.v83
    public final void a(int i, Object obj) {
        vg2 vg2Var;
        qb3 qb3Var = this.F0;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (qb3Var.I != fFloatValue) {
                qb3Var.I = fFloatValue;
                if (qb3Var.h()) {
                    qb3Var.r.setVolume(qb3Var.I);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            qk1 qk1Var = (qk1) obj;
            qk1Var.getClass();
            if (qb3Var.v.equals(qk1Var)) {
                return;
            }
            qb3Var.v = qk1Var;
            qx1 qx1Var = qb3Var.t;
            if (qx1Var != null) {
                qx1Var.o = qk1Var;
                qx1Var.b(na3.a((Context) qx1Var.g, qk1Var, (AudioDeviceInfo) qx1Var.n));
            }
            qb3Var.t();
            return;
        }
        if (i == 6) {
            cu1 cu1Var = (cu1) obj;
            cu1Var.getClass();
            if (qb3Var.S.equals(cu1Var)) {
                return;
            }
            if (qb3Var.r != null) {
                qb3Var.S.getClass();
            }
            qb3Var.S = cu1Var;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            qb3Var.T = audioDeviceInfo;
            qx1 qx1Var2 = qb3Var.t;
            if (qx1Var2 != null) {
                qx1Var2.a(audioDeviceInfo);
            }
            AudioTrack audioTrack = qb3Var.r;
            if (audioTrack != null) {
                audioTrack.setPreferredDevice(qb3Var.T);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.P0 = ((Integer) obj).intValue();
            nc3 nc3Var = this.P;
            if (nc3Var == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.P0));
            nc3Var.c0(bundle);
            return;
        }
        if (i == 9) {
            obj.getClass();
            qb3Var.z = ((Boolean) obj).booleanValue();
            jb3 jb3Var = new jb3(qb3Var.y, -9223372036854775807L, -9223372036854775807L);
            if (qb3Var.h()) {
                qb3Var.w = jb3Var;
                return;
            } else {
                qb3Var.x = jb3Var;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                q73 q73Var = (q73) obj;
                q73Var.getClass();
                this.L = q73Var;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (qb3Var.R) {
            if (qb3Var.Q == iIntValue) {
                qb3Var.R = false;
                if (qb3Var.Q != iIntValue) {
                    qb3Var.Q = iIntValue;
                    qb3Var.t();
                }
            }
        } else if (qb3Var.Q != iIntValue) {
            qb3Var.Q = iIntValue;
            qb3Var.t();
        }
        if (Build.VERSION.SDK_INT < 35 || (vg2Var = this.G0) == null) {
            return;
        }
        vg2Var.n(iIntValue);
    }

    @Override // defpackage.yc3
    public final void a0(lt2 lt2Var) {
        de3 de3Var;
        if (Build.VERSION.SDK_INT < 29 || (de3Var = lt2Var.b) == null || !Objects.equals(de3Var.m, "audio/opus") || !this.i0) {
            return;
        }
        ByteBuffer byteBuffer = lt2Var.g;
        byteBuffer.getClass();
        lt2Var.b.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            AudioTrack audioTrack = this.F0.r;
            if (audioTrack != null) {
                qb3.l(audioTrack);
            }
        }
    }

    @Override // defpackage.g83
    public final void b(up0 up0Var) {
        qb3 qb3Var = this.F0;
        qb3Var.getClass();
        float f = up0Var.a;
        String str = qz1.a;
        qb3Var.y = new up0(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(up0Var.b, 8.0f)));
        jb3 jb3Var = new jb3(up0Var, -9223372036854775807L, -9223372036854775807L);
        if (qb3Var.h()) {
            qb3Var.w = jb3Var;
        } else {
            qb3Var.x = jb3Var;
        }
    }

    @Override // defpackage.yc3
    public final void c(long j, boolean z, boolean z2) {
        super.c(j, z, z2);
        this.F0.t();
        this.L0 = j;
        this.R0 = -9223372036854775807L;
        this.O0 = false;
        this.M0 = true;
    }

    @Override // defpackage.yc3
    public final void d() {
        this.F0.q();
        this.Q0 = true;
    }

    @Override // defpackage.g83
    public final long e() {
        if (this.m == 2) {
            r0();
        }
        return this.L0;
    }

    @Override // defpackage.g83
    public final boolean f() {
        boolean z = this.O0;
        this.O0 = false;
        return z;
    }

    @Override // defpackage.g83
    public final up0 g() {
        return this.F0.y;
    }

    @Override // defpackage.yc3
    public final void h() {
        r0();
        this.Q0 = false;
        qb3 qb3Var = this.F0;
        qb3Var.P = false;
        if (qb3Var.h()) {
            db3 db3Var = qb3Var.g;
            db3Var.j = 0L;
            db3Var.t = 0;
            db3Var.s = 0;
            db3Var.k = 0L;
            db3Var.z = -9223372036854775807L;
            db3Var.A = -9223372036854775807L;
            db3Var.h = false;
            if (db3Var.u == -9223372036854775807L) {
                cb3 cb3Var = db3Var.d;
                cb3Var.getClass();
                cb3Var.a(0);
            }
            db3Var.w = db3Var.e();
            if (!qb3Var.N || qb3.l(qb3Var.r)) {
                qb3Var.r.pause();
            }
        }
    }

    @Override // defpackage.yc3
    public final void i() {
        b03 b03Var;
        un1 un1Var = this.E0;
        this.N0 = true;
        this.J0 = null;
        this.R0 = -9223372036854775807L;
        int i = 21;
        try {
            try {
                this.F0.t();
                super.i();
                b03Var = this.w0;
                un1Var.getClass();
                synchronized (b03Var) {
                }
            } finally {
                super.i();
                b03Var = this.w0;
                un1Var.getClass();
                synchronized (b03Var) {
                    Handler handler = (Handler) un1Var.g;
                    if (handler != null) {
                        handler.post(new u52(un1Var, i, b03Var));
                    }
                }
            }
        } catch (Throwable th) {
            b03 b03Var2 = this.w0;
            un1Var.getClass();
            synchronized (b03Var2) {
                Handler handler2 = (Handler) un1Var.g;
                if (handler2 != null) {
                    handler2.post(new u52(un1Var, i, b03Var2));
                }
                throw th;
            }
        }
    }

    @Override // defpackage.yc3
    public final void j() {
        qb3 qb3Var = this.F0;
        this.O0 = false;
        this.R0 = -9223372036854775807L;
        try {
            try {
                this.i0 = false;
                b0();
                x();
                this.K = null;
                if (this.N0) {
                    this.N0 = false;
                    qb3Var.a();
                }
            } catch (Throwable th) {
                this.K = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.N0) {
                this.N0 = false;
                qb3Var.a();
            }
            throw th2;
        }
    }

    @Override // defpackage.yc3
    public final void k() {
        vg2 vg2Var;
        qx1 qx1Var = this.F0.t;
        if (qx1Var != null && qx1Var.f) {
            qx1Var.m = null;
            Context context = (Context) qx1Var.g;
            na1.o(context).unregisterAudioDeviceCallback((oa3) qx1Var.j);
            context.unregisterReceiver((y4) qx1Var.k);
            pa3 pa3Var = (pa3) qx1Var.l;
            if (pa3Var != null) {
                pa3Var.a.unregisterContentObserver(pa3Var);
            }
            qx1Var.f = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (vg2Var = this.G0) == null) {
            return;
        }
        ((HashSet) vg2Var.g).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) vg2Var.h;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // defpackage.yc3
    public final String o() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.yc3
    public final void p0(boolean z, boolean z2) {
        b03 b03Var = new b03();
        this.w0 = b03Var;
        un1 un1Var = this.E0;
        Handler handler = (Handler) un1Var.g;
        if (handler != null) {
            handler.post(new ra3(un1Var, b03Var, 8));
        }
        l();
        la3 la3Var = this.k;
        la3Var.getClass();
        qb3 qb3Var = this.F0;
        qb3Var.m = la3Var;
        ig igVar = this.l;
        igVar.getClass();
        qb3Var.g.B = igVar;
    }

    public final void r0() {
        long j;
        long jMax;
        ArrayDeque arrayDeque;
        long j2;
        u();
        qb3 qb3Var = this.F0;
        hb3 hb3Var = qb3Var.d0;
        if (!qb3Var.h() || qb3Var.G) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(qb3Var.g.b(), qz1.s(qb3Var.p.e, qb3Var.j()));
            while (true) {
                arrayDeque = qb3Var.h;
                if (arrayDeque.isEmpty() || jMin < ((jb3) arrayDeque.getFirst()).c) {
                    break;
                } else {
                    qb3Var.x = (jb3) arrayDeque.remove();
                }
            }
            jb3 jb3Var = qb3Var.x;
            long jT = jMin - jb3Var.c;
            long jV = qz1.v(jT, jb3Var.a.a);
            if (arrayDeque.isEmpty()) {
                ne1 ne1Var = (ne1) hb3Var.h;
                if (ne1Var.h()) {
                    long j3 = ne1Var.o;
                    if (j3 >= 1024) {
                        long j4 = ne1Var.n;
                        be1 be1Var = ne1Var.j;
                        be1Var.getClass();
                        int i = be1Var.k * be1Var.b;
                        j = Long.MIN_VALUE;
                        long j5 = j4 - ((long) (i + i));
                        int i2 = ne1Var.h.a;
                        int i3 = ne1Var.g.a;
                        jT = i2 == i3 ? qz1.t(jT, j5, j3, RoundingMode.DOWN) : qz1.t(jT, j5 * ((long) i2), j3 * ((long) i3), RoundingMode.DOWN);
                    } else {
                        j = Long.MIN_VALUE;
                        jT = (long) (((double) ne1Var.c) * jT);
                    }
                } else {
                    j = Long.MIN_VALUE;
                }
                jb3 jb3Var2 = qb3Var.x;
                j2 = jb3Var2.b + jT;
                jb3Var2.d = jT - jV;
            } else {
                j = Long.MIN_VALUE;
                jb3 jb3Var3 = qb3Var.x;
                j2 = jb3Var3.b + jV + jb3Var3.d;
            }
            long j6 = ((sb3) hb3Var.g).l;
            jMax = qz1.s(qb3Var.p.e, j6) + j2;
            long j7 = qb3Var.X;
            if (j6 > j7) {
                long jS = qz1.s(qb3Var.p.e, j6 - j7);
                qb3Var.X = j6;
                qb3Var.Y += jS;
                if (qb3Var.Z == null) {
                    qb3Var.Z = new Handler(Looper.myLooper());
                }
                qb3Var.Z.removeCallbacksAndMessages(null);
                qb3Var.Z.postDelayed(new s73(2, qb3Var), 100L);
            }
        }
        if (jMax != j) {
            if (!this.M0) {
                jMax = Math.max(this.L0, jMax);
            }
            this.L0 = jMax;
            this.M0 = false;
        }
    }

    @Override // defpackage.yc3
    public final boolean t() {
        return this.F0.s();
    }

    @Override // defpackage.yc3
    public final boolean u() {
        if (!this.u0) {
            return false;
        }
        qb3 qb3Var = this.F0;
        if (qb3Var.h()) {
            return qb3Var.M && !qb3Var.s();
        }
        return true;
    }

    @Override // defpackage.yc3
    public final g83 m0() {
        return this;
    }
}
