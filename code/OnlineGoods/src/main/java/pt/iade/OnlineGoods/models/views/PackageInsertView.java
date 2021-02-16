package pt.iade.OnlineGoods.models.views;

public class PackageInsertView {
    private int packageReference;

    private int packageClientId;

    private int packageProductId;

    private int packagePaymentId;

    public PackageInsertView() {

    }

    public int getPackageReference() {
        return packageReference;
    }

    public void setPackageReference(int packageReference) {
        this.packageReference = packageReference;
    }

    public int getPackageClientId() {
        return packageClientId;
    }

    public void setPackageClientId(int packageClientId) {
        this.packageClientId = packageClientId;
    }

    public int getPackageProductId() {
        return packageProductId;
    }

    public void setPackageProductId(int packageProductId) {
        this.packageProductId = packageProductId;
    }

    public int getPackagePaymentId() {
        return packagePaymentId;
    }

    public void setPackagePaymentId(int packagePaymentId) {
        this.packagePaymentId = packagePaymentId;
    }

}
