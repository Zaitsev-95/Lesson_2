public class task1 {
    public static void main(String[] args) {
        String str = "Если при формировании ветки какой-либо конфликт слияния был разрешён вручную, то Git не сохранит решение данного конфликта в памяти, поэтому при выполнении операции git rebase нужно будет повторно исправить конфликты слияния в ручном режиме.";
        int l = str.length() / 2;
        System.out.println("Колличество символов в строке: " + l);
        String part1 = str.substring(0, l);
        String part2 = str.substring(l);
        System.out.println("");
        System.out.println("Перва половина: " + part1);
        System.out.println("");
        System.out.println("Вторая половина: " + part2);
    }
}