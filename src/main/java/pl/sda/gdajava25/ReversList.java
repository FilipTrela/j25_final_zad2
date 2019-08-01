package pl.sda.gdajava25;


import java.util.List;

public class ReversList<T> {

    public List<T> revers(List<T> list) {
        if (list.size() == 1) {
            return list;
        }
        return reversRecursive(list, 0, list.size() - 1);
    }

    private List<T> reversRecursive(List<T> list, int first, int last) {
        if (first >= last) {
            return list;
        }
        T elemnt = list.get(first);
        list.add(first, list.get(last));
        list.remove(first + 1);
        list.add(last, (T) elemnt);
        list.remove(last+1);

        return reversRecursive(list, first + 1, last - 1);
    }

}