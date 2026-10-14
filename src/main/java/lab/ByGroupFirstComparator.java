package lab;
import java.util.Comparator;

public class ByGroupFirstComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int compFlag = o1.getGrupa().compareTo(o2.getGrupa());
            if (compFlag != 0) {
                return compFlag;
            }
            compFlag = o1.getNume().compareTo(o2.getNume());
            if (compFlag != 0) {
                return compFlag;
            }
            return o1.getPrenume().compareTo(o2.getPrenume());
        }
}

