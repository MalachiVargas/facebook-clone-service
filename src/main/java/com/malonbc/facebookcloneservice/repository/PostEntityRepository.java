package com.malonbc.facebookcloneservice.repository;

import com.malonbc.facebookcloneservice.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String> {

}
