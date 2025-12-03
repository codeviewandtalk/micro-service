package com.cvt.rating.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@Table(name="rating")
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    private String ratingId;
    private String hotelId;
    private String userId;
    private int rating;
    private String feedback;

}
