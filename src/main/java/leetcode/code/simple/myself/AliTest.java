package leetcode.code.simple.myself;

public class AliTest {

    public static void main(String[] args) {
        AliTest aliTest = new AliTest();
        int[] aa = {0,0,0,0,0,0,0,1,0 ,2,2,1,2,2,2, 0, 0,2,1,1,1,1,1,2,2,0,0,0,0,0,0,0,};
        aliTest.demo(aa);
        System.out.println(aa);
    }


    public int[] demo(int[] aa) {

        int beforeIndex = 0;
        int afterIndex = aa.length - 1;
        int middle = 0;
        int index = 0;

        while (index < aa.length  &&  afterIndex >= index) {
            if (aa[index] == 0) {
                if (beforeIndex == index) {
                    index++;
                    continue;
                } else {
                    middle = aa[beforeIndex];
                    aa[beforeIndex] = aa[index];
                    aa[index] = middle;
                }
                if (middle != 1) {
                    beforeIndex++;
                    continue;
                } else {
                    index++;
                    beforeIndex++;
                    continue;
                }
            }
            if (aa[index] == 2) {
                if (afterIndex == index) {
                    index++;
                    continue;
                } else {
                    middle = aa[afterIndex];
                    aa[afterIndex] = aa[index];
                    aa[index] = middle;
                }
                if (middle != 1) {
                    afterIndex--;
                    continue;
                } else {
                    index++;
                    beforeIndex--;
                    continue;
                }
            }
            index++;
            System.out.println(aa.toString());
        }
        return aa;
    }
}
