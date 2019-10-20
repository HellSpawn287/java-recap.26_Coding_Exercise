public class FlourPacker {

    public static boolean canBePacked(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sumKilos = (bigCount * 5) + smallCount;
        if (sumKilos >= goal) {
            if (bigCount == 0) {
                if ((goal <= smallCount)) {
                    return true;
                }
            } else if (((goal % 5) <= smallCount) || (goal >= bigCount * 5)) {
                return true;
            } else if (((goal % 5) == 0)) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("false " + canBePacked(1, 0, 4));
        System.out.println("true " + canBePacked(1, 0, 5));
        System.out.println(">>>true " + canBePacked(2, 1, 5));
        System.out.println(">>> false " + canBePacked(1, 0, 6));
        System.out.println("true " + canBePacked(0, 5, 4));
        System.out.println("false " + canBePacked(1, 5, 4));
        System.out.println("false " + canBePacked(-3, 2, 17));
        System.out.println("true " + canBePacked(0, 2, 0));
        System.out.println(">>>true " + canBePacked(2, 2, 12));
        System.out.println(">>>true " + canBePacked(2, 10, 18));
        System.out.println(">>>true " + canBePacked(4, 19, 18));
    }
}
