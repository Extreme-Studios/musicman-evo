package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xx1 {
    public final String a;
    public final ArrayList b;
    public final Set c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final int g;
    public final Set h;
    public final Bundle i;
    public final Set j;
    public final boolean k;
    public final int l;
    public long m = 0;

    public xx1(i6 i6Var) {
        this.a = (String) i6Var.j;
        this.b = (ArrayList) i6Var.k;
        this.c = Collections.unmodifiableSet((HashSet) i6Var.d);
        this.d = (Bundle) i6Var.e;
        Collections.unmodifiableMap((HashMap) i6Var.f);
        this.e = (String) i6Var.l;
        this.f = (String) i6Var.m;
        this.g = i6Var.a;
        this.h = Collections.unmodifiableSet((HashSet) i6Var.g);
        this.i = (Bundle) i6Var.h;
        this.j = Collections.unmodifiableSet((HashSet) i6Var.i);
        this.k = i6Var.b;
        this.l = i6Var.c;
    }
}
