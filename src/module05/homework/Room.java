package module05.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;


    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + price;
        result = 31 * result + persons;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    public boolean equalsHotelName(Room room) {
        if (hotelName != room.hotelName) {
            if (room.hotelName != null) {
            return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Room room = (Room) obj;
        if (price != room.price) {
            if (room.price != 0) {
                return false;
            }
        }
        if (persons != room.persons) {
            if (room.persons != 0) {
                return false;
            }
        }
        if (!cityName.equals(room.cityName)) {
            if (room.cityName == null) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\n" + "Room{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
