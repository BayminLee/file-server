package com.liming.file.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Liming
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileUploadResponse {
    private String urlHttp;

    private String urlPath;
}
