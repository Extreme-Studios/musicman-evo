package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pc3 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public pc3(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = z4;
        this.i = rn0.b(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    public static pc3 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        boolean z2;
        boolean z3 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z4 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z2 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        return new pc3(str, str2, str3, codecCapabilities, z, z3, z4, z2);
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointJ = j(videoCapabilities, i, i2);
        int i3 = pointJ.x;
        int i4 = pointJ.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = qz1.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(de3 de3Var) {
        int i;
        int i2;
        String str = de3Var.m;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(cd3.c(de3Var))) || !f(de3Var, true) || !g(de3Var)) {
            return false;
        }
        if (this.i) {
            int i3 = de3Var.t;
            if (i3 > 0 && (i2 = de3Var.u) > 0) {
                return e(i3, i2, de3Var.x);
            }
        } else {
            int i4 = de3Var.F;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                    sb.append("sampleRate.support, ");
                    sb.append(i4);
                    h(sb.toString());
                    return false;
                }
            }
            int i5 = de3Var.E;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    String str3 = this.a;
                    StringBuilder sb2 = new StringBuilder(ec.f(String.valueOf(i), String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1));
                    sb2.append("AssumedMaxChannelAdjustment: ");
                    sb2.append(str3);
                    sb2.append(", [");
                    sb2.append(maxInputChannelCount);
                    sb2.append(" to ");
                    sb2.append(i);
                    sb2.append("]");
                    s90.Q("MediaCodecInfo", sb2.toString());
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i5).length() + 22);
                    sb3.append("channelCount.support, ");
                    sb3.append(i5);
                    h(sb3.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(de3 de3Var) {
        if (this.i) {
            return this.e;
        }
        HashMap map = cd3.a;
        Pair pairB = rl1.b(de3Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final k03 d(de3 de3Var, de3 de3Var2) {
        de3 de3Var3;
        de3 de3Var4;
        int i;
        String str = de3Var.m;
        String str2 = de3Var2.m;
        c43 c43Var = de3Var2.C;
        int i2 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (de3Var.y != de3Var2.y) {
                i2 |= 1024;
            }
            boolean z = (de3Var.t == de3Var2.t && de3Var.u == de3Var2.u) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            c43 c43Var2 = de3Var.C;
            if ((!c43.a(c43Var2) || !c43.a(c43Var)) && !Objects.equals(c43Var2, c43Var)) {
                i2 |= 2048;
            }
            boolean zStartsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.a;
            if (zStartsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !de3Var.b(de3Var2)) {
                i2 |= 2;
            }
            int i3 = de3Var.v;
            if (i3 != -1 && (i = de3Var.w) != -1 && i3 == de3Var2.v && i == de3Var2.w && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new k03(str3, de3Var, de3Var2, true != de3Var.b(de3Var2) ? 2 : 3, 0);
            }
            de3Var3 = de3Var;
            de3Var4 = de3Var2;
        } else {
            de3Var3 = de3Var;
            de3Var4 = de3Var2;
            if (de3Var3.E != de3Var4.E) {
                i2 |= 4096;
            }
            if (de3Var3.F != de3Var4.F) {
                i2 |= 8192;
            }
            if (de3Var3.G != de3Var4.G) {
                i2 |= 16384;
            }
            String str4 = this.b;
            if (i2 == 0 && (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4"))) {
                HashMap map = cd3.a;
                Pair pairB = rl1.b(de3Var3);
                Pair pairB2 = rl1.b(de3Var4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new k03(this.a, de3Var3, de3Var4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && pairB.equals(pairB2)) {
                        return new k03(this.a, de3Var3, de3Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str4.equals("audio/eac3-joc") || str4.equals("audio/eac3"))) {
                return new k03(this.a, de3Var3, de3Var4, 3, 0);
            }
            if (!de3Var3.b(de3Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str4)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new k03(this.a, de3Var3, de3Var4, 1, 0);
            }
        }
        return new k03(this.a, de3Var3, de3Var4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    public final boolean e(int i, int i2, double d) {
        String str;
        char c;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            if (i3 < 29 || (((bool = jn.F) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                c = 0;
            } else {
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointD = i80.d(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    if (i4 >= supportedPerformancePoints.size()) {
                        c = 1;
                        break;
                    }
                    if (i80.e(supportedPerformancePoints.get(i4)).covers(performancePointD)) {
                        c = 2;
                        break;
                    }
                    i4++;
                }
                if (c == 1 && jn.F == null) {
                    if (i3 >= 35) {
                        z = false;
                    } else {
                        int iY = hn.y(false);
                        int iY2 = hn.y(true);
                        if (iY != 0 && (iY2 != 0 ? iY == 2 && iY2 == 2 : iY == 2)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    jn.F = Boolean.valueOf(z);
                    if (z) {
                        c = 0;
                    }
                }
            }
            if (c != 2) {
                if (c == 1) {
                    StringBuilder sb = new StringBuilder(ec.f(String.valueOf(i2), String.valueOf(i).length() + 20, 1) + String.valueOf(d).length());
                    ec.v(sb, "sizeAndRate.cover, ", i, "x", i2);
                    sb.append("@");
                    sb.append(d);
                    h(sb.toString());
                    return false;
                }
                if (!i(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + g72.a(i, 22) + 1 + String.valueOf(d).length());
                            ec.v(sb2, "sizeAndRate.rotated, ", i, "x", i2);
                            sb2.append("@");
                            sb2.append(d);
                            String string = sb2.toString();
                            int length = str.length();
                            String str2 = qz1.a;
                            String str3 = this.b;
                            StringBuilder sb3 = new StringBuilder(string.length() + 19 + length + 2 + String.valueOf(str3).length() + 3 + String.valueOf(str2).length() + 1);
                            sb3.append("AssumedSupport [");
                            sb3.append(string);
                            sb3.append("] [");
                            sb3.append(str);
                            ec.x(sb3, ", ", str3, "] [", str2);
                            sb3.append("]");
                            s90.C("MediaCodecInfo", sb3.toString());
                            return true;
                        }
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + g72.a(i, 22) + 1 + String.valueOf(d).length());
                        ec.v(sb4, "sizeAndRate.rotated, ", i, "x", i2);
                        sb4.append("@");
                        sb4.append(d);
                        String string2 = sb4.toString();
                        int length2 = str.length();
                        String str4 = qz1.a;
                        String str5 = this.b;
                        StringBuilder sb5 = new StringBuilder(string2.length() + 19 + length2 + 2 + String.valueOf(str5).length() + 3 + String.valueOf(str4).length() + 1);
                        sb5.append("AssumedSupport [");
                        sb5.append(string2);
                        sb5.append("] [");
                        sb5.append(str);
                        ec.x(sb5, ", ", str5, "] [", str4);
                        sb5.append("]");
                        s90.C("MediaCodecInfo", sb5.toString());
                        return true;
                    }
                    StringBuilder sb6 = new StringBuilder(String.valueOf(i2).length() + g72.a(i, 22) + 1 + String.valueOf(d).length());
                    ec.v(sb6, "sizeAndRate.support, ", i, "x", i2);
                    sb6.append("@");
                    sb6.append(d);
                    h(sb6.toString());
                    return false;
                }
            }
        } else if (!i(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                str = this.a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && i(videoCapabilities, i2, i, d)) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i2).length() + g72.a(i, 22) + 1 + String.valueOf(d).length());
                    ec.v(sb7, "sizeAndRate.rotated, ", i, "x", i2);
                    sb7.append("@");
                    sb7.append(d);
                    String string3 = sb7.toString();
                    int length3 = str.length();
                    String str6 = qz1.a;
                    String str7 = this.b;
                    StringBuilder sb8 = new StringBuilder(string3.length() + 19 + length3 + 2 + String.valueOf(str7).length() + 3 + String.valueOf(str6).length() + 1);
                    sb8.append("AssumedSupport [");
                    sb8.append(string3);
                    sb8.append("] [");
                    sb8.append(str);
                    ec.x(sb8, ", ", str7, "] [", str6);
                    sb8.append("]");
                    s90.C("MediaCodecInfo", sb8.toString());
                    return true;
                }
            }
            StringBuilder sb9 = new StringBuilder(String.valueOf(i2).length() + g72.a(i, 22) + 1 + String.valueOf(d).length());
            ec.v(sb9, "sizeAndRate.support, ", i, "x", i2);
            sb9.append("@");
            sb9.append(d);
            h(sb9.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7 A[PHI: r5
  0x00a7: PHI (r5v4 int) = (r5v3 int), (r5v3 int), (r5v5 int) binds: [B:36:0x009a, B:38:0x00a0, B:41:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final boolean f(de3 de3Var, boolean z) {
        int iIntValue;
        int iIntValue2;
        boolean zEquals;
        String str;
        int i;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i2;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int iHashCode;
        HashMap map = cd3.a;
        Pair pairB = rl1.b(de3Var);
        String str2 = de3Var.m;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strI = rn0.i(str3);
            if (!strI.equals("video/mv-hevc")) {
                if (strI.equals("video/hevc")) {
                    String strI0 = ss0.i0(de3Var.p);
                    if (strI0 == null) {
                        pairB = null;
                    } else {
                        String strTrim = strI0.trim();
                        String str4 = qz1.a;
                        pairB = rl1.c(strI0, strTrim.split("\\.", -1), de3Var.C);
                    }
                }
                if (pairB != null) {
                    iIntValue = ((Integer) pairB.first).intValue();
                    iIntValue2 = ((Integer) pairB.second).intValue();
                    zEquals = "video/dolby-vision".equals(str2);
                    str = this.b;
                    i = 8;
                    if (zEquals) {
                        iHashCode = str.hashCode();
                        if (iHashCode != -1662735862) {
                            if (iHashCode != -1662541442) {
                                if (iHashCode == 1331836730) {
                                    iIntValue = 8;
                                    iIntValue2 = 0;
                                }
                            } else if (str.equals("video/hevc")) {
                                iIntValue = 2;
                                iIntValue2 = 0;
                            }
                        } else if (str.equals("video/av01")) {
                            iIntValue = 2;
                            iIntValue2 = 0;
                        }
                    }
                    if (this.i) {
                        codecCapabilities = this.d;
                        if (codecCapabilities != null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (str.equals("audio/ac4")) {
                            if (codecCapabilities != null) {
                                i = 16;
                            }
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel2.profile = 257;
                            codecProfileLevel2.level = i;
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel3.profile = 513;
                            codecProfileLevel3.level = i;
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel4 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel4.profile = 514;
                            codecProfileLevel4.level = i;
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel5 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel5.profile = 1026;
                            codecProfileLevel5.level = i;
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel6 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel6.profile = 1028;
                            codecProfileLevel6.level = i;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel2, codecProfileLevel3, codecProfileLevel4, codecProfileLevel5, codecProfileLevel6};
                        }
                        length = codecProfileLevelArr.length;
                        for (i2 = 0; i2 < length; i2++) {
                            codecProfileLevel = codecProfileLevelArr[i2];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        String str5 = de3Var.j;
                        h(ec.o(new StringBuilder(str3.length() + String.valueOf(str5).length() + 22), "codec.profileLevel, ", str5, ", ", str3));
                        return false;
                    }
                    codecCapabilities = this.d;
                    if (codecCapabilities != null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str.equals("audio/ac4")) {
                        if (codecCapabilities != null) {
                            i = 16;
                        }
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel7 = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel7.profile = 257;
                        codecProfileLevel7.level = i;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel8 = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel8.profile = 513;
                        codecProfileLevel8.level = i;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel9 = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel9.profile = 514;
                        codecProfileLevel9.level = i;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel10 = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel10.profile = 1026;
                        codecProfileLevel10.level = i;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel11 = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel11.profile = 1028;
                        codecProfileLevel11.level = i;
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel7, codecProfileLevel8, codecProfileLevel9, codecProfileLevel10, codecProfileLevel11};
                    }
                    length = codecProfileLevelArr.length;
                    while (i2 < length) {
                        codecProfileLevel = codecProfileLevelArr[i2];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    String str6 = de3Var.j;
                    h(ec.o(new StringBuilder(str3.length() + String.valueOf(str6).length() + 22), "codec.profileLevel, ", str6, ", ", str3));
                    return false;
                }
            }
        } else if (pairB != null) {
            iIntValue = ((Integer) pairB.first).intValue();
            iIntValue2 = ((Integer) pairB.second).intValue();
            zEquals = "video/dolby-vision".equals(str2);
            str = this.b;
            i = 8;
            if (zEquals) {
                iHashCode = str.hashCode();
                if (iHashCode != -1662735862) {
                    if (iHashCode != -1662541442) {
                        if (iHashCode == 1331836730 && str.equals("video/avc")) {
                            iIntValue = 8;
                            iIntValue2 = 0;
                        }
                    } else if (str.equals("video/hevc")) {
                        iIntValue = 2;
                        iIntValue2 = 0;
                    }
                } else if (str.equals("video/av01")) {
                    iIntValue = 2;
                    iIntValue2 = 0;
                }
            }
            if (this.i || str.equals("audio/ac4")) {
                codecCapabilities = this.d;
                if (codecCapabilities != null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (str.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                    if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                        i = 16;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel12 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel12.profile = 257;
                    codecProfileLevel12.level = i;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel13 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel13.profile = 513;
                    codecProfileLevel13.level = i;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel14 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel14.profile = 514;
                    codecProfileLevel14.level = i;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel15 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel15.profile = 1026;
                    codecProfileLevel15.level = i;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel16 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel16.profile = 1028;
                    codecProfileLevel16.level = i;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel12, codecProfileLevel13, codecProfileLevel14, codecProfileLevel15, codecProfileLevel16};
                }
                length = codecProfileLevelArr.length;
                while (i2 < length) {
                    codecProfileLevel = codecProfileLevelArr[i2];
                    if (codecProfileLevel.profile != iIntValue && (codecProfileLevel.level >= iIntValue2 || !z)) {
                        if ("video/hevc".equals(str) && iIntValue == 2) {
                            String str7 = Build.DEVICE;
                            if ("sailfish".equals(str7) || "marlin".equals(str7)) {
                            }
                        }
                    }
                }
                String str8 = de3Var.j;
                h(ec.o(new StringBuilder(str3.length() + String.valueOf(str8).length() + 22), "codec.profileLevel, ", str8, ", ", str3));
                return false;
            }
            if (iIntValue == 42) {
                iIntValue = 42;
                codecCapabilities = this.d;
                if (codecCapabilities != null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                } else {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (str.equals("audio/ac4")) {
                    if (codecCapabilities != null) {
                        i = 16;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel17 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel17.profile = 257;
                    codecProfileLevel17.level = i;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel18 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel18.profile = 513;
                    codecProfileLevel18.level = i;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel19 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel19.profile = 514;
                    codecProfileLevel19.level = i;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel110 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel110.profile = 1026;
                    codecProfileLevel110.level = i;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel111 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel111.profile = 1028;
                    codecProfileLevel111.level = i;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel17, codecProfileLevel18, codecProfileLevel19, codecProfileLevel110, codecProfileLevel111};
                }
                length = codecProfileLevelArr.length;
                while (i2 < length) {
                    codecProfileLevel = codecProfileLevelArr[i2];
                    if (codecProfileLevel.profile != iIntValue) {
                    }
                }
                String str9 = de3Var.j;
                h(ec.o(new StringBuilder(str3.length() + String.valueOf(str9).length() + 22), "codec.profileLevel, ", str9, ", ", str3));
                return false;
            }
        }
        return true;
    }

    public final boolean g(de3 de3Var) {
        return (Objects.equals(de3Var.m, "audio/flac") && de3Var.G == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = qz1.a;
        String str3 = this.b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.a;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        ec.x(sb, "NoSupport [", str, "] [", str4);
        ec.x(sb, ", ", str3, "] [", str2);
        sb.append("]");
        s90.C("MediaCodecInfo", sb.toString());
    }

    public final String toString() {
        return this.a;
    }
}
