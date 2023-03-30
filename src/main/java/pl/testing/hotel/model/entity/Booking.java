package pl.testing.hotel.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

//@Getter
//@Setter
//@NoArgsConstructor //konstruktor bez parametrów
//@AllArgsConstructor  //konstruktor z 1 parametrem dla każdego pola
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "booking_name")
    private String bookingName;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "number_of_people")
    private int numberOfPeople;

    @Column(name = "standard")
    private RoomStandard roomStandard;

    @Column(name = "price")
    private Double price;

    @Column(name = "booking_start")
    private Date bookingStart;

    @Column(name = "booking_stop")
    private Date bookingStop;


    public static BookingBuilder builder() {
        return new BookingBuilder();
    }

    public static class BookingBuilder {

        private long id;
        private String bookingName;
        private String hotelName;
        private int numberOfPeople;
        private RoomStandard roomStandard;
        private Double price;
        private Date bookingStart;
        private Date bookingStop;



        public BookingBuilder setBookingName(final String bookingName) {
            this.bookingName = bookingName;
            return this;
        }

        public BookingBuilder setHotelName (final String hotelName) {
            this.hotelName = hotelName;
            return this;
        }

        public BookingBuilder setNumberOfPeople(final int numberOfPeople) {
            this.numberOfPeople = numberOfPeople;
            return this;
        }

        public BookingBuilder setRoomStandard(final RoomStandard roomStandard) {
            this.roomStandard = roomStandard;
            return this;
        }

        public BookingBuilder setPrice(final Double price) {
            this.price = price;
            return this;
        }

        public BookingBuilder setBookingStart(final Date bookingStart) {
            this.bookingStart = bookingStart;
            return this;
        }

        public BookingBuilder setBookingStop(final Date bookingStop) {
            this.bookingStop = bookingStop;
            return this;
        }

        public

    }

}
