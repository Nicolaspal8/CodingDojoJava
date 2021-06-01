
public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMundo

        StringManipulator manipulatorr = new StringManipulator();
        char letter = 'n';
        int a = manipulatorr.getIndexOrNull("Coding", letter);
        int b = manipulatorr.getIndexOrNull("Hola Mundo", letter);
        int c = manipulatorr.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1



        StringManipulator manipulatorrr = new StringManipulator();
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int d = manipulatorrr.getIndexOrNull(word, subString);
        int e = manipulatorrr.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // -1



        StringManipulator manipulatorrrr = new StringManipulator();
        String wordd = manipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(wordd); // olmundo

    }
    
}
