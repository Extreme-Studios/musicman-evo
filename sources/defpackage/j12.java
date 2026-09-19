package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class j12 implements j22 {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final Bundle c;
    public final String d;

    public j12(String str, Bundle bundle, String str2) {
        this.b = str;
        this.c = bundle;
        this.d = str2;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        int i = this.a;
        Bundle bundle = this.c;
        String str = this.d;
        String str2 = this.b;
        switch (i) {
            case 0:
                Bundle bundle2 = ((rj1) obj).a;
                bundle2.putString("consent_string", str2);
                bundle2.putString("fc_consent", str);
                if (bundle != null) {
                    bundle2.putBundle("iab_consent_info", bundle);
                }
                break;
            default:
                Bundle bundle3 = ((rj1) obj).a;
                bundle3.putString("rtb", str2);
                if (((Boolean) tu0.e.c.a(lx0.C4)).booleanValue() && !str.isEmpty()) {
                    bundle3.putString("cld_status", str);
                }
                if (!bundle.isEmpty()) {
                    bundle3.putBundle("adapter_initialization_status", bundle);
                }
                break;
        }
    }

    public /* synthetic */ j12(String str, String str2, Bundle bundle) {
        this.b = str;
        this.d = str2;
        this.c = bundle;
    }
}
