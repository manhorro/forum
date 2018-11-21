package main.java.net.parcare.forum.persistence;

import main.java.net.parcare.forum.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author ttritean
 * @since 11/20/2018
 */
public interface UserRepository extends
        PagingAndSortingRepository<User, Long> {
}
