package behavioral.command;

public class SellCoinCommand implements OrderCommand{
    private Coin coin;

    public SellCoinCommand(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void execute() {
        this.coin.sell();
    }
}
