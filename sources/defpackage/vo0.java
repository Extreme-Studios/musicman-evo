package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vo0 implements g23 {
    public final /* synthetic */ int a;
    public static final vo0 b = new vo0(0);
    public static final vo0 c = new vo0(1);
    public static final vo0 d = new vo0(2);
    public static final vo0 e = new vo0(3);
    public static final vo0 f = new vo0(4);
    public static final vo0 g = new vo0(5);
    public static final vo0 h = new vo0(6);
    public static final vo0 i = new vo0(7);
    public static final vo0 j = new vo0(8);
    public static final vo0 k = new vo0(9);
    public static final vo0 l = new vo0(10);
    public static final vo0 m = new vo0(11);
    public static final vo0 n = new vo0(12);
    public static final vo0 o = new vo0(13);
    public static final vo0 p = new vo0(14);
    public static final vo0 q = new vo0(15);
    public static final vo0 r = new vo0(16);
    public static final vo0 s = new vo0(17);
    public static final vo0 t = new vo0(18);
    public static final vo0 u = new vo0(19);
    public static final vo0 v = new vo0(20);
    public static final vo0 w = new vo0(21);
    public static final vo0 x = new vo0(22);
    public static final vo0 y = new vo0(23);
    public static final vo0 z = new vo0(24);
    public static final vo0 A = new vo0(25);
    public static final vo0 B = new vo0(26);
    public static final vo0 C = new vo0(27);
    public static final vo0 D = new vo0(28);
    public static final vo0 E = new vo0(29);

    public /* synthetic */ vo0(int i2) {
        this.a = i2;
    }

    @Override // defpackage.g23
    public final boolean a(int i2) {
        Enum r2 = null;
        switch (this.a) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 2:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 4:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return true;
                    default:
                        return false;
                }
            case 6:
                return i2 == 0 || i2 == 1;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 8:
                return ss0.x(i2) != 0;
            case 9:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 1000;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 12:
                return ct0.b(i2) != null;
            case 13:
                switch (i2) {
                    case 0:
                        r2 = dv0.AD_INITIATER_UNSPECIFIED;
                        break;
                    case 1:
                        r2 = dv0.BANNER;
                        break;
                    case 2:
                        r2 = dv0.DFP_BANNER;
                        break;
                    case 3:
                        r2 = dv0.INTERSTITIAL;
                        break;
                    case 4:
                        r2 = dv0.DFP_INTERSTITIAL;
                        break;
                    case 5:
                        r2 = dv0.NATIVE_EXPRESS;
                        break;
                    case 6:
                        r2 = dv0.AD_LOADER;
                        break;
                    case 7:
                        r2 = dv0.REWARD_BASED_VIDEO_AD;
                        break;
                    case 8:
                        r2 = dv0.BANNER_SEARCH_ADS;
                        break;
                    case 9:
                        r2 = dv0.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                        break;
                    case 10:
                        r2 = dv0.APP_OPEN;
                        break;
                    case 11:
                        r2 = dv0.REWARDED_INTERSTITIAL;
                        break;
                }
                return r2 != null;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 4;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 16:
                if (i2 == 0) {
                    r2 = mv0.UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = mv0.CONNECTING;
                } else if (i2 == 2) {
                    r2 = mv0.CONNECTED;
                } else if (i2 == 3) {
                    r2 = mv0.DISCONNECTING;
                } else if (i2 == 4) {
                    r2 = mv0.DISCONNECTED;
                } else if (i2 == 5) {
                    r2 = mv0.SUSPENDED;
                }
                return r2 != null;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 18:
                return i2 == 0 || i2 == 1;
            case 19:
                switch (i2) {
                    case 0:
                        r2 = pw0.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        r2 = pw0.BANNER;
                        break;
                    case 2:
                        r2 = pw0.INTERSTITIAL;
                        break;
                    case 3:
                        r2 = pw0.NATIVE_EXPRESS;
                        break;
                    case 4:
                        r2 = pw0.NATIVE_CONTENT;
                        break;
                    case 5:
                        r2 = pw0.NATIVE_APP_INSTALL;
                        break;
                    case 6:
                        r2 = pw0.NATIVE_CUSTOM_TEMPLATE;
                        break;
                    case 7:
                        r2 = pw0.DFP_BANNER;
                        break;
                    case 8:
                        r2 = pw0.DFP_INTERSTITIAL;
                        break;
                    case 9:
                        r2 = pw0.REWARD_BASED_VIDEO_AD;
                        break;
                    case 10:
                        r2 = pw0.BANNER_SEARCH_ADS;
                        break;
                }
                return r2 != null;
            case 20:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case zw0.zzm /* 21 */:
                return i2 == 0 || i2 == 1 || i2 == 1000;
            case 22:
                return i2 == 1 || i2 == 2;
            case 23:
                return i2 == 0 || i2 == 1;
            case 24:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 25:
                return ej1.p(i2) != 0;
            case 26:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 27:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 28:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            default:
                if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 1999) {
                    return true;
                }
                switch (i2) {
                    case 1000:
                    case 1001:
                    case 1002:
                    case 1003:
                    case 1004:
                    case 1005:
                    case 1006:
                    case 1007:
                    case 1008:
                    case 1009:
                    case 1010:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
