
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof LicensePlate)){
            return true;
        }

        LicensePlate comparedPlate = (LicensePlate) obj;

        if (this.liNumber.equals(comparedPlate.liNumber)
        && this.country.equals(comparedPlate.country)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result= 31 * result + liNumber.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
