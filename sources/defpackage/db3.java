package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class db3 {
    public long A;
    public ig B;
    public final j52 a;
    public final long[] b;
    public AudioTrack c;
    public cb3 d;
    public int e;
    public long f;
    public float g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public Method l;
    public long m;
    public boolean n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public long z;

    public db3(j52 j52Var) {
        this.a = j52Var;
        try {
            this.l = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = ig.k;
    }

    public final void a(AudioTrack audioTrack, int i, int i2, int i3, boolean z) {
        long jS;
        this.c = audioTrack;
        this.d = new cb3(audioTrack, this.a);
        this.e = audioTrack.getSampleRate();
        boolean zA = qz1.a(i);
        this.n = zA;
        if (zA) {
            jS = qz1.s(this.e, i3 / i2);
        } else {
            jS = -9223372036854775807L;
        }
        this.f = jS;
        this.q = 0L;
        this.r = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.m = 0L;
        this.g = 1.0f;
        this.i = -9223372036854775807L;
        this.y = z;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0388  */
    /* JADX WARN: Code duplicated, block: B:101:0x038a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0392  */
    /* JADX WARN: Code duplicated, block: B:109:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:111:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:116:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:120:0x03df  */
    /* JADX WARN: Code duplicated, block: B:124:0x040c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0418  */
    /* JADX WARN: Code duplicated, block: B:128:0x0425  */
    /* JADX WARN: Code duplicated, block: B:131:0x0429  */
    /* JADX WARN: Code duplicated, block: B:57:0x029a  */
    /* JADX WARN: Code duplicated, block: B:59:0x029d  */
    /* JADX WARN: Code duplicated, block: B:61:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:67:0x02ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x02af  */
    /* JADX WARN: Code duplicated, block: B:69:0x02b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0303  */
    /* JADX WARN: Code duplicated, block: B:80:0x0310  */
    /* JADX WARN: Code duplicated, block: B:81:0x0315  */
    /* JADX WARN: Code duplicated, block: B:83:0x031c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0326  */
    /* JADX WARN: Code duplicated, block: B:86:0x0333  */
    /* JADX WARN: Code duplicated, block: B:88:0x033a  */
    /* JADX WARN: Code duplicated, block: B:94:0x035e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0361  */
    /* JADX WARN: Code duplicated, block: B:97:0x037d  */
    public final long b() {
        AudioTrack audioTrack;
        long j;
        long j2;
        int i;
        long jNanoTime;
        cb3 cb3Var;
        long jD;
        int playState;
        long j3;
        long j4;
        long jCurrentTimeMillis;
        bz1 bz1Var;
        un1 un1Var;
        Handler handler;
        long j5;
        long jV;
        long j6;
        int i2;
        long j7;
        cb3 cb3Var2;
        wl0 wl0Var;
        float f;
        int i3;
        int i4;
        AudioTimestamp audioTimestamp;
        wl0 wl0Var2;
        long j8;
        wl0 wl0Var3;
        long j9;
        long j10;
        int i5;
        float f2;
        Method method;
        db3 db3Var = this;
        AudioTrack audioTrack2 = db3Var.c;
        audioTrack2.getClass();
        long j11 = 1000;
        if (audioTrack2.getPlayState() == 3) {
            db3Var.B.getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            if (jNanoTime2 - db3Var.k >= 30000) {
                long jS = qz1.s(db3Var.e, db3Var.e());
                if (jS != 0) {
                    int i6 = db3Var.s;
                    long jW = qz1.w(jS, db3Var.g) - jNanoTime2;
                    long[] jArr = db3Var.b;
                    jArr[i6] = jW;
                    db3Var.s = (db3Var.s + 1) % 10;
                    int i7 = db3Var.t;
                    if (i7 < 10) {
                        db3Var.t = i7 + 1;
                    }
                    db3Var.k = jNanoTime2;
                    db3Var.j = 0L;
                    int i8 = 0;
                    while (true) {
                        int i9 = db3Var.t;
                        if (i8 >= i9) {
                            break;
                        }
                        db3Var.j = (jArr[i8] / ((long) i9)) + db3Var.j;
                        i8++;
                        j11 = j11;
                    }
                } else {
                    audioTrack = audioTrack2;
                    j = 1000;
                    j2 = 0;
                    i = 0;
                }
                db3Var.B.getClass();
                jNanoTime = System.nanoTime() / j;
                cb3Var = db3Var.d;
                cb3Var.getClass();
                if (cb3Var.d == 2) {
                    i = 1;
                }
                if (i != 0) {
                    float f3 = db3Var.g;
                    wl0 wl0Var4 = cb3Var.a;
                    jD = qz1.v(jNanoTime - (((AudioTimestamp) wl0Var4.e).nanoTime / j), f3) + qz1.s(cb3Var.b, wl0Var4.c);
                } else {
                    jD = db3Var.d(jNanoTime);
                }
                playState = audioTrack.getPlayState();
                if (playState == 3) {
                    if (i == 0 || ((i2 = cb3Var.d) != 0 && i2 != 1)) {
                        db3Var.c(jD);
                    }
                    j3 = db3Var.A;
                    if (j3 != -9223372036854775807L) {
                        j5 = jD - db3Var.z;
                        jV = qz1.v(jNanoTime - j3, db3Var.g);
                        j6 = db3Var.z + jV;
                        long jAbs = Math.abs(j6 - jD);
                        if (j5 != j2 && jAbs < 1000000) {
                            long j12 = (jV * 10) / 100;
                            jD = Math.max(j6 - j12, Math.min(jD, j6 + j12));
                        }
                    }
                    if (!db3Var.y && !db3Var.h) {
                        j4 = db3Var.z;
                        if (j4 != -9223372036854775807L && jD > j4) {
                            db3Var.h = true;
                            long j13 = jD - j4;
                            String str = qz1.a;
                            long jW2 = qz1.w(qz1.q(j13), db3Var.g);
                            db3Var.B.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis() - qz1.q(jW2);
                            bz1Var = ((qb3) db3Var.a.f).n;
                            if (bz1Var != null) {
                                un1Var = ((rb3) bz1Var.f).E0;
                                handler = (Handler) un1Var.g;
                                if (handler != null) {
                                    handler.post(new ra3(un1Var, jCurrentTimeMillis));
                                }
                            }
                        }
                    }
                    db3Var.A = jNanoTime;
                    db3Var.z = jD;
                } else if (playState == 1) {
                    db3Var.c(jD);
                    return jD;
                }
                return jD;
            }
            j = j11;
            if (!db3Var.n || (method = db3Var.l) == null) {
                j7 = 5000000;
            } else {
                j7 = 5000000;
                if (jNanoTime2 - db3Var.o >= 500000) {
                    try {
                        AudioTrack audioTrack3 = db3Var.c;
                        if (audioTrack3 == null) {
                            throw null;
                        }
                        Integer num = (Integer) method.invoke(audioTrack3, null);
                        String str2 = qz1.a;
                        long jIntValue = (((long) num.intValue()) * j) - db3Var.f;
                        db3Var.m = jIntValue;
                        long jMax = Math.max(jIntValue, 0L);
                        db3Var.m = jMax;
                        if (jMax > 5000000) {
                            StringBuilder sb = new StringBuilder(String.valueOf(jMax).length() + 41);
                            sb.append("Ignoring impossibly large audio latency: ");
                            sb.append(jMax);
                            s90.Q("DefaultAudioSink", sb.toString());
                            db3Var.m = 0L;
                        }
                        db3Var.o = jNanoTime2;
                    } catch (Exception unused) {
                        db3Var.l = null;
                    }
                }
            }
            cb3 cb3Var3 = db3Var.d;
            cb3Var3.getClass();
            int i10 = cb3Var3.b;
            wl0 wl0Var5 = cb3Var3.a;
            float f4 = db3Var.g;
            j2 = 0;
            long jD2 = db3Var.d(jNanoTime2);
            j52 j52Var = cb3Var3.c;
            if (jNanoTime2 - cb3Var3.g >= cb3Var3.f) {
                cb3Var3.g = jNanoTime2;
                AudioTrack audioTrack4 = (AudioTrack) wl0Var5.d;
                AudioTimestamp audioTimestamp2 = (AudioTimestamp) wl0Var5.e;
                boolean timestamp = audioTrack4.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    long j14 = audioTimestamp2.framePosition;
                    audioTrack = audioTrack2;
                    if (wl0Var5.b > j14) {
                        wl0Var5.a++;
                    }
                    wl0Var5.b = j14;
                    wl0Var5.c = j14 + (wl0Var5.a << 32);
                } else {
                    audioTrack = audioTrack2;
                }
                if (timestamp != 0) {
                    long j15 = audioTimestamp2.nanoTime / j;
                    long jV2 = qz1.v(jNanoTime2 - (((AudioTimestamp) wl0Var5.e).nanoTime / j), f4) + qz1.s(i10, wl0Var5.c);
                    if (Math.abs(j15 - jNanoTime2) > j7) {
                        long j16 = wl0Var5.c;
                        qb3 qb3Var = (qb3) j52Var.f;
                        long jI = qb3Var.i();
                        long j17 = qb3Var.j();
                        int length = String.valueOf(j16).length();
                        int length2 = String.valueOf(j15).length();
                        StringBuilder sb2 = new StringBuilder(length + 52 + length2 + 2 + String.valueOf(jNanoTime2).length() + 2 + String.valueOf(jD2).length() + 2 + String.valueOf(jI).length() + 2 + String.valueOf(j17).length());
                        ec.w(sb2, "Spurious audio timestamp (system clock mismatch): ", j16, ", ");
                        sb2.append(j15);
                        ec.w(sb2, ", ", jNanoTime2, ", ");
                        sb2.append(jD2);
                        ec.w(sb2, ", ", jI, ", ");
                        sb2.append(j17);
                        s90.Q("DefaultAudioSink", sb2.toString());
                        cb3Var2 = cb3Var3;
                        cb3Var2.a(4);
                    } else {
                        i10 = i10;
                        cb3Var2 = cb3Var3;
                        if (Math.abs(jV2 - jD2) > j7) {
                            long j18 = wl0Var5.c;
                            qb3 qb3Var2 = (qb3) j52Var.f;
                            long jI2 = qb3Var2.i();
                            audioTimestamp2 = audioTimestamp2;
                            long j19 = qb3Var2.j();
                            int length3 = String.valueOf(j18).length();
                            int length4 = String.valueOf(j15).length();
                            int i11 = length3 + 54 + length4;
                            f = f4;
                            int length5 = i11 + 2 + String.valueOf(jNanoTime2).length() + 2 + String.valueOf(jD2).length() + 2 + String.valueOf(jI2).length() + 2;
                            wl0Var = wl0Var5;
                            StringBuilder sb3 = new StringBuilder(length5 + String.valueOf(j19).length());
                            ec.w(sb3, "Spurious audio timestamp (frame position mismatch): ", j18, ", ");
                            sb3.append(j15);
                            ec.w(sb3, ", ", jNanoTime2, ", ");
                            sb3.append(jD2);
                            ec.w(sb3, ", ", jI2, ", ");
                            sb3.append(j19);
                            s90.Q("DefaultAudioSink", sb3.toString());
                            cb3Var2.a(4);
                        } else {
                            audioTimestamp2 = audioTimestamp2;
                            wl0Var = wl0Var5;
                            f = f4;
                            if (cb3Var2.d == 4) {
                                i3 = 0;
                                cb3Var2.a(0);
                            }
                        }
                        i3 = 0;
                    }
                    i4 = cb3Var2.d;
                    if (i4 != 0) {
                        i = i3;
                        audioTimestamp = audioTimestamp2;
                        wl0Var2 = wl0Var;
                        if (timestamp != 0) {
                            j8 = audioTimestamp.nanoTime;
                            if (j8 / j >= cb3Var2.e) {
                                cb3Var2.h = wl0Var2.c;
                                cb3Var2.i = j8 / j;
                                cb3Var2.a(1);
                            }
                        } else if (jNanoTime2 - cb3Var2.e > 500000) {
                            cb3Var2.a(3);
                        }
                    } else if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3 && timestamp) {
                                cb3Var2.a(i3);
                            }
                        } else if (timestamp == 0) {
                            cb3Var2.a(i3);
                        }
                        i = i3;
                    } else if (timestamp != 0) {
                        wl0Var3 = wl0Var;
                        j9 = wl0Var3.c;
                        j10 = cb3Var2.h;
                        if (j9 <= j10) {
                            i5 = i10;
                            f2 = f;
                            if (Math.abs((qz1.v(jNanoTime2 - (((AudioTimestamp) wl0Var3.e).nanoTime / j), f2) + qz1.s(i5, wl0Var3.c)) - (qz1.v(jNanoTime2 - cb3Var2.i, f2) + qz1.s(i5, j10))) < j) {
                                cb3Var2.a(2);
                            } else if (jNanoTime2 - cb3Var2.e > 2000000) {
                                cb3Var2.a(3);
                            } else {
                                cb3Var2.h = wl0Var3.c;
                                cb3Var2.i = audioTimestamp2.nanoTime / j;
                            }
                        } else if (jNanoTime2 - cb3Var2.e > 2000000) {
                            cb3Var2.a(3);
                        } else {
                            cb3Var2.h = wl0Var3.c;
                            cb3Var2.i = audioTimestamp2.nanoTime / j;
                        }
                    } else {
                        i = 0;
                        cb3Var2.a(0);
                    }
                    db3Var = this;
                    db3Var.B.getClass();
                    jNanoTime = System.nanoTime() / j;
                    cb3Var = db3Var.d;
                    cb3Var.getClass();
                    if (cb3Var.d == 2) {
                        i = 1;
                    }
                    if (i != 0) {
                        float f5 = db3Var.g;
                        wl0 wl0Var6 = cb3Var.a;
                        jD = qz1.v(jNanoTime - (((AudioTimestamp) wl0Var6.e).nanoTime / j), f5) + qz1.s(cb3Var.b, wl0Var6.c);
                    } else {
                        jD = db3Var.d(jNanoTime);
                    }
                    playState = audioTrack.getPlayState();
                    if (playState == 3) {
                        if (i == 0) {
                            db3Var.c(jD);
                        } else {
                            db3Var.c(jD);
                        }
                        j3 = db3Var.A;
                        if (j3 != -9223372036854775807L) {
                            j5 = jD - db3Var.z;
                            jV = qz1.v(jNanoTime - j3, db3Var.g);
                            j6 = db3Var.z + jV;
                            long jAbs2 = Math.abs(j6 - jD);
                            if (j5 != j2) {
                                long j110 = (jV * 10) / 100;
                                jD = Math.max(j6 - j110, Math.min(jD, j6 + j110));
                            }
                        }
                        if (!db3Var.y) {
                            j4 = db3Var.z;
                            if (j4 != -9223372036854775807L) {
                                db3Var.h = true;
                                long j111 = jD - j4;
                                String str3 = qz1.a;
                                long jW3 = qz1.w(qz1.q(j111), db3Var.g);
                                db3Var.B.getClass();
                                jCurrentTimeMillis = System.currentTimeMillis() - qz1.q(jW3);
                                bz1Var = ((qb3) db3Var.a.f).n;
                                if (bz1Var != null) {
                                    un1Var = ((rb3) bz1Var.f).E0;
                                    handler = (Handler) un1Var.g;
                                    if (handler != null) {
                                        handler.post(new ra3(un1Var, jCurrentTimeMillis));
                                    }
                                }
                            }
                        }
                        db3Var.A = jNanoTime;
                        db3Var.z = jD;
                    } else if (playState == 1) {
                        db3Var.c(jD);
                        return jD;
                    }
                    return jD;
                }
                cb3Var2 = cb3Var3;
                wl0Var = wl0Var5;
                f = f4;
                i3 = 0;
                i4 = cb3Var2.d;
                if (i4 != 0) {
                    i = i3;
                    audioTimestamp = audioTimestamp2;
                    wl0Var2 = wl0Var;
                    if (timestamp != 0) {
                        j8 = audioTimestamp.nanoTime;
                        if (j8 / j >= cb3Var2.e) {
                            cb3Var2.h = wl0Var2.c;
                            cb3Var2.i = j8 / j;
                            cb3Var2.a(1);
                        }
                    } else if (jNanoTime2 - cb3Var2.e > 500000) {
                        cb3Var2.a(3);
                    }
                } else if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            cb3Var2.a(i3);
                        }
                    } else if (timestamp == 0) {
                        cb3Var2.a(i3);
                    }
                    i = i3;
                } else if (timestamp != 0) {
                    wl0Var3 = wl0Var;
                    j9 = wl0Var3.c;
                    j10 = cb3Var2.h;
                    if (j9 <= j10) {
                        i5 = i10;
                        f2 = f;
                        if (Math.abs((qz1.v(jNanoTime2 - (((AudioTimestamp) wl0Var3.e).nanoTime / j), f2) + qz1.s(i5, wl0Var3.c)) - (qz1.v(jNanoTime2 - cb3Var2.i, f2) + qz1.s(i5, j10))) < j) {
                            cb3Var2.a(2);
                        } else if (jNanoTime2 - cb3Var2.e > 2000000) {
                            cb3Var2.a(3);
                        } else {
                            cb3Var2.h = wl0Var3.c;
                            cb3Var2.i = audioTimestamp2.nanoTime / j;
                        }
                    } else if (jNanoTime2 - cb3Var2.e > 2000000) {
                        cb3Var2.a(3);
                    } else {
                        cb3Var2.h = wl0Var3.c;
                        cb3Var2.i = audioTimestamp2.nanoTime / j;
                    }
                } else {
                    i = 0;
                    cb3Var2.a(0);
                }
                db3Var = this;
                db3Var.B.getClass();
                jNanoTime = System.nanoTime() / j;
                cb3Var = db3Var.d;
                cb3Var.getClass();
                if (cb3Var.d == 2) {
                    i = 1;
                }
                if (i != 0) {
                    float f6 = db3Var.g;
                    wl0 wl0Var7 = cb3Var.a;
                    jD = qz1.v(jNanoTime - (((AudioTimestamp) wl0Var7.e).nanoTime / j), f6) + qz1.s(cb3Var.b, wl0Var7.c);
                } else {
                    jD = db3Var.d(jNanoTime);
                }
                playState = audioTrack.getPlayState();
                if (playState == 3) {
                    if (i == 0) {
                        db3Var.c(jD);
                    } else {
                        db3Var.c(jD);
                    }
                    j3 = db3Var.A;
                    if (j3 != -9223372036854775807L) {
                        j5 = jD - db3Var.z;
                        jV = qz1.v(jNanoTime - j3, db3Var.g);
                        j6 = db3Var.z + jV;
                        long jAbs3 = Math.abs(j6 - jD);
                        if (j5 != j2) {
                            long j112 = (jV * 10) / 100;
                            jD = Math.max(j6 - j112, Math.min(jD, j6 + j112));
                        }
                    }
                    if (!db3Var.y) {
                        j4 = db3Var.z;
                        if (j4 != -9223372036854775807L) {
                            db3Var.h = true;
                            long j113 = jD - j4;
                            String str4 = qz1.a;
                            long jW4 = qz1.w(qz1.q(j113), db3Var.g);
                            db3Var.B.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis() - qz1.q(jW4);
                            bz1Var = ((qb3) db3Var.a.f).n;
                            if (bz1Var != null) {
                                un1Var = ((rb3) bz1Var.f).E0;
                                handler = (Handler) un1Var.g;
                                if (handler != null) {
                                    handler.post(new ra3(un1Var, jCurrentTimeMillis));
                                }
                            }
                        }
                    }
                    db3Var.A = jNanoTime;
                    db3Var.z = jD;
                } else if (playState == 1) {
                    db3Var.c(jD);
                    return jD;
                }
                return jD;
            }
            audioTrack = audioTrack2;
        } else {
            audioTrack = audioTrack2;
            j = 1000;
            j2 = 0;
        }
        i = 0;
        db3Var = this;
        db3Var.B.getClass();
        jNanoTime = System.nanoTime() / j;
        cb3Var = db3Var.d;
        cb3Var.getClass();
        if (cb3Var.d == 2) {
            i = 1;
        }
        if (i != 0) {
            float f7 = db3Var.g;
            wl0 wl0Var8 = cb3Var.a;
            jD = qz1.v(jNanoTime - (((AudioTimestamp) wl0Var8.e).nanoTime / j), f7) + qz1.s(cb3Var.b, wl0Var8.c);
        } else {
            jD = db3Var.d(jNanoTime);
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (i == 0) {
                db3Var.c(jD);
            } else {
                db3Var.c(jD);
            }
            j3 = db3Var.A;
            if (j3 != -9223372036854775807L) {
                j5 = jD - db3Var.z;
                jV = qz1.v(jNanoTime - j3, db3Var.g);
                j6 = db3Var.z + jV;
                long jAbs4 = Math.abs(j6 - jD);
                if (j5 != j2) {
                    long j114 = (jV * 10) / 100;
                    jD = Math.max(j6 - j114, Math.min(jD, j6 + j114));
                }
            }
            if (!db3Var.y) {
                j4 = db3Var.z;
                if (j4 != -9223372036854775807L) {
                    db3Var.h = true;
                    long j115 = jD - j4;
                    String str5 = qz1.a;
                    long jW5 = qz1.w(qz1.q(j115), db3Var.g);
                    db3Var.B.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis() - qz1.q(jW5);
                    bz1Var = ((qb3) db3Var.a.f).n;
                    if (bz1Var != null) {
                        un1Var = ((rb3) bz1Var.f).E0;
                        handler = (Handler) un1Var.g;
                        if (handler != null) {
                            handler.post(new ra3(un1Var, jCurrentTimeMillis));
                        }
                    }
                }
            }
            db3Var.A = jNanoTime;
            db3Var.z = jD;
        } else if (playState == 1) {
            db3Var.c(jD);
            return jD;
        }
        return jD;
    }

    public final void c(long j) {
        if (this.y) {
            long j2 = this.i;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jW = qz1.w(j - j2, this.g);
            this.B.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - qz1.q(jW);
            this.i = -9223372036854775807L;
            bz1 bz1Var = ((qb3) this.a.f).n;
            if (bz1Var != null) {
                un1 un1Var = ((rb3) bz1Var.f).E0;
                Handler handler = (Handler) un1Var.g;
                if (handler != null) {
                    handler.post(new ra3(un1Var, jCurrentTimeMillis));
                }
            }
        }
    }

    public final long d(long j) {
        long jV;
        if (this.t != 0) {
            jV = qz1.v(j + this.j, this.g);
        } else if (this.u != -9223372036854775807L) {
            jV = qz1.s(this.e, f());
        } else {
            jV = qz1.s(this.e, e());
        }
        long jMax = Math.max(0L, jV - this.m);
        if (this.u == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(qz1.s(this.e, this.x), jMax);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    public final long e() {
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, f());
        }
        this.B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.p >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    if (this.q > playbackHeadPosition) {
                        this.r++;
                    }
                    this.q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                    this.v = -9223372036854775807L;
                    if (this.q > playbackHeadPosition) {
                        this.r++;
                    }
                    this.q = playbackHeadPosition;
                } else if (this.v == -9223372036854775807L) {
                    this.v = jElapsedRealtime;
                }
            }
            this.p = jElapsedRealtime;
        }
        return this.q + (this.r << 32);
    }

    public final long f() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.w;
        }
        this.B.getClass();
        return this.w + qz1.t(qz1.v(qz1.r(SystemClock.elapsedRealtime()) - this.u, this.g), this.e, 1000000L, RoundingMode.UP);
    }
}
