package defpackage;

import android.content.ClipData;
import android.content.pm.ApkChecksum;
import android.graphics.fonts.Font;
import android.media.metrics.MediaMetricsManager;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ob {
    public static /* bridge */ /* synthetic */ ApkChecksum e(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* synthetic */ Font.Builder f(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager j(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder p(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo r(Object obj) {
        return (ContentInfo) obj;
    }
}
