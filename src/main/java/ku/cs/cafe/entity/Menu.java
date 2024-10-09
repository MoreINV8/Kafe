/**
 * @author 6510450305 Chaiyapat
 */

package ku.cs.cafe.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.util.UUID;


@Data
@Entity
public class Menu {


    @Id
    @GeneratedValue
    private UUID id;


    private String name;
    private double price;

    @ManyToOne
    private Category category;
}

