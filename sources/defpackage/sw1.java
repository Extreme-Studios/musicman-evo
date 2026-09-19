package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class sw1 implements ii2 {
    public final Context f;

    public /* synthetic */ sw1(Context context) {
        this.f = context;
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        new hd0();
        return new r53(this.f);
    }

    public hp b(boolean z) {
        try {
            tl tlVar = new tl(z);
            p40 p40VarA = p40.a(this.f);
            return p40VarA != null ? p40VarA.b(tlVar) : na1.C(new IllegalStateException());
        } catch (Exception e) {
            return na1.C(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    public nc3 c(kd0 kd0Var) throws Exception {
        String str;
        MediaCodec mediaCodecCreateByCodecName;
        Context context;
        int i = Build.VERSION.SDK_INT;
        int i2 = 8;
        hc3 hc3Var = null;
        mediaCodec = null;
        MediaCodec mediaCodec = null;
        hc3Var = null;
        if (i < 31 && ((context = this.f) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            try {
                pc3 pc3Var = (pc3) kd0Var.g;
                String str2 = pc3Var.a;
                Trace.beginSection("createCodec:".concat(str2));
                MediaCodec mediaCodecCreateByCodecName2 = MediaCodec.createByCodecName(str2);
                Trace.endSection();
                try {
                    Trace.beginSection("configureCodec");
                    Surface surface = (Surface) kd0Var.j;
                    if (surface != null || !pc3Var.h || i < 35) {
                        i2 = 0;
                    }
                    mediaCodecCreateByCodecName2.configure((MediaFormat) kd0Var.h, surface, (MediaCrypto) null, i2);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    mediaCodecCreateByCodecName2.start();
                    Trace.endSection();
                    return new fb3(mediaCodecCreateByCodecName2, (vg2) kd0Var.k);
                } catch (IOException e) {
                    e = e;
                    mediaCodec = mediaCodecCreateByCodecName2;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    mediaCodec = mediaCodecCreateByCodecName2;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        } else {
            int iG = rn0.g(((de3) kd0Var.i).m);
            switch (iG) {
                case -2:
                    str = "none";
                    break;
                case -1:
                    str = "unknown";
                    break;
                case 0:
                    str = "default";
                    break;
                case 1:
                    str = "audio";
                    break;
                case 2:
                    str = "video";
                    break;
                case 3:
                    str = "text";
                    break;
                case 4:
                    str = "image";
                    break;
                case 5:
                    str = "metadata";
                    break;
                default:
                    str = "camera motion";
                    break;
            }
            s90.K("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(str));
            pc3 pc3Var2 = (pc3) kd0Var.g;
            String str3 = pc3Var2.a;
            try {
                StringBuilder sb = new StringBuilder(str3.length() + 12);
                sb.append("createCodec:");
                sb.append(str3);
                Trace.beginSection(sb.toString());
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
                try {
                    hc3 hc3Var2 = new hc3(mediaCodecCreateByCodecName, new HandlerThread(hc3.m("ExoPlayer:MediaCodecAsyncAdapter:", iG)), new jc3(mediaCodecCreateByCodecName, new HandlerThread(hc3.m("ExoPlayer:MediaCodecQueueingThread:", iG))), (vg2) kd0Var.k);
                    try {
                        Trace.endSection();
                        Surface surface2 = (Surface) kd0Var.j;
                        if (surface2 != null || !pc3Var2.h || i < 35) {
                            i2 = 0;
                        }
                        hc3Var2.l((MediaFormat) kd0Var.h, surface2, i2);
                        return hc3Var2;
                    } catch (Exception e5) {
                        e = e5;
                        hc3Var = hc3Var2;
                        if (hc3Var != null) {
                            hc3Var.k();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Exception e7) {
                e = e7;
                mediaCodecCreateByCodecName = null;
            }
        }
    }
}
