package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hd0 implements qd0 {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final un1 i = new un1(ig.n);
    public static final un1 j = new un1(gm.r);
    public qk2 f;
    public final zf0 g = new zf0(1);

    @Override // defpackage.qd0
    public final synchronized nd0[] a() {
        return l(Uri.EMPTY, new HashMap());
    }

    public final void b(int i2, ArrayList arrayList) {
        zf0 zf0Var = this.g;
        switch (i2) {
            case 0:
                arrayList.add(new ck0());
                break;
            case 1:
                arrayList.add(new ek0());
                break;
            case 2:
                arrayList.add(new fk0());
                break;
            case 3:
                arrayList.add(new pe0());
                break;
            case 4:
                nd0 nd0VarP = i.p(0);
                if (nd0VarP == null) {
                    arrayList.add(new ef0());
                } else {
                    arrayList.add(nd0VarP);
                }
                break;
            case 5:
                arrayList.add(new gf0());
                break;
            case 6:
                arrayList.add(new sg0(new og0(), 0, zf0Var));
                break;
            case 7:
                arrayList.add(new wg0());
                break;
            case 8:
                arrayList.add(new oh0(zf0Var, 0, qk2.j));
                arrayList.add(new sh0(zf0Var, 0));
                break;
            case 9:
                arrayList.add(new di0());
                break;
            case 10:
                arrayList.add(new dl0());
                break;
            case 11:
                if (this.f == null) {
                    tj2 tj2Var = vj2.g;
                    this.f = qk2.j;
                }
                arrayList.add(new kl0(zf0Var, new ry1(), new dr0(11, this.f)));
                break;
            case 12:
                rl0 rl0Var = new rl0();
                rl0Var.c = 0;
                rl0Var.d = -1L;
                rl0Var.f = -1;
                rl0Var.g = -1L;
                arrayList.add(rl0Var);
                break;
            case 14:
                arrayList.add(new bf0(2));
                break;
            case 15:
                nd0 nd0VarP2 = j.p(new Object[0]);
                if (nd0VarP2 != null) {
                    arrayList.add(nd0VarP2);
                }
                break;
            case 16:
                arrayList.add(new re0(zf0Var));
                break;
            case 17:
                arrayList.add(new bf0(1));
                break;
            case 18:
                arrayList.add(new af0(2));
                break;
            case 19:
                arrayList.add(new bf0(0));
                break;
            case 20:
                arrayList.add(new af0(1));
                break;
            case zw0.zzm /* 21 */:
                arrayList.add(new af0(0));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d6 A[PHI: r18
  0x01d6: PHI (r18v2 int) = (r18v0 int), (r18v1 int), (r18v1 int) binds: [B:125:0x01d4, B:128:0x01e2, B:131:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qd0
    public final synchronized nd0[] l(Uri uri, Map map) {
        ArrayList arrayList;
        int i2;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i3 = 6;
            int i4 = 1;
            if (str != null) {
                String strI = rn0.i(str);
                switch (strI.hashCode()) {
                    case -2123537834:
                        if (strI.equals("audio/eac3-joc")) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1662384011:
                        if (strI.equals("video/mp2p")) {
                            i2 = 10;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1662384007:
                        if (strI.equals("video/mp2t")) {
                            i2 = 11;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1662095187:
                        if (strI.equals("video/webm")) {
                            i2 = 6;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1606874997:
                        if (strI.equals("audio/amr-wb")) {
                            i2 = 3;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1487656890:
                        if (strI.equals("image/avif")) {
                            i2 = 21;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1487464693:
                        if (strI.equals("image/heic")) {
                            i2 = 20;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1487464690:
                        if (strI.equals("image/heif")) {
                            i2 = 20;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1487394660:
                        if (strI.equals("image/jpeg")) {
                            i2 = 14;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1487018032:
                        if (strI.equals("image/webp")) {
                            i2 = 18;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1248337486:
                        if (strI.equals("application/mp4")) {
                            i2 = 8;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1079884372:
                        if (strI.equals("video/x-msvideo")) {
                            i2 = 16;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -1004728940:
                        if (strI.equals("text/vtt")) {
                            i2 = 13;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -879272239:
                        if (strI.equals("image/bmp")) {
                            i2 = 19;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -879258763:
                        if (strI.equals("image/png")) {
                            i2 = 17;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -387023398:
                        if (strI.equals("audio/x-matroska")) {
                            i2 = 6;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case -43467528:
                        if (strI.equals("application/webm")) {
                            i2 = 6;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 13915911:
                        if (strI.equals("video/x-flv")) {
                            i2 = 5;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 187078296:
                        if (strI.equals("audio/ac3")) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 187078297:
                        if (strI.equals("audio/ac4")) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 187078669:
                        if (strI.equals("audio/amr")) {
                            i2 = 3;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 187090232:
                        if (strI.equals("audio/mp4")) {
                            i2 = 8;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 187091926:
                        if (strI.equals("audio/ogg")) {
                            i2 = 9;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 187099443:
                        if (strI.equals("audio/wav")) {
                            i2 = 12;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 1331848029:
                        if (strI.equals("video/mp4")) {
                            i2 = 8;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 1503095341:
                        if (strI.equals("audio/3gpp")) {
                            i2 = 3;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 1504578661:
                        if (strI.equals("audio/eac3")) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 1504619009:
                        if (strI.equals("audio/flac")) {
                            i2 = 4;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 1504824762:
                        if (strI.equals("audio/midi")) {
                            i2 = 15;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 1504831518:
                        if (strI.equals("audio/mpeg")) {
                            i2 = 7;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 1505118770:
                        if (strI.equals("audio/webm")) {
                            i2 = 6;
                        } else {
                            i2 = -1;
                        }
                        break;
                    case 2039520277:
                        if (strI.equals("video/x-matroska")) {
                            i2 = 6;
                        } else {
                            i2 = -1;
                        }
                        break;
                    default:
                        i2 = -1;
                        break;
                }
            } else {
                i2 = -1;
            }
            if (i2 != -1) {
                b(i2, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i3 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i3 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i3 = i4;
            } else {
                i4 = 2;
                if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                    i3 = i4;
                } else if (lastPathSegment.endsWith(".amr")) {
                    i3 = 3;
                } else if (lastPathSegment.endsWith(".flac")) {
                    i3 = 4;
                } else if (lastPathSegment.endsWith(".flv")) {
                    i3 = 5;
                } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                    i3 = 15;
                } else if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                    if (lastPathSegment.endsWith(".mp3")) {
                        i3 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i3 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i3 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i3 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i3 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i3 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i3 = 13;
                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                        i3 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i3 = 16;
                    } else if (lastPathSegment.endsWith(".png")) {
                        i3 = 17;
                    } else if (lastPathSegment.endsWith(".webp")) {
                        i3 = 18;
                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                        i3 = 19;
                    } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                        i3 = 20;
                    } else if (lastPathSegment.endsWith(".avif")) {
                        i3 = 21;
                    } else {
                        i3 = -1;
                    }
                }
            }
            if (i3 != -1 && i3 != i2) {
                b(i3, arrayList);
            }
            int[] iArr = h;
            for (int i5 = 0; i5 < 21; i5++) {
                int i6 = iArr[i5];
                if (i6 != i2 && i6 != i3) {
                    b(i6, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (nd0[]) arrayList.toArray(new nd0[0]);
    }
}
