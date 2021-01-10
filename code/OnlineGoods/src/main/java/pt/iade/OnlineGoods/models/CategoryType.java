package pt.iade.OnlineGoods.models;

public enum CategoryType {

    BOOK(1), COMPUTER(2);

    private int type;

    private CategoryType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
