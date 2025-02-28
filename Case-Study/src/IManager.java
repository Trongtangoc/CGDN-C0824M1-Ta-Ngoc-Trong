public interface IManager<T> {
//    List<T> getList();

    void add(T t);

    void writeCSV();

//    List<T> readCSV();

    void remove(T t);

    void clear();
}
