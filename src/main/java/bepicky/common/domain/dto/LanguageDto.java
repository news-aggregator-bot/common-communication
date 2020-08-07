package bepicky.common.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LanguageDto {

    @NotBlank
    private String lang;

    @NotBlank
    private String name;

    @NotBlank
    private String localized;
}
