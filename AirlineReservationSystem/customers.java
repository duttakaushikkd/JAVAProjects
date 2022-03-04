package AirlineReservationSystem;

public class customers {

    private int id;
    private String name;
    private String address;
    private String source;
    private String destination;
    private long phone;
    private String customerSource;
    private String customerDestination;
    long flightNumber;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long flightSearch(String source1, String destination1)
    {
        customerSource = source1;
        customerDestination =  destination1;

        if(source==customerSource && destination == customerDestination)
        {
            return flightNumber;
        }

        else
        {
            flightNumber = 0;
            return flightNumber;
        }
    }
}
