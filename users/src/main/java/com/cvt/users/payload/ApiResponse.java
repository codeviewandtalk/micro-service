package com.cvt.users.payload;

import lombok.*;
import org.springframework.http.HttpStatus;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

    private String message;
    private boolean success;
    private HttpStatus status;
}
