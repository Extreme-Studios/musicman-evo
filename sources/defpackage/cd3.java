package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cd3 {
    public static final HashMap a = new HashMap();

    public static synchronized List a(String str, boolean z, boolean z2) {
        try {
            zc3 zc3Var = new zc3(str, z, z2);
            HashMap map = a;
            List list = (List) map.get(zc3Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListD = d(zc3Var, new e3(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListD.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListD.size() == 1 && ((pc3) arrayListD.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListD.add(pc3.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false));
                }
                Collections.sort(arrayListD, new s82(1, v33.i));
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListD.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((pc3) arrayListD.get(0)).a)) {
                arrayListD.add((pc3) arrayListD.remove(0));
            }
            vj2 vj2VarM = vj2.m(arrayListD);
            map.put(zc3Var, vj2VarM);
            return vj2VarM;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static qk2 b(r53 r53Var, de3 de3Var, boolean z, boolean z2) {
        String str = de3Var.m;
        r53Var.getClass();
        List listA = a(str, z, z2);
        String strC = c(de3Var);
        Iterable iterableA = strC == null ? qk2.j : a(strC, z, z2);
        tj2 tj2Var = vj2.g;
        sj2 sj2Var = new sj2(4);
        sj2Var.b(listA);
        sj2Var.b(iterableA);
        return sj2Var.f();
    }

    public static String c(de3 de3Var) {
        Pair pairB;
        String str = de3Var.m;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairB = rl1.b(de3Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[PHI: r18
  0x0055: PHI (r18v4 int) = (r18v1 int), (r18v1 int), (r18v5 int) binds: [B:72:0x0127, B:70:0x0123, B:15:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[EDGE_INSN: B:35:0x00a2->B:59:0x00fa BREAK  A[LOOP:1: B:20:0x006b->B:24:0x0079]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133 A[Catch: Exception -> 0x0138, TryCatch #2 {Exception -> 0x0138, blocks: (B:62:0x010a, B:68:0x0115, B:74:0x012b, B:76:0x0133, B:83:0x0144, B:85:0x014d, B:93:0x0171, B:86:0x0151, B:88:0x0161, B:90:0x0169, B:79:0x013a), top: B:108:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013a A[Catch: Exception -> 0x0138, TryCatch #2 {Exception -> 0x0138, blocks: (B:62:0x010a, B:68:0x0115, B:74:0x012b, B:76:0x0133, B:83:0x0144, B:85:0x014d, B:93:0x0171, B:86:0x0151, B:88:0x0161, B:90:0x0169, B:79:0x013a), top: B:108:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x0143  */
    /* JADX WARN: Code duplicated, block: B:85:0x014d A[Catch: Exception -> 0x0138, TryCatch #2 {Exception -> 0x0138, blocks: (B:62:0x010a, B:68:0x0115, B:74:0x012b, B:76:0x0133, B:83:0x0144, B:85:0x014d, B:93:0x0171, B:86:0x0151, B:88:0x0161, B:90:0x0169, B:79:0x013a), top: B:108:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0151 A[Catch: Exception -> 0x0138, TryCatch #2 {Exception -> 0x0138, blocks: (B:62:0x010a, B:68:0x0115, B:74:0x012b, B:76:0x0133, B:83:0x0144, B:85:0x014d, B:93:0x0171, B:86:0x0151, B:88:0x0161, B:90:0x0169, B:79:0x013a), top: B:108:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0161 A[Catch: Exception -> 0x0138, TryCatch #2 {Exception -> 0x0138, blocks: (B:62:0x010a, B:68:0x0115, B:74:0x012b, B:76:0x0133, B:83:0x0144, B:85:0x014d, B:93:0x0171, B:86:0x0151, B:88:0x0161, B:90:0x0169, B:79:0x013a), top: B:108:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x0171 A[Catch: Exception -> 0x0138, TRY_LEAVE, TryCatch #2 {Exception -> 0x0138, blocks: (B:62:0x010a, B:68:0x0115, B:74:0x012b, B:76:0x0133, B:83:0x0144, B:85:0x014d, B:93:0x0171, B:86:0x0151, B:88:0x0161, B:90:0x0169, B:79:0x013a), top: B:108:0x010a }] */
    public static ArrayList d(zc3 zc3Var, e3 e3Var) throws ad3 {
        String str;
        boolean zIsFeatureSupported;
        int i;
        boolean z;
        int i2;
        String str2;
        boolean zIsHardwareAccelerated;
        String str3;
        String strV;
        zc3 zc3Var2 = zc3Var;
        e3 e3Var2 = e3Var;
        int i3 = e3Var2.g;
        String str4 = "secure-playback";
        String str5 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = zc3Var2.a;
            if (((MediaCodecInfo[]) e3Var2.h) == null) {
                e3Var2.h = new MediaCodecList(i3).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) e3Var2.h).length;
            int i4 = 0;
            while (i4 < length) {
                if (((MediaCodecInfo[]) e3Var2.h) == null) {
                    e3Var2.h = new MediaCodecList(i3).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) e3Var2.h)[i4];
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias()) {
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder()) {
                        i = i3;
                        str2 = str4;
                        str3 = str5;
                    } else {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length2 = supportedTypes.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length2) {
                                if (!str6.equals("video/dolby-vision")) {
                                    if (!str6.equals("video/mv-hevc")) {
                                        if (!str6.equals("audio/alac") || !"OMX.lge.alac.decoder".equals(name)) {
                                            if (!str6.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(name)) {
                                                if (!str6.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                                    str = null;
                                                    break;
                                                }
                                                str = "audio/lg-ac3";
                                                break;
                                            }
                                            str = "audio/x-lg-flac";
                                            break;
                                        }
                                        str = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            int i6 = i5;
                            str = supportedTypes[i6];
                            if (str.equalsIgnoreCase(str6)) {
                                break;
                            }
                            i5 = i6 + 1;
                        }
                        if (str != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported(str5);
                                boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired(str5);
                                try {
                                    if (!zc3Var2.c) {
                                        if (zIsFeatureRequired) {
                                            i = i3;
                                        } else {
                                            zIsFeatureSupported = capabilitiesForType.isFeatureSupported(str4);
                                            boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired(str4);
                                            i = i3;
                                            z = zc3Var2.b;
                                            if (z || !zIsFeatureRequired2) {
                                                if (z) {
                                                    if (zIsFeatureSupported) {
                                                        zIsFeatureSupported = true;
                                                    }
                                                }
                                                i2 = Build.VERSION.SDK_INT;
                                                str2 = str4;
                                                if (i2 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                                } else if (e(mediaCodecInfo, str6)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                                e(mediaCodecInfo, str6);
                                                str3 = str5;
                                                if (i2 >= 29) {
                                                    mediaCodecInfo.isVendor();
                                                } else {
                                                    strV = dq.v(mediaCodecInfo.getName());
                                                    if (!strV.startsWith("omx.google.") && !strV.startsWith("c2.android.")) {
                                                        strV.startsWith("c2.google.");
                                                    }
                                                }
                                                if (z == zIsFeatureSupported) {
                                                    arrayList.add(pc3.a(name, str6, str, capabilitiesForType, zIsHardwareAccelerated));
                                                }
                                            }
                                        }
                                        str2 = str4;
                                        str3 = str5;
                                    } else if (zIsFeatureSupported2) {
                                        zIsFeatureSupported = capabilitiesForType.isFeatureSupported(str4);
                                        boolean zIsFeatureRequired3 = capabilitiesForType.isFeatureRequired(str4);
                                        i = i3;
                                        z = zc3Var2.b;
                                        if (z) {
                                            if (z) {
                                                if (zIsFeatureSupported) {
                                                    zIsFeatureSupported = true;
                                                } else {
                                                    str2 = str4;
                                                    str3 = str5;
                                                }
                                            }
                                            i2 = Build.VERSION.SDK_INT;
                                            str2 = str4;
                                            if (i2 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                            } else if (e(mediaCodecInfo, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            e(mediaCodecInfo, str6);
                                            str3 = str5;
                                            if (i2 >= 29) {
                                                mediaCodecInfo.isVendor();
                                            } else {
                                                strV = dq.v(mediaCodecInfo.getName());
                                                if (!strV.startsWith("omx.google.")) {
                                                    strV.startsWith("c2.google.");
                                                }
                                            }
                                            if (z == zIsFeatureSupported) {
                                                arrayList.add(pc3.a(name, str6, str, capabilitiesForType, zIsHardwareAccelerated));
                                            }
                                        } else {
                                            if (z) {
                                                if (zIsFeatureSupported) {
                                                    zIsFeatureSupported = true;
                                                } else {
                                                    str2 = str4;
                                                    str3 = str5;
                                                }
                                            }
                                            i2 = Build.VERSION.SDK_INT;
                                            str2 = str4;
                                            if (i2 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                            } else if (e(mediaCodecInfo, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            e(mediaCodecInfo, str6);
                                            str3 = str5;
                                            if (i2 >= 29) {
                                                mediaCodecInfo.isVendor();
                                            } else {
                                                strV = dq.v(mediaCodecInfo.getName());
                                                if (!strV.startsWith("omx.google.")) {
                                                    strV.startsWith("c2.google.");
                                                }
                                            }
                                            if (z == zIsFeatureSupported) {
                                                arrayList.add(pc3.a(name, str6, str, capabilitiesForType, zIsHardwareAccelerated));
                                            }
                                        }
                                    } else {
                                        i = i3;
                                        str2 = str4;
                                        str3 = str5;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 24 + str.length() + 1);
                                    sb.append("Failed to query codec ");
                                    sb.append(name);
                                    sb.append(" (");
                                    sb.append(str);
                                    sb.append(")");
                                    s90.Y("MediaCodecUtil", sb.toString());
                                    throw e;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } else {
                            i = i3;
                            str2 = str4;
                            str3 = str5;
                        }
                    }
                } else {
                    i = i3;
                    str2 = str4;
                    str3 = str5;
                }
                i4++;
                zc3Var2 = zc3Var;
                e3Var2 = e3Var;
                str4 = str2;
                i3 = i;
                str5 = str3;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new ad3("Failed to query underlying media codecs", e3);
        }
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (rn0.a(str)) {
            return true;
        }
        String strV = dq.v(mediaCodecInfo.getName());
        if (strV.startsWith("arc.")) {
            return false;
        }
        if (strV.startsWith("omx.google.") || strV.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strV.startsWith("omx.sec.") && strV.contains(".sw.")) || strV.equals("omx.qcom.video.decoder.hevcswvdec") || strV.startsWith("c2.android.") || strV.startsWith("c2.google.")) {
            return true;
        }
        return (strV.startsWith("omx.") || strV.startsWith("c2.")) ? false : true;
    }
}
