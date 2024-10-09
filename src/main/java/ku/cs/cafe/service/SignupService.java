/**
 * @author 6510450305 Chaiyapat
 */

package ku.cs.cafe.service;

import ku.cs.cafe.entity.Member;
import ku.cs.cafe.repository.MemberRepository;
import ku.cs.cafe.request.SignupRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Autowired
    private MemberRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ModelMapper modelMapper;

    public boolean isUsernameAvailable(String username) {
        return repository.findByUsername(username) == null;
    }

    public void createUser(SignupRequest request) {
        Member record = modelMapper.map(request, Member.class);

        record.setRole("ROLE_USER");

        String hashedPassword = passwordEncoder.encode(request.getPassword());
        record.setPassword(hashedPassword);

        repository.save(record);
    }

    public Member getUser(String username) {
        return repository.findByUsername(username);
    }
}
