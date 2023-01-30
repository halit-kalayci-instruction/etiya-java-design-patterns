package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.name = "BTC";

        SellCoinCommand sellCommand = new SellCoinCommand(coin);
        BuyCoinCommand buyCommand = new BuyCoinCommand(coin);

        Broker broker = new Broker();
        broker.addCommand(sellCommand);
        broker.addCommand(buyCommand);
        broker.executeAll();
    }
}
