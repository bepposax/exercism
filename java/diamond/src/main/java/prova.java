public class prova {
    public static void main(String[] args) {
        DiamondPrinter diamondPrinter = new DiamondPrinter();
        for (String line : (diamondPrinter.printToList('Z'))) {
            System.out.println(line);
        }
    }
}