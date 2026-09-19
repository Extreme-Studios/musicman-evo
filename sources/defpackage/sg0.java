package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class sg0 implements nd0 {
    public static final byte[] j0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] k0;
    public static final byte[] l0;
    public static final byte[] m0;
    public static final UUID n0;
    public static final Map o0;
    public long A;
    public final SparseArray B;
    public boolean C;
    public long D;
    public int E;
    public long F;
    public int G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public boolean L;
    public int M;
    public long N;
    public long O;
    public int P;
    public int Q;
    public int[] R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public long X;
    public int Y;
    public int Z;
    public final tg0 a;
    public int a0;
    public final SparseArray b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final boolean d;
    public boolean d0;
    public final pi0 e;
    public int e0;
    public final cw1 f;
    public byte f0;
    public final cw1 g;
    public boolean g0;
    public final cw1 h;
    public pd0 h0;
    public final cw1 i;
    public final og0 i0;
    public final cw1 j;
    public final cw1 k;
    public final cw1 l;
    public final cw1 m;
    public final cw1 n;
    public final cw1 o;
    public ByteBuffer p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public boolean w;
    public rg0 x;
    public boolean y;
    public int z;

    static {
        String str = qz1.a;
        k0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        l0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        m0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        n0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        ec.p(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        ec.p(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        o0 = Collections.unmodifiableMap(map);
    }

    public sg0(og0 og0Var, int i, pi0 pi0Var) {
        this.r = -1L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        this.G = -1;
        this.I = -1L;
        this.J = -1L;
        this.K = -9223372036854775807L;
        this.i0 = og0Var;
        og0Var.d = new dr0(10, this);
        this.e = pi0Var;
        this.B = new SparseArray();
        this.c = true;
        this.d = (i & 2) == 0;
        this.a = new tg0(0);
        this.b = new SparseArray();
        this.h = new cw1(4);
        this.i = new cw1(ByteBuffer.allocate(4).putInt(-1).array());
        this.j = new cw1(4);
        this.f = new cw1(ss0.m);
        this.g = new cw1(4);
        this.k = new cw1();
        this.l = new cw1();
        this.m = new cw1(8);
        this.n = new cw1();
        this.o = new cw1();
        this.R = new int[1];
        this.w = true;
    }

    public static byte[] o(long j, long j2, String str) {
        hn.v(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = qz1.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    public final void a() {
        if (!this.w) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                pd0 pd0Var = this.h0;
                pd0Var.getClass();
                pd0Var.s();
                this.w = false;
                return;
            }
            if (((rg0) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:230:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:231:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:233:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:234:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:236:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:237:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:239:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:240:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:242:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:243:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:245:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:246:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:248:0x0403  */
    /* JADX WARN: Code duplicated, block: B:249:0x0407  */
    /* JADX WARN: Code duplicated, block: B:251:0x040d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0411  */
    /* JADX WARN: Code duplicated, block: B:254:0x0417  */
    /* JADX WARN: Code duplicated, block: B:255:0x041b  */
    /* JADX WARN: Code duplicated, block: B:257:0x0421  */
    /* JADX WARN: Code duplicated, block: B:258:0x0425  */
    /* JADX WARN: Code duplicated, block: B:260:0x042b  */
    /* JADX WARN: Code duplicated, block: B:261:0x042f  */
    /* JADX WARN: Code duplicated, block: B:263:0x0435  */
    /* JADX WARN: Code duplicated, block: B:264:0x0439  */
    /* JADX WARN: Code duplicated, block: B:266:0x043f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0443  */
    /* JADX WARN: Code duplicated, block: B:269:0x0449  */
    /* JADX WARN: Code duplicated, block: B:270:0x044d  */
    /* JADX WARN: Code duplicated, block: B:272:0x0455  */
    /* JADX WARN: Code duplicated, block: B:273:0x0459  */
    /* JADX WARN: Code duplicated, block: B:275:0x0461  */
    /* JADX WARN: Code duplicated, block: B:276:0x0464  */
    /* JADX WARN: Code duplicated, block: B:278:0x046c  */
    /* JADX WARN: Code duplicated, block: B:279:0x046f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0477  */
    /* JADX WARN: Code duplicated, block: B:282:0x047a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0482  */
    /* JADX WARN: Code duplicated, block: B:285:0x0486  */
    /* JADX WARN: Code duplicated, block: B:287:0x048e  */
    /* JADX WARN: Code duplicated, block: B:288:0x0492  */
    /* JADX WARN: Code duplicated, block: B:290:0x049a  */
    /* JADX WARN: Code duplicated, block: B:291:0x049e  */
    /* JADX WARN: Code duplicated, block: B:293:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:294:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:296:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:297:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:299:0x04be  */
    /* JADX WARN: Code duplicated, block: B:300:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:302:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:303:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:305:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:306:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:308:0x04df  */
    /* JADX WARN: Code duplicated, block: B:309:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:311:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:312:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:314:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:315:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:317:0x0500  */
    /* JADX WARN: Code duplicated, block: B:318:0x0503  */
    /* JADX WARN: Code duplicated, block: B:320:0x050b  */
    /* JADX WARN: Code duplicated, block: B:321:0x050e  */
    /* JADX WARN: Code duplicated, block: B:323:0x0516  */
    /* JADX WARN: Code duplicated, block: B:324:0x0519  */
    /* JADX WARN: Code duplicated, block: B:326:0x0521  */
    /* JADX WARN: Code duplicated, block: B:327:0x0523  */
    /* JADX WARN: Code duplicated, block: B:329:0x052b  */
    /* JADX WARN: Code duplicated, block: B:330:0x052d  */
    /* JADX WARN: Code duplicated, block: B:333:0x0549  */
    /* JADX WARN: Code duplicated, block: B:335:0x0551  */
    /* JADX WARN: Code duplicated, block: B:339:0x0568  */
    /* JADX WARN: Code duplicated, block: B:341:0x056d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0579  */
    /* JADX WARN: Code duplicated, block: B:343:0x057d  */
    /* JADX WARN: Code duplicated, block: B:344:0x058d  */
    /* JADX WARN: Code duplicated, block: B:345:0x0591  */
    /* JADX WARN: Code duplicated, block: B:349:0x059f  */
    /* JADX WARN: Code duplicated, block: B:351:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:353:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:354:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:356:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:357:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:359:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:360:0x05da  */
    /* JADX WARN: Code duplicated, block: B:362:0x05de  */
    /* JADX WARN: Code duplicated, block: B:363:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:364:0x0603  */
    /* JADX WARN: Code duplicated, block: B:366:0x060f  */
    /* JADX WARN: Code duplicated, block: B:367:0x0633  */
    /* JADX WARN: Code duplicated, block: B:370:0x0647  */
    /* JADX WARN: Code duplicated, block: B:371:0x0648  */
    /* JADX WARN: Code duplicated, block: B:373:0x064d A[Catch: ArrayIndexOutOfBoundsException -> 0x06a2, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x06a2, blocks: (B:368:0x0640, B:373:0x064d, B:375:0x0660), top: B:630:0x0640 }] */
    /* JADX WARN: Code duplicated, block: B:375:0x0660 A[Catch: ArrayIndexOutOfBoundsException -> 0x06a2, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x06a2, blocks: (B:368:0x0640, B:373:0x064d, B:375:0x0660), top: B:630:0x0640 }] */
    /* JADX WARN: Code duplicated, block: B:380:0x0676  */
    /* JADX WARN: Code duplicated, block: B:384:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:385:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:386:0x06be  */
    /* JADX WARN: Code duplicated, block: B:387:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:388:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:389:0x06da  */
    /* JADX WARN: Code duplicated, block: B:390:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:392:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:393:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:396:0x0715  */
    /* JADX WARN: Code duplicated, block: B:397:0x0759  */
    /* JADX WARN: Code duplicated, block: B:400:0x0768  */
    /* JADX WARN: Code duplicated, block: B:403:0x0773 A[Catch: ArrayIndexOutOfBoundsException -> 0x07b3, LOOP:3: B:401:0x076a->B:403:0x0773, LOOP_END, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x07b3, blocks: (B:398:0x0763, B:401:0x076a, B:403:0x0773, B:404:0x0776, B:405:0x0778, B:407:0x077f, B:408:0x0782, B:410:0x0788, B:412:0x0793, B:414:0x0799), top: B:632:0x0763 }] */
    /* JADX WARN: Code duplicated, block: B:407:0x077f A[Catch: ArrayIndexOutOfBoundsException -> 0x07b3, LOOP:4: B:405:0x0778->B:407:0x077f, LOOP_END, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x07b3, blocks: (B:398:0x0763, B:401:0x076a, B:403:0x0773, B:404:0x0776, B:405:0x0778, B:407:0x077f, B:408:0x0782, B:410:0x0788, B:412:0x0793, B:414:0x0799), top: B:632:0x0763 }] */
    /* JADX WARN: Code duplicated, block: B:410:0x0788 A[Catch: ArrayIndexOutOfBoundsException -> 0x07b3, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x07b3, blocks: (B:398:0x0763, B:401:0x076a, B:403:0x0773, B:404:0x0776, B:405:0x0778, B:407:0x077f, B:408:0x0782, B:410:0x0788, B:412:0x0793, B:414:0x0799), top: B:632:0x0763 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x0793 A[Catch: ArrayIndexOutOfBoundsException -> 0x07b3, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x07b3, blocks: (B:398:0x0763, B:401:0x076a, B:403:0x0773, B:404:0x0776, B:405:0x0778, B:407:0x077f, B:408:0x0782, B:410:0x0788, B:412:0x0793, B:414:0x0799), top: B:632:0x0763 }] */
    /* JADX WARN: Code duplicated, block: B:414:0x0799 A[Catch: ArrayIndexOutOfBoundsException -> 0x07b3, TRY_LEAVE, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x07b3, blocks: (B:398:0x0763, B:401:0x076a, B:403:0x0773, B:404:0x0776, B:405:0x0778, B:407:0x077f, B:408:0x0782, B:410:0x0788, B:412:0x0793, B:414:0x0799), top: B:632:0x0763 }] */
    /* JADX WARN: Code duplicated, block: B:417:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:420:0x07bb A[Catch: ArrayIndexOutOfBoundsException -> 0x07cd, TryCatch #5 {ArrayIndexOutOfBoundsException -> 0x07cd, blocks: (B:418:0x07b6, B:419:0x07ba, B:420:0x07bb, B:421:0x07c0, B:422:0x07c1, B:423:0x07c6, B:424:0x07c7, B:425:0x07cc), top: B:640:0x0766 }] */
    /* JADX WARN: Code duplicated, block: B:422:0x07c1 A[Catch: ArrayIndexOutOfBoundsException -> 0x07cd, TryCatch #5 {ArrayIndexOutOfBoundsException -> 0x07cd, blocks: (B:418:0x07b6, B:419:0x07ba, B:420:0x07bb, B:421:0x07c0, B:422:0x07c1, B:423:0x07c6, B:424:0x07c7, B:425:0x07cc), top: B:640:0x0766 }] */
    /* JADX WARN: Code duplicated, block: B:424:0x07c7 A[Catch: ArrayIndexOutOfBoundsException -> 0x07cd, TryCatch #5 {ArrayIndexOutOfBoundsException -> 0x07cd, blocks: (B:418:0x07b6, B:419:0x07ba, B:420:0x07bb, B:421:0x07c0, B:422:0x07c1, B:423:0x07c6, B:424:0x07c7, B:425:0x07cc), top: B:640:0x0766 }] */
    /* JADX WARN: Code duplicated, block: B:428:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:429:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:432:0x07f3 A[Catch: ArrayIndexOutOfBoundsException -> 0x07fe, TRY_LEAVE, TryCatch #4 {ArrayIndexOutOfBoundsException -> 0x07fe, blocks: (B:430:0x07e5, B:432:0x07f3, B:439:0x0808, B:445:0x0818, B:446:0x081e, B:448:0x0823, B:450:0x0829, B:452:0x082d, B:454:0x0834, B:456:0x083c, B:462:0x0858), top: B:639:0x07e5 }] */
    /* JADX WARN: Code duplicated, block: B:437:0x0801  */
    /* JADX WARN: Code duplicated, block: B:439:0x0808 A[Catch: ArrayIndexOutOfBoundsException -> 0x07fe, TRY_ENTER, TRY_LEAVE, TryCatch #4 {ArrayIndexOutOfBoundsException -> 0x07fe, blocks: (B:430:0x07e5, B:432:0x07f3, B:439:0x0808, B:445:0x0818, B:446:0x081e, B:448:0x0823, B:450:0x0829, B:452:0x082d, B:454:0x0834, B:456:0x083c, B:462:0x0858), top: B:639:0x07e5 }] */
    /* JADX WARN: Code duplicated, block: B:443:0x0811  */
    /* JADX WARN: Code duplicated, block: B:445:0x0818 A[Catch: ArrayIndexOutOfBoundsException -> 0x07fe, TRY_ENTER, TryCatch #4 {ArrayIndexOutOfBoundsException -> 0x07fe, blocks: (B:430:0x07e5, B:432:0x07f3, B:439:0x0808, B:445:0x0818, B:446:0x081e, B:448:0x0823, B:450:0x0829, B:452:0x082d, B:454:0x0834, B:456:0x083c, B:462:0x0858), top: B:639:0x07e5 }] */
    /* JADX WARN: Code duplicated, block: B:448:0x0823 A[Catch: ArrayIndexOutOfBoundsException -> 0x07fe, TryCatch #4 {ArrayIndexOutOfBoundsException -> 0x07fe, blocks: (B:430:0x07e5, B:432:0x07f3, B:439:0x0808, B:445:0x0818, B:446:0x081e, B:448:0x0823, B:450:0x0829, B:452:0x082d, B:454:0x0834, B:456:0x083c, B:462:0x0858), top: B:639:0x07e5 }] */
    /* JADX WARN: Code duplicated, block: B:450:0x0829 A[Catch: ArrayIndexOutOfBoundsException -> 0x07fe, TryCatch #4 {ArrayIndexOutOfBoundsException -> 0x07fe, blocks: (B:430:0x07e5, B:432:0x07f3, B:439:0x0808, B:445:0x0818, B:446:0x081e, B:448:0x0823, B:450:0x0829, B:452:0x082d, B:454:0x0834, B:456:0x083c, B:462:0x0858), top: B:639:0x07e5 }] */
    /* JADX WARN: Code duplicated, block: B:457:0x084d  */
    /* JADX WARN: Code duplicated, block: B:464:0x085b  */
    /* JADX WARN: Code duplicated, block: B:468:0x087c  */
    /* JADX WARN: Code duplicated, block: B:470:0x089d  */
    /* JADX WARN: Code duplicated, block: B:471:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:473:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:474:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:476:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:477:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:479:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:480:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:482:0x08df  */
    /* JADX WARN: Code duplicated, block: B:484:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:485:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:487:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:490:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:495:0x0911  */
    /* JADX WARN: Code duplicated, block: B:496:0x0913  */
    /* JADX WARN: Code duplicated, block: B:499:0x0922  */
    /* JADX WARN: Code duplicated, block: B:500:0x092f  */
    /* JADX WARN: Code duplicated, block: B:502:0x0935  */
    /* JADX WARN: Code duplicated, block: B:504:0x0939  */
    /* JADX WARN: Code duplicated, block: B:506:0x093e  */
    /* JADX WARN: Code duplicated, block: B:509:0x0946  */
    /* JADX WARN: Code duplicated, block: B:511:0x094b  */
    /* JADX WARN: Code duplicated, block: B:514:0x0952  */
    /* JADX WARN: Code duplicated, block: B:517:0x0960  */
    /* JADX WARN: Code duplicated, block: B:520:0x0965  */
    /* JADX WARN: Code duplicated, block: B:522:0x096b  */
    /* JADX WARN: Code duplicated, block: B:540:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:543:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:549:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:570:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:572:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:574:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:589:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:595:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:598:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:650:0x0776 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0782 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0851 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023c, code lost:
    
        if (r3.equals("A_OPUS") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0248, code lost:
    
        if (r3.equals("A_FLAC") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x024f, code lost:
    
        if (r3.equals("A_EAC3") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0256, code lost:
    
        if (r3.equals("V_MPEG2") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x025d, code lost:
    
        if (r3.equals("S_TEXT/UTF8") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0264, code lost:
    
        if (r3.equals("S_TEXT/WEBVTT") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026b, code lost:
    
        if (r3.equals("V_MPEGH/ISO/HEVC") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0272, code lost:
    
        if (r3.equals("S_TEXT/SSA") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0279, code lost:
    
        if (r3.equals("S_TEXT/ASS") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0280, code lost:
    
        if (r3.equals("A_PCM/INT/LIT") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0287, code lost:
    
        if (r3.equals("A_PCM/INT/BIG") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x028e, code lost:
    
        if (r3.equals("A_PCM/FLOAT/IEEE") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0295, code lost:
    
        if (r3.equals("A_DTS/EXPRESS") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x029c, code lost:
    
        if (r3.equals("V_THEORA") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02a3, code lost:
    
        if (r3.equals("S_HDMV/PGS") != false) goto L124;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v33, types: [int] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r51) throws defpackage.no0 {
        /*
            Method dump skipped, instruction units count: 3372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg0.b(int):void");
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) throws EOFException, InterruptedIOException {
        e3 e3Var = new e3(4, (byte) 0);
        fd0 fd0Var = (fd0) od0Var;
        long j = fd0Var.h;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        cw1 cw1Var = (cw1) e3Var.h;
        fd0Var.B(cw1Var.a, 0, 4, false);
        e3Var.g = 4;
        for (long jP = cw1Var.P(); jP != 440786851; jP = ((jP << 8) & (-256)) | ((long) (cw1Var.a[0] & 255))) {
            int i = (int) j2;
            int i2 = e3Var.g + 1;
            e3Var.g = i2;
            if (i2 == i) {
                return false;
            }
            fd0Var.B(cw1Var.a, 0, 1, false);
        }
        long j3 = e3Var.j(fd0Var);
        long j4 = e3Var.g;
        if (j3 != Long.MIN_VALUE) {
            long j5 = j4 + j3;
            if (j == -1 || j5 < j) {
                while (true) {
                    long j6 = e3Var.g;
                    if (j6 < j5) {
                        if (e3Var.j(fd0Var) == Long.MIN_VALUE) {
                            break;
                        }
                        long j7 = e3Var.j(fd0Var);
                        if (j7 < 0) {
                            break;
                        }
                        if (j7 != 0) {
                            int i3 = (int) j7;
                            fd0Var.e(i3, false);
                            e3Var.g += i3;
                        }
                    } else if (j6 == j5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:128:0x0300  */
    /* JADX WARN: Code duplicated, block: B:131:0x030e  */
    /* JADX WARN: Code duplicated, block: B:132:0x031b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0325  */
    /* JADX WARN: Code duplicated, block: B:136:0x0336  */
    /* JADX WARN: Code duplicated, block: B:138:0x033c  */
    /* JADX WARN: Code duplicated, block: B:139:0x033f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0343  */
    /* JADX WARN: Code duplicated, block: B:145:0x0357  */
    /* JADX WARN: Code duplicated, block: B:147:0x036c  */
    /* JADX WARN: Code duplicated, block: B:148:0x036f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0373  */
    /* JADX WARN: Code duplicated, block: B:154:0x037f  */
    /* JADX WARN: Code duplicated, block: B:155:0x038b  */
    /* JADX WARN: Code duplicated, block: B:157:0x038e  */
    /* JADX WARN: Code duplicated, block: B:160:0x039a  */
    /* JADX WARN: Code duplicated, block: B:164:0x03b7 A[LOOP:6: B:161:0x039c->B:164:0x03b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:168:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:171:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:173:0x03df  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:180:0x0406 A[LOOP:9: B:179:0x0404->B:180:0x0406, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x041f  */
    /* JADX WARN: Code duplicated, block: B:184:0x042c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0430 A[LOOP:8: B:174:0x03e0->B:185:0x0430, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x0450  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:204:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:209:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:216:0x04d8 A[LOOP:10: B:216:0x04d8->B:218:0x04de, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:218:0x04de A[LOOP:10: B:216:0x04d8->B:218:0x04de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x050d A[LOOP:11: B:220:0x050d->B:222:0x0514, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:222:0x0514 A[LOOP:11: B:220:0x050d->B:222:0x0514, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x054c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0550  */
    /* JADX WARN: Code duplicated, block: B:231:0x0554  */
    /* JADX WARN: Code duplicated, block: B:233:0x0558  */
    /* JADX WARN: Code duplicated, block: B:235:0x055c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0560  */
    /* JADX WARN: Code duplicated, block: B:239:0x0564  */
    /* JADX WARN: Code duplicated, block: B:241:0x0569  */
    /* JADX WARN: Code duplicated, block: B:243:0x056e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0573  */
    /* JADX WARN: Code duplicated, block: B:254:0x0589  */
    /* JADX WARN: Code duplicated, block: B:255:0x0599  */
    /* JADX WARN: Code duplicated, block: B:256:0x059d  */
    /* JADX WARN: Code duplicated, block: B:264:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:265:0x05be  */
    /* JADX WARN: Code duplicated, block: B:266:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:267:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:268:0x05da  */
    /* JADX WARN: Code duplicated, block: B:269:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:270:0x064e  */
    /* JADX WARN: Code duplicated, block: B:274:0x0661  */
    /* JADX WARN: Code duplicated, block: B:276:0x0664  */
    /* JADX WARN: Code duplicated, block: B:277:0x0667  */
    /* JADX WARN: Code duplicated, block: B:279:0x0671  */
    /* JADX WARN: Code duplicated, block: B:281:0x0677 A[LOOP:12: B:278:0x066f->B:281:0x0677, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:285:0x0686  */
    /* JADX WARN: Code duplicated, block: B:287:0x068a  */
    /* JADX WARN: Code duplicated, block: B:289:0x068e  */
    /* JADX WARN: Code duplicated, block: B:292:0x0695  */
    /* JADX WARN: Code duplicated, block: B:293:0x069d  */
    /* JADX WARN: Code duplicated, block: B:294:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:302:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:308:0x0710  */
    /* JADX WARN: Code duplicated, block: B:310:0x071c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0720  */
    /* JADX WARN: Code duplicated, block: B:314:0x0725  */
    /* JADX WARN: Code duplicated, block: B:316:0x072a  */
    /* JADX WARN: Code duplicated, block: B:318:0x0735  */
    /* JADX WARN: Code duplicated, block: B:319:0x073e  */
    /* JADX WARN: Code duplicated, block: B:321:0x074e  */
    /* JADX WARN: Code duplicated, block: B:322:0x0753  */
    /* JADX WARN: Code duplicated, block: B:324:0x075e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0763  */
    /* JADX WARN: Code duplicated, block: B:327:0x076a  */
    /* JADX WARN: Code duplicated, block: B:330:0x076f  */
    /* JADX WARN: Code duplicated, block: B:331:0x0774  */
    /* JADX WARN: Code duplicated, block: B:332:0x077a  */
    /* JADX WARN: Code duplicated, block: B:333:0x077d  */
    /* JADX WARN: Code duplicated, block: B:334:0x0786  */
    /* JADX WARN: Code duplicated, block: B:336:0x078c  */
    /* JADX WARN: Code duplicated, block: B:338:0x078f  */
    /* JADX WARN: Code duplicated, block: B:340:0x0792  */
    /* JADX WARN: Code duplicated, block: B:343:0x0797  */
    /* JADX WARN: Code duplicated, block: B:344:0x079c  */
    /* JADX WARN: Code duplicated, block: B:345:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:346:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:348:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:349:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:350:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:351:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:352:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:353:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:354:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:356:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:357:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:359:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:360:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:361:0x0808  */
    /* JADX WARN: Code duplicated, block: B:362:0x0812  */
    /* JADX WARN: Code duplicated, block: B:364:0x0818  */
    /* JADX WARN: Code duplicated, block: B:366:0x081b  */
    /* JADX WARN: Code duplicated, block: B:368:0x081e  */
    /* JADX WARN: Code duplicated, block: B:371:0x0824  */
    /* JADX WARN: Code duplicated, block: B:372:0x082a  */
    /* JADX WARN: Code duplicated, block: B:373:0x0830  */
    /* JADX WARN: Code duplicated, block: B:374:0x0837  */
    /* JADX WARN: Code duplicated, block: B:375:0x083e  */
    /* JADX WARN: Code duplicated, block: B:376:0x0845  */
    /* JADX WARN: Code duplicated, block: B:381:0x086f  */
    /* JADX WARN: Code duplicated, block: B:386:0x089b  */
    /* JADX WARN: Code duplicated, block: B:391:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:398:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:403:0x0920  */
    /* JADX WARN: Code duplicated, block: B:404:0x092a  */
    /* JADX WARN: Code duplicated, block: B:405:0x092f  */
    /* JADX WARN: Code duplicated, block: B:406:0x0937  */
    /* JADX WARN: Code duplicated, block: B:408:0x0942  */
    /* JADX WARN: Code duplicated, block: B:409:0x0946  */
    /* JADX WARN: Code duplicated, block: B:410:0x094b  */
    /* JADX WARN: Code duplicated, block: B:411:0x0953  */
    /* JADX WARN: Code duplicated, block: B:412:0x095d  */
    /* JADX WARN: Code duplicated, block: B:413:0x0967  */
    /* JADX WARN: Code duplicated, block: B:414:0x0972  */
    /* JADX WARN: Code duplicated, block: B:415:0x097c  */
    /* JADX WARN: Code duplicated, block: B:416:0x0986  */
    /* JADX WARN: Code duplicated, block: B:417:0x098e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0992  */
    /* JADX WARN: Code duplicated, block: B:420:0x0994  */
    /* JADX WARN: Code duplicated, block: B:422:0x099e  */
    /* JADX WARN: Code duplicated, block: B:424:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:426:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:428:0x09a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:429:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:430:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:431:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:432:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:433:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:434:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:439:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:473:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x046c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x06e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0a86 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x084b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0877 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x08a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x08fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x09e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0a62 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0529 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x065a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[LOOP:1: B:6:0x0016->B:49:0x00ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:500:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x047c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x0679 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x016b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    /* JADX WARN: Code duplicated, block: B:73:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v127 */
    /* JADX WARN: Type inference failed for: r3v128, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v168 */
    /* JADX WARN: Type inference failed for: r3v169 */
    /* JADX WARN: Type inference failed for: r3v170 */
    /* JADX WARN: Type inference failed for: r3v171 */
    /* JADX WARN: Type inference failed for: r3v172 */
    /* JADX WARN: Type inference failed for: r3v173 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException, no0 {
        boolean z;
        int i;
        sg0 sg0Var;
        long j;
        long jA;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int iC;
        int iB;
        boolean z6;
        long j2;
        int i6;
        byte[] bArr;
        String str;
        int i7;
        ?? r3;
        long j3;
        int i8;
        long j4;
        sg0 sg0Var2;
        pd0 pd0Var;
        int i9;
        long j5;
        int i10;
        cw1 cw1Var;
        SparseArray sparseArray;
        rg0 rg0Var;
        int i11;
        int i12;
        boolean z7;
        int i13;
        byte b;
        int i14;
        int[] iArr;
        int length;
        int i15;
        int i16;
        int i17;
        boolean z8;
        int i18;
        int[] iArr2;
        int i19;
        int i20;
        int i21;
        boolean z9;
        boolean z10;
        int i22;
        int i23;
        int i24;
        long j6;
        int i25;
        boolean z11;
        int i26;
        long j7;
        int i27;
        int i28;
        int i29;
        int i30;
        int[] iArr3;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int[] iArr4;
        int length2;
        boolean z12;
        long j8;
        int i36;
        long jA2;
        double dLongBitsToDouble;
        long j9;
        fd0 fd0Var;
        int i37;
        int iG;
        ?? r4;
        boolean z13 = false;
        this.L = false;
        while (!this.L) {
            og0 og0Var = this.i0;
            tg0 tg0Var = og0Var.c;
            og0Var.d.getClass();
            while (true) {
                ArrayDeque arrayDeque = og0Var.b;
                ng0 ng0Var = (ng0) arrayDeque.peek();
                if (ng0Var == null || ((fd0) od0Var).i < ng0Var.b) {
                    int i38 = og0Var.e;
                    char c = '\b';
                    if (i38 == 0) {
                        long jE = tg0Var.e(od0Var, true, z13, 4);
                        if (jE == -2) {
                            ((fd0) od0Var).k = z13 ? 1 : 0;
                            while (true) {
                                byte[] bArr2 = og0Var.a;
                                fd0Var = (fd0) od0Var;
                                fd0Var.B(bArr2, z13 ? 1 : 0, 4, z13);
                                byte b2 = bArr2[z13 ? 1 : 0];
                                int i39 = z13 ? 1 : 0;
                                while (true) {
                                    if (i39 < c) {
                                        int i40 = i39 + 1;
                                        if ((tg0.i[i39] & ((long) b2)) != 0) {
                                            i37 = i40;
                                        } else {
                                            i39 = i40;
                                            c = '\b';
                                        }
                                    } else {
                                        i37 = -1;
                                    }
                                }
                                if (i37 != -1 && i37 <= 4) {
                                    iG = (int) tg0.g(i37, z13, bArr2);
                                    Object obj = og0Var.d.g;
                                    if (iG != 357149030 && iG != 524531317 && iG != 475249515) {
                                        if (iG == 374648427) {
                                            iG = 374648427;
                                        }
                                    }
                                }
                                fd0Var.b(1, z13);
                                c = '\b';
                            }
                            fd0Var.b(i37, z13);
                            j9 = iG;
                            z = true;
                        } else {
                            z = true;
                            j9 = jE;
                        }
                        if (j9 == -1) {
                            z12 = z13 ? 1 : 0;
                            r4 = z13;
                        } else {
                            og0Var.f = (int) j9;
                            og0Var.e = z ? 1 : 0;
                        }
                    } else {
                        z = true;
                        if (i38 == 1) {
                        }
                        dr0 dr0Var = og0Var.d;
                        i = og0Var.f;
                        sg0Var = (sg0) dr0Var.g;
                        switch (i) {
                            case 131:
                            case 136:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 247:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                j = og0Var.g;
                                if (j <= 8) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22);
                                    sb.append("Invalid integer size: ");
                                    sb.append(j);
                                    throw no0.a(null, sb.toString());
                                }
                                jA = og0Var.a(od0Var, (int) j);
                                sg0Var.getClass();
                                if (i != 20529) {
                                    if (i != 20530) {
                                        switch (i) {
                                            case 131:
                                                i2 = (int) jA;
                                                if (i2 != 1) {
                                                    sg0Var.h(i);
                                                    sg0Var.x.e = 2;
                                                } else if (i2 != 2) {
                                                    sg0Var.h(i);
                                                    sg0Var.x.e = 1;
                                                } else if (i2 != 17) {
                                                    sg0Var.h(i);
                                                    sg0Var.x.e = 3;
                                                } else if (i2 != 33) {
                                                    sg0Var.h(i);
                                                    sg0Var.x.e = 5;
                                                } else {
                                                    sg0Var.h(i);
                                                    sg0Var.x.e = -1;
                                                }
                                                break;
                                            case 136:
                                                if (jA == 1) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                sg0Var.h(i);
                                                sg0Var.x.Y = z3;
                                                break;
                                            case 155:
                                                sg0Var.O = sg0Var.p(jA);
                                                break;
                                            case 159:
                                                sg0Var.h(i);
                                                sg0Var.x.Q = (int) jA;
                                                break;
                                            case 176:
                                                sg0Var.h(i);
                                                sg0Var.x.n = (int) jA;
                                                break;
                                            case 179:
                                                sg0Var.i(i);
                                                sg0Var.D = sg0Var.p(jA);
                                                break;
                                            case 186:
                                                sg0Var.h(i);
                                                sg0Var.x.o = (int) jA;
                                                break;
                                            case 215:
                                                sg0Var.h(i);
                                                sg0Var.x.d = (int) jA;
                                                break;
                                            case 231:
                                                sg0Var.K = sg0Var.p(jA);
                                                break;
                                            case 238:
                                                sg0Var.V = (int) jA;
                                                break;
                                            case 241:
                                                sg0Var.i(i);
                                                if (sg0Var.F == -1) {
                                                    sg0Var.F = jA;
                                                }
                                                break;
                                            case 247:
                                                sg0Var.i(i);
                                                sg0Var.E = (int) jA;
                                                break;
                                            case 251:
                                                sg0Var.W = true;
                                                break;
                                            case 16871:
                                                sg0Var.h(i);
                                                sg0Var.x.h = (int) jA;
                                                break;
                                            case 16980:
                                                if (jA != 3) {
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(jA).length() + 30);
                                                    sb2.append("ContentCompAlgo ");
                                                    sb2.append(jA);
                                                    sb2.append(" not supported");
                                                    throw no0.a(null, sb2.toString());
                                                }
                                                break;
                                            case 17029:
                                                if (jA >= 1 || jA > 2) {
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(jA).length() + 33);
                                                    sb3.append("DocTypeReadVersion ");
                                                    sb3.append(jA);
                                                    sb3.append(" not supported");
                                                    throw no0.a(null, sb3.toString());
                                                }
                                                break;
                                            case 17143:
                                                if (jA != 1) {
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(jA).length() + 30);
                                                    sb4.append("EBMLReadVersion ");
                                                    sb4.append(jA);
                                                    sb4.append(" not supported");
                                                    throw no0.a(null, sb4.toString());
                                                }
                                                break;
                                            case 18401:
                                                if (jA != 5) {
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(jA).length() + 29);
                                                    sb5.append("ContentEncAlgo ");
                                                    sb5.append(jA);
                                                    sb5.append(" not supported");
                                                    throw no0.a(null, sb5.toString());
                                                }
                                                break;
                                            case 18408:
                                                if (jA != 1) {
                                                    StringBuilder sb6 = new StringBuilder(String.valueOf(jA).length() + 36);
                                                    sb6.append("AESSettingsCipherMode ");
                                                    sb6.append(jA);
                                                    sb6.append(" not supported");
                                                    throw no0.a(null, sb6.toString());
                                                }
                                                break;
                                            case 21420:
                                                sg0Var.A = jA + sg0Var.r;
                                                break;
                                            case 21432:
                                                i3 = (int) jA;
                                                sg0Var.h(i);
                                                if (i3 != 0) {
                                                    z4 = false;
                                                    sg0Var.x.y = 0;
                                                    z2 = z4;
                                                    og0Var.e = z2 ? 1 : 0;
                                                    r3 = z2;
                                                } else if (i3 != 1) {
                                                    sg0Var.x.y = 2;
                                                } else if (i3 != 3) {
                                                    sg0Var.x.y = 1;
                                                } else if (i3 == 15) {
                                                    sg0Var.x.y = 3;
                                                }
                                                break;
                                            case 21680:
                                                sg0Var.h(i);
                                                sg0Var.x.q = (int) jA;
                                                break;
                                            case 21682:
                                                sg0Var.h(i);
                                                sg0Var.x.s = (int) jA;
                                                break;
                                            case 21690:
                                                sg0Var.h(i);
                                                sg0Var.x.r = (int) jA;
                                                break;
                                            case 21930:
                                                if (jA == 1) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                sg0Var.h(i);
                                                sg0Var.x.X = z5;
                                                break;
                                            case 21938:
                                                int i41 = (int) jA;
                                                sg0Var.h(i);
                                                rg0 rg0Var2 = sg0Var.x;
                                                rg0Var2.z = true;
                                                rg0Var2.p = i41;
                                                break;
                                            case 21998:
                                                sg0Var.h(i);
                                                sg0Var.x.g = (int) jA;
                                                break;
                                            case 22186:
                                                sg0Var.h(i);
                                                sg0Var.x.T = jA;
                                                break;
                                            case 22203:
                                                sg0Var.h(i);
                                                sg0Var.x.U = jA;
                                                break;
                                            case 25188:
                                                sg0Var.h(i);
                                                sg0Var.x.R = (int) jA;
                                                break;
                                            case 30114:
                                                sg0Var.X = jA;
                                                break;
                                            case 30321:
                                                i4 = (int) jA;
                                                sg0Var.h(i);
                                                if (i4 != 0) {
                                                    z4 = false;
                                                    sg0Var.x.t = 0;
                                                    z2 = z4;
                                                    og0Var.e = z2 ? 1 : 0;
                                                    r3 = z2;
                                                } else if (i4 != 1) {
                                                    sg0Var.x.t = 1;
                                                } else if (i4 != 2) {
                                                    sg0Var.x.t = 2;
                                                } else if (i4 == 3) {
                                                    sg0Var.x.t = 3;
                                                }
                                                break;
                                            case 2352003:
                                                sg0Var.h(i);
                                                sg0Var.x.f = (int) jA;
                                                break;
                                            case 2807729:
                                                sg0Var.s = jA;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 21945:
                                                        i5 = (int) jA;
                                                        sg0Var.h(i);
                                                        if (i5 != 1) {
                                                            sg0Var.x.C = 2;
                                                        } else if (i5 == 2) {
                                                            sg0Var.x.C = 1;
                                                        }
                                                        break;
                                                    case 21946:
                                                        sg0Var.h(i);
                                                        iC = c43.c((int) jA);
                                                        if (iC != -1) {
                                                            sg0Var.x.B = iC;
                                                        }
                                                        break;
                                                    case 21947:
                                                        sg0Var.h(i);
                                                        sg0Var.x.z = true;
                                                        iB = c43.b((int) jA);
                                                        if (iB != -1) {
                                                            sg0Var.x.A = iB;
                                                        }
                                                        break;
                                                    case 21948:
                                                        sg0Var.h(i);
                                                        sg0Var.x.D = (int) jA;
                                                        break;
                                                    case 21949:
                                                        sg0Var.h(i);
                                                        sg0Var.x.E = (int) jA;
                                                        break;
                                                }
                                                break;
                                        }
                                    } else if (jA != 1) {
                                        StringBuilder sb7 = new StringBuilder(String.valueOf(jA).length() + 35);
                                        sb7.append("ContentEncodingScope ");
                                        sb7.append(jA);
                                        sb7.append(" not supported");
                                        throw no0.a(null, sb7.toString());
                                    }
                                } else if (jA != 0) {
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(jA).length() + 35);
                                    sb8.append("ContentEncodingOrder ");
                                    sb8.append(jA);
                                    sb8.append(" not supported");
                                    throw no0.a(null, sb8.toString());
                                }
                                z2 = false;
                                og0Var.e = z2 ? 1 : 0;
                                r3 = z2;
                                break;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                z6 = z13 ? 1 : 0;
                                j2 = og0Var.g;
                                if (j2 <= 2147483647L) {
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(j2).length() + 21);
                                    sb9.append("String element size: ");
                                    sb9.append(j2);
                                    throw no0.a(null, sb9.toString());
                                }
                                i6 = (int) j2;
                                if (i6 == 0) {
                                    str = "";
                                } else {
                                    bArr = new byte[i6];
                                    ((fd0) od0Var).w(bArr, z6 ? 1 : 0, i6, z6);
                                    while (i6 > 0) {
                                        i7 = i6 - 1;
                                        if (bArr[i7] == 0) {
                                            i6 = i7;
                                        } else {
                                            str = new String(bArr, z6 ? 1 : 0, i6);
                                        }
                                    }
                                    str = new String(bArr, z6 ? 1 : 0, i6);
                                }
                                sg0Var.getClass();
                                if (i != 134) {
                                    sg0Var.h(i);
                                    sg0Var.x.c = str;
                                } else if (i != 17026) {
                                    if ("webm".equals(str) && !"matroska".equals(str)) {
                                        StringBuilder sb10 = new StringBuilder(str.length() + 22);
                                        sb10.append("DocType ");
                                        sb10.append(str);
                                        sb10.append(" not supported");
                                        throw no0.a(null, sb10.toString());
                                    }
                                    sg0Var.v = str.equals("webm");
                                } else if (i != 21358) {
                                    sg0Var.h(i);
                                    sg0Var.x.b = str;
                                } else if (i == 2274716) {
                                    sg0Var.h(i);
                                    sg0Var.x.Z = str;
                                }
                                r3 = 0;
                                og0Var.e = 0;
                                break;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                j3 = ((fd0) od0Var).i;
                                arrayDeque.push(new ng0(i, og0Var.g + j3));
                                dr0 dr0Var2 = og0Var.d;
                                i8 = og0Var.f;
                                j4 = og0Var.g;
                                sg0Var2 = (sg0) dr0Var2.g;
                                pd0Var = sg0Var2.h0;
                                pd0Var.getClass();
                                if (i8 != 160) {
                                    i9 = 0;
                                    sg0Var2.W = false;
                                    sg0Var2.X = 0L;
                                } else if (i8 != 174) {
                                    if (i8 != 183) {
                                        sg0Var2.i(i8);
                                        sg0Var2.E = -1;
                                        sg0Var2.F = -1L;
                                    } else if (i8 != 187) {
                                        sg0Var2.i(i8);
                                        sg0Var2.D = -9223372036854775807L;
                                    } else if (i8 != 19899) {
                                        sg0Var2.z = -1;
                                        sg0Var2.A = -1L;
                                    } else if (i8 != 20533) {
                                        sg0Var2.h(i8);
                                        sg0Var2.x.i = true;
                                    } else if (i8 != 21968) {
                                        sg0Var2.h(i8);
                                        sg0Var2.x.z = true;
                                    } else if (i8 != 408125543) {
                                        j5 = sg0Var2.r;
                                        if (j5 == -1 && j5 != j3) {
                                            throw no0.a(null, "Multiple Segment elements not supported");
                                        }
                                        sg0Var2.r = j3;
                                        sg0Var2.q = j4;
                                    } else if (i8 != 475249515) {
                                        sg0Var2.C = true;
                                    } else if (i8 == 524531317 && !sg0Var2.y) {
                                        if (sg0Var2.c || sg0Var2.I == -1) {
                                            pd0Var.v(new sd0(sg0Var2.u, 0L));
                                            sg0Var2.y = true;
                                        } else {
                                            sg0Var2.H = true;
                                        }
                                    }
                                    i9 = 0;
                                } else {
                                    rg0 rg0Var3 = new rg0();
                                    rg0Var3.n = -1;
                                    rg0Var3.o = -1;
                                    rg0Var3.p = -1;
                                    rg0Var3.q = -1;
                                    rg0Var3.r = -1;
                                    rg0Var3.s = 0;
                                    rg0Var3.t = -1;
                                    rg0Var3.u = 0.0f;
                                    rg0Var3.v = 0.0f;
                                    rg0Var3.w = 0.0f;
                                    rg0Var3.x = null;
                                    rg0Var3.y = -1;
                                    rg0Var3.z = false;
                                    rg0Var3.A = -1;
                                    rg0Var3.B = -1;
                                    rg0Var3.C = -1;
                                    rg0Var3.D = 1000;
                                    rg0Var3.E = 200;
                                    rg0Var3.F = -1.0f;
                                    rg0Var3.G = -1.0f;
                                    rg0Var3.H = -1.0f;
                                    rg0Var3.I = -1.0f;
                                    rg0Var3.J = -1.0f;
                                    rg0Var3.K = -1.0f;
                                    rg0Var3.L = -1.0f;
                                    rg0Var3.M = -1.0f;
                                    rg0Var3.N = -1.0f;
                                    rg0Var3.O = -1.0f;
                                    rg0Var3.Q = 1;
                                    rg0Var3.R = -1;
                                    rg0Var3.S = 8000;
                                    rg0Var3.T = 0L;
                                    rg0Var3.U = 0L;
                                    i9 = 0;
                                    rg0Var3.W = false;
                                    rg0Var3.Y = true;
                                    rg0Var3.Z = "eng";
                                    sg0Var2.x = rg0Var3;
                                    rg0Var3.a = sg0Var2.v;
                                }
                                og0Var.e = i9;
                                r3 = i9;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i10 = (int) og0Var.g;
                                cw1Var = sg0Var.h;
                                sparseArray = sg0Var.b;
                                if (i != 161 || i == 163) {
                                    if (sg0Var.M == 0) {
                                        tg0 tg0Var2 = sg0Var.a;
                                        sg0Var.S = (int) tg0Var2.e(od0Var, z13, true, 8);
                                        sg0Var.T = tg0Var2.g;
                                        sg0Var.O = -9223372036854775807L;
                                        sg0Var.M = 1;
                                        cw1Var.y(z13 ? 1 : 0);
                                    }
                                    rg0Var = (rg0) sparseArray.get(sg0Var.S);
                                    if (rg0Var == null) {
                                        ((fd0) od0Var).b(i10 - sg0Var.T, z13);
                                        sg0Var.M = z13 ? 1 : 0;
                                        z7 = z13;
                                    } else {
                                        rg0Var.a0.getClass();
                                        if (sg0Var.M == 1) {
                                            sg0Var.k(od0Var, 3);
                                            i13 = (cw1Var.a[2] & 6) >> 1;
                                            b = 255;
                                            if (i13 == 0) {
                                                sg0Var.Q = 1;
                                                iArr4 = sg0Var.R;
                                                if (iArr4 == null) {
                                                    iArr4 = new int[1];
                                                } else {
                                                    length2 = iArr4.length;
                                                    if (length2 < 1) {
                                                        iArr4 = new int[Math.max(length2 + length2, 1)];
                                                    }
                                                }
                                                sg0Var.R = iArr4;
                                                iArr4[z13 ? 1 : 0] = (i10 - sg0Var.T) - 3;
                                            } else {
                                                sg0Var.k(od0Var, 4);
                                                i14 = (cw1Var.a[3] & 255) + 1;
                                                sg0Var.Q = i14;
                                                iArr = sg0Var.R;
                                                if (iArr == null) {
                                                    iArr = new int[i14];
                                                } else {
                                                    length = iArr.length;
                                                    if (length < i14) {
                                                        iArr = new int[Math.max(length + length, i14)];
                                                    }
                                                }
                                                sg0Var.R = iArr;
                                                if (i13 == 2) {
                                                    int i42 = (i10 - sg0Var.T) - 4;
                                                    int i43 = sg0Var.Q;
                                                    Arrays.fill(iArr, z13 ? 1 : 0, i43, i42 / i43);
                                                } else {
                                                    if (i13 == 1) {
                                                        i27 = z13 ? 1 : 0;
                                                        i28 = i27;
                                                        i29 = 4;
                                                        while (true) {
                                                            i30 = sg0Var.Q - 1;
                                                            iArr3 = sg0Var.R;
                                                            if (i27 < i30) {
                                                                iArr3[i27] = z13 ? 1 : 0;
                                                                while (true) {
                                                                    i31 = i29 + 1;
                                                                    sg0Var.k(od0Var, i31);
                                                                    i32 = cw1Var.a[i29] & 255;
                                                                    int[] iArr5 = sg0Var.R;
                                                                    i33 = iArr5[i27] + i32;
                                                                    iArr5[i27] = i33;
                                                                    if (i32 != 255) {
                                                                    }
                                                                    i29 = i31;
                                                                    break;
                                                                }
                                                                i28 += i33;
                                                                i27++;
                                                                i29 = i31;
                                                            } else {
                                                                iArr3[i30] = ((i10 - sg0Var.T) - i29) - i28;
                                                            }
                                                        }
                                                    } else {
                                                        if (i13 != 3) {
                                                            throw no0.a(null, "Unexpected lacing value: 2");
                                                        }
                                                        i15 = z13 ? 1 : 0;
                                                        i16 = i15;
                                                        i17 = 4;
                                                        z8 = z13;
                                                        while (true) {
                                                            i18 = sg0Var.Q - 1;
                                                            iArr2 = sg0Var.R;
                                                            if (i15 < i18) {
                                                                iArr2[i15 == true ? 1 : 0] = z8 ? 1 : 0;
                                                                i20 = i17 + 1;
                                                                sg0Var.k(od0Var, i20);
                                                                if (cw1Var.a[i17] == 0) {
                                                                    throw no0.a(null, "No valid varint length mask found");
                                                                }
                                                                i21 = z8 ? 1 : 0;
                                                                z9 = z8;
                                                                while (true) {
                                                                    if (i21 < 8) {
                                                                        i25 = 1 << (7 - i21);
                                                                        z11 = z9;
                                                                        if ((cw1Var.a[i17] & i25) != 0) {
                                                                            i26 = i20 + i21;
                                                                            sg0Var.k(od0Var, i26);
                                                                            i22 = i10;
                                                                            i24 = i16;
                                                                            j7 = cw1Var.a[i17] & b & (~i25);
                                                                            while (i20 < i26) {
                                                                                j7 = (j7 << 8) | ((long) (cw1Var.a[i20] & 255));
                                                                                i20++;
                                                                                i15 = i15 == true ? 1 : 0;
                                                                            }
                                                                            i23 = i15;
                                                                            if (i23 > 0) {
                                                                                j6 = j7 - ((1 << ((i21 * 7) + 6)) - 1);
                                                                                i17 = i26;
                                                                                z10 = z11;
                                                                            } else {
                                                                                i17 = i26;
                                                                                j6 = j7;
                                                                                z10 = z11;
                                                                            }
                                                                        } else {
                                                                            boolean z14 = i15 == true ? 1 : 0;
                                                                            i21++;
                                                                            z9 = z11 ? 1 : 0;
                                                                            b = 255;
                                                                        }
                                                                    } else {
                                                                        z10 = z9;
                                                                        i22 = i10;
                                                                        i23 = i15 == true ? 1 : 0;
                                                                        i24 = i16;
                                                                        i17 = i20;
                                                                        j6 = 0;
                                                                    }
                                                                }
                                                                if (j6 >= -2147483648L || j6 > 2147483647L) {
                                                                    throw no0.a(null, "EBML lacing sample size out of range.");
                                                                }
                                                                int[] iArr6 = sg0Var.R;
                                                                int i44 = (int) j6;
                                                                if (i23 != 0) {
                                                                    i44 += iArr6[i23 - 1];
                                                                }
                                                                iArr6[i23] = i44;
                                                                i16 = i24 + i44;
                                                                i15 = i23 + 1;
                                                                i10 = i22;
                                                                z8 = z10;
                                                                b = 255;
                                                            } else {
                                                                i19 = z8 ? 1 : 0;
                                                                iArr2[i18] = ((i10 - sg0Var.T) - i17) - (i16 == true ? 1 : 0);
                                                            }
                                                        }
                                                    }
                                                    byte[] bArr3 = cw1Var.a;
                                                    int i45 = bArr3[i19] << 8;
                                                    sg0Var.N = sg0Var.p((bArr3[1] & 255) | i45) + sg0Var.K;
                                                    if (rg0Var.e != 1) {
                                                        i34 = 2;
                                                        i35 = 1;
                                                    } else if (i == 163) {
                                                        i34 = 2;
                                                        if ((cw1Var.a[2] & 128) == 128) {
                                                            i35 = 1;
                                                        } else {
                                                            i35 = i19;
                                                        }
                                                        i = 163;
                                                    } else {
                                                        i34 = 2;
                                                        i35 = i19;
                                                    }
                                                    sg0Var.U = i35;
                                                    sg0Var.M = i34;
                                                    sg0Var.P = i19 == true ? 1 : 0;
                                                }
                                            }
                                            i19 = z13 ? 1 : 0;
                                            byte[] bArr4 = cw1Var.a;
                                            int i46 = bArr4[i19] << 8;
                                            sg0Var.N = sg0Var.p((bArr4[1] & 255) | i46) + sg0Var.K;
                                            if (rg0Var.e != 1) {
                                                i34 = 2;
                                                i35 = 1;
                                            } else if (i == 163) {
                                                i34 = 2;
                                                if ((cw1Var.a[2] & 128) == 128) {
                                                    i35 = 1;
                                                } else {
                                                    i35 = i19;
                                                }
                                                i = 163;
                                            } else {
                                                i34 = 2;
                                                i35 = i19;
                                            }
                                            sg0Var.U = i35;
                                            sg0Var.M = i34;
                                            sg0Var.P = i19 == true ? 1 : 0;
                                        }
                                        if (i == 163) {
                                            while (true) {
                                                i12 = sg0Var.P;
                                                if (i12 < sg0Var.Q) {
                                                    sg0Var.j(rg0Var, sg0Var.N + ((long) ((sg0Var.P * rg0Var.f) / 1000)), sg0Var.U, sg0Var.l(od0Var, rg0Var, sg0Var.R[i12], false), 0);
                                                    sg0Var.P++;
                                                } else {
                                                    z7 = false;
                                                    sg0Var.M = 0;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i11 = sg0Var.P;
                                                if (i11 < sg0Var.Q) {
                                                    int[] iArr7 = sg0Var.R;
                                                    iArr7[i11] = sg0Var.l(od0Var, rg0Var, iArr7[i11], true);
                                                    sg0Var.P++;
                                                } else {
                                                    z7 = false;
                                                }
                                            }
                                        }
                                    }
                                } else if (i != 165) {
                                    if (i == 16877) {
                                        sg0Var.h(i);
                                        rg0 rg0Var4 = sg0Var.x;
                                        int i47 = rg0Var4.h;
                                        if (i47 == 1685485123 || i47 == 1685480259) {
                                            byte[] bArr5 = new byte[i10];
                                            rg0Var4.P = bArr5;
                                            ((fd0) od0Var).w(bArr5, z13 ? 1 : 0, i10, z13);
                                            z7 = z13;
                                        } else {
                                            ((fd0) od0Var).b(i10, z13);
                                            z7 = z13;
                                        }
                                    } else if (i == 16981) {
                                        sg0Var.h(i);
                                        rg0 rg0Var5 = sg0Var.x;
                                        byte[] bArr6 = new byte[i10];
                                        rg0Var5.j = bArr6;
                                        ((fd0) od0Var).w(bArr6, z13 ? 1 : 0, i10, z13);
                                        z7 = z13;
                                    } else if (i == 18402) {
                                        byte[] bArr7 = new byte[i10];
                                        ((fd0) od0Var).w(bArr7, z13 ? 1 : 0, i10, z13);
                                        sg0Var.h(i);
                                        sg0Var.x.k = new le0(1, z13 ? 1 : 0, z13 ? 1 : 0, bArr7);
                                        z7 = z13;
                                    } else if (i == 21419) {
                                        cw1 cw1Var2 = sg0Var.j;
                                        Arrays.fill(cw1Var2.a, z13 ? (byte) 1 : (byte) 0);
                                        ((fd0) od0Var).w(cw1Var2.a, 4 - i10, i10, z13);
                                        cw1Var2.E(z13 ? 1 : 0);
                                        sg0Var.z = (int) cw1Var2.P();
                                        z7 = z13;
                                    } else if (i == 25506) {
                                        sg0Var.h(i);
                                        rg0 rg0Var6 = sg0Var.x;
                                        byte[] bArr8 = new byte[i10];
                                        rg0Var6.l = bArr8;
                                        ((fd0) od0Var).w(bArr8, z13 ? 1 : 0, i10, z13);
                                        z7 = z13;
                                    } else {
                                        if (i != 30322) {
                                            StringBuilder sb11 = new StringBuilder(String.valueOf(i).length() + 15);
                                            sb11.append("Unexpected id: ");
                                            sb11.append(i);
                                            throw no0.a(null, sb11.toString());
                                        }
                                        sg0Var.h(i);
                                        rg0 rg0Var7 = sg0Var.x;
                                        byte[] bArr9 = new byte[i10];
                                        rg0Var7.x = bArr9;
                                        ((fd0) od0Var).w(bArr9, z13 ? 1 : 0, i10, z13);
                                        z7 = z13;
                                    }
                                } else if (sg0Var.M != 2) {
                                    z7 = false;
                                } else {
                                    rg0 rg0Var8 = (rg0) sparseArray.get(sg0Var.S);
                                    if (sg0Var.V == 4 && "V_VP9".equals(rg0Var8.c)) {
                                        cw1 cw1Var3 = sg0Var.o;
                                        cw1Var3.y(i10);
                                        ((fd0) od0Var).w(cw1Var3.a, z13 ? 1 : 0, i10, z13);
                                        z7 = z13;
                                    } else {
                                        ((fd0) od0Var).b(i10, z13);
                                        z7 = z13;
                                    }
                                }
                                og0Var.e = z7 ? 1 : 0;
                                r3 = z7;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                j8 = og0Var.g;
                                if (j8 == 4 && j8 != 8) {
                                    StringBuilder sb12 = new StringBuilder(String.valueOf(j8).length() + 20);
                                    sb12.append("Invalid float size: ");
                                    sb12.append(j8);
                                    throw no0.a(null, sb12.toString());
                                }
                                i36 = (int) j8;
                                jA2 = og0Var.a(od0Var, i36);
                                if (i36 == 4) {
                                    dLongBitsToDouble = Float.intBitsToFloat((int) jA2);
                                } else {
                                    dLongBitsToDouble = Double.longBitsToDouble(jA2);
                                }
                                if (i != 181) {
                                    sg0Var.h(i);
                                    sg0Var.x.S = (int) dLongBitsToDouble;
                                } else if (i != 17545) {
                                    switch (i) {
                                        case 21969:
                                            sg0Var.h(i);
                                            sg0Var.x.F = (float) dLongBitsToDouble;
                                            break;
                                        case 21970:
                                            sg0Var.h(i);
                                            sg0Var.x.G = (float) dLongBitsToDouble;
                                            break;
                                        case 21971:
                                            sg0Var.h(i);
                                            sg0Var.x.H = (float) dLongBitsToDouble;
                                            break;
                                        case 21972:
                                            sg0Var.h(i);
                                            sg0Var.x.I = (float) dLongBitsToDouble;
                                            break;
                                        case 21973:
                                            sg0Var.h(i);
                                            sg0Var.x.J = (float) dLongBitsToDouble;
                                            break;
                                        case 21974:
                                            sg0Var.h(i);
                                            sg0Var.x.K = (float) dLongBitsToDouble;
                                            break;
                                        case 21975:
                                            sg0Var.h(i);
                                            sg0Var.x.L = (float) dLongBitsToDouble;
                                            break;
                                        case 21976:
                                            sg0Var.h(i);
                                            sg0Var.x.M = (float) dLongBitsToDouble;
                                            break;
                                        case 21977:
                                            sg0Var.h(i);
                                            sg0Var.x.N = (float) dLongBitsToDouble;
                                            break;
                                        case 21978:
                                            sg0Var.h(i);
                                            sg0Var.x.O = (float) dLongBitsToDouble;
                                            break;
                                        default:
                                            switch (i) {
                                                case 30323:
                                                    sg0Var.h(i);
                                                    sg0Var.x.u = (float) dLongBitsToDouble;
                                                    break;
                                                case 30324:
                                                    sg0Var.h(i);
                                                    sg0Var.x.v = (float) dLongBitsToDouble;
                                                    break;
                                                case 30325:
                                                    sg0Var.h(i);
                                                    sg0Var.x.w = (float) dLongBitsToDouble;
                                                    break;
                                                default:
                                                    sg0Var.getClass();
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    sg0Var.t = (long) dLongBitsToDouble;
                                }
                                og0Var.e = z13 ? 1 : 0;
                                r3 = z13;
                                break;
                                break;
                            default:
                                ((fd0) od0Var).b((int) og0Var.g, z13);
                                og0Var.e = z13 ? 1 : 0;
                                break;
                        }
                        z12 = true;
                        r4 = r3;
                    }
                    og0Var.g = tg0Var.e(od0Var, z13, z, 8);
                    og0Var.e = 2;
                    dr0 dr0Var3 = og0Var.d;
                    i = og0Var.f;
                    sg0Var = (sg0) dr0Var3.g;
                    switch (i) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            j = og0Var.g;
                            if (j <= 8) {
                                StringBuilder sb13 = new StringBuilder(String.valueOf(j).length() + 22);
                                sb13.append("Invalid integer size: ");
                                sb13.append(j);
                                throw no0.a(null, sb13.toString());
                            }
                            jA = og0Var.a(od0Var, (int) j);
                            sg0Var.getClass();
                            if (i != 20529) {
                                if (i != 20530) {
                                    switch (i) {
                                        case 131:
                                            i2 = (int) jA;
                                            if (i2 != 1) {
                                                sg0Var.h(i);
                                                sg0Var.x.e = 2;
                                            } else if (i2 != 2) {
                                                sg0Var.h(i);
                                                sg0Var.x.e = 1;
                                            } else if (i2 != 17) {
                                                sg0Var.h(i);
                                                sg0Var.x.e = 3;
                                            } else if (i2 != 33) {
                                                sg0Var.h(i);
                                                sg0Var.x.e = 5;
                                            } else {
                                                sg0Var.h(i);
                                                sg0Var.x.e = -1;
                                            }
                                            break;
                                        case 136:
                                            if (jA == 1) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            sg0Var.h(i);
                                            sg0Var.x.Y = z3;
                                            break;
                                        case 155:
                                            sg0Var.O = sg0Var.p(jA);
                                            break;
                                        case 159:
                                            sg0Var.h(i);
                                            sg0Var.x.Q = (int) jA;
                                            break;
                                        case 176:
                                            sg0Var.h(i);
                                            sg0Var.x.n = (int) jA;
                                            break;
                                        case 179:
                                            sg0Var.i(i);
                                            sg0Var.D = sg0Var.p(jA);
                                            break;
                                        case 186:
                                            sg0Var.h(i);
                                            sg0Var.x.o = (int) jA;
                                            break;
                                        case 215:
                                            sg0Var.h(i);
                                            sg0Var.x.d = (int) jA;
                                            break;
                                        case 231:
                                            sg0Var.K = sg0Var.p(jA);
                                            break;
                                        case 238:
                                            sg0Var.V = (int) jA;
                                            break;
                                        case 241:
                                            sg0Var.i(i);
                                            if (sg0Var.F == -1) {
                                                sg0Var.F = jA;
                                            }
                                            break;
                                        case 247:
                                            sg0Var.i(i);
                                            sg0Var.E = (int) jA;
                                            break;
                                        case 251:
                                            sg0Var.W = true;
                                            break;
                                        case 16871:
                                            sg0Var.h(i);
                                            sg0Var.x.h = (int) jA;
                                            break;
                                        case 16980:
                                            if (jA != 3) {
                                                StringBuilder sb14 = new StringBuilder(String.valueOf(jA).length() + 30);
                                                sb14.append("ContentCompAlgo ");
                                                sb14.append(jA);
                                                sb14.append(" not supported");
                                                throw no0.a(null, sb14.toString());
                                            }
                                            break;
                                        case 17029:
                                            if (jA >= 1) {
                                            }
                                            StringBuilder sb15 = new StringBuilder(String.valueOf(jA).length() + 33);
                                            sb15.append("DocTypeReadVersion ");
                                            sb15.append(jA);
                                            sb15.append(" not supported");
                                            throw no0.a(null, sb15.toString());
                                        case 17143:
                                            if (jA != 1) {
                                                StringBuilder sb16 = new StringBuilder(String.valueOf(jA).length() + 30);
                                                sb16.append("EBMLReadVersion ");
                                                sb16.append(jA);
                                                sb16.append(" not supported");
                                                throw no0.a(null, sb16.toString());
                                            }
                                            break;
                                        case 18401:
                                            if (jA != 5) {
                                                StringBuilder sb17 = new StringBuilder(String.valueOf(jA).length() + 29);
                                                sb17.append("ContentEncAlgo ");
                                                sb17.append(jA);
                                                sb17.append(" not supported");
                                                throw no0.a(null, sb17.toString());
                                            }
                                            break;
                                        case 18408:
                                            if (jA != 1) {
                                                StringBuilder sb18 = new StringBuilder(String.valueOf(jA).length() + 36);
                                                sb18.append("AESSettingsCipherMode ");
                                                sb18.append(jA);
                                                sb18.append(" not supported");
                                                throw no0.a(null, sb18.toString());
                                            }
                                            break;
                                        case 21420:
                                            sg0Var.A = jA + sg0Var.r;
                                            break;
                                        case 21432:
                                            i3 = (int) jA;
                                            sg0Var.h(i);
                                            if (i3 != 0) {
                                                z4 = false;
                                                sg0Var.x.y = 0;
                                                z2 = z4;
                                                og0Var.e = z2 ? 1 : 0;
                                                r3 = z2;
                                            } else if (i3 != 1) {
                                                sg0Var.x.y = 2;
                                            } else if (i3 != 3) {
                                                sg0Var.x.y = 1;
                                            } else if (i3 == 15) {
                                                sg0Var.x.y = 3;
                                            }
                                            break;
                                        case 21680:
                                            sg0Var.h(i);
                                            sg0Var.x.q = (int) jA;
                                            break;
                                        case 21682:
                                            sg0Var.h(i);
                                            sg0Var.x.s = (int) jA;
                                            break;
                                        case 21690:
                                            sg0Var.h(i);
                                            sg0Var.x.r = (int) jA;
                                            break;
                                        case 21930:
                                            if (jA == 1) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            sg0Var.h(i);
                                            sg0Var.x.X = z5;
                                            break;
                                        case 21938:
                                            int i48 = (int) jA;
                                            sg0Var.h(i);
                                            rg0 rg0Var9 = sg0Var.x;
                                            rg0Var9.z = true;
                                            rg0Var9.p = i48;
                                            break;
                                        case 21998:
                                            sg0Var.h(i);
                                            sg0Var.x.g = (int) jA;
                                            break;
                                        case 22186:
                                            sg0Var.h(i);
                                            sg0Var.x.T = jA;
                                            break;
                                        case 22203:
                                            sg0Var.h(i);
                                            sg0Var.x.U = jA;
                                            break;
                                        case 25188:
                                            sg0Var.h(i);
                                            sg0Var.x.R = (int) jA;
                                            break;
                                        case 30114:
                                            sg0Var.X = jA;
                                            break;
                                        case 30321:
                                            i4 = (int) jA;
                                            sg0Var.h(i);
                                            if (i4 != 0) {
                                                z4 = false;
                                                sg0Var.x.t = 0;
                                                z2 = z4;
                                                og0Var.e = z2 ? 1 : 0;
                                                r3 = z2;
                                            } else if (i4 != 1) {
                                                sg0Var.x.t = 1;
                                            } else if (i4 != 2) {
                                                sg0Var.x.t = 2;
                                            } else if (i4 == 3) {
                                                sg0Var.x.t = 3;
                                            }
                                            break;
                                        case 2352003:
                                            sg0Var.h(i);
                                            sg0Var.x.f = (int) jA;
                                            break;
                                        case 2807729:
                                            sg0Var.s = jA;
                                            break;
                                        default:
                                            switch (i) {
                                                case 21945:
                                                    i5 = (int) jA;
                                                    sg0Var.h(i);
                                                    if (i5 != 1) {
                                                        sg0Var.x.C = 2;
                                                    } else if (i5 == 2) {
                                                        sg0Var.x.C = 1;
                                                    }
                                                    break;
                                                case 21946:
                                                    sg0Var.h(i);
                                                    iC = c43.c((int) jA);
                                                    if (iC != -1) {
                                                        sg0Var.x.B = iC;
                                                    }
                                                    break;
                                                case 21947:
                                                    sg0Var.h(i);
                                                    sg0Var.x.z = true;
                                                    iB = c43.b((int) jA);
                                                    if (iB != -1) {
                                                        sg0Var.x.A = iB;
                                                    }
                                                    break;
                                                case 21948:
                                                    sg0Var.h(i);
                                                    sg0Var.x.D = (int) jA;
                                                    break;
                                                case 21949:
                                                    sg0Var.h(i);
                                                    sg0Var.x.E = (int) jA;
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (jA != 1) {
                                    StringBuilder sb19 = new StringBuilder(String.valueOf(jA).length() + 35);
                                    sb19.append("ContentEncodingScope ");
                                    sb19.append(jA);
                                    sb19.append(" not supported");
                                    throw no0.a(null, sb19.toString());
                                }
                            } else if (jA != 0) {
                                StringBuilder sb20 = new StringBuilder(String.valueOf(jA).length() + 35);
                                sb20.append("ContentEncodingOrder ");
                                sb20.append(jA);
                                sb20.append(" not supported");
                                throw no0.a(null, sb20.toString());
                            }
                            z2 = false;
                            og0Var.e = z2 ? 1 : 0;
                            r3 = z2;
                            break;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            z6 = z13 ? 1 : 0;
                            j2 = og0Var.g;
                            if (j2 <= 2147483647L) {
                                StringBuilder sb21 = new StringBuilder(String.valueOf(j2).length() + 21);
                                sb21.append("String element size: ");
                                sb21.append(j2);
                                throw no0.a(null, sb21.toString());
                            }
                            i6 = (int) j2;
                            if (i6 == 0) {
                                str = "";
                            } else {
                                bArr = new byte[i6];
                                ((fd0) od0Var).w(bArr, z6 ? 1 : 0, i6, z6);
                                while (i6 > 0) {
                                    i7 = i6 - 1;
                                    if (bArr[i7] == 0) {
                                        i6 = i7;
                                    } else {
                                        str = new String(bArr, z6 ? 1 : 0, i6);
                                    }
                                }
                                str = new String(bArr, z6 ? 1 : 0, i6);
                            }
                            sg0Var.getClass();
                            if (i != 134) {
                                sg0Var.h(i);
                                sg0Var.x.c = str;
                            } else if (i != 17026) {
                                if ("webm".equals(str)) {
                                }
                                sg0Var.v = str.equals("webm");
                                break;
                            } else if (i != 21358) {
                                sg0Var.h(i);
                                sg0Var.x.b = str;
                            } else if (i == 2274716) {
                                sg0Var.h(i);
                                sg0Var.x.Z = str;
                            }
                            r3 = 0;
                            og0Var.e = 0;
                            break;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            j3 = ((fd0) od0Var).i;
                            arrayDeque.push(new ng0(i, og0Var.g + j3));
                            dr0 dr0Var4 = og0Var.d;
                            i8 = og0Var.f;
                            j4 = og0Var.g;
                            sg0Var2 = (sg0) dr0Var4.g;
                            pd0Var = sg0Var2.h0;
                            pd0Var.getClass();
                            if (i8 != 160) {
                                i9 = 0;
                                sg0Var2.W = false;
                                sg0Var2.X = 0L;
                            } else if (i8 != 174) {
                                if (i8 != 183) {
                                    sg0Var2.i(i8);
                                    sg0Var2.E = -1;
                                    sg0Var2.F = -1L;
                                } else if (i8 != 187) {
                                    sg0Var2.i(i8);
                                    sg0Var2.D = -9223372036854775807L;
                                } else if (i8 != 19899) {
                                    sg0Var2.z = -1;
                                    sg0Var2.A = -1L;
                                } else if (i8 != 20533) {
                                    sg0Var2.h(i8);
                                    sg0Var2.x.i = true;
                                } else if (i8 != 21968) {
                                    sg0Var2.h(i8);
                                    sg0Var2.x.z = true;
                                } else if (i8 != 408125543) {
                                    j5 = sg0Var2.r;
                                    if (j5 == -1) {
                                    }
                                    sg0Var2.r = j3;
                                    sg0Var2.q = j4;
                                    break;
                                } else if (i8 != 475249515) {
                                    sg0Var2.C = true;
                                } else if (i8 == 524531317) {
                                    if (sg0Var2.c) {
                                        pd0Var.v(new sd0(sg0Var2.u, 0L));
                                        sg0Var2.y = true;
                                    } else {
                                        pd0Var.v(new sd0(sg0Var2.u, 0L));
                                        sg0Var2.y = true;
                                    }
                                }
                                i9 = 0;
                            } else {
                                rg0 rg0Var10 = new rg0();
                                rg0Var10.n = -1;
                                rg0Var10.o = -1;
                                rg0Var10.p = -1;
                                rg0Var10.q = -1;
                                rg0Var10.r = -1;
                                rg0Var10.s = 0;
                                rg0Var10.t = -1;
                                rg0Var10.u = 0.0f;
                                rg0Var10.v = 0.0f;
                                rg0Var10.w = 0.0f;
                                rg0Var10.x = null;
                                rg0Var10.y = -1;
                                rg0Var10.z = false;
                                rg0Var10.A = -1;
                                rg0Var10.B = -1;
                                rg0Var10.C = -1;
                                rg0Var10.D = 1000;
                                rg0Var10.E = 200;
                                rg0Var10.F = -1.0f;
                                rg0Var10.G = -1.0f;
                                rg0Var10.H = -1.0f;
                                rg0Var10.I = -1.0f;
                                rg0Var10.J = -1.0f;
                                rg0Var10.K = -1.0f;
                                rg0Var10.L = -1.0f;
                                rg0Var10.M = -1.0f;
                                rg0Var10.N = -1.0f;
                                rg0Var10.O = -1.0f;
                                rg0Var10.Q = 1;
                                rg0Var10.R = -1;
                                rg0Var10.S = 8000;
                                rg0Var10.T = 0L;
                                rg0Var10.U = 0L;
                                i9 = 0;
                                rg0Var10.W = false;
                                rg0Var10.Y = true;
                                rg0Var10.Z = "eng";
                                sg0Var2.x = rg0Var10;
                                rg0Var10.a = sg0Var2.v;
                            }
                            og0Var.e = i9;
                            r3 = i9;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i10 = (int) og0Var.g;
                            cw1Var = sg0Var.h;
                            sparseArray = sg0Var.b;
                            if (i != 161) {
                                if (sg0Var.M == 0) {
                                    tg0 tg0Var3 = sg0Var.a;
                                    sg0Var.S = (int) tg0Var3.e(od0Var, z13, true, 8);
                                    sg0Var.T = tg0Var3.g;
                                    sg0Var.O = -9223372036854775807L;
                                    sg0Var.M = 1;
                                    cw1Var.y(z13 ? 1 : 0);
                                }
                                rg0Var = (rg0) sparseArray.get(sg0Var.S);
                                if (rg0Var == null) {
                                    ((fd0) od0Var).b(i10 - sg0Var.T, z13);
                                    sg0Var.M = z13 ? 1 : 0;
                                    z7 = z13;
                                } else {
                                    rg0Var.a0.getClass();
                                    if (sg0Var.M == 1) {
                                        sg0Var.k(od0Var, 3);
                                        i13 = (cw1Var.a[2] & 6) >> 1;
                                        b = 255;
                                        if (i13 == 0) {
                                            sg0Var.Q = 1;
                                            iArr4 = sg0Var.R;
                                            if (iArr4 == null) {
                                                iArr4 = new int[1];
                                            } else {
                                                length2 = iArr4.length;
                                                if (length2 < 1) {
                                                    iArr4 = new int[Math.max(length2 + length2, 1)];
                                                }
                                            }
                                            sg0Var.R = iArr4;
                                            iArr4[z13 ? 1 : 0] = (i10 - sg0Var.T) - 3;
                                        } else {
                                            sg0Var.k(od0Var, 4);
                                            i14 = (cw1Var.a[3] & 255) + 1;
                                            sg0Var.Q = i14;
                                            iArr = sg0Var.R;
                                            if (iArr == null) {
                                                iArr = new int[i14];
                                            } else {
                                                length = iArr.length;
                                                if (length < i14) {
                                                    iArr = new int[Math.max(length + length, i14)];
                                                }
                                            }
                                            sg0Var.R = iArr;
                                            if (i13 == 2) {
                                                int i49 = (i10 - sg0Var.T) - 4;
                                                int i410 = sg0Var.Q;
                                                Arrays.fill(iArr, z13 ? 1 : 0, i410, i49 / i410);
                                            } else {
                                                if (i13 == 1) {
                                                    i27 = z13 ? 1 : 0;
                                                    i28 = i27;
                                                    i29 = 4;
                                                    while (true) {
                                                        i30 = sg0Var.Q - 1;
                                                        iArr3 = sg0Var.R;
                                                        if (i27 < i30) {
                                                            iArr3[i27] = z13 ? 1 : 0;
                                                            while (true) {
                                                                i31 = i29 + 1;
                                                                sg0Var.k(od0Var, i31);
                                                                i32 = cw1Var.a[i29] & 255;
                                                                int[] iArr8 = sg0Var.R;
                                                                i33 = iArr8[i27] + i32;
                                                                iArr8[i27] = i33;
                                                                if (i32 != 255) {
                                                                }
                                                                i29 = i31;
                                                                break;
                                                            }
                                                            i28 += i33;
                                                            i27++;
                                                            i29 = i31;
                                                        } else {
                                                            iArr3[i30] = ((i10 - sg0Var.T) - i29) - i28;
                                                        }
                                                    }
                                                } else {
                                                    if (i13 != 3) {
                                                        throw no0.a(null, "Unexpected lacing value: 2");
                                                    }
                                                    i15 = z13 ? 1 : 0;
                                                    i16 = i15;
                                                    i17 = 4;
                                                    z8 = z13;
                                                    while (true) {
                                                        i18 = sg0Var.Q - 1;
                                                        iArr2 = sg0Var.R;
                                                        if (i15 < i18) {
                                                            iArr2[i15 == true ? 1 : 0] = z8 ? 1 : 0;
                                                            i20 = i17 + 1;
                                                            sg0Var.k(od0Var, i20);
                                                            if (cw1Var.a[i17] == 0) {
                                                                throw no0.a(null, "No valid varint length mask found");
                                                            }
                                                            i21 = z8 ? 1 : 0;
                                                            z9 = z8;
                                                            while (true) {
                                                                if (i21 < 8) {
                                                                    i25 = 1 << (7 - i21);
                                                                    z11 = z9;
                                                                    if ((cw1Var.a[i17] & i25) != 0) {
                                                                        i26 = i20 + i21;
                                                                        sg0Var.k(od0Var, i26);
                                                                        i22 = i10;
                                                                        i24 = i16;
                                                                        j7 = cw1Var.a[i17] & b & (~i25);
                                                                        while (i20 < i26) {
                                                                            j7 = (j7 << 8) | ((long) (cw1Var.a[i20] & 255));
                                                                            i20++;
                                                                            i15 = i15 == true ? 1 : 0;
                                                                        }
                                                                        i23 = i15;
                                                                        if (i23 > 0) {
                                                                            j6 = j7 - ((1 << ((i21 * 7) + 6)) - 1);
                                                                            i17 = i26;
                                                                            z10 = z11;
                                                                        } else {
                                                                            i17 = i26;
                                                                            j6 = j7;
                                                                            z10 = z11;
                                                                        }
                                                                    } else {
                                                                        boolean z15 = i15 == true ? 1 : 0;
                                                                        i21++;
                                                                        z9 = z11 ? 1 : 0;
                                                                        b = 255;
                                                                    }
                                                                } else {
                                                                    z10 = z9;
                                                                    i22 = i10;
                                                                    i23 = i15 == true ? 1 : 0;
                                                                    i24 = i16;
                                                                    i17 = i20;
                                                                    j6 = 0;
                                                                }
                                                            }
                                                            if (j6 >= -2147483648L) {
                                                            }
                                                            throw no0.a(null, "EBML lacing sample size out of range.");
                                                        }
                                                        i19 = z8 ? 1 : 0;
                                                        iArr2[i18] = ((i10 - sg0Var.T) - i17) - (i16 == true ? 1 : 0);
                                                        iArr6[i23] = i44;
                                                        i16 = i24 + i44;
                                                        i15 = i23 + 1;
                                                        i10 = i22;
                                                        z8 = z10;
                                                        b = 255;
                                                    }
                                                }
                                                byte[] bArr10 = cw1Var.a;
                                                int i411 = bArr10[i19] << 8;
                                                sg0Var.N = sg0Var.p((bArr10[1] & 255) | i411) + sg0Var.K;
                                                if (rg0Var.e != 1) {
                                                    i34 = 2;
                                                    i35 = 1;
                                                } else if (i == 163) {
                                                    i34 = 2;
                                                    if ((cw1Var.a[2] & 128) == 128) {
                                                        i35 = 1;
                                                    } else {
                                                        i35 = i19;
                                                    }
                                                    i = 163;
                                                } else {
                                                    i34 = 2;
                                                    i35 = i19;
                                                }
                                                sg0Var.U = i35;
                                                sg0Var.M = i34;
                                                sg0Var.P = i19 == true ? 1 : 0;
                                            }
                                        }
                                        i19 = z13 ? 1 : 0;
                                        byte[] bArr11 = cw1Var.a;
                                        int i412 = bArr11[i19] << 8;
                                        sg0Var.N = sg0Var.p((bArr11[1] & 255) | i412) + sg0Var.K;
                                        if (rg0Var.e != 1) {
                                            i34 = 2;
                                            i35 = 1;
                                        } else if (i == 163) {
                                            i34 = 2;
                                            if ((cw1Var.a[2] & 128) == 128) {
                                                i35 = 1;
                                            } else {
                                                i35 = i19;
                                            }
                                            i = 163;
                                        } else {
                                            i34 = 2;
                                            i35 = i19;
                                        }
                                        sg0Var.U = i35;
                                        sg0Var.M = i34;
                                        sg0Var.P = i19 == true ? 1 : 0;
                                    }
                                    if (i == 163) {
                                        while (true) {
                                            i12 = sg0Var.P;
                                            if (i12 < sg0Var.Q) {
                                                sg0Var.j(rg0Var, sg0Var.N + ((long) ((sg0Var.P * rg0Var.f) / 1000)), sg0Var.U, sg0Var.l(od0Var, rg0Var, sg0Var.R[i12], false), 0);
                                                sg0Var.P++;
                                            } else {
                                                z7 = false;
                                                sg0Var.M = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i11 = sg0Var.P;
                                            if (i11 < sg0Var.Q) {
                                                int[] iArr9 = sg0Var.R;
                                                iArr9[i11] = sg0Var.l(od0Var, rg0Var, iArr9[i11], true);
                                                sg0Var.P++;
                                            } else {
                                                z7 = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (sg0Var.M == 0) {
                                    tg0 tg0Var4 = sg0Var.a;
                                    sg0Var.S = (int) tg0Var4.e(od0Var, z13, true, 8);
                                    sg0Var.T = tg0Var4.g;
                                    sg0Var.O = -9223372036854775807L;
                                    sg0Var.M = 1;
                                    cw1Var.y(z13 ? 1 : 0);
                                }
                                rg0Var = (rg0) sparseArray.get(sg0Var.S);
                                if (rg0Var == null) {
                                    ((fd0) od0Var).b(i10 - sg0Var.T, z13);
                                    sg0Var.M = z13 ? 1 : 0;
                                    z7 = z13;
                                } else {
                                    rg0Var.a0.getClass();
                                    if (sg0Var.M == 1) {
                                        sg0Var.k(od0Var, 3);
                                        i13 = (cw1Var.a[2] & 6) >> 1;
                                        b = 255;
                                        if (i13 == 0) {
                                            sg0Var.Q = 1;
                                            iArr4 = sg0Var.R;
                                            if (iArr4 == null) {
                                                iArr4 = new int[1];
                                            } else {
                                                length2 = iArr4.length;
                                                if (length2 < 1) {
                                                    iArr4 = new int[Math.max(length2 + length2, 1)];
                                                }
                                            }
                                            sg0Var.R = iArr4;
                                            iArr4[z13 ? 1 : 0] = (i10 - sg0Var.T) - 3;
                                        } else {
                                            sg0Var.k(od0Var, 4);
                                            i14 = (cw1Var.a[3] & 255) + 1;
                                            sg0Var.Q = i14;
                                            iArr = sg0Var.R;
                                            if (iArr == null) {
                                                iArr = new int[i14];
                                            } else {
                                                length = iArr.length;
                                                if (length < i14) {
                                                    iArr = new int[Math.max(length + length, i14)];
                                                }
                                            }
                                            sg0Var.R = iArr;
                                            if (i13 == 2) {
                                                int i413 = (i10 - sg0Var.T) - 4;
                                                int i414 = sg0Var.Q;
                                                Arrays.fill(iArr, z13 ? 1 : 0, i414, i413 / i414);
                                            } else {
                                                if (i13 == 1) {
                                                    i27 = z13 ? 1 : 0;
                                                    i28 = i27;
                                                    i29 = 4;
                                                    while (true) {
                                                        i30 = sg0Var.Q - 1;
                                                        iArr3 = sg0Var.R;
                                                        if (i27 < i30) {
                                                            iArr3[i27] = z13 ? 1 : 0;
                                                            while (true) {
                                                                i31 = i29 + 1;
                                                                sg0Var.k(od0Var, i31);
                                                                i32 = cw1Var.a[i29] & 255;
                                                                int[] iArr10 = sg0Var.R;
                                                                i33 = iArr10[i27] + i32;
                                                                iArr10[i27] = i33;
                                                                if (i32 != 255) {
                                                                }
                                                                i29 = i31;
                                                                break;
                                                            }
                                                            i28 += i33;
                                                            i27++;
                                                            i29 = i31;
                                                        } else {
                                                            iArr3[i30] = ((i10 - sg0Var.T) - i29) - i28;
                                                        }
                                                    }
                                                } else {
                                                    if (i13 != 3) {
                                                        throw no0.a(null, "Unexpected lacing value: 2");
                                                    }
                                                    i15 = z13 ? 1 : 0;
                                                    i16 = i15;
                                                    i17 = 4;
                                                    z8 = z13;
                                                    while (true) {
                                                        i18 = sg0Var.Q - 1;
                                                        iArr2 = sg0Var.R;
                                                        if (i15 < i18) {
                                                            iArr2[i15 == true ? 1 : 0] = z8 ? 1 : 0;
                                                            i20 = i17 + 1;
                                                            sg0Var.k(od0Var, i20);
                                                            if (cw1Var.a[i17] == 0) {
                                                                throw no0.a(null, "No valid varint length mask found");
                                                            }
                                                            i21 = z8 ? 1 : 0;
                                                            z9 = z8;
                                                            while (true) {
                                                                if (i21 < 8) {
                                                                    i25 = 1 << (7 - i21);
                                                                    z11 = z9;
                                                                    if ((cw1Var.a[i17] & i25) != 0) {
                                                                        i26 = i20 + i21;
                                                                        sg0Var.k(od0Var, i26);
                                                                        i22 = i10;
                                                                        i24 = i16;
                                                                        j7 = cw1Var.a[i17] & b & (~i25);
                                                                        while (i20 < i26) {
                                                                            j7 = (j7 << 8) | ((long) (cw1Var.a[i20] & 255));
                                                                            i20++;
                                                                            i15 = i15 == true ? 1 : 0;
                                                                        }
                                                                        i23 = i15;
                                                                        if (i23 > 0) {
                                                                            j6 = j7 - ((1 << ((i21 * 7) + 6)) - 1);
                                                                            i17 = i26;
                                                                            z10 = z11;
                                                                        } else {
                                                                            i17 = i26;
                                                                            j6 = j7;
                                                                            z10 = z11;
                                                                        }
                                                                    } else {
                                                                        boolean z16 = i15 == true ? 1 : 0;
                                                                        i21++;
                                                                        z9 = z11 ? 1 : 0;
                                                                        b = 255;
                                                                    }
                                                                } else {
                                                                    z10 = z9;
                                                                    i22 = i10;
                                                                    i23 = i15 == true ? 1 : 0;
                                                                    i24 = i16;
                                                                    i17 = i20;
                                                                    j6 = 0;
                                                                }
                                                            }
                                                            if (j6 >= -2147483648L) {
                                                            }
                                                            throw no0.a(null, "EBML lacing sample size out of range.");
                                                        }
                                                        i19 = z8 ? 1 : 0;
                                                        iArr2[i18] = ((i10 - sg0Var.T) - i17) - (i16 == true ? 1 : 0);
                                                        iArr6[i23] = i44;
                                                        i16 = i24 + i44;
                                                        i15 = i23 + 1;
                                                        i10 = i22;
                                                        z8 = z10;
                                                        b = 255;
                                                    }
                                                }
                                                byte[] bArr12 = cw1Var.a;
                                                int i415 = bArr12[i19] << 8;
                                                sg0Var.N = sg0Var.p((bArr12[1] & 255) | i415) + sg0Var.K;
                                                if (rg0Var.e != 1) {
                                                    i34 = 2;
                                                    i35 = 1;
                                                } else if (i == 163) {
                                                    i34 = 2;
                                                    if ((cw1Var.a[2] & 128) == 128) {
                                                        i35 = 1;
                                                    } else {
                                                        i35 = i19;
                                                    }
                                                    i = 163;
                                                } else {
                                                    i34 = 2;
                                                    i35 = i19;
                                                }
                                                sg0Var.U = i35;
                                                sg0Var.M = i34;
                                                sg0Var.P = i19 == true ? 1 : 0;
                                            }
                                        }
                                        i19 = z13 ? 1 : 0;
                                        byte[] bArr13 = cw1Var.a;
                                        int i416 = bArr13[i19] << 8;
                                        sg0Var.N = sg0Var.p((bArr13[1] & 255) | i416) + sg0Var.K;
                                        if (rg0Var.e != 1) {
                                            i34 = 2;
                                            i35 = 1;
                                        } else if (i == 163) {
                                            i34 = 2;
                                            if ((cw1Var.a[2] & 128) == 128) {
                                                i35 = 1;
                                            } else {
                                                i35 = i19;
                                            }
                                            i = 163;
                                        } else {
                                            i34 = 2;
                                            i35 = i19;
                                        }
                                        sg0Var.U = i35;
                                        sg0Var.M = i34;
                                        sg0Var.P = i19 == true ? 1 : 0;
                                    }
                                    if (i == 163) {
                                        while (true) {
                                            i12 = sg0Var.P;
                                            if (i12 < sg0Var.Q) {
                                                sg0Var.j(rg0Var, sg0Var.N + ((long) ((sg0Var.P * rg0Var.f) / 1000)), sg0Var.U, sg0Var.l(od0Var, rg0Var, sg0Var.R[i12], false), 0);
                                                sg0Var.P++;
                                            } else {
                                                z7 = false;
                                                sg0Var.M = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i11 = sg0Var.P;
                                            if (i11 < sg0Var.Q) {
                                                int[] iArr11 = sg0Var.R;
                                                iArr11[i11] = sg0Var.l(od0Var, rg0Var, iArr11[i11], true);
                                                sg0Var.P++;
                                            } else {
                                                z7 = false;
                                            }
                                        }
                                    }
                                }
                            }
                            og0Var.e = z7 ? 1 : 0;
                            r3 = z7;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            j8 = og0Var.g;
                            if (j8 == 4) {
                            }
                            i36 = (int) j8;
                            jA2 = og0Var.a(od0Var, i36);
                            if (i36 == 4) {
                                dLongBitsToDouble = Float.intBitsToFloat((int) jA2);
                            } else {
                                dLongBitsToDouble = Double.longBitsToDouble(jA2);
                            }
                            if (i != 181) {
                                sg0Var.h(i);
                                sg0Var.x.S = (int) dLongBitsToDouble;
                            } else if (i != 17545) {
                                switch (i) {
                                    case 21969:
                                        sg0Var.h(i);
                                        sg0Var.x.F = (float) dLongBitsToDouble;
                                        break;
                                    case 21970:
                                        sg0Var.h(i);
                                        sg0Var.x.G = (float) dLongBitsToDouble;
                                        break;
                                    case 21971:
                                        sg0Var.h(i);
                                        sg0Var.x.H = (float) dLongBitsToDouble;
                                        break;
                                    case 21972:
                                        sg0Var.h(i);
                                        sg0Var.x.I = (float) dLongBitsToDouble;
                                        break;
                                    case 21973:
                                        sg0Var.h(i);
                                        sg0Var.x.J = (float) dLongBitsToDouble;
                                        break;
                                    case 21974:
                                        sg0Var.h(i);
                                        sg0Var.x.K = (float) dLongBitsToDouble;
                                        break;
                                    case 21975:
                                        sg0Var.h(i);
                                        sg0Var.x.L = (float) dLongBitsToDouble;
                                        break;
                                    case 21976:
                                        sg0Var.h(i);
                                        sg0Var.x.M = (float) dLongBitsToDouble;
                                        break;
                                    case 21977:
                                        sg0Var.h(i);
                                        sg0Var.x.N = (float) dLongBitsToDouble;
                                        break;
                                    case 21978:
                                        sg0Var.h(i);
                                        sg0Var.x.O = (float) dLongBitsToDouble;
                                        break;
                                    default:
                                        switch (i) {
                                            case 30323:
                                                sg0Var.h(i);
                                                sg0Var.x.u = (float) dLongBitsToDouble;
                                                break;
                                            case 30324:
                                                sg0Var.h(i);
                                                sg0Var.x.v = (float) dLongBitsToDouble;
                                                break;
                                            case 30325:
                                                sg0Var.h(i);
                                                sg0Var.x.w = (float) dLongBitsToDouble;
                                                break;
                                            default:
                                                sg0Var.getClass();
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                sg0Var.t = (long) dLongBitsToDouble;
                            }
                            og0Var.e = z13 ? 1 : 0;
                            r3 = z13;
                            break;
                        default:
                            ((fd0) od0Var).b((int) og0Var.g, z13);
                            og0Var.e = z13 ? 1 : 0;
                            break;
                    }
                    z12 = true;
                    r4 = r3;
                } else {
                    ((sg0) og0Var.d.g).b(((ng0) arrayDeque.pop()).a);
                    z12 = true;
                    r4 = z13;
                }
            }
            if (z12) {
                long j10 = ((fd0) od0Var).i;
                if (this.H) {
                    this.J = j10;
                    rd0Var.a = this.I;
                    this.H = r4;
                    return 1;
                }
                if (this.y) {
                    long j11 = this.J;
                    if (j11 != -1) {
                        rd0Var.a = j11;
                        this.J = -1L;
                        return 1;
                    }
                }
                z13 = false;
            } else {
                int i50 = 0;
                while (true) {
                    SparseArray sparseArray2 = this.b;
                    if (i50 >= sparseArray2.size()) {
                        return -1;
                    }
                    rg0 rg0Var11 = (rg0) sparseArray2.valueAt(i50);
                    rg0Var11.a0.getClass();
                    ne0 ne0Var = rg0Var11.V;
                    if (ne0Var != null) {
                        ne0Var.c(rg0Var11.a0, rg0Var11.k);
                    }
                    i50++;
                }
            }
        }
        return z13 ? 1 : 0 ? 1 : 0;
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        this.K = -9223372036854775807L;
        this.M = 0;
        og0 og0Var = this.i0;
        og0Var.e = 0;
        og0Var.b.clear();
        tg0 tg0Var = og0Var.c;
        tg0Var.f = 0;
        tg0Var.g = 0;
        tg0 tg0Var2 = this.a;
        tg0Var2.f = 0;
        tg0Var2.g = 0;
        m();
        this.C = false;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ne0 ne0Var = ((rg0) sparseArray.valueAt(i)).V;
            if (ne0Var != null) {
                ne0Var.b = false;
                ne0Var.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        if (this.d) {
            pd0Var = new md(pd0Var, this.e);
        }
        this.h0 = pd0Var;
    }

    public final void h(int i) throws no0 {
        if (this.x != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw no0.a(null, sb.toString());
    }

    public final void i(int i) throws no0 {
        if (this.C) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw no0.a(null, sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be A[LOOP:0: B:36:0x00b0->B:41:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        r2 = o(r10, 10000, "%01d:%02d:%02d:%02d");
        r3 = 21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.rg0 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg0.j(rg0, long, int, int, int):void");
    }

    public final void k(od0 od0Var, int i) {
        cw1 cw1Var = this.h;
        if (cw1Var.c >= i) {
            return;
        }
        byte[] bArr = cw1Var.a;
        if (bArr.length < i) {
            int length = bArr.length;
            cw1Var.A(Math.max(length + length, i));
        }
        byte[] bArr2 = cw1Var.a;
        int i2 = cw1Var.c;
        od0Var.x(bArr2, i2, i - i2);
        cw1Var.C(i);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01d5  */
    public final int l(od0 od0Var, rg0 rg0Var, int i, boolean z) throws no0 {
        int iB;
        int iB2;
        int i2;
        int i3;
        if ("S_TEXT/UTF8".equals(rg0Var.c)) {
            n(od0Var, j0, i);
            int i4 = this.Z;
            m();
            return i4;
        }
        if ("S_TEXT/ASS".equals(rg0Var.c) || "S_TEXT/SSA".equals(rg0Var.c)) {
            n(od0Var, l0, i);
            int i5 = this.Z;
            m();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(rg0Var.c)) {
            n(od0Var, m0, i);
            int i6 = this.Z;
            m();
            return i6;
        }
        int i7 = 2;
        if (rg0Var.W) {
            rg0Var.b0.getClass();
            cw1 cw1Var = new cw1(i);
            if (od0Var.B(cw1Var.a, 0, i, true)) {
                od0Var.i();
                if (w40.U(cw1Var.J()) == 1 && cw1Var.B() >= 10) {
                    byte[] bArr = new byte[10];
                    cw1Var.H(bArr, 0, 10);
                    cw1Var.E(0);
                    int iN0 = w40.n0(bArr);
                    if (cw1Var.B() >= iN0 + 4) {
                        cw1Var.G(iN0);
                        if (w40.U(cw1Var.b()) == 2) {
                            de3 de3Var = rg0Var.b0;
                            de3Var.getClass();
                            uc3 uc3Var = new uc3(de3Var);
                            uc3Var.e("audio/vnd.dts.hd");
                            rg0Var.b0 = new de3(uc3Var);
                        }
                    }
                }
            }
            rg0Var.a0.d(rg0Var.b0);
            rg0Var.W = false;
            a();
        }
        me0 me0Var = rg0Var.a0;
        boolean z2 = this.b0;
        cw1 cw1Var2 = this.k;
        if (!z2) {
            boolean z3 = rg0Var.i;
            cw1 cw1Var3 = this.h;
            if (z3) {
                this.U &= -1073741825;
                if (!this.c0) {
                    od0Var.x(cw1Var3.a, 0, 1);
                    this.Y++;
                    byte b = cw1Var3.a[0];
                    if ((b & 128) == 128) {
                        throw no0.a(null, "Extension bit is set in signal byte");
                    }
                    this.f0 = b;
                    this.c0 = true;
                }
                byte b2 = this.f0;
                if ((b2 & 1) == 1) {
                    int i8 = b2 & 2;
                    this.U |= 1073741824;
                    if (!this.g0) {
                        cw1 cw1Var4 = this.m;
                        od0Var.x(cw1Var4.a, 0, 8);
                        this.Y += 8;
                        this.g0 = true;
                        cw1Var3.a[0] = (byte) ((i8 != 2 ? 0 : 128) | 8);
                        cw1Var3.E(0);
                        me0Var.a(cw1Var3, 1, 1);
                        this.Z++;
                        cw1Var4.E(0);
                        me0Var.a(cw1Var4, 8, 1);
                        this.Z += 8;
                    }
                    if (i8 == 2) {
                        if (!this.d0) {
                            od0Var.x(cw1Var3.a, 0, 1);
                            this.Y++;
                            cw1Var3.E(0);
                            this.e0 = cw1Var3.K();
                            this.d0 = true;
                        }
                        int i9 = this.e0 * 4;
                        cw1Var3.y(i9);
                        od0Var.x(cw1Var3.a, 0, i9);
                        this.Y += i9;
                        int i10 = (this.e0 >> 1) + 1;
                        int i11 = (i10 * 6) + 2;
                        ByteBuffer byteBuffer = this.p;
                        if (byteBuffer == null || byteBuffer.capacity() < i11) {
                            this.p = ByteBuffer.allocate(i11);
                        }
                        this.p.position(0);
                        this.p.putShort((short) i10);
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i3 = this.e0;
                            if (i12 >= i3) {
                                break;
                            }
                            int iH = cw1Var3.h();
                            int i14 = iH - i13;
                            int i15 = i12 % 2;
                            int i16 = i7;
                            ByteBuffer byteBuffer2 = this.p;
                            if (i15 == 0) {
                                byteBuffer2.putShort((short) i14);
                            } else {
                                byteBuffer2.putInt(i14);
                            }
                            i12++;
                            i13 = iH;
                            i7 = i16;
                        }
                        i2 = i7;
                        int i17 = (i - this.Y) - i13;
                        int i18 = i3 & 1;
                        ByteBuffer byteBuffer3 = this.p;
                        if (i18 == 1) {
                            byteBuffer3.putInt(i17);
                        } else {
                            byteBuffer3.putShort((short) i17);
                            this.p.putInt(0);
                        }
                        byte[] bArrArray = this.p.array();
                        cw1 cw1Var5 = this.n;
                        cw1Var5.z(i11, bArrArray);
                        me0Var.a(cw1Var5, i11, 1);
                        this.Z += i11;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 2;
                byte[] bArr2 = rg0Var.j;
                if (bArr2 != null) {
                    cw1Var2.z(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(rg0Var.c) ? rg0Var.g > 0 : z) {
                this.U |= 268435456;
                this.o.y(0);
                int i19 = (cw1Var2.c + i) - this.Y;
                cw1Var3.y(4);
                byte[] bArr3 = cw1Var3.a;
                bArr3[0] = (byte) ((i19 >> 24) & 255);
                bArr3[1] = (byte) ((i19 >> 16) & 255);
                bArr3[i2] = (byte) ((i19 >> 8) & 255);
                bArr3[3] = (byte) (i19 & 255);
                me0Var.a(cw1Var3, 4, i2);
                this.Z += 4;
            }
            this.b0 = true;
        }
        int i20 = i + cw1Var2.c;
        if (!"V_MPEG4/ISO/AVC".equals(rg0Var.c) && !"V_MPEGH/ISO/HEVC".equals(rg0Var.c)) {
            if (rg0Var.V != null) {
                hn.M(cw1Var2.c == 0);
                rg0Var.V.a(od0Var);
            }
            while (true) {
                int i21 = this.Y;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int iB3 = cw1Var2.B();
                if (iB3 > 0) {
                    iB2 = Math.min(i22, iB3);
                    me0Var.a(cw1Var2, iB2, 0);
                } else {
                    iB2 = me0Var.b(od0Var, i22, false);
                }
                this.Y += iB2;
                this.Z += iB2;
            }
        } else {
            cw1 cw1Var6 = this.g;
            byte[] bArr4 = cw1Var6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i23 = rg0Var.c0;
            int i24 = 4 - i23;
            while (this.Y < i20) {
                int i25 = this.a0;
                if (i25 == 0) {
                    int iMin = Math.min(i23, cw1Var2.B());
                    od0Var.x(bArr4, i24 + iMin, i23 - iMin);
                    if (iMin > 0) {
                        cw1Var2.H(bArr4, i24, iMin);
                    }
                    this.Y += i23;
                    cw1Var6.E(0);
                    this.a0 = cw1Var6.h();
                    cw1 cw1Var7 = this.f;
                    cw1Var7.E(0);
                    me0Var.a(cw1Var7, 4, 0);
                    this.Z += 4;
                } else {
                    int iB4 = cw1Var2.B();
                    if (iB4 > 0) {
                        iB = Math.min(i25, iB4);
                        me0Var.a(cw1Var2, iB, 0);
                    } else {
                        iB = me0Var.b(od0Var, i25, false);
                    }
                    this.Y += iB;
                    this.Z += iB;
                    this.a0 -= iB;
                }
            }
        }
        if ("A_VORBIS".equals(rg0Var.c)) {
            cw1 cw1Var8 = this.i;
            cw1Var8.E(0);
            me0Var.a(cw1Var8, 4, 0);
            this.Z += 4;
        }
        int i26 = this.Z;
        m();
        return i26;
    }

    public final void m() {
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
        this.e0 = 0;
        this.f0 = (byte) 0;
        this.g0 = false;
        this.k.y(0);
    }

    public final void n(od0 od0Var, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        cw1 cw1Var = this.l;
        byte[] bArr2 = cw1Var.a;
        if (bArr2.length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            cw1Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        od0Var.x(cw1Var.a, length, i);
        cw1Var.E(0);
        cw1Var.C(i2);
    }

    public final long p(long j) throws no0 {
        long j2 = this.s;
        if (j2 != -9223372036854775807L) {
            return qz1.t(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw no0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public sg0() {
        this(new og0(), 2, pi0.e);
    }
}
