
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

  public int differenceInYears(MyDate compared) {
			double yearDiff = 0;
			if(this.year > compared.year) {
				yearDiff +=((this.year * 365) +(this.month * 30) + (this.day)) - ((compared.year * 365) + (compared.month * 30) + compared.day);
			} else if(compared.year > this.year) {
				yearDiff +=((compared.year * 365) +(compared.month * 30) + (compared.day)) - ((this.year * 365) + (this.month * 30) + this.day);
			}
			yearDiff = yearDiff / 365;
				
			return (int) yearDiff;
			
		}
}
