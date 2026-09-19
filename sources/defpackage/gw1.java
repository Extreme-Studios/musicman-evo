package defpackage;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gw1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public gw1(e61 e61Var, String str, String str2) {
        this.f = 2;
        this.g = str;
        this.h = str2;
        this.i = e61Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.i;
        switch (i2) {
            case 0:
                hw1 hw1Var = (hw1) obj2;
                Activity activity = (Activity) obj;
                nf0 nf0Var = (nf0) obj3;
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                hw1Var.H3(hw1Var.k, "rtsdc", map);
                activity.startActivity(vc3.C.f.i(activity));
                hw1Var.F3();
                if (nf0Var != null) {
                    nf0Var.y();
                }
                break;
            case 1:
                hw1 hw1Var2 = (hw1) obj2;
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "confirm");
                hw1Var2.H3(hw1Var2.k, "dialog_click", map2);
                hw1Var2.E3((Activity) obj, (nf0) obj3);
                break;
            default:
                e61 e61Var = (e61) obj3;
                DownloadManager downloadManager = (DownloadManager) e61Var.i.getSystemService("download");
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse((String) obj2));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, (String) obj);
                    zb3 zb3Var = vc3.C.c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                } catch (IllegalStateException unused) {
                    e61Var.z("Could not store picture.");
                }
                break;
        }
    }

    public /* synthetic */ gw1(hw1 hw1Var, Activity activity, nf0 nf0Var, int i) {
        this.f = i;
        this.g = hw1Var;
        this.h = activity;
        this.i = nf0Var;
    }
}
