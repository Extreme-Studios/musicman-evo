package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum b92 {
    g("definedByJavaScript"),
    h("unspecified"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("loaded"),
    i("beginToRender"),
    j("onePixel"),
    /* JADX INFO: Fake field, exist only in values array */
    EF65("viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    EF75("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    EF85("other");

    public final String f;

    b92(String str) {
        this.f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
