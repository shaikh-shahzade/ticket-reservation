package com.org.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.StandardException;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ApiResponse {
    private String message ;
    private boolean isSuccessfull;
    private HttpStatus httpStatus;
}
