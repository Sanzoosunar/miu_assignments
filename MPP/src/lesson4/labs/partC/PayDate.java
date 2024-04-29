package lesson4.labs.partC;

import java.util.Objects;

public class PayDate {
    private int year;
    private int month;

    PayDate(int year,
            int month){
        this.year = year;
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayDate payDate = (PayDate) o;
        return year == payDate.year && month == payDate.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month);
    }

    @Override
    public String toString() {
        return "PayDate{" +
                "year=" + year +
                ", month=" + month +
                '}';
    }
}
