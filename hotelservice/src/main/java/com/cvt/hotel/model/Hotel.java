package com.cvt.hotel.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="hotels")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    @Id
    private String id;
    private String name;
    private String location;
    private String about;

}
