package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String name;
    LabStatus labStatus;
    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.name = labName;
        this.labStatus = LabStatus.PENDING;
    }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
