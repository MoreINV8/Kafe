package ku.cs.cafe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Embeddable                         // "MORE_DETAIL:https://www.baeldung.com/jpa-embedded-embeddable"
@AllArgsConstructor                 // create constructor with all arguments
@NoArgsConstructor                  // create constructor with no arguments
@EqualsAndHashCode                  // generate equals() method and hashCode() method "MORE_DETAIL: https://www.baeldung.com/java-lombok-equalsandhashcode"
public class OrderItemKey implements Serializable {     // serializable => tell that this class can be saved to database

    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "menu_id")
    private UUID menuId;
}
