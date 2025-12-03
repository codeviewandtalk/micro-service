package com.cvt.users.model;

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


}
