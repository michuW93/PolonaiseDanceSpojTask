import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstClass = in.nextInt();
        int secondClass = in.nextInt();
        int thirdClass = in.nextInt();
        int numberOfNamesToBeRead = firstClass + secondClass + thirdClass;


        AtomicInteger girlsNumber = new AtomicInteger();
        AtomicInteger menNumber = new AtomicInteger();

        Stream.generate(in::next)
                .limit(numberOfNamesToBeRead)
                .forEach(name -> {
                    if (name.endsWith("a")) {
                        girlsNumber.getAndIncrement();
                    } else {
                        menNumber.getAndIncrement();
                    }
                });

        System.out.println(Math.min(girlsNumber.intValue(), menNumber.intValue()));
    }

}
