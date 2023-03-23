package pl.testing.hotel.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor //konstruktor bez parametrów
@AllArgsConstructor  //konstruktor z 1 parametrem dla każdego pola
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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


    public static class BookingBuilder {

        private String bookingName;
        private String hotelName;
        private int numberOfPeople;
        private RoomStandard roomStandard;
        private Double price;
        private Date bookingStart;
        private Date bookingStop;



        public BookingBuilder set


    }

}
