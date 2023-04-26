package Calculate;

class RomeNum extends Num {
    private final static String[] LARGEROMAN = {"0","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
    private final static String[] ROMAN = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X"};
    private String romanResult;

    public RomeNum(String num1, String num2) {
        super(toInt(num1), toInt(num2));
    }

    private static int toInt(String roman){
        int i =0;
        while (!roman.equals(ROMAN[i])) {
            i++;
        }
        return i;
    }
    public void toRoman () {
        if (res == 100) {
            romanResult = "C";
            return;
        }
        int units = res % 10;
        int large = (res - units)/10;
        String romanUnits = ROMAN[units];
        String romanLarge = LARGEROMAN[large];
        romanResult = romanLarge + romanUnits;
        if (large == 0) {
            romanResult = romanUnits;
            return;
        }
        if (units==0){
            romanResult = romanLarge;
            return;
        }
    }
    public String getStringResult () {
        return romanResult;
    }
    public static String[] getRoman() {
        return ROMAN;
    }
}
