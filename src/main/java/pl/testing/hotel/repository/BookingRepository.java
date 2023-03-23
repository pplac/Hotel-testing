package pl.testing.hotel.repository;

import pl.testing.hotel.model.entity.Booking;
import pl.testing.hotel.model.entity.RoomStandard;

import java.util.Date;
import java.util.List;

public interface BookingRepository {

    List<Booking> getAllBookingByName(String bookingName);

    List<Booking> getAllBookingByStandardAndPrice(RoomStandard roomStandard, Double price);

    List<Booking> getAllBookingAtThisDay(Date checkDate);



}
