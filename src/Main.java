import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PlayingCard> hand = new ArrayList<>();
        hand.add(new PlayingCard(Suit.HEARTS, Rank.SEVEN));
        hand.add(new PlayingCard(Suit.SPADES, Rank.TEN));
        hand.add(new PlayingCard(Suit.DIAMONDS, Rank.FIVE));
        hand.add(new PlayingCard(Suit.DIAMONDS, Rank.ACE));
        hand.add(new PlayingCard(Suit.CLUBS, Rank.KING));
        hand.add(new PlayingCard(Suit.SPADES, Rank.ACE));
        System.out.println("hand = " + hand);
        //затем вывести отсортированными по масти
        System.out.println("отсортированы по масти:");
        hand.sort(Comparator.comparing(PlayingCard::getSuit));      //ссылка на метод-геттер
        System.out.println(hand);                   //простой способ вывести весь список в строку
        System.out.println("отсортировано по достоинству:");
        hand.sort(Comparator.comparing(a->a.rank));                 //лямбда-выражение, извлекающее поле
        hand.forEach(System.out::println);          //простой способ вывести каждый элемент на отдельной строке
    }
}