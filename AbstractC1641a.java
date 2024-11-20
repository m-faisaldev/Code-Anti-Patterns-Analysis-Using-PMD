package a0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1641a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f13974a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13975b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected AbstractC1641a(IBinder iBinder, String str) {
        this.f13974a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13974a;
    }

    protected final Parcel h() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13975b);
        return obtain;
    }

    protected final Parcel i(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f13974a.transact(i8, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e8) {
                obtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }
}