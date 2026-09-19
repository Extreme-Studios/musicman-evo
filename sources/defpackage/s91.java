package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s91 extends t33 {
    public final /* synthetic */ int h = 0;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s91(sa1 sa1Var) {
        super(4);
        Objects.requireNonNull(sa1Var);
        this.i = sa1Var;
    }

    @Override // defpackage.t33
    public final void m1() {
        BitmapDrawable bitmapDrawable;
        boolean zB = false;
        switch (this.h) {
            case 0:
                try {
                    zB = x2.b((Context) this.i);
                    break;
                } catch (em | IOException | IllegalStateException e) {
                    jn.P("Fail to get isAdIdFakeForDebugLogging", e);
                }
                synchronized (o83.b) {
                    o83.c = true;
                    o83.d = zB;
                    break;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(zB).length() + 38);
                sb.append("Update ad debug logging enablement as ");
                sb.append(zB);
                jn.T(sb.toString());
                return;
            case 1:
                sa1 sa1Var = (sa1) this.i;
                u40 u40Var = new u40(sa1Var.e, sa1Var.f.f);
                synchronized (sa1Var.a) {
                    try {
                        ue0 ue0Var = vc3.C.m;
                        ue0.r(sa1Var.h, u40Var);
                    } catch (IllegalArgumentException e2) {
                        jn.V("Cannot config CSI reporter.", e2);
                    }
                    break;
                }
                return;
            default:
                nf0 nf0Var = (nf0) this.i;
                s70 s70Var = vc3.C.w;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) s70Var.g).get(Integer.valueOf(nf0Var.h.t.k));
                if (bitmap != null) {
                    q83 q83Var = nf0Var.h.t;
                    boolean z = q83Var.i;
                    float f = q83Var.j;
                    Activity activity = nf0Var.g;
                    if (z && f > 0.0f && f <= 25.0f) {
                        try {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                            RenderScript renderScriptCreate = RenderScript.create(activity);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            scriptIntrinsicBlurCreate.setRadius(f);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                        } catch (RuntimeException unused) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                        break;
                    } else {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    }
                    zb3.l.post(new u52(this, 13, bitmapDrawable));
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s91(nf0 nf0Var) {
        super(4);
        this.i = nf0Var;
    }

    public s91(Context context) {
        super(4);
        this.i = context;
    }
}
