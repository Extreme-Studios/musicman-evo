package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nf2 extends pf2 {
    public final /* synthetic */ int f = 0;
    public final Map g;
    public final Object h;
    public final Object i;

    public nf2(hp0 hp0Var, cf2 cf2Var, Map map, DisplayMetrics displayMetrics, dh2 dh2Var) {
        super("gbI2a8ruQFsh7iJbKP5csiDrRqRaAG+o51RWglq6SF+q1HNUXOxpmDRR6GgQlE1Z", "C7gHksN/1NwyNvzCHdeBzJsOxB75cHtIeny2v2KpeXA=", hp0Var, cf2Var, dh2Var.a(123));
        this.h = cf2Var;
        this.g = map;
        this.i = displayMetrics;
    }

    @Override // defpackage.pf2
    public final void a(Method method, hp0 hp0Var) {
        Object[] objArr;
        boolean z = true;
        switch (this.f) {
            case 0:
                dd2 dd2Var = (dd2) this.h;
                Integer numValueOf = Integer.valueOf(dd2Var.ordinal());
                Context context = (Context) this.i;
                Object obj = this.g.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj == null) {
                    obj = bool;
                }
                Object[] objArr2 = (Object[]) method.invoke("", numValueOf, context, obj);
                objArr2.getClass();
                synchronized (hp0Var) {
                    try {
                        if (dd2Var == dd2.f) {
                            Object obj2 = objArr2[0];
                            Object obj3 = -1L;
                            if (obj2 == null) {
                                obj2 = obj3;
                            }
                            long jLongValue = ((Long) obj2).longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).A(jLongValue);
                            Object obj4 = objArr2[1];
                            long jLongValue2 = ((Long) (obj4 != null ? obj4 : -1L)).longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).B(jLongValue2);
                        }
                        long jLongValue3 = ((Long) objArr2[2]).longValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).J0(jLongValue3);
                        long jLongValue4 = ((Long) objArr2[3]).longValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).a0(jLongValue4);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                Map map = this.g;
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.i;
                Object[] objArr3 = (Object[]) method.invoke("", motionEvent, displayMetrics);
                objArr3.getClass();
                op0 op0VarZ = pp0.z();
                Object obj5 = objArr3[0];
                if (obj5 != null && objArr3[1] != null) {
                    long jLongValue5 = ((Long) obj5).longValue();
                    op0VarZ.b();
                    ((pp0) op0VarZ.g).A(jLongValue5);
                    long jLongValue6 = ((Long) objArr3[1]).longValue();
                    op0VarZ.b();
                    ((pp0) op0VarZ.g).B(jLongValue6);
                }
                Object obj6 = objArr3[2];
                if (obj6 != null) {
                    long jLongValue7 = ((Long) obj6).longValue();
                    op0VarZ.b();
                    ((pp0) op0VarZ.g).H(jLongValue7);
                }
                Object obj7 = objArr3[3];
                if (obj7 != null) {
                    long jLongValue8 = ((Long) obj7).longValue();
                    op0VarZ.b();
                    ((pp0) op0VarZ.g).F(jLongValue8);
                }
                Object obj8 = objArr3[4];
                if (obj8 != null) {
                    long jLongValue9 = ((Long) obj8).longValue();
                    op0VarZ.b();
                    ((pp0) op0VarZ.g).C(jLongValue9);
                }
                Object obj9 = objArr3[5];
                if (obj9 != null) {
                    int i = ((Long) obj9).longValue() != 0 ? 2 : 1;
                    op0VarZ.b();
                    ((pp0) op0VarZ.g).S(i);
                }
                Object obj10 = objArr3[6];
                if (obj10 != null) {
                    long jLongValue10 = ((Long) obj10).longValue();
                    op0VarZ.b();
                    ((pp0) op0VarZ.g).J(jLongValue10);
                }
                Object obj11 = objArr3[7];
                if (obj11 != null) {
                    long jLongValue11 = ((Long) obj11).longValue();
                    op0VarZ.b();
                    ((pp0) op0VarZ.g).I(jLongValue11);
                }
                Object obj12 = objArr3[8];
                if (obj12 != null) {
                    int i2 = ((Long) obj12).longValue() != 0 ? 2 : 1;
                    op0VarZ.b();
                    ((pp0) op0VarZ.g).T(i2);
                }
                synchronized (hp0Var) {
                    try {
                        Method methodB = ((cf2) this.h).b("TJcXhplO1c7oeAIzyyjGCjnhXIAfNaFNWGhya9KHb9++zv8J1h9atpUrZL1Yjg6v", "v7ewhEi0QRfAHjcos6RExS5aIOB6pcbb0aW+P30gIsQ=");
                        if (methodB == null || (objArr = (Object[]) methodB.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                            throw null;
                        }
                        Object obj13 = objArr[0];
                        if (obj13 != null) {
                            long jLongValue12 = ((Long) obj13).longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).K0(jLongValue12);
                        }
                        Object obj14 = objArr[1];
                        if (obj14 != null) {
                            long jLongValue13 = ((Long) obj14).longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).L0(jLongValue13);
                        }
                        Object obj15 = objArr[2];
                        if (obj15 != null) {
                            long jLongValue14 = ((Long) obj15).longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).M0(jLongValue14);
                        }
                        Object obj16 = objArr[3];
                        if (obj16 != null) {
                            long jLongValue15 = ((Long) obj16).longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).F(jLongValue15);
                        }
                        Object obj17 = objArr[4];
                        if (obj17 != null) {
                            long jLongValue16 = ((Long) obj17).longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).G(jLongValue16);
                        }
                        le2 le2Var = (le2) map.get("oe");
                        if (le2Var != null) {
                            long j = le2Var.a;
                            if (j > 0) {
                                hp0Var.b();
                                ((sp0) hp0Var.g).J(j);
                            }
                            long j2 = le2Var.b;
                            if (j2 > 0) {
                                hp0Var.b();
                                ((sp0) hp0Var.g).I(j2);
                            }
                            long j3 = le2Var.c;
                            if (j3 > 0) {
                                hp0Var.b();
                                ((sp0) hp0Var.g).H(j3);
                            }
                            long j4 = le2Var.d;
                            if (j4 > 0) {
                                hp0Var.b();
                                ((sp0) hp0Var.g).K(j4);
                            }
                        }
                        le2 le2Var2 = (le2) map.get("oe");
                        if (le2Var2 != null && le2Var2.a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                double d = le2Var2.g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long jRound = Math.round(d / ((double) displayMetrics.density));
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).L(jRound);
                                long jRound2 = Math.round(((double) (le2Var2.j - le2Var2.h)) / ((double) displayMetrics.density));
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).M(jRound2);
                                long jRound3 = Math.round(((double) (le2Var2.k - le2Var2.i)) / ((double) displayMetrics.density));
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).N(jRound3);
                                long jRound4 = Math.round(((double) le2Var2.h) / ((double) displayMetrics.density));
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).Q(jRound4);
                                long jRound5 = Math.round(((double) le2Var2.i) / ((double) displayMetrics.density));
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).R(jRound5);
                                MotionEvent motionEvent2 = (MotionEvent) map.get("nv");
                                if (motionEvent2 != null) {
                                    long jRound6 = Math.round(((double) (((le2Var2.h - le2Var2.j) + motionEvent2.getRawX()) - motionEvent2.getX())) / ((double) displayMetrics.density));
                                    if (jRound6 != 0) {
                                        op0VarZ.b();
                                        ((pp0) op0VarZ.g).O(jRound6);
                                    }
                                    long jRound7 = Math.round(((double) (((le2Var2.i - le2Var2.k) + motionEvent2.getRawY()) - motionEvent2.getY())) / ((double) displayMetrics.density));
                                    if (jRound7 != 0) {
                                        op0VarZ.b();
                                        ((pp0) op0VarZ.g).P(jRound7);
                                    }
                                }
                            }
                        }
                        hp0Var.b();
                        ((sp0) hp0Var.g).S((pp0) op0VarZ.c());
                        me2[] me2VarArr = (me2[]) map.get("ro");
                        if (me2VarArr != null) {
                            if (displayMetrics == null || displayMetrics.density == 0.0f) {
                                z = false;
                            }
                            if (z) {
                                for (int i3 = 0; i3 <= me2VarArr.length - 2; i3++) {
                                    me2 me2Var = me2VarArr[i3];
                                    op0 op0VarZ2 = pp0.z();
                                    double d2 = me2Var.a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long jRound8 = Math.round(d2 / ((double) displayMetrics.density));
                                    op0VarZ2.b();
                                    ((pp0) op0VarZ2.g).A(jRound8);
                                    long jRound9 = Math.round(((double) me2Var.b) / ((double) displayMetrics.density));
                                    op0VarZ2.b();
                                    ((pp0) op0VarZ2.g).B(jRound9);
                                    pp0 pp0Var = (pp0) op0VarZ2.c();
                                    hp0Var.b();
                                    ((sp0) hp0Var.g).T(pp0Var);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public nf2(hp0 hp0Var, cf2 cf2Var, dd2 dd2Var, Context context, Map map, dh2 dh2Var) {
        super("3U4DEAJT9Pq66npH/ZEsiPizUaU6oaGuzbq27Rp3Iz/R6ssq6OsViFqc+1XsG+SQ", "oHImj5OTIs8LNvX9EwNQkQ3bSJ9XioOM1m8VTLsnF8I=", hp0Var, cf2Var, dh2Var.a(121));
        this.h = dd2Var;
        this.i = context;
        this.g = map;
    }
}
