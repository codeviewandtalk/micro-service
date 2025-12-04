package com.cvt.users.model;

import com.cvt.users.external.service.HotelService;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {

    private String ratingId;
    private String hotelId;
    private String userId;
    private int rating;
    private String feedback;
    private Hotel hotel;


}
