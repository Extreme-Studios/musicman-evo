package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kb1 extends lb1 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final HashMap y;
    public final md1 h;
    public final vb1 i;
    public final boolean j;
    public final es1 k;
    public int l;
    public int m;
    public MediaPlayer n;
    public Uri o;
    public int p;
    public int q;
    public int r;
    public tb1 s;
    public final boolean t;
    public int u;
    public pb1 v;
    public boolean w;
    public Integer x;

    static {
        HashMap map = new HashMap();
        y = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public kb1(Context context, md1 md1Var, boolean z, boolean z2, vb1 vb1Var, es1 es1Var) {
        super(context);
        this.l = 0;
        this.m = 0;
        this.w = false;
        this.x = null;
        this.h = md1Var;
        this.i = vb1Var;
        this.t = z;
        this.j = z2;
        vb1Var.a(this);
        this.k = es1Var;
    }

    public final void D() {
        SurfaceTexture surfaceTexture;
        es1 es1Var;
        jn.p("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.o == null || surfaceTexture2 == null) {
            return;
        }
        E(false);
        try {
            gm gmVar = vc3.C.u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.n = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.n.setOnCompletionListener(this);
            this.n.setOnErrorListener(this);
            this.n.setOnInfoListener(this);
            this.n.setOnPreparedListener(this);
            this.n.setOnVideoSizeChangedListener(this);
            this.r = 0;
            if (this.t) {
                if (((Boolean) tu0.e.c.a(lx0.be)).booleanValue() && (es1Var = this.k) != null) {
                    us2 us2VarA = es1Var.a();
                    us2VarA.s("action", "svp_ampv");
                    us2VarA.t();
                }
                tb1 tb1Var = new tb1(getContext());
                this.s = tb1Var;
                int width = getWidth();
                int height = getHeight();
                tb1Var.r = width;
                tb1Var.q = height;
                tb1Var.t = surfaceTexture2;
                tb1 tb1Var2 = this.s;
                tb1Var2.start();
                if (tb1Var2.t == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        tb1Var2.y.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = tb1Var2.s;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.s.b();
                    this.s = null;
                }
            }
            this.n.setDataSource(getContext(), this.o);
            this.n.setSurface(new Surface(surfaceTexture2));
            this.n.setAudioStreamType(3);
            this.n.setScreenOnWhilePlaying(true);
            this.n.prepareAsync();
            G(1);
        } catch (IOException e) {
            e = e;
            jn.V("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.o)), e);
            onError(this.n, 1, 0);
        } catch (IllegalArgumentException e2) {
            e = e2;
            jn.V("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.o)), e);
            onError(this.n, 1, 0);
        } catch (IllegalStateException e3) {
            e = e3;
            jn.V("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.o)), e);
            onError(this.n, 1, 0);
        }
    }

    public final void E(boolean z) {
        jn.p("AdMediaPlayerView release");
        tb1 tb1Var = this.s;
        if (tb1Var != null) {
            tb1Var.b();
            this.s = null;
        }
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.n.release();
            this.n = null;
            G(0);
            if (z) {
                this.m = 0;
            }
        }
    }

    public final boolean F() {
        int i;
        return (this.n == null || (i = this.l) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void G(int i) {
        wb1 wb1Var = this.g;
        vb1 vb1Var = this.i;
        if (i == 3) {
            vb1Var.d();
            wb1Var.d = true;
            wb1Var.a();
        } else if (this.l == 3) {
            vb1Var.m = false;
            wb1Var.d = false;
            wb1Var.a();
        }
        this.l = i;
    }

    @Override // defpackage.lb1
    public final String d() {
        return "MediaPlayer".concat(true != this.t ? "" : " spherical");
    }

    @Override // defpackage.lb1
    public final void e(pb1 pb1Var) {
        this.v = pb1Var;
    }

    @Override // defpackage.lb1
    public final void f(String str) {
        Uri uri = Uri.parse(str);
        wu0 wu0VarA = wu0.a(uri);
        if (wu0VarA == null || wu0VarA.f != null) {
            if (wu0VarA != null) {
                uri = Uri.parse(wu0VarA.f);
            }
            this.o = uri;
            this.u = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.lb1
    public final void g() {
        jn.p("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.n.release();
            this.n = null;
            G(0);
            this.m = 0;
        }
        this.i.b();
    }

    @Override // defpackage.lb1
    public final void h() {
        jn.p("AdMediaPlayerView play");
        if (F()) {
            this.n.start();
            G(3);
            this.f.c = true;
            zb3.l.post(new ib1(this, 3));
        }
        this.m = 3;
    }

    @Override // defpackage.lb1
    public final void i() {
        jn.p("AdMediaPlayerView pause");
        if (F() && this.n.isPlaying()) {
            this.n.pause();
            G(4);
            zb3.l.post(new ib1(this, 4));
        }
        this.m = 4;
    }

    @Override // defpackage.lb1
    public final int j() {
        if (F()) {
            return this.n.getDuration();
        }
        return -1;
    }

    @Override // defpackage.lb1
    public final int k() {
        if (F()) {
            return this.n.getCurrentPosition();
        }
        return 0;
    }

    @Override // defpackage.lb1
    public final void l(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        jn.p(sb.toString());
        if (!F()) {
            this.u = i;
        } else {
            this.n.seekTo(i);
            this.u = 0;
        }
    }

    @Override // defpackage.lb1
    public final void m(float f, float f2) {
        tb1 tb1Var = this.s;
        if (tb1Var != null) {
            tb1Var.c(f, f2);
        }
    }

    @Override // defpackage.lb1
    public final int n() {
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // defpackage.lb1
    public final int o() {
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.r = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        jn.p("AdMediaPlayerView completion");
        G(5);
        this.m = 5;
        zb3.l.post(new ib1(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = y;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        jn.T(sb.toString());
        G(-1);
        this.m = -1;
        zb3.l.post(new ib(10, this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = y;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        jn.p(sb.toString());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int defaultSize = View.getDefaultSize(this.p, i);
        int defaultSize2 = View.getDefaultSize(this.q, i2);
        if (this.p > 0 && this.q > 0 && this.s == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i6 = (this.q * size) / this.p;
                    if (mode2 == Integer.MIN_VALUE || i6 <= size2) {
                        defaultSize2 = i6;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    i3 = this.p;
                    if (mode2 == 1073741824) {
                        i5 = (i3 * size2) / this.q;
                        if (mode != Integer.MIN_VALUE && i5 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i4 = this.q;
                        if (mode2 == Integer.MIN_VALUE || i4 <= size2) {
                            size2 = i4;
                            i5 = i3;
                        } else {
                            i5 = (size2 * i3) / i4;
                        }
                        if (mode == Integer.MIN_VALUE && i5 > size) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i7 = this.p;
                int i8 = i7 * size2;
                int i9 = this.q;
                int i10 = size * i9;
                if (i8 < i10) {
                    defaultSize = i8 / i9;
                } else {
                    if (i8 > i10) {
                        defaultSize2 = i10 / i7;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i6 = (this.q * size) / this.p;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i6;
                    defaultSize = size;
                } else {
                    i3 = this.p;
                    if (mode2 == 1073741824) {
                        i5 = (i3 * size2) / this.q;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i4 = this.q;
                        if (mode2 == Integer.MIN_VALUE) {
                            size2 = i4;
                            i5 = i3;
                        } else {
                            size2 = i4;
                            i5 = i3;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        tb1 tb1Var = this.s;
        if (tb1Var != null) {
            tb1Var.a(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        jn.p("AdMediaPlayerView prepared");
        G(2);
        vb1 vb1Var = this.i;
        if (vb1Var.i && !vb1Var.j) {
            jn.q(vb1Var.e, vb1Var.d, "vfr2");
            vb1Var.j = true;
        }
        zb3.l.post(new hb1(this, 0, mediaPlayer));
        this.p = mediaPlayer.getVideoWidth();
        this.q = mediaPlayer.getVideoHeight();
        int i = this.u;
        if (i != 0) {
            l(i);
        }
        if (this.j && F() && this.n.getCurrentPosition() > 0 && this.m != 3) {
            jn.p("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.n;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                jn.T("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.n.start();
            int currentPosition = this.n.getCurrentPosition();
            vc3.C.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (F() && this.n.getCurrentPosition() == currentPosition) {
                vc3.C.k.getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.n.pause();
            y();
        }
        int i2 = this.p;
        int i3 = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40 + String.valueOf(i3).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        jn.R(sb.toString());
        if (this.m == 3) {
            h();
        }
        y();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        jn.p("AdMediaPlayerView surface created");
        D();
        zb3.l.post(new ib1(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jn.p("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null && this.u == 0) {
            this.u = mediaPlayer.getCurrentPosition();
        }
        tb1 tb1Var = this.s;
        if (tb1Var != null) {
            tb1Var.b();
        }
        zb3.l.post(new ib1(this, 2));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        jn.p("AdMediaPlayerView surface changed");
        int i3 = this.m;
        int i4 = 0;
        boolean z = this.p == i && this.q == i2;
        if (this.n != null && i3 == 3 && z) {
            int i5 = this.u;
            if (i5 != 0) {
                l(i5);
            }
            h();
        }
        tb1 tb1Var = this.s;
        if (tb1Var != null) {
            tb1Var.a(i, i2);
        }
        zb3.l.post(new jb1(this, i, i2, i4));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.i.c(this);
        this.f.a(surfaceTexture, this.v);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i2).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        jn.p(sb.toString());
        this.p = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.q = videoHeight;
        if (this.p == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        jn.p(sb.toString());
        zb3.l.post(new og(i, 6, this));
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.lb1
    public final long p() {
        if (this.x != null) {
            return (r() * ((long) this.r)) / 100;
        }
        return -1L;
    }

    @Override // defpackage.lb1
    public final long q() {
        return 0L;
    }

    @Override // defpackage.lb1
    public final long r() {
        if (this.x != null) {
            return ((long) j()) * ((long) this.x.intValue());
        }
        return -1L;
    }

    @Override // defpackage.lb1
    public final int s() {
        if (Build.VERSION.SDK_INT < 26 || !F()) {
            return -1;
        }
        return this.n.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // android.view.View
    public final String toString() {
        String name = kb1.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return ec.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // defpackage.lb1
    public final void y() {
        wb1 wb1Var = this.g;
        float f = wb1Var.c ? wb1Var.e ? 0.0f : wb1Var.f : 0.0f;
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer == null) {
            jn.T("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }
}
