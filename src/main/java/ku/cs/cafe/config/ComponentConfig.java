/**
 * @author 6510450305 Chaiyapat
 */

package ku.cs.cafe.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    // able spring do autowired
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
