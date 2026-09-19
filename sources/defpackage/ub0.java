package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class ub0 extends yc3 {
    public static final int[] q1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean r1;
    public static boolean s1;
    public final Context E0;
    public final boolean F0;
    public final z61 G0;
    public final boolean H0;
    public final gc0 I0;
    public final ec0 J0;
    public final long K0;
    public final PriorityQueue L0;
    public eg M0;
    public boolean N0;
    public boolean O0;
    public sc0 P0;
    public boolean Q0;
    public int R0;
    public List S0;
    public Surface T0;
    public wb0 U0;
    public nw1 V0;
    public boolean W0;
    public int X0;
    public int Y0;
    public long Z0;
    public int a1;
    public int b1;
    public int c1;
    public b93 d1;
    public boolean e1;
    public long f1;
    public int g1;
    public long h1;
    public i61 i1;
    public i61 j1;
    public int k1;
    public int l1;
    public dc0 m1;
    public long n1;
    public long o1;
    public boolean p1;

    public ub0(ba0 ba0Var) {
        super(2, (sw1) ba0Var.i, (r53) ba0Var.h, 30.0f);
        Context applicationContext = ((Context) ba0Var.g).getApplicationContext();
        this.E0 = applicationContext;
        this.P0 = null;
        this.G0 = new z61((Handler) ba0Var.j, (d73) ba0Var.k);
        this.F0 = this.P0 == null;
        this.I0 = new gc0(applicationContext, this);
        this.J0 = new ec0();
        this.H0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.V0 = nw1.c;
        this.X0 = 1;
        this.Y0 = 0;
        this.i1 = i61.d;
        this.l1 = 0;
        this.j1 = null;
        this.k1 = -1000;
        this.n1 = -9223372036854775807L;
        this.o1 = -9223372036854775807L;
        this.L0 = new PriorityQueue();
        this.K0 = -9223372036854775807L;
        this.d1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int s0(defpackage.pc3 r8, defpackage.de3 r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub0.s0(pc3, de3):int");
    }

    public static int x0(pc3 pc3Var, de3 de3Var) {
        int i = de3Var.n;
        if (i == -1) {
            return s0(pc3Var, de3Var);
        }
        List list = de3Var.p;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return i + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x019c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x0200  */
    /* JADX WARN: Code duplicated, block: B:167:0x020a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0214  */
    /* JADX WARN: Code duplicated, block: B:173:0x021e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0228  */
    /* JADX WARN: Code duplicated, block: B:179:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x023c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0246  */
    /* JADX WARN: Code duplicated, block: B:188:0x0250  */
    /* JADX WARN: Code duplicated, block: B:191:0x025a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0264  */
    /* JADX WARN: Code duplicated, block: B:197:0x026e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0278  */
    /* JADX WARN: Code duplicated, block: B:203:0x0282  */
    /* JADX WARN: Code duplicated, block: B:206:0x028c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0296  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:215:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:224:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:227:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:230:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:236:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:239:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:242:0x0304  */
    /* JADX WARN: Code duplicated, block: B:245:0x030e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0318  */
    /* JADX WARN: Code duplicated, block: B:251:0x0322  */
    /* JADX WARN: Code duplicated, block: B:254:0x032c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0336  */
    /* JADX WARN: Code duplicated, block: B:260:0x0340  */
    /* JADX WARN: Code duplicated, block: B:263:0x034a  */
    /* JADX WARN: Code duplicated, block: B:266:0x0354  */
    /* JADX WARN: Code duplicated, block: B:269:0x035e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0368  */
    /* JADX WARN: Code duplicated, block: B:275:0x0372  */
    /* JADX WARN: Code duplicated, block: B:278:0x037c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0386  */
    /* JADX WARN: Code duplicated, block: B:284:0x0390  */
    /* JADX WARN: Code duplicated, block: B:287:0x039a  */
    /* JADX WARN: Code duplicated, block: B:290:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:296:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:299:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:302:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:305:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:308:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:311:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:314:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:317:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:320:0x0408  */
    /* JADX WARN: Code duplicated, block: B:323:0x0412  */
    /* JADX WARN: Code duplicated, block: B:326:0x041c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0426  */
    /* JADX WARN: Code duplicated, block: B:332:0x0430  */
    /* JADX WARN: Code duplicated, block: B:335:0x043a  */
    /* JADX WARN: Code duplicated, block: B:338:0x0444  */
    /* JADX WARN: Code duplicated, block: B:341:0x044e  */
    /* JADX WARN: Code duplicated, block: B:344:0x0458  */
    /* JADX WARN: Code duplicated, block: B:347:0x0462  */
    /* JADX WARN: Code duplicated, block: B:350:0x046c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0476  */
    /* JADX WARN: Code duplicated, block: B:356:0x0480  */
    /* JADX WARN: Code duplicated, block: B:359:0x048a  */
    /* JADX WARN: Code duplicated, block: B:362:0x0494  */
    /* JADX WARN: Code duplicated, block: B:365:0x049e  */
    /* JADX WARN: Code duplicated, block: B:368:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:371:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:377:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:380:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:383:0x04da  */
    /* JADX WARN: Code duplicated, block: B:386:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:389:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:392:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:395:0x0502  */
    /* JADX WARN: Code duplicated, block: B:398:0x050c  */
    /* JADX WARN: Code duplicated, block: B:401:0x0516  */
    /* JADX WARN: Code duplicated, block: B:404:0x0520  */
    /* JADX WARN: Code duplicated, block: B:407:0x052a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:410:0x0534  */
    /* JADX WARN: Code duplicated, block: B:413:0x053e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0548  */
    /* JADX WARN: Code duplicated, block: B:419:0x0552  */
    /* JADX WARN: Code duplicated, block: B:422:0x055c  */
    /* JADX WARN: Code duplicated, block: B:425:0x0566  */
    /* JADX WARN: Code duplicated, block: B:428:0x0570  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:431:0x057a  */
    /* JADX WARN: Code duplicated, block: B:434:0x0584  */
    /* JADX WARN: Code duplicated, block: B:437:0x058e  */
    /* JADX WARN: Code duplicated, block: B:440:0x0598  */
    /* JADX WARN: Code duplicated, block: B:443:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:446:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:449:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:452:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:455:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:458:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:461:0x05de  */
    /* JADX WARN: Code duplicated, block: B:464:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:467:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:470:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:473:0x0604  */
    /* JADX WARN: Code duplicated, block: B:476:0x060d  */
    /* JADX WARN: Code duplicated, block: B:479:0x0616  */
    /* JADX WARN: Code duplicated, block: B:482:0x061f  */
    /* JADX WARN: Code duplicated, block: B:485:0x0628  */
    /* JADX WARN: Code duplicated, block: B:488:0x0631  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:491:0x063a  */
    /* JADX WARN: Code duplicated, block: B:494:0x0643  */
    /* JADX WARN: Code duplicated, block: B:497:0x064c  */
    /* JADX WARN: Code duplicated, block: B:500:0x0656 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:504:0x0660  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:504:0x0660
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final boolean y0(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub0.y0(java.lang.String):boolean");
    }

    public static List z0(Context context, r53 r53Var, de3 de3Var, boolean z, boolean z2) {
        List listA;
        String str = de3Var.m;
        if (str == null) {
            return qk2.j;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !ar.x(context)) {
            String strC = cd3.c(de3Var);
            if (strC == null) {
                listA = qk2.j;
            } else {
                r53Var.getClass();
                listA = cd3.a(strC, z, z2);
            }
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return cd3.b(r53Var, de3Var, z, z2);
    }

    @Override // defpackage.yc3
    public final void A() {
        super.A();
        this.L0.clear();
        this.c1 = 0;
        this.e1 = false;
    }

    public final void A0(Object obj) throws Throwable {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.T0;
        z61 z61Var = this.G0;
        if (surface2 == surface) {
            if (surface != null) {
                i61 i61Var = this.j1;
                if (i61Var != null) {
                    z61Var.K(i61Var);
                }
                Surface surface3 = this.T0;
                if (surface3 == null || !this.W0 || (handler = (Handler) z61Var.g) == null) {
                    return;
                }
                handler.post(new oc0(z61Var, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.T0 = surface;
        sc0 sc0Var = this.P0;
        gc0 gc0Var = this.I0;
        if (sc0Var == null) {
            gc0Var.d(surface);
        }
        this.W0 = false;
        int i = this.m;
        nc3 nc3Var = this.P;
        if (nc3Var != null && this.P0 == null) {
            pc3 pc3Var = this.W;
            pc3Var.getClass();
            if (!C0(pc3Var) || this.N0) {
                x();
                v();
            } else {
                Surface surfaceD0 = D0(pc3Var);
                if (surfaceD0 != null) {
                    nc3Var.i(surfaceD0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        j7.a();
                        return;
                    }
                    nc3Var.o();
                }
            }
        }
        if (surface != null) {
            i61 i61Var2 = this.j1;
            if (i61Var2 != null) {
                z61Var.K(i61Var2);
            }
        } else {
            this.j1 = null;
            sc0 sc0Var2 = this.P0;
            if (sc0Var2 != null) {
                sc0Var2.n();
            }
        }
        if (i == 2) {
            sc0 sc0Var3 = this.P0;
            if (sc0Var3 != null) {
                sc0Var3.x0(true);
            } else {
                gc0Var.i = true;
                gc0Var.h = -9223372036854775807L;
            }
        }
    }

    public final boolean B0(lt2 lt2Var) {
        if (n0() || lt2Var.c(536870912)) {
            return true;
        }
        long j = this.o1;
        return j == -9223372036854775807L || j - (lt2Var.f - this.x0.c) <= 100000;
    }

    @Override // defpackage.yc3
    public final oc3 C(IllegalStateException illegalStateException, pc3 pc3Var) {
        Surface surface = this.T0;
        rb0 rb0Var = new rb0(illegalStateException, pc3Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return rb0Var;
    }

    public final boolean C0(pc3 pc3Var) {
        if (this.P0 != null) {
            return true;
        }
        Surface surface = this.T0;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && pc3Var.h) {
            return true;
        }
        if (y0(pc3Var.a)) {
            return false;
        }
        return !pc3Var.f || wb0.a(this.E0);
    }

    @Override // defpackage.yc3
    public final void D(de3 de3Var) throws q43 {
        sc0 sc0Var = this.P0;
        if (sc0Var == null || sc0Var.b()) {
            return;
        }
        try {
            sc0Var.A0(de3Var);
        } catch (rc0 e) {
            throw m(e, de3Var, false, 7000);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface D0(pc3 pc3Var) {
        boolean z;
        vb0 vb0Var;
        int i;
        RuntimeException runtimeException;
        Error error;
        sc0 sc0Var = this.P0;
        if (sc0Var != null) {
            return sc0Var.k();
        }
        Surface surface = this.T0;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && pc3Var.h) {
            return null;
        }
        boolean z2 = false;
        hn.M(!y0(pc3Var.a) && (!pc3Var.f || wb0.a(this.E0)));
        wb0 wb0Var = this.U0;
        if (wb0Var != null) {
            if (wb0Var.f != pc3Var.f && wb0Var != null) {
                wb0Var.release();
                this.U0 = null;
            }
        }
        if (this.U0 == null) {
            Context context = this.E0;
            boolean z3 = pc3Var.f;
            if (z3) {
                if (!wb0.a(context)) {
                    z = false;
                }
                hn.M(z);
                vb0Var = new vb0("ExoPlayer:PlaceholderSurface");
                if (z3) {
                    i = wb0.i;
                } else {
                    i = 0;
                }
                vb0Var.start();
                Handler handler = new Handler(vb0Var.getLooper(), vb0Var);
                vb0Var.g = handler;
                vb0Var.f = new jn1(handler);
                synchronized (vb0Var) {
                    vb0Var.g.obtainMessage(1, i, 0).sendToTarget();
                    while (vb0Var.j == null && vb0Var.i == null && vb0Var.h == null) {
                        try {
                            vb0Var.wait();
                        } catch (InterruptedException unused) {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = vb0Var.i;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = vb0Var.h;
                if (error == null) {
                    throw error;
                }
                wb0 wb0Var2 = vb0Var.j;
                wb0Var2.getClass();
                this.U0 = wb0Var2;
            } else {
                int i2 = wb0.i;
            }
            z = true;
            hn.M(z);
            vb0Var = new vb0("ExoPlayer:PlaceholderSurface");
            if (z3) {
                i = wb0.i;
            } else {
                i = 0;
            }
            vb0Var.start();
            Handler handler2 = new Handler(vb0Var.getLooper(), vb0Var);
            vb0Var.g = handler2;
            vb0Var.f = new jn1(handler2);
            synchronized (vb0Var) {
                vb0Var.g.obtainMessage(1, i, 0).sendToTarget();
                while (vb0Var.j == null) {
                    vb0Var.wait();
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = vb0Var.i;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = vb0Var.h;
                if (error == null) {
                    throw error;
                }
                wb0 wb0Var3 = vb0Var.j;
                wb0Var3.getClass();
                this.U0 = wb0Var3;
            }
        }
        return this.U0;
    }

    @Override // defpackage.yc3
    public final void E(lt2 lt2Var) {
        int iF = F(lt2Var);
        if (Build.VERSION.SDK_INT < 34 || (iF & 32) == 0) {
            this.c1++;
        }
    }

    @Override // defpackage.yc3
    public final int F(lt2 lt2Var) {
        return (Build.VERSION.SDK_INT < 34 || this.d1 == null || lt2Var.f >= this.q || B0(lt2Var)) ? 0 : 32;
    }

    @Override // defpackage.yc3
    public final boolean G(lt2 lt2Var) {
        boolean z = false;
        if (!B0(lt2Var)) {
            if (lt2Var.f < this.q) {
                if (!lt2Var.c(268435456)) {
                    if (lt2Var.c(67108864)) {
                        lt2Var.a();
                        z = true;
                    }
                    if (z) {
                        this.w0.d++;
                    }
                }
            }
            return z;
        }
        return false;
    }

    @Override // defpackage.yc3
    public final void H(long j) {
        super.H(j);
        this.c1--;
    }

    @Override // defpackage.yc3
    public final int K(r53 r53Var, de3 de3Var) {
        boolean z;
        String str = de3Var.m;
        if (!rn0.b(str)) {
            return 128;
        }
        int i = 0;
        boolean z2 = de3Var.q != null;
        Context context = this.E0;
        List listZ0 = z0(context, r53Var, de3Var, z2, false);
        if (z2 && listZ0.isEmpty()) {
            listZ0 = z0(context, r53Var, de3Var, false, false);
        }
        if (listZ0.isEmpty()) {
            return 129;
        }
        if (de3Var.L != 0) {
            return 130;
        }
        pc3 pc3Var = (pc3) listZ0.get(0);
        boolean zB = pc3Var.b(de3Var);
        if (!zB) {
            int i2 = 1;
            while (true) {
                if (i2 >= listZ0.size()) {
                    z = true;
                    break;
                }
                pc3 pc3Var2 = (pc3) listZ0.get(i2);
                if (pc3Var2.b(de3Var)) {
                    zB = true;
                    z = false;
                    pc3Var = pc3Var2;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = true != zB ? 3 : 4;
        int i4 = true != pc3Var.c(de3Var) ? 8 : 16;
        int i5 = true != pc3Var.g ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !ar.x(context)) {
            i6 = 256;
        }
        if (zB) {
            List listZ1 = z0(context, r53Var, de3Var, z2, true);
            if (!listZ1.isEmpty()) {
                HashMap map = cd3.a;
                ArrayList arrayList = new ArrayList(listZ1);
                Collections.sort(arrayList, new s82(1, new gv1(17, de3Var)));
                pc3 pc3Var3 = (pc3) arrayList.get(0);
                if (pc3Var3.b(de3Var) && pc3Var3.c(de3Var)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // defpackage.yc3
    public final ArrayList M(r53 r53Var, de3 de3Var) {
        List listZ0 = z0(this.E0, r53Var, de3Var, false, false);
        HashMap map = cd3.a;
        ArrayList arrayList = new ArrayList(listZ0);
        Collections.sort(arrayList, new s82(1, new gv1(17, de3Var)));
        return arrayList;
    }

    @Override // defpackage.yc3
    public final kd0 O(pc3 pc3Var, de3 de3Var, float f) {
        c43 c43Var;
        eg egVar;
        Point point;
        int i;
        int i2;
        int i3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b;
        int i4;
        int iS0;
        de3[] de3VarArr = this.o;
        de3VarArr.getClass();
        int length = de3VarArr.length;
        int iX0 = x0(pc3Var, de3Var);
        float f2 = de3Var.x;
        c43 c43Var2 = de3Var.C;
        int i5 = de3Var.u;
        int i6 = de3Var.t;
        if (length == 1) {
            if (iX0 != -1 && (iS0 = s0(pc3Var, de3Var)) != -1) {
                iX0 = Math.min((int) (iX0 * 1.5f), iS0);
            }
            egVar = new eg(i6, i5, iX0, false);
            c43Var = c43Var2;
        } else {
            int iMax = i5;
            int i7 = 0;
            boolean z = false;
            int iMax2 = i6;
            while (i7 < length) {
                de3 de3Var2 = de3VarArr[i7];
                if (c43Var2 != null && de3Var2.C == null) {
                    uc3 uc3Var = new uc3(de3Var2);
                    uc3Var.B = c43Var2;
                    de3Var2 = new de3(uc3Var);
                }
                k03 k03VarD = pc3Var.d(de3Var, de3Var2);
                de3[] de3VarArr2 = de3VarArr;
                int i8 = de3Var2.u;
                if (k03VarD.d != 0) {
                    int i9 = de3Var2.t;
                    b = -1;
                    z |= i9 == -1 || i8 == -1;
                    iMax2 = Math.max(iMax2, i9);
                    iMax = Math.max(iMax, i8);
                    iX0 = Math.max(iX0, x0(pc3Var, de3Var2));
                } else {
                    b = -1;
                }
                i7++;
                de3VarArr = de3VarArr2;
                length = length;
            }
            if (z) {
                s90.Q("MediaCodecVideoRenderer", ec.l(new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length()), "Resolutions unknown. Codec max resolution: ", iMax2, "x", iMax));
                boolean z2 = i5 > i6;
                int i10 = z2 ? i5 : i6;
                int i11 = true != z2 ? i5 : i6;
                c43Var = c43Var2;
                int i12 = 0;
                while (true) {
                    Point pointJ = null;
                    if (i12 < 9) {
                        float f3 = i11;
                        int i13 = i12;
                        float f4 = i10;
                        int i14 = q1[i13];
                        float f5 = i14;
                        if (i14 > i10 && (i = (int) (f5 * (f3 / f4))) > i11) {
                            if (true != z2) {
                                i = i14;
                            }
                            int i15 = true == z2 ? i14 : i;
                            boolean z3 = z2;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = pc3Var.d;
                            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                                pointJ = pc3.j(videoCapabilities, i, i15);
                            }
                            point = pointJ;
                            if (point != null) {
                                i2 = i10;
                                i3 = i11;
                                if (pc3Var.e(point.x, point.y, f2)) {
                                    break;
                                }
                            } else {
                                i2 = i10;
                                i3 = i11;
                            }
                            i12 = i13 + 1;
                            z2 = z3;
                            i10 = i2;
                            i11 = i3;
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax2 = Math.max(iMax2, point.x);
                    iMax = Math.max(iMax, point.y);
                    uc3 uc3Var2 = new uc3(de3Var);
                    uc3Var2.s = iMax2;
                    uc3Var2.t = iMax;
                    iX0 = Math.max(iX0, s0(pc3Var, new de3(uc3Var2)));
                    s90.Q("MediaCodecVideoRenderer", ec.l(new StringBuilder(g72.a(iMax2, 35) + String.valueOf(iMax).length()), "Codec max resolution adjusted to: ", iMax2, "x", iMax));
                }
            } else {
                c43Var = c43Var2;
            }
            egVar = new eg(iMax2, iMax, iX0, false);
        }
        String str = pc3Var.c;
        this.M0 = egVar;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i6);
        mediaFormat.setInteger("height", i5);
        ar.v(mediaFormat, de3Var.p);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        ar.z(mediaFormat, "rotation-degrees", de3Var.y);
        if (c43Var != null) {
            c43 c43Var3 = c43Var;
            ar.z(mediaFormat, "color-transfer", c43Var3.c);
            ar.z(mediaFormat, "color-standard", c43Var3.a);
            ar.z(mediaFormat, "color-range", c43Var3.b);
            byte[] bArr = c43Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(de3Var.m)) {
            HashMap map = cd3.a;
            Pair pairB = rl1.b(de3Var);
            if (pairB != null) {
                ar.z(mediaFormat, "profile", ((Integer) pairB.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", egVar.a);
        mediaFormat.setInteger("max-height", egVar.b);
        ar.z(mediaFormat, "max-input-size", egVar.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.H0) {
            mediaFormat.setInteger("no-post-process", 1);
            i4 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i4 = 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(i4, -this.k1));
        }
        Surface surfaceD0 = D0(pc3Var);
        if (this.P0 != null && !qz1.j(this.E0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new kd0(pc3Var, mediaFormat, de3Var, surfaceD0, (Object) null, 14);
    }

    @Override // defpackage.yc3
    public final k03 P(pc3 pc3Var, de3 de3Var, de3 de3Var2) {
        int i;
        int i2;
        k03 k03VarD = pc3Var.d(de3Var, de3Var2);
        int i3 = k03VarD.e;
        eg egVar = this.M0;
        egVar.getClass();
        if (de3Var2.t > egVar.a || de3Var2.u > egVar.b) {
            i3 |= 256;
        }
        if (x0(pc3Var, de3Var2) > egVar.c) {
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
    public final float R(float f, de3 de3Var, de3[] de3VarArr) {
        pc3 pc3Var;
        float fMax = -1.0f;
        for (de3 de3Var2 : de3VarArr) {
            float f2 = de3Var2.x;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.d1 == null || (pc3Var = this.W) == null) {
            return f3;
        }
        int i = de3Var.t;
        int i2 = de3Var.u;
        float f4 = -3.4028235E38f;
        if (pc3Var.i) {
            float f5 = pc3Var.l;
            if (f5 != -3.4028235E38f && pc3Var.j == i && pc3Var.k == i2) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!pc3Var.e(i, i2, 1024.0d)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        boolean zE = pc3Var.e(i, i2, f8);
                        if (true == zE) {
                            f6 = f8;
                        }
                        if (true != zE) {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                pc3Var.l = f4;
                pc3Var.j = i;
                pc3Var.k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    @Override // defpackage.yc3
    public final void S(long j, long j2, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        z61 z61Var = this.G0;
        Handler handler = (Handler) z61Var.g;
        if (handler != null) {
            str2 = str;
            handler.post(new mc0(z61Var, str2, j, j2));
        } else {
            str2 = str;
        }
        this.N0 = y0(str2);
        pc3 pc3Var = this.W;
        pc3Var.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(pc3Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pc3Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.O0 = z;
    }

    @Override // defpackage.yc3
    public final void T(String str) {
        z61 z61Var = this.G0;
        Handler handler = (Handler) z61Var.g;
        if (handler != null) {
            handler.post(new mc0(z61Var, str, 2));
        }
    }

    @Override // defpackage.yc3
    public final void U(Exception exc) {
        s90.b0("MediaCodecVideoRenderer", "Video codec error", exc);
        z61 z61Var = this.G0;
        Handler handler = (Handler) z61Var.g;
        if (handler != null) {
            handler.post(new mc0(z61Var, exc, 3));
        }
    }

    @Override // defpackage.yc3
    public final k03 V(us2 us2Var) {
        k03 k03VarV = super.V(us2Var);
        de3 de3Var = (de3) us2Var.h;
        de3Var.getClass();
        z61 z61Var = this.G0;
        Handler handler = (Handler) z61Var.g;
        if (handler != null) {
            handler.post(new ib(z61Var, de3Var, k03VarV, 6));
        }
        return k03VarV;
    }

    @Override // defpackage.yc3
    public final void W(de3 de3Var, MediaFormat mediaFormat) {
        nc3 nc3Var = this.P;
        if (nc3Var != null) {
            nc3Var.d(this.X0);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = de3Var.z;
        int i = de3Var.y;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.i1 = new i61(f, integer, integer2);
        sc0 sc0Var = this.P0;
        if (sc0Var == null || !this.p1) {
            this.I0.e(de3Var.x);
        } else {
            uc3 uc3Var = new uc3(de3Var);
            uc3Var.s = integer;
            uc3Var.t = integer2;
            uc3Var.y = f;
            de3 de3Var2 = new de3(uc3Var);
            int i3 = this.R0;
            List list = this.S0;
            if (list == null) {
                list = qk2.j;
            }
            sc0Var.u0(de3Var2, this.x0.b, i3, list);
            this.R0 = 2;
        }
        this.p1 = false;
    }

    @Override // defpackage.yc3
    public final void X() {
        sc0 sc0Var = this.P0;
        if (sc0Var != null) {
            sc0Var.j();
            long j = this.n1;
            if (j == -9223372036854775807L) {
                j = this.x0.b;
                this.n1 = j;
            }
            this.P0.y0(-j);
        } else {
            this.I0.a(2);
        }
        this.p1 = true;
    }

    @Override // defpackage.yc3
    public final boolean Y(long j, long j2, nc3 nc3Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, de3 de3Var) {
        int i4;
        nc3Var.getClass();
        long j4 = j3 - this.x0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.L0;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i5++;
        }
        u0(i5, 0);
        sc0 sc0Var = this.P0;
        if (sc0Var != null) {
            if (!z || z2) {
                return sc0Var.r0(j3, new tb0(this, nc3Var, i, j4));
            }
            t0(nc3Var, i);
            return true;
        }
        long j5 = this.x0.b;
        gc0 gc0Var = this.I0;
        ec0 ec0Var = this.J0;
        int iG = gc0Var.g(j3, j, j2, j5, z, z2, ec0Var);
        if (iG == 0) {
            this.l.getClass();
            long jNanoTime = System.nanoTime();
            dc0 dc0Var = this.m1;
            if (dc0Var != null) {
                dc0Var.b(j4, jNanoTime, de3Var, this.R);
            }
            w0(nc3Var, i, jNanoTime);
            v0(ec0Var.a);
            return true;
        }
        if (iG != 1) {
            if (iG != 2) {
                if (iG != 3) {
                    return false;
                }
                t0(nc3Var, i);
                v0(ec0Var.a);
                return true;
            }
            Trace.beginSection("dropVideoBuffer");
            nc3Var.H(i);
            Trace.endSection();
            u0(0, 1);
            v0(ec0Var.a);
            return true;
        }
        long j6 = ec0Var.b;
        long j7 = ec0Var.a;
        if (j6 == this.h1) {
            t0(nc3Var, i);
        } else {
            dc0 dc0Var2 = this.m1;
            if (dc0Var2 != null) {
                i4 = i;
                dc0Var2.b(j4, j6, de3Var, this.R);
            } else {
                i4 = i;
            }
            w0(nc3Var, i4, j6);
        }
        v0(j7);
        this.h1 = j6;
        return true;
    }

    @Override // defpackage.yc3
    public final void Z() {
        sc0 sc0Var = this.P0;
        if (sc0Var != null) {
            sc0Var.j();
        }
    }

    @Override // defpackage.v83
    public final void a(int i, Object obj) throws Throwable {
        if (i == 1) {
            A0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            dc0 dc0Var = (dc0) obj;
            this.m1 = dc0Var;
            sc0 sc0Var = this.P0;
            if (sc0Var != null) {
                sc0Var.q0(dc0Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.l1 != iIntValue) {
                this.l1 = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.X0 = iIntValue2;
            nc3 nc3Var = this.P;
            if (nc3Var != null) {
                nc3Var.d(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.Y0 = iIntValue3;
            sc0 sc0Var2 = this.P0;
            if (sc0Var2 != null) {
                sc0Var2.t0(iIntValue3);
                return;
            }
            kc0 kc0Var = this.I0.b;
            if (kc0Var.j == iIntValue3) {
                return;
            }
            kc0Var.j = iIntValue3;
            kc0Var.c(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(e41.a)) {
                sc0 sc0Var3 = this.P0;
                if (sc0Var3 == null || !sc0Var3.b()) {
                    return;
                }
                sc0Var3.d();
                return;
            }
            this.S0 = list;
            sc0 sc0Var4 = this.P0;
            if (sc0Var4 != null) {
                sc0Var4.v0(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            nw1 nw1Var = (nw1) obj;
            if (nw1Var.a == 0 || nw1Var.b == 0) {
                return;
            }
            this.V0 = nw1Var;
            sc0 sc0Var5 = this.P0;
            if (sc0Var5 != null) {
                Surface surface = this.T0;
                surface.getClass();
                sc0Var5.z0(surface, nw1Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.k1 = ((Integer) obj).intValue();
                nc3 nc3Var2 = this.P;
                if (nc3Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.k1));
                    nc3Var2.c0(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.T0;
                A0(null);
                obj.getClass();
                ((ub0) obj).a(1, surface2);
                break;
            case 18:
                boolean z = this.d1 != null;
                b93 b93Var = (b93) obj;
                this.d1 = b93Var;
                if (z != (b93Var != null)) {
                    e0(this.Q);
                }
                break;
            default:
                if (i == 11) {
                    q73 q73Var = (q73) obj;
                    q73Var.getClass();
                    this.L = q73Var;
                }
                break;
        }
    }

    @Override // defpackage.yc3
    public final void a0(lt2 lt2Var) {
        if (this.O0) {
            ByteBuffer byteBuffer = lt2Var.g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        nc3 nc3Var = this.P;
                        nc3Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        nc3Var.c0(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.yc3
    public final void c(long j, boolean z, boolean z2) {
        sc0 sc0Var = this.P0;
        if (sc0Var != null && !z) {
            sc0Var.o0(true);
        }
        super.c(j, z, z2);
        sc0 sc0Var2 = this.P0;
        gc0 gc0Var = this.I0;
        if (sc0Var2 == null) {
            kc0 kc0Var = gc0Var.b;
            kc0Var.m = 0L;
            kc0Var.p = -1L;
            kc0Var.n = -1L;
            gc0Var.g = -9223372036854775807L;
            gc0Var.e = -9223372036854775807L;
            gc0Var.d = Math.min(gc0Var.d, 1);
            gc0Var.h = -9223372036854775807L;
        }
        if (z) {
            sc0 sc0Var3 = this.P0;
            if (sc0Var3 != null) {
                sc0Var3.x0(false);
            } else {
                gc0Var.i = false;
                gc0Var.h = -9223372036854775807L;
            }
        }
        this.b1 = 0;
    }

    @Override // defpackage.yc3
    public final void d() {
        this.a1 = 0;
        this.l.getClass();
        this.Z0 = SystemClock.elapsedRealtime();
        this.f1 = 0L;
        this.g1 = 0;
        sc0 sc0Var = this.P0;
        if (sc0Var != null) {
            sc0Var.a();
        } else {
            this.I0.b();
        }
    }

    @Override // defpackage.yc3
    public final void h() {
        int i = this.a1;
        final z61 z61Var = this.G0;
        if (i > 0) {
            this.l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j = jElapsedRealtime - this.Z0;
            final int i2 = this.a1;
            Handler handler = (Handler) z61Var.g;
            if (handler != null) {
                handler.post(new Runnable() { // from class: nc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        z61 z61Var2 = z61Var;
                        z61Var2.getClass();
                        String str = qz1.a;
                        z93 z93Var = ((d73) z61Var2.h).f.x;
                        q93 q93VarX = z93Var.x((yd3) z93Var.i.j);
                        z93Var.s(q93VarX, 1018, new yp(q93VarX, i2, j));
                    }
                });
            }
            this.a1 = 0;
            this.Z0 = jElapsedRealtime;
        }
        int i3 = this.g1;
        if (i3 != 0) {
            long j2 = this.f1;
            Handler handler2 = (Handler) z61Var.g;
            if (handler2 != null) {
                handler2.post(new mc0(i3, j2, z61Var));
            }
            this.f1 = 0L;
            this.g1 = 0;
        }
        sc0 sc0Var = this.P0;
        if (sc0Var != null) {
            sc0Var.c();
        } else {
            this.I0.c();
        }
    }

    @Override // defpackage.yc3
    public final void i() {
        b03 b03Var;
        z61 z61Var = this.G0;
        this.j1 = null;
        this.o1 = -9223372036854775807L;
        this.W0 = false;
        this.e1 = true;
        int i = 15;
        try {
            super.i();
            b03Var = this.w0;
            z61Var.getClass();
            synchronized (b03Var) {
            }
        } finally {
            b03Var = this.w0;
            z61Var.getClass();
            synchronized (b03Var) {
                Handler handler = (Handler) z61Var.g;
                if (handler != null) {
                    handler.post(new in2(z61Var, i, b03Var));
                }
                z61Var.K(i61.d);
            }
        }
    }

    @Override // defpackage.yc3
    public final void j() {
        try {
            try {
                this.i0 = false;
                b0();
                x();
                this.K = null;
                this.Q0 = false;
                this.n1 = -9223372036854775807L;
                wb0 wb0Var = this.U0;
                if (wb0Var != null) {
                    wb0Var.release();
                    this.U0 = null;
                }
            } catch (Throwable th) {
                this.K = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.Q0 = false;
            this.n1 = -9223372036854775807L;
            wb0 wb0Var2 = this.U0;
            if (wb0Var2 != null) {
                wb0Var2.release();
                this.U0 = null;
            }
            throw th2;
        }
    }

    @Override // defpackage.yc3
    public final void k() {
        sc0 sc0Var = this.P0;
        if (sc0Var == null || !this.F0) {
            return;
        }
        sc0Var.J();
    }

    @Override // defpackage.yc3
    public final String o() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.yc3
    public final boolean p(long j) {
        long j2 = this.y0;
        return j2 == -9223372036854775807L || j > j2 - this.x0.c;
    }

    @Override // defpackage.yc3
    public final void p0(boolean z, boolean z2) {
        sc0 sc0Var;
        this.w0 = new b03();
        l();
        b03 b03Var = this.w0;
        z61 z61Var = this.G0;
        Handler handler = (Handler) z61Var.g;
        if (handler != null) {
            handler.post(new mc0(z61Var, b03Var, 4));
        }
        boolean z3 = this.Q0;
        gc0 gc0Var = this.I0;
        if (!z3) {
            if (this.S0 != null && this.P0 == null) {
                xb0 xb0Var = new xb0(this.E0, gc0Var);
                xb0Var.d = true;
                long j = this.K0;
                xb0Var.g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                ig igVar = this.l;
                igVar.getClass();
                xb0Var.e = igVar;
                hn.M(!xb0Var.f);
                if (xb0Var.c == null) {
                    xb0Var.c = new ac0();
                }
                cc0 cc0Var = new cc0(xb0Var);
                xb0Var.f = true;
                cc0Var.p = 1;
                SparseArray sparseArray = cc0Var.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    sc0Var = (sc0) sparseArray.get(0);
                } else {
                    yb0 yb0Var = new yb0(cc0Var, cc0Var.a);
                    cc0Var.g.add(yb0Var);
                    sparseArray.put(0, yb0Var);
                    sc0Var = yb0Var;
                }
                this.P0 = sc0Var;
            }
            this.Q0 = true;
        }
        int i = !z2 ? 1 : 0;
        sc0 sc0Var2 = this.P0;
        if (sc0Var2 == null) {
            ig igVar2 = this.l;
            igVar2.getClass();
            gc0Var.k = igVar2;
            gc0Var.a(i);
            return;
        }
        sc0Var2.w0(new sb0(this));
        dc0 dc0Var = this.m1;
        if (dc0Var != null) {
            this.P0.q0(dc0Var);
        }
        if (this.T0 != null && !this.V0.equals(nw1.c)) {
            this.P0.z0(this.T0, this.V0);
        }
        this.P0.t0(this.Y0);
        this.P0.p0(this.N);
        List list = this.S0;
        if (list != null) {
            this.P0.v0(list);
        }
        this.R0 = i;
        this.A0 = true;
    }

    @Override // defpackage.yc3
    public final void q(float f, float f2) throws Throwable {
        super.q(f, f2);
        sc0 sc0Var = this.P0;
        if (sc0Var != null) {
            sc0Var.p0(f);
        } else {
            this.I0.h(f);
        }
    }

    @Override // defpackage.yc3
    public final void q0(de3[] de3VarArr, long j, long j2, yd3 yd3Var) {
        super.q0(de3VarArr, j, j2, yd3Var);
        ox0 ox0Var = this.u;
        if (ox0Var.g()) {
            this.o1 = -9223372036854775807L;
        } else {
            this.o1 = ox0Var.o(yd3Var.a, new su0()).d;
        }
    }

    @Override // defpackage.yc3
    public final void r() {
        sc0 sc0Var = this.P0;
        if (sc0Var == null) {
            gc0 gc0Var = this.I0;
            if (gc0Var.d == 0) {
                gc0Var.d = 1;
                return;
            }
            return;
        }
        int i = this.R0;
        if (i == 0 || i == 1) {
            this.R0 = 0;
        } else {
            sc0Var.M();
        }
    }

    public final boolean r0(long j, long j2, boolean z, boolean z2) throws Throwable {
        if (this.P0 != null && this.F0) {
            j2 -= -this.n1;
        }
        if (j < -500000 && !z) {
            af3 af3Var = this.n;
            af3Var.getClass();
            int iF = af3Var.f(j2 - this.p);
            if (iF != 0) {
                b03 b03Var = this.w0;
                PriorityQueue priorityQueue = this.L0;
                if (z2) {
                    int i = b03Var.d + iF;
                    b03Var.d = i;
                    b03Var.f += this.c1;
                    b03Var.d = priorityQueue.size() + i;
                } else {
                    b03Var.j++;
                    u0(priorityQueue.size() + iF, this.c1);
                }
                if (this.P != null) {
                    if (y()) {
                        x();
                        v();
                    } else if (z()) {
                        c0();
                    } else {
                        this.B0 = true;
                    }
                }
                sc0 sc0Var = this.P0;
                if (sc0Var != null) {
                    sc0Var.o0(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yc3
    public final void s(long j, long j2) throws Throwable {
        sc0 sc0Var = this.P0;
        if (sc0Var != null) {
            try {
                sc0Var.s0(j, j2);
            } catch (rc0 e) {
                throw m(e, e.f, false, 7001);
            }
        }
        super.s(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // defpackage.yc3
    public final boolean t() {
        boolean zC;
        boolean z = false;
        if (this.H != null) {
            if (n0()) {
                zC = this.s;
            } else {
                af3 af3Var = this.n;
                af3Var.getClass();
                zC = af3Var.c();
            }
            if (zC) {
                z = true;
            } else {
                if (this.f0 >= 0) {
                    z = true;
                } else if (this.d0 != -9223372036854775807L) {
                    this.l.getClass();
                    if (SystemClock.elapsedRealtime() < this.d0) {
                        z = true;
                    }
                }
            }
        }
        sc0 sc0Var = this.P0;
        if (sc0Var != null) {
            return sc0Var.P(z);
        }
        if (z && this.P == null) {
            return true;
        }
        return this.I0.f(z);
    }

    public final void t0(nc3 nc3Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        nc3Var.H(i);
        Trace.endSection();
        this.w0.f++;
    }

    @Override // defpackage.yc3
    public final boolean u() {
        if (!this.u0) {
            return false;
        }
        sc0 sc0Var = this.P0;
        return sc0Var == null || sc0Var.g();
    }

    public final void u0(int i, int i2) {
        b03 b03Var = this.w0;
        b03Var.h += i;
        int i3 = i + i2;
        b03Var.g += i3;
        this.a1 += i3;
        int i4 = this.b1 + i3;
        this.b1 = i4;
        b03Var.i = Math.max(i4, b03Var.i);
    }

    public final void v0(long j) {
        b03 b03Var = this.w0;
        b03Var.k += j;
        b03Var.l++;
        this.f1 += j;
        this.g1++;
    }

    @Override // defpackage.yc3
    public final boolean w(pc3 pc3Var) {
        return C0(pc3Var);
    }

    public final void w0(nc3 nc3Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        nc3Var.f(i, j);
        Trace.endSection();
        this.w0.e++;
        this.b1 = 0;
        if (this.P0 == null) {
            i61 i61Var = this.i1;
            boolean zEquals = i61Var.equals(i61.d);
            z61 z61Var = this.G0;
            if (!zEquals && !i61Var.equals(this.j1)) {
                this.j1 = i61Var;
                z61Var.K(i61Var);
            }
            gc0 gc0Var = this.I0;
            int i2 = gc0Var.d;
            gc0Var.d = 3;
            gc0Var.k.getClass();
            gc0Var.f = qz1.r(SystemClock.elapsedRealtime());
            if (i2 == 3 || (surface = this.T0) == null) {
                return;
            }
            Handler handler = (Handler) z61Var.g;
            if (handler != null) {
                handler.post(new oc0(z61Var, surface, SystemClock.elapsedRealtime()));
            }
            this.W0 = true;
        }
    }

    @Override // defpackage.yc3
    public final boolean y() {
        pc3 pc3Var = this.W;
        if (this.P0 != null && pc3Var != null) {
            String str = pc3Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.y();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @Override // defpackage.yc3
    public final boolean z() {
        boolean z;
        de3 de3Var = this.Q;
        long j = this.o1;
        if (j != -9223372036854775807L) {
            if (this.C0 + 1 + j > Long.MAX_VALUE - (this.x0.c + j)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return this.d1 == null || this.e1 || (de3Var != null && de3Var.o > 0) || z || this.x0.e != -9223372036854775807L;
    }
}
