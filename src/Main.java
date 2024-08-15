public class Main {
    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();

        ConsolePrinter.Message message1 = new ConsolePrinter.Message("Привіт!", "Сергій");
        printer.print(message1);

        ConsolePrinter.Message message2 = new ConsolePrinter.Message("Привіт!", null);
        printer.print(message2);

        ConsolePrinter.Message message3 = new ConsolePrinter.Message(null, null);
        printer.print(message3);

    }
}
