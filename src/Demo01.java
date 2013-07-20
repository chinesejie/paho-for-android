public class Demo01 {
    public static void main(String[] args) {
        final int maxLevel = 5;
        
        for (int i = 0; i < maxLevel; ++i) {
            for (int j = 0; j < maxLevel-i - 1; ++j)
                System.out.print(" ");
            for (int j = 0; j < i*2 + 1; ++j)
                if (i == maxLevel/2)
                    System.out.print("#");
                else
                    System.out.print("*");
            System.out.println();
        }
        
    }
}