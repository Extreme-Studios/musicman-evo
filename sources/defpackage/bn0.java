package defpackage;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class bn0 {
    public static final Logger b = Logger.getLogger(bn0.class.getName());
    public final bi a = new bi(1);

    /* JADX WARN: Multi-variable type inference failed */
    public final dn0 a(lk lkVar, k63 k63Var) throws EOFException {
        int iF;
        long jLimit;
        dn0 gn0Var;
        dn0 dn0Var;
        long jG = lkVar.g();
        ByteBuffer byteBuffer = (ByteBuffer) lkVar.g;
        bi biVar = this.a;
        ((ByteBuffer) biVar.get()).rewind().limit(8);
        do {
            iF = lkVar.f((ByteBuffer) biVar.get());
            if (iF == 8) {
                ((ByteBuffer) biVar.get()).rewind();
                long jX = s90.x((ByteBuffer) biVar.get());
                if (jX < 8 && jX > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jX);
                    sb.append("). Stop parsing!");
                    b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) biVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jX == 1) {
                        ((ByteBuffer) biVar.get()).limit(16);
                        lkVar.f((ByteBuffer) biVar.get());
                        ((ByteBuffer) biVar.get()).position(8);
                        jLimit = s90.S((ByteBuffer) biVar.get()) - 16;
                    } else {
                        jLimit = jX == 0 ? ((long) byteBuffer.limit()) - lkVar.g() : jX - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) biVar.get()).limit(((ByteBuffer) biVar.get()).limit() + 16);
                        lkVar.f((ByteBuffer) biVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) biVar.get()).position() - 16; iPosition < ((ByteBuffer) biVar.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) biVar.get()).position() - 16)] = ((ByteBuffer) biVar.get()).get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j = jLimit;
                    if (k63Var instanceof dn0) {
                    }
                    if (!"moov".equals(str)) {
                        if ("mvhd".equals(str)) {
                            fn0 fn0Var = new fn0("mvhd");
                            fn0Var.s = 1.0d;
                            fn0Var.t = 1.0f;
                            fn0Var.u = n63.j;
                            dn0Var = fn0Var;
                        } else {
                            gn0Var = new gn0(str, 0);
                        }
                        ((ByteBuffer) biVar.get()).rewind();
                        dn0Var.a(lkVar, (ByteBuffer) biVar.get(), j, this);
                        return dn0Var;
                    }
                    gn0Var = new en0();
                    dn0Var = gn0Var;
                    ((ByteBuffer) biVar.get()).rewind();
                    dn0Var.a(lkVar, (ByteBuffer) biVar.get(), j, this);
                    return dn0Var;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iF >= 0);
        byteBuffer.position((int) jG);
        throw new EOFException();
    }
}
