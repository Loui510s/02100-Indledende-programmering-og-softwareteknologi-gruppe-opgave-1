public class UltimateQuestion {
    /* For at finde værdien af x så udtrykket giver 42 skal det først isolere for x
     * først regnes det sammen 
     * 1+3+5x+5/4*2=42
     * 4+5x+2=42
     * 5x=36
     * x=7,2
     * Det kan nu ses at x=7,2 for at den skal printe 42, 
     * det sættes den til som en type double
     */
    public static void main(String[] args) {
        double x = 7.2;
        System.out.println(1 + 3 + x + x + x + x + x + 5 / 4 * 2);
    }
}  