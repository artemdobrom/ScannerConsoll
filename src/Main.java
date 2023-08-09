import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //создание сканера для считывание информации с КОНСОЛИ
        Scanner s = new Scanner(System.in);
        //назвали сканер, создали НОВЫЙ объект и задали входной поток
        System.out.println("Привет, напиши что-нибудь");//сообщение для консоли, что бы могли ответить
        String otvet = s.nextLine();// теперь в "otvet" будет храниться информации (букв, потому что Line), которую напишут в консоли
        //программа работает и будет ждать, пока в консоли не напишут что-то в ответ
        System.out.println("ответили в консоли:"+otvet);

        //так же можно задавать и целочисленные варианты, потому что Int и хранить в информацию переменной "answer"
        System.out.println("сколько тебе лет?");
        int answer = s.nextInt();
        System.out.println("ответил в консоли:" + answer);
    }
}