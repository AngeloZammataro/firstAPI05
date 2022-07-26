package it2.develhope.firstAPI05.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarDTO {

    @Id
    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String modelName;
    private double price;
}
