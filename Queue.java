/**
 * Created by ABDULRHMAN ALSHAMI on 25/03/2022.
 */
public interface Queue <E>{
    boolean isEmpty();
    int size();
    void enqueue(E e);
    E dequeue();
    E front();
}
