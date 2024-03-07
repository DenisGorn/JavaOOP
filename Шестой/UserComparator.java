/*
Класс в целом соответствует принципам SOLID:
выполняет одну задачу (сравнение пользователей по Фио), содержит единственный интерфейс и не зависит от других классов
 */

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getMiddleName().compareTo(o2.getMiddleName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
