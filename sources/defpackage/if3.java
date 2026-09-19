package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class if3 extends be3 {
    @Override // defpackage.r53
    public final void j(final Activity activity) {
        if (((Boolean) tu0.e.c.a(lx0.o1)).booleanValue() && vc3.C.h.g().p() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: se3
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    vc3 vc3Var = vc3.C;
                    if (vc3Var.h.g().p() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        sa1 sa1Var = vc3Var.h;
                        String strConcat = "";
                        if (displayCutout != null) {
                            h73 h73VarG = sa1Var.g();
                            for (Rect rect : displayCutout.getBoundingRects()) {
                                Locale locale = Locale.US;
                                int i = rect.left;
                                int i2 = rect.top;
                                int i3 = rect.right;
                                int i4 = rect.bottom;
                                StringBuilder sb = new StringBuilder();
                                sb.append(i);
                                sb.append(",");
                                sb.append(i2);
                                sb.append(",");
                                sb.append(i3);
                                String strJ = ec.j(sb, ",", i4);
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("|");
                                }
                                strConcat = strConcat.concat(strJ);
                            }
                            h73VarG.q(strConcat);
                        } else {
                            sa1Var.g().q("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (2 != attributes2.layoutInDisplayCutoutMode) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // defpackage.r53
    public final int k(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
