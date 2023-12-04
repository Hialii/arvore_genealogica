public interface Amontoavel<T> {
   void insert(T person);

   // void remove(T person);
   // List<T> visualization();
   // T search(String person);
   // T detail(T person);
   // T verify(T person);

   String print();

   boolean isEmpty();

   boolean isFull();
}