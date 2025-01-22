package com.Gustavomp2p.forumhub.repository;

import com.Gustavomp2p.forumhub.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {
}
