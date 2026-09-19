package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p82 implements Comparable {
    public long g = -9223372036854775807L;
    public final ArrayList f = new ArrayList();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.g, ((p82) obj).g);
    }
}
