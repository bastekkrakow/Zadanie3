public class main {
    public static void main(String[] args) {

        Game game = new Game("Gra1", 3);
        game.addPlayer(new Player("Sebastian", "Nowak", 999));
        game.addPlayer(new Player("Jan", "Kowalski", 299));
        game.addPlayer(new Player("Adam", "Dembowski", 1999));

        String winner = game.winner();
        if(winner == null){
            System.out.println("Nikt nie wygrał"); //tutaj jakieś seksi okienka
        }else{
            System.out.println("Wygrywa: " + winner);
        }
    }
}