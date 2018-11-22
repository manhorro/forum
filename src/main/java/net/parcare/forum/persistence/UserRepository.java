package main.java.net.parcare.forum.persistence;

import net.parcare.forum.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface UserRepository extends
        PagingAndSortingRepository<User, Long> {
}
