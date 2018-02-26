public class Game {
    private String name;
    private Player[] players;

    public Game(String name, int maxPlayers) {
        this.name = name;
        this.players = new Player[maxPlayers];
    }

    public void addPlayer(Player player){
        for (int i = 0; i < players.length; i++) {
            if(players[i] == null){
                players[i] = player;
                break;
            }
        }
    }

    public String winner(){
        Player winnerPlayer = players[0];
        for (Player player : players) {
            if(player.getPoints() > winnerPlayer.getPoints()){
                winnerPlayer = player;
            }
        }
        if(winnerPlayer.getPoints() >  100){
            return winnerPlayer.fullName();
        }
        return null;
    }

    public String getName() {
        return name;
    }
}