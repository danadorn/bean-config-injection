package co.istad.webdev.annotaionbean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
public class Coffee {
    private String code;
    private String name;
    private Double price;
    private Boolean isAvailable;

}
