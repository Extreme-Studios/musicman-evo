package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class j32 implements r63 {
    public final /* synthetic */ int a;
    public final e3 b;

    public /* synthetic */ j32(e3 e3Var, int i) {
        this.a = i;
        this.b = e3Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Integer a() {
        Bundle bundle = ((r71) this.b.h).f.getBundle("extras");
        int i = -1;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        i = 0;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        i = 1;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        i = 2;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        i = 3;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        i = 4;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        i = 5;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        i = 6;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        i = 7;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        i = 8;
                    }
                    break;
            }
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        e3 e3Var = this.b;
        switch (i) {
            case 0:
                String str = ((r71) e3Var.h).i;
                dq.D(str);
                return str;
            case 1:
                return Integer.valueOf(e3Var.g);
            case 2:
                return Boolean.valueOf(((r71) e3Var.h).q);
            case 3:
                return Boolean.valueOf(((r71) e3Var.h).p);
            case 4:
                String str2 = ((r71) e3Var.h).m;
                dq.D(str2);
                return str2;
            case 5:
                return a();
            default:
                return Integer.valueOf(((r71) e3Var.h).t);
        }
    }
}
