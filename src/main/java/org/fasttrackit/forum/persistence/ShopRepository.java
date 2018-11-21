package org.fasttrackit.forum.persistence;

import org.fasttrackit.forum.domain.Shop;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShopRepository
        extends
        PagingAndSortingRepository<Shop, Long> {



}
