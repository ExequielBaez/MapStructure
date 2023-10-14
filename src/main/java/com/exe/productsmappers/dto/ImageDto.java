package com.exe.productsmappers.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
public class ImageDto {

    private Long idImage;

    private byte[] dataImage;
}
