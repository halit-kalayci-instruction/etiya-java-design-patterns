package behavioral.command;

public class BuyCoinCommand implements OrderCommand{
    private Coin coin;

    public BuyCoinCommand(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void execute() {
        this.coin.buy();
    }
}
