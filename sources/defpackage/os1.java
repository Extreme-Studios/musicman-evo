package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class os1 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    public final synchronized void a(int i, long j, long j2) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l;
        try {
            ix0 ix0Var = lx0.l8;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                ns1 ns1Var = new ns1(i, j);
                if (i == 0) {
                    iIntValue = 0;
                } else if (i == 1) {
                    iIntValue = ((Integer) tu0Var.c.a(lx0.r8)).intValue();
                } else if (i == 2) {
                    iIntValue = ((Integer) tu0Var.c.a(lx0.s8)).intValue();
                } else if (i != 3) {
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) tu0Var.c.a(lx0.t8)).intValue();
                }
                if (iIntValue > 0) {
                    ConcurrentHashMap concurrentHashMap = this.a;
                    ArrayDeque arrayDeque2 = (ArrayDeque) concurrentHashMap.get(ns1Var);
                    if (arrayDeque2 == null) {
                        arrayDeque2 = new ArrayDeque();
                        concurrentHashMap.put(ns1Var, arrayDeque2);
                    }
                    arrayDeque2.addLast(Long.valueOf(j2));
                    while (arrayDeque2.size() > iIntValue) {
                        arrayDeque2.removeFirst();
                    }
                    b();
                    int iIntValue2 = ((Integer) tu0.e.c.a(lx0.u8)).intValue();
                    if (iIntValue2 <= 0) {
                        concurrentHashMap.clear();
                        return;
                    }
                    while (true) {
                        Iterator it = concurrentHashMap.values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((ArrayDeque) it.next()).size();
                        }
                        if (size <= iIntValue2) {
                            break;
                        }
                        if (!concurrentHashMap.isEmpty()) {
                            Long l2 = Long.MAX_VALUE;
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                                ArrayDeque arrayDeque3 = (ArrayDeque) entry2.getValue();
                                if (!arrayDeque3.isEmpty() && (l = (Long) arrayDeque3.peekFirst()) != null && l.longValue() < l2.longValue()) {
                                    entry = entry2;
                                    l2 = l;
                                }
                            }
                            if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    concurrentHashMap.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    public final void b() {
        long jLongValue;
        vc3.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ns1 ns1Var = (ns1) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int i = ns1Var.b;
            if (i == 0) {
                jLongValue = 0;
            } else if (i == 1) {
                jLongValue = ((Long) tu0.e.c.a(lx0.o8)).longValue();
            } else if (i == 2) {
                jLongValue = ((Long) tu0.e.c.a(lx0.p8)).longValue();
            } else if (i != 3) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) tu0.e.c.a(lx0.q8)).longValue();
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
