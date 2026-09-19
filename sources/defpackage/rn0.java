package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class rn0 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str) {
        return "audio".equals(k(str));
    }

    public static boolean b(String str) {
        return "video".equals(k(str));
    }

    public static boolean c(String str) {
        return "image".equals(k(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0088 A[RETURN] */
    public static boolean d(String str, String str2) {
        pt ptVarJ;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    return true;
                }
                return false;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    return true;
                }
                return false;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    return true;
                }
                return false;
            case -53558318:
                return (!str.equals("audio/mp4a-latm") || str2 == null || (ptVarJ = j(str2)) == null || (iA = ptVarJ.a()) == 0 || iA == 16) ? false : true;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    return true;
                }
                return false;
            case 187094639:
                if (str.equals("audio/raw")) {
                    return true;
                }
                return false;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    return true;
                }
                return false;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    return true;
                }
                return false;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    return true;
                }
                return false;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    return true;
                }
                return false;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public static boolean e(String str, String str2) {
        String strF;
        pt ptVarJ;
        String string = null;
        if (str != null) {
            String str3 = qz1.a;
            String[] strArrSplit = TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            StringBuilder sb = new StringBuilder();
            for (String str4 : strArrSplit) {
                if (str4 == null) {
                    strF = null;
                } else {
                    String strV = dq.v(str4.trim());
                    if (strV.startsWith("avc1") || strV.startsWith("avc3")) {
                        strF = "video/avc";
                    } else if (strV.startsWith("hev1") || strV.startsWith("hvc1")) {
                        strF = "video/hevc";
                    } else if (strV.startsWith("dvav") || strV.startsWith("dva1") || strV.startsWith("dvhe") || strV.startsWith("dvh1")) {
                        strF = "video/dolby-vision";
                    } else if (strV.startsWith("av01")) {
                        strF = "video/av01";
                    } else if (strV.startsWith("vp9") || strV.startsWith("vp09")) {
                        strF = "video/x-vnd.on2.vp9";
                    } else if (strV.startsWith("vp8") || strV.startsWith("vp08")) {
                        strF = "video/x-vnd.on2.vp8";
                    } else if (strV.startsWith("mp4a")) {
                        strF = (!strV.startsWith("mp4a.") || (ptVarJ = j(strV)) == null) ? null : f(ptVarJ.a);
                        if (strF == null) {
                            strF = "audio/mp4a-latm";
                        }
                    } else if (strV.startsWith("mha1")) {
                        strF = "audio/mha1";
                    } else if (strV.startsWith("mhm1")) {
                        strF = "audio/mhm1";
                    } else if (strV.startsWith("ac-3") || strV.startsWith("dac3")) {
                        strF = "audio/ac3";
                    } else if (strV.startsWith("ec-3") || strV.startsWith("dec3")) {
                        strF = "audio/eac3";
                    } else if (strV.startsWith("ec+3")) {
                        strF = "audio/eac3-joc";
                    } else if (strV.startsWith("ac-4") || strV.startsWith("dac4")) {
                        strF = "audio/ac4";
                    } else if (strV.startsWith("dtsc")) {
                        strF = "audio/vnd.dts";
                    } else if (strV.startsWith("dtse")) {
                        strF = "audio/vnd.dts.hd;profile=lbr";
                    } else if (strV.startsWith("dtsh") || strV.startsWith("dtsl")) {
                        strF = "audio/vnd.dts.hd";
                    } else if (strV.startsWith("dtsx")) {
                        strF = "audio/vnd.dts.uhd;profile=p2";
                    } else if (strV.startsWith("opus")) {
                        strF = "audio/opus";
                    } else if (strV.startsWith("vorbis")) {
                        strF = "audio/vorbis";
                    } else if (strV.startsWith("flac")) {
                        strF = "audio/flac";
                    } else if (strV.startsWith("stpp")) {
                        strF = "application/ttml+xml";
                    } else if (strV.startsWith("wvtt")) {
                        strF = "text/vtt";
                    } else if (strV.contains("cea708")) {
                        strF = "application/cea-708";
                    } else if (strV.contains("eia608") || strV.contains("cea608")) {
                        strF = "application/cea-608";
                    } else {
                        ArrayList arrayList = a;
                        if (arrayList.size() > 0) {
                            arrayList.get(0).getClass();
                            j7.j();
                            return false;
                        }
                        strF = null;
                    }
                }
                if (str2.equals(strF)) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str4);
                }
            }
            if (sb.length() > 0) {
                string = sb.toString();
            }
        }
        return string != null;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if ("text".equals(k(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (c(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        j7.j();
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x0095 A[RETURN] */
    public static int h(String str, String str2) {
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (!str.equals("audio/mp4a-latm") || str2 == null || (r3 = j(str2)) == null) {
                    return 0;
                }
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        String strV = dq.v(str);
        switch (strV.hashCode()) {
            case -1833600100:
                return strV.equals("video/x-mvhevc") ? "video/mv-hevc" : strV;
            case -1007807498:
                return strV.equals("audio/x-flac") ? "audio/flac" : strV;
            case -979095690:
                return strV.equals("application/x-mpegurl") ? "application/x-mpegURL" : strV;
            case -586683234:
                return strV.equals("audio/x-wav") ? "audio/wav" : strV;
            case -432836268:
                return strV.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : strV;
            case -432836267:
                return strV.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : strV;
            case 187090231:
                return strV.equals("audio/mp3") ? "audio/mpeg" : strV;
            default:
                return strV;
        }
    }

    public static pt j(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new pt(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String k(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
