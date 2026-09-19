package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ea3 implements r93 {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public final Context f;
    public final ba3 h;
    public final PlaybackSession i;
    public String o;
    public PlaybackMetrics.Builder p;
    public q43 s;
    public z61 t;
    public z61 u;
    public z61 v;
    public de3 w;
    public de3 x;
    public de3 y;
    public boolean z;
    public final Executor g = ej1.r();
    public final ex0 k = new ex0();
    public final su0 l = new su0();
    public final HashMap n = new HashMap();
    public final HashMap m = new HashMap();
    public final long j = SystemClock.elapsedRealtime();
    public int q = 0;
    public int r = 0;

    public ea3(Context context, PlaybackSession playbackSession) {
        this.f = context.getApplicationContext();
        this.i = playbackSession;
        ba3 ba3Var = new ba3();
        this.h = ba3Var;
        ba3Var.d = this;
    }

    @Override // defpackage.r93
    public final void b(b03 b03Var) {
        this.B += b03Var.g;
        this.C += b03Var.e;
    }

    public final void c(int i, long j, de3 de3Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = da3.o(i).setTimeSinceCreatedMillis(j - this.j);
        if (de3Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = de3Var.l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = de3Var.m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = de3Var.j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = de3Var.i;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = de3Var.t;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = de3Var.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = de3Var.E;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = de3Var.F;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = de3Var.d;
            if (str4 != null) {
                String str5 = qz1.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = de3Var.x;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.E = true;
        this.g.execute(new u52(this, 18, timeSinceCreatedMillis.build()));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    public final void e(ox0 ox0Var, yd3 yd3Var) {
        int iE;
        Matcher matcher;
        String strGroup;
        int i;
        PlaybackMetrics.Builder builder = this.p;
        if (yd3Var == null || (iE = ox0Var.e(yd3Var.a)) == -1) {
            return;
        }
        su0 su0Var = this.l;
        int i2 = 0;
        ox0Var.d(iE, su0Var, false);
        int i3 = su0Var.c;
        ex0 ex0Var = this.k;
        ox0Var.b(i3, ex0Var, 0L);
        of0 of0Var = ex0Var.b.b;
        if (of0Var != null) {
            Uri uri = of0Var.a;
            String str = qz1.a;
            String scheme = uri.getScheme();
            if (scheme == null || !(dq.J("rtsp", scheme) || dq.J("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (iLastIndexOf >= 0) {
                        switch (dq.v(lastPathSegment.substring(iLastIndexOf + 1))) {
                            case "ism":
                                i = 1;
                                break;
                            case "mpd":
                                i = 0;
                                break;
                            case "isml":
                                i = 1;
                                break;
                            case "m3u8":
                                i = 2;
                                break;
                            default:
                                i = 4;
                                break;
                        }
                        if (i == 4) {
                            Pattern pattern = qz1.c;
                            String path = uri.getPath();
                            path.getClass();
                            matcher = pattern.matcher(path);
                            if (matcher.matches()) {
                                strGroup = matcher.group(2);
                                if (strGroup == null) {
                                    i2 = 1;
                                } else if (!strGroup.contains("format=mpd-time-csf")) {
                                    if (strGroup.contains("format=m3u8-aapl")) {
                                        i2 = 2;
                                    } else {
                                        i2 = 1;
                                    }
                                }
                            } else {
                                i2 = 4;
                            }
                        } else {
                            i2 = i;
                        }
                    } else {
                        Pattern pattern2 = qz1.c;
                        String path2 = uri.getPath();
                        path2.getClass();
                        matcher = pattern2.matcher(path2);
                        if (matcher.matches()) {
                            strGroup = matcher.group(2);
                            if (strGroup == null) {
                                i2 = 1;
                            } else if (!strGroup.contains("format=mpd-time-csf")) {
                                if (strGroup.contains("format=m3u8-aapl")) {
                                    i2 = 2;
                                } else {
                                    i2 = 1;
                                }
                            }
                        } else {
                            i2 = 4;
                        }
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
            if (i2 == 0) {
                i2 = 3;
            } else if (i2 != 1) {
                i2 = i2 != 2 ? 1 : 4;
            } else {
                i2 = 5;
            }
        }
        builder.setStreamType(i2);
        long j = ex0Var.j;
        if (j != -9223372036854775807L && !ex0Var.i && !ex0Var.g && !ex0Var.b()) {
            builder.setMediaDurationMillis(qz1.q(j));
        }
        builder.setPlaybackType(true != ex0Var.b() ? 1 : 2);
        this.E = true;
    }

    public final void f() {
        PlaybackMetrics.Builder builder = this.p;
        if (builder != null && this.E) {
            builder.setAudioUnderrunCount(this.D);
            this.p.setVideoFramesDropped(this.B);
            this.p.setVideoFramesPlayed(this.C);
            Long l = (Long) this.m.get(this.o);
            this.p.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.n.get(this.o);
            this.p.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.p.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.g.execute(new u52(this, 19, this.p.build()));
        }
        this.p = null;
        this.o = null;
        this.D = 0;
        this.B = 0;
        this.C = 0;
        this.w = null;
        this.x = null;
        this.y = null;
        this.E = false;
    }

    @Override // defpackage.r93
    public final void h(int i) {
        if (i == 1) {
            this.z = true;
        }
    }

    @Override // defpackage.r93
    public final void i(q93 q93Var, int i, long j) {
        yd3 yd3Var = q93Var.d;
        if (yd3Var != null) {
            String strA = this.h.a(q93Var.b, yd3Var);
            HashMap map = this.n;
            Long l = (Long) map.get(strA);
            HashMap map2 = this.m;
            Long l2 = (Long) map2.get(strA);
            map.put(strA, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strA, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // defpackage.r93
    public final void j(q43 q43Var) {
        this.s = q43Var;
    }

    @Override // defpackage.r93
    public final void k(i61 i61Var) {
        z61 z61Var = this.t;
        if (z61Var != null) {
            de3 de3Var = (de3) z61Var.g;
            if (de3Var.u == -1) {
                uc3 uc3Var = new uc3(de3Var);
                uc3Var.s = i61Var.a;
                uc3Var.t = i61Var.b;
                this.t = new z61(new de3(uc3Var), 28, (String) z61Var.h);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0210 A[PHI: r5
  0x0210: PHI (r5v18 int) = (r5v7 int), (r5v42 int) binds: [B:206:0x02f7, B:134:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x0213 A[PHI: r5
  0x0213: PHI (r5v17 int) = (r5v7 int), (r5v42 int) binds: [B:206:0x02f7, B:134:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0216 A[PHI: r5
  0x0216: PHI (r5v16 int) = (r5v7 int), (r5v42 int) binds: [B:206:0x02f7, B:134:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x0219 A[PHI: r5
  0x0219: PHI (r5v15 int) = (r5v7 int), (r5v42 int) binds: [B:206:0x02f7, B:134:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x0236  */
    /* JADX WARN: Code duplicated, block: B:217:0x0349  */
    @Override // defpackage.r93
    public final void m(t33 t33Var, un1 un1Var) {
        int i;
        int errorCode;
        int i2;
        int i3;
        int i4;
        int i5;
        ea3 ea3Var;
        boolean z;
        va3 va3Var;
        int i6;
        int i7;
        if (((cc3) un1Var.g).a.size() == 0) {
            return;
        }
        for (int i8 = 0; i8 < ((cc3) un1Var.g).a.size(); i8++) {
            int iA = ((cc3) un1Var.g).a(i8);
            q93 q93Var = (q93) ((SparseArray) un1Var.h).get(iA);
            q93Var.getClass();
            ba3 ba3Var = this.h;
            if (iA == 0) {
                synchronized (ba3Var) {
                    try {
                        if (ba3Var.d == null) {
                            throw null;
                        }
                        ox0 ox0Var = ba3Var.e;
                        ba3Var.e = q93Var.b;
                        Iterator it = ba3Var.c.values().iterator();
                        while (it.hasNext()) {
                            aa3 aa3Var = (aa3) it.next();
                            if (!aa3Var.a(ox0Var, ba3Var.e) || aa3Var.b(q93Var)) {
                                it.remove();
                                if (aa3Var.e) {
                                    if (aa3Var.a.equals(ba3Var.f)) {
                                        ba3Var.d(aa3Var);
                                    }
                                    ba3Var.d.q(q93Var, aa3Var.a);
                                }
                            }
                        }
                        ba3Var.c(q93Var);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iA == 11) {
                synchronized (ba3Var) {
                    try {
                        if (ba3Var.d == null) {
                            throw null;
                        }
                        Iterator it2 = ba3Var.c.values().iterator();
                        while (it2.hasNext()) {
                            aa3 aa3Var2 = (aa3) it2.next();
                            if (aa3Var2.b(q93Var)) {
                                it2.remove();
                                if (aa3Var2.e) {
                                    if (aa3Var2.a.equals(ba3Var.f)) {
                                        ba3Var.d(aa3Var2);
                                    }
                                    ba3Var.d.q(q93Var, aa3Var2.a);
                                }
                            }
                        }
                        ba3Var.c(q93Var);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                ba3Var.b(q93Var);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (un1Var.v(0)) {
            q93 q93Var2 = (q93) ((SparseArray) un1Var.h).get(0);
            q93Var2.getClass();
            if (this.p != null) {
                e(q93Var2.b, q93Var2.d);
            }
        }
        if (un1Var.v(2) && this.p != null) {
            vj2 vj2Var = t33Var.E1().a;
            int size = vj2Var.size();
            int i9 = 0;
            loop3: while (true) {
                if (i9 >= size) {
                    va3Var = null;
                    break;
                }
                z11 z11Var = (z11) vj2Var.get(i9);
                int i10 = 0;
                while (true) {
                    i7 = i9 + 1;
                    if (i10 < z11Var.a) {
                        if (z11Var.e[i10] && (va3Var = z11Var.b.d[i10].q) != null) {
                            break loop3;
                        } else {
                            i10++;
                        }
                    }
                }
                i9 = i7;
            }
            if (va3Var != null) {
                PlaybackMetrics.Builder builder = this.p;
                String str = qz1.a;
                PlaybackMetrics.Builder builderC = ca3.c(builder);
                int i11 = 0;
                while (true) {
                    if (i11 >= va3Var.i) {
                        i6 = 1;
                        break;
                    }
                    UUID uuid = va3Var.f[i11].g;
                    if (uuid.equals(be2.d)) {
                        i6 = 3;
                        break;
                    } else if (uuid.equals(be2.e)) {
                        i6 = 2;
                        break;
                    } else {
                        if (uuid.equals(be2.c)) {
                            i6 = 6;
                            break;
                        }
                        i11++;
                    }
                }
                builderC.setDrmType(i6);
            }
        }
        if (un1Var.v(1011)) {
            this.D++;
        }
        q43 q43Var = this.s;
        if (q43Var == null) {
            i2 = 2;
        } else {
            Context context = this.f;
            int i12 = q43Var.f;
            int i13 = 20;
            if (i12 == 1001) {
                errorCode = 0;
                i = 20;
            } else {
                boolean z2 = q43Var.h == 1;
                int i14 = q43Var.l;
                Throwable cause = q43Var.getCause();
                cause.getClass();
                int i15 = 28;
                int i16 = 24;
                if (!(cause instanceof IOException)) {
                    if (z2 && (i14 == 0 || i14 == 1)) {
                        i = 35;
                    } else {
                        if (z2 && i14 == 3) {
                            i16 = 15;
                        } else if (z2 && i14 == 2) {
                            i = 23;
                        } else if (cause instanceof wc3) {
                            errorCode = qz1.i(((wc3) cause).h);
                            i = 13;
                        } else {
                            i = 14;
                            if (cause instanceof oc3) {
                                errorCode = ((oc3) cause).f;
                            } else if (!(cause instanceof OutOfMemoryError)) {
                                if (cause instanceof ab3) {
                                    errorCode = ((ab3) cause).f;
                                    i = 17;
                                } else if (cause instanceof bb3) {
                                    errorCode = ((bb3) cause).f;
                                    i = 18;
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    switch (qz1.e(errorCode)) {
                                        case 6002:
                                            i15 = 24;
                                            break;
                                        case 6003:
                                            break;
                                        case 6004:
                                            i15 = 25;
                                            break;
                                        case 6005:
                                            i15 = 26;
                                            break;
                                        default:
                                            i15 = 27;
                                            break;
                                    }
                                    i = i15;
                                } else {
                                    i16 = 22;
                                }
                            }
                        }
                        i = i16;
                    }
                    errorCode = 0;
                } else if (cause instanceof jl2) {
                    errorCode = ((jl2) cause).h;
                    i = 5;
                } else if (cause instanceof no0) {
                    errorCode = 0;
                    i = 11;
                } else {
                    boolean z3 = cause instanceof ik2;
                    if (!z3 && !(cause instanceof cq2)) {
                        if (i12 == 1002) {
                            i16 = 21;
                        } else if (cause instanceof vb3) {
                            Throwable cause2 = cause.getCause();
                            cause2.getClass();
                            if (cause2 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = qz1.i(((MediaDrm.MediaDrmStateException) cause2).getDiagnosticInfo());
                                switch (qz1.e(errorCode)) {
                                    case 6002:
                                        i15 = 24;
                                        break;
                                    case 6003:
                                        break;
                                    case 6004:
                                        i15 = 25;
                                        break;
                                    case 6005:
                                        i15 = 26;
                                        break;
                                    default:
                                        i15 = 27;
                                        break;
                                }
                                i = i15;
                            } else if (cause2 instanceof MediaDrmResetException) {
                                i = 27;
                            } else if (!(cause2 instanceof NotProvisionedException)) {
                                if (cause2 instanceof DeniedByServerException) {
                                    i16 = 29;
                                } else if (cause2 instanceof fc3) {
                                    i = 23;
                                } else {
                                    i16 = 30;
                                }
                            }
                        } else if ((cause instanceof mi2) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            Throwable cause4 = cause3.getCause();
                            i16 = 31;
                            if ((cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) {
                                i16 = 32;
                            }
                        } else {
                            i = 9;
                        }
                        i = i16;
                    } else if (nv1.a(context).b() == 1) {
                        i = 3;
                    } else {
                        Throwable cause5 = cause.getCause();
                        if (cause5 instanceof UnknownHostException) {
                            errorCode = 0;
                            i = 6;
                        } else if (cause5 instanceof SocketTimeoutException) {
                            errorCode = 0;
                            i = 7;
                        } else if (z3 && ((ik2) cause).g == 1) {
                            errorCode = 0;
                            i = 4;
                        } else {
                            errorCode = 0;
                            i = 8;
                        }
                    }
                    errorCode = 0;
                }
            }
            this.g.execute(new u52(this, i13, da3.j().setTimeSinceCreatedMillis(jElapsedRealtime - this.j).setErrorCode(i).setSubErrorCode(errorCode).setException(q43Var).build()));
            this.E = true;
            this.s = null;
            i2 = 2;
        }
        if (un1Var.v(i2)) {
            l21 l21VarE1 = t33Var.E1();
            boolean zA = l21VarE1.a(i2);
            boolean zA2 = l21VarE1.a(1);
            boolean zA3 = l21VarE1.a(3);
            if (zA || zA2) {
                z = zA3;
            } else if (zA3) {
                z = true;
            } else {
                i3 = 4;
            }
            if (zA || Objects.equals(this.w, null)) {
                i3 = 4;
            } else {
                int i17 = this.w == null ? 1 : 0;
                this.w = null;
                i3 = 4;
                c(1, jElapsedRealtime, null, i17);
            }
            if (!zA2 && !Objects.equals(this.x, null)) {
                int i18 = this.x == null ? 1 : 0;
                this.x = null;
                c(0, jElapsedRealtime, null, i18);
            }
            if (!z && !Objects.equals(this.y, null)) {
                int i19 = this.y == null ? 1 : 0;
                this.y = null;
                c(2, jElapsedRealtime, null, i19);
            }
        } else {
            i3 = 4;
        }
        if (r(this.t)) {
            de3 de3Var = (de3) this.t.g;
            if (de3Var.u != -1) {
                if (!Objects.equals(this.w, de3Var)) {
                    int i20 = this.w == null ? 1 : 0;
                    this.w = de3Var;
                    c(1, jElapsedRealtime, de3Var, i20);
                }
                this.t = 0;
            }
        }
        if (r(this.u)) {
            de3 de3Var2 = (de3) this.u.g;
            if (!Objects.equals(this.x, de3Var2)) {
                int i21 = this.x == null ? 1 : 0;
                this.x = de3Var2;
                c(0, jElapsedRealtime, de3Var2, i21);
            }
            this.u = r4;
        }
        if (r(this.v)) {
            de3 de3Var3 = (de3) this.v.g;
            if (!Objects.equals(this.y, de3Var3)) {
                int i22 = this.y == null ? 1 : 0;
                this.y = de3Var3;
                c(2, jElapsedRealtime, de3Var3, i22);
            }
            this.v = r4;
        }
        switch (nv1.a(this.f).b()) {
            case 0:
                i4 = 0;
                break;
            case 1:
                i4 = 9;
                break;
            case 2:
                i4 = 2;
                break;
            case 3:
                i4 = i3;
                break;
            case 4:
                i4 = 5;
                break;
            case 5:
                i4 = 6;
                break;
            case 6:
            case 8:
            default:
                i4 = 1;
                break;
            case 7:
                i4 = 3;
                break;
            case 9:
                i4 = 8;
                break;
            case 10:
                i4 = 7;
                break;
        }
        if (i4 != this.r) {
            this.r = i4;
            this.g.execute(new u52(this, 16, da3.f().setNetworkType(i4).setTimeSinceCreatedMillis(jElapsedRealtime - this.j).build()));
        }
        if (t33Var.y1() != 2) {
            this.z = false;
        }
        d93 d93Var = (d93) t33Var;
        d93Var.i.b();
        p73 p73Var = d93Var.h;
        p73Var.g2();
        if (p73Var.b0.f == null) {
            this.A = false;
        } else if (un1Var.v(10)) {
            this.A = true;
        }
        int iY1 = t33Var.y1();
        if (this.z) {
            i5 = 5;
        } else if (this.A) {
            i5 = 13;
        } else if (iY1 == i3) {
            i5 = 11;
        } else {
            i5 = 12;
            if (iY1 == 2) {
                int i23 = this.q;
                if (i23 == 0 || i23 == 2 || i23 == 12) {
                    i5 = 2;
                } else if (t33Var.B1()) {
                    i5 = t33Var.z1() != 0 ? 10 : 6;
                } else {
                    i5 = 7;
                }
            } else if (iY1 == 3) {
                i5 = t33Var.B1() ? t33Var.z1() != 0 ? 9 : 3 : i3;
            } else if (iY1 != 1 || this.q == 0) {
                i5 = this.q;
            }
        }
        if (this.q != i5) {
            this.q = i5;
            this.E = true;
            this.g.execute(new u52(this, 17, da3.n().setState(this.q).setTimeSinceCreatedMillis(jElapsedRealtime - this.j).build()));
        }
        if (un1Var.v(1028)) {
            ba3 ba3Var2 = this.h;
            q93 q93Var3 = (q93) ((SparseArray) un1Var.h).get(1028);
            q93Var3.getClass();
            synchronized (ba3Var2) {
                try {
                    String str2 = ba3Var2.f;
                    if (str2 != null) {
                        aa3 aa3Var3 = (aa3) ba3Var2.c.get(str2);
                        if (aa3Var3 == null) {
                            throw r4;
                        }
                        ba3Var2.d(aa3Var3);
                    }
                    Iterator it3 = ba3Var2.c.values().iterator();
                    while (it3.hasNext()) {
                        aa3 aa3Var4 = (aa3) it3.next();
                        it3.remove();
                        if (aa3Var4.e && (ea3Var = ba3Var2.d) != null) {
                            ea3Var.q(q93Var3, aa3Var4.a);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.r93
    public final void n(q93 q93Var, vd3 vd3Var) {
        yd3 yd3Var = q93Var.d;
        if (yd3Var == null) {
            return;
        }
        de3 de3Var = vd3Var.b;
        de3Var.getClass();
        z61 z61Var = new z61(de3Var, 28, this.h.a(q93Var.b, yd3Var));
        int i = vd3Var.a;
        if (i != 0) {
            if (i == 1) {
                this.u = z61Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.v = z61Var;
                return;
            }
        }
        this.t = z61Var;
    }

    public final void q(q93 q93Var, String str) {
        yd3 yd3Var = q93Var.d;
        if ((yd3Var == null || !yd3Var.b()) && str.equals(this.o)) {
            f();
        }
        this.m.remove(str);
        this.n.remove(str);
    }

    public final boolean r(z61 z61Var) {
        String str;
        if (z61Var == null) {
            return false;
        }
        ba3 ba3Var = this.h;
        String str2 = (String) z61Var.h;
        synchronized (ba3Var) {
            str = ba3Var.f;
        }
        return str2.equals(str);
    }

    @Override // defpackage.r93
    public final void o(IOException iOException) {
    }
}
