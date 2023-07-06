public class Main {
    public static void main(String[] args) {
        int[] fieldForPacking = {0, 1, 0, 2, 1, 2, 3, 1, 2};
        FieldPacker fp = new FieldPacker();
        fp.packFieldToInt(fieldForPacking);
        FieldUnpacker fu = new FieldUnpacker();
        int[] unpackedField = fu.unpackField();
        for (int number : unpackedField) {
            System.out.print(number + " ");
        }
    }
}