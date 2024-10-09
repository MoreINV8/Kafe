/**
 * @author 6510450305 Chaiyapat
 */

package ku.cs.cafe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String password;
    private String name;
    private String role;
}
