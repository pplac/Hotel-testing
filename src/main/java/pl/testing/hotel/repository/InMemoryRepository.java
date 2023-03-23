package pl.testing.hotel.repository;

import pl.testing.hotel.model.entity.Booking;
import pl.testing.hotel.model.entity.RoomStandard;

import java.util.Date;
import java.util.List;

public class InMemoryRepository implements BookingRepository{


    @Override
    public List<Booking> getAllBookingByName(String bookingName) {
        return null;
    }

    @Override
    public List<Booking> getAllBookingByStandardAndPrice(RoomStandard roomStandard, Double price) {
        return null;
    }

    @Override
    public List<Booking> getAllBookingAtThisDay(Date checkDate) {
        return null;
    }
}
