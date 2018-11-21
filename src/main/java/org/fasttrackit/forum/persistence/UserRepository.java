package org.fasttrackit.forum.persistence;

import org.fasttrackit.forum.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ttritean
 * @since 11/20/2018
 */
public interface UserRepository extends
        PagingAndSortingRepository<User, Long> {
}
