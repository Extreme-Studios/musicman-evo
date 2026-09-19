package defpackage;

import android.util.Pair;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class rl1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        int i5;
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = qz1.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x01be  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:206:0x0330 A[PHI: r2
  0x0330: PHI (r2v40 int) = (r2v39 int), (r2v43 int), (r2v44 int), (r2v45 int) binds: [B:189:0x030d, B:194:0x0317, B:196:0x031b, B:198:0x031f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:256:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:260:0x0400 A[Catch: NumberFormatException -> 0x04f0, TryCatch #6 {NumberFormatException -> 0x04f0, blocks: (B:258:0x03f7, B:260:0x0400, B:263:0x041e, B:316:0x04d3), top: B:456:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x041a  */
    /* JADX WARN: Code duplicated, block: B:263:0x041e A[Catch: NumberFormatException -> 0x04f0, TRY_LEAVE, TryCatch #6 {NumberFormatException -> 0x04f0, blocks: (B:258:0x03f7, B:260:0x0400, B:263:0x041e, B:316:0x04d3), top: B:456:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:266:0x0430  */
    /* JADX WARN: Code duplicated, block: B:268:0x0434  */
    /* JADX WARN: Code duplicated, block: B:270:0x0438  */
    /* JADX WARN: Code duplicated, block: B:272:0x043c  */
    /* JADX WARN: Code duplicated, block: B:274:0x0440  */
    /* JADX WARN: Code duplicated, block: B:276:0x0444  */
    /* JADX WARN: Code duplicated, block: B:278:0x0448  */
    /* JADX WARN: Code duplicated, block: B:279:0x044a  */
    /* JADX WARN: Code duplicated, block: B:280:0x044d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0450  */
    /* JADX WARN: Code duplicated, block: B:282:0x0452  */
    /* JADX WARN: Code duplicated, block: B:283:0x0455  */
    /* JADX WARN: Code duplicated, block: B:284:0x0457  */
    /* JADX WARN: Code duplicated, block: B:285:0x0459  */
    /* JADX WARN: Code duplicated, block: B:287:0x045c  */
    /* JADX WARN: Code duplicated, block: B:289:0x0470  */
    /* JADX WARN: Code duplicated, block: B:290:0x0473  */
    /* JADX WARN: Code duplicated, block: B:291:0x0476  */
    /* JADX WARN: Code duplicated, block: B:292:0x0479  */
    /* JADX WARN: Code duplicated, block: B:293:0x047c  */
    /* JADX WARN: Code duplicated, block: B:294:0x047f  */
    /* JADX WARN: Code duplicated, block: B:295:0x0481  */
    /* JADX WARN: Code duplicated, block: B:296:0x0484  */
    /* JADX WARN: Code duplicated, block: B:297:0x0488  */
    /* JADX WARN: Code duplicated, block: B:298:0x048b  */
    /* JADX WARN: Code duplicated, block: B:299:0x048e  */
    /* JADX WARN: Code duplicated, block: B:300:0x0491  */
    /* JADX WARN: Code duplicated, block: B:301:0x0494  */
    /* JADX WARN: Code duplicated, block: B:302:0x0497  */
    /* JADX WARN: Code duplicated, block: B:303:0x049a  */
    /* JADX WARN: Code duplicated, block: B:304:0x049d  */
    /* JADX WARN: Code duplicated, block: B:305:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:306:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:307:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:308:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:309:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:310:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:312:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:314:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:316:0x04d3 A[Catch: NumberFormatException -> 0x04f0, TRY_ENTER, TRY_LEAVE, TryCatch #6 {NumberFormatException -> 0x04f0, blocks: (B:258:0x03f7, B:260:0x0400, B:263:0x041e, B:316:0x04d3), top: B:456:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:407:0x0692  */
    /* JADX WARN: Code duplicated, block: B:456:0x03f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x0156  */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x016c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0170  */
    /* JADX WARN: Code duplicated, block: B:77:0x0176  */
    /* JADX WARN: Code duplicated, block: B:78:0x0179  */
    /* JADX WARN: Code duplicated, block: B:80:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:0x018b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0191  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a  */
    /* JADX WARN: Code duplicated, block: B:90:0x019d  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:96:0x01af  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b8  */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0378, code lost:
    
        if (r1.equals("mp4a") != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0382, code lost:
    
        if (r1.equals("ipcm") != false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x038d, code lost:
    
        if (r1.equals("fLaC") != false) goto L232;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 int, still in use, count: 1, list:
  (r12v3 int) from 0x0144: SWITCH (r12v3 int)
 case 1567: goto B:75:0x0170
 case 1568: goto B:72:0x0164
 case 1569: goto B:69:0x0156
 case 1570: goto B:66:0x0148
 default: goto B:472:? A[RegionRef:SW:64] (LINE:325)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 int, still in use, count: 1, list:
  (r12v3 int) from 0x0144: SWITCH (r12v3 int)
 case 1567: goto B:75:0x0170
 case 1568: goto B:72:0x0164
 case 1569: goto B:69:0x0156
 case 1570: goto B:66:0x0148
 default: goto B:472:? A[RegionRef:SW:64] (LINE:325)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x013d, please report this as an issue */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(defpackage.de3 r33) {
        /*
            Method dump skipped, instruction units count: 2070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl1.b(de3):android.util.Pair");
    }

    public static Pair c(String str, String[] strArr, c43 c43Var) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            ec.t(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            ec.t(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else {
            i = 6;
            if ("2".equals(strGroup)) {
                i = (c43Var == null || c43Var.c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                ec.t(strGroup, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "H30":
                    num = 2;
                    break;
                case "H60":
                    num = 8;
                    break;
                case "H63":
                    num = 32;
                    break;
                case "H90":
                    num = 128;
                    break;
                case "H93":
                    num = 512;
                    break;
                case "L30":
                    num = 1;
                    break;
                case "L60":
                    num = 4;
                    break;
                case "L63":
                    num = 16;
                    break;
                case "L90":
                    num = 64;
                    break;
                case "L93":
                    num = 256;
                    break;
                case "H120":
                    num = 2048;
                    break;
                case "H123":
                    num = 8192;
                    break;
                case "H150":
                    num = 32768;
                    break;
                case "H153":
                    num = 131072;
                    break;
                case "H156":
                    num = 524288;
                    break;
                case "H180":
                    num = 2097152;
                    break;
                case "H183":
                    num = 8388608;
                    break;
                case "H186":
                    num = 33554432;
                    break;
                case "L120":
                    num = 1024;
                    break;
                case "L123":
                    num = 4096;
                    break;
                case "L150":
                    num = 16384;
                    break;
                case "L153":
                    num = 65536;
                    break;
                case "L156":
                    num = 262144;
                    break;
                case "L180":
                    num = 1048576;
                    break;
                case "L183":
                    num = 4194304;
                    break;
                case "L186":
                    num = 16777216;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i), num);
        }
        ec.t(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
        return null;
    }
}
