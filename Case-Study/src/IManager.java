import java.util.List;

public interface IManager<T> {
    List<T> getList();
    void add(T t);
    void update(T t);
    void remove(T t);
    void search(T t);
    void sort(List<T> list);
    void writeCSV();
    List<T> readCSV();
    void clear();
}

