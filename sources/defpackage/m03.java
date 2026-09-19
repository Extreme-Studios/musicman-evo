package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m03 {
    public static final m03 d = new m03("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new m03("\n", "  ", true);
    }

    public m03(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            j7.p("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            j7.p("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
