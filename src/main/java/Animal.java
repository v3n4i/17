import java.util.Scanner;
public class Animal {
    public static void main(String [] args){
        String sprs = " ";
        Scanner a1 = new Scanner(System.in);
        System.out.println("Привет, введите ваш вораст");
        int s1 = a1.nextInt();
        System.out.println("Вы ввели возраст в годах " + s1);
        Scanner a2 = new Scanner(System.in);
        System.out.println("Хорошо, введите ваш вес");
        int s2 = a2.nextInt();
        System.out.println("Отлично, ваш вес, кг "+s2);
        Scanner a3 = new Scanner(System.in);
        System.out.println("И наконец введите ваш рост, см");
        int s3 = a3.nextInt();
        System.out.println("Отлично, ваш рост "+ s3);
        Scanner a4 = new Scanner(System.in);
        System.out.println("А теперь финальный штрих, как же вас зовут?");
        String s4 = a4.nextLine();
        System.out.println("Отлично! Это означает что вас зовут "+s4+". Вам "+s1+" лет. "+ "Вы весите "+s2+" кг."+ " А ваш рост равен "+s3+" см.");
    }
}
