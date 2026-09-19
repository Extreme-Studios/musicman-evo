package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class lq2 extends za2 {
    public final byte[] j;
    public final DatagramPacket k;
    public Uri l;
    public DatagramSocket m;
    public MulticastSocket n;
    public InetAddress o;
    public boolean p;
    public int q;

    public lq2() {
        super(true);
        byte[] bArr = new byte[2000];
        this.j = bArr;
        this.k = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws cq2 {
        Uri uri = eg2Var.a;
        this.l = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.l.getPort();
        b(eg2Var);
        try {
            this.o = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.o, port);
            if (this.o.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.n = multicastSocket;
                multicastSocket.joinGroup(this.o);
                this.m = this.n;
            } else {
                this.m = new DatagramSocket(inetSocketAddress);
            }
            this.m.setSoTimeout(8000);
            this.p = true;
            e(eg2Var);
            return -1L;
        } catch (IOException e) {
            throw new cq2(2001, e);
        } catch (SecurityException e2) {
            throw new cq2(2006, e2);
        }
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws cq2 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.q;
        DatagramPacket datagramPacket = this.k;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.m;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.q = length;
                f(length);
            } catch (SocketTimeoutException e) {
                throw new cq2(2002, e);
            } catch (IOException e2) {
                throw new cq2(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.q;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.j, length2 - i4, bArr, i, iMin);
        this.q -= iMin;
        return iMin;
    }

    @Override // defpackage.oe2
    public final Uri h() {
        return this.l;
    }

    @Override // defpackage.oe2
    public final void l() {
        this.l = null;
        MulticastSocket multicastSocket = this.n;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.o;
                if (inetAddress == null) {
                    throw null;
                }
                multicastSocket.leaveGroup(inetAddress);
                this.n = null;
            } catch (IOException unused) {
            }
        }
        DatagramSocket datagramSocket = this.m;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.m = null;
        }
        this.o = null;
        this.q = 0;
        if (this.p) {
            this.p = false;
            j();
        }
    }
}
