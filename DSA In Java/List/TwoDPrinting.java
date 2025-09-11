import java.util.ArrayList;
import java.util.List;

public class TwoDPrinting {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);a.add(11);a.add(14);a.add(12);
        List<Integer> b = new ArrayList<>();
        b.add(45); b.add(23); b.add(54); b.add(78);
        List<Integer> c = new ArrayList<>();
        c.add(12);c.add(45);c.add(22);c.add(12-65);
        List<Integer> d = new ArrayList<>();
        d.add(56);d.add(77);d.add(89);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();


        for(List<Integer> lists : list) {
            for(int ele : lists) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
