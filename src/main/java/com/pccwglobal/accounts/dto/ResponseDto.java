package com.pccwglobal.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Object that contains the response"
)
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status code of the response",
            example = "200"
    )
    private String statusCode;

    @Schema(
            description = "Status message of the response",
            example = "Successful Request"
    )
    private String statusMessage;

}
