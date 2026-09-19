package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import com.extremestudios.musicmanevo.R;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class es0 implements yd2, i42 {
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public es0(int i) {
        switch (i) {
            case 3:
                this.f = null;
                this.g = new q7(24, this);
                this.h = new Object();
                break;
            case 9:
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = xo2.j;
                break;
            default:
                this.f = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.g = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.h = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.i = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.j = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.k = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public static yd3 B(t33 t33Var, vj2 vj2Var, yd3 yd3Var, su0 su0Var) {
        ox0 ox0VarG1 = t33Var.G1();
        int iJ1 = t33Var.J1();
        Object objF = ox0VarG1.g() ? null : ox0VarG1.f(iJ1);
        if (!t33Var.P1() && !ox0VarG1.g()) {
            su0 su0VarD = ox0VarG1.d(iJ1, su0Var, false);
            t33Var.M1();
            String str = qz1.a;
            su0VarD.getClass();
        }
        for (int i = 0; i < vj2Var.size(); i++) {
            yd3 yd3Var2 = (yd3) vj2Var.get(i);
            if (E(yd3Var2, objF, t33Var.P1(), t33Var.c(), t33Var.Q1())) {
                return yd3Var2;
            }
        }
        if (vj2Var.isEmpty() && yd3Var != null && E(yd3Var, objF, t33Var.P1(), t33Var.c(), t33Var.Q1())) {
            return yd3Var;
        }
        return null;
    }

    public static void D(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        ut0 ut0Var = ut0.f;
        f32 f32Var = ut0Var.a;
        String str2 = ut0Var.d.f;
        f32Var.getClass();
        f32.a(context, str2, bundle, new z61((Object) f32Var, (Object) context, 16, false));
    }

    public static boolean E(yd3 yd3Var, Object obj, boolean z, int i, int i2) {
        if (!yd3Var.a.equals(obj)) {
            return false;
        }
        int i3 = yd3Var.b;
        if (z) {
            return i3 == i && yd3Var.c == i2;
        }
        return i3 == -1 && yd3Var.e == -1;
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i) {
        int iC = t30.c(context, R.attr.colorControlHighlight);
        int iB = t30.b(context, R.attr.colorButtonNormal);
        int[] iArr = t30.b;
        int[] iArr2 = t30.d;
        int iB2 = fa.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, t30.c, t30.f}, new int[]{iB, iB2, fa.b(iC, i), i});
    }

    public static LayerDrawable d(kx kxVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = kxVar.d(context, R.drawable.abc_star_black_48dp);
        Drawable drawableD2 = kxVar.d(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void g(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = e5.b;
        }
        PorterDuff.Mode mode2 = e5.b;
        synchronized (e5.class) {
            porterDuffColorFilterF = kx.f(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterF);
    }

    public void A(um0 um0Var, yd3 yd3Var, ox0 ox0Var) {
        if (yd3Var == null) {
            return;
        }
        if (ox0Var.e(yd3Var.a) != -1) {
            um0Var.m(yd3Var, ox0Var);
            return;
        }
        ox0 ox0Var2 = (ox0) ((vk2) this.h).get(yd3Var);
        if (ox0Var2 != null) {
            um0Var.m(yd3Var, ox0Var2);
        }
    }

    public void C() {
        vu0 vu0Var;
        synchronized (this.h) {
            if (((Context) this.j) != null && ((vu0) this.i) == null) {
                zx zxVar = new zx(14, this);
                s70 s70Var = new s70(15, this);
                synchronized (this) {
                    vu0Var = new vu0((Context) this.j, vc3.C.t.c(), zxVar, s70Var, 0);
                }
                this.i = vu0Var;
                vu0Var.m();
            }
        }
    }

    @Override // defpackage.yd2
    public void c() {
        if (((AtomicBoolean) this.k).get()) {
            ((ak1) this.f).B();
        }
    }

    public ColorStateList e(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return jn.e(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return jn.e(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, t30.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return b(context, t30.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return jn.e(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.g, i)) {
                return t30.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.j, i)) {
                return jn.e(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.k, i)) {
                return jn.e(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return jn.e(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = t30.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = t30.b;
            iArr2[0] = t30.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = t30.e;
            iArr2[1] = t30.c(context, R.attr.colorControlActivated);
            iArr[2] = t30.f;
            iArr2[2] = t30.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = t30.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = t30.e;
            iArr2[1] = t30.c(context, R.attr.colorControlActivated);
            iArr[2] = t30.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // defpackage.i42
    public hp f(vg2 vg2Var, h42 h42Var) {
        synchronized (this) {
            mf1 mf1VarG = h42Var.g((g42) vg2Var.h);
            y32 y32Var = new y32((String) this.i);
            switch (mf1VarG.a) {
                case 0:
                    mf1VarG.d = y32Var;
                    break;
                default:
                    mf1VarG.d = y32Var;
                    break;
            }
            tj1 tj1Var = (tj1) mf1VarG.c();
            tj1Var.c();
            tj1Var.c();
            f93 f93Var = tj1Var.c().d;
            if (f93Var.x != null || f93Var.C != null) {
                this.j = tj1Var;
                return ((un1) this.f).t(vg2Var, h42Var, tj1Var);
            }
            i52 i52VarC = tj1Var.c();
            f93 f93Var2 = i52VarC.d;
            String str = i52VarC.g;
            kf3 kf3Var = i52VarC.k;
            Executor executor = (Executor) this.k;
            return na1.L(fn2.r(((p83) this.g).r(tj1Var)), new lx1(this, vg2Var, new x32(h42Var, vg2Var, f93Var2, str, executor, kf3Var, null), h42Var, tj1Var, 1), executor);
        }
    }

    @Override // defpackage.yd2
    public void h() {
        if (((AtomicBoolean) this.k).get()) {
            ((kk1) this.g).a();
            an1 an1Var = (an1) this.h;
            synchronized (an1Var) {
                an1Var.L1(fl1.r);
            }
        }
    }

    public String i() {
        String str = (String) tu0.e.c.a(lx0.Ma);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.f);
            jSONObject.put("eventCategory", (String) this.g);
            jSONObject.putOpt("event", (String) this.h);
            jSONObject.putOpt("errorCode", (Integer) this.i);
            jSONObject.putOpt("rewardType", (String) this.j);
            jSONObject.putOpt("rewardAmount", (Integer) this.k);
        } catch (JSONException unused) {
            jn.T("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return ec.o(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }

    public void j(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.yd2
    public synchronized void k(View view) {
        if (((AtomicBoolean) this.k).compareAndSet(false, true)) {
            ((ih1) this.j).B0();
            ((xm1) this.i).R1(view);
        }
    }

    @Override // defpackage.i42
    public Object l() {
        tj1 tj1Var;
        synchronized (this) {
            tj1Var = (tj1) this.j;
        }
        return tj1Var;
    }

    public void m(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.h) {
            try {
                if (((Context) this.j) != null) {
                    return;
                }
                this.j = context.getApplicationContext();
                ix0 ix0Var = lx0.F4;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    C();
                } else {
                    if (((Boolean) tu0Var.c.a(lx0.E4)).booleanValue()) {
                        vc3.C.g.f(new qu0(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean n(f93 f93Var, String str, rs0 rs0Var, uz1 uz1Var) {
        d72 d72Var;
        r52 r52Var = (r52) this.i;
        nz1 nz1Var = (nz1) r52Var.h;
        if1 if1Var = (if1) this.g;
        vc3 vc3Var = vc3.C;
        zb3 zb3Var = vc3Var.c;
        Context context = (Context) this.h;
        final int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        final int i2 = 1;
        if (zb3.h(context) && f93Var.x == null) {
            jn.M("Failed to load the ad because app ID is missing.");
            if1Var.b().execute(new Runnable(this) { // from class: wz1
                public final /* synthetic */ es0 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    es0 es0Var = this.g;
                    switch (i3) {
                        case 0:
                            ((tz1) ((r52) es0Var.i).i).Z(a23.E(6, null, null));
                            break;
                        default:
                            ((tz1) ((r52) es0Var.i).i).Z(a23.E(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            jn.M("Ad unit ID should not be null for NativeAdLoader.");
            if1Var.b().execute(new Runnable(this) { // from class: wz1
                public final /* synthetic */ es0 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i;
                    es0 es0Var = this.g;
                    switch (i3) {
                        case 0:
                            ((tz1) ((r52) es0Var.i).i).Z(a23.E(6, null, null));
                            break;
                        default:
                            ((tz1) ((r52) es0Var.i).i).Z(a23.E(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z = f93Var.k;
        dq.C(context, z);
        if (((Boolean) tu0.e.c.a(lx0.I9)).booleanValue() && z) {
            ((qt1) if1Var.z.c()).b(true);
        }
        int i3 = ((vz1) rs0Var).v;
        vc3Var.k.getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Bundle bundleM = jn.m(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        h52 h52Var = (h52) this.f;
        h52Var.a = f93Var;
        h52Var.t = bundleM;
        h52Var.m = i3;
        i52 i52VarA = h52Var.a();
        a72 a72VarE = a72.e(context, i8.J(i52VarA), 8, f93Var);
        ig1 ig1Var = i52VarA.o;
        if (ig1Var != null) {
            nz1Var.p(ig1Var);
        }
        if1 if1Var2 = if1Var.b;
        uj1 uj1Var = new uj1();
        uj1Var.a = context;
        uj1Var.b = i52VarA;
        uj1 uj1Var2 = new uj1(uj1Var);
        hm1 hm1Var = new hm1();
        hm1Var.b(nz1Var, if1Var.b());
        hf1 hf1Var = new hf1(if1Var2, new kc2(19, (Object) null), new un1(r52Var.g, (int) (objArr4 == true ? 1 : 0), (Object) nz1Var.l()), new fl1(17), new im1(hm1Var), uj1Var2, new zy1(29, (boolean) (objArr3 == true ? 1 : 0)), null, null);
        if (((Boolean) my0.c.u()).booleanValue()) {
            d72Var = (d72) hf1Var.e.c();
            d72Var.i(8);
            d72Var.c(f93Var.u);
            d72Var.d(f93Var.r);
        } else {
            d72Var = null;
        }
        ((t52) if1Var.L.c()).a(1);
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) if1Var.d.c();
        vi1 vi1Var = (vi1) hf1Var.n.c();
        p62 p62VarC = vi1Var.c(vi1Var.b());
        si1 si1Var = new si1(ya1Var, scheduledExecutorService, p62VarC);
        this.k = si1Var;
        p62VarC.a(new in2((Object) p62VarC, (int) (objArr == true ? 1 : 0), (Object) new vg2((Object) si1Var, (Object) new kd0((Object) this, uz1Var, d72Var, a72VarE, (Object) hf1Var, 7), 13, (boolean) (objArr2 == true ? 1 : 0))), ya1Var);
        return true;
    }

    public es0 o(n62 n62Var) {
        return q(new r21(14, n62Var));
    }

    public void p(int i) throws InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.g = Integer.valueOf(i);
    }

    public es0 q(xm2 xm2Var) {
        u62 u62Var = (u62) this.k;
        ya1 ya1Var = u62Var.a;
        return new es0(u62Var, this.f, (String) this.g, (hp) this.h, (List) this.i, na1.L((hp) this.j, xm2Var, ya1Var));
    }

    public uu0 r(wu0 wu0Var) {
        synchronized (this.h) {
            if (((xu0) this.k) == null) {
                return new uu0();
            }
            try {
                boolean z = ((vu0) this.i).z();
                xu0 xu0Var = (xu0) this.k;
                if (z) {
                    Parcel parcelU = xu0Var.U();
                    kt0.c(parcelU, wu0Var);
                    Parcel parcelY = xu0Var.Y(parcelU, 2);
                    uu0 uu0Var = (uu0) kt0.b(parcelY, uu0.CREATOR);
                    parcelY.recycle();
                    return uu0Var;
                }
                Parcel parcelU2 = xu0Var.U();
                kt0.c(parcelU2, wu0Var);
                Parcel parcelY2 = xu0Var.Y(parcelU2, 1);
                uu0 uu0Var2 = (uu0) kt0.b(parcelY2, uu0.CREATOR);
                parcelY2.recycle();
                return uu0Var2;
            } catch (RemoteException e) {
                jn.P("Unable to call into cache service.", e);
                return new uu0();
            }
        }
    }

    public void s(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.h = Integer.valueOf(i);
    }

    public void t(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.i = Integer.valueOf(i);
    }

    public hp u(d62 d62Var, vg2 vg2Var) {
        tj1 tj1Var = d62Var.a;
        this.j = tj1Var;
        if (d62Var.c != null) {
            if (tj1Var.h() != null) {
                d62Var.c.e.p(d62Var.a.h());
            }
            return na1.t(d62Var.c);
        }
        tj1Var.a().g = d62Var.b;
        return ((un1) this.f).t(vg2Var, null, d62Var.a);
    }

    public yo2 v() throws GeneralSecurityException {
        if (((Integer) this.f) == null) {
            j7.r("AES key size is not set");
            return null;
        }
        if (((Integer) this.g) == null) {
            j7.r("HMAC key size is not set");
            return null;
        }
        if (((Integer) this.h) == null) {
            j7.r("iv size is not set");
            return null;
        }
        Integer num = (Integer) this.i;
        if (num == null) {
            j7.r("tag size is not set");
            return null;
        }
        if (((wo2) this.j) == null) {
            j7.r("hash type is not set");
            return null;
        }
        int iIntValue = num.intValue();
        wo2 wo2Var = (wo2) this.j;
        if (wo2Var == wo2.h) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (wo2Var == wo2.i) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (wo2Var == wo2.j) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (wo2Var == wo2.k) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (wo2Var != wo2.l) {
                j7.r("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new yo2(((Integer) this.f).intValue(), ((Integer) this.g).intValue(), ((Integer) this.h).intValue(), ((Integer) this.i).intValue(), (xo2) this.k, (wo2) this.j);
    }

    public /* synthetic */ void w() {
        synchronized (this.h) {
            try {
                vu0 vu0Var = (vu0) this.i;
                if (vu0Var == null) {
                    return;
                }
                if (vu0Var.a() || ((vu0) this.i).e()) {
                    ((vu0) this.i).o();
                }
                this.i = null;
                this.k = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public es0 x(long j) {
        u62 u62Var = (u62) this.k;
        ScheduledExecutorService scheduledExecutorService = u62Var.b;
        return new es0(u62Var, this.f, (String) this.g, (hp) this.h, (List) this.i, na1.K((hp) this.j, j, TimeUnit.SECONDS, scheduledExecutorService));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p62 y() {
        u62 u62Var = (u62) this.k;
        Object obj = this.f;
        String str = (String) this.g;
        if (str == null) {
            u62Var.getClass();
            str = ((r62) obj).f;
        }
        p62 p62Var = new p62(obj, str, (hp) this.j);
        int i = 1;
        u62Var.c.L1(new w32(i, p62Var));
        hp hpVar = (hp) this.h;
        u52 u52Var = new u52(this, i, p62Var);
        ya1 ya1Var = za1.g;
        hpVar.a(u52Var, ya1Var);
        p62Var.a(new in2((Object) p62Var, (int) (0 == true ? 1 : 0), (Object) new vg2((Object) this, (Object) p62Var, 20, false)), ya1Var);
        return p62Var;
    }

    public void z(ox0 ox0Var) {
        vj2 vj2Var;
        um0 um0Var = new um0(4);
        if (((vj2) this.g).isEmpty()) {
            A(um0Var, (yd3) this.j, ox0Var);
            if (!Objects.equals((yd3) this.k, (yd3) this.j)) {
                A(um0Var, (yd3) this.k, ox0Var);
            }
            if (!Objects.equals((yd3) this.i, (yd3) this.j) && !Objects.equals((yd3) this.i, (yd3) this.k)) {
                A(um0Var, (yd3) this.i, ox0Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((vj2) this.g).size();
                vj2Var = (vj2) this.g;
                if (i >= size) {
                    break;
                }
                A(um0Var, (yd3) vj2Var.get(i), ox0Var);
                i++;
            }
            if (!vj2Var.contains((yd3) this.i)) {
                A(um0Var, (yd3) this.i, ox0Var);
            }
        }
        this.h = um0Var.s();
    }

    public es0(un1 un1Var, p83 p83Var, dg3 dg3Var, String str, ya1 ya1Var) {
        this.f = un1Var;
        this.g = p83Var;
        this.h = dg3Var;
        this.i = str;
        this.k = ya1Var;
    }

    public es0(u62 u62Var, Object obj, String str, hp hpVar, List list, hp hpVar2) {
        Objects.requireNonNull(u62Var);
        this.k = u62Var;
        this.f = obj;
        this.g = str;
        this.h = hpVar;
        this.i = list;
        this.j = hpVar2;
    }

    public es0(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.h = str;
        this.i = str2;
        this.j = o00.b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.g = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            j7.j();
            throw null;
        }
    }

    public /* synthetic */ es0(String str) {
        this.g = str;
    }
}
