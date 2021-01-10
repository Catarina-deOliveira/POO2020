package pt.iade.OnlineGoods.models;

public enum ShoppingCartState {

    ON_HOLD(1), PAID(2), SENT(3), DELIVERED(4), ABORTED(5);

    private int state;

    private ShoppingCartState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public static ShoppingCartState valueOf(int state) {
        for (ShoppingCartState value : ShoppingCartState.values()) {
            if (value.getState() == state) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid ShoppingCartState state");
    }
}
