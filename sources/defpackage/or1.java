package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class or1 {
    public final es1 a;

    public or1(es1 es1Var) {
        this.a = es1Var;
    }

    public final boolean a(qb2 qb2Var) {
        boolean zK = qb2Var.K();
        sc3 sc3Var = sc3.f;
        es1 es1Var = this.a;
        if (zK) {
            us2 us2VarA = es1Var.a();
            us2VarA.s("action", "aq_ad_closed");
            us2VarA.s("gqi", qb2Var.C());
            us2VarA.s("aq_ad_duration", String.valueOf(qb2Var.D()));
            us2VarA.s("aq_ad_bounce_cnt", String.valueOf(qb2Var.E()));
            us2VarA.s("aq_time_away", String.valueOf(qb2Var.H()));
            return us2VarA.v().equals(sc3Var);
        }
        us2 us2VarA2 = es1Var.a();
        us2VarA2.s("action", "aq_ad_kill");
        us2VarA2.s("gqi", qb2Var.C());
        us2VarA2.s("aq_ad_duration", String.valueOf(qb2Var.D()));
        us2VarA2.s("aq_ad_bounce_cnt", String.valueOf(qb2Var.E()));
        us2VarA2.s("aq_time_away", String.valueOf(qb2Var.H()));
        us2VarA2.s("aq_is_os_kill", String.valueOf(qb2Var.G()));
        return us2VarA2.v().equals(sc3Var);
    }
}
