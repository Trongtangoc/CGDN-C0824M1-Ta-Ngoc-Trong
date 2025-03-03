import java.util.List;

public interface IManager<T> {
    List<T> getAll();
    void add(T t);
    void writeCSV();
    List<T> readCSV();
}
