package ie.atu.week7cicd;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "addresses")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String county;

    @NotBlank
    private String eircode;

    public Address(String county, String eircode) {
        this.county = county;
        this.eircode = eircode;
    }
}
